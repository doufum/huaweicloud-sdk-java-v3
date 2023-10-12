package com.huaweicloud.sdk.as.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 创建伸缩配置请求
 */
public class CreateScalingConfigOption {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "scaling_configuration_name")

    private String scalingConfigurationName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_config")

    private InstanceConfig instanceConfig;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source_scaling_configuration_id")

    private String sourceScalingConfigurationId;

    public CreateScalingConfigOption withScalingConfigurationName(String scalingConfigurationName) {
        this.scalingConfigurationName = scalingConfigurationName;
        return this;
    }

    /**
     * 伸缩配置名称(1-64个字符)，只能包含中文、字母、数字、下划线或中划线。
     * @return scalingConfigurationName
     */
    public String getScalingConfigurationName() {
        return scalingConfigurationName;
    }

    public void setScalingConfigurationName(String scalingConfigurationName) {
        this.scalingConfigurationName = scalingConfigurationName;
    }

    public CreateScalingConfigOption withInstanceConfig(InstanceConfig instanceConfig) {
        this.instanceConfig = instanceConfig;
        return this;
    }

    public CreateScalingConfigOption withInstanceConfig(Consumer<InstanceConfig> instanceConfigSetter) {
        if (this.instanceConfig == null) {
            this.instanceConfig = new InstanceConfig();
            instanceConfigSetter.accept(this.instanceConfig);
        }

        return this;
    }

    /**
     * Get instanceConfig
     * @return instanceConfig
     */
    public InstanceConfig getInstanceConfig() {
        return instanceConfig;
    }

    public void setInstanceConfig(InstanceConfig instanceConfig) {
        this.instanceConfig = instanceConfig;
    }

    public CreateScalingConfigOption withSourceScalingConfigurationId(String sourceScalingConfigurationId) {
        this.sourceScalingConfigurationId = sourceScalingConfigurationId;
        return this;
    }

    /**
     * 源伸缩配置ID，通过ID获取原有伸缩配置信息进行修改，传入需修改的配置字段若为null值不产生修改，其他任何值（包括空值）均覆盖原有值。注意：若传入instance_id则优先使用instance_id获取到的值进行修改。
     * @return sourceScalingConfigurationId
     */
    public String getSourceScalingConfigurationId() {
        return sourceScalingConfigurationId;
    }

    public void setSourceScalingConfigurationId(String sourceScalingConfigurationId) {
        this.sourceScalingConfigurationId = sourceScalingConfigurationId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateScalingConfigOption that = (CreateScalingConfigOption) obj;
        return Objects.equals(this.scalingConfigurationName, that.scalingConfigurationName)
            && Objects.equals(this.instanceConfig, that.instanceConfig)
            && Objects.equals(this.sourceScalingConfigurationId, that.sourceScalingConfigurationId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(scalingConfigurationName, instanceConfig, sourceScalingConfigurationId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateScalingConfigOption {\n");
        sb.append("    scalingConfigurationName: ").append(toIndentedString(scalingConfigurationName)).append("\n");
        sb.append("    instanceConfig: ").append(toIndentedString(instanceConfig)).append("\n");
        sb.append("    sourceScalingConfigurationId: ")
            .append(toIndentedString(sourceScalingConfigurationId))
            .append("\n");
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
