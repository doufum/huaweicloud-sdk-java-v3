package com.huaweicloud.sdk.ocr.v1;

import com.huaweicloud.sdk.core.TypeCasts;
import com.huaweicloud.sdk.core.http.FieldExistence;
import com.huaweicloud.sdk.core.http.HttpMethod;
import com.huaweicloud.sdk.core.http.HttpRequestDef;
import com.huaweicloud.sdk.core.http.LocationType;
import com.huaweicloud.sdk.ocr.v1.model.*;

@SuppressWarnings("unchecked")
public class OcrMeta {

    public static final HttpRequestDef<RecognizeAutoClassificationRequest, RecognizeAutoClassificationResponse> recognizeAutoClassification =
        genForrecognizeAutoClassification();

    private static HttpRequestDef<RecognizeAutoClassificationRequest, RecognizeAutoClassificationResponse> genForrecognizeAutoClassification() {
        // basic
        HttpRequestDef.Builder<RecognizeAutoClassificationRequest, RecognizeAutoClassificationResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    RecognizeAutoClassificationRequest.class,
                    RecognizeAutoClassificationResponse.class)
                .withName("RecognizeAutoClassification")
                .withUri("/v2/{project_id}/ocr/auto-classification")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<AutoClassificationRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(AutoClassificationRequestBody.class),
            f -> f.withMarshaller(RecognizeAutoClassificationRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RecognizeBankcardRequest, RecognizeBankcardResponse> recognizeBankcard =
        genForrecognizeBankcard();

    private static HttpRequestDef<RecognizeBankcardRequest, RecognizeBankcardResponse> genForrecognizeBankcard() {
        // basic
        HttpRequestDef.Builder<RecognizeBankcardRequest, RecognizeBankcardResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, RecognizeBankcardRequest.class, RecognizeBankcardResponse.class)
                .withName("RecognizeBankcard")
                .withUri("/v2/{project_id}/ocr/bankcard")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<BankcardRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BankcardRequestBody.class),
            f -> f.withMarshaller(RecognizeBankcardRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RecognizeBusinessCardRequest, RecognizeBusinessCardResponse> recognizeBusinessCard =
        genForrecognizeBusinessCard();

    private static HttpRequestDef<RecognizeBusinessCardRequest, RecognizeBusinessCardResponse> genForrecognizeBusinessCard() {
        // basic
        HttpRequestDef.Builder<RecognizeBusinessCardRequest, RecognizeBusinessCardResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, RecognizeBusinessCardRequest.class, RecognizeBusinessCardResponse.class)
            .withName("RecognizeBusinessCard")
            .withUri("/v2/{project_id}/ocr/business-card")
            .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<BusinessCardRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BusinessCardRequestBody.class),
            f -> f.withMarshaller(RecognizeBusinessCardRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RecognizeBusinessLicenseRequest, RecognizeBusinessLicenseResponse> recognizeBusinessLicense =
        genForrecognizeBusinessLicense();

    private static HttpRequestDef<RecognizeBusinessLicenseRequest, RecognizeBusinessLicenseResponse> genForrecognizeBusinessLicense() {
        // basic
        HttpRequestDef.Builder<RecognizeBusinessLicenseRequest, RecognizeBusinessLicenseResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST, RecognizeBusinessLicenseRequest.class, RecognizeBusinessLicenseResponse.class)
                .withName("RecognizeBusinessLicense")
                .withUri("/v2/{project_id}/ocr/business-license")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<BusinessLicenseRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BusinessLicenseRequestBody.class),
            f -> f.withMarshaller(RecognizeBusinessLicenseRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RecognizeChileIdCardRequest, RecognizeChileIdCardResponse> recognizeChileIdCard =
        genForrecognizeChileIdCard();

    private static HttpRequestDef<RecognizeChileIdCardRequest, RecognizeChileIdCardResponse> genForrecognizeChileIdCard() {
        // basic
        HttpRequestDef.Builder<RecognizeChileIdCardRequest, RecognizeChileIdCardResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, RecognizeChileIdCardRequest.class, RecognizeChileIdCardResponse.class)
            .withName("RecognizeChileIdCard")
            .withUri("/v2/{project_id}/ocr/chile-id-card")
            .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<ChileIdCardRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ChileIdCardRequestBody.class),
            f -> f.withMarshaller(RecognizeChileIdCardRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RecognizeDriverLicenseRequest, RecognizeDriverLicenseResponse> recognizeDriverLicense =
        genForrecognizeDriverLicense();

    private static HttpRequestDef<RecognizeDriverLicenseRequest, RecognizeDriverLicenseResponse> genForrecognizeDriverLicense() {
        // basic
        HttpRequestDef.Builder<RecognizeDriverLicenseRequest, RecognizeDriverLicenseResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, RecognizeDriverLicenseRequest.class, RecognizeDriverLicenseResponse.class)
            .withName("RecognizeDriverLicense")
            .withUri("/v2/{project_id}/ocr/driver-license")
            .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<DriverLicenseRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(DriverLicenseRequestBody.class),
            f -> f.withMarshaller(RecognizeDriverLicenseRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RecognizeFinancialStatementRequest, RecognizeFinancialStatementResponse> recognizeFinancialStatement =
        genForrecognizeFinancialStatement();

    private static HttpRequestDef<RecognizeFinancialStatementRequest, RecognizeFinancialStatementResponse> genForrecognizeFinancialStatement() {
        // basic
        HttpRequestDef.Builder<RecognizeFinancialStatementRequest, RecognizeFinancialStatementResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    RecognizeFinancialStatementRequest.class,
                    RecognizeFinancialStatementResponse.class)
                .withName("RecognizeFinancialStatement")
                .withUri("/v2/{project_id}/ocr/financial-statement")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<FinancialStatementRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(FinancialStatementRequestBody.class),
            f -> f.withMarshaller(RecognizeFinancialStatementRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RecognizeFlightItineraryRequest, RecognizeFlightItineraryResponse> recognizeFlightItinerary =
        genForrecognizeFlightItinerary();

    private static HttpRequestDef<RecognizeFlightItineraryRequest, RecognizeFlightItineraryResponse> genForrecognizeFlightItinerary() {
        // basic
        HttpRequestDef.Builder<RecognizeFlightItineraryRequest, RecognizeFlightItineraryResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST, RecognizeFlightItineraryRequest.class, RecognizeFlightItineraryResponse.class)
                .withName("RecognizeFlightItinerary")
                .withUri("/v2/{project_id}/ocr/flight-itinerary")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<FlightItineraryRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(FlightItineraryRequestBody.class),
            f -> f.withMarshaller(RecognizeFlightItineraryRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RecognizeGeneralTableRequest, RecognizeGeneralTableResponse> recognizeGeneralTable =
        genForrecognizeGeneralTable();

    private static HttpRequestDef<RecognizeGeneralTableRequest, RecognizeGeneralTableResponse> genForrecognizeGeneralTable() {
        // basic
        HttpRequestDef.Builder<RecognizeGeneralTableRequest, RecognizeGeneralTableResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, RecognizeGeneralTableRequest.class, RecognizeGeneralTableResponse.class)
            .withName("RecognizeGeneralTable")
            .withUri("/v2/{project_id}/ocr/general-table")
            .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<GeneralTableRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(GeneralTableRequestBody.class),
            f -> f.withMarshaller(RecognizeGeneralTableRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RecognizeGeneralTextRequest, RecognizeGeneralTextResponse> recognizeGeneralText =
        genForrecognizeGeneralText();

    private static HttpRequestDef<RecognizeGeneralTextRequest, RecognizeGeneralTextResponse> genForrecognizeGeneralText() {
        // basic
        HttpRequestDef.Builder<RecognizeGeneralTextRequest, RecognizeGeneralTextResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, RecognizeGeneralTextRequest.class, RecognizeGeneralTextResponse.class)
            .withName("RecognizeGeneralText")
            .withUri("/v2/{project_id}/ocr/general-text")
            .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<GeneralTextRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(GeneralTextRequestBody.class),
            f -> f.withMarshaller(RecognizeGeneralTextRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RecognizeHandwritingRequest, RecognizeHandwritingResponse> recognizeHandwriting =
        genForrecognizeHandwriting();

    private static HttpRequestDef<RecognizeHandwritingRequest, RecognizeHandwritingResponse> genForrecognizeHandwriting() {
        // basic
        HttpRequestDef.Builder<RecognizeHandwritingRequest, RecognizeHandwritingResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, RecognizeHandwritingRequest.class, RecognizeHandwritingResponse.class)
            .withName("RecognizeHandwriting")
            .withUri("/v2/{project_id}/ocr/handwriting")
            .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<HandwritingRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(HandwritingRequestBody.class),
            f -> f.withMarshaller(RecognizeHandwritingRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RecognizeHealthCodeRequest, RecognizeHealthCodeResponse> recognizeHealthCode =
        genForrecognizeHealthCode();

    private static HttpRequestDef<RecognizeHealthCodeRequest, RecognizeHealthCodeResponse> genForrecognizeHealthCode() {
        // basic
        HttpRequestDef.Builder<RecognizeHealthCodeRequest, RecognizeHealthCodeResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, RecognizeHealthCodeRequest.class, RecognizeHealthCodeResponse.class)
                .withName("RecognizeHealthCode")
                .withUri("/v2/{project_id}/ocr/health-code")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<HealthCodeRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(HealthCodeRequestBody.class),
            f -> f.withMarshaller(RecognizeHealthCodeRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RecognizeIdCardRequest, RecognizeIdCardResponse> recognizeIdCard =
        genForrecognizeIdCard();

    private static HttpRequestDef<RecognizeIdCardRequest, RecognizeIdCardResponse> genForrecognizeIdCard() {
        // basic
        HttpRequestDef.Builder<RecognizeIdCardRequest, RecognizeIdCardResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, RecognizeIdCardRequest.class, RecognizeIdCardResponse.class)
                .withName("RecognizeIdCard")
                .withUri("/v2/{project_id}/ocr/id-card")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<IdCardRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(IdCardRequestBody.class),
            f -> f.withMarshaller(RecognizeIdCardRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RecognizeInsurancePolicyRequest, RecognizeInsurancePolicyResponse> recognizeInsurancePolicy =
        genForrecognizeInsurancePolicy();

    private static HttpRequestDef<RecognizeInsurancePolicyRequest, RecognizeInsurancePolicyResponse> genForrecognizeInsurancePolicy() {
        // basic
        HttpRequestDef.Builder<RecognizeInsurancePolicyRequest, RecognizeInsurancePolicyResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST, RecognizeInsurancePolicyRequest.class, RecognizeInsurancePolicyResponse.class)
                .withName("RecognizeInsurancePolicy")
                .withUri("/v2/{project_id}/ocr/insurance-policy")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<InsurancePolicyRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(InsurancePolicyRequestBody.class),
            f -> f.withMarshaller(RecognizeInsurancePolicyRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RecognizeInvoiceVerificationRequest, RecognizeInvoiceVerificationResponse> recognizeInvoiceVerification =
        genForrecognizeInvoiceVerification();

    private static HttpRequestDef<RecognizeInvoiceVerificationRequest, RecognizeInvoiceVerificationResponse> genForrecognizeInvoiceVerification() {
        // basic
        HttpRequestDef.Builder<RecognizeInvoiceVerificationRequest, RecognizeInvoiceVerificationResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    RecognizeInvoiceVerificationRequest.class,
                    RecognizeInvoiceVerificationResponse.class)
                .withName("RecognizeInvoiceVerification")
                .withUri("/v2/{project_id}/ocr/invoice-verification")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<InvoiceVerificationRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(InvoiceVerificationRequestBody.class),
            f -> f.withMarshaller(RecognizeInvoiceVerificationRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RecognizeLicensePlateRequest, RecognizeLicensePlateResponse> recognizeLicensePlate =
        genForrecognizeLicensePlate();

    private static HttpRequestDef<RecognizeLicensePlateRequest, RecognizeLicensePlateResponse> genForrecognizeLicensePlate() {
        // basic
        HttpRequestDef.Builder<RecognizeLicensePlateRequest, RecognizeLicensePlateResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, RecognizeLicensePlateRequest.class, RecognizeLicensePlateResponse.class)
            .withName("RecognizeLicensePlate")
            .withUri("/v2/{project_id}/ocr/license-plate")
            .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<LicensePlateRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(LicensePlateRequestBody.class),
            f -> f.withMarshaller(RecognizeLicensePlateRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RecognizeMvsInvoiceRequest, RecognizeMvsInvoiceResponse> recognizeMvsInvoice =
        genForrecognizeMvsInvoice();

    private static HttpRequestDef<RecognizeMvsInvoiceRequest, RecognizeMvsInvoiceResponse> genForrecognizeMvsInvoice() {
        // basic
        HttpRequestDef.Builder<RecognizeMvsInvoiceRequest, RecognizeMvsInvoiceResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, RecognizeMvsInvoiceRequest.class, RecognizeMvsInvoiceResponse.class)
                .withName("RecognizeMvsInvoice")
                .withUri("/v2/{project_id}/ocr/mvs-invoice")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<MvsInvoiceRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(MvsInvoiceRequestBody.class),
            f -> f.withMarshaller(RecognizeMvsInvoiceRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RecognizeMyanmarDriverLicenseRequest, RecognizeMyanmarDriverLicenseResponse> recognizeMyanmarDriverLicense =
        genForrecognizeMyanmarDriverLicense();

    private static HttpRequestDef<RecognizeMyanmarDriverLicenseRequest, RecognizeMyanmarDriverLicenseResponse> genForrecognizeMyanmarDriverLicense() {
        // basic
        HttpRequestDef.Builder<RecognizeMyanmarDriverLicenseRequest, RecognizeMyanmarDriverLicenseResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    RecognizeMyanmarDriverLicenseRequest.class,
                    RecognizeMyanmarDriverLicenseResponse.class)
                .withName("RecognizeMyanmarDriverLicense")
                .withUri("/v2/{project_id}/ocr/myanmar-driver-license")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<MyanmarDriverLicenseRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(MyanmarDriverLicenseRequestBody.class),
            f -> f.withMarshaller(RecognizeMyanmarDriverLicenseRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RecognizeMyanmarIdcardRequest, RecognizeMyanmarIdcardResponse> recognizeMyanmarIdcard =
        genForrecognizeMyanmarIdcard();

    private static HttpRequestDef<RecognizeMyanmarIdcardRequest, RecognizeMyanmarIdcardResponse> genForrecognizeMyanmarIdcard() {
        // basic
        HttpRequestDef.Builder<RecognizeMyanmarIdcardRequest, RecognizeMyanmarIdcardResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, RecognizeMyanmarIdcardRequest.class, RecognizeMyanmarIdcardResponse.class)
            .withName("RecognizeMyanmarIdcard")
            .withUri("/v2/{project_id}/ocr/myanmar-id-card")
            .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<MyanmarIdcardRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(MyanmarIdcardRequestBody.class),
            f -> f.withMarshaller(RecognizeMyanmarIdcardRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RecognizePassportRequest, RecognizePassportResponse> recognizePassport =
        genForrecognizePassport();

    private static HttpRequestDef<RecognizePassportRequest, RecognizePassportResponse> genForrecognizePassport() {
        // basic
        HttpRequestDef.Builder<RecognizePassportRequest, RecognizePassportResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, RecognizePassportRequest.class, RecognizePassportResponse.class)
                .withName("RecognizePassport")
                .withUri("/v2/{project_id}/ocr/passport")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<PassportRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(PassportRequestBody.class),
            f -> f.withMarshaller(RecognizePassportRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RecognizePcrTestRecordRequest, RecognizePcrTestRecordResponse> recognizePcrTestRecord =
        genForrecognizePcrTestRecord();

    private static HttpRequestDef<RecognizePcrTestRecordRequest, RecognizePcrTestRecordResponse> genForrecognizePcrTestRecord() {
        // basic
        HttpRequestDef.Builder<RecognizePcrTestRecordRequest, RecognizePcrTestRecordResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, RecognizePcrTestRecordRequest.class, RecognizePcrTestRecordResponse.class)
            .withName("RecognizePcrTestRecord")
            .withUri("/v2/{project_id}/ocr/pcr-test-record")
            .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<PcrTestRecordRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(PcrTestRecordRequestBody.class),
            f -> f.withMarshaller(RecognizePcrTestRecordRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RecognizeQualificationCertificateRequest, RecognizeQualificationCertificateResponse> recognizeQualificationCertificate =
        genForrecognizeQualificationCertificate();

    private static HttpRequestDef<RecognizeQualificationCertificateRequest, RecognizeQualificationCertificateResponse> genForrecognizeQualificationCertificate() {
        // basic
        HttpRequestDef.Builder<RecognizeQualificationCertificateRequest, RecognizeQualificationCertificateResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    RecognizeQualificationCertificateRequest.class,
                    RecognizeQualificationCertificateResponse.class)
                .withName("RecognizeQualificationCertificate")
                .withUri("/v2/{project_id}/ocr/transportation-qualification-certificate")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<QualificationCertificateRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(QualificationCertificateRequestBody.class),
            f -> f.withMarshaller(RecognizeQualificationCertificateRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RecognizeQuotaInvoiceRequest, RecognizeQuotaInvoiceResponse> recognizeQuotaInvoice =
        genForrecognizeQuotaInvoice();

    private static HttpRequestDef<RecognizeQuotaInvoiceRequest, RecognizeQuotaInvoiceResponse> genForrecognizeQuotaInvoice() {
        // basic
        HttpRequestDef.Builder<RecognizeQuotaInvoiceRequest, RecognizeQuotaInvoiceResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, RecognizeQuotaInvoiceRequest.class, RecognizeQuotaInvoiceResponse.class)
            .withName("RecognizeQuotaInvoice")
            .withUri("/v2/{project_id}/ocr/quota-invoice")
            .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<QuotaInvoiceRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(QuotaInvoiceRequestBody.class),
            f -> f.withMarshaller(RecognizeQuotaInvoiceRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RecognizeTaxiInvoiceRequest, RecognizeTaxiInvoiceResponse> recognizeTaxiInvoice =
        genForrecognizeTaxiInvoice();

    private static HttpRequestDef<RecognizeTaxiInvoiceRequest, RecognizeTaxiInvoiceResponse> genForrecognizeTaxiInvoice() {
        // basic
        HttpRequestDef.Builder<RecognizeTaxiInvoiceRequest, RecognizeTaxiInvoiceResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, RecognizeTaxiInvoiceRequest.class, RecognizeTaxiInvoiceResponse.class)
            .withName("RecognizeTaxiInvoice")
            .withUri("/v2/{project_id}/ocr/taxi-invoice")
            .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<TaxiInvoiceRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(TaxiInvoiceRequestBody.class),
            f -> f.withMarshaller(RecognizeTaxiInvoiceRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RecognizeThailandIdcardRequest, RecognizeThailandIdcardResponse> recognizeThailandIdcard =
        genForrecognizeThailandIdcard();

    private static HttpRequestDef<RecognizeThailandIdcardRequest, RecognizeThailandIdcardResponse> genForrecognizeThailandIdcard() {
        // basic
        HttpRequestDef.Builder<RecognizeThailandIdcardRequest, RecognizeThailandIdcardResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, RecognizeThailandIdcardRequest.class, RecognizeThailandIdcardResponse.class)
            .withName("RecognizeThailandIdcard")
            .withUri("/v2/{project_id}/ocr/thailand-id-card")
            .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<ThailandIdcardRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ThailandIdcardRequestBody.class),
            f -> f.withMarshaller(RecognizeThailandIdcardRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RecognizeThailandLicensePlateRequest, RecognizeThailandLicensePlateResponse> recognizeThailandLicensePlate =
        genForrecognizeThailandLicensePlate();

    private static HttpRequestDef<RecognizeThailandLicensePlateRequest, RecognizeThailandLicensePlateResponse> genForrecognizeThailandLicensePlate() {
        // basic
        HttpRequestDef.Builder<RecognizeThailandLicensePlateRequest, RecognizeThailandLicensePlateResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    RecognizeThailandLicensePlateRequest.class,
                    RecognizeThailandLicensePlateResponse.class)
                .withName("RecognizeThailandLicensePlate")
                .withUri("/v2/{project_id}/ocr/thailand-license-plate")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<ThailandLicensePlateRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ThailandLicensePlateRequestBody.class),
            f -> f.withMarshaller(RecognizeThailandLicensePlateRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RecognizeTollInvoiceRequest, RecognizeTollInvoiceResponse> recognizeTollInvoice =
        genForrecognizeTollInvoice();

    private static HttpRequestDef<RecognizeTollInvoiceRequest, RecognizeTollInvoiceResponse> genForrecognizeTollInvoice() {
        // basic
        HttpRequestDef.Builder<RecognizeTollInvoiceRequest, RecognizeTollInvoiceResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, RecognizeTollInvoiceRequest.class, RecognizeTollInvoiceResponse.class)
            .withName("RecognizeTollInvoice")
            .withUri("/v2/{project_id}/ocr/toll-invoice")
            .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<TollInvoiceRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(TollInvoiceRequestBody.class),
            f -> f.withMarshaller(RecognizeTollInvoiceRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RecognizeTrainTicketRequest, RecognizeTrainTicketResponse> recognizeTrainTicket =
        genForrecognizeTrainTicket();

    private static HttpRequestDef<RecognizeTrainTicketRequest, RecognizeTrainTicketResponse> genForrecognizeTrainTicket() {
        // basic
        HttpRequestDef.Builder<RecognizeTrainTicketRequest, RecognizeTrainTicketResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, RecognizeTrainTicketRequest.class, RecognizeTrainTicketResponse.class)
            .withName("RecognizeTrainTicket")
            .withUri("/v2/{project_id}/ocr/train-ticket")
            .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<TrainTicketRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(TrainTicketRequestBody.class),
            f -> f.withMarshaller(RecognizeTrainTicketRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RecognizeTransportationLicenseRequest, RecognizeTransportationLicenseResponse> recognizeTransportationLicense =
        genForrecognizeTransportationLicense();

    private static HttpRequestDef<RecognizeTransportationLicenseRequest, RecognizeTransportationLicenseResponse> genForrecognizeTransportationLicense() {
        // basic
        HttpRequestDef.Builder<RecognizeTransportationLicenseRequest, RecognizeTransportationLicenseResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    RecognizeTransportationLicenseRequest.class,
                    RecognizeTransportationLicenseResponse.class)
                .withName("RecognizeTransportationLicense")
                .withUri("/v2/{project_id}/ocr/transportation-license")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<TransportationLicenseRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(TransportationLicenseRequestBody.class),
            f -> f.withMarshaller(RecognizeTransportationLicenseRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RecognizeVatInvoiceRequest, RecognizeVatInvoiceResponse> recognizeVatInvoice =
        genForrecognizeVatInvoice();

    private static HttpRequestDef<RecognizeVatInvoiceRequest, RecognizeVatInvoiceResponse> genForrecognizeVatInvoice() {
        // basic
        HttpRequestDef.Builder<RecognizeVatInvoiceRequest, RecognizeVatInvoiceResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, RecognizeVatInvoiceRequest.class, RecognizeVatInvoiceResponse.class)
                .withName("RecognizeVatInvoice")
                .withUri("/v2/{project_id}/ocr/vat-invoice")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<VatInvoiceRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(VatInvoiceRequestBody.class),
            f -> f.withMarshaller(RecognizeVatInvoiceRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RecognizeVehicleLicenseRequest, RecognizeVehicleLicenseResponse> recognizeVehicleLicense =
        genForrecognizeVehicleLicense();

    private static HttpRequestDef<RecognizeVehicleLicenseRequest, RecognizeVehicleLicenseResponse> genForrecognizeVehicleLicense() {
        // basic
        HttpRequestDef.Builder<RecognizeVehicleLicenseRequest, RecognizeVehicleLicenseResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, RecognizeVehicleLicenseRequest.class, RecognizeVehicleLicenseResponse.class)
            .withName("RecognizeVehicleLicense")
            .withUri("/v2/{project_id}/ocr/vehicle-license")
            .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<VehicleLicenseRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(VehicleLicenseRequestBody.class),
            f -> f.withMarshaller(RecognizeVehicleLicenseRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RecognizeWaybillElectronicRequest, RecognizeWaybillElectronicResponse> recognizeWaybillElectronic =
        genForrecognizeWaybillElectronic();

    private static HttpRequestDef<RecognizeWaybillElectronicRequest, RecognizeWaybillElectronicResponse> genForrecognizeWaybillElectronic() {
        // basic
        HttpRequestDef.Builder<RecognizeWaybillElectronicRequest, RecognizeWaybillElectronicResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    RecognizeWaybillElectronicRequest.class,
                    RecognizeWaybillElectronicResponse.class)
                .withName("RecognizeWaybillElectronic")
                .withUri("/v2/{project_id}/ocr/waybill-electronic")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<WaybillElectronicRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(WaybillElectronicRequestBody.class),
            f -> f.withMarshaller(RecognizeWaybillElectronicRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RecognizeWebImageRequest, RecognizeWebImageResponse> recognizeWebImage =
        genForrecognizeWebImage();

    private static HttpRequestDef<RecognizeWebImageRequest, RecognizeWebImageResponse> genForrecognizeWebImage() {
        // basic
        HttpRequestDef.Builder<RecognizeWebImageRequest, RecognizeWebImageResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, RecognizeWebImageRequest.class, RecognizeWebImageResponse.class)
                .withName("RecognizeWebImage")
                .withUri("/v2/{project_id}/ocr/web-image")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<WebImageRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(WebImageRequestBody.class),
            f -> f.withMarshaller(RecognizeWebImageRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RecognizeVinRequest, RecognizeVinResponse> recognizeVin = genForrecognizeVin();

    private static HttpRequestDef<RecognizeVinRequest, RecognizeVinResponse> genForrecognizeVin() {
        // basic
        HttpRequestDef.Builder<RecognizeVinRequest, RecognizeVinResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, RecognizeVinRequest.class, RecognizeVinResponse.class)
                .withName("RecognizeVin")
                .withUri("/v2/{project_id}/ocr/vin")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<VinRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(VinRequestBody.class),
            f -> f.withMarshaller(RecognizeVinRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

}
