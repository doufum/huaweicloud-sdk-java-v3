package com.huaweicloud.sdk.csms.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 分页信息。
 */
public class PageInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "next_marker")

    private String nextMarker;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "previous_marker")

    private String previousMarker;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "current_count")

    private Integer currentCount;

    public PageInfo withNextMarker(String nextMarker) {
        this.nextMarker = nextMarker;
        return this;
    }

    /**
     * 下一页查询地址（下一页起始资源id）。
     * @return nextMarker
     */
    public String getNextMarker() {
        return nextMarker;
    }

    public void setNextMarker(String nextMarker) {
        this.nextMarker = nextMarker;
    }

    public PageInfo withPreviousMarker(String previousMarker) {
        this.previousMarker = previousMarker;
        return this;
    }

    /**
     * 前一页查询地址（上一页末尾资源id）。
     * @return previousMarker
     */
    public String getPreviousMarker() {
        return previousMarker;
    }

    public void setPreviousMarker(String previousMarker) {
        this.previousMarker = previousMarker;
    }

    public PageInfo withCurrentCount(Integer currentCount) {
        this.currentCount = currentCount;
        return this;
    }

    /**
     * 本页返回条目数量。
     * minimum: 0
     * maximum: 1000
     * @return currentCount
     */
    public Integer getCurrentCount() {
        return currentCount;
    }

    public void setCurrentCount(Integer currentCount) {
        this.currentCount = currentCount;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PageInfo pageInfo = (PageInfo) o;
        return Objects.equals(this.nextMarker, pageInfo.nextMarker)
            && Objects.equals(this.previousMarker, pageInfo.previousMarker)
            && Objects.equals(this.currentCount, pageInfo.currentCount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nextMarker, previousMarker, currentCount);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PageInfo {\n");
        sb.append("    nextMarker: ").append(toIndentedString(nextMarker)).append("\n");
        sb.append("    previousMarker: ").append(toIndentedString(previousMarker)).append("\n");
        sb.append("    currentCount: ").append(toIndentedString(currentCount)).append("\n");
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
