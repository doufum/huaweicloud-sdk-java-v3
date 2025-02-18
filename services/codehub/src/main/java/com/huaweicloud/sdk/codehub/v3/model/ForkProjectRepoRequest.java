package com.huaweicloud.sdk.codehub.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * ForkProjectRepoRequest
 */
public class ForkProjectRepoRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "import_members")

    private Integer importMembers;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_name")

    private String projectName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "repo_name")

    private String repoName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "template_id")

    private String templateId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "visibility_level")

    private Integer visibilityLevel;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "external_project_info")

    private ExternalKeyMessage externalProjectInfo;

    public ForkProjectRepoRequest withImportMembers(Integer importMembers) {
        this.importMembers = importMembers;
        return this;
    }

    /**
     * 是否导入项目成员，取值范围：0->不导入项目成员，1->导入项目成员
     * @return importMembers
     */
    public Integer getImportMembers() {
        return importMembers;
    }

    public void setImportMembers(Integer importMembers) {
        this.importMembers = importMembers;
    }

    public ForkProjectRepoRequest withProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }

    /**
     * 项目名称，取值范围：可以输入英文大小写字母、数字、连字符、下划线，且必须以字母开头
     * @return projectName
     */
    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public ForkProjectRepoRequest withRepoName(String repoName) {
        this.repoName = repoName;
        return this;
    }

    /**
     * 仓库名称，取值范围：可以输入英文大小写字母、数字、连字符、下划线，且必须以字母开头
     * @return repoName
     */
    public String getRepoName() {
        return repoName;
    }

    public void setRepoName(String repoName) {
        this.repoName = repoName;
    }

    public ForkProjectRepoRequest withTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }

    /**
     * 复制模板的ID
     * @return templateId
     */
    public String getTemplateId() {
        return templateId;
    }

    public void setTemplateId(String templateId) {
        this.templateId = templateId;
    }

    public ForkProjectRepoRequest withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * 项目类型，normal|scrum
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public ForkProjectRepoRequest withVisibilityLevel(Integer visibilityLevel) {
        this.visibilityLevel = visibilityLevel;
        return this;
    }

    /**
     * 是否是公仓
     * @return visibilityLevel
     */
    public Integer getVisibilityLevel() {
        return visibilityLevel;
    }

    public void setVisibilityLevel(Integer visibilityLevel) {
        this.visibilityLevel = visibilityLevel;
    }

    public ForkProjectRepoRequest withExternalProjectInfo(ExternalKeyMessage externalProjectInfo) {
        this.externalProjectInfo = externalProjectInfo;
        return this;
    }

    public ForkProjectRepoRequest withExternalProjectInfo(Consumer<ExternalKeyMessage> externalProjectInfoSetter) {
        if (this.externalProjectInfo == null) {
            this.externalProjectInfo = new ExternalKeyMessage();
            externalProjectInfoSetter.accept(this.externalProjectInfo);
        }

        return this;
    }

    /**
     * Get externalProjectInfo
     * @return externalProjectInfo
     */
    public ExternalKeyMessage getExternalProjectInfo() {
        return externalProjectInfo;
    }

    public void setExternalProjectInfo(ExternalKeyMessage externalProjectInfo) {
        this.externalProjectInfo = externalProjectInfo;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ForkProjectRepoRequest that = (ForkProjectRepoRequest) obj;
        return Objects.equals(this.importMembers, that.importMembers)
            && Objects.equals(this.projectName, that.projectName) && Objects.equals(this.repoName, that.repoName)
            && Objects.equals(this.templateId, that.templateId) && Objects.equals(this.type, that.type)
            && Objects.equals(this.visibilityLevel, that.visibilityLevel)
            && Objects.equals(this.externalProjectInfo, that.externalProjectInfo);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(importMembers, projectName, repoName, templateId, type, visibilityLevel, externalProjectInfo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ForkProjectRepoRequest {\n");
        sb.append("    importMembers: ").append(toIndentedString(importMembers)).append("\n");
        sb.append("    projectName: ").append(toIndentedString(projectName)).append("\n");
        sb.append("    repoName: ").append(toIndentedString(repoName)).append("\n");
        sb.append("    templateId: ").append(toIndentedString(templateId)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    visibilityLevel: ").append(toIndentedString(visibilityLevel)).append("\n");
        sb.append("    externalProjectInfo: ").append(toIndentedString(externalProjectInfo)).append("\n");
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
