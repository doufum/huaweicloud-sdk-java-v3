package com.huaweicloud.sdk.cpts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/** content */
public class UpdateCaseRequestBodyContent {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "url")

    private String url;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "http_version")

    private String httpVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "method")

    private String method;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "connect_timeout")

    private Integer connectTimeout;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "return_timeout")

    private Integer returnTimeout;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "return_timeout_param")

    private String returnTimeoutParam;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "connect_type")

    private Integer connectType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "check_end_type")

    private String checkEndType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "check_end_length")

    private String checkEndLength;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "check_end_str")

    private String checkEndStr;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "protocol_type")

    private Integer protocolType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "headers")

    private List<UpdateCaseRequestBodyContentHeaders> headers = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bodys")

    private List<String> bodys = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body_type")

    private Integer bodyType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private String body;

    public UpdateCaseRequestBodyContent withUrl(String url) {
        this.url = url;
        return this;
    }

    /** url
     * 
     * @return url */
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public UpdateCaseRequestBodyContent withHttpVersion(String httpVersion) {
        this.httpVersion = httpVersion;
        return this;
    }

    /** http_version
     * 
     * @return httpVersion */
    public String getHttpVersion() {
        return httpVersion;
    }

    public void setHttpVersion(String httpVersion) {
        this.httpVersion = httpVersion;
    }

    public UpdateCaseRequestBodyContent withMethod(String method) {
        this.method = method;
        return this;
    }

    /** method
     * 
     * @return method */
    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public UpdateCaseRequestBodyContent withConnectTimeout(Integer connectTimeout) {
        this.connectTimeout = connectTimeout;
        return this;
    }

    /** connect_timeout minimum: 0 maximum: 2147483647
     * 
     * @return connectTimeout */
    public Integer getConnectTimeout() {
        return connectTimeout;
    }

    public void setConnectTimeout(Integer connectTimeout) {
        this.connectTimeout = connectTimeout;
    }

    public UpdateCaseRequestBodyContent withReturnTimeout(Integer returnTimeout) {
        this.returnTimeout = returnTimeout;
        return this;
    }

    /** return_timeout minimum: 0 maximum: 2147483647
     * 
     * @return returnTimeout */
    public Integer getReturnTimeout() {
        return returnTimeout;
    }

    public void setReturnTimeout(Integer returnTimeout) {
        this.returnTimeout = returnTimeout;
    }

    public UpdateCaseRequestBodyContent withReturnTimeoutParam(String returnTimeoutParam) {
        this.returnTimeoutParam = returnTimeoutParam;
        return this;
    }

    /** return_timeout_param
     * 
     * @return returnTimeoutParam */
    public String getReturnTimeoutParam() {
        return returnTimeoutParam;
    }

    public void setReturnTimeoutParam(String returnTimeoutParam) {
        this.returnTimeoutParam = returnTimeoutParam;
    }

    public UpdateCaseRequestBodyContent withConnectType(Integer connectType) {
        this.connectType = connectType;
        return this;
    }

    /** connect_type minimum: 0 maximum: 2147483647
     * 
     * @return connectType */
    public Integer getConnectType() {
        return connectType;
    }

    public void setConnectType(Integer connectType) {
        this.connectType = connectType;
    }

    public UpdateCaseRequestBodyContent withCheckEndType(String checkEndType) {
        this.checkEndType = checkEndType;
        return this;
    }

    /** check_end_type
     * 
     * @return checkEndType */
    public String getCheckEndType() {
        return checkEndType;
    }

    public void setCheckEndType(String checkEndType) {
        this.checkEndType = checkEndType;
    }

    public UpdateCaseRequestBodyContent withCheckEndLength(String checkEndLength) {
        this.checkEndLength = checkEndLength;
        return this;
    }

    /** check_end_length
     * 
     * @return checkEndLength */
    public String getCheckEndLength() {
        return checkEndLength;
    }

    public void setCheckEndLength(String checkEndLength) {
        this.checkEndLength = checkEndLength;
    }

    public UpdateCaseRequestBodyContent withCheckEndStr(String checkEndStr) {
        this.checkEndStr = checkEndStr;
        return this;
    }

    /** check_end_str
     * 
     * @return checkEndStr */
    public String getCheckEndStr() {
        return checkEndStr;
    }

    public void setCheckEndStr(String checkEndStr) {
        this.checkEndStr = checkEndStr;
    }

    public UpdateCaseRequestBodyContent withName(String name) {
        this.name = name;
        return this;
    }

    /** name
     * 
     * @return name */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public UpdateCaseRequestBodyContent withProtocolType(Integer protocolType) {
        this.protocolType = protocolType;
        return this;
    }

    /** protocol_type minimum: 0 maximum: 2147483647
     * 
     * @return protocolType */
    public Integer getProtocolType() {
        return protocolType;
    }

    public void setProtocolType(Integer protocolType) {
        this.protocolType = protocolType;
    }

    public UpdateCaseRequestBodyContent withHeaders(List<UpdateCaseRequestBodyContentHeaders> headers) {
        this.headers = headers;
        return this;
    }

    public UpdateCaseRequestBodyContent addHeadersItem(UpdateCaseRequestBodyContentHeaders headersItem) {
        if (this.headers == null) {
            this.headers = new ArrayList<>();
        }
        this.headers.add(headersItem);
        return this;
    }

    public UpdateCaseRequestBodyContent withHeaders(Consumer<List<UpdateCaseRequestBodyContentHeaders>> headersSetter) {
        if (this.headers == null) {
            this.headers = new ArrayList<>();
        }
        headersSetter.accept(this.headers);
        return this;
    }

    /** headers
     * 
     * @return headers */
    public List<UpdateCaseRequestBodyContentHeaders> getHeaders() {
        return headers;
    }

    public void setHeaders(List<UpdateCaseRequestBodyContentHeaders> headers) {
        this.headers = headers;
    }

    public UpdateCaseRequestBodyContent withBodys(List<String> bodys) {
        this.bodys = bodys;
        return this;
    }

    public UpdateCaseRequestBodyContent addBodysItem(String bodysItem) {
        if (this.bodys == null) {
            this.bodys = new ArrayList<>();
        }
        this.bodys.add(bodysItem);
        return this;
    }

    public UpdateCaseRequestBodyContent withBodys(Consumer<List<String>> bodysSetter) {
        if (this.bodys == null) {
            this.bodys = new ArrayList<>();
        }
        bodysSetter.accept(this.bodys);
        return this;
    }

    /** bodys
     * 
     * @return bodys */
    public List<String> getBodys() {
        return bodys;
    }

    public void setBodys(List<String> bodys) {
        this.bodys = bodys;
    }

    public UpdateCaseRequestBodyContent withBodyType(Integer bodyType) {
        this.bodyType = bodyType;
        return this;
    }

    /** body_type minimum: 0 maximum: 2147483647
     * 
     * @return bodyType */
    public Integer getBodyType() {
        return bodyType;
    }

    public void setBodyType(Integer bodyType) {
        this.bodyType = bodyType;
    }

    public UpdateCaseRequestBodyContent withBody(String body) {
        this.body = body;
        return this;
    }

    /** body
     * 
     * @return body */
    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UpdateCaseRequestBodyContent updateCaseRequestBodyContent = (UpdateCaseRequestBodyContent) o;
        return Objects.equals(this.url, updateCaseRequestBodyContent.url)
            && Objects.equals(this.httpVersion, updateCaseRequestBodyContent.httpVersion)
            && Objects.equals(this.method, updateCaseRequestBodyContent.method)
            && Objects.equals(this.connectTimeout, updateCaseRequestBodyContent.connectTimeout)
            && Objects.equals(this.returnTimeout, updateCaseRequestBodyContent.returnTimeout)
            && Objects.equals(this.returnTimeoutParam, updateCaseRequestBodyContent.returnTimeoutParam)
            && Objects.equals(this.connectType, updateCaseRequestBodyContent.connectType)
            && Objects.equals(this.checkEndType, updateCaseRequestBodyContent.checkEndType)
            && Objects.equals(this.checkEndLength, updateCaseRequestBodyContent.checkEndLength)
            && Objects.equals(this.checkEndStr, updateCaseRequestBodyContent.checkEndStr)
            && Objects.equals(this.name, updateCaseRequestBodyContent.name)
            && Objects.equals(this.protocolType, updateCaseRequestBodyContent.protocolType)
            && Objects.equals(this.headers, updateCaseRequestBodyContent.headers)
            && Objects.equals(this.bodys, updateCaseRequestBodyContent.bodys)
            && Objects.equals(this.bodyType, updateCaseRequestBodyContent.bodyType)
            && Objects.equals(this.body, updateCaseRequestBodyContent.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(url,
            httpVersion,
            method,
            connectTimeout,
            returnTimeout,
            returnTimeoutParam,
            connectType,
            checkEndType,
            checkEndLength,
            checkEndStr,
            name,
            protocolType,
            headers,
            bodys,
            bodyType,
            body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateCaseRequestBodyContent {\n");
        sb.append("    url: ").append(toIndentedString(url)).append("\n");
        sb.append("    httpVersion: ").append(toIndentedString(httpVersion)).append("\n");
        sb.append("    method: ").append(toIndentedString(method)).append("\n");
        sb.append("    connectTimeout: ").append(toIndentedString(connectTimeout)).append("\n");
        sb.append("    returnTimeout: ").append(toIndentedString(returnTimeout)).append("\n");
        sb.append("    returnTimeoutParam: ").append(toIndentedString(returnTimeoutParam)).append("\n");
        sb.append("    connectType: ").append(toIndentedString(connectType)).append("\n");
        sb.append("    checkEndType: ").append(toIndentedString(checkEndType)).append("\n");
        sb.append("    checkEndLength: ").append(toIndentedString(checkEndLength)).append("\n");
        sb.append("    checkEndStr: ").append(toIndentedString(checkEndStr)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    protocolType: ").append(toIndentedString(protocolType)).append("\n");
        sb.append("    headers: ").append(toIndentedString(headers)).append("\n");
        sb.append("    bodys: ").append(toIndentedString(bodys)).append("\n");
        sb.append("    bodyType: ").append(toIndentedString(bodyType)).append("\n");
        sb.append("    body: ").append(toIndentedString(body)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
