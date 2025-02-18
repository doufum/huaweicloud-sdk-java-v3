package com.huaweicloud.sdk.rabbitmq.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * ShowInstanceExtendProductInfoRespMonthly
 */
public class ShowInstanceExtendProductInfoRespMonthly {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "version")

    private String version;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "values")

    private List<ListProductsRespValues> values = null;

    public ShowInstanceExtendProductInfoRespMonthly withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 消息引擎的名称，该字段显示为rabbitmq。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ShowInstanceExtendProductInfoRespMonthly withVersion(String version) {
        this.version = version;
        return this;
    }

    /**
     * 消息引擎的版本，当前支持3.8.35[和3.7.17](tag:cmcc,sbc,hk_sbc,g42,hk_g42,tm,hk_tm)
     * @return version
     */
    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public ShowInstanceExtendProductInfoRespMonthly withValues(List<ListProductsRespValues> values) {
        this.values = values;
        return this;
    }

    public ShowInstanceExtendProductInfoRespMonthly addValuesItem(ListProductsRespValues valuesItem) {
        if (this.values == null) {
            this.values = new ArrayList<>();
        }
        this.values.add(valuesItem);
        return this;
    }

    public ShowInstanceExtendProductInfoRespMonthly withValues(Consumer<List<ListProductsRespValues>> valuesSetter) {
        if (this.values == null) {
            this.values = new ArrayList<>();
        }
        valuesSetter.accept(this.values);
        return this;
    }

    /**
     * 产品规格列表。
     * @return values
     */
    public List<ListProductsRespValues> getValues() {
        return values;
    }

    public void setValues(List<ListProductsRespValues> values) {
        this.values = values;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowInstanceExtendProductInfoRespMonthly that = (ShowInstanceExtendProductInfoRespMonthly) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.version, that.version)
            && Objects.equals(this.values, that.values);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, version, values);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowInstanceExtendProductInfoRespMonthly {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
        sb.append("    values: ").append(toIndentedString(values)).append("\n");
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
