package com.huaweicloud.sdk.identitycenter.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ListCustomerManagedPolicyReferencesInPermissionSetRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_id")

    private String instanceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "permission_set_id")

    private String permissionSetId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "marker")

    private String marker;

    public ListCustomerManagedPolicyReferencesInPermissionSetRequest withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * Get instanceId
     * @return instanceId
     */
    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public ListCustomerManagedPolicyReferencesInPermissionSetRequest withPermissionSetId(String permissionSetId) {
        this.permissionSetId = permissionSetId;
        return this;
    }

    /**
     * Get permissionSetId
     * @return permissionSetId
     */
    public String getPermissionSetId() {
        return permissionSetId;
    }

    public void setPermissionSetId(String permissionSetId) {
        this.permissionSetId = permissionSetId;
    }

    public ListCustomerManagedPolicyReferencesInPermissionSetRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * Get limit
     * minimum: 1
     * maximum: 100
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public ListCustomerManagedPolicyReferencesInPermissionSetRequest withMarker(String marker) {
        this.marker = marker;
        return this;
    }

    /**
     * Get marker
     * @return marker
     */
    public String getMarker() {
        return marker;
    }

    public void setMarker(String marker) {
        this.marker = marker;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListCustomerManagedPolicyReferencesInPermissionSetRequest that =
            (ListCustomerManagedPolicyReferencesInPermissionSetRequest) obj;
        return Objects.equals(this.instanceId, that.instanceId)
            && Objects.equals(this.permissionSetId, that.permissionSetId) && Objects.equals(this.limit, that.limit)
            && Objects.equals(this.marker, that.marker);
    }

    @Override
    public int hashCode() {
        return Objects.hash(instanceId, permissionSetId, limit, marker);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListCustomerManagedPolicyReferencesInPermissionSetRequest {\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
        sb.append("    permissionSetId: ").append(toIndentedString(permissionSetId)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    marker: ").append(toIndentedString(marker)).append("\n");
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
