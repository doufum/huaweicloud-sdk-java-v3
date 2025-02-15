package com.huaweicloud.sdk.ocr.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * SmartDocumentRecognizerLayoutBlock
 */
public class SmartDocumentRecognizerLayoutBlock {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "location")

    private List<List<Integer>> location = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "text")

    private String text;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "words_ids")

    private List<Integer> wordsIds = null;

    public SmartDocumentRecognizerLayoutBlock withLocation(List<List<Integer>> location) {
        this.location = location;
        return this;
    }

    public SmartDocumentRecognizerLayoutBlock addLocationItem(List<Integer> locationItem) {
        if (this.location == null) {
            this.location = new ArrayList<>();
        }
        this.location.add(locationItem);
        return this;
    }

    public SmartDocumentRecognizerLayoutBlock withLocation(Consumer<List<List<Integer>>> locationSetter) {
        if (this.location == null) {
            this.location = new ArrayList<>();
        }
        locationSetter.accept(this.location);
        return this;
    }

    /**
     * 文字块的区域位置信息，列表形式，包含文字区域四个顶点的二维坐标（x,y）;坐标原点为图片左上角，x轴沿水平方向，y轴沿竖直方向。 
     * @return location
     */
    public List<List<Integer>> getLocation() {
        return location;
    }

    public void setLocation(List<List<Integer>> location) {
        this.location = location;
    }

    public SmartDocumentRecognizerLayoutBlock withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * 文档区域类别，包含text、table、figure等类别。        
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public SmartDocumentRecognizerLayoutBlock withText(String text) {
        this.text = text;
        return this;
    }

    /**
     * 文档区域文字内容。对于表格与图像，不返回其中的文字内容。 
     * @return text
     */
    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public SmartDocumentRecognizerLayoutBlock withWordsIds(List<Integer> wordsIds) {
        this.wordsIds = wordsIds;
        return this;
    }

    public SmartDocumentRecognizerLayoutBlock addWordsIdsItem(Integer wordsIdsItem) {
        if (this.wordsIds == null) {
            this.wordsIds = new ArrayList<>();
        }
        this.wordsIds.add(wordsIdsItem);
        return this;
    }

    public SmartDocumentRecognizerLayoutBlock withWordsIds(Consumer<List<Integer>> wordsIdsSetter) {
        if (this.wordsIds == null) {
            this.wordsIds = new ArrayList<>();
        }
        wordsIdsSetter.accept(this.wordsIds);
        return this;
    }

    /**
     * 文字识别结果索引列表，表示ocr_result的words_block_list中哪些文本框位于该文档区域内。 
     * @return wordsIds
     */
    public List<Integer> getWordsIds() {
        return wordsIds;
    }

    public void setWordsIds(List<Integer> wordsIds) {
        this.wordsIds = wordsIds;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SmartDocumentRecognizerLayoutBlock that = (SmartDocumentRecognizerLayoutBlock) obj;
        return Objects.equals(this.location, that.location) && Objects.equals(this.type, that.type)
            && Objects.equals(this.text, that.text) && Objects.equals(this.wordsIds, that.wordsIds);
    }

    @Override
    public int hashCode() {
        return Objects.hash(location, type, text, wordsIds);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SmartDocumentRecognizerLayoutBlock {\n");
        sb.append("    location: ").append(toIndentedString(location)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    text: ").append(toIndentedString(text)).append("\n");
        sb.append("    wordsIds: ").append(toIndentedString(wordsIds)).append("\n");
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
