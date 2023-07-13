package com.huaweicloud.sdk.nlp.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class RunNerResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "named_entities")

    private List<NamedEntity> namedEntities = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "error_code")

    private String errorCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "error_msg")

    private String errorMsg;

    public RunNerResponse withNamedEntities(List<NamedEntity> namedEntities) {
        this.namedEntities = namedEntities;
        return this;
    }

    public RunNerResponse addNamedEntitiesItem(NamedEntity namedEntitiesItem) {
        if (this.namedEntities == null) {
            this.namedEntities = new ArrayList<>();
        }
        this.namedEntities.add(namedEntitiesItem);
        return this;
    }

    public RunNerResponse withNamedEntities(Consumer<List<NamedEntity>> namedEntitiesSetter) {
        if (this.namedEntities == null) {
            this.namedEntities = new ArrayList<>();
        }
        namedEntitiesSetter.accept(this.namedEntities);
        return this;
    }

    /**
     * 命名实体识别结果。调用失败时无此字段。
     * @return namedEntities
     */
    public List<NamedEntity> getNamedEntities() {
        return namedEntities;
    }

    public void setNamedEntities(List<NamedEntity> namedEntities) {
        this.namedEntities = namedEntities;
    }

    public RunNerResponse withErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }

    /**
     * 调用失败时的错误码，具体请参见错误码。调用成功时无此字段。
     * @return errorCode
     */
    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public RunNerResponse withErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }

    /**
     * 调用失败时的错误信息。调用成功时无此字段。
     * @return errorMsg
     */
    public String getErrorMsg() {
        return errorMsg;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RunNerResponse that = (RunNerResponse) obj;
        return Objects.equals(this.namedEntities, that.namedEntities) && Objects.equals(this.errorCode, that.errorCode)
            && Objects.equals(this.errorMsg, that.errorMsg);
    }

    @Override
    public int hashCode() {
        return Objects.hash(namedEntities, errorCode, errorMsg);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RunNerResponse {\n");
        sb.append("    namedEntities: ").append(toIndentedString(namedEntities)).append("\n");
        sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
        sb.append("    errorMsg: ").append(toIndentedString(errorMsg)).append("\n");
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
