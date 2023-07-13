package com.huaweicloud.sdk.cpts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class DeleteDirectoryRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "directory_id")

    private Integer directoryId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "test_suite_id")

    private Integer testSuiteId;

    public DeleteDirectoryRequest withDirectoryId(Integer directoryId) {
        this.directoryId = directoryId;
        return this;
    }

    /**
     * 目录id
     * minimum: 0
     * maximum: 2147483647
     * @return directoryId
     */
    public Integer getDirectoryId() {
        return directoryId;
    }

    public void setDirectoryId(Integer directoryId) {
        this.directoryId = directoryId;
    }

    public DeleteDirectoryRequest withTestSuiteId(Integer testSuiteId) {
        this.testSuiteId = testSuiteId;
        return this;
    }

    /**
     * 测试工程id
     * minimum: 0
     * maximum: 2147483647
     * @return testSuiteId
     */
    public Integer getTestSuiteId() {
        return testSuiteId;
    }

    public void setTestSuiteId(Integer testSuiteId) {
        this.testSuiteId = testSuiteId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DeleteDirectoryRequest that = (DeleteDirectoryRequest) obj;
        return Objects.equals(this.directoryId, that.directoryId) && Objects.equals(this.testSuiteId, that.testSuiteId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(directoryId, testSuiteId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeleteDirectoryRequest {\n");
        sb.append("    directoryId: ").append(toIndentedString(directoryId)).append("\n");
        sb.append("    testSuiteId: ").append(toIndentedString(testSuiteId)).append("\n");
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
