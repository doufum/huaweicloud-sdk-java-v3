package com.huaweicloud.sdk.lakeformation.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * Response Object
 */
public class UpdateRoleResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "role_name")

    private String roleName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    /**
     * 主体来源 IAM云用户 SAML联邦 LDAP ld用户 LOCAL 本地用户 AGENTTENANT 委托 OTHER 其它
     */
    public static final class PrincipalSourceEnum {

        /**
         * Enum IAM for value: "IAM"
         */
        public static final PrincipalSourceEnum IAM = new PrincipalSourceEnum("IAM");

        /**
         * Enum SAML for value: "SAML"
         */
        public static final PrincipalSourceEnum SAML = new PrincipalSourceEnum("SAML");

        /**
         * Enum LDAP for value: "LDAP"
         */
        public static final PrincipalSourceEnum LDAP = new PrincipalSourceEnum("LDAP");

        /**
         * Enum LOCAL for value: "LOCAL"
         */
        public static final PrincipalSourceEnum LOCAL = new PrincipalSourceEnum("LOCAL");

        /**
         * Enum AGENTTENANT for value: "AGENTTENANT"
         */
        public static final PrincipalSourceEnum AGENTTENANT = new PrincipalSourceEnum("AGENTTENANT");

        /**
         * Enum OTHER for value: "OTHER"
         */
        public static final PrincipalSourceEnum OTHER = new PrincipalSourceEnum("OTHER");

        private static final Map<String, PrincipalSourceEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, PrincipalSourceEnum> createStaticFields() {
            Map<String, PrincipalSourceEnum> map = new HashMap<>();
            map.put("IAM", IAM);
            map.put("SAML", SAML);
            map.put("LDAP", LDAP);
            map.put("LOCAL", LOCAL);
            map.put("AGENTTENANT", AGENTTENANT);
            map.put("OTHER", OTHER);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        PrincipalSourceEnum(String value) {
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
        public static PrincipalSourceEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new PrincipalSourceEnum(value));
        }

        public static PrincipalSourceEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof PrincipalSourceEnum) {
                return this.value.equals(((PrincipalSourceEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "principal_source")

    private PrincipalSourceEnum principalSource;

    public UpdateRoleResponse withRoleName(String roleName) {
        this.roleName = roleName;
        return this;
    }

    /**
     * 角色名称。只能包含字母、数字和下划线，且长度为1~255个字符。
     * @return roleName
     */
    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public UpdateRoleResponse withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 描述信息。最大长度为4000个字符。当无描述信息时，则description值为null，当值为null时，响应Body无该参数。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public UpdateRoleResponse withPrincipalSource(PrincipalSourceEnum principalSource) {
        this.principalSource = principalSource;
        return this;
    }

    /**
     * 主体来源 IAM云用户 SAML联邦 LDAP ld用户 LOCAL 本地用户 AGENTTENANT 委托 OTHER 其它
     * @return principalSource
     */
    public PrincipalSourceEnum getPrincipalSource() {
        return principalSource;
    }

    public void setPrincipalSource(PrincipalSourceEnum principalSource) {
        this.principalSource = principalSource;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateRoleResponse that = (UpdateRoleResponse) obj;
        return Objects.equals(this.roleName, that.roleName) && Objects.equals(this.description, that.description)
            && Objects.equals(this.principalSource, that.principalSource);
    }

    @Override
    public int hashCode() {
        return Objects.hash(roleName, description, principalSource);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateRoleResponse {\n");
        sb.append("    roleName: ").append(toIndentedString(roleName)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    principalSource: ").append(toIndentedString(principalSource)).append("\n");
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
