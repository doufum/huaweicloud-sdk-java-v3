package com.huaweicloud.sdk.aos.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * CreateStackInstanceRequestBody
 */
public class CreateStackInstanceRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "stack_set_id")

    private String stackSetId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "deployment_targets")

    private DeploymentTargetsPrimitiveTypeHolderDeploymentTargets deploymentTargets;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "var_overrides")

    private VarOverridesPrimitiveTypeHolderVarOverrides varOverrides;

    public CreateStackInstanceRequestBody withStackSetId(String stackSetId) {
        this.stackSetId = stackSetId;
        return this;
    }

    /**
     * 资源栈集（stack_set）的唯一ID。  此ID由资源编排服务在生成资源栈的时候生成，为UUID。  由于资源栈集名仅仅在同一时间下唯一，即用户允许先生成一个叫HelloWorld的资源栈集，删除，在重新创建一个同名资源栈集。  对于团队并行开发，用户可能希望确保，当前我操作的资源栈集就是我以为的那个，而不是又其他队友删除后创建的同名资源栈集。因此，使用ID就可以做到强匹配。  资源编排服务保证每次创建的资源栈集所对应的ID都不相同，更新不会影响ID。如果给与的stack_set_id和当前资源栈集的ID不一致，则返回400
     * @return stackSetId
     */
    public String getStackSetId() {
        return stackSetId;
    }

    public void setStackSetId(String stackSetId) {
        this.stackSetId = stackSetId;
    }

    public CreateStackInstanceRequestBody withDeploymentTargets(
        DeploymentTargetsPrimitiveTypeHolderDeploymentTargets deploymentTargets) {
        this.deploymentTargets = deploymentTargets;
        return this;
    }

    public CreateStackInstanceRequestBody withDeploymentTargets(
        Consumer<DeploymentTargetsPrimitiveTypeHolderDeploymentTargets> deploymentTargetsSetter) {
        if (this.deploymentTargets == null) {
            this.deploymentTargets = new DeploymentTargetsPrimitiveTypeHolderDeploymentTargets();
            deploymentTargetsSetter.accept(this.deploymentTargets);
        }

        return this;
    }

    /**
     * Get deploymentTargets
     * @return deploymentTargets
     */
    public DeploymentTargetsPrimitiveTypeHolderDeploymentTargets getDeploymentTargets() {
        return deploymentTargets;
    }

    public void setDeploymentTargets(DeploymentTargetsPrimitiveTypeHolderDeploymentTargets deploymentTargets) {
        this.deploymentTargets = deploymentTargets;
    }

    public CreateStackInstanceRequestBody withVarOverrides(VarOverridesPrimitiveTypeHolderVarOverrides varOverrides) {
        this.varOverrides = varOverrides;
        return this;
    }

    public CreateStackInstanceRequestBody withVarOverrides(
        Consumer<VarOverridesPrimitiveTypeHolderVarOverrides> varOverridesSetter) {
        if (this.varOverrides == null) {
            this.varOverrides = new VarOverridesPrimitiveTypeHolderVarOverrides();
            varOverridesSetter.accept(this.varOverrides);
        }

        return this;
    }

    /**
     * Get varOverrides
     * @return varOverrides
     */
    public VarOverridesPrimitiveTypeHolderVarOverrides getVarOverrides() {
        return varOverrides;
    }

    public void setVarOverrides(VarOverridesPrimitiveTypeHolderVarOverrides varOverrides) {
        this.varOverrides = varOverrides;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateStackInstanceRequestBody that = (CreateStackInstanceRequestBody) obj;
        return Objects.equals(this.stackSetId, that.stackSetId)
            && Objects.equals(this.deploymentTargets, that.deploymentTargets)
            && Objects.equals(this.varOverrides, that.varOverrides);
    }

    @Override
    public int hashCode() {
        return Objects.hash(stackSetId, deploymentTargets, varOverrides);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateStackInstanceRequestBody {\n");
        sb.append("    stackSetId: ").append(toIndentedString(stackSetId)).append("\n");
        sb.append("    deploymentTargets: ").append(toIndentedString(deploymentTargets)).append("\n");
        sb.append("    varOverrides: ").append(toIndentedString(varOverrides)).append("\n");
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
