package com.huaweicloud.sdk.aom.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * AppRulesBody
 */
public class AppRulesBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "appRules")

    private List<AppRules> appRules = null;

    public AppRulesBody withAppRules(List<AppRules> appRules) {
        this.appRules = appRules;
        return this;
    }

    public AppRulesBody addAppRulesItem(AppRules appRulesItem) {
        if (this.appRules == null) {
            this.appRules = new ArrayList<>();
        }
        this.appRules.add(appRulesItem);
        return this;
    }

    public AppRulesBody withAppRules(Consumer<List<AppRules>> appRulesSetter) {
        if (this.appRules == null) {
            this.appRules = new ArrayList<>();
        }
        appRulesSetter.accept(this.appRules);
        return this;
    }

    /**
     * 服务参数。
     * @return appRules
     */
    public List<AppRules> getAppRules() {
        return appRules;
    }

    public void setAppRules(List<AppRules> appRules) {
        this.appRules = appRules;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AppRulesBody that = (AppRulesBody) obj;
        return Objects.equals(this.appRules, that.appRules);
    }

    @Override
    public int hashCode() {
        return Objects.hash(appRules);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AppRulesBody {\n");
        sb.append("    appRules: ").append(toIndentedString(appRules)).append("\n");
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
