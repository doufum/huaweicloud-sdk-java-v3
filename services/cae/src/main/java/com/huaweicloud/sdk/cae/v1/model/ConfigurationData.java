package com.huaweicloud.sdk.cae.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 组件配置数据。
 */
public class ConfigurationData {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "spec")

    private ConfigurationDataSpec spec;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "metadata")

    private ConfigurationDataMetadata metadata;

    public ConfigurationData withSpec(ConfigurationDataSpec spec) {
        this.spec = spec;
        return this;
    }

    public ConfigurationData withSpec(Consumer<ConfigurationDataSpec> specSetter) {
        if (this.spec == null) {
            this.spec = new ConfigurationDataSpec();
            specSetter.accept(this.spec);
        }

        return this;
    }

    /**
     * Get spec
     * @return spec
     */
    public ConfigurationDataSpec getSpec() {
        return spec;
    }

    public void setSpec(ConfigurationDataSpec spec) {
        this.spec = spec;
    }

    public ConfigurationData withMetadata(ConfigurationDataMetadata metadata) {
        this.metadata = metadata;
        return this;
    }

    public ConfigurationData withMetadata(Consumer<ConfigurationDataMetadata> metadataSetter) {
        if (this.metadata == null) {
            this.metadata = new ConfigurationDataMetadata();
            metadataSetter.accept(this.metadata);
        }

        return this;
    }

    /**
     * Get metadata
     * @return metadata
     */
    public ConfigurationDataMetadata getMetadata() {
        return metadata;
    }

    public void setMetadata(ConfigurationDataMetadata metadata) {
        this.metadata = metadata;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ConfigurationData that = (ConfigurationData) obj;
        return Objects.equals(this.spec, that.spec) && Objects.equals(this.metadata, that.metadata);
    }

    @Override
    public int hashCode() {
        return Objects.hash(spec, metadata);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ConfigurationData {\n");
        sb.append("    spec: ").append(toIndentedString(spec)).append("\n");
        sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
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
