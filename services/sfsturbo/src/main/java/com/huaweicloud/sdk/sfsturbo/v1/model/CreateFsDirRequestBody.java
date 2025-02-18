package com.huaweicloud.sdk.sfsturbo.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 创建目录请求
 */
public class CreateFsDirRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "path")

    private String path;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "mode")

    private Long mode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "uid")

    private Long uid;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "gid")

    private Long gid;

    public CreateFsDirRequestBody withPath(String path) {
        this.path = path;
        return this;
    }

    /**
     * 合法的的目录全路径
     * @return path
     */
    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public CreateFsDirRequestBody withMode(Long mode) {
        this.mode = mode;
        return this;
    }

    /**
     * 目录权限
     * minimum: 0
     * @return mode
     */
    public Long getMode() {
        return mode;
    }

    public void setMode(Long mode) {
        this.mode = mode;
    }

    public CreateFsDirRequestBody withUid(Long uid) {
        this.uid = uid;
        return this;
    }

    /**
     * 用户id
     * minimum: 0
     * @return uid
     */
    public Long getUid() {
        return uid;
    }

    public void setUid(Long uid) {
        this.uid = uid;
    }

    public CreateFsDirRequestBody withGid(Long gid) {
        this.gid = gid;
        return this;
    }

    /**
     * 用户组id
     * minimum: 0
     * @return gid
     */
    public Long getGid() {
        return gid;
    }

    public void setGid(Long gid) {
        this.gid = gid;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateFsDirRequestBody that = (CreateFsDirRequestBody) obj;
        return Objects.equals(this.path, that.path) && Objects.equals(this.mode, that.mode)
            && Objects.equals(this.uid, that.uid) && Objects.equals(this.gid, that.gid);
    }

    @Override
    public int hashCode() {
        return Objects.hash(path, mode, uid, gid);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateFsDirRequestBody {\n");
        sb.append("    path: ").append(toIndentedString(path)).append("\n");
        sb.append("    mode: ").append(toIndentedString(mode)).append("\n");
        sb.append("    uid: ").append(toIndentedString(uid)).append("\n");
        sb.append("    gid: ").append(toIndentedString(gid)).append("\n");
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
