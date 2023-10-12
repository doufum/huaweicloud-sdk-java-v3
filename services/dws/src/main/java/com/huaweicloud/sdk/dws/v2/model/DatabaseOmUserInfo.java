package com.huaweicloud.sdk.dws.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.LocalDate;
import java.util.Objects;

/**
 * 数据库运维账户信息 包含账户状态  账户过期时间（时间戳）
 */
public class DatabaseOmUserInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "om_user_status")

    private String omUserStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "om_user_expires_time")

    private LocalDate omUserExpiresTime;

    public DatabaseOmUserInfo withOmUserStatus(String omUserStatus) {
        this.omUserStatus = omUserStatus;
        return this;
    }

    /**
     * 运维账户状态
     * @return omUserStatus
     */
    public String getOmUserStatus() {
        return omUserStatus;
    }

    public void setOmUserStatus(String omUserStatus) {
        this.omUserStatus = omUserStatus;
    }

    public DatabaseOmUserInfo withOmUserExpiresTime(LocalDate omUserExpiresTime) {
        this.omUserExpiresTime = omUserExpiresTime;
        return this;
    }

    /**
     * 运维账户过期状态
     * @return omUserExpiresTime
     */
    public LocalDate getOmUserExpiresTime() {
        return omUserExpiresTime;
    }

    public void setOmUserExpiresTime(LocalDate omUserExpiresTime) {
        this.omUserExpiresTime = omUserExpiresTime;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DatabaseOmUserInfo that = (DatabaseOmUserInfo) obj;
        return Objects.equals(this.omUserStatus, that.omUserStatus)
            && Objects.equals(this.omUserExpiresTime, that.omUserExpiresTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(omUserStatus, omUserExpiresTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DatabaseOmUserInfo {\n");
        sb.append("    omUserStatus: ").append(toIndentedString(omUserStatus)).append("\n");
        sb.append("    omUserExpiresTime: ").append(toIndentedString(omUserExpiresTime)).append("\n");
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
