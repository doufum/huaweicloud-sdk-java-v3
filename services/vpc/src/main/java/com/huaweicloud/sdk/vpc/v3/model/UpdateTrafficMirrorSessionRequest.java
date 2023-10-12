package com.huaweicloud.sdk.vpc.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class UpdateTrafficMirrorSessionRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "traffic_mirror_session_id")

    private String trafficMirrorSessionId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private UpdateTrafficMirrorSessionRequestBody body;

    public UpdateTrafficMirrorSessionRequest withTrafficMirrorSessionId(String trafficMirrorSessionId) {
        this.trafficMirrorSessionId = trafficMirrorSessionId;
        return this;
    }

    /**
     * 流量镜像会话ID
     * @return trafficMirrorSessionId
     */
    public String getTrafficMirrorSessionId() {
        return trafficMirrorSessionId;
    }

    public void setTrafficMirrorSessionId(String trafficMirrorSessionId) {
        this.trafficMirrorSessionId = trafficMirrorSessionId;
    }

    public UpdateTrafficMirrorSessionRequest withBody(UpdateTrafficMirrorSessionRequestBody body) {
        this.body = body;
        return this;
    }

    public UpdateTrafficMirrorSessionRequest withBody(Consumer<UpdateTrafficMirrorSessionRequestBody> bodySetter) {
        if (this.body == null) {
            this.body = new UpdateTrafficMirrorSessionRequestBody();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public UpdateTrafficMirrorSessionRequestBody getBody() {
        return body;
    }

    public void setBody(UpdateTrafficMirrorSessionRequestBody body) {
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
        UpdateTrafficMirrorSessionRequest that = (UpdateTrafficMirrorSessionRequest) obj;
        return Objects.equals(this.trafficMirrorSessionId, that.trafficMirrorSessionId)
            && Objects.equals(this.body, that.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(trafficMirrorSessionId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateTrafficMirrorSessionRequest {\n");
        sb.append("    trafficMirrorSessionId: ").append(toIndentedString(trafficMirrorSessionId)).append("\n");
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
