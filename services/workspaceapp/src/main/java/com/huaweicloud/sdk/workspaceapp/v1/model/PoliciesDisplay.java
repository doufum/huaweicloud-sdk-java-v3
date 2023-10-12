package com.huaweicloud.sdk.workspaceapp.v1.model;

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
 * 显示。
 */
public class PoliciesDisplay {

    /**
     * 显示级别。取值为： LEVEL1：表示等级1。 LEVEL2：表示等级2。 LEVEL3：表示等级3。 LEVEL4：表示等级4（默认/推荐）。 LEVEL5：表示等级5。
     */
    public static final class DisplayLevelEnum {

        /**
         * Enum LEVEL1 for value: "LEVEL1"
         */
        public static final DisplayLevelEnum LEVEL1 = new DisplayLevelEnum("LEVEL1");

        /**
         * Enum LEVEL2 for value: "LEVEL2"
         */
        public static final DisplayLevelEnum LEVEL2 = new DisplayLevelEnum("LEVEL2");

        /**
         * Enum LEVEL3 for value: "LEVEL3"
         */
        public static final DisplayLevelEnum LEVEL3 = new DisplayLevelEnum("LEVEL3");

        /**
         * Enum LEVEL4 for value: "LEVEL4"
         */
        public static final DisplayLevelEnum LEVEL4 = new DisplayLevelEnum("LEVEL4");

        /**
         * Enum LEVEL5 for value: "LEVEL5"
         */
        public static final DisplayLevelEnum LEVEL5 = new DisplayLevelEnum("LEVEL5");

        private static final Map<String, DisplayLevelEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, DisplayLevelEnum> createStaticFields() {
            Map<String, DisplayLevelEnum> map = new HashMap<>();
            map.put("LEVEL1", LEVEL1);
            map.put("LEVEL2", LEVEL2);
            map.put("LEVEL3", LEVEL3);
            map.put("LEVEL4", LEVEL4);
            map.put("LEVEL5", LEVEL5);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        DisplayLevelEnum(String value) {
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
        public static DisplayLevelEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new DisplayLevelEnum(value));
        }

        public static DisplayLevelEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof DisplayLevelEnum) {
                return this.value.equals(((DisplayLevelEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "display_level")

    private DisplayLevelEnum displayLevel;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "options")

    private DisplayOptions options;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rendering_acceleration_enable")

    private Boolean renderingAccelerationEnable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rendering_acceleration_options")

    private PoliciesDisplayRenderingAccelerationOptions renderingAccelerationOptions;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "video_card_memory_size")

    private Integer videoCardMemorySize;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "driver_delegation_mode_enable")

    private Boolean driverDelegationModeEnable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "driver_delegation_latency")

    private Integer driverDelegationLatency;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "video_latency")

    private Integer videoLatency;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "change_resolution_vm")

    private Boolean changeResolutionVm;

    public PoliciesDisplay withDisplayLevel(DisplayLevelEnum displayLevel) {
        this.displayLevel = displayLevel;
        return this;
    }

    /**
     * 显示级别。取值为： LEVEL1：表示等级1。 LEVEL2：表示等级2。 LEVEL3：表示等级3。 LEVEL4：表示等级4（默认/推荐）。 LEVEL5：表示等级5。
     * @return displayLevel
     */
    public DisplayLevelEnum getDisplayLevel() {
        return displayLevel;
    }

    public void setDisplayLevel(DisplayLevelEnum displayLevel) {
        this.displayLevel = displayLevel;
    }

    public PoliciesDisplay withOptions(DisplayOptions options) {
        this.options = options;
        return this;
    }

    public PoliciesDisplay withOptions(Consumer<DisplayOptions> optionsSetter) {
        if (this.options == null) {
            this.options = new DisplayOptions();
            optionsSetter.accept(this.options);
        }

        return this;
    }

    /**
     * Get options
     * @return options
     */
    public DisplayOptions getOptions() {
        return options;
    }

    public void setOptions(DisplayOptions options) {
        this.options = options;
    }

    public PoliciesDisplay withRenderingAccelerationEnable(Boolean renderingAccelerationEnable) {
        this.renderingAccelerationEnable = renderingAccelerationEnable;
        return this;
    }

    /**
     * 是否开启渲染加速。取值为： false：表示关闭。 true：表示开启。
     * @return renderingAccelerationEnable
     */
    public Boolean getRenderingAccelerationEnable() {
        return renderingAccelerationEnable;
    }

    public void setRenderingAccelerationEnable(Boolean renderingAccelerationEnable) {
        this.renderingAccelerationEnable = renderingAccelerationEnable;
    }

    public PoliciesDisplay withRenderingAccelerationOptions(
        PoliciesDisplayRenderingAccelerationOptions renderingAccelerationOptions) {
        this.renderingAccelerationOptions = renderingAccelerationOptions;
        return this;
    }

    public PoliciesDisplay withRenderingAccelerationOptions(
        Consumer<PoliciesDisplayRenderingAccelerationOptions> renderingAccelerationOptionsSetter) {
        if (this.renderingAccelerationOptions == null) {
            this.renderingAccelerationOptions = new PoliciesDisplayRenderingAccelerationOptions();
            renderingAccelerationOptionsSetter.accept(this.renderingAccelerationOptions);
        }

        return this;
    }

    /**
     * Get renderingAccelerationOptions
     * @return renderingAccelerationOptions
     */
    public PoliciesDisplayRenderingAccelerationOptions getRenderingAccelerationOptions() {
        return renderingAccelerationOptions;
    }

    public void setRenderingAccelerationOptions(
        PoliciesDisplayRenderingAccelerationOptions renderingAccelerationOptions) {
        this.renderingAccelerationOptions = renderingAccelerationOptions;
    }

    public PoliciesDisplay withVideoCardMemorySize(Integer videoCardMemorySize) {
        this.videoCardMemorySize = videoCardMemorySize;
        return this;
    }

    /**
     * 显卡缓存（MB）。取值范围为[0-64]。默认：64。
     * minimum: 0
     * maximum: 64
     * @return videoCardMemorySize
     */
    public Integer getVideoCardMemorySize() {
        return videoCardMemorySize;
    }

    public void setVideoCardMemorySize(Integer videoCardMemorySize) {
        this.videoCardMemorySize = videoCardMemorySize;
    }

    public PoliciesDisplay withDriverDelegationModeEnable(Boolean driverDelegationModeEnable) {
        this.driverDelegationModeEnable = driverDelegationModeEnable;
        return this;
    }

    /**
     * 是否开启驱动托管模式。取值为： false：表示关闭。 true：表示开启。
     * @return driverDelegationModeEnable
     */
    public Boolean getDriverDelegationModeEnable() {
        return driverDelegationModeEnable;
    }

    public void setDriverDelegationModeEnable(Boolean driverDelegationModeEnable) {
        this.driverDelegationModeEnable = driverDelegationModeEnable;
    }

    public PoliciesDisplay withDriverDelegationLatency(Integer driverDelegationLatency) {
        this.driverDelegationLatency = driverDelegationLatency;
        return this;
    }

    /**
     * 驱动托管延时（*30ms）。取值范围为[1-100]。默认：80。
     * minimum: 1
     * maximum: 100
     * @return driverDelegationLatency
     */
    public Integer getDriverDelegationLatency() {
        return driverDelegationLatency;
    }

    public void setDriverDelegationLatency(Integer driverDelegationLatency) {
        this.driverDelegationLatency = driverDelegationLatency;
    }

    public PoliciesDisplay withVideoLatency(Integer videoLatency) {
        this.videoLatency = videoLatency;
        return this;
    }

    /**
     * 驱动托管视频延时（*30ms）。取值范围为[1-100]。默认：80。
     * minimum: 1
     * maximum: 100
     * @return videoLatency
     */
    public Integer getVideoLatency() {
        return videoLatency;
    }

    public void setVideoLatency(Integer videoLatency) {
        this.videoLatency = videoLatency;
    }

    public PoliciesDisplay withChangeResolutionVm(Boolean changeResolutionVm) {
        this.changeResolutionVm = changeResolutionVm;
        return this;
    }

    /**
     * 计算机修改分辨率：取值为： false：表示关闭。 true：表示开启。
     * @return changeResolutionVm
     */
    public Boolean getChangeResolutionVm() {
        return changeResolutionVm;
    }

    public void setChangeResolutionVm(Boolean changeResolutionVm) {
        this.changeResolutionVm = changeResolutionVm;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PoliciesDisplay that = (PoliciesDisplay) obj;
        return Objects.equals(this.displayLevel, that.displayLevel) && Objects.equals(this.options, that.options)
            && Objects.equals(this.renderingAccelerationEnable, that.renderingAccelerationEnable)
            && Objects.equals(this.renderingAccelerationOptions, that.renderingAccelerationOptions)
            && Objects.equals(this.videoCardMemorySize, that.videoCardMemorySize)
            && Objects.equals(this.driverDelegationModeEnable, that.driverDelegationModeEnable)
            && Objects.equals(this.driverDelegationLatency, that.driverDelegationLatency)
            && Objects.equals(this.videoLatency, that.videoLatency)
            && Objects.equals(this.changeResolutionVm, that.changeResolutionVm);
    }

    @Override
    public int hashCode() {
        return Objects.hash(displayLevel,
            options,
            renderingAccelerationEnable,
            renderingAccelerationOptions,
            videoCardMemorySize,
            driverDelegationModeEnable,
            driverDelegationLatency,
            videoLatency,
            changeResolutionVm);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PoliciesDisplay {\n");
        sb.append("    displayLevel: ").append(toIndentedString(displayLevel)).append("\n");
        sb.append("    options: ").append(toIndentedString(options)).append("\n");
        sb.append("    renderingAccelerationEnable: ")
            .append(toIndentedString(renderingAccelerationEnable))
            .append("\n");
        sb.append("    renderingAccelerationOptions: ")
            .append(toIndentedString(renderingAccelerationOptions))
            .append("\n");
        sb.append("    videoCardMemorySize: ").append(toIndentedString(videoCardMemorySize)).append("\n");
        sb.append("    driverDelegationModeEnable: ").append(toIndentedString(driverDelegationModeEnable)).append("\n");
        sb.append("    driverDelegationLatency: ").append(toIndentedString(driverDelegationLatency)).append("\n");
        sb.append("    videoLatency: ").append(toIndentedString(videoLatency)).append("\n");
        sb.append("    changeResolutionVm: ").append(toIndentedString(changeResolutionVm)).append("\n");
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
