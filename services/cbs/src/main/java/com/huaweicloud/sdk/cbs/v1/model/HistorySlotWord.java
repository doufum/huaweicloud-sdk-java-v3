package com.huaweicloud.sdk.cbs.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 
 */
public class HistorySlotWord {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "word")

    private String word;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "norm_word")

    private String normWord;

    public HistorySlotWord withWord(String word) {
        this.word = word;
        return this;
    }

    /**
     * 词
     * @return word
     */
    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public HistorySlotWord withNormWord(String normWord) {
        this.normWord = normWord;
        return this;
    }

    /**
     * 归一化后的词
     * @return normWord
     */
    public String getNormWord() {
        return normWord;
    }

    public void setNormWord(String normWord) {
        this.normWord = normWord;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        HistorySlotWord that = (HistorySlotWord) obj;
        return Objects.equals(this.word, that.word) && Objects.equals(this.normWord, that.normWord);
    }

    @Override
    public int hashCode() {
        return Objects.hash(word, normWord);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class HistorySlotWord {\n");
        sb.append("    word: ").append(toIndentedString(word)).append("\n");
        sb.append("    normWord: ").append(toIndentedString(normWord)).append("\n");
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
