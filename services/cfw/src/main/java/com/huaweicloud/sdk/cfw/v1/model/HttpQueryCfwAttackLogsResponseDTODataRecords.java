package com.huaweicloud.sdk.cfw.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * HttpQueryCfwAttackLogsResponseDTODataRecords
 */
public class HttpQueryCfwAttackLogsResponseDTODataRecords {

    /**
     * 方向，有内到外和外到内两种
     */
    public static final class DirectionEnum {

        /**
         * Enum OUT2IN for value: "out2in"
         */
        public static final DirectionEnum OUT2IN = new DirectionEnum("out2in");

        /**
         * Enum IN2OUT for value: "in2out"
         */
        public static final DirectionEnum IN2OUT = new DirectionEnum("in2out");

        private static final Map<String, DirectionEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, DirectionEnum> createStaticFields() {
            Map<String, DirectionEnum> map = new HashMap<>();
            map.put("out2in", OUT2IN);
            map.put("in2out", IN2OUT);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        DirectionEnum(String value) {
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
        public static DirectionEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new DirectionEnum(value));
        }

        public static DirectionEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof DirectionEnum) {
                return this.value.equals(((DirectionEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "direction")

    private DirectionEnum direction;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "action")

    private String action;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "event_time")

    private String eventTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "attack_type")

    private String attackType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "attack_rule")

    private String attackRule;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "level")

    private String level;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source")

    private String source;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "packet_length")

    private Long packetLength;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "attack_rule_id")

    private Integer attackRuleId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "hit_time")

    private Integer hitTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "log_id")

    private String logId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "src_ip")

    private String srcIp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "src_port")

    private Integer srcPort;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dst_ip")

    private String dstIp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dst_port")

    private Integer dstPort;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "protocol")

    private String protocol;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "packet")

    private Packet packet;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "app")

    private String app;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "packetMessages")

    private List<PacketMessage> packetMessages = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dst_host")

    private String dstHost;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "src_region_id")

    private String srcRegionId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "src_region_name")

    private String srcRegionName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dst_region_id")

    private String dstRegionId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dst_region_name")

    private String dstRegionName;

    public HttpQueryCfwAttackLogsResponseDTODataRecords withDirection(DirectionEnum direction) {
        this.direction = direction;
        return this;
    }

    /**
     * 方向，有内到外和外到内两种
     * @return direction
     */
    public DirectionEnum getDirection() {
        return direction;
    }

    public void setDirection(DirectionEnum direction) {
        this.direction = direction;
    }

    public HttpQueryCfwAttackLogsResponseDTODataRecords withAction(String action) {
        this.action = action;
        return this;
    }

    /**
     * 动作
     * @return action
     */
    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public HttpQueryCfwAttackLogsResponseDTODataRecords withEventTime(String eventTime) {
        this.eventTime = eventTime;
        return this;
    }

    /**
     * 事件时间
     * @return eventTime
     */
    public String getEventTime() {
        return eventTime;
    }

    public void setEventTime(String eventTime) {
        this.eventTime = eventTime;
    }

    public HttpQueryCfwAttackLogsResponseDTODataRecords withAttackType(String attackType) {
        this.attackType = attackType;
        return this;
    }

    /**
     * 攻击类型
     * @return attackType
     */
    public String getAttackType() {
        return attackType;
    }

    public void setAttackType(String attackType) {
        this.attackType = attackType;
    }

    public HttpQueryCfwAttackLogsResponseDTODataRecords withAttackRule(String attackRule) {
        this.attackRule = attackRule;
        return this;
    }

    /**
     * 攻击规则
     * @return attackRule
     */
    public String getAttackRule() {
        return attackRule;
    }

    public void setAttackRule(String attackRule) {
        this.attackRule = attackRule;
    }

    public HttpQueryCfwAttackLogsResponseDTODataRecords withLevel(String level) {
        this.level = level;
        return this;
    }

    /**
     * 威胁等级
     * @return level
     */
    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public HttpQueryCfwAttackLogsResponseDTODataRecords withSource(String source) {
        this.source = source;
        return this;
    }

    /**
     * 来源
     * @return source
     */
    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public HttpQueryCfwAttackLogsResponseDTODataRecords withPacketLength(Long packetLength) {
        this.packetLength = packetLength;
        return this;
    }

    /**
     * 报文长度
     * @return packetLength
     */
    public Long getPacketLength() {
        return packetLength;
    }

    public void setPacketLength(Long packetLength) {
        this.packetLength = packetLength;
    }

    public HttpQueryCfwAttackLogsResponseDTODataRecords withAttackRuleId(Integer attackRuleId) {
        this.attackRuleId = attackRuleId;
        return this;
    }

    /**
     * 攻击规则id
     * @return attackRuleId
     */
    public Integer getAttackRuleId() {
        return attackRuleId;
    }

    public void setAttackRuleId(Integer attackRuleId) {
        this.attackRuleId = attackRuleId;
    }

    public HttpQueryCfwAttackLogsResponseDTODataRecords withHitTime(Integer hitTime) {
        this.hitTime = hitTime;
        return this;
    }

    /**
     * 命中时间
     * @return hitTime
     */
    public Integer getHitTime() {
        return hitTime;
    }

    public void setHitTime(Integer hitTime) {
        this.hitTime = hitTime;
    }

    public HttpQueryCfwAttackLogsResponseDTODataRecords withLogId(String logId) {
        this.logId = logId;
        return this;
    }

    /**
     * 日志ID
     * @return logId
     */
    public String getLogId() {
        return logId;
    }

    public void setLogId(String logId) {
        this.logId = logId;
    }

    public HttpQueryCfwAttackLogsResponseDTODataRecords withSrcIp(String srcIp) {
        this.srcIp = srcIp;
        return this;
    }

    /**
     * 源IP
     * @return srcIp
     */
    public String getSrcIp() {
        return srcIp;
    }

    public void setSrcIp(String srcIp) {
        this.srcIp = srcIp;
    }

    public HttpQueryCfwAttackLogsResponseDTODataRecords withSrcPort(Integer srcPort) {
        this.srcPort = srcPort;
        return this;
    }

    /**
     * 源端口
     * minimum: 0
     * maximum: 65535
     * @return srcPort
     */
    public Integer getSrcPort() {
        return srcPort;
    }

    public void setSrcPort(Integer srcPort) {
        this.srcPort = srcPort;
    }

    public HttpQueryCfwAttackLogsResponseDTODataRecords withDstIp(String dstIp) {
        this.dstIp = dstIp;
        return this;
    }

    /**
     * 目的IP
     * @return dstIp
     */
    public String getDstIp() {
        return dstIp;
    }

    public void setDstIp(String dstIp) {
        this.dstIp = dstIp;
    }

    public HttpQueryCfwAttackLogsResponseDTODataRecords withDstPort(Integer dstPort) {
        this.dstPort = dstPort;
        return this;
    }

    /**
     * 目的端口
     * minimum: 0
     * maximum: 65535
     * @return dstPort
     */
    public Integer getDstPort() {
        return dstPort;
    }

    public void setDstPort(Integer dstPort) {
        this.dstPort = dstPort;
    }

    public HttpQueryCfwAttackLogsResponseDTODataRecords withProtocol(String protocol) {
        this.protocol = protocol;
        return this;
    }

    /**
     * 协议
     * @return protocol
     */
    public String getProtocol() {
        return protocol;
    }

    public void setProtocol(String protocol) {
        this.protocol = protocol;
    }

    public HttpQueryCfwAttackLogsResponseDTODataRecords withPacket(Packet packet) {
        this.packet = packet;
        return this;
    }

    public HttpQueryCfwAttackLogsResponseDTODataRecords withPacket(Consumer<Packet> packetSetter) {
        if (this.packet == null) {
            this.packet = new Packet();
            packetSetter.accept(this.packet);
        }

        return this;
    }

    /**
     * Get packet
     * @return packet
     */
    public Packet getPacket() {
        return packet;
    }

    public void setPacket(Packet packet) {
        this.packet = packet;
    }

    public HttpQueryCfwAttackLogsResponseDTODataRecords withApp(String app) {
        this.app = app;
        return this;
    }

    /**
     * 应用协议
     * @return app
     */
    public String getApp() {
        return app;
    }

    public void setApp(String app) {
        this.app = app;
    }

    public HttpQueryCfwAttackLogsResponseDTODataRecords withPacketMessages(List<PacketMessage> packetMessages) {
        this.packetMessages = packetMessages;
        return this;
    }

    public HttpQueryCfwAttackLogsResponseDTODataRecords addPacketMessagesItem(PacketMessage packetMessagesItem) {
        if (this.packetMessages == null) {
            this.packetMessages = new ArrayList<>();
        }
        this.packetMessages.add(packetMessagesItem);
        return this;
    }

    public HttpQueryCfwAttackLogsResponseDTODataRecords withPacketMessages(
        Consumer<List<PacketMessage>> packetMessagesSetter) {
        if (this.packetMessages == null) {
            this.packetMessages = new ArrayList<>();
        }
        packetMessagesSetter.accept(this.packetMessages);
        return this;
    }

    /**
     * 攻击报文信息
     * @return packetMessages
     */
    public List<PacketMessage> getPacketMessages() {
        return packetMessages;
    }

    public void setPacketMessages(List<PacketMessage> packetMessages) {
        this.packetMessages = packetMessages;
    }

    public HttpQueryCfwAttackLogsResponseDTODataRecords withDstHost(String dstHost) {
        this.dstHost = dstHost;
        return this;
    }

    /**
     * 目标主机
     * @return dstHost
     */
    public String getDstHost() {
        return dstHost;
    }

    public void setDstHost(String dstHost) {
        this.dstHost = dstHost;
    }

    public HttpQueryCfwAttackLogsResponseDTODataRecords withSrcRegionId(String srcRegionId) {
        this.srcRegionId = srcRegionId;
        return this;
    }

    /**
     * 源区域id
     * @return srcRegionId
     */
    public String getSrcRegionId() {
        return srcRegionId;
    }

    public void setSrcRegionId(String srcRegionId) {
        this.srcRegionId = srcRegionId;
    }

    public HttpQueryCfwAttackLogsResponseDTODataRecords withSrcRegionName(String srcRegionName) {
        this.srcRegionName = srcRegionName;
        return this;
    }

    /**
     * 源区域名称
     * @return srcRegionName
     */
    public String getSrcRegionName() {
        return srcRegionName;
    }

    public void setSrcRegionName(String srcRegionName) {
        this.srcRegionName = srcRegionName;
    }

    public HttpQueryCfwAttackLogsResponseDTODataRecords withDstRegionId(String dstRegionId) {
        this.dstRegionId = dstRegionId;
        return this;
    }

    /**
     * 目的区域id
     * @return dstRegionId
     */
    public String getDstRegionId() {
        return dstRegionId;
    }

    public void setDstRegionId(String dstRegionId) {
        this.dstRegionId = dstRegionId;
    }

    public HttpQueryCfwAttackLogsResponseDTODataRecords withDstRegionName(String dstRegionName) {
        this.dstRegionName = dstRegionName;
        return this;
    }

    /**
     * 目的区域名称
     * @return dstRegionName
     */
    public String getDstRegionName() {
        return dstRegionName;
    }

    public void setDstRegionName(String dstRegionName) {
        this.dstRegionName = dstRegionName;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        HttpQueryCfwAttackLogsResponseDTODataRecords that = (HttpQueryCfwAttackLogsResponseDTODataRecords) obj;
        return Objects.equals(this.direction, that.direction) && Objects.equals(this.action, that.action)
            && Objects.equals(this.eventTime, that.eventTime) && Objects.equals(this.attackType, that.attackType)
            && Objects.equals(this.attackRule, that.attackRule) && Objects.equals(this.level, that.level)
            && Objects.equals(this.source, that.source) && Objects.equals(this.packetLength, that.packetLength)
            && Objects.equals(this.attackRuleId, that.attackRuleId) && Objects.equals(this.hitTime, that.hitTime)
            && Objects.equals(this.logId, that.logId) && Objects.equals(this.srcIp, that.srcIp)
            && Objects.equals(this.srcPort, that.srcPort) && Objects.equals(this.dstIp, that.dstIp)
            && Objects.equals(this.dstPort, that.dstPort) && Objects.equals(this.protocol, that.protocol)
            && Objects.equals(this.packet, that.packet) && Objects.equals(this.app, that.app)
            && Objects.equals(this.packetMessages, that.packetMessages) && Objects.equals(this.dstHost, that.dstHost)
            && Objects.equals(this.srcRegionId, that.srcRegionId)
            && Objects.equals(this.srcRegionName, that.srcRegionName)
            && Objects.equals(this.dstRegionId, that.dstRegionId)
            && Objects.equals(this.dstRegionName, that.dstRegionName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(direction,
            action,
            eventTime,
            attackType,
            attackRule,
            level,
            source,
            packetLength,
            attackRuleId,
            hitTime,
            logId,
            srcIp,
            srcPort,
            dstIp,
            dstPort,
            protocol,
            packet,
            app,
            packetMessages,
            dstHost,
            srcRegionId,
            srcRegionName,
            dstRegionId,
            dstRegionName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class HttpQueryCfwAttackLogsResponseDTODataRecords {\n");
        sb.append("    direction: ").append(toIndentedString(direction)).append("\n");
        sb.append("    action: ").append(toIndentedString(action)).append("\n");
        sb.append("    eventTime: ").append(toIndentedString(eventTime)).append("\n");
        sb.append("    attackType: ").append(toIndentedString(attackType)).append("\n");
        sb.append("    attackRule: ").append(toIndentedString(attackRule)).append("\n");
        sb.append("    level: ").append(toIndentedString(level)).append("\n");
        sb.append("    source: ").append(toIndentedString(source)).append("\n");
        sb.append("    packetLength: ").append(toIndentedString(packetLength)).append("\n");
        sb.append("    attackRuleId: ").append(toIndentedString(attackRuleId)).append("\n");
        sb.append("    hitTime: ").append(toIndentedString(hitTime)).append("\n");
        sb.append("    logId: ").append(toIndentedString(logId)).append("\n");
        sb.append("    srcIp: ").append(toIndentedString(srcIp)).append("\n");
        sb.append("    srcPort: ").append(toIndentedString(srcPort)).append("\n");
        sb.append("    dstIp: ").append(toIndentedString(dstIp)).append("\n");
        sb.append("    dstPort: ").append(toIndentedString(dstPort)).append("\n");
        sb.append("    protocol: ").append(toIndentedString(protocol)).append("\n");
        sb.append("    packet: ").append(toIndentedString(packet)).append("\n");
        sb.append("    app: ").append(toIndentedString(app)).append("\n");
        sb.append("    packetMessages: ").append(toIndentedString(packetMessages)).append("\n");
        sb.append("    dstHost: ").append(toIndentedString(dstHost)).append("\n");
        sb.append("    srcRegionId: ").append(toIndentedString(srcRegionId)).append("\n");
        sb.append("    srcRegionName: ").append(toIndentedString(srcRegionName)).append("\n");
        sb.append("    dstRegionId: ").append(toIndentedString(dstRegionId)).append("\n");
        sb.append("    dstRegionName: ").append(toIndentedString(dstRegionName)).append("\n");
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
