package com.huaweicloud.sdk.workspaceapp.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ListVolumeTypeResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "volume_types")

    private List<VolumeTypeInfo> volumeTypes = null;

    public ListVolumeTypeResponse withVolumeTypes(List<VolumeTypeInfo> volumeTypes) {
        this.volumeTypes = volumeTypes;
        return this;
    }

    public ListVolumeTypeResponse addVolumeTypesItem(VolumeTypeInfo volumeTypesItem) {
        if (this.volumeTypes == null) {
            this.volumeTypes = new ArrayList<>();
        }
        this.volumeTypes.add(volumeTypesItem);
        return this;
    }

    public ListVolumeTypeResponse withVolumeTypes(Consumer<List<VolumeTypeInfo>> volumeTypesSetter) {
        if (this.volumeTypes == null) {
            this.volumeTypes = new ArrayList<>();
        }
        volumeTypesSetter.accept(this.volumeTypes);
        return this;
    }

    /**
     * 磁盘列表
     * @return volumeTypes
     */
    public List<VolumeTypeInfo> getVolumeTypes() {
        return volumeTypes;
    }

    public void setVolumeTypes(List<VolumeTypeInfo> volumeTypes) {
        this.volumeTypes = volumeTypes;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListVolumeTypeResponse that = (ListVolumeTypeResponse) obj;
        return Objects.equals(this.volumeTypes, that.volumeTypes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(volumeTypes);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListVolumeTypeResponse {\n");
        sb.append("    volumeTypes: ").append(toIndentedString(volumeTypes)).append("\n");
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
