package com.huaweicloud.sdk.cce.v3.model;




import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.cce.v3.model.RemoveNodesSpec;
import com.huaweicloud.sdk.cce.v3.model.TaskStatus;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class RemoveNodeResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="apiVersion")
    
    private String apiVersion;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="kind")
    
    private String kind;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="spec")
    
    private RemoveNodesSpec spec;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="status")
    
    private TaskStatus status;

    public RemoveNodeResponse withApiVersion(String apiVersion) {
        this.apiVersion = apiVersion;
        return this;
    }

    


    /**
     * API版本，固定值“v3”。
     * @return apiVersion
     */
    public String getApiVersion() {
        return apiVersion;
    }

    public void setApiVersion(String apiVersion) {
        this.apiVersion = apiVersion;
    }

    

    public RemoveNodeResponse withKind(String kind) {
        this.kind = kind;
        return this;
    }

    


    /**
     * API类型，固定值“RemoveNodesTask”。
     * @return kind
     */
    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    

    public RemoveNodeResponse withSpec(RemoveNodesSpec spec) {
        this.spec = spec;
        return this;
    }

    public RemoveNodeResponse withSpec(Consumer<RemoveNodesSpec> specSetter) {
        if(this.spec == null ){
            this.spec = new RemoveNodesSpec();
            specSetter.accept(this.spec);
        }
        
        return this;
    }


    /**
     * Get spec
     * @return spec
     */
    public RemoveNodesSpec getSpec() {
        return spec;
    }

    public void setSpec(RemoveNodesSpec spec) {
        this.spec = spec;
    }

    

    public RemoveNodeResponse withStatus(TaskStatus status) {
        this.status = status;
        return this;
    }

    public RemoveNodeResponse withStatus(Consumer<TaskStatus> statusSetter) {
        if(this.status == null ){
            this.status = new TaskStatus();
            statusSetter.accept(this.status);
        }
        
        return this;
    }


    /**
     * Get status
     * @return status
     */
    public TaskStatus getStatus() {
        return status;
    }

    public void setStatus(TaskStatus status) {
        this.status = status;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RemoveNodeResponse removeNodeResponse = (RemoveNodeResponse) o;
        return Objects.equals(this.apiVersion, removeNodeResponse.apiVersion) &&
            Objects.equals(this.kind, removeNodeResponse.kind) &&
            Objects.equals(this.spec, removeNodeResponse.spec) &&
            Objects.equals(this.status, removeNodeResponse.status);
    }
    @Override
    public int hashCode() {
        return Objects.hash(apiVersion, kind, spec, status);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RemoveNodeResponse {\n");
        sb.append("    apiVersion: ").append(toIndentedString(apiVersion)).append("\n");
        sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
        sb.append("    spec: ").append(toIndentedString(spec)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

