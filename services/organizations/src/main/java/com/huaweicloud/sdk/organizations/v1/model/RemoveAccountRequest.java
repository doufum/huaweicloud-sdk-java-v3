package com.huaweicloud.sdk.organizations.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class RemoveAccountRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "account_id")

    private String accountId;

    public RemoveAccountRequest withAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }

    /**
     * 帐号的唯一标识符（ID）。
     * @return accountId
     */
    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RemoveAccountRequest that = (RemoveAccountRequest) obj;
        return Objects.equals(this.accountId, that.accountId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(accountId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RemoveAccountRequest {\n");
        sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
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
