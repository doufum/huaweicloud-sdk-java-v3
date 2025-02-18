package com.huaweicloud.sdk.cfw.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * EIPSwitchStatusVO
 */
public class EIPSwitchStatusVO {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "object_id")

    private String objectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "fail_eip_id_list")

    private List<String> failEipIdList = null;

    public EIPSwitchStatusVO withObjectId(String objectId) {
        this.objectId = objectId;
        return this;
    }

    /**
     * 防护对象id，是创建云防火墙后用于区分互联网边界防护和VPC边界防护的标志id，可通过调用查询防火墙实例接口获得，注意type为0的为互联网边界防护对象id，type为1的为VPC边界防护对象id。具体可参考APIExlorer和帮助中心FAQ。
     * @return objectId
     */
    public String getObjectId() {
        return objectId;
    }

    public void setObjectId(String objectId) {
        this.objectId = objectId;
    }

    public EIPSwitchStatusVO withFailEipIdList(List<String> failEipIdList) {
        this.failEipIdList = failEipIdList;
        return this;
    }

    public EIPSwitchStatusVO addFailEipIdListItem(String failEipIdListItem) {
        if (this.failEipIdList == null) {
            this.failEipIdList = new ArrayList<>();
        }
        this.failEipIdList.add(failEipIdListItem);
        return this;
    }

    public EIPSwitchStatusVO withFailEipIdList(Consumer<List<String>> failEipIdListSetter) {
        if (this.failEipIdList == null) {
            this.failEipIdList = new ArrayList<>();
        }
        failEipIdListSetter.accept(this.failEipIdList);
        return this;
    }

    /**
     * 修改eip防护状态失败列表。
     * @return failEipIdList
     */
    public List<String> getFailEipIdList() {
        return failEipIdList;
    }

    public void setFailEipIdList(List<String> failEipIdList) {
        this.failEipIdList = failEipIdList;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        EIPSwitchStatusVO that = (EIPSwitchStatusVO) obj;
        return Objects.equals(this.objectId, that.objectId) && Objects.equals(this.failEipIdList, that.failEipIdList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(objectId, failEipIdList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class EIPSwitchStatusVO {\n");
        sb.append("    objectId: ").append(toIndentedString(objectId)).append("\n");
        sb.append("    failEipIdList: ").append(toIndentedString(failEipIdList)).append("\n");
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
