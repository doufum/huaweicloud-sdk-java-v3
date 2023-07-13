package com.huaweicloud.sdk.eg.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class UpdateEndpointRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "endpoint_id")

    private String endpointId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private EndpointUpdateReq body;

    public UpdateEndpointRequest withEndpointId(String endpointId) {
        this.endpointId = endpointId;
        return this;
    }

    /**
     * 指定查询访问端点的id
     * @return endpointId
     */
    public String getEndpointId() {
        return endpointId;
    }

    public void setEndpointId(String endpointId) {
        this.endpointId = endpointId;
    }

    public UpdateEndpointRequest withBody(EndpointUpdateReq body) {
        this.body = body;
        return this;
    }

    public UpdateEndpointRequest withBody(Consumer<EndpointUpdateReq> bodySetter) {
        if (this.body == null) {
            this.body = new EndpointUpdateReq();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public EndpointUpdateReq getBody() {
        return body;
    }

    public void setBody(EndpointUpdateReq body) {
        this.body = body;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateEndpointRequest that = (UpdateEndpointRequest) obj;
        return Objects.equals(this.endpointId, that.endpointId) && Objects.equals(this.body, that.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(endpointId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateEndpointRequest {\n");
        sb.append("    endpointId: ").append(toIndentedString(endpointId)).append("\n");
        sb.append("    body: ").append(toIndentedString(body)).append("\n");
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
