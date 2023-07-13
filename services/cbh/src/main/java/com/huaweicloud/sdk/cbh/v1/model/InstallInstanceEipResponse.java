package com.huaweicloud.sdk.cbh.v1.model;

import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class InstallInstanceEipResponse extends SdkResponse {

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        return Objects.hash();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class InstallInstanceEipResponse {\n");
        sb.append("}");
        return sb.toString();
    }

}
