package com.huaweicloud.sdk.nat.v2.model;

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
 * 公网NAT网关实例的响应体。
 */
public class NatGatewayResponseBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tenant_id")

    private String tenantId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    /**
     * 公网NAT网关的规格。 取值为： “1”：小型，SNAT最大连接数10000 “2”：中型，SNAT最大连接数50000 “3”：大型，SNAT最大连接数200000 “4”：超大型，SNAT最大连接数1000000 
     */
    public static final class SpecEnum {

        /**
         * Enum _1 for value: "1"
         */
        public static final SpecEnum _1 = new SpecEnum("1");

        /**
         * Enum _2 for value: "2"
         */
        public static final SpecEnum _2 = new SpecEnum("2");

        /**
         * Enum _3 for value: "3"
         */
        public static final SpecEnum _3 = new SpecEnum("3");

        /**
         * Enum _4 for value: "4"
         */
        public static final SpecEnum _4 = new SpecEnum("4");

        private static final Map<String, SpecEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, SpecEnum> createStaticFields() {
            Map<String, SpecEnum> map = new HashMap<>();
            map.put("1", _1);
            map.put("2", _2);
            map.put("3", _3);
            map.put("4", _4);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        SpecEnum(String value) {
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
        public static SpecEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new SpecEnum(value));
        }

        public static SpecEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof SpecEnum) {
                return this.value.equals(((SpecEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "spec")

    private SpecEnum spec;

    /**
     * 公网NAT网关实例的状态。 取值为： \"ACTIVE\": 可用 \"PENDING_CREATE\"：创建中 \"PENDING_UPDATE\"：更新中 \"PENDING_DELETE\"：删除中 \"INACTIVE\"：不可用
     */
    public static final class StatusEnum {

        /**
         * Enum ACTIVE for value: "ACTIVE"
         */
        public static final StatusEnum ACTIVE = new StatusEnum("ACTIVE");

        /**
         * Enum PENDING_CREATE for value: "PENDING_CREATE"
         */
        public static final StatusEnum PENDING_CREATE = new StatusEnum("PENDING_CREATE");

        /**
         * Enum PENDING_UPDATE for value: "PENDING_UPDATE"
         */
        public static final StatusEnum PENDING_UPDATE = new StatusEnum("PENDING_UPDATE");

        /**
         * Enum PENDING_DELETE for value: "PENDING_DELETE"
         */
        public static final StatusEnum PENDING_DELETE = new StatusEnum("PENDING_DELETE");

        /**
         * Enum INACTIVE for value: "INACTIVE"
         */
        public static final StatusEnum INACTIVE = new StatusEnum("INACTIVE");

        private static final Map<String, StatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, StatusEnum> createStaticFields() {
            Map<String, StatusEnum> map = new HashMap<>();
            map.put("ACTIVE", ACTIVE);
            map.put("PENDING_CREATE", PENDING_CREATE);
            map.put("PENDING_UPDATE", PENDING_UPDATE);
            map.put("PENDING_DELETE", PENDING_DELETE);
            map.put("INACTIVE", INACTIVE);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        StatusEnum(String value) {
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
        public static StatusEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new StatusEnum(value));
        }

        public static StatusEnum valueOf(String value) {
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
    @JsonProperty(value = "admin_state_up")

    private Boolean adminStateUp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_at")

    private String createdAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "router_id")

    private String routerId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "internal_network_id")

    private String internalNetworkId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_project_id")

    private String enterpriseProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "session_conf")

    private SessionConfiguration sessionConf;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ngport_ip_address")

    private String ngportIpAddress;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "billing_info")

    private String billingInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dnat_rules_limit")

    private Long dnatRulesLimit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "snat_rule_public_ip_limit")

    private Integer snatRulePublicIpLimit;

    public NatGatewayResponseBody withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 公网NAT网关实例的ID。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public NatGatewayResponseBody withTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }

    /**
     * 项目的ID。
     * @return tenantId
     */
    public String getTenantId() {
        return tenantId;
    }

    public void setTenantId(String tenantId) {
        this.tenantId = tenantId;
    }

    public NatGatewayResponseBody withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 公网NAT网关实例的名字，长度限制为64。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public NatGatewayResponseBody withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 公网NAT网关实例的描述，长度范围小于等于255个字符，不能包含<>
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public NatGatewayResponseBody withSpec(SpecEnum spec) {
        this.spec = spec;
        return this;
    }

    /**
     * 公网NAT网关的规格。 取值为： “1”：小型，SNAT最大连接数10000 “2”：中型，SNAT最大连接数50000 “3”：大型，SNAT最大连接数200000 “4”：超大型，SNAT最大连接数1000000 
     * @return spec
     */
    public SpecEnum getSpec() {
        return spec;
    }

    public void setSpec(SpecEnum spec) {
        this.spec = spec;
    }

    public NatGatewayResponseBody withStatus(StatusEnum status) {
        this.status = status;
        return this;
    }

    /**
     * 公网NAT网关实例的状态。 取值为： \"ACTIVE\": 可用 \"PENDING_CREATE\"：创建中 \"PENDING_UPDATE\"：更新中 \"PENDING_DELETE\"：删除中 \"INACTIVE\"：不可用
     * @return status
     */
    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    public NatGatewayResponseBody withAdminStateUp(Boolean adminStateUp) {
        this.adminStateUp = adminStateUp;
        return this;
    }

    /**
     * 解冻/冻结状态。 取值范围： - \"true\"：解冻 - \"false\"：冻结
     * @return adminStateUp
     */
    public Boolean getAdminStateUp() {
        return adminStateUp;
    }

    public void setAdminStateUp(Boolean adminStateUp) {
        this.adminStateUp = adminStateUp;
    }

    public NatGatewayResponseBody withCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * 公网NAT网关实例的创建时间，格式是yyyy-mm-dd hh:mm:ss.SSSSSS。
     * @return createdAt
     */
    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public NatGatewayResponseBody withRouterId(String routerId) {
        this.routerId = routerId;
        return this;
    }

    /**
     * VPC的id。
     * @return routerId
     */
    public String getRouterId() {
        return routerId;
    }

    public void setRouterId(String routerId) {
        this.routerId = routerId;
    }

    public NatGatewayResponseBody withInternalNetworkId(String internalNetworkId) {
        this.internalNetworkId = internalNetworkId;
        return this;
    }

    /**
     * 公网NAT网关下行口（DVR的下一跳）所属的network id。
     * @return internalNetworkId
     */
    public String getInternalNetworkId() {
        return internalNetworkId;
    }

    public void setInternalNetworkId(String internalNetworkId) {
        this.internalNetworkId = internalNetworkId;
    }

    public NatGatewayResponseBody withEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
        return this;
    }

    /**
     * 企业项目ID。 创建公网NAT网关实例时，关联的企业项目ID。
     * @return enterpriseProjectId
     */
    public String getEnterpriseProjectId() {
        return enterpriseProjectId;
    }

    public void setEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
    }

    public NatGatewayResponseBody withSessionConf(SessionConfiguration sessionConf) {
        this.sessionConf = sessionConf;
        return this;
    }

    public NatGatewayResponseBody withSessionConf(Consumer<SessionConfiguration> sessionConfSetter) {
        if (this.sessionConf == null) {
            this.sessionConf = new SessionConfiguration();
            sessionConfSetter.accept(this.sessionConf);
        }

        return this;
    }

    /**
     * Get sessionConf
     * @return sessionConf
     */
    public SessionConfiguration getSessionConf() {
        return sessionConf;
    }

    public void setSessionConf(SessionConfiguration sessionConf) {
        this.sessionConf = sessionConf;
    }

    public NatGatewayResponseBody withNgportIpAddress(String ngportIpAddress) {
        this.ngportIpAddress = ngportIpAddress;
        return this;
    }

    /**
     * 公网NAT网关私有IP地址，由VPC中子网分配。
     * @return ngportIpAddress
     */
    public String getNgportIpAddress() {
        return ngportIpAddress;
    }

    public void setNgportIpAddress(String ngportIpAddress) {
        this.ngportIpAddress = ngportIpAddress;
    }

    public NatGatewayResponseBody withBillingInfo(String billingInfo) {
        this.billingInfo = billingInfo;
        return this;
    }

    /**
     * 订单信息。此字段只有在订购包周期资源时才会有订单信息，而在订购按需资源时则为空。
     * @return billingInfo
     */
    public String getBillingInfo() {
        return billingInfo;
    }

    public void setBillingInfo(String billingInfo) {
        this.billingInfo = billingInfo;
    }

    public NatGatewayResponseBody withDnatRulesLimit(Long dnatRulesLimit) {
        this.dnatRulesLimit = dnatRulesLimit;
        return this;
    }

    /**
     * 公网NAT网关下DNAT规则数量限制，默认为200。
     * minimum: 1
     * maximum: 100000
     * @return dnatRulesLimit
     */
    public Long getDnatRulesLimit() {
        return dnatRulesLimit;
    }

    public void setDnatRulesLimit(Long dnatRulesLimit) {
        this.dnatRulesLimit = dnatRulesLimit;
    }

    public NatGatewayResponseBody withSnatRulePublicIpLimit(Integer snatRulePublicIpLimit) {
        this.snatRulePublicIpLimit = snatRulePublicIpLimit;
        return this;
    }

    /**
     * 公网NAT网关下SNAT规则EIP池中EIP数量限制，默认为20。
     * minimum: 1
     * maximum: 100
     * @return snatRulePublicIpLimit
     */
    public Integer getSnatRulePublicIpLimit() {
        return snatRulePublicIpLimit;
    }

    public void setSnatRulePublicIpLimit(Integer snatRulePublicIpLimit) {
        this.snatRulePublicIpLimit = snatRulePublicIpLimit;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        NatGatewayResponseBody that = (NatGatewayResponseBody) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.tenantId, that.tenantId)
            && Objects.equals(this.name, that.name) && Objects.equals(this.description, that.description)
            && Objects.equals(this.spec, that.spec) && Objects.equals(this.status, that.status)
            && Objects.equals(this.adminStateUp, that.adminStateUp) && Objects.equals(this.createdAt, that.createdAt)
            && Objects.equals(this.routerId, that.routerId)
            && Objects.equals(this.internalNetworkId, that.internalNetworkId)
            && Objects.equals(this.enterpriseProjectId, that.enterpriseProjectId)
            && Objects.equals(this.sessionConf, that.sessionConf)
            && Objects.equals(this.ngportIpAddress, that.ngportIpAddress)
            && Objects.equals(this.billingInfo, that.billingInfo)
            && Objects.equals(this.dnatRulesLimit, that.dnatRulesLimit)
            && Objects.equals(this.snatRulePublicIpLimit, that.snatRulePublicIpLimit);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            tenantId,
            name,
            description,
            spec,
            status,
            adminStateUp,
            createdAt,
            routerId,
            internalNetworkId,
            enterpriseProjectId,
            sessionConf,
            ngportIpAddress,
            billingInfo,
            dnatRulesLimit,
            snatRulePublicIpLimit);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class NatGatewayResponseBody {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    spec: ").append(toIndentedString(spec)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    adminStateUp: ").append(toIndentedString(adminStateUp)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    routerId: ").append(toIndentedString(routerId)).append("\n");
        sb.append("    internalNetworkId: ").append(toIndentedString(internalNetworkId)).append("\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
        sb.append("    sessionConf: ").append(toIndentedString(sessionConf)).append("\n");
        sb.append("    ngportIpAddress: ").append(toIndentedString(ngportIpAddress)).append("\n");
        sb.append("    billingInfo: ").append(toIndentedString(billingInfo)).append("\n");
        sb.append("    dnatRulesLimit: ").append(toIndentedString(dnatRulesLimit)).append("\n");
        sb.append("    snatRulePublicIpLimit: ").append(toIndentedString(snatRulePublicIpLimit)).append("\n");
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
