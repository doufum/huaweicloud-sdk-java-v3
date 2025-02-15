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
 * 视频输出配置。
 */
public class VideoConfig {

    /**
     * 输出视频的剪辑方式。 * RESIZE：视频缩放。 * CROP：视频裁剪。
     */
    public static final class ClipModeEnum {

        /**
         * Enum RESIZE for value: "RESIZE"
         */
        public static final ClipModeEnum RESIZE = new ClipModeEnum("RESIZE");

        /**
         * Enum CROP for value: "CROP"
         */
        public static final ClipModeEnum CROP = new ClipModeEnum("CROP");

        private static final Map<String, ClipModeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ClipModeEnum> createStaticFields() {
            Map<String, ClipModeEnum> map = new HashMap<>();
            map.put("RESIZE", RESIZE);
            map.put("CROP", CROP);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ClipModeEnum(String value) {
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
        public static ClipModeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new ClipModeEnum(value));
        }

        public static ClipModeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ClipModeEnum) {
                return this.value.equals(((ClipModeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "clip_mode")

    private ClipModeEnum clipMode;

    /**
     * 视频编码格式及视频文件格式。 * H264: h264编码，输出mp4文件 * VP8：vp8编码，输出webm文件
     */
    public static final class CodecEnum {

        /**
         * Enum H264 for value: "H264"
         */
        public static final CodecEnum H264 = new CodecEnum("H264");

        /**
         * Enum VP8 for value: "VP8"
         */
        public static final CodecEnum VP8 = new CodecEnum("VP8");

        private static final Map<String, CodecEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, CodecEnum> createStaticFields() {
            Map<String, CodecEnum> map = new HashMap<>();
            map.put("H264", H264);
            map.put("VP8", VP8);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        CodecEnum(String value) {
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
        public static CodecEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new CodecEnum(value));
        }

        public static CodecEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof CodecEnum) {
                return this.value.equals(((CodecEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "codec")

    private CodecEnum codec;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bitrate")

    private Integer bitrate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "width")

    private Integer width;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "height")

    private Integer height;

    /**
     * 帧率。  单位：FPS。 > * 分身数字人帧率目前只支持25。
     */
    public static final class FrameRateEnum {

        /**
         * Enum _24 for value: "24"
         */
        public static final FrameRateEnum _24 = new FrameRateEnum("24");

        /**
         * Enum _25 for value: "25"
         */
        public static final FrameRateEnum _25 = new FrameRateEnum("25");

        /**
         * Enum _30 for value: "30"
         */
        public static final FrameRateEnum _30 = new FrameRateEnum("30");

        private static final Map<String, FrameRateEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, FrameRateEnum> createStaticFields() {
            Map<String, FrameRateEnum> map = new HashMap<>();
            map.put("24", _24);
            map.put("25", _25);
            map.put("30", _30);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        FrameRateEnum(String value) {
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
        public static FrameRateEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new FrameRateEnum(value));
        }

        public static FrameRateEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof FrameRateEnum) {
                return this.value.equals(((FrameRateEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "frame_rate")

    private FrameRateEnum frameRate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_subtitle_enable")

    private Boolean isSubtitleEnable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dx")

    private Integer dx;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dy")

    private Integer dy;

    public VideoConfig withClipMode(ClipModeEnum clipMode) {
        this.clipMode = clipMode;
        return this;
    }

    /**
     * 输出视频的剪辑方式。 * RESIZE：视频缩放。 * CROP：视频裁剪。
     * @return clipMode
     */
    public ClipModeEnum getClipMode() {
        return clipMode;
    }

    public void setClipMode(ClipModeEnum clipMode) {
        this.clipMode = clipMode;
    }

    public VideoConfig withCodec(CodecEnum codec) {
        this.codec = codec;
        return this;
    }

    /**
     * 视频编码格式及视频文件格式。 * H264: h264编码，输出mp4文件 * VP8：vp8编码，输出webm文件
     * @return codec
     */
    public CodecEnum getCodec() {
        return codec;
    }

    public void setCodec(CodecEnum codec) {
        this.codec = codec;
    }

    public VideoConfig withBitrate(Integer bitrate) {
        this.bitrate = bitrate;
        return this;
    }

    /**
     * 输出平均码率。  单位：kbps。  最小值40，最大值30000。 > * 分身数字人视频制作采用质量优先，可能会超过设置的码率。 > * 分身数字人直播码率范围[1000, 8000]。
     * minimum: 40
     * maximum: 30000
     * @return bitrate
     */
    public Integer getBitrate() {
        return bitrate;
    }

    public void setBitrate(Integer bitrate) {
        this.bitrate = bitrate;
    }

    public VideoConfig withWidth(Integer width) {
        this.width = width;
        return this;
    }

    /**
     * 视频宽度。  单位：像素。  最小值320，最大值2560。 > * clip_mode=RESIZE时，当前支持1920x1080、1080x1920、1280x720、720x1280四种分辨率。 > * clip_mode=CROP，视频保留中间width宽度，裁掉左右两边。 > * 分身数字人直播目前只支持1080x1920。
     * minimum: 0
     * maximum: 2560
     * @return width
     */
    public Integer getWidth() {
        return width;
    }

    public void setWidth(Integer width) {
        this.width = width;
    }

    public VideoConfig withHeight(Integer height) {
        this.height = height;
        return this;
    }

    /**
     * 视频高度。  单位：像素。  最小值320，最大值2560。 > * clip_mode=RESIZE时，当前支持1920x1080、1080x1920、1280x720、720x1280四种分辨率。 > * clip_mode=CROP，视频保留底部height高度，裁掉顶部。 > * 分身数字人直播目前只支持1080x1920。
     * minimum: 0
     * maximum: 2560
     * @return height
     */
    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    public VideoConfig withFrameRate(FrameRateEnum frameRate) {
        this.frameRate = frameRate;
        return this;
    }

    /**
     * 帧率。  单位：FPS。 > * 分身数字人帧率目前只支持25。
     * @return frameRate
     */
    public FrameRateEnum getFrameRate() {
        return frameRate;
    }

    public void setFrameRate(FrameRateEnum frameRate) {
        this.frameRate = frameRate;
    }

    public VideoConfig withIsSubtitleEnable(Boolean isSubtitleEnable) {
        this.isSubtitleEnable = isSubtitleEnable;
        return this;
    }

    /**
     * 输出的视频是否带字幕。 > true: 打开字幕 > false: 关闭字幕
     * @return isSubtitleEnable
     */
    public Boolean getIsSubtitleEnable() {
        return isSubtitleEnable;
    }

    public void setIsSubtitleEnable(Boolean isSubtitleEnable) {
        this.isSubtitleEnable = isSubtitleEnable;
    }

    public VideoConfig withDx(Integer dx) {
        this.dx = dx;
        return this;
    }

    /**
     * 裁剪视频左上角像素点坐标。  clip_mode= CROP时生效。 > *横屏（16:9）视频像素为1920x1080；竖屏（9:16）视频像素为1080x1920。
     * minimum: -1920
     * maximum: 3840
     * @return dx
     */
    public Integer getDx() {
        return dx;
    }

    public void setDx(Integer dx) {
        this.dx = dx;
    }

    public VideoConfig withDy(Integer dy) {
        this.dy = dy;
        return this;
    }

    /**
     * 裁剪视频左上角像素点坐标。  clip_mode= CROP时生效。 > *横屏（16:9）视频像素为1920x1080；竖屏（9:16）视频像素为1080x1920。
     * minimum: -1920
     * maximum: 3840
     * @return dy
     */
    public Integer getDy() {
        return dy;
    }

    public void setDy(Integer dy) {
        this.dy = dy;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        VideoConfig that = (VideoConfig) obj;
        return Objects.equals(this.clipMode, that.clipMode) && Objects.equals(this.codec, that.codec)
            && Objects.equals(this.bitrate, that.bitrate) && Objects.equals(this.width, that.width)
            && Objects.equals(this.height, that.height) && Objects.equals(this.frameRate, that.frameRate)
            && Objects.equals(this.isSubtitleEnable, that.isSubtitleEnable) && Objects.equals(this.dx, that.dx)
            && Objects.equals(this.dy, that.dy);
    }

    @Override
    public int hashCode() {
        return Objects.hash(clipMode, codec, bitrate, width, height, frameRate, isSubtitleEnable, dx, dy);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class VideoConfig {\n");
        sb.append("    clipMode: ").append(toIndentedString(clipMode)).append("\n");
        sb.append("    codec: ").append(toIndentedString(codec)).append("\n");
        sb.append("    bitrate: ").append(toIndentedString(bitrate)).append("\n");
        sb.append("    width: ").append(toIndentedString(width)).append("\n");
        sb.append("    height: ").append(toIndentedString(height)).append("\n");
        sb.append("    frameRate: ").append(toIndentedString(frameRate)).append("\n");
        sb.append("    isSubtitleEnable: ").append(toIndentedString(isSubtitleEnable)).append("\n");
        sb.append("    dx: ").append(toIndentedString(dx)).append("\n");
        sb.append("    dy: ").append(toIndentedString(dy)).append("\n");
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
