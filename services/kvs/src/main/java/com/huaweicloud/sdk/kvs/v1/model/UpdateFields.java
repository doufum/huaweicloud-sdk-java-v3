package com.huaweicloud.sdk.kvs.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import org.bson.Document;
import org.bson.codecs.pojo.annotations.BsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * UpdateFields
 */
public class UpdateFields {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "Set")
    @BsonProperty(value = "Set")

    private Document set;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "Add")
    @BsonProperty(value = "Add")

    private Document add;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "Rmv")
    @BsonProperty(value = "Rmv")

    private List<String> rmv = null;

    public UpdateFields withSet(Document set) {
        this.set = set;
        return this;
    }

    /**
     * Get set
     * @return set
     */
    public Document getSet() {
        return set;
    }

    public void setSet(Document set) {
        this.set = set;
    }

    public UpdateFields withAdd(Document add) {
        this.add = add;
        return this;
    }

    /**
     * Get add
     * @return add
     */
    public Document getAdd() {
        return add;
    }

    public void setAdd(Document add) {
        this.add = add;
    }

    public UpdateFields withRmv(List<String> rmv) {
        this.rmv = rmv;
        return this;
    }

    public UpdateFields addRmvItem(String rmvItem) {
        if (this.rmv == null) {
            this.rmv = new ArrayList<>();
        }
        this.rmv.add(rmvItem);
        return this;
    }

    public UpdateFields withRmv(Consumer<List<String>> rmvSetter) {
        if (this.rmv == null) {
            this.rmv = new ArrayList<>();
        }
        rmvSetter.accept(this.rmv);
        return this;
    }

    /**
     * Get rmv
     * @return rmv
     */
    public List<String> getRmv() {
        return rmv;
    }

    public void setRmv(List<String> rmv) {
        this.rmv = rmv;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateFields that = (UpdateFields) obj;
        return Objects.equals(this.set, that.set) && Objects.equals(this.add, that.add)
            && Objects.equals(this.rmv, that.rmv);
    }

    @Override
    public int hashCode() {
        return Objects.hash(set, add, rmv);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateFields {\n");
        sb.append("    set: ").append(toIndentedString(set)).append("\n");
        sb.append("    add: ").append(toIndentedString(add)).append("\n");
        sb.append("    rmv: ").append(toIndentedString(rmv)).append("\n");
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
