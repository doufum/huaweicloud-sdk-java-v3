package com.huaweicloud.sdk.ges.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 图实例是否加密，默认不加密。
 */
public class CreateGraphReqGraphEncryption {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enable")

    private Boolean enable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "master_key_id")

    private String masterKeyId;

    public CreateGraphReqGraphEncryption withEnable(Boolean enable) {
        this.enable = enable;
        return this;
    }

    /**
     * 是否启动加密特性。取值为“true”或者“false”。默认为“false”。
     * @return enable
     */
    public Boolean getEnable() {
        return enable;
    }

    public void setEnable(Boolean enable) {
        this.enable = enable;
    }

    public CreateGraphReqGraphEncryption withMasterKeyId(String masterKeyId) {
        this.masterKeyId = masterKeyId;
        return this;
    }

    /**
     * 与建图对应的project下，华为云数据加密服务创建的用户主密钥ID。
     * @return masterKeyId
     */
    public String getMasterKeyId() {
        return masterKeyId;
    }

    public void setMasterKeyId(String masterKeyId) {
        this.masterKeyId = masterKeyId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateGraphReqGraphEncryption that = (CreateGraphReqGraphEncryption) obj;
        return Objects.equals(this.enable, that.enable) && Objects.equals(this.masterKeyId, that.masterKeyId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(enable, masterKeyId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateGraphReqGraphEncryption {\n");
        sb.append("    enable: ").append(toIndentedString(enable)).append("\n");
        sb.append("    masterKeyId: ").append(toIndentedString(masterKeyId)).append("\n");
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
