package com.huaweicloud.sdk.cce.v3.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * Runtime
 */
public class Runtime {

    /**
     * 容器运行时, 默认场景： - 1.25以下集群：默认为\"docker\" - 1.25及以上集群，随操作系统变化，默认的容器运行时不同：操作系统为欧拉2.5、欧拉2.8的节点默认为\"docker\"，其余操作系统的节点默认为\"containerd\" 
     */
    public static final class NameEnum {

        /**
         * Enum DOCKER for value: "docker"
         */
        public static final NameEnum DOCKER = new NameEnum("docker");

        /**
         * Enum CONTAINERD for value: "containerd"
         */
        public static final NameEnum CONTAINERD = new NameEnum("containerd");

        private static final Map<String, NameEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, NameEnum> createStaticFields() {
            Map<String, NameEnum> map = new HashMap<>();
            map.put("docker", DOCKER);
            map.put("containerd", CONTAINERD);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        NameEnum(String value) {
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
        public static NameEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new NameEnum(value));
        }

        public static NameEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof NameEnum) {
                return this.value.equals(((NameEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private NameEnum name;

    public Runtime withName(NameEnum name) {
        this.name = name;
        return this;
    }

    /**
     * 容器运行时, 默认场景： - 1.25以下集群：默认为\"docker\" - 1.25及以上集群，随操作系统变化，默认的容器运行时不同：操作系统为欧拉2.5、欧拉2.8的节点默认为\"docker\"，其余操作系统的节点默认为\"containerd\" 
     * @return name
     */
    public NameEnum getName() {
        return name;
    }

    public void setName(NameEnum name) {
        this.name = name;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Runtime that = (Runtime) obj;
        return Objects.equals(this.name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Runtime {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
