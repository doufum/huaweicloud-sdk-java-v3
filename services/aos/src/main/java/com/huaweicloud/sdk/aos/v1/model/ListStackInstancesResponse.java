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
public class ListStackInstancesResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "stack_instances")

    private List<StackInstance> stackInstances = null;

    public ListStackInstancesResponse withStackInstances(List<StackInstance> stackInstances) {
        this.stackInstances = stackInstances;
        return this;
    }

    public ListStackInstancesResponse addStackInstancesItem(StackInstance stackInstancesItem) {
        if (this.stackInstances == null) {
            this.stackInstances = new ArrayList<>();
        }
        this.stackInstances.add(stackInstancesItem);
        return this;
    }

    public ListStackInstancesResponse withStackInstances(Consumer<List<StackInstance>> stackInstancesSetter) {
        if (this.stackInstances == null) {
            this.stackInstances = new ArrayList<>();
        }
        stackInstancesSetter.accept(this.stackInstances);
        return this;
    }

    /**
     * 资源栈实例列表
     * @return stackInstances
     */
    public List<StackInstance> getStackInstances() {
        return stackInstances;
    }

    public void setStackInstances(List<StackInstance> stackInstances) {
        this.stackInstances = stackInstances;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListStackInstancesResponse that = (ListStackInstancesResponse) obj;
        return Objects.equals(this.stackInstances, that.stackInstances);
    }

    @Override
    public int hashCode() {
        return Objects.hash(stackInstances);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListStackInstancesResponse {\n");
        sb.append("    stackInstances: ").append(toIndentedString(stackInstances)).append("\n");
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
