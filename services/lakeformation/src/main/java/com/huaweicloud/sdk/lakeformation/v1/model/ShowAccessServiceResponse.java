package com.huaweicloud.sdk.lakeformation.v1.model;

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
public class ShowAccessServiceResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "access_services")

    private List<AccessServiceInfo> accessServices = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-request-id")

    private String xRequestId;

    public ShowAccessServiceResponse withAccessServices(List<AccessServiceInfo> accessServices) {
        this.accessServices = accessServices;
        return this;
    }

    public ShowAccessServiceResponse addAccessServicesItem(AccessServiceInfo accessServicesItem) {
        if (this.accessServices == null) {
            this.accessServices = new ArrayList<>();
        }
        this.accessServices.add(accessServicesItem);
        return this;
    }

    public ShowAccessServiceResponse withAccessServices(Consumer<List<AccessServiceInfo>> accessServicesSetter) {
        if (this.accessServices == null) {
            this.accessServices = new ArrayList<>();
        }
        accessServicesSetter.accept(this.accessServices);
        return this;
    }

    /**
     * 接入服务授权信息列表
     * @return accessServices
     */
    public List<AccessServiceInfo> getAccessServices() {
        return accessServices;
    }

    public void setAccessServices(List<AccessServiceInfo> accessServices) {
        this.accessServices = accessServices;
    }

    public ShowAccessServiceResponse withXRequestId(String xRequestId) {
        this.xRequestId = xRequestId;
        return this;
    }

    /**
     * Get xRequestId
     * @return xRequestId
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-request-id")
    public String getXRequestId() {
        return xRequestId;
    }

    public void setXRequestId(String xRequestId) {
        this.xRequestId = xRequestId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowAccessServiceResponse that = (ShowAccessServiceResponse) obj;
        return Objects.equals(this.accessServices, that.accessServices)
            && Objects.equals(this.xRequestId, that.xRequestId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(accessServices, xRequestId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowAccessServiceResponse {\n");
        sb.append("    accessServices: ").append(toIndentedString(accessServices)).append("\n");
        sb.append("    xRequestId: ").append(toIndentedString(xRequestId)).append("\n");
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
