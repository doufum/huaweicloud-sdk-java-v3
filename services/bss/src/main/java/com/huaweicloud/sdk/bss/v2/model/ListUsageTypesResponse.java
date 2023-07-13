package com.huaweicloud.sdk.bss.v2.model;

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
public class ListUsageTypesResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_count")

    private Integer totalCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "usage_types")

    private List<UsageType> usageTypes = null;

    public ListUsageTypesResponse withTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }

    /**
     * 总数。
     * @return totalCount
     */
    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public ListUsageTypesResponse withUsageTypes(List<UsageType> usageTypes) {
        this.usageTypes = usageTypes;
        return this;
    }

    public ListUsageTypesResponse addUsageTypesItem(UsageType usageTypesItem) {
        if (this.usageTypes == null) {
            this.usageTypes = new ArrayList<>();
        }
        this.usageTypes.add(usageTypesItem);
        return this;
    }

    public ListUsageTypesResponse withUsageTypes(Consumer<List<UsageType>> usageTypesSetter) {
        if (this.usageTypes == null) {
            this.usageTypes = new ArrayList<>();
        }
        usageTypesSetter.accept(this.usageTypes);
        return this;
    }

    /**
     * 使用量类型列表，具体请参见表3。
     * @return usageTypes
     */
    public List<UsageType> getUsageTypes() {
        return usageTypes;
    }

    public void setUsageTypes(List<UsageType> usageTypes) {
        this.usageTypes = usageTypes;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListUsageTypesResponse that = (ListUsageTypesResponse) obj;
        return Objects.equals(this.totalCount, that.totalCount) && Objects.equals(this.usageTypes, that.usageTypes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(totalCount, usageTypes);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListUsageTypesResponse {\n");
        sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
        sb.append("    usageTypes: ").append(toIndentedString(usageTypes)).append("\n");
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
