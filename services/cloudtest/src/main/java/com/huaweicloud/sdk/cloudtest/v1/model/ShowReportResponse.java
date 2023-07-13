package com.huaweicloud.sdk.cloudtest.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowReportResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "result")

    private ResultValueCustomReportListVo result;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "error")

    private ApiError error;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "request_id")

    private String requestId;

    public ShowReportResponse withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * success|error
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public ShowReportResponse withResult(ResultValueCustomReportListVo result) {
        this.result = result;
        return this;
    }

    public ShowReportResponse withResult(Consumer<ResultValueCustomReportListVo> resultSetter) {
        if (this.result == null) {
            this.result = new ResultValueCustomReportListVo();
            resultSetter.accept(this.result);
        }

        return this;
    }

    /**
     * Get result
     * @return result
     */
    public ResultValueCustomReportListVo getResult() {
        return result;
    }

    public void setResult(ResultValueCustomReportListVo result) {
        this.result = result;
    }

    public ShowReportResponse withError(ApiError error) {
        this.error = error;
        return this;
    }

    public ShowReportResponse withError(Consumer<ApiError> errorSetter) {
        if (this.error == null) {
            this.error = new ApiError();
            errorSetter.accept(this.error);
        }

        return this;
    }

    /**
     * Get error
     * @return error
     */
    public ApiError getError() {
        return error;
    }

    public void setError(ApiError error) {
        this.error = error;
    }

    public ShowReportResponse withRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }

    /**
     * 由接口调用方传入，建议使用UUID保证请求的唯一性。
     * @return requestId
     */
    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowReportResponse that = (ShowReportResponse) obj;
        return Objects.equals(this.status, that.status) && Objects.equals(this.result, that.result)
            && Objects.equals(this.error, that.error) && Objects.equals(this.requestId, that.requestId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(status, result, error, requestId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowReportResponse {\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    result: ").append(toIndentedString(result)).append("\n");
        sb.append("    error: ").append(toIndentedString(error)).append("\n");
        sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
