package com.huaweicloud.sdk.kvs.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import org.bson.Document;
import org.bson.codecs.pojo.annotations.BsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * RenameKvRequestBody
 */
public class RenameKvRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "TableName")
    @BsonProperty(value = "TableName")

    private String tableName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "PrimaryKey")
    @BsonProperty(value = "PrimaryKey")

    private Document primaryKey;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "NewSortKey")
    @BsonProperty(value = "NewSortKey")

    private Document newSortKey;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "KvOptions")
    @BsonProperty(value = "KvOptions")

    private KvOptions kvOptions;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "UpdateBlobAttr")
    @BsonProperty(value = "UpdateBlobAttr")

    private UpdateBlobAttr updateBlobAttr;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ReturnBlobAttr")
    @BsonProperty(value = "ReturnBlobAttr")

    private ReturnBlobAttr returnBlobAttr;

    public RenameKvRequestBody withTableName(String tableName) {
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

    public RenameKvRequestBody withPrimaryKey(Document primaryKey) {
        this.primaryKey = primaryKey;
        return this;
    }

    /**
     * Get primaryKey
     * @return primaryKey
     */
    public Document getPrimaryKey() {
        return primaryKey;
    }

    public void setPrimaryKey(Document primaryKey) {
        this.primaryKey = primaryKey;
    }

    public RenameKvRequestBody withNewSortKey(Document newSortKey) {
        this.newSortKey = newSortKey;
        return this;
    }

    /**
     * Get newSortKey
     * @return newSortKey
     */
    public Document getNewSortKey() {
        return newSortKey;
    }

    public void setNewSortKey(Document newSortKey) {
        this.newSortKey = newSortKey;
    }

    public RenameKvRequestBody withKvOptions(KvOptions kvOptions) {
        this.kvOptions = kvOptions;
        return this;
    }

    public RenameKvRequestBody withKvOptions(Consumer<KvOptions> kvOptionsSetter) {
        if (this.kvOptions == null) {
            this.kvOptions = new KvOptions();
            kvOptionsSetter.accept(this.kvOptions);
        }

        return this;
    }

    /**
     * Get kvOptions
     * @return kvOptions
     */
    public KvOptions getKvOptions() {
        return kvOptions;
    }

    public void setKvOptions(KvOptions kvOptions) {
        this.kvOptions = kvOptions;
    }

    public RenameKvRequestBody withUpdateBlobAttr(UpdateBlobAttr updateBlobAttr) {
        this.updateBlobAttr = updateBlobAttr;
        return this;
    }

    public RenameKvRequestBody withUpdateBlobAttr(Consumer<UpdateBlobAttr> updateBlobAttrSetter) {
        if (this.updateBlobAttr == null) {
            this.updateBlobAttr = new UpdateBlobAttr();
            updateBlobAttrSetter.accept(this.updateBlobAttr);
        }

        return this;
    }

    /**
     * Get updateBlobAttr
     * @return updateBlobAttr
     */
    public UpdateBlobAttr getUpdateBlobAttr() {
        return updateBlobAttr;
    }

    public void setUpdateBlobAttr(UpdateBlobAttr updateBlobAttr) {
        this.updateBlobAttr = updateBlobAttr;
    }

    public RenameKvRequestBody withReturnBlobAttr(ReturnBlobAttr returnBlobAttr) {
        this.returnBlobAttr = returnBlobAttr;
        return this;
    }

    public RenameKvRequestBody withReturnBlobAttr(Consumer<ReturnBlobAttr> returnBlobAttrSetter) {
        if (this.returnBlobAttr == null) {
            this.returnBlobAttr = new ReturnBlobAttr();
            returnBlobAttrSetter.accept(this.returnBlobAttr);
        }

        return this;
    }

    /**
     * Get returnBlobAttr
     * @return returnBlobAttr
     */
    public ReturnBlobAttr getReturnBlobAttr() {
        return returnBlobAttr;
    }

    public void setReturnBlobAttr(ReturnBlobAttr returnBlobAttr) {
        this.returnBlobAttr = returnBlobAttr;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RenameKvRequestBody that = (RenameKvRequestBody) obj;
        return Objects.equals(this.tableName, that.tableName) && Objects.equals(this.primaryKey, that.primaryKey)
            && Objects.equals(this.newSortKey, that.newSortKey) && Objects.equals(this.kvOptions, that.kvOptions)
            && Objects.equals(this.updateBlobAttr, that.updateBlobAttr)
            && Objects.equals(this.returnBlobAttr, that.returnBlobAttr);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tableName, primaryKey, newSortKey, kvOptions, updateBlobAttr, returnBlobAttr);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RenameKvRequestBody {\n");
        sb.append("    tableName: ").append(toIndentedString(tableName)).append("\n");
        sb.append("    primaryKey: ").append(toIndentedString(primaryKey)).append("\n");
        sb.append("    newSortKey: ").append(toIndentedString(newSortKey)).append("\n");
        sb.append("    kvOptions: ").append(toIndentedString(kvOptions)).append("\n");
        sb.append("    updateBlobAttr: ").append(toIndentedString(updateBlobAttr)).append("\n");
        sb.append("    returnBlobAttr: ").append(toIndentedString(returnBlobAttr)).append("\n");
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
