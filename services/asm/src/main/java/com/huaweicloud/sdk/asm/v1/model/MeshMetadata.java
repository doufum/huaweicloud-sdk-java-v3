package com.huaweicloud.sdk.asm.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * MeshMetadata
 */
public class MeshMetadata {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "uid")

    private String uid;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "annotations")

    private Map<String, String> annotations = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "labels")

    private Map<String, String> labels = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "createTimestamp")

    private OffsetDateTime createTimestamp;

    public MeshMetadata withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 网格名称。 命名规则：以小写字母开头，由小写字母、数字、中划线(-)组成，长度范围4-64位，且不能以中划线(-)结尾。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public MeshMetadata withUid(String uid) {
        this.uid = uid;
        return this;
    }

    /**
     * 网格ID，资源唯一标识，创建成功后自动生成，填写无效
     * @return uid
     */
    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public MeshMetadata withAnnotations(Map<String, String> annotations) {
        this.annotations = annotations;
        return this;
    }

    public MeshMetadata putAnnotationsItem(String key, String annotationsItem) {
        if (this.annotations == null) {
            this.annotations = new HashMap<>();
        }
        this.annotations.put(key, annotationsItem);
        return this;
    }

    public MeshMetadata withAnnotations(Consumer<Map<String, String>> annotationsSetter) {
        if (this.annotations == null) {
            this.annotations = new HashMap<>();
        }
        annotationsSetter.accept(this.annotations);
        return this;
    }

    /**
     * 网格注解，由key/value组成： ``` \"annotations\": {    \"key1\" : \"value1\",    \"key2\" : \"value2\" } ```
     * @return annotations
     */
    public Map<String, String> getAnnotations() {
        return annotations;
    }

    public void setAnnotations(Map<String, String> annotations) {
        this.annotations = annotations;
    }

    public MeshMetadata withLabels(Map<String, String> labels) {
        this.labels = labels;
        return this;
    }

    public MeshMetadata putLabelsItem(String key, String labelsItem) {
        if (this.labels == null) {
            this.labels = new HashMap<>();
        }
        this.labels.put(key, labelsItem);
        return this;
    }

    public MeshMetadata withLabels(Consumer<Map<String, String>> labelsSetter) {
        if (this.labels == null) {
            this.labels = new HashMap<>();
        }
        labelsSetter.accept(this.labels);
        return this;
    }

    /**
     * 网格标签，由key/value组成：   ```  \"annotations\": {    \"key1\" : \"value1\",    \"key2\" : \"value2\" }  ```
     * @return labels
     */
    public Map<String, String> getLabels() {
        return labels;
    }

    public void setLabels(Map<String, String> labels) {
        this.labels = labels;
    }

    public MeshMetadata withCreateTimestamp(OffsetDateTime createTimestamp) {
        this.createTimestamp = createTimestamp;
        return this;
    }

    /**
     * 网格创建时间
     * @return createTimestamp
     */
    public OffsetDateTime getCreateTimestamp() {
        return createTimestamp;
    }

    public void setCreateTimestamp(OffsetDateTime createTimestamp) {
        this.createTimestamp = createTimestamp;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        MeshMetadata that = (MeshMetadata) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.uid, that.uid)
            && Objects.equals(this.annotations, that.annotations) && Objects.equals(this.labels, that.labels)
            && Objects.equals(this.createTimestamp, that.createTimestamp);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, uid, annotations, labels, createTimestamp);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MeshMetadata {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    uid: ").append(toIndentedString(uid)).append("\n");
        sb.append("    annotations: ").append(toIndentedString(annotations)).append("\n");
        sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
        sb.append("    createTimestamp: ").append(toIndentedString(createTimestamp)).append("\n");
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
