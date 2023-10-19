package com.huaweicloud.sdk.frs.v2.model;

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
public class AddFacesByUrlResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "face_set_id")

    private String faceSetId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "face_set_name")

    private String faceSetName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "faces")

    private List<FaceSetFace> faces = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Request-Id")

    private String xRequestId;

    public AddFacesByUrlResponse withFaceSetId(String faceSetId) {
        this.faceSetId = faceSetId;
        return this;
    }

    /**
     * 人脸库ID。 调用失败时无此字段。
     * @return faceSetId
     */
    public String getFaceSetId() {
        return faceSetId;
    }

    public void setFaceSetId(String faceSetId) {
        this.faceSetId = faceSetId;
    }

    public AddFacesByUrlResponse withFaceSetName(String faceSetName) {
        this.faceSetName = faceSetName;
        return this;
    }

    /**
     * 人脸库名称。 调用失败时无此字段。
     * @return faceSetName
     */
    public String getFaceSetName() {
        return faceSetName;
    }

    public void setFaceSetName(String faceSetName) {
        this.faceSetName = faceSetName;
    }

    public AddFacesByUrlResponse withFaces(List<FaceSetFace> faces) {
        this.faces = faces;
        return this;
    }

    public AddFacesByUrlResponse addFacesItem(FaceSetFace facesItem) {
        if (this.faces == null) {
            this.faces = new ArrayList<>();
        }
        this.faces.add(facesItem);
        return this;
    }

    public AddFacesByUrlResponse withFaces(Consumer<List<FaceSetFace>> facesSetter) {
        if (this.faces == null) {
            this.faces = new ArrayList<>();
        }
        facesSetter.accept(this.faces);
        return this;
    }

    /**
     * [人脸库当中的人脸结构，详见[FaceSetFace](https://support.huaweicloud.com/api-face/face_02_0018.html)。调用失败时无此字段。](tag:hc) [人脸库当中的人脸结构，详见[FaceSetFace](https://support.huaweicloud.com/intl/zh-cn/api-face/face_02_0018.html)。调用失败时无此字段。](tag:hk)
     * @return faces
     */
    public List<FaceSetFace> getFaces() {
        return faces;
    }

    public void setFaces(List<FaceSetFace> faces) {
        this.faces = faces;
    }

    public AddFacesByUrlResponse withXRequestId(String xRequestId) {
        this.xRequestId = xRequestId;
        return this;
    }

    /**
     * Get xRequestId
     * @return xRequestId
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Request-Id")
    public String getXRequestId() {
        return xRequestId;
    }

    public void setXRequestId(String xRequestId) {
        this.xRequestId = xRequestId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AddFacesByUrlResponse that = (AddFacesByUrlResponse) obj;
        return Objects.equals(this.faceSetId, that.faceSetId) && Objects.equals(this.faceSetName, that.faceSetName)
            && Objects.equals(this.faces, that.faces) && Objects.equals(this.xRequestId, that.xRequestId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(faceSetId, faceSetName, faces, xRequestId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AddFacesByUrlResponse {\n");
        sb.append("    faceSetId: ").append(toIndentedString(faceSetId)).append("\n");
        sb.append("    faceSetName: ").append(toIndentedString(faceSetName)).append("\n");
        sb.append("    faces: ").append(toIndentedString(faces)).append("\n");
        sb.append("    xRequestId: ").append(toIndentedString(xRequestId)).append("\n");
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
