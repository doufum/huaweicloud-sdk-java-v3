package com.huaweicloud.sdk.rds.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 查询可恢复库的响应信息
 */
public class PostgreSQLRestoreDatabaseInstance {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "restore_time")

    private Long restoreTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_id")

    private String instanceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "databases")

    private List<PostgreSQLRestoreDatabaseInfo> databases = null;

    public PostgreSQLRestoreDatabaseInstance withRestoreTime(Long restoreTime) {
        this.restoreTime = restoreTime;
        return this;
    }

    /**
     * 恢复时间
     * @return restoreTime
     */
    public Long getRestoreTime() {
        return restoreTime;
    }

    public void setRestoreTime(Long restoreTime) {
        this.restoreTime = restoreTime;
    }

    public PostgreSQLRestoreDatabaseInstance withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * 实例ID
     * @return instanceId
     */
    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public PostgreSQLRestoreDatabaseInstance withDatabases(List<PostgreSQLRestoreDatabaseInfo> databases) {
        this.databases = databases;
        return this;
    }

    public PostgreSQLRestoreDatabaseInstance addDatabasesItem(PostgreSQLRestoreDatabaseInfo databasesItem) {
        if (this.databases == null) {
            this.databases = new ArrayList<>();
        }
        this.databases.add(databasesItem);
        return this;
    }

    public PostgreSQLRestoreDatabaseInstance withDatabases(
        Consumer<List<PostgreSQLRestoreDatabaseInfo>> databasesSetter) {
        if (this.databases == null) {
            this.databases = new ArrayList<>();
        }
        databasesSetter.accept(this.databases);
        return this;
    }

    /**
     * 库信息
     * @return databases
     */
    public List<PostgreSQLRestoreDatabaseInfo> getDatabases() {
        return databases;
    }

    public void setDatabases(List<PostgreSQLRestoreDatabaseInfo> databases) {
        this.databases = databases;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PostgreSQLRestoreDatabaseInstance that = (PostgreSQLRestoreDatabaseInstance) obj;
        return Objects.equals(this.restoreTime, that.restoreTime) && Objects.equals(this.instanceId, that.instanceId)
            && Objects.equals(this.databases, that.databases);
    }

    @Override
    public int hashCode() {
        return Objects.hash(restoreTime, instanceId, databases);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PostgreSQLRestoreDatabaseInstance {\n");
        sb.append("    restoreTime: ").append(toIndentedString(restoreTime)).append("\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
        sb.append("    databases: ").append(toIndentedString(databases)).append("\n");
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
