package com.huaweicloud.sdk.kvs.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import org.bson.codecs.pojo.annotations.BsonProperty;

import java.util.Objects;

/**
 * SingleKvExpr
 */
public class SingleKvExpr {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "Func")
    @BsonProperty(value = "Func")

    private String func;

    public SingleKvExpr withFunc(String func) {
        this.func = func;
        return this;
    }

    /**
     * Get func
     * @return func
     */
    public String getFunc() {
        return func;
    }

    public void setFunc(String func) {
        this.func = func;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SingleKvExpr that = (SingleKvExpr) obj;
        return Objects.equals(this.func, that.func);
    }

    @Override
    public int hashCode() {
        return Objects.hash(func);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SingleKvExpr {\n");
        sb.append("    func: ").append(toIndentedString(func)).append("\n");
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
