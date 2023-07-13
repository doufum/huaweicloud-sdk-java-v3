package com.huaweicloud.sdk.dds.v3.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * Request Object
 */
public class ListStorageTypeRequest {

    /**
     * 数据库版本类型： - 取值为“DDS-Community”。
     */
    public static final class EngineNameEnum {

        /**
         * Enum DDS_COMMUNITY for value: "DDS-Community"
         */
        public static final EngineNameEnum DDS_COMMUNITY = new EngineNameEnum("DDS-Community");

        /**
         * Enum DDS_ENHANCED for value: "DDS-Enhanced"
         */
        public static final EngineNameEnum DDS_ENHANCED = new EngineNameEnum("DDS-Enhanced");

        private static final Map<String, EngineNameEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, EngineNameEnum> createStaticFields() {
            Map<String, EngineNameEnum> map = new HashMap<>();
            map.put("DDS-Community", DDS_COMMUNITY);
            map.put("DDS-Enhanced", DDS_ENHANCED);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        EngineNameEnum(String value) {
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
        public static EngineNameEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new EngineNameEnum(value));
        }

        public static EngineNameEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof EngineNameEnum) {
                return this.value.equals(((EngineNameEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "engine_name")

    private EngineNameEnum engineName;

    public ListStorageTypeRequest withEngineName(EngineNameEnum engineName) {
        this.engineName = engineName;
        return this;
    }

    /**
     * 数据库版本类型： - 取值为“DDS-Community”。
     * @return engineName
     */
    public EngineNameEnum getEngineName() {
        return engineName;
    }

    public void setEngineName(EngineNameEnum engineName) {
        this.engineName = engineName;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListStorageTypeRequest that = (ListStorageTypeRequest) obj;
        return Objects.equals(this.engineName, that.engineName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(engineName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListStorageTypeRequest {\n");
        sb.append("    engineName: ").append(toIndentedString(engineName)).append("\n");
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
