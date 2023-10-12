package com.huaweicloud.sdk.aos.v1.model;

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
public class ListStackSetsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "stack_sets")

    private List<StackSet> stackSets = null;

    public ListStackSetsResponse withStackSets(List<StackSet> stackSets) {
        this.stackSets = stackSets;
        return this;
    }

    public ListStackSetsResponse addStackSetsItem(StackSet stackSetsItem) {
        if (this.stackSets == null) {
            this.stackSets = new ArrayList<>();
        }
        this.stackSets.add(stackSetsItem);
        return this;
    }

    public ListStackSetsResponse withStackSets(Consumer<List<StackSet>> stackSetsSetter) {
        if (this.stackSets == null) {
            this.stackSets = new ArrayList<>();
        }
        stackSetsSetter.accept(this.stackSets);
        return this;
    }

    /**
     * 资源栈集
     * @return stackSets
     */
    public List<StackSet> getStackSets() {
        return stackSets;
    }

    public void setStackSets(List<StackSet> stackSets) {
        this.stackSets = stackSets;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListStackSetsResponse that = (ListStackSetsResponse) obj;
        return Objects.equals(this.stackSets, that.stackSets);
    }

    @Override
    public int hashCode() {
        return Objects.hash(stackSets);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListStackSetsResponse {\n");
        sb.append("    stackSets: ").append(toIndentedString(stackSets)).append("\n");
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
