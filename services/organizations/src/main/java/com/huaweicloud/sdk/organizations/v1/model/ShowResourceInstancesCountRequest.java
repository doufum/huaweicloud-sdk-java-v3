package com.huaweicloud.sdk.organizations.v1.model;

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
 * Request Object
 */
public class ShowResourceInstancesCountRequest {

    /**
     * 资源类型 organizations:policies服务策略 organizations:ous组织OU organizations:accounts 帐号信息 organizations:roots根
     */
    public static final class ResourceTypeEnum {

        /**
         * Enum ORGANIZATIONS_ROOTS for value: "organizations:roots"
         */
        public static final ResourceTypeEnum ORGANIZATIONS_ROOTS = new ResourceTypeEnum("organizations:roots");

        /**
         * Enum ORGANIZATIONS_OUS for value: "organizations:ous"
         */
        public static final ResourceTypeEnum ORGANIZATIONS_OUS = new ResourceTypeEnum("organizations:ous");

        /**
         * Enum ORGANIZATIONS_ACCOUNTS for value: "organizations:accounts"
         */
        public static final ResourceTypeEnum ORGANIZATIONS_ACCOUNTS = new ResourceTypeEnum("organizations:accounts");

        /**
         * Enum ORGANIZATIONS_POLICIES for value: "organizations:policies"
         */
        public static final ResourceTypeEnum ORGANIZATIONS_POLICIES = new ResourceTypeEnum("organizations:policies");

        private static final Map<String, ResourceTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ResourceTypeEnum> createStaticFields() {
            Map<String, ResourceTypeEnum> map = new HashMap<>();
            map.put("organizations:roots", ORGANIZATIONS_ROOTS);
            map.put("organizations:ous", ORGANIZATIONS_OUS);
            map.put("organizations:accounts", ORGANIZATIONS_ACCOUNTS);
            map.put("organizations:policies", ORGANIZATIONS_POLICIES);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ResourceTypeEnum(String value) {
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
        public static ResourceTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new ResourceTypeEnum(value));
        }

        public static ResourceTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ResourceTypeEnum) {
                return this.value.equals(((ResourceTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_type")

    private ResourceTypeEnum resourceType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private ResourceInstanceReqBody body;

    public ShowResourceInstancesCountRequest withResourceType(ResourceTypeEnum resourceType) {
        this.resourceType = resourceType;
        return this;
    }

    /**
     * 资源类型 organizations:policies服务策略 organizations:ous组织OU organizations:accounts 帐号信息 organizations:roots根
     * @return resourceType
     */
    public ResourceTypeEnum getResourceType() {
        return resourceType;
    }

    public void setResourceType(ResourceTypeEnum resourceType) {
        this.resourceType = resourceType;
    }

    public ShowResourceInstancesCountRequest withBody(ResourceInstanceReqBody body) {
        this.body = body;
        return this;
    }

    public ShowResourceInstancesCountRequest withBody(Consumer<ResourceInstanceReqBody> bodySetter) {
        if (this.body == null) {
            this.body = new ResourceInstanceReqBody();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public ResourceInstanceReqBody getBody() {
        return body;
    }

    public void setBody(ResourceInstanceReqBody body) {
        this.body = body;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowResourceInstancesCountRequest that = (ShowResourceInstancesCountRequest) obj;
        return Objects.equals(this.resourceType, that.resourceType) && Objects.equals(this.body, that.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(resourceType, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowResourceInstancesCountRequest {\n");
        sb.append("    resourceType: ").append(toIndentedString(resourceType)).append("\n");
        sb.append("    body: ").append(toIndentedString(body)).append("\n");
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
