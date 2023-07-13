package com.huaweicloud.sdk.dli.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class ChangeQueuePlanRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "plan_id")

    private String planId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "queue_name")

    private String queueName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private SetQueuePlanReq body;

    public ChangeQueuePlanRequest withPlanId(String planId) {
        this.planId = planId;
        return this;
    }

    /**
     * 待修改的队列扩缩容计划的ID
     * @return planId
     */
    public String getPlanId() {
        return planId;
    }

    public void setPlanId(String planId) {
        this.planId = planId;
    }

    public ChangeQueuePlanRequest withQueueName(String queueName) {
        this.queueName = queueName;
        return this;
    }

    /**
     * 待删除定时扩缩计划的队列名称
     * @return queueName
     */
    public String getQueueName() {
        return queueName;
    }

    public void setQueueName(String queueName) {
        this.queueName = queueName;
    }

    public ChangeQueuePlanRequest withBody(SetQueuePlanReq body) {
        this.body = body;
        return this;
    }

    public ChangeQueuePlanRequest withBody(Consumer<SetQueuePlanReq> bodySetter) {
        if (this.body == null) {
            this.body = new SetQueuePlanReq();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public SetQueuePlanReq getBody() {
        return body;
    }

    public void setBody(SetQueuePlanReq body) {
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
        ChangeQueuePlanRequest that = (ChangeQueuePlanRequest) obj;
        return Objects.equals(this.planId, that.planId) && Objects.equals(this.queueName, that.queueName)
            && Objects.equals(this.body, that.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(planId, queueName, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ChangeQueuePlanRequest {\n");
        sb.append("    planId: ").append(toIndentedString(planId)).append("\n");
        sb.append("    queueName: ").append(toIndentedString(queueName)).append("\n");
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
