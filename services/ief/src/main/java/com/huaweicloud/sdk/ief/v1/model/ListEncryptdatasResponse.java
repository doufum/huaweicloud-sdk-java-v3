package com.huaweicloud.sdk.ief.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ListEncryptdatasResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "encrypt_datas")

    private List<EncryptData> encryptDatas = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "count")

    private Integer count;

    public ListEncryptdatasResponse withEncryptDatas(List<EncryptData> encryptDatas) {
        this.encryptDatas = encryptDatas;
        return this;
    }

    public ListEncryptdatasResponse addEncryptDatasItem(EncryptData encryptDatasItem) {
        if (this.encryptDatas == null) {
            this.encryptDatas = new ArrayList<>();
        }
        this.encryptDatas.add(encryptDatasItem);
        return this;
    }

    public ListEncryptdatasResponse withEncryptDatas(Consumer<List<EncryptData>> encryptDatasSetter) {
        if (this.encryptDatas == null) {
            this.encryptDatas = new ArrayList<>();
        }
        encryptDatasSetter.accept(this.encryptDatas);
        return this;
    }

    /**
     * 加密数据列表详情
     * @return encryptDatas
     */
    public List<EncryptData> getEncryptDatas() {
        return encryptDatas;
    }

    public void setEncryptDatas(List<EncryptData> encryptDatas) {
        this.encryptDatas = encryptDatas;
    }

    public ListEncryptdatasResponse withCount(Integer count) {
        this.count = count;
        return this;
    }

    /**
     * 加密数据总数
     * @return count
     */
    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListEncryptdatasResponse that = (ListEncryptdatasResponse) obj;
        return Objects.equals(this.encryptDatas, that.encryptDatas) && Objects.equals(this.count, that.count);
    }

    @Override
    public int hashCode() {
        return Objects.hash(encryptDatas, count);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListEncryptdatasResponse {\n");
        sb.append("    encryptDatas: ").append(toIndentedString(encryptDatas)).append("\n");
        sb.append("    count: ").append(toIndentedString(count)).append("\n");
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
