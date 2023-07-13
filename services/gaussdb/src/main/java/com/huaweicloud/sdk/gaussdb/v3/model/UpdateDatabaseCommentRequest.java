package com.huaweicloud.sdk.gaussdb.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 修改数据库备注请求体。
 */
public class UpdateDatabaseCommentRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "databases")

    private List<UpdateDatabaseComment> databases = null;

    public UpdateDatabaseCommentRequest withDatabases(List<UpdateDatabaseComment> databases) {
        this.databases = databases;
        return this;
    }

    public UpdateDatabaseCommentRequest addDatabasesItem(UpdateDatabaseComment databasesItem) {
        if (this.databases == null) {
            this.databases = new ArrayList<>();
        }
        this.databases.add(databasesItem);
        return this;
    }

    public UpdateDatabaseCommentRequest withDatabases(Consumer<List<UpdateDatabaseComment>> databasesSetter) {
        if (this.databases == null) {
            this.databases = new ArrayList<>();
        }
        databasesSetter.accept(this.databases);
        return this;
    }

    /**
     * 准备修改备注的数据库列表，列表最大长度为50。
     * @return databases
     */
    public List<UpdateDatabaseComment> getDatabases() {
        return databases;
    }

    public void setDatabases(List<UpdateDatabaseComment> databases) {
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
        UpdateDatabaseCommentRequest that = (UpdateDatabaseCommentRequest) obj;
        return Objects.equals(this.databases, that.databases);
    }

    @Override
    public int hashCode() {
        return Objects.hash(databases);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateDatabaseCommentRequest {\n");
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
