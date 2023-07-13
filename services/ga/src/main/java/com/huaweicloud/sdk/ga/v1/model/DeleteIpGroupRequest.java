package com.huaweicloud.sdk.ga.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class DeleteIpGroupRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ip_group_id")

    private String ipGroupId;

    public DeleteIpGroupRequest withIpGroupId(String ipGroupId) {
        this.ipGroupId = ipGroupId;
        return this;
    }

    /**
     * IP地址组ID。
     * @return ipGroupId
     */
    public String getIpGroupId() {
        return ipGroupId;
    }

    public void setIpGroupId(String ipGroupId) {
        this.ipGroupId = ipGroupId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DeleteIpGroupRequest that = (DeleteIpGroupRequest) obj;
        return Objects.equals(this.ipGroupId, that.ipGroupId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ipGroupId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeleteIpGroupRequest {\n");
        sb.append("    ipGroupId: ").append(toIndentedString(ipGroupId)).append("\n");
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
