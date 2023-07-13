package com.huaweicloud.sdk.vpc.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 
 */
public class NeutronUpdateSecurityGroupRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "security_group")

    private NeutronUpdateSecurityGroupOption securityGroup;

    public NeutronUpdateSecurityGroupRequestBody withSecurityGroup(NeutronUpdateSecurityGroupOption securityGroup) {
        this.securityGroup = securityGroup;
        return this;
    }

    public NeutronUpdateSecurityGroupRequestBody withSecurityGroup(
        Consumer<NeutronUpdateSecurityGroupOption> securityGroupSetter) {
        if (this.securityGroup == null) {
            this.securityGroup = new NeutronUpdateSecurityGroupOption();
            securityGroupSetter.accept(this.securityGroup);
        }

        return this;
    }

    /**
     * Get securityGroup
     * @return securityGroup
     */
    public NeutronUpdateSecurityGroupOption getSecurityGroup() {
        return securityGroup;
    }

    public void setSecurityGroup(NeutronUpdateSecurityGroupOption securityGroup) {
        this.securityGroup = securityGroup;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        NeutronUpdateSecurityGroupRequestBody that = (NeutronUpdateSecurityGroupRequestBody) obj;
        return Objects.equals(this.securityGroup, that.securityGroup);
    }

    @Override
    public int hashCode() {
        return Objects.hash(securityGroup);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class NeutronUpdateSecurityGroupRequestBody {\n");
        sb.append("    securityGroup: ").append(toIndentedString(securityGroup)).append("\n");
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
