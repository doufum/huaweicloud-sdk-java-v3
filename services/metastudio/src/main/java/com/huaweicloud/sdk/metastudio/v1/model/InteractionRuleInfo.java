package com.huaweicloud.sdk.metastudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 互动规则配置信息
 */
public class InteractionRuleInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rule_name")

    private String ruleName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enabled")

    private Boolean enabled;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "event_type")

    private Integer eventType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "hit_condition")

    private HitCondition hitCondition;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "trigger")

    private TriggerProcess trigger;

    public InteractionRuleInfo withRuleName(String ruleName) {
        this.ruleName = ruleName;
        return this;
    }

    /**
     * 规则名称
     * @return ruleName
     */
    public String getRuleName() {
        return ruleName;
    }

    public void setRuleName(String ruleName) {
        this.ruleName = ruleName;
    }

    public InteractionRuleInfo withEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    /**
     * 是否启用
     * @return enabled
     */
    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public InteractionRuleInfo withEventType(Integer eventType) {
        this.eventType = eventType;
        return this;
    }

    /**
     * 事件类型
     * minimum: 0
     * maximum: 100
     * @return eventType
     */
    public Integer getEventType() {
        return eventType;
    }

    public void setEventType(Integer eventType) {
        this.eventType = eventType;
    }

    public InteractionRuleInfo withHitCondition(HitCondition hitCondition) {
        this.hitCondition = hitCondition;
        return this;
    }

    public InteractionRuleInfo withHitCondition(Consumer<HitCondition> hitConditionSetter) {
        if (this.hitCondition == null) {
            this.hitCondition = new HitCondition();
            hitConditionSetter.accept(this.hitCondition);
        }

        return this;
    }

    /**
     * Get hitCondition
     * @return hitCondition
     */
    public HitCondition getHitCondition() {
        return hitCondition;
    }

    public void setHitCondition(HitCondition hitCondition) {
        this.hitCondition = hitCondition;
    }

    public InteractionRuleInfo withTrigger(TriggerProcess trigger) {
        this.trigger = trigger;
        return this;
    }

    public InteractionRuleInfo withTrigger(Consumer<TriggerProcess> triggerSetter) {
        if (this.trigger == null) {
            this.trigger = new TriggerProcess();
            triggerSetter.accept(this.trigger);
        }

        return this;
    }

    /**
     * Get trigger
     * @return trigger
     */
    public TriggerProcess getTrigger() {
        return trigger;
    }

    public void setTrigger(TriggerProcess trigger) {
        this.trigger = trigger;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        InteractionRuleInfo that = (InteractionRuleInfo) obj;
        return Objects.equals(this.ruleName, that.ruleName) && Objects.equals(this.enabled, that.enabled)
            && Objects.equals(this.eventType, that.eventType) && Objects.equals(this.hitCondition, that.hitCondition)
            && Objects.equals(this.trigger, that.trigger);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ruleName, enabled, eventType, hitCondition, trigger);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class InteractionRuleInfo {\n");
        sb.append("    ruleName: ").append(toIndentedString(ruleName)).append("\n");
        sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
        sb.append("    eventType: ").append(toIndentedString(eventType)).append("\n");
        sb.append("    hitCondition: ").append(toIndentedString(hitCondition)).append("\n");
        sb.append("    trigger: ").append(toIndentedString(trigger)).append("\n");
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
