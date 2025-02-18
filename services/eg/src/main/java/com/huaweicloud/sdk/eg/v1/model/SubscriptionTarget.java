package com.huaweicloud.sdk.eg.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * SubscriptionTarget
 */
public class SubscriptionTarget {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    /**
     * 订阅的事件目标的提供方类型
     */
    public static final class ProviderTypeEnum {

        /**
         * Enum CUSTOM for value: "CUSTOM"
         */
        public static final ProviderTypeEnum CUSTOM = new ProviderTypeEnum("CUSTOM");

        /**
         * Enum OFFICIAL for value: "OFFICIAL"
         */
        public static final ProviderTypeEnum OFFICIAL = new ProviderTypeEnum("OFFICIAL");

        private static final Map<String, ProviderTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ProviderTypeEnum> createStaticFields() {
            Map<String, ProviderTypeEnum> map = new HashMap<>();
            map.put("CUSTOM", CUSTOM);
            map.put("OFFICIAL", OFFICIAL);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ProviderTypeEnum(String value) {
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
        public static ProviderTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new ProviderTypeEnum(value));
        }

        public static ProviderTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ProviderTypeEnum) {
                return this.value.equals(((ProviderTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "provider_type")

    private ProviderTypeEnum providerType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "connection_id")

    private String connectionId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "detail")

    private Detail detail;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "kafka_detail")

    private KafkaTargetDetail kafkaDetail;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "smn_detail")

    private SmnTargetDetail smnDetail;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "transform")

    private TransForm transform;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dead_letter_queue")

    private DeadLetterQueue deadLetterQueue;

    public SubscriptionTarget withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 订阅目标ID，需保证全局唯一，由小写字母、数字、中划线组成，必须字母或数字开头。 更新订阅场景时，指定ID的订阅目标存在时则进行更新，否则进行创建； 创建订阅目标场景时，指定ID作为待创建的订阅目标对象ID，未指定时由系统自动生成。 更新订阅目标时，此字段忽略；
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public SubscriptionTarget withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 订阅的事件目标名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public SubscriptionTarget withProviderType(ProviderTypeEnum providerType) {
        this.providerType = providerType;
        return this;
    }

    /**
     * 订阅的事件目标的提供方类型
     * @return providerType
     */
    public ProviderTypeEnum getProviderType() {
        return providerType;
    }

    public void setProviderType(ProviderTypeEnum providerType) {
        this.providerType = providerType;
    }

    public SubscriptionTarget withConnectionId(String connectionId) {
        this.connectionId = connectionId;
        return this;
    }

    /**
     * 订阅的事件目标使用的目标链接ID
     * @return connectionId
     */
    public String getConnectionId() {
        return connectionId;
    }

    public void setConnectionId(String connectionId) {
        this.connectionId = connectionId;
    }

    public SubscriptionTarget withDetail(Detail detail) {
        this.detail = detail;
        return this;
    }

    public SubscriptionTarget withDetail(Consumer<Detail> detailSetter) {
        if (this.detail == null) {
            this.detail = new Detail();
            detailSetter.accept(this.detail);
        }

        return this;
    }

    /**
     * Get detail
     * @return detail
     */
    public Detail getDetail() {
        return detail;
    }

    public void setDetail(Detail detail) {
        this.detail = detail;
    }

    public SubscriptionTarget withKafkaDetail(KafkaTargetDetail kafkaDetail) {
        this.kafkaDetail = kafkaDetail;
        return this;
    }

    public SubscriptionTarget withKafkaDetail(Consumer<KafkaTargetDetail> kafkaDetailSetter) {
        if (this.kafkaDetail == null) {
            this.kafkaDetail = new KafkaTargetDetail();
            kafkaDetailSetter.accept(this.kafkaDetail);
        }

        return this;
    }

    /**
     * Get kafkaDetail
     * @return kafkaDetail
     */
    public KafkaTargetDetail getKafkaDetail() {
        return kafkaDetail;
    }

    public void setKafkaDetail(KafkaTargetDetail kafkaDetail) {
        this.kafkaDetail = kafkaDetail;
    }

    public SubscriptionTarget withSmnDetail(SmnTargetDetail smnDetail) {
        this.smnDetail = smnDetail;
        return this;
    }

    public SubscriptionTarget withSmnDetail(Consumer<SmnTargetDetail> smnDetailSetter) {
        if (this.smnDetail == null) {
            this.smnDetail = new SmnTargetDetail();
            smnDetailSetter.accept(this.smnDetail);
        }

        return this;
    }

    /**
     * Get smnDetail
     * @return smnDetail
     */
    public SmnTargetDetail getSmnDetail() {
        return smnDetail;
    }

    public void setSmnDetail(SmnTargetDetail smnDetail) {
        this.smnDetail = smnDetail;
    }

    public SubscriptionTarget withTransform(TransForm transform) {
        this.transform = transform;
        return this;
    }

    public SubscriptionTarget withTransform(Consumer<TransForm> transformSetter) {
        if (this.transform == null) {
            this.transform = new TransForm();
            transformSetter.accept(this.transform);
        }

        return this;
    }

    /**
     * Get transform
     * @return transform
     */
    public TransForm getTransform() {
        return transform;
    }

    public void setTransform(TransForm transform) {
        this.transform = transform;
    }

    public SubscriptionTarget withDeadLetterQueue(DeadLetterQueue deadLetterQueue) {
        this.deadLetterQueue = deadLetterQueue;
        return this;
    }

    public SubscriptionTarget withDeadLetterQueue(Consumer<DeadLetterQueue> deadLetterQueueSetter) {
        if (this.deadLetterQueue == null) {
            this.deadLetterQueue = new DeadLetterQueue();
            deadLetterQueueSetter.accept(this.deadLetterQueue);
        }

        return this;
    }

    /**
     * Get deadLetterQueue
     * @return deadLetterQueue
     */
    public DeadLetterQueue getDeadLetterQueue() {
        return deadLetterQueue;
    }

    public void setDeadLetterQueue(DeadLetterQueue deadLetterQueue) {
        this.deadLetterQueue = deadLetterQueue;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SubscriptionTarget that = (SubscriptionTarget) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.name, that.name)
            && Objects.equals(this.providerType, that.providerType)
            && Objects.equals(this.connectionId, that.connectionId) && Objects.equals(this.detail, that.detail)
            && Objects.equals(this.kafkaDetail, that.kafkaDetail) && Objects.equals(this.smnDetail, that.smnDetail)
            && Objects.equals(this.transform, that.transform)
            && Objects.equals(this.deadLetterQueue, that.deadLetterQueue);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(id, name, providerType, connectionId, detail, kafkaDetail, smnDetail, transform, deadLetterQueue);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SubscriptionTarget {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    providerType: ").append(toIndentedString(providerType)).append("\n");
        sb.append("    connectionId: ").append(toIndentedString(connectionId)).append("\n");
        sb.append("    detail: ").append(toIndentedString(detail)).append("\n");
        sb.append("    kafkaDetail: ").append(toIndentedString(kafkaDetail)).append("\n");
        sb.append("    smnDetail: ").append(toIndentedString(smnDetail)).append("\n");
        sb.append("    transform: ").append(toIndentedString(transform)).append("\n");
        sb.append("    deadLetterQueue: ").append(toIndentedString(deadLetterQueue)).append("\n");
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
