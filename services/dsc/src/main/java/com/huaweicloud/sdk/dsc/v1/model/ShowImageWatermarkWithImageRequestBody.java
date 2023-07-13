package com.huaweicloud.sdk.dsc.v1.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.http.FormDataFilePart;
import com.huaweicloud.sdk.core.http.FormDataPart;
import com.huaweicloud.sdk.core.http.SdkFormDataBody;

import java.io.InputStream;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;

/**
 * ShowImageWatermarkWithImageRequestBody
 */
public class ShowImageWatermarkWithImageRequestBody implements SdkFormDataBody {

    @JsonProperty(value = "file", access = JsonProperty.Access.WRITE_ONLY)

    private FormDataFilePart file;

    public ShowImageWatermarkWithImageRequestBody withFile(FormDataFilePart file) {
        this.file = file;
        return this;
    }

    /**
     * 待提取暗水印的图片文件。
     * @return file
     */
    public FormDataFilePart getFile() {
        return file;
    }

    public void setFile(FormDataFilePart file) {
        this.file = file;
    }

    public ShowImageWatermarkWithImageRequestBody withFile(InputStream inputStream, String fileName,
        String contentType) {
        this.file = new FormDataFilePart(inputStream, fileName).withContentType(contentType);
        return this;
    }

    public ShowImageWatermarkWithImageRequestBody withFile(InputStream inputStream, String fileName) {
        this.file = new FormDataFilePart(inputStream, fileName);
        return this;
    }

    public ShowImageWatermarkWithImageRequestBody withFile(InputStream inputStream, String fileName,
        Map<String, String> headers) {
        this.file = new FormDataFilePart(inputStream, fileName).withHeaders(headers);
        return this;
    }

    @Override
    public Map<String, FormDataPart<?>> buildFormData() {
        return new LinkedHashMap<String, FormDataPart<?>>() {

            private static final long serialVersionUID = 1L;
            {
                put("file", file);
            }
        };
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowImageWatermarkWithImageRequestBody that = (ShowImageWatermarkWithImageRequestBody) obj;
        return Objects.equals(this.file, that.file);
    }

    @Override
    public int hashCode() {
        return Objects.hash(file);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowImageWatermarkWithImageRequestBody {\n");
        sb.append("    file: ").append(toIndentedString("[resource:will-not-print]")).append("\n");
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
