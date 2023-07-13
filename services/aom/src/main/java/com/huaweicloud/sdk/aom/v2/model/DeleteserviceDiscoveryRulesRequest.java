package com.huaweicloud.sdk.aom.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class DeleteserviceDiscoveryRulesRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "appRulesIds")

    private List<String> appRulesIds = null;

    public DeleteserviceDiscoveryRulesRequest withAppRulesIds(List<String> appRulesIds) {
        this.appRulesIds = appRulesIds;
        return this;
    }

    public DeleteserviceDiscoveryRulesRequest addAppRulesIdsItem(String appRulesIdsItem) {
        if (this.appRulesIds == null) {
            this.appRulesIds = new ArrayList<>();
        }
        this.appRulesIds.add(appRulesIdsItem);
        return this;
    }

    public DeleteserviceDiscoveryRulesRequest withAppRulesIds(Consumer<List<String>> appRulesIdsSetter) {
        if (this.appRulesIds == null) {
            this.appRulesIds = new ArrayList<>();
        }
        appRulesIdsSetter.accept(this.appRulesIds);
        return this;
    }

    /**
     * 发现规则ID,传多个时以逗号分隔。
     * @return appRulesIds
     */
    public List<String> getAppRulesIds() {
        return appRulesIds;
    }

    public void setAppRulesIds(List<String> appRulesIds) {
        this.appRulesIds = appRulesIds;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DeleteserviceDiscoveryRulesRequest that = (DeleteserviceDiscoveryRulesRequest) obj;
        return Objects.equals(this.appRulesIds, that.appRulesIds);
    }

    @Override
    public int hashCode() {
        return Objects.hash(appRulesIds);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeleteserviceDiscoveryRulesRequest {\n");
        sb.append("    appRulesIds: ").append(toIndentedString(appRulesIds)).append("\n");
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
