package com.huaweicloud.sdk.roma.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * AclBatchDelete
 */
public class AclBatchDelete  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="acls")
    
    private List<String> acls = null;
    
    public AclBatchDelete withAcls(List<String> acls) {
        this.acls = acls;
        return this;
    }

    
    public AclBatchDelete addAclsItem(String aclsItem) {
        if(this.acls == null) {
            this.acls = new ArrayList<>();
        }
        this.acls.add(aclsItem);
        return this;
    }

    public AclBatchDelete withAcls(Consumer<List<String>> aclsSetter) {
        if(this.acls == null) {
            this.acls = new ArrayList<>();
        }
        aclsSetter.accept(this.acls);
        return this;
    }

    /**
     * 需要删除的ACL策略ID列表
     * @return acls
     */
    public List<String> getAcls() {
        return acls;
    }

    public void setAcls(List<String> acls) {
        this.acls = acls;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AclBatchDelete aclBatchDelete = (AclBatchDelete) o;
        return Objects.equals(this.acls, aclBatchDelete.acls);
    }
    @Override
    public int hashCode() {
        return Objects.hash(acls);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AclBatchDelete {\n");
        sb.append("    acls: ").append(toIndentedString(acls)).append("\n");
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

