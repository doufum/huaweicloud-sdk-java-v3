package com.huaweicloud.sdk.ges.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * This is a auto create Body Object
 */
public class CreateGraphReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "graph")

    private Graph graph;

    public CreateGraphReq withGraph(Graph graph) {
        this.graph = graph;
        return this;
    }

    public CreateGraphReq withGraph(Consumer<Graph> graphSetter) {
        if (this.graph == null) {
            this.graph = new Graph();
            graphSetter.accept(this.graph);
        }

        return this;
    }

    /**
     * Get graph
     * @return graph
     */
    public Graph getGraph() {
        return graph;
    }

    public void setGraph(Graph graph) {
        this.graph = graph;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateGraphReq that = (CreateGraphReq) obj;
        return Objects.equals(this.graph, that.graph);
    }

    @Override
    public int hashCode() {
        return Objects.hash(graph);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateGraphReq {\n");
        sb.append("    graph: ").append(toIndentedString(graph)).append("\n");
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
