package com.huaweicloud.sdk.metastudio.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * 剧本播放策略
 */
public class PlayPolicy {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "repeat_count")

    private Integer repeatCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "auto_play_script")

    private Boolean autoPlayScript;

    /**
     * 驱动方式。默认TEXT * TEXT: 文本驱动，即通过TTS合成语音 * AUDIO: 语音驱动
     */
    public static final class PlayModeEnum {

        /**
         * Enum TEXT for value: "TEXT"
         */
        public static final PlayModeEnum TEXT = new PlayModeEnum("TEXT");

        /**
         * Enum AUDIO for value: "AUDIO"
         */
        public static final PlayModeEnum AUDIO = new PlayModeEnum("AUDIO");

        private static final Map<String, PlayModeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, PlayModeEnum> createStaticFields() {
            Map<String, PlayModeEnum> map = new HashMap<>();
            map.put("TEXT", TEXT);
            map.put("AUDIO", AUDIO);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        PlayModeEnum(String value) {
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
        public static PlayModeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new PlayModeEnum(value));
        }

        public static PlayModeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof PlayModeEnum) {
                return this.value.equals(((PlayModeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "play_mode")

    private PlayModeEnum playMode;

    public PlayPolicy withRepeatCount(Integer repeatCount) {
        this.repeatCount = repeatCount;
        return this;
    }

    /**
     * 剧本重复播放次数。 -1表示持续重复，直至人工停止 0 表示不重复，仅执行一次 其他值n，实际运行次数为n+1次
     * minimum: -1
     * maximum: 100
     * @return repeatCount
     */
    public Integer getRepeatCount() {
        return repeatCount;
    }

    public void setRepeatCount(Integer repeatCount) {
        this.repeatCount = repeatCount;
    }

    public PlayPolicy withAutoPlayScript(Boolean autoPlayScript) {
        this.autoPlayScript = autoPlayScript;
        return this;
    }

    /**
     * 是否自动播放剧本。 true: 服务完成任务初始化后，自动播放剧本 false: 服务完成任务初始化后，等待信号后再开始播放剧本
     * @return autoPlayScript
     */
    public Boolean getAutoPlayScript() {
        return autoPlayScript;
    }

    public void setAutoPlayScript(Boolean autoPlayScript) {
        this.autoPlayScript = autoPlayScript;
    }

    public PlayPolicy withPlayMode(PlayModeEnum playMode) {
        this.playMode = playMode;
        return this;
    }

    /**
     * 驱动方式。默认TEXT * TEXT: 文本驱动，即通过TTS合成语音 * AUDIO: 语音驱动
     * @return playMode
     */
    public PlayModeEnum getPlayMode() {
        return playMode;
    }

    public void setPlayMode(PlayModeEnum playMode) {
        this.playMode = playMode;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PlayPolicy that = (PlayPolicy) obj;
        return Objects.equals(this.repeatCount, that.repeatCount)
            && Objects.equals(this.autoPlayScript, that.autoPlayScript) && Objects.equals(this.playMode, that.playMode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(repeatCount, autoPlayScript, playMode);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PlayPolicy {\n");
        sb.append("    repeatCount: ").append(toIndentedString(repeatCount)).append("\n");
        sb.append("    autoPlayScript: ").append(toIndentedString(autoPlayScript)).append("\n");
        sb.append("    playMode: ").append(toIndentedString(playMode)).append("\n");
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
