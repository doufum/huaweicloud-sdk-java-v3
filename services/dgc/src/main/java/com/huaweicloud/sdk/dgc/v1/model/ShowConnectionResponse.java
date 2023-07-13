package com.huaweicloud.sdk.dgc.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * Response Object
 */
public class ShowConnectionResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    /**
     * Gets or Sets type
     */
    public static final class TypeEnum {

        /**
         * Enum DWS for value: "DWS"
         */
        public static final TypeEnum DWS = new TypeEnum("DWS");

        /**
         * Enum DLI for value: "DLI"
         */
        public static final TypeEnum DLI = new TypeEnum("DLI");

        /**
         * Enum SPARKSQL for value: "SparkSQL"
         */
        public static final TypeEnum SPARKSQL = new TypeEnum("SparkSQL");

        /**
         * Enum HIVE for value: "Hive"
         */
        public static final TypeEnum HIVE = new TypeEnum("Hive");

        /**
         * Enum RDS for value: "RDS"
         */
        public static final TypeEnum RDS = new TypeEnum("RDS");

        /**
         * Enum CLOUDTABLE for value: "CloudTable"
         */
        public static final TypeEnum CLOUDTABLE = new TypeEnum("CloudTable");

        private static final Map<String, TypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, TypeEnum> createStaticFields() {
            Map<String, TypeEnum> map = new HashMap<>();
            map.put("DWS", DWS);
            map.put("DLI", DLI);
            map.put("SparkSQL", SPARKSQL);
            map.put("Hive", HIVE);
            map.put("RDS", RDS);
            map.put("CloudTable", CLOUDTABLE);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        TypeEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static TypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new TypeEnum(value));
        }

        public static TypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof TypeEnum) {
                return this.value.equals(((TypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private TypeEnum type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "config")

    private Object config;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    public ShowConnectionResponse withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get name
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ShowConnectionResponse withType(TypeEnum type) {
        this.type = type;
        return this;
    }

    /**
     * Get type
     * @return type
     */
    public TypeEnum getType() {
        return type;
    }

    public void setType(TypeEnum type) {
        this.type = type;
    }

    public ShowConnectionResponse withConfig(Object config) {
        this.config = config;
        return this;
    }

    /**
     * Get config
     * @return config
     */
    public Object getConfig() {
        return config;
    }

    public void setConfig(Object config) {
        this.config = config;
    }

    public ShowConnectionResponse withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get description
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowConnectionResponse that = (ShowConnectionResponse) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.type, that.type)
            && Objects.equals(this.config, that.config) && Objects.equals(this.description, that.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, type, config, description);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowConnectionResponse {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    config: ").append(toIndentedString(config)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
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
