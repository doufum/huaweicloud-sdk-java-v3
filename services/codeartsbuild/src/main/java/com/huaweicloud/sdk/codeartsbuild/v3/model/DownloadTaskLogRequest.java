package com.huaweicloud.sdk.codeartsbuild.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.progress.ProgressListener;
import com.huaweicloud.sdk.core.progress.ProgressRequest;

import java.util.Objects;

/**
 * Request Object
 */
public class DownloadTaskLogRequest implements ProgressRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "record_id")

    private String recordId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_name")

    private String taskName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "log_level")

    private String logLevel;

    private ProgressListener progressListener;

    private long progressInterval;

    @Override
    public void setProgressListener(ProgressListener progressListener) {
        this.progressListener = progressListener;
    }

    @Override
    public ProgressListener getProgressListener() {
        return progressListener;
    }

    @Override
    public void setProgressInterval(long progressInterval) {
        this.progressInterval = progressInterval;
    }

    @Override
    public long getProgressInterval() {
        return progressInterval;
    }

    public DownloadTaskLogRequest withRecordId(String recordId) {
        this.recordId = recordId;
        return this;
    }

    /**
     * 记录ID,36位数字、小写字母、'-'组组合。
     * @return recordId
     */
    public String getRecordId() {
        return recordId;
    }

    public void setRecordId(String recordId) {
        this.recordId = recordId;
    }

    public DownloadTaskLogRequest withTaskName(String taskName) {
        this.taskName = taskName;
        return this;
    }

    /**
     * 记录ID,36位数字、小写字母、'-'组组合。
     * @return taskName
     */
    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public DownloadTaskLogRequest withLogLevel(String logLevel) {
        this.logLevel = logLevel;
        return this;
    }

    /**
     * 日志等级 值为INFO | DEBUG。
     * @return logLevel
     */
    public String getLogLevel() {
        return logLevel;
    }

    public void setLogLevel(String logLevel) {
        this.logLevel = logLevel;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DownloadTaskLogRequest that = (DownloadTaskLogRequest) obj;
        return Objects.equals(this.recordId, that.recordId) && Objects.equals(this.taskName, that.taskName)
            && Objects.equals(this.logLevel, that.logLevel);
    }

    @Override
    public int hashCode() {
        return Objects.hash(recordId, taskName, logLevel);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DownloadTaskLogRequest {\n");
        sb.append("    recordId: ").append(toIndentedString(recordId)).append("\n");
        sb.append("    taskName: ").append(toIndentedString(taskName)).append("\n");
        sb.append("    logLevel: ").append(toIndentedString(logLevel)).append("\n");
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
