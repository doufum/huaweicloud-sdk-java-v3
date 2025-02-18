package com.huaweicloud.sdk.eihealth.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 结合口袋，包含口袋中心位置和尺寸大小
 */
public class BoundingBoxDto {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "center")

    private List<Float> center = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "size")

    private List<Float> size = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "padding")

    private Integer padding;

    public BoundingBoxDto withCenter(List<Float> center) {
        this.center = center;
        return this;
    }

    public BoundingBoxDto addCenterItem(Float centerItem) {
        if (this.center == null) {
            this.center = new ArrayList<>();
        }
        this.center.add(centerItem);
        return this;
    }

    public BoundingBoxDto withCenter(Consumer<List<Float>> centerSetter) {
        if (this.center == null) {
            this.center = new ArrayList<>();
        }
        centerSetter.accept(this.center);
        return this;
    }

    /**
     * 口袋中心坐标； x, y, z轴的坐标
     * @return center
     */
    public List<Float> getCenter() {
        return center;
    }

    public void setCenter(List<Float> center) {
        this.center = center;
    }

    public BoundingBoxDto withSize(List<Float> size) {
        this.size = size;
        return this;
    }

    public BoundingBoxDto addSizeItem(Float sizeItem) {
        if (this.size == null) {
            this.size = new ArrayList<>();
        }
        this.size.add(sizeItem);
        return this;
    }

    public BoundingBoxDto withSize(Consumer<List<Float>> sizeSetter) {
        if (this.size == null) {
            this.size = new ArrayList<>();
        }
        sizeSetter.accept(this.size);
        return this;
    }

    /**
     * 口袋尺寸大小；  x, y, z轴的大小
     * @return size
     */
    public List<Float> getSize() {
        return size;
    }

    public void setSize(List<Float> size) {
        this.size = size;
    }

    public BoundingBoxDto withPadding(Integer padding) {
        this.padding = padding;
        return this;
    }

    /**
     * 填充
     * minimum: 0
     * maximum: 20
     * @return padding
     */
    public Integer getPadding() {
        return padding;
    }

    public void setPadding(Integer padding) {
        this.padding = padding;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BoundingBoxDto that = (BoundingBoxDto) obj;
        return Objects.equals(this.center, that.center) && Objects.equals(this.size, that.size)
            && Objects.equals(this.padding, that.padding);
    }

    @Override
    public int hashCode() {
        return Objects.hash(center, size, padding);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BoundingBoxDto {\n");
        sb.append("    center: ").append(toIndentedString(center)).append("\n");
        sb.append("    size: ").append(toIndentedString(size)).append("\n");
        sb.append("    padding: ").append(toIndentedString(padding)).append("\n");
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
