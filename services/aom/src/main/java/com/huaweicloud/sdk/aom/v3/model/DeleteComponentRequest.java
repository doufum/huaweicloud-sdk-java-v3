package com.huaweicloud.sdk.aom.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class DeleteComponentRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "component_id")

    private String componentId;

    public DeleteComponentRequest withComponentId(String componentId) {
        this.componentId = componentId;
        return this;
    }

    /**
     * 组件id
     * @return componentId
     */
    public String getComponentId() {
        return componentId;
    }

    public void setComponentId(String componentId) {
        this.componentId = componentId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DeleteComponentRequest that = (DeleteComponentRequest) obj;
        return Objects.equals(this.componentId, that.componentId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(componentId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeleteComponentRequest {\n");
        sb.append("    componentId: ").append(toIndentedString(componentId)).append("\n");
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
