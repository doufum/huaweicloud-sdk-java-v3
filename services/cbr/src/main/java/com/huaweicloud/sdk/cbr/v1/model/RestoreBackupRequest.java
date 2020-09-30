package com.huaweicloud.sdk.cbr.v1.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.cbr.v1.model.BackupRestoreReq;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Request Object
 */
public class RestoreBackupRequest  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="backup_id")
    
    private String backupId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="body")
    
    private BackupRestoreReq body = null;

    public RestoreBackupRequest withBackupId(String backupId) {
        this.backupId = backupId;
        return this;
    }

    


    /**
     * Get backupId
     * @return backupId
     */
    public String getBackupId() {
        return backupId;
    }

    public void setBackupId(String backupId) {
        this.backupId = backupId;
    }

    public RestoreBackupRequest withBody(BackupRestoreReq body) {
        this.body = body;
        return this;
    }

    public RestoreBackupRequest withBody(Consumer<BackupRestoreReq> bodySetter) {
        if(this.body == null ){
            this.body = new BackupRestoreReq();
            bodySetter.accept(this.body);
        }
        
        return this;
    }


    /**
     * Get body
     * @return body
     */
    public BackupRestoreReq getBody() {
        return body;
    }

    public void setBody(BackupRestoreReq body) {
        this.body = body;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RestoreBackupRequest restoreBackupRequest = (RestoreBackupRequest) o;
        return Objects.equals(this.backupId, restoreBackupRequest.backupId) &&
            Objects.equals(this.body, restoreBackupRequest.body);
    }
    @Override
    public int hashCode() {
        return Objects.hash(backupId, body);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RestoreBackupRequest {\n");
        sb.append("    backupId: ").append(toIndentedString(backupId)).append("\n");
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

