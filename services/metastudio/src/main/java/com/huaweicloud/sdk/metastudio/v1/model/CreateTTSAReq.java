package com.huaweicloud.sdk.metastudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * CreateTTSAReq
 */
public class CreateTTSAReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "voice_asset_id")

    private String voiceAssetId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "text")

    private String text;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "speed")

    private Integer speed;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pitch")

    private Integer pitch;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "volume")

    private Integer volume;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "emotion")

    private String emotion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "style_id")

    private String styleId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "camera_position")

    private String cameraPosition;

    public CreateTTSAReq withVoiceAssetId(String voiceAssetId) {
        this.voiceAssetId = voiceAssetId;
        return this;
    }

    /**
     * 音色模型ID
     * @return voiceAssetId
     */
    public String getVoiceAssetId() {
        return voiceAssetId;
    }

    public void setVoiceAssetId(String voiceAssetId) {
        this.voiceAssetId = voiceAssetId;
    }

    public CreateTTSAReq withText(String text) {
        this.text = text;
        return this;
    }

    /**
     * HTML格式的台词，可包含动作。最多2048个字符。 > * HTML格式举例：\\<speak>大家好<insert-action id=\\\"14cc7bbcde4982aab82f9d9af9e0f743\\\"/>，非常高兴给大家介绍MetaStudio。\\</speak> > * insert-action id通过查询资产列表接口获取，查询时asset_type=ANIMATION > * 多音字标签：\\<phoneme ph=\\\"拼音\\\">汉字\\</phoneme>，南京\\<phoneme ph=\\\"shi4 zhang3\\\">市长\\</phoneme>江大桥。 > * 停顿标签：\\<break/>，中方一贯主张\\<break/>维护国家主权平等，不干涉他国内政\\<break time=\\\"300ms\\\"/>是联合国宪章\\<break time=\\\"500ms\\\"/>最重要的原则。
     * @return text
     */
    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public CreateTTSAReq withSpeed(Integer speed) {
        this.speed = speed;
        return this;
    }

    /**
     * 语速。  取值范围[50,200]   默认值：100
     * minimum: 50
     * maximum: 200
     * @return speed
     */
    public Integer getSpeed() {
        return speed;
    }

    public void setSpeed(Integer speed) {
        this.speed = speed;
    }

    public CreateTTSAReq withPitch(Integer pitch) {
        this.pitch = pitch;
        return this;
    }

    /**
     * 基频。  取值范围[50,200]  默认值：100
     * minimum: 50
     * maximum: 200
     * @return pitch
     */
    public Integer getPitch() {
        return pitch;
    }

    public void setPitch(Integer pitch) {
        this.pitch = pitch;
    }

    public CreateTTSAReq withVolume(Integer volume) {
        this.volume = volume;
        return this;
    }

    /**
     * 音量。  取值范围[90,240]   默认值：100
     * minimum: 90
     * maximum: 240
     * @return volume
     */
    public Integer getVolume() {
        return volume;
    }

    public void setVolume(Integer volume) {
        this.volume = volume;
    }

    public CreateTTSAReq withEmotion(String emotion) {
        this.emotion = emotion;
        return this;
    }

    /**
     * 情感标签。 * ANGER：愤怒 * HAPPY：开心 * SAD：悲伤 * CALM：平静
     * @return emotion
     */
    public String getEmotion() {
        return emotion;
    }

    public void setEmotion(String emotion) {
        this.emotion = emotion;
    }

    public CreateTTSAReq withStyleId(String styleId) {
        this.styleId = styleId;
        return this;
    }

    /**
     * 风格化ID。
     * @return styleId
     */
    public String getStyleId() {
        return styleId;
    }

    public void setStyleId(String styleId) {
        this.styleId = styleId;
    }

    public CreateTTSAReq withCameraPosition(String cameraPosition) {
        this.cameraPosition = cameraPosition;
        return this;
    }

    /**
     * 人位置及相机位置。由如下4组浮点数组成的字符：人位置的X/Y/Z值，人角度的Pitch/Yaw/Roll值；相机位置的X/Y/Z值，相机角度的Pitch/Yaw/Roll值。
     * @return cameraPosition
     */
    public String getCameraPosition() {
        return cameraPosition;
    }

    public void setCameraPosition(String cameraPosition) {
        this.cameraPosition = cameraPosition;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateTTSAReq that = (CreateTTSAReq) obj;
        return Objects.equals(this.voiceAssetId, that.voiceAssetId) && Objects.equals(this.text, that.text)
            && Objects.equals(this.speed, that.speed) && Objects.equals(this.pitch, that.pitch)
            && Objects.equals(this.volume, that.volume) && Objects.equals(this.emotion, that.emotion)
            && Objects.equals(this.styleId, that.styleId) && Objects.equals(this.cameraPosition, that.cameraPosition);
    }

    @Override
    public int hashCode() {
        return Objects.hash(voiceAssetId, text, speed, pitch, volume, emotion, styleId, cameraPosition);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateTTSAReq {\n");
        sb.append("    voiceAssetId: ").append(toIndentedString(voiceAssetId)).append("\n");
        sb.append("    text: ").append(toIndentedString(text)).append("\n");
        sb.append("    speed: ").append(toIndentedString(speed)).append("\n");
        sb.append("    pitch: ").append(toIndentedString(pitch)).append("\n");
        sb.append("    volume: ").append(toIndentedString(volume)).append("\n");
        sb.append("    emotion: ").append(toIndentedString(emotion)).append("\n");
        sb.append("    styleId: ").append(toIndentedString(styleId)).append("\n");
        sb.append("    cameraPosition: ").append(toIndentedString(cameraPosition)).append("\n");
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
