package com.huaweicloud.sdk.rds.v3.model;

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
public class ListDatastoresRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Language")

    private String xLanguage;

    /**
     * 数据库引擎。支持的引擎如下，不区分大小写： MySQL PostgreSQL SQLServer
     */
    public static final class DatabaseNameEnum {

        /**
         * Enum MYSQL for value: "MySQL"
         */
        public static final DatabaseNameEnum MYSQL = new DatabaseNameEnum("MySQL");

        /**
         * Enum POSTGRESQL for value: "PostgreSQL"
         */
        public static final DatabaseNameEnum POSTGRESQL = new DatabaseNameEnum("PostgreSQL");

        /**
         * Enum SQLSERVER for value: "SQLServer"
         */
        public static final DatabaseNameEnum SQLSERVER = new DatabaseNameEnum("SQLServer");

        private static final Map<String, DatabaseNameEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, DatabaseNameEnum> createStaticFields() {
            Map<String, DatabaseNameEnum> map = new HashMap<>();
            map.put("MySQL", MYSQL);
            map.put("PostgreSQL", POSTGRESQL);
            map.put("SQLServer", SQLSERVER);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        DatabaseNameEnum(String value) {
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
        public static DatabaseNameEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new DatabaseNameEnum(value));
        }

        public static DatabaseNameEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof DatabaseNameEnum) {
                return this.value.equals(((DatabaseNameEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "database_name")

    private DatabaseNameEnum databaseName;

    public ListDatastoresRequest withXLanguage(String xLanguage) {
        this.xLanguage = xLanguage;
        return this;
    }

    /**
     * 语言
     * @return xLanguage
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Language")
    public String getXLanguage() {
        return xLanguage;
    }

    public void setXLanguage(String xLanguage) {
        this.xLanguage = xLanguage;
    }

    public ListDatastoresRequest withDatabaseName(DatabaseNameEnum databaseName) {
        this.databaseName = databaseName;
        return this;
    }

    /**
     * 数据库引擎。支持的引擎如下，不区分大小写： MySQL PostgreSQL SQLServer
     * @return databaseName
     */
    public DatabaseNameEnum getDatabaseName() {
        return databaseName;
    }

    public void setDatabaseName(DatabaseNameEnum databaseName) {
        this.databaseName = databaseName;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListDatastoresRequest that = (ListDatastoresRequest) obj;
        return Objects.equals(this.xLanguage, that.xLanguage) && Objects.equals(this.databaseName, that.databaseName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(xLanguage, databaseName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListDatastoresRequest {\n");
        sb.append("    xLanguage: ").append(toIndentedString(xLanguage)).append("\n");
        sb.append("    databaseName: ").append(toIndentedString(databaseName)).append("\n");
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
