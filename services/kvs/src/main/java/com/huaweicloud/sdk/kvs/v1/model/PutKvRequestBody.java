package com.huaweicloud.sdk.kvs.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import org.bson.Document;
import org.bson.codecs.pojo.annotations.BsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * PutKvRequestBody
 */
public class PutKvRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "TableName")
    @BsonProperty(value = "TableName")

    private String tableName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ConditionExpression")
    @BsonProperty(value = "ConditionExpression")

    private ConditionExpression conditionExpression;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "KvDoc")
    @BsonProperty(value = "KvDoc")

    private Document kvDoc;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "KvBlob")
    @BsonProperty(value = "KvBlob")

    private KvBlob kvBlob;

    public PutKvRequestBody withTableName(String tableName) {
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

    public PutKvRequestBody withConditionExpression(ConditionExpression conditionExpression) {
        this.conditionExpression = conditionExpression;
        return this;
    }

    public PutKvRequestBody withConditionExpression(Consumer<ConditionExpression> conditionExpressionSetter) {
        if (this.conditionExpression == null) {
            this.conditionExpression = new ConditionExpression();
            conditionExpressionSetter.accept(this.conditionExpression);
        }

        return this;
    }

    /**
     * Get conditionExpression
     * @return conditionExpression
     */
    public ConditionExpression getConditionExpression() {
        return conditionExpression;
    }

    public void setConditionExpression(ConditionExpression conditionExpression) {
        this.conditionExpression = conditionExpression;
    }

    public PutKvRequestBody withKvDoc(Document kvDoc) {
        this.kvDoc = kvDoc;
        return this;
    }

    /**
     * Get kvDoc
     * @return kvDoc
     */
    public Document getKvDoc() {
        return kvDoc;
    }

    public void setKvDoc(Document kvDoc) {
        this.kvDoc = kvDoc;
    }

    public PutKvRequestBody withKvBlob(KvBlob kvBlob) {
        this.kvBlob = kvBlob;
        return this;
    }

    public PutKvRequestBody withKvBlob(Consumer<KvBlob> kvBlobSetter) {
        if (this.kvBlob == null) {
            this.kvBlob = new KvBlob();
            kvBlobSetter.accept(this.kvBlob);
        }

        return this;
    }

    /**
     * Get kvBlob
     * @return kvBlob
     */
    public KvBlob getKvBlob() {
        return kvBlob;
    }

    public void setKvBlob(KvBlob kvBlob) {
        this.kvBlob = kvBlob;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PutKvRequestBody that = (PutKvRequestBody) obj;
        return Objects.equals(this.tableName, that.tableName)
            && Objects.equals(this.conditionExpression, that.conditionExpression)
            && Objects.equals(this.kvDoc, that.kvDoc) && Objects.equals(this.kvBlob, that.kvBlob);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tableName, conditionExpression, kvDoc, kvBlob);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PutKvRequestBody {\n");
        sb.append("    tableName: ").append(toIndentedString(tableName)).append("\n");
        sb.append("    conditionExpression: ").append(toIndentedString(conditionExpression)).append("\n");
        sb.append("    kvDoc: ").append(toIndentedString(kvDoc)).append("\n");
        sb.append("    kvBlob: ").append(toIndentedString(kvBlob)).append("\n");
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
