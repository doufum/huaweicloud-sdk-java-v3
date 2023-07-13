package com.huaweicloud.sdk.gaussdbforopengauss.v3.model;

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
public class ListAppliedHistoriesResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_count")

    private Integer totalCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "histories")

    private List<AppliedHistoriesResult> histories = null;

    public ListAppliedHistoriesResponse withTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }

    /**
     * 应用记录总数。
     * @return totalCount
     */
    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public ListAppliedHistoriesResponse withHistories(List<AppliedHistoriesResult> histories) {
        this.histories = histories;
        return this;
    }

    public ListAppliedHistoriesResponse addHistoriesItem(AppliedHistoriesResult historiesItem) {
        if (this.histories == null) {
            this.histories = new ArrayList<>();
        }
        this.histories.add(historiesItem);
        return this;
    }

    public ListAppliedHistoriesResponse withHistories(Consumer<List<AppliedHistoriesResult>> historiesSetter) {
        if (this.histories == null) {
            this.histories = new ArrayList<>();
        }
        historiesSetter.accept(this.histories);
        return this;
    }

    /**
     * 应用记录列表。
     * @return histories
     */
    public List<AppliedHistoriesResult> getHistories() {
        return histories;
    }

    public void setHistories(List<AppliedHistoriesResult> histories) {
        this.histories = histories;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListAppliedHistoriesResponse that = (ListAppliedHistoriesResponse) obj;
        return Objects.equals(this.totalCount, that.totalCount) && Objects.equals(this.histories, that.histories);
    }

    @Override
    public int hashCode() {
        return Objects.hash(totalCount, histories);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListAppliedHistoriesResponse {\n");
        sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
        sb.append("    histories: ").append(toIndentedString(histories)).append("\n");
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
