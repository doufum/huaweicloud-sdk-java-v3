package com.huaweicloud.sdk.nlp.v2.model;





import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class RunTextTranslationResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="src_text")
    
    
    private String srcText;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="translated_text")
    
    
    private String translatedText;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="error_code")
    
    
    private String errorCode;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="error_msg")
    
    
    private String errorMsg;

    public RunTextTranslationResponse withSrcText(String srcText) {
        this.srcText = srcText;
        return this;
    }

    


    /**
     * 翻译原文，编码格式为UTF-8。调用失败时无此字段。
     * @return srcText
     */
    public String getSrcText() {
        return srcText;
    }

    public void setSrcText(String srcText) {
        this.srcText = srcText;
    }

    

    public RunTextTranslationResponse withTranslatedText(String translatedText) {
        this.translatedText = translatedText;
        return this;
    }

    


    /**
     * 翻译译文，编码格式为UTF-8。调用失败时无此字段。
     * @return translatedText
     */
    public String getTranslatedText() {
        return translatedText;
    }

    public void setTranslatedText(String translatedText) {
        this.translatedText = translatedText;
    }

    

    public RunTextTranslationResponse withErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }

    


    /**
     * 调用失败时的错误码，具体请参见错误码。调用成功时无此字段。
     * @return errorCode
     */
    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    

    public RunTextTranslationResponse withErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }

    


    /**
     * 调用失败时的错误信息。调用成功时无此字段。
     * @return errorMsg
     */
    public String getErrorMsg() {
        return errorMsg;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RunTextTranslationResponse runTextTranslationResponse = (RunTextTranslationResponse) o;
        return Objects.equals(this.srcText, runTextTranslationResponse.srcText) &&
            Objects.equals(this.translatedText, runTextTranslationResponse.translatedText) &&
            Objects.equals(this.errorCode, runTextTranslationResponse.errorCode) &&
            Objects.equals(this.errorMsg, runTextTranslationResponse.errorMsg);
    }
    @Override
    public int hashCode() {
        return Objects.hash(srcText, translatedText, errorCode, errorMsg);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RunTextTranslationResponse {\n");
        sb.append("    srcText: ").append(toIndentedString(srcText)).append("\n");
        sb.append("    translatedText: ").append(toIndentedString(translatedText)).append("\n");
        sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
        sb.append("    errorMsg: ").append(toIndentedString(errorMsg)).append("\n");
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

