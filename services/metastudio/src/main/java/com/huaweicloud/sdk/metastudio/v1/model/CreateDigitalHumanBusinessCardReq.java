package com.huaweicloud.sdk.metastudio.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 数字人名片制作创建请求。
 */
public class CreateDigitalHumanBusinessCardReq {

    /**
     * 数字人名片类型。 * 2D_DIGITAL_HUMAN_CARD：分身数字人名片。
     */
    public static final class BusinessCardTypeEnum {

        /**
         * Enum _2D_DIGITAL_HUMAN_CARD for value: "2D_DIGITAL_HUMAN_CARD"
         */
        public static final BusinessCardTypeEnum _2D_DIGITAL_HUMAN_CARD =
            new BusinessCardTypeEnum("2D_DIGITAL_HUMAN_CARD");

        private static final Map<String, BusinessCardTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, BusinessCardTypeEnum> createStaticFields() {
            Map<String, BusinessCardTypeEnum> map = new HashMap<>();
            map.put("2D_DIGITAL_HUMAN_CARD", _2D_DIGITAL_HUMAN_CARD);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        BusinessCardTypeEnum(String value) {
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
        public static BusinessCardTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new BusinessCardTypeEnum(value));
        }

        public static BusinessCardTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof BusinessCardTypeEnum) {
                return this.value.equals(((BusinessCardTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "business_card_type")

    private BusinessCardTypeEnum businessCardType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "card_templet_asset_id")

    private String cardTempletAssetId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "card_text_config")

    private BusinessCardTextConfig cardTextConfig;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "card_image_config")

    private BusinessCardImageConfig cardImageConfig;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "introduction_text")

    private String introductionText;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "voice_asset_id")

    private String voiceAssetId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "video_asset_name")

    private String videoAssetName;

    /**
     * 性别。 * MALE：男性 * FEMALE：女性
     */
    public static final class GenderEnum {

        /**
         * Enum MALE for value: "MALE"
         */
        public static final GenderEnum MALE = new GenderEnum("MALE");

        /**
         * Enum FEMALE for value: "FEMALE"
         */
        public static final GenderEnum FEMALE = new GenderEnum("FEMALE");

        private static final Map<String, GenderEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, GenderEnum> createStaticFields() {
            Map<String, GenderEnum> map = new HashMap<>();
            map.put("MALE", MALE);
            map.put("FEMALE", FEMALE);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        GenderEnum(String value) {
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
        public static GenderEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new GenderEnum(value));
        }

        public static GenderEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof GenderEnum) {
                return this.value.equals(((GenderEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "gender")

    private GenderEnum gender;

    public CreateDigitalHumanBusinessCardReq withBusinessCardType(BusinessCardTypeEnum businessCardType) {
        this.businessCardType = businessCardType;
        return this;
    }

    /**
     * 数字人名片类型。 * 2D_DIGITAL_HUMAN_CARD：分身数字人名片。
     * @return businessCardType
     */
    public BusinessCardTypeEnum getBusinessCardType() {
        return businessCardType;
    }

    public void setBusinessCardType(BusinessCardTypeEnum businessCardType) {
        this.businessCardType = businessCardType;
    }

    public CreateDigitalHumanBusinessCardReq withCardTempletAssetId(String cardTempletAssetId) {
        this.cardTempletAssetId = cardTempletAssetId;
        return this;
    }

    /**
     * 数字人名片模板资产ID。
     * @return cardTempletAssetId
     */
    public String getCardTempletAssetId() {
        return cardTempletAssetId;
    }

    public void setCardTempletAssetId(String cardTempletAssetId) {
        this.cardTempletAssetId = cardTempletAssetId;
    }

    public CreateDigitalHumanBusinessCardReq withCardTextConfig(BusinessCardTextConfig cardTextConfig) {
        this.cardTextConfig = cardTextConfig;
        return this;
    }

    public CreateDigitalHumanBusinessCardReq withCardTextConfig(Consumer<BusinessCardTextConfig> cardTextConfigSetter) {
        if (this.cardTextConfig == null) {
            this.cardTextConfig = new BusinessCardTextConfig();
            cardTextConfigSetter.accept(this.cardTextConfig);
        }

        return this;
    }

    /**
     * Get cardTextConfig
     * @return cardTextConfig
     */
    public BusinessCardTextConfig getCardTextConfig() {
        return cardTextConfig;
    }

    public void setCardTextConfig(BusinessCardTextConfig cardTextConfig) {
        this.cardTextConfig = cardTextConfig;
    }

    public CreateDigitalHumanBusinessCardReq withCardImageConfig(BusinessCardImageConfig cardImageConfig) {
        this.cardImageConfig = cardImageConfig;
        return this;
    }

    public CreateDigitalHumanBusinessCardReq withCardImageConfig(
        Consumer<BusinessCardImageConfig> cardImageConfigSetter) {
        if (this.cardImageConfig == null) {
            this.cardImageConfig = new BusinessCardImageConfig();
            cardImageConfigSetter.accept(this.cardImageConfig);
        }

        return this;
    }

    /**
     * Get cardImageConfig
     * @return cardImageConfig
     */
    public BusinessCardImageConfig getCardImageConfig() {
        return cardImageConfig;
    }

    public void setCardImageConfig(BusinessCardImageConfig cardImageConfig) {
        this.cardImageConfig = cardImageConfig;
    }

    public CreateDigitalHumanBusinessCardReq withIntroductionText(String introductionText) {
        this.introductionText = introductionText;
        return this;
    }

    /**
     * 自我介绍文本，用于驱动数字人口型。
     * @return introductionText
     */
    public String getIntroductionText() {
        return introductionText;
    }

    public void setIntroductionText(String introductionText) {
        this.introductionText = introductionText;
    }

    public CreateDigitalHumanBusinessCardReq withVoiceAssetId(String voiceAssetId) {
        this.voiceAssetId = voiceAssetId;
        return this;
    }

    /**
     * 音色资产ID。
     * @return voiceAssetId
     */
    public String getVoiceAssetId() {
        return voiceAssetId;
    }

    public void setVoiceAssetId(String voiceAssetId) {
        this.voiceAssetId = voiceAssetId;
    }

    public CreateDigitalHumanBusinessCardReq withVideoAssetName(String videoAssetName) {
        this.videoAssetName = videoAssetName;
        return this;
    }

    /**
     * 输出名片视频资产名称。默认取card_name的值
     * @return videoAssetName
     */
    public String getVideoAssetName() {
        return videoAssetName;
    }

    public void setVideoAssetName(String videoAssetName) {
        this.videoAssetName = videoAssetName;
    }

    public CreateDigitalHumanBusinessCardReq withGender(GenderEnum gender) {
        this.gender = gender;
        return this;
    }

    /**
     * 性别。 * MALE：男性 * FEMALE：女性
     * @return gender
     */
    public GenderEnum getGender() {
        return gender;
    }

    public void setGender(GenderEnum gender) {
        this.gender = gender;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateDigitalHumanBusinessCardReq that = (CreateDigitalHumanBusinessCardReq) obj;
        return Objects.equals(this.businessCardType, that.businessCardType)
            && Objects.equals(this.cardTempletAssetId, that.cardTempletAssetId)
            && Objects.equals(this.cardTextConfig, that.cardTextConfig)
            && Objects.equals(this.cardImageConfig, that.cardImageConfig)
            && Objects.equals(this.introductionText, that.introductionText)
            && Objects.equals(this.voiceAssetId, that.voiceAssetId)
            && Objects.equals(this.videoAssetName, that.videoAssetName) && Objects.equals(this.gender, that.gender);
    }

    @Override
    public int hashCode() {
        return Objects.hash(businessCardType,
            cardTempletAssetId,
            cardTextConfig,
            cardImageConfig,
            introductionText,
            voiceAssetId,
            videoAssetName,
            gender);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateDigitalHumanBusinessCardReq {\n");
        sb.append("    businessCardType: ").append(toIndentedString(businessCardType)).append("\n");
        sb.append("    cardTempletAssetId: ").append(toIndentedString(cardTempletAssetId)).append("\n");
        sb.append("    cardTextConfig: ").append(toIndentedString(cardTextConfig)).append("\n");
        sb.append("    cardImageConfig: ").append(toIndentedString(cardImageConfig)).append("\n");
        sb.append("    introductionText: ").append(toIndentedString(introductionText)).append("\n");
        sb.append("    voiceAssetId: ").append(toIndentedString(voiceAssetId)).append("\n");
        sb.append("    videoAssetName: ").append(toIndentedString(videoAssetName)).append("\n");
        sb.append("    gender: ").append(toIndentedString(gender)).append("\n");
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
