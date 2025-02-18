package com.huaweicloud.sdk.elb.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 负载均衡器规格信息。
 */
public class Flavor {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "info")

    private FlavorInfo info;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "shared")

    private Boolean shared;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_id")

    private String projectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "flavor_sold_out")

    private Boolean flavorSoldOut;

    public Flavor withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 规格ID。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Flavor withInfo(FlavorInfo info) {
        this.info = info;
        return this;
    }

    public Flavor withInfo(Consumer<FlavorInfo> infoSetter) {
        if (this.info == null) {
            this.info = new FlavorInfo();
            infoSetter.accept(this.info);
        }

        return this;
    }

    /**
     * Get info
     * @return info
     */
    public FlavorInfo getInfo() {
        return info;
    }

    public void setInfo(FlavorInfo info) {
        this.info = info;
    }

    public Flavor withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 规格名称。  规格名称与控制台展示的对应关系如下：   - L4_flavor.elb.s1.small: 小型 I   - L4_flavor.elb.s2.small: 小型 II   - L4_flavor.elb.s1.medium: 中型 I   - L4_flavor.elb.s2.medium: 中型 II   - L4_flavor.elb.s1.large: 大型 I   - L4_flavor.elb.s2.large: 大型 II   - L7_flavor.elb.s1.small: 小型 I   - L7_flavor.elb.s2.small: 小型 II   - L7_flavor.elb.s1.medium: 中型 I   - L7_flavor.elb.s2.medium: 中型 II   - L7_flavor.elb.s1.large: 大型 I   - L7_flavor.elb.s2.large: 大型 II   - L7_flavor.elb.s1.extra-large: 超大型 I   - L7_flavor.elb.s2.extra-large: 超大型 II
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Flavor withShared(Boolean shared) {
        this.shared = shared;
        return this;
    }

    /**
     * 是否公共规格。  取值： - true表示公共规格，所有租户可见。 - false表示私有规格，为当前租户所有。
     * @return shared
     */
    public Boolean getShared() {
        return shared;
    }

    public void setShared(Boolean shared) {
        this.shared = shared;
    }

    public Flavor withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    /**
     * 项目ID。
     * @return projectId
     */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public Flavor withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * 规格类别。  取值： - L4和L7 表示四层和七层flavor。 [- L4_elastic和L7_elastic 表示弹性扩缩容实例的下限规格。 - L4_elastic_max和L7_elastic_max 表示弹性扩缩容实例的上限规格。](tag:hws,hws_hk,ocb,ctc,hcs,g42,tm,cmcc,hk_g42,hws_ocb,fcs,hcso_dt)
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Flavor withFlavorSoldOut(Boolean flavorSoldOut) {
        this.flavorSoldOut = flavorSoldOut;
        return this;
    }

    /**
     * [是否售罄。  取值： - true：已售罄，将无法购买该规格的LB。 - false：未售罄，可购买该规格的LB。](tag:hws)  [是否可用。  取值： - true：不可用，将无法创建该规格的LB。 - false：可用，可创建该规格的LB。](tag:hws_ocb,ocb,fcs,hws_hk,ctc,hcs,cmcc,tm,g42,hk_g42,hws_eu,hcso_dt,dt,dt_test)
     * @return flavorSoldOut
     */
    public Boolean getFlavorSoldOut() {
        return flavorSoldOut;
    }

    public void setFlavorSoldOut(Boolean flavorSoldOut) {
        this.flavorSoldOut = flavorSoldOut;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Flavor that = (Flavor) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.info, that.info)
            && Objects.equals(this.name, that.name) && Objects.equals(this.shared, that.shared)
            && Objects.equals(this.projectId, that.projectId) && Objects.equals(this.type, that.type)
            && Objects.equals(this.flavorSoldOut, that.flavorSoldOut);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, info, name, shared, projectId, type, flavorSoldOut);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Flavor {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    info: ").append(toIndentedString(info)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    shared: ").append(toIndentedString(shared)).append("\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    flavorSoldOut: ").append(toIndentedString(flavorSoldOut)).append("\n");
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
