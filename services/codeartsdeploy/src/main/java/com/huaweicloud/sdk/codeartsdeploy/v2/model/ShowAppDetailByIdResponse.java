package com.huaweicloud.sdk.codeartsdeploy.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowAppDetailByIdResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "result")

    private AppDetailInfo result;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    public ShowAppDetailByIdResponse withResult(AppDetailInfo result) {
        this.result = result;
        return this;
    }

    public ShowAppDetailByIdResponse withResult(Consumer<AppDetailInfo> resultSetter) {
        if (this.result == null) {
            this.result = new AppDetailInfo();
            resultSetter.accept(this.result);
        }

        return this;
    }

    /**
     * Get result
     * @return result
     */
    public AppDetailInfo getResult() {
        return result;
    }

    public void setResult(AppDetailInfo result) {
        this.result = result;
    }

    public ShowAppDetailByIdResponse withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 请求成功失败状态
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowAppDetailByIdResponse that = (ShowAppDetailByIdResponse) obj;
        return Objects.equals(this.result, that.result) && Objects.equals(this.status, that.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(result, status);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowAppDetailByIdResponse {\n");
        sb.append("    result: ").append(toIndentedString(result)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
