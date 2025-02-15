package com.huaweicloud.sdk.metastudio.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class UpdateDigitalAssetResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "asset_id")

    private String assetId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "asset_name")

    private String assetName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "asset_description")

    private String assetDescription;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private String createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_time")

    private String updateTime;

    /**
     * 资产类型。 * HUMAN_MODEL：数字人模型 * VOICE_MODEL：音色模型 * SCENE：场景模型 * ANIMATION：动作动画 * VIDEO：视频文件 * IMAGE：图片文件 * PPT：幻灯片文件 * MATERIAL：风格化素材 * NORMAL_MODEL: 普通模型 * COMMON_FILE：通用文件 * HUMAN_MODEL_2D:2D数字人网络模型 * BUSINESS_CARD_TEMPLET: 数字人名片模板 * MUSIC: 音乐
     */
    public static final class AssetTypeEnum {

        /**
         * Enum HUMAN_MODEL for value: "HUMAN_MODEL"
         */
        public static final AssetTypeEnum HUMAN_MODEL = new AssetTypeEnum("HUMAN_MODEL");

        /**
         * Enum VOICE_MODEL for value: "VOICE_MODEL"
         */
        public static final AssetTypeEnum VOICE_MODEL = new AssetTypeEnum("VOICE_MODEL");

        /**
         * Enum SCENE for value: "SCENE"
         */
        public static final AssetTypeEnum SCENE = new AssetTypeEnum("SCENE");

        /**
         * Enum ANIMATION for value: "ANIMATION"
         */
        public static final AssetTypeEnum ANIMATION = new AssetTypeEnum("ANIMATION");

        /**
         * Enum VIDEO for value: "VIDEO"
         */
        public static final AssetTypeEnum VIDEO = new AssetTypeEnum("VIDEO");

        /**
         * Enum IMAGE for value: "IMAGE"
         */
        public static final AssetTypeEnum IMAGE = new AssetTypeEnum("IMAGE");

        /**
         * Enum PPT for value: "PPT"
         */
        public static final AssetTypeEnum PPT = new AssetTypeEnum("PPT");

        /**
         * Enum MATERIAL for value: "MATERIAL"
         */
        public static final AssetTypeEnum MATERIAL = new AssetTypeEnum("MATERIAL");

        /**
         * Enum NORMAL_MODEL for value: "NORMAL_MODEL"
         */
        public static final AssetTypeEnum NORMAL_MODEL = new AssetTypeEnum("NORMAL_MODEL");

        /**
         * Enum COMMON_FILE for value: "COMMON_FILE"
         */
        public static final AssetTypeEnum COMMON_FILE = new AssetTypeEnum("COMMON_FILE");

        /**
         * Enum HUMAN_MODEL_2D for value: "HUMAN_MODEL_2D"
         */
        public static final AssetTypeEnum HUMAN_MODEL_2D = new AssetTypeEnum("HUMAN_MODEL_2D");

        /**
         * Enum BUSINESS_CARD_TEMPLET for value: "BUSINESS_CARD_TEMPLET"
         */
        public static final AssetTypeEnum BUSINESS_CARD_TEMPLET = new AssetTypeEnum("BUSINESS_CARD_TEMPLET");

        /**
         * Enum MUSIC for value: "MUSIC"
         */
        public static final AssetTypeEnum MUSIC = new AssetTypeEnum("MUSIC");

        private static final Map<String, AssetTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, AssetTypeEnum> createStaticFields() {
            Map<String, AssetTypeEnum> map = new HashMap<>();
            map.put("HUMAN_MODEL", HUMAN_MODEL);
            map.put("VOICE_MODEL", VOICE_MODEL);
            map.put("SCENE", SCENE);
            map.put("ANIMATION", ANIMATION);
            map.put("VIDEO", VIDEO);
            map.put("IMAGE", IMAGE);
            map.put("PPT", PPT);
            map.put("MATERIAL", MATERIAL);
            map.put("NORMAL_MODEL", NORMAL_MODEL);
            map.put("COMMON_FILE", COMMON_FILE);
            map.put("HUMAN_MODEL_2D", HUMAN_MODEL_2D);
            map.put("BUSINESS_CARD_TEMPLET", BUSINESS_CARD_TEMPLET);
            map.put("MUSIC", MUSIC);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        AssetTypeEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static AssetTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new AssetTypeEnum(value));
        }

        public static AssetTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof AssetTypeEnum) {
                return this.value.equals(((AssetTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "asset_type")

    private AssetTypeEnum assetType;

    /**
     * 资产状态。 * CREATING：资产创建中，主文件尚未上传 * FAILED：主文件上传失败 * UNACTIVED：主文件上传成功，资产未激活，资产不可用于其他业务（用户可更新状态） * ACTIVED：主文件上传成功，资产激活，资产可用于其他业务（用户可更新状态） * DELETING：资产删除中，资产不可用，资产可恢复 * DELETED：资产文件已删除，资产不可用，资产不可恢复 * BLOCK: 资产被冻结，资产不可用，不可查看文件。
     */
    public static final class AssetStateEnum {

        /**
         * Enum CREATING for value: "CREATING"
         */
        public static final AssetStateEnum CREATING = new AssetStateEnum("CREATING");

        /**
         * Enum FAILED for value: "FAILED"
         */
        public static final AssetStateEnum FAILED = new AssetStateEnum("FAILED");

        /**
         * Enum UNACTIVED for value: "UNACTIVED"
         */
        public static final AssetStateEnum UNACTIVED = new AssetStateEnum("UNACTIVED");

        /**
         * Enum ACTIVED for value: "ACTIVED"
         */
        public static final AssetStateEnum ACTIVED = new AssetStateEnum("ACTIVED");

        /**
         * Enum DELETING for value: "DELETING"
         */
        public static final AssetStateEnum DELETING = new AssetStateEnum("DELETING");

        /**
         * Enum DELETED for value: "DELETED"
         */
        public static final AssetStateEnum DELETED = new AssetStateEnum("DELETED");

        /**
         * Enum BLOCK for value: "BLOCK"
         */
        public static final AssetStateEnum BLOCK = new AssetStateEnum("BLOCK");

        private static final Map<String, AssetStateEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, AssetStateEnum> createStaticFields() {
            Map<String, AssetStateEnum> map = new HashMap<>();
            map.put("CREATING", CREATING);
            map.put("FAILED", FAILED);
            map.put("UNACTIVED", UNACTIVED);
            map.put("ACTIVED", ACTIVED);
            map.put("DELETING", DELETING);
            map.put("DELETED", DELETED);
            map.put("BLOCK", BLOCK);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        AssetStateEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static AssetStateEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new AssetStateEnum(value));
        }

        public static AssetStateEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof AssetStateEnum) {
                return this.value.equals(((AssetStateEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "asset_state")

    private AssetStateEnum assetState;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tags")

    private List<String> tags = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "asset_extra_meta")

    private AssetExtraMeta assetExtraMeta;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "system_properties")

    private List<SystemProperty> systemProperties = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "files")

    private List<AssetFileInfo> files = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Request-Id")

    private String xRequestId;

    public UpdateDigitalAssetResponse withAssetId(String assetId) {
        this.assetId = assetId;
        return this;
    }

    /**
     * 资产ID。
     * @return assetId
     */
    public String getAssetId() {
        return assetId;
    }

    public void setAssetId(String assetId) {
        this.assetId = assetId;
    }

    public UpdateDigitalAssetResponse withAssetName(String assetName) {
        this.assetName = assetName;
        return this;
    }

    /**
     * 资产名称。
     * @return assetName
     */
    public String getAssetName() {
        return assetName;
    }

    public void setAssetName(String assetName) {
        this.assetName = assetName;
    }

    public UpdateDigitalAssetResponse withAssetDescription(String assetDescription) {
        this.assetDescription = assetDescription;
        return this;
    }

    /**
     * 资产描述。
     * @return assetDescription
     */
    public String getAssetDescription() {
        return assetDescription;
    }

    public void setAssetDescription(String assetDescription) {
        this.assetDescription = assetDescription;
    }

    public UpdateDigitalAssetResponse withCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * 资产创建时间。
     * @return createTime
     */
    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public UpdateDigitalAssetResponse withUpdateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    /**
     * 资产更新时间。
     * @return updateTime
     */
    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    public UpdateDigitalAssetResponse withAssetType(AssetTypeEnum assetType) {
        this.assetType = assetType;
        return this;
    }

    /**
     * 资产类型。 * HUMAN_MODEL：数字人模型 * VOICE_MODEL：音色模型 * SCENE：场景模型 * ANIMATION：动作动画 * VIDEO：视频文件 * IMAGE：图片文件 * PPT：幻灯片文件 * MATERIAL：风格化素材 * NORMAL_MODEL: 普通模型 * COMMON_FILE：通用文件 * HUMAN_MODEL_2D:2D数字人网络模型 * BUSINESS_CARD_TEMPLET: 数字人名片模板 * MUSIC: 音乐
     * @return assetType
     */
    public AssetTypeEnum getAssetType() {
        return assetType;
    }

    public void setAssetType(AssetTypeEnum assetType) {
        this.assetType = assetType;
    }

    public UpdateDigitalAssetResponse withAssetState(AssetStateEnum assetState) {
        this.assetState = assetState;
        return this;
    }

    /**
     * 资产状态。 * CREATING：资产创建中，主文件尚未上传 * FAILED：主文件上传失败 * UNACTIVED：主文件上传成功，资产未激活，资产不可用于其他业务（用户可更新状态） * ACTIVED：主文件上传成功，资产激活，资产可用于其他业务（用户可更新状态） * DELETING：资产删除中，资产不可用，资产可恢复 * DELETED：资产文件已删除，资产不可用，资产不可恢复 * BLOCK: 资产被冻结，资产不可用，不可查看文件。
     * @return assetState
     */
    public AssetStateEnum getAssetState() {
        return assetState;
    }

    public void setAssetState(AssetStateEnum assetState) {
        this.assetState = assetState;
    }

    public UpdateDigitalAssetResponse withTags(List<String> tags) {
        this.tags = tags;
        return this;
    }

    public UpdateDigitalAssetResponse addTagsItem(String tagsItem) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tagsItem);
        return this;
    }

    public UpdateDigitalAssetResponse withTags(Consumer<List<String>> tagsSetter) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        tagsSetter.accept(this.tags);
        return this;
    }

    /**
     * 标签列表。
     * @return tags
     */
    public List<String> getTags() {
        return tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    public UpdateDigitalAssetResponse withAssetExtraMeta(AssetExtraMeta assetExtraMeta) {
        this.assetExtraMeta = assetExtraMeta;
        return this;
    }

    public UpdateDigitalAssetResponse withAssetExtraMeta(Consumer<AssetExtraMeta> assetExtraMetaSetter) {
        if (this.assetExtraMeta == null) {
            this.assetExtraMeta = new AssetExtraMeta();
            assetExtraMetaSetter.accept(this.assetExtraMeta);
        }

        return this;
    }

    /**
     * Get assetExtraMeta
     * @return assetExtraMeta
     */
    public AssetExtraMeta getAssetExtraMeta() {
        return assetExtraMeta;
    }

    public void setAssetExtraMeta(AssetExtraMeta assetExtraMeta) {
        this.assetExtraMeta = assetExtraMeta;
    }

    public UpdateDigitalAssetResponse withSystemProperties(List<SystemProperty> systemProperties) {
        this.systemProperties = systemProperties;
        return this;
    }

    public UpdateDigitalAssetResponse addSystemPropertiesItem(SystemProperty systemPropertiesItem) {
        if (this.systemProperties == null) {
            this.systemProperties = new ArrayList<>();
        }
        this.systemProperties.add(systemPropertiesItem);
        return this;
    }

    public UpdateDigitalAssetResponse withSystemProperties(Consumer<List<SystemProperty>> systemPropertiesSetter) {
        if (this.systemProperties == null) {
            this.systemProperties = new ArrayList<>();
        }
        systemPropertiesSetter.accept(this.systemProperties);
        return this;
    }

    /**
     * 设置系统属性。
     * @return systemProperties
     */
    public List<SystemProperty> getSystemProperties() {
        return systemProperties;
    }

    public void setSystemProperties(List<SystemProperty> systemProperties) {
        this.systemProperties = systemProperties;
    }

    public UpdateDigitalAssetResponse withFiles(List<AssetFileInfo> files) {
        this.files = files;
        return this;
    }

    public UpdateDigitalAssetResponse addFilesItem(AssetFileInfo filesItem) {
        if (this.files == null) {
            this.files = new ArrayList<>();
        }
        this.files.add(filesItem);
        return this;
    }

    public UpdateDigitalAssetResponse withFiles(Consumer<List<AssetFileInfo>> filesSetter) {
        if (this.files == null) {
            this.files = new ArrayList<>();
        }
        filesSetter.accept(this.files);
        return this;
    }

    /**
     * 资产下的文件。
     * @return files
     */
    public List<AssetFileInfo> getFiles() {
        return files;
    }

    public void setFiles(List<AssetFileInfo> files) {
        this.files = files;
    }

    public UpdateDigitalAssetResponse withXRequestId(String xRequestId) {
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
        UpdateDigitalAssetResponse that = (UpdateDigitalAssetResponse) obj;
        return Objects.equals(this.assetId, that.assetId) && Objects.equals(this.assetName, that.assetName)
            && Objects.equals(this.assetDescription, that.assetDescription)
            && Objects.equals(this.createTime, that.createTime) && Objects.equals(this.updateTime, that.updateTime)
            && Objects.equals(this.assetType, that.assetType) && Objects.equals(this.assetState, that.assetState)
            && Objects.equals(this.tags, that.tags) && Objects.equals(this.assetExtraMeta, that.assetExtraMeta)
            && Objects.equals(this.systemProperties, that.systemProperties) && Objects.equals(this.files, that.files)
            && Objects.equals(this.xRequestId, that.xRequestId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(assetId,
            assetName,
            assetDescription,
            createTime,
            updateTime,
            assetType,
            assetState,
            tags,
            assetExtraMeta,
            systemProperties,
            files,
            xRequestId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateDigitalAssetResponse {\n");
        sb.append("    assetId: ").append(toIndentedString(assetId)).append("\n");
        sb.append("    assetName: ").append(toIndentedString(assetName)).append("\n");
        sb.append("    assetDescription: ").append(toIndentedString(assetDescription)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
        sb.append("    assetType: ").append(toIndentedString(assetType)).append("\n");
        sb.append("    assetState: ").append(toIndentedString(assetState)).append("\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
        sb.append("    assetExtraMeta: ").append(toIndentedString(assetExtraMeta)).append("\n");
        sb.append("    systemProperties: ").append(toIndentedString(systemProperties)).append("\n");
        sb.append("    files: ").append(toIndentedString(files)).append("\n");
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
