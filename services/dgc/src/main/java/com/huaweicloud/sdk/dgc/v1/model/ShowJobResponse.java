package com.huaweicloud.sdk.dgc.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowJobResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "nodes")

    private List<Node> nodes = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "schedule")

    private Schedule schedule;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "params")

    private List<JobParam> params = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "directory")

    private String directory;

    /**
     * 作业类型，REAL_TIME： 实时处理，BATCH：批处理
     */
    public static final class ProcessTypeEnum {

        /**
         * Enum BATCH for value: "BATCH"
         */
        public static final ProcessTypeEnum BATCH = new ProcessTypeEnum("BATCH");

        /**
         * Enum REAL_TIME for value: "REAL_TIME"
         */
        public static final ProcessTypeEnum REAL_TIME = new ProcessTypeEnum("REAL_TIME");

        private static final Map<String, ProcessTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ProcessTypeEnum> createStaticFields() {
            Map<String, ProcessTypeEnum> map = new HashMap<>();
            map.put("BATCH", BATCH);
            map.put("REAL_TIME", REAL_TIME);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ProcessTypeEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static ProcessTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new ProcessTypeEnum(value));
        }

        public static ProcessTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ProcessTypeEnum) {
                return this.value.equals(((ProcessTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "processType")

    private ProcessTypeEnum processType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "lastUpdateUser")

    private String lastUpdateUser;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "logPath")

    private String logPath;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "basicConfig")

    private BasicConfig basicConfig;

    /**
     * 在开启审批开关后，需要填写该字段。表示创建作业的目标状态，有三种状态：SAVED、SUBMITTED和PRODUCTION，分别表示作业创建后是保存态，提交态，生产态。
     */
    public static final class TargetStatusEnum {

        /**
         * Enum SAVED for value: "SAVED"
         */
        public static final TargetStatusEnum SAVED = new TargetStatusEnum("SAVED");

        /**
         * Enum SUBMITTED for value: "SUBMITTED"
         */
        public static final TargetStatusEnum SUBMITTED = new TargetStatusEnum("SUBMITTED");

        /**
         * Enum PRODUCTION for value: "PRODUCTION"
         */
        public static final TargetStatusEnum PRODUCTION = new TargetStatusEnum("PRODUCTION");

        private static final Map<String, TargetStatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, TargetStatusEnum> createStaticFields() {
            Map<String, TargetStatusEnum> map = new HashMap<>();
            map.put("SAVED", SAVED);
            map.put("SUBMITTED", SUBMITTED);
            map.put("PRODUCTION", PRODUCTION);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        TargetStatusEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static TargetStatusEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new TargetStatusEnum(value));
        }

        public static TargetStatusEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof TargetStatusEnum) {
                return this.value.equals(((TargetStatusEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "targetStatus")

    private TargetStatusEnum targetStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "approvers")

    private List<JobApprover> approvers = null;

    public ShowJobResponse withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 作业名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ShowJobResponse withNodes(List<Node> nodes) {
        this.nodes = nodes;
        return this;
    }

    public ShowJobResponse addNodesItem(Node nodesItem) {
        if (this.nodes == null) {
            this.nodes = new ArrayList<>();
        }
        this.nodes.add(nodesItem);
        return this;
    }

    public ShowJobResponse withNodes(Consumer<List<Node>> nodesSetter) {
        if (this.nodes == null) {
            this.nodes = new ArrayList<>();
        }
        nodesSetter.accept(this.nodes);
        return this;
    }

    /**
     * 节点定义
     * @return nodes
     */
    public List<Node> getNodes() {
        return nodes;
    }

    public void setNodes(List<Node> nodes) {
        this.nodes = nodes;
    }

    public ShowJobResponse withSchedule(Schedule schedule) {
        this.schedule = schedule;
        return this;
    }

    public ShowJobResponse withSchedule(Consumer<Schedule> scheduleSetter) {
        if (this.schedule == null) {
            this.schedule = new Schedule();
            scheduleSetter.accept(this.schedule);
        }

        return this;
    }

    /**
     * Get schedule
     * @return schedule
     */
    public Schedule getSchedule() {
        return schedule;
    }

    public void setSchedule(Schedule schedule) {
        this.schedule = schedule;
    }

    public ShowJobResponse withParams(List<JobParam> params) {
        this.params = params;
        return this;
    }

    public ShowJobResponse addParamsItem(JobParam paramsItem) {
        if (this.params == null) {
            this.params = new ArrayList<>();
        }
        this.params.add(paramsItem);
        return this;
    }

    public ShowJobResponse withParams(Consumer<List<JobParam>> paramsSetter) {
        if (this.params == null) {
            this.params = new ArrayList<>();
        }
        paramsSetter.accept(this.params);
        return this;
    }

    /**
     * 作业参数定义
     * @return params
     */
    public List<JobParam> getParams() {
        return params;
    }

    public void setParams(List<JobParam> params) {
        this.params = params;
    }

    public ShowJobResponse withDirectory(String directory) {
        this.directory = directory;
        return this;
    }

    /**
     * 作业在目录树上的路径。创建作业时如果路径目录不存在，会自动创建目录，如/dir/a/，默认在根目录/。
     * @return directory
     */
    public String getDirectory() {
        return directory;
    }

    public void setDirectory(String directory) {
        this.directory = directory;
    }

    public ShowJobResponse withProcessType(ProcessTypeEnum processType) {
        this.processType = processType;
        return this;
    }

    /**
     * 作业类型，REAL_TIME： 实时处理，BATCH：批处理
     * @return processType
     */
    public ProcessTypeEnum getProcessType() {
        return processType;
    }

    public void setProcessType(ProcessTypeEnum processType) {
        this.processType = processType;
    }

    public ShowJobResponse withLastUpdateUser(String lastUpdateUser) {
        this.lastUpdateUser = lastUpdateUser;
        return this;
    }

    /**
     * 作业最后修改人
     * @return lastUpdateUser
     */
    public String getLastUpdateUser() {
        return lastUpdateUser;
    }

    public void setLastUpdateUser(String lastUpdateUser) {
        this.lastUpdateUser = lastUpdateUser;
    }

    public ShowJobResponse withLogPath(String logPath) {
        this.logPath = logPath;
        return this;
    }

    /**
     * 作业运行日志存放的OBS路径。
     * @return logPath
     */
    public String getLogPath() {
        return logPath;
    }

    public void setLogPath(String logPath) {
        this.logPath = logPath;
    }

    public ShowJobResponse withBasicConfig(BasicConfig basicConfig) {
        this.basicConfig = basicConfig;
        return this;
    }

    public ShowJobResponse withBasicConfig(Consumer<BasicConfig> basicConfigSetter) {
        if (this.basicConfig == null) {
            this.basicConfig = new BasicConfig();
            basicConfigSetter.accept(this.basicConfig);
        }

        return this;
    }

    /**
     * Get basicConfig
     * @return basicConfig
     */
    public BasicConfig getBasicConfig() {
        return basicConfig;
    }

    public void setBasicConfig(BasicConfig basicConfig) {
        this.basicConfig = basicConfig;
    }

    public ShowJobResponse withTargetStatus(TargetStatusEnum targetStatus) {
        this.targetStatus = targetStatus;
        return this;
    }

    /**
     * 在开启审批开关后，需要填写该字段。表示创建作业的目标状态，有三种状态：SAVED、SUBMITTED和PRODUCTION，分别表示作业创建后是保存态，提交态，生产态。
     * @return targetStatus
     */
    public TargetStatusEnum getTargetStatus() {
        return targetStatus;
    }

    public void setTargetStatus(TargetStatusEnum targetStatus) {
        this.targetStatus = targetStatus;
    }

    public ShowJobResponse withApprovers(List<JobApprover> approvers) {
        this.approvers = approvers;
        return this;
    }

    public ShowJobResponse addApproversItem(JobApprover approversItem) {
        if (this.approvers == null) {
            this.approvers = new ArrayList<>();
        }
        this.approvers.add(approversItem);
        return this;
    }

    public ShowJobResponse withApprovers(Consumer<List<JobApprover>> approversSetter) {
        if (this.approvers == null) {
            this.approvers = new ArrayList<>();
        }
        approversSetter.accept(this.approvers);
        return this;
    }

    /**
     * 在开启审批开关后，需要填写该字段，表示作业审批人。
     * @return approvers
     */
    public List<JobApprover> getApprovers() {
        return approvers;
    }

    public void setApprovers(List<JobApprover> approvers) {
        this.approvers = approvers;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowJobResponse that = (ShowJobResponse) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.nodes, that.nodes)
            && Objects.equals(this.schedule, that.schedule) && Objects.equals(this.params, that.params)
            && Objects.equals(this.directory, that.directory) && Objects.equals(this.processType, that.processType)
            && Objects.equals(this.lastUpdateUser, that.lastUpdateUser) && Objects.equals(this.logPath, that.logPath)
            && Objects.equals(this.basicConfig, that.basicConfig)
            && Objects.equals(this.targetStatus, that.targetStatus) && Objects.equals(this.approvers, that.approvers);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name,
            nodes,
            schedule,
            params,
            directory,
            processType,
            lastUpdateUser,
            logPath,
            basicConfig,
            targetStatus,
            approvers);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowJobResponse {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    nodes: ").append(toIndentedString(nodes)).append("\n");
        sb.append("    schedule: ").append(toIndentedString(schedule)).append("\n");
        sb.append("    params: ").append(toIndentedString(params)).append("\n");
        sb.append("    directory: ").append(toIndentedString(directory)).append("\n");
        sb.append("    processType: ").append(toIndentedString(processType)).append("\n");
        sb.append("    lastUpdateUser: ").append(toIndentedString(lastUpdateUser)).append("\n");
        sb.append("    logPath: ").append(toIndentedString(logPath)).append("\n");
        sb.append("    basicConfig: ").append(toIndentedString(basicConfig)).append("\n");
        sb.append("    targetStatus: ").append(toIndentedString(targetStatus)).append("\n");
        sb.append("    approvers: ").append(toIndentedString(approvers)).append("\n");
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
