/*
 * Copyright 2020 Huawei Technologies Co.,Ltd.
 *
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package com.huaweicloud.sdk.core.auth;

import java.io.UnsupportedEncodingException;
import java.net.URL;
import java.net.URLEncoder;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.SimpleTimeZone;
import java.util.SortedMap;
import java.util.TreeMap;
import java.util.stream.Collectors;

import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

import com.huaweicloud.sdk.core.exception.SdkException;
import com.huaweicloud.sdk.core.http.HttpRequest;
import com.huaweicloud.sdk.core.utils.BinaryUtils;

/**
 * signature certification with AK/SK
 */
public class AKSKSigner {
    public static class Constants {
        public static final String LINE_SEPARATOR = "\n";

        public static final String SDK_NAME = "SDK";

        public static final String SDK_TERMINATOR = "sdk_request";

        public static final String SDK_SIGNING_ALGORITHM = "SDK-HMAC-SHA256";

        public static final String X_SDK_DATE = "X-Sdk-Date";

        public static final String X_SDK_CONTENT_SHA256 = "X-Sdk-Content-Sha256";

        public static final String AUTHORIZATION = "Authorization";

        public static final String HOST = "Host";

        public static final String CONTENT_TYPE = "Content-Type";

        public static final String CONTENT_LENGTH = "Content-Length";

        public static final String UNSIGNED_PAYLOAD = "UNSIGNED-PAYLOAD";
    }

    // /** SHA256 hash of an empty request body **/
    public static final String EMPTY_BODY_SHA256 = "e3b0c44298fc1c149afbf4c8996fb92427ae41e4649b934ca495991b7852b855";

    /**
     * format strings for the date/time and date stamps required during signing
     **/
    public static final String ISO_8601_BASIC_FORMAT = "yyyyMMdd'T'HHmmss'Z'";

    protected static final SimpleDateFormat ISO_DATE_FORMAT = new SimpleDateFormat(ISO_8601_BASIC_FORMAT);

    public static Map<String, String> sign(HttpRequest request, AbstractCredentials credential) {
        // ************* TASK 1: CONSTRUCT CANONICAL REQUEST *************
        // Date now = ISODateFormat.parse("20191115T033655Z"); // 设置基准时间
        Date now = new Date(); // 设置基准时间
        HashMap<String, String> authenticationHeaders = new HashMap<>();

        // Step 1: add basic headers required by V4
        URL url = request.getUrl();

        // Step 1.1: Add Host header
        String canonicalHost = url.getAuthority();
        authenticationHeaders.put(Constants.HOST, canonicalHost);

        // Step 1.2: Add X-Sdk-Date
        String dateTimeStamp = null;
        if (!request.haveHeader(Constants.X_SDK_DATE)) {
            ISO_DATE_FORMAT.setTimeZone(new SimpleTimeZone(0, "UTC"));
            dateTimeStamp = ISO_DATE_FORMAT.format(now);
            authenticationHeaders.put(Constants.X_SDK_DATE, dateTimeStamp);
        } else {
            dateTimeStamp = request.getHeader(Constants.X_SDK_DATE).toString();
        }

        // Step 1.3 combine all headers
        Map<String, String> allHeaders = new TreeMap<String, String>();
        allHeaders.putAll(request.getHeaders().entrySet().stream().collect(
            Collectors.toMap(entry -> entry.getKey().toLowerCase(Locale.ROOT), entry -> entry.getValue().get(0))));
        allHeaders.putAll(authenticationHeaders.entrySet().stream().collect(
            Collectors.toMap(entry -> entry.getKey().toLowerCase(Locale.ROOT), Map.Entry::getValue)));

        // Step 2: Create Canonical URI -- the part of the URI from domain to query
        String pathOld = url.getPath();
        String canonicalURI = "";
        String[] split = pathOld.split("/");
        for (String urlSplit : split) {
            canonicalURI += urlEncode(urlSplit) + "/";
        }

        // Step 3: Create the canonical query string. In this example (a GET request),
        // request parameters are in the query string. Query string values must
        // be URL-encoded (space=%20). The parameters must be sorted by name.
        // For this example, the query string is pre-formatted in the request_parameters variable.
        String query = url.getQuery();
        Map<String, List<String>> parameters = request.getQueryParams();
        String canonicalQueryString = buildCanonicalQueryString(query, parameters);

        // Step 4: Create the list of signed headers. This lists the headers
        // in the canonical_headers list, delimited with ";" and in alpha order.
        // Note: The request can include any headers; canonical_headers and
        // signed_headers lists those that you want to be included in the
        // hash of the request. "Host" and "x-sdk-date" are always required.
        // In V4 signer, we only use required header - host & x-sdk-date.
        String signedHeaderNames = String.join(";", allHeaders.keySet());

        // Step 5: Create the canonical headers and signed headers. Header names
        // and value must be trimmed and lower-case, and sorted in ASCII order.
        // Note that there is a trailing \n.
        String canonicalHeaders = buildCanonicalHeaders(allHeaders);

        // Step 6: Create payload hash (hash of the request body content). For GET
        // requests, the payload is an empty string ("").
        String payloadHash = buildPayloadHash(request);

        // Step 7: Combine elements to create canonical request
        String canonicalRequest = buildCanonicalRequest(request.getMethod().name(), canonicalURI, canonicalQueryString,
            canonicalHeaders, signedHeaderNames, payloadHash);
        String canonicalRequestHash = BinaryUtils.toHex(sha256(canonicalRequest));
        // ************* TASK 2: CREATE THE STRING TO SIGN*************
        // Match the algorithm to the hashing algorithm you use, either SHA-1 or SHA-256 (recommended)
        String stringToSign = getStringToSign(Constants.SDK_SIGNING_ALGORITHM, dateTimeStamp, canonicalRequestHash);

        // ************* TASK 3: CALCULATE THE SIGNATURE *************
        // Create the signing key using the function defined above.
        String signatureString = signature(stringToSign, credential.getSk());

        // ************* TASK 4: ADD SIGNING INFORMATION TO THE REQUEST *************
        // The signing information can be either in a query string value or in
        // a header named Authorization. This code shows how to use a header.
        // Create authorization header and add to request headers
        StringBuilder authorization = new StringBuilder(Constants.SDK_SIGNING_ALGORITHM).append(" ");
        authorization.append("Access=").append(credential.getAk()).append(", ");
        authorization.append("SignedHeaders=").append(signedHeaderNames).append(", ");
        authorization.append("Signature=").append(signatureString);
        authenticationHeaders.put(Constants.AUTHORIZATION, authorization.toString());

        return authenticationHeaders;
    }

    private static String buildCanonicalQueryString(String query, Map<String, List<String>> parameters) {
        SortedMap<String, List<String>> sorted = new TreeMap<>();

        // get parameters from path query string
        if (query != null && !query.isEmpty()) {
            String[] splitArr = query.split("&");
            for (String split : splitArr) {
                String[] kv = split.split("=");
                if (kv.length == 2) {
                    if (!sorted.containsKey(urlEncode(kv[0]))) {
                        List<String> values = new ArrayList<>();
                        values.add(urlEncode(kv[1]));
                        sorted.put(urlEncode(kv[0]), values);
                    } else {
                        sorted.get(urlEncode(kv[0])).add(urlEncode(kv[1]));
                    }
                }
            }
        }

        if (parameters != null && !parameters.isEmpty()) {
            Iterator<Map.Entry<String, List<String>>> iterator = parameters.entrySet().iterator();
            while (iterator.hasNext()) {
                Map.Entry<String, List<String>> pair = iterator.next();
                String key = pair.getKey();
                List<String> values = pair.getValue();
                List<String> escapedValues = new ArrayList<>();
                for (String value : values) {
                    String temp = value;
                    if ("tags".equals(key) || "metadata".equals(key)) {
                        if (temp.contains("%7B") || temp.contains("%7D") || temp.contains("%7b")
                            || temp.contains("%7d")) {
                            temp = temp.replace("%7B", "{").replace("%7b", "{").replace("%7D", "}")
                                .replace("%7d", "}");
                        }
                    }
                    escapedValues.add(urlEncode(temp));
                }
                sorted.put(urlEncode(key), escapedValues);
            }
        }

        StringBuilder builder = new StringBuilder();
        Iterator<Map.Entry<String, List<String>>> itr = sorted.entrySet().iterator();
        while (itr.hasNext()) {
            Map.Entry<String, List<String>> pair = itr.next();
            for (int i = 0; i < pair.getValue().size(); i++) {
                builder.append(pair.getKey());
                builder.append("=");
                builder.append(pair.getValue().get(i));
                if (i < pair.getValue().size() - 1) {
                    builder.append("&");
                }
            }
            if (itr.hasNext()) {
                builder.append("&");
            }
        }

        return builder.toString();
    }

    /**
     * Create the canonical headers and signed headers. Header names
     * and value must be trimmed and lowercase, and sorted in ASCII order.
     * Note that there is a trailing \n.
     *
     * @param heads
     * @return
     */
    private static String buildCanonicalHeaders(Map<String, String> heads) {
        StringBuilder sb = new StringBuilder();
        heads.forEach((key, value) -> {
            sb.append(key).append(":").append(value);
            sb.append(Constants.LINE_SEPARATOR);
        });
        return sb.toString();
    }

    /**
     * @param request
     * @return
     */
    private static String buildPayloadHash(HttpRequest request) {
        if (request.haveHeader(Constants.X_SDK_CONTENT_SHA256)) {
            return request.getHeader(Constants.X_SDK_CONTENT_SHA256);
        }
        if (Objects.nonNull(request.getBodyAsString()) && !request.getBodyAsString().isEmpty()) {
            return BinaryUtils.toHex(sha256(request.getBodyAsString()));
        }

        return EMPTY_BODY_SHA256;
    }

    /**
     * @param segments
     * @return
     * @param1 method
     * @param2 canonicalURI
     * @param3 canonicalQueryString
     * @param4 canonicalHeaders
     * @param5 signedHeaderNames
     * @param6 payloadHash
     */
    private static String buildCanonicalRequest(String... segments) {
        return String.join(Constants.LINE_SEPARATOR, segments);
    }

    /**
     * @param segments
     * @return
     * @param1 sdkSigningAlgorithm
     * @param2 dateTimeStamp
     * @param3 credentialScope
     * @param4 canonicalRequestHash
     */
    private static String getStringToSign(String... segments) {
        return String.join(Constants.LINE_SEPARATOR, segments);
    }

    /**
     * @param stringToSign
     * @param secretKey
     * @return
     * @throws UnsupportedEncodingException
     */
    private static String signature(String stringToSign, String secretKey) {
        try {
            byte[] keySecret = secretKey.getBytes("UTF-8");
            byte[] signature = hmac(keySecret, stringToSign);
            return BinaryUtils.toHex(signature);
        } catch (UnsupportedEncodingException e) {
            // should not happen
            throw new SdkException(e);
        }
    }

    public static String urlEncode(String url) {
        try {
            return URLEncoder.encode(url, "UTF-8").replace("+", "%20").replace("*", "%2A");
        } catch (UnsupportedEncodingException e) {
            throw new SdkException("UTF-8 encoding is not supported.", e);
        }
    }

    /**
     * Hashes the string contents (assumed to be UTF-8) using the SHA-256
     * algorithm.
     */
    public static byte[] sha256(String text) {
        try {
            MessageDigest md = MessageDigest.getInstance("SHA-256");
            md.update(text.getBytes("UTF-8"));
            byte[] bytes = md.digest();
            return bytes;
        } catch (NoSuchAlgorithmException | UnsupportedEncodingException e) {
            throw new SdkException("Unable to compute hash while signing request", e);
        }
    }

    protected static byte[] hmac(byte[] key, String data) {
        try {
            Mac hmac = Mac.getInstance("HmacSHA256");
            SecretKeySpec secretKeySpec = new SecretKeySpec(key, "HmacSHA256");
            hmac.init(secretKeySpec);
            return hmac.doFinal(data.getBytes("UTF-8"));
        } catch (NoSuchAlgorithmException | UnsupportedEncodingException | InvalidKeyException e) {
            throw new SdkException("Unable to calculate a request signature: " + e.getMessage(), e);
        }
    }
}
