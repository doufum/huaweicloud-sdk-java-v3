package com.huaweicloud.sdk.config.v1.model;

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
public class ShowAggregatePolicyStateComplianceSummaryResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "results")

    private List<AggregatePolicyComplianceSummaryResult> results = null;

    public ShowAggregatePolicyStateComplianceSummaryResponse withResults(
        List<AggregatePolicyComplianceSummaryResult> results) {
        this.results = results;
        return this;
    }

    public ShowAggregatePolicyStateComplianceSummaryResponse addResultsItem(
        AggregatePolicyComplianceSummaryResult resultsItem) {
        if (this.results == null) {
            this.results = new ArrayList<>();
        }
        this.results.add(resultsItem);
        return this;
    }

    public ShowAggregatePolicyStateComplianceSummaryResponse withResults(
        Consumer<List<AggregatePolicyComplianceSummaryResult>> resultsSetter) {
        if (this.results == null) {
            this.results = new ArrayList<>();
        }
        resultsSetter.accept(this.results);
        return this;
    }

    /**
     * 合规总结结果列表
     * @return results
     */
    public List<AggregatePolicyComplianceSummaryResult> getResults() {
        return results;
    }

    public void setResults(List<AggregatePolicyComplianceSummaryResult> results) {
        this.results = results;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowAggregatePolicyStateComplianceSummaryResponse that =
            (ShowAggregatePolicyStateComplianceSummaryResponse) obj;
        return Objects.equals(this.results, that.results);
    }

    @Override
    public int hashCode() {
        return Objects.hash(results);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowAggregatePolicyStateComplianceSummaryResponse {\n");
        sb.append("    results: ").append(toIndentedString(results)).append("\n");
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
