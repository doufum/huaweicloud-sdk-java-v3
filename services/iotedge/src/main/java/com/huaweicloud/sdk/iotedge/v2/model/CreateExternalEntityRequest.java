package com.huaweicloud.sdk.iotedge.v2.model;






import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.iotedge.v2.model.CreateExternalEntityReqDTO;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Request Object
 */
public class CreateExternalEntityRequest  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="edge_node_id")
    
    
    private String edgeNodeId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="body")
    
    
    private CreateExternalEntityReqDTO body;

    public CreateExternalEntityRequest withEdgeNodeId(String edgeNodeId) {
        this.edgeNodeId = edgeNodeId;
        return this;
    }

    


    /**
     * 边缘节点ID
     * @return edgeNodeId
     */
    public String getEdgeNodeId() {
        return edgeNodeId;
    }

    public void setEdgeNodeId(String edgeNodeId) {
        this.edgeNodeId = edgeNodeId;
    }

    

    public CreateExternalEntityRequest withBody(CreateExternalEntityReqDTO body) {
        this.body = body;
        return this;
    }

    public CreateExternalEntityRequest withBody(Consumer<CreateExternalEntityReqDTO> bodySetter) {
        if(this.body == null ){
            this.body = new CreateExternalEntityReqDTO();
            bodySetter.accept(this.body);
        }
        
        return this;
    }


    /**
     * Get body
     * @return body
     */
    public CreateExternalEntityReqDTO getBody() {
        return body;
    }

    public void setBody(CreateExternalEntityReqDTO body) {
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
        CreateExternalEntityRequest createExternalEntityRequest = (CreateExternalEntityRequest) o;
        return Objects.equals(this.edgeNodeId, createExternalEntityRequest.edgeNodeId) &&
            Objects.equals(this.body, createExternalEntityRequest.body);
    }
    @Override
    public int hashCode() {
        return Objects.hash(edgeNodeId, body);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateExternalEntityRequest {\n");
        sb.append("    edgeNodeId: ").append(toIndentedString(edgeNodeId)).append("\n");
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

