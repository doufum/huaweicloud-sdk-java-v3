package com.huaweicloud.sdk.cpts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/** json */
public class ShowProcessResqJson {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "details")

    private List<ShowProcessResqJsonDetails> details = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "process_status")

    private Integer processStatus;

    public ShowProcessResqJson withDetails(List<ShowProcessResqJsonDetails> details) {
        this.details = details;
        return this;
    }

    public ShowProcessResqJson addDetailsItem(ShowProcessResqJsonDetails detailsItem) {
        if (this.details == null) {
            this.details = new ArrayList<>();
        }
        this.details.add(detailsItem);
        return this;
    }

    public ShowProcessResqJson withDetails(Consumer<List<ShowProcessResqJsonDetails>> detailsSetter) {
        if (this.details == null) {
            this.details = new ArrayList<>();
        }
        detailsSetter.accept(this.details);
        return this;
    }

    /** details
     * 
     * @return details */
    public List<ShowProcessResqJsonDetails> getDetails() {
        return details;
    }

    public void setDetails(List<ShowProcessResqJsonDetails> details) {
        this.details = details;
    }

    public ShowProcessResqJson withProcessStatus(Integer processStatus) {
        this.processStatus = processStatus;
        return this;
    }

    /** process_status minimum: 0 maximum: 2147483647
     * 
     * @return processStatus */
    public Integer getProcessStatus() {
        return processStatus;
    }

    public void setProcessStatus(Integer processStatus) {
        this.processStatus = processStatus;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowProcessResqJson showProcessResqJson = (ShowProcessResqJson) o;
        return Objects.equals(this.details, showProcessResqJson.details)
            && Objects.equals(this.processStatus, showProcessResqJson.processStatus);
    }

    @Override
    public int hashCode() {
        return Objects.hash(details, processStatus);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowProcessResqJson {\n");
        sb.append("    details: ").append(toIndentedString(details)).append("\n");
        sb.append("    processStatus: ").append(toIndentedString(processStatus)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
