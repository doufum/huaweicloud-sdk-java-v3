package com.huaweicloud.sdk.roma.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.core.SdkResponse;

import java.time.OffsetDateTime;
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
public class CreateApiGroupV2Response extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    /**
     * 状态   - 1： 有效   - 2:  锁定
     */
    public static final class StatusEnum {

        /**
         * Enum NUMBER_1 for value: 1
         */
        public static final StatusEnum NUMBER_1 = new StatusEnum(1);

        /**
         * Enum NUMBER_2 for value: 2
         */
        public static final StatusEnum NUMBER_2 = new StatusEnum(2);

        private static final Map<Integer, StatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<Integer, StatusEnum> createStaticFields() {
            Map<Integer, StatusEnum> map = new HashMap<>();
            map.put(1, NUMBER_1);
            map.put(2, NUMBER_2);
            return Collections.unmodifiableMap(map);
        }

        private Integer value;

        StatusEnum(Integer value) {
            this.value = value;
        }

        @JsonValue
        public Integer getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static StatusEnum fromValue(Integer value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new StatusEnum(value));
        }

        public static StatusEnum valueOf(Integer value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof StatusEnum) {
                return this.value.equals(((StatusEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private StatusEnum status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sl_domain")

    private String slDomain;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "register_time")

    private OffsetDateTime registerTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_time")

    private OffsetDateTime updateTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "on_sell_status")

    private Integer onSellStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "url_domains")

    private List<UrlDomain> urlDomains = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sl_domains")

    private List<String> slDomains = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "remark")

    private String remark;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "call_limits")

    private Integer callLimits;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "time_interval")

    private Integer timeInterval;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "time_unit")

    private String timeUnit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_default")

    private Integer isDefault;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "version")

    private String version;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "roma_app_id")

    private String romaAppId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "roma_app_name")

    private String romaAppName;

    public CreateApiGroupV2Response withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 编号
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public CreateApiGroupV2Response withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * API分组名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CreateApiGroupV2Response withStatus(StatusEnum status) {
        this.status = status;
        return this;
    }

    /**
     * 状态   - 1： 有效   - 2:  锁定
     * @return status
     */
    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    public CreateApiGroupV2Response withSlDomain(String slDomain) {
        this.slDomain = slDomain;
        return this;
    }

    /**
     * 系统默认分配的子域名
     * @return slDomain
     */
    public String getSlDomain() {
        return slDomain;
    }

    public void setSlDomain(String slDomain) {
        this.slDomain = slDomain;
    }

    public CreateApiGroupV2Response withRegisterTime(OffsetDateTime registerTime) {
        this.registerTime = registerTime;
        return this;
    }

    /**
     * 创建时间
     * @return registerTime
     */
    public OffsetDateTime getRegisterTime() {
        return registerTime;
    }

    public void setRegisterTime(OffsetDateTime registerTime) {
        this.registerTime = registerTime;
    }

    public CreateApiGroupV2Response withUpdateTime(OffsetDateTime updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    /**
     * 最近修改时间
     * @return updateTime
     */
    public OffsetDateTime getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(OffsetDateTime updateTime) {
        this.updateTime = updateTime;
    }

    public CreateApiGroupV2Response withOnSellStatus(Integer onSellStatus) {
        this.onSellStatus = onSellStatus;
        return this;
    }

    /**
     * 是否已上架云市场： - 1：已上架 - 2：未上架 - 3：审核中  [ROMA Connect](tag:hws,hws_hk,hcs,hcs_sm,fcs,g42)[ROMA Site](tag:Site)暂未对接云市场，此字段默认返回2
     * @return onSellStatus
     */
    public Integer getOnSellStatus() {
        return onSellStatus;
    }

    public void setOnSellStatus(Integer onSellStatus) {
        this.onSellStatus = onSellStatus;
    }

    public CreateApiGroupV2Response withUrlDomains(List<UrlDomain> urlDomains) {
        this.urlDomains = urlDomains;
        return this;
    }

    public CreateApiGroupV2Response addUrlDomainsItem(UrlDomain urlDomainsItem) {
        if (this.urlDomains == null) {
            this.urlDomains = new ArrayList<>();
        }
        this.urlDomains.add(urlDomainsItem);
        return this;
    }

    public CreateApiGroupV2Response withUrlDomains(Consumer<List<UrlDomain>> urlDomainsSetter) {
        if (this.urlDomains == null) {
            this.urlDomains = new ArrayList<>();
        }
        urlDomainsSetter.accept(this.urlDomains);
        return this;
    }

    /**
     * 分组上绑定的独立域名列表
     * @return urlDomains
     */
    public List<UrlDomain> getUrlDomains() {
        return urlDomains;
    }

    public void setUrlDomains(List<UrlDomain> urlDomains) {
        this.urlDomains = urlDomains;
    }

    public CreateApiGroupV2Response withSlDomains(List<String> slDomains) {
        this.slDomains = slDomains;
        return this;
    }

    public CreateApiGroupV2Response addSlDomainsItem(String slDomainsItem) {
        if (this.slDomains == null) {
            this.slDomains = new ArrayList<>();
        }
        this.slDomains.add(slDomainsItem);
        return this;
    }

    public CreateApiGroupV2Response withSlDomains(Consumer<List<String>> slDomainsSetter) {
        if (this.slDomains == null) {
            this.slDomains = new ArrayList<>();
        }
        slDomainsSetter.accept(this.slDomains);
        return this;
    }

    /**
     * 系统默认分配的子域名列表
     * @return slDomains
     */
    public List<String> getSlDomains() {
        return slDomains;
    }

    public void setSlDomains(List<String> slDomains) {
        this.slDomains = slDomains;
    }

    public CreateApiGroupV2Response withRemark(String remark) {
        this.remark = remark;
        return this;
    }

    /**
     * 描述
     * @return remark
     */
    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public CreateApiGroupV2Response withCallLimits(Integer callLimits) {
        this.callLimits = callLimits;
        return this;
    }

    /**
     * 流控时长内分组下的API的总访问次数限制，默认不限，请根据服务的负载能力自行设置  暂不支持
     * @return callLimits
     */
    public Integer getCallLimits() {
        return callLimits;
    }

    public void setCallLimits(Integer callLimits) {
        this.callLimits = callLimits;
    }

    public CreateApiGroupV2Response withTimeInterval(Integer timeInterval) {
        this.timeInterval = timeInterval;
        return this;
    }

    /**
     * 流控时长  暂不支持
     * @return timeInterval
     */
    public Integer getTimeInterval() {
        return timeInterval;
    }

    public void setTimeInterval(Integer timeInterval) {
        this.timeInterval = timeInterval;
    }

    public CreateApiGroupV2Response withTimeUnit(String timeUnit) {
        this.timeUnit = timeUnit;
        return this;
    }

    /**
     * 流控的时间单位  暂不支持
     * @return timeUnit
     */
    public String getTimeUnit() {
        return timeUnit;
    }

    public void setTimeUnit(String timeUnit) {
        this.timeUnit = timeUnit;
    }

    public CreateApiGroupV2Response withIsDefault(Integer isDefault) {
        this.isDefault = isDefault;
        return this;
    }

    /**
     * 是否为默认分组
     * @return isDefault
     */
    public Integer getIsDefault() {
        return isDefault;
    }

    public void setIsDefault(Integer isDefault) {
        this.isDefault = isDefault;
    }

    public CreateApiGroupV2Response withVersion(String version) {
        this.version = version;
        return this;
    }

    /**
     * 分组版本  - V1：全局分组 - V2：应用级分组
     * @return version
     */
    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public CreateApiGroupV2Response withRomaAppId(String romaAppId) {
        this.romaAppId = romaAppId;
        return this;
    }

    /**
     * 分组归属的集成应用编号。  分组版本V2时必填。
     * @return romaAppId
     */
    public String getRomaAppId() {
        return romaAppId;
    }

    public void setRomaAppId(String romaAppId) {
        this.romaAppId = romaAppId;
    }

    public CreateApiGroupV2Response withRomaAppName(String romaAppName) {
        this.romaAppName = romaAppName;
        return this;
    }

    /**
     * 分组归属的集成应用名称
     * @return romaAppName
     */
    public String getRomaAppName() {
        return romaAppName;
    }

    public void setRomaAppName(String romaAppName) {
        this.romaAppName = romaAppName;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateApiGroupV2Response that = (CreateApiGroupV2Response) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.name, that.name)
            && Objects.equals(this.status, that.status) && Objects.equals(this.slDomain, that.slDomain)
            && Objects.equals(this.registerTime, that.registerTime) && Objects.equals(this.updateTime, that.updateTime)
            && Objects.equals(this.onSellStatus, that.onSellStatus) && Objects.equals(this.urlDomains, that.urlDomains)
            && Objects.equals(this.slDomains, that.slDomains) && Objects.equals(this.remark, that.remark)
            && Objects.equals(this.callLimits, that.callLimits) && Objects.equals(this.timeInterval, that.timeInterval)
            && Objects.equals(this.timeUnit, that.timeUnit) && Objects.equals(this.isDefault, that.isDefault)
            && Objects.equals(this.version, that.version) && Objects.equals(this.romaAppId, that.romaAppId)
            && Objects.equals(this.romaAppName, that.romaAppName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            name,
            status,
            slDomain,
            registerTime,
            updateTime,
            onSellStatus,
            urlDomains,
            slDomains,
            remark,
            callLimits,
            timeInterval,
            timeUnit,
            isDefault,
            version,
            romaAppId,
            romaAppName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateApiGroupV2Response {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    slDomain: ").append(toIndentedString(slDomain)).append("\n");
        sb.append("    registerTime: ").append(toIndentedString(registerTime)).append("\n");
        sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
        sb.append("    onSellStatus: ").append(toIndentedString(onSellStatus)).append("\n");
        sb.append("    urlDomains: ").append(toIndentedString(urlDomains)).append("\n");
        sb.append("    slDomains: ").append(toIndentedString(slDomains)).append("\n");
        sb.append("    remark: ").append(toIndentedString(remark)).append("\n");
        sb.append("    callLimits: ").append(toIndentedString(callLimits)).append("\n");
        sb.append("    timeInterval: ").append(toIndentedString(timeInterval)).append("\n");
        sb.append("    timeUnit: ").append(toIndentedString(timeUnit)).append("\n");
        sb.append("    isDefault: ").append(toIndentedString(isDefault)).append("\n");
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
        sb.append("    romaAppId: ").append(toIndentedString(romaAppId)).append("\n");
        sb.append("    romaAppName: ").append(toIndentedString(romaAppName)).append("\n");
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
