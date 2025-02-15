package com.huaweicloud.sdk.kvs.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import org.bson.codecs.pojo.annotations.BsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * TableOperIds
 */
public class TableOperIds {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "TableName")
    @BsonProperty(value = "TableName")

    private String tableName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "KvOperIds")
    @BsonProperty(value = "KvOperIds")

    private KvOperIds kvOperIds;

    public TableOperIds withTableName(String tableName) {
        this.tableName = tableName;
        return this;
    }

    /**
     * Get tableName
     * @return tableName
     */
    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    public TableOperIds withKvOperIds(KvOperIds kvOperIds) {
        this.kvOperIds = kvOperIds;
        return this;
    }

    public TableOperIds withKvOperIds(Consumer<KvOperIds> kvOperIdsSetter) {
        if (this.kvOperIds == null) {
            this.kvOperIds = new KvOperIds();
            kvOperIdsSetter.accept(this.kvOperIds);
        }

        return this;
    }

    /**
     * Get kvOperIds
     * @return kvOperIds
     */
    public KvOperIds getKvOperIds() {
        return kvOperIds;
    }

    public void setKvOperIds(KvOperIds kvOperIds) {
        this.kvOperIds = kvOperIds;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        TableOperIds that = (TableOperIds) obj;
        return Objects.equals(this.tableName, that.tableName) && Objects.equals(this.kvOperIds, that.kvOperIds);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tableName, kvOperIds);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TableOperIds {\n");
        sb.append("    tableName: ").append(toIndentedString(tableName)).append("\n");
        sb.append("    kvOperIds: ").append(toIndentedString(kvOperIds)).append("\n");
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
