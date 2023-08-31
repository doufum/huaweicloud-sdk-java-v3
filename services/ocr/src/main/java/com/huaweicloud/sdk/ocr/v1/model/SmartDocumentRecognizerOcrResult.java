package com.huaweicloud.sdk.ocr.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * SmartDocumentRecognizerOcrResult
 */
public class SmartDocumentRecognizerOcrResult {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "direction")

    private Float direction;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "words_block_count")

    private Integer wordsBlockCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "words_block_list")

    private List<SmartDocumentRecognizerWordsBlockList> wordsBlockList = null;

    public SmartDocumentRecognizerOcrResult withDirection(Float direction) {
        this.direction = direction;
        return this;
    }

    /**
     * 图片朝向 
     * @return direction
     */
    public Float getDirection() {
        return direction;
    }

    public void setDirection(Float direction) {
        this.direction = direction;
    }

    public SmartDocumentRecognizerOcrResult withWordsBlockCount(Integer wordsBlockCount) {
        this.wordsBlockCount = wordsBlockCount;
        return this;
    }

    /**
     * 识别文字块数目。 
     * @return wordsBlockCount
     */
    public Integer getWordsBlockCount() {
        return wordsBlockCount;
    }

    public void setWordsBlockCount(Integer wordsBlockCount) {
        this.wordsBlockCount = wordsBlockCount;
    }

    public SmartDocumentRecognizerOcrResult withWordsBlockList(
        List<SmartDocumentRecognizerWordsBlockList> wordsBlockList) {
        this.wordsBlockList = wordsBlockList;
        return this;
    }

    public SmartDocumentRecognizerOcrResult addWordsBlockListItem(
        SmartDocumentRecognizerWordsBlockList wordsBlockListItem) {
        if (this.wordsBlockList == null) {
            this.wordsBlockList = new ArrayList<>();
        }
        this.wordsBlockList.add(wordsBlockListItem);
        return this;
    }

    public SmartDocumentRecognizerOcrResult withWordsBlockList(
        Consumer<List<SmartDocumentRecognizerWordsBlockList>> wordsBlockListSetter) {
        if (this.wordsBlockList == null) {
            this.wordsBlockList = new ArrayList<>();
        }
        wordsBlockListSetter.accept(this.wordsBlockList);
        return this;
    }

    /**
     * 识别文字块列表，输出顺序从左到右，先上后下。 
     * @return wordsBlockList
     */
    public List<SmartDocumentRecognizerWordsBlockList> getWordsBlockList() {
        return wordsBlockList;
    }

    public void setWordsBlockList(List<SmartDocumentRecognizerWordsBlockList> wordsBlockList) {
        this.wordsBlockList = wordsBlockList;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SmartDocumentRecognizerOcrResult that = (SmartDocumentRecognizerOcrResult) obj;
        return Objects.equals(this.direction, that.direction)
            && Objects.equals(this.wordsBlockCount, that.wordsBlockCount)
            && Objects.equals(this.wordsBlockList, that.wordsBlockList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(direction, wordsBlockCount, wordsBlockList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SmartDocumentRecognizerOcrResult {\n");
        sb.append("    direction: ").append(toIndentedString(direction)).append("\n");
        sb.append("    wordsBlockCount: ").append(toIndentedString(wordsBlockCount)).append("\n");
        sb.append("    wordsBlockList: ").append(toIndentedString(wordsBlockList)).append("\n");
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
