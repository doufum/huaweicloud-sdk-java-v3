package com.huaweicloud.sdk.cpts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/** ShowTaskResqTaskinfoCaseList */
public class ShowTaskResqTaskinfoCaseList {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "case_id")

    private Integer caseId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "case_name")

    private String caseName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "case_type")

    private Integer caseType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "contents")

    private List<ShowTaskResqTaskinfoContents> contents = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "for_loop_params")

    private List<Object> forLoopParams = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "increase_setting")

    private List<Object> increaseSetting = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "stages")

    private List<Object> stages = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private Integer status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "temp_id")

    private Integer tempId;

    public ShowTaskResqTaskinfoCaseList withCaseId(Integer caseId) {
        this.caseId = caseId;
        return this;
    }

    /** case_id minimum: 0 maximum: 2147483647
     * 
     * @return caseId */
    public Integer getCaseId() {
        return caseId;
    }

    public void setCaseId(Integer caseId) {
        this.caseId = caseId;
    }

    public ShowTaskResqTaskinfoCaseList withCaseName(String caseName) {
        this.caseName = caseName;
        return this;
    }

    /** case_name
     * 
     * @return caseName */
    public String getCaseName() {
        return caseName;
    }

    public void setCaseName(String caseName) {
        this.caseName = caseName;
    }

    public ShowTaskResqTaskinfoCaseList withCaseType(Integer caseType) {
        this.caseType = caseType;
        return this;
    }

    /** case_type minimum: 0 maximum: 2147483647
     * 
     * @return caseType */
    public Integer getCaseType() {
        return caseType;
    }

    public void setCaseType(Integer caseType) {
        this.caseType = caseType;
    }

    public ShowTaskResqTaskinfoCaseList withContents(List<ShowTaskResqTaskinfoContents> contents) {
        this.contents = contents;
        return this;
    }

    public ShowTaskResqTaskinfoCaseList addContentsItem(ShowTaskResqTaskinfoContents contentsItem) {
        if (this.contents == null) {
            this.contents = new ArrayList<>();
        }
        this.contents.add(contentsItem);
        return this;
    }

    public ShowTaskResqTaskinfoCaseList withContents(Consumer<List<ShowTaskResqTaskinfoContents>> contentsSetter) {
        if (this.contents == null) {
            this.contents = new ArrayList<>();
        }
        contentsSetter.accept(this.contents);
        return this;
    }

    /** contents
     * 
     * @return contents */
    public List<ShowTaskResqTaskinfoContents> getContents() {
        return contents;
    }

    public void setContents(List<ShowTaskResqTaskinfoContents> contents) {
        this.contents = contents;
    }

    public ShowTaskResqTaskinfoCaseList withForLoopParams(List<Object> forLoopParams) {
        this.forLoopParams = forLoopParams;
        return this;
    }

    public ShowTaskResqTaskinfoCaseList addForLoopParamsItem(Object forLoopParamsItem) {
        if (this.forLoopParams == null) {
            this.forLoopParams = new ArrayList<>();
        }
        this.forLoopParams.add(forLoopParamsItem);
        return this;
    }

    public ShowTaskResqTaskinfoCaseList withForLoopParams(Consumer<List<Object>> forLoopParamsSetter) {
        if (this.forLoopParams == null) {
            this.forLoopParams = new ArrayList<>();
        }
        forLoopParamsSetter.accept(this.forLoopParams);
        return this;
    }

    /** for_loop_params
     * 
     * @return forLoopParams */
    public List<Object> getForLoopParams() {
        return forLoopParams;
    }

    public void setForLoopParams(List<Object> forLoopParams) {
        this.forLoopParams = forLoopParams;
    }

    public ShowTaskResqTaskinfoCaseList withIncreaseSetting(List<Object> increaseSetting) {
        this.increaseSetting = increaseSetting;
        return this;
    }

    public ShowTaskResqTaskinfoCaseList addIncreaseSettingItem(Object increaseSettingItem) {
        if (this.increaseSetting == null) {
            this.increaseSetting = new ArrayList<>();
        }
        this.increaseSetting.add(increaseSettingItem);
        return this;
    }

    public ShowTaskResqTaskinfoCaseList withIncreaseSetting(Consumer<List<Object>> increaseSettingSetter) {
        if (this.increaseSetting == null) {
            this.increaseSetting = new ArrayList<>();
        }
        increaseSettingSetter.accept(this.increaseSetting);
        return this;
    }

    /** increase_setting
     * 
     * @return increaseSetting */
    public List<Object> getIncreaseSetting() {
        return increaseSetting;
    }

    public void setIncreaseSetting(List<Object> increaseSetting) {
        this.increaseSetting = increaseSetting;
    }

    public ShowTaskResqTaskinfoCaseList withStages(List<Object> stages) {
        this.stages = stages;
        return this;
    }

    public ShowTaskResqTaskinfoCaseList addStagesItem(Object stagesItem) {
        if (this.stages == null) {
            this.stages = new ArrayList<>();
        }
        this.stages.add(stagesItem);
        return this;
    }

    public ShowTaskResqTaskinfoCaseList withStages(Consumer<List<Object>> stagesSetter) {
        if (this.stages == null) {
            this.stages = new ArrayList<>();
        }
        stagesSetter.accept(this.stages);
        return this;
    }

    /** stages
     * 
     * @return stages */
    public List<Object> getStages() {
        return stages;
    }

    public void setStages(List<Object> stages) {
        this.stages = stages;
    }

    public ShowTaskResqTaskinfoCaseList withStatus(Integer status) {
        this.status = status;
        return this;
    }

    /** status minimum: 0 maximum: 2147483647
     * 
     * @return status */
    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public ShowTaskResqTaskinfoCaseList withTempId(Integer tempId) {
        this.tempId = tempId;
        return this;
    }

    /** temp_id minimum: 0 maximum: 2147483647
     * 
     * @return tempId */
    public Integer getTempId() {
        return tempId;
    }

    public void setTempId(Integer tempId) {
        this.tempId = tempId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowTaskResqTaskinfoCaseList showTaskResqTaskinfoCaseList = (ShowTaskResqTaskinfoCaseList) o;
        return Objects.equals(this.caseId, showTaskResqTaskinfoCaseList.caseId)
            && Objects.equals(this.caseName, showTaskResqTaskinfoCaseList.caseName)
            && Objects.equals(this.caseType, showTaskResqTaskinfoCaseList.caseType)
            && Objects.equals(this.contents, showTaskResqTaskinfoCaseList.contents)
            && Objects.equals(this.forLoopParams, showTaskResqTaskinfoCaseList.forLoopParams)
            && Objects.equals(this.increaseSetting, showTaskResqTaskinfoCaseList.increaseSetting)
            && Objects.equals(this.stages, showTaskResqTaskinfoCaseList.stages)
            && Objects.equals(this.status, showTaskResqTaskinfoCaseList.status)
            && Objects.equals(this.tempId, showTaskResqTaskinfoCaseList.tempId);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(caseId, caseName, caseType, contents, forLoopParams, increaseSetting, stages, status, tempId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowTaskResqTaskinfoCaseList {\n");
        sb.append("    caseId: ").append(toIndentedString(caseId)).append("\n");
        sb.append("    caseName: ").append(toIndentedString(caseName)).append("\n");
        sb.append("    caseType: ").append(toIndentedString(caseType)).append("\n");
        sb.append("    contents: ").append(toIndentedString(contents)).append("\n");
        sb.append("    forLoopParams: ").append(toIndentedString(forLoopParams)).append("\n");
        sb.append("    increaseSetting: ").append(toIndentedString(increaseSetting)).append("\n");
        sb.append("    stages: ").append(toIndentedString(stages)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    tempId: ").append(toIndentedString(tempId)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
