package com.huaweicloud.sdk.ccm.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * CreateCertificateAuthorityRequestBody
 */
public class CreateCertificateAuthorityRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "distinguished_name")

    private DistinguishedName distinguishedName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "key_algorithm")

    private String keyAlgorithm;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "validity")

    private Validity validity;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "issuer_id")

    private String issuerId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "path_length")

    private Integer pathLength;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "signature_algorithm")

    private String signatureAlgorithm;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "key_usages")

    private List<String> keyUsages = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "crl_configuration")

    private CrlConfiguration crlConfiguration;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_project_id")

    private String enterpriseProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ca_id")

    private String caId;

    public CreateCertificateAuthorityRequestBody withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * 创建的CA类型。 - **ROOT** : 根CA - **SUBORDINATE** : 从属CA
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public CreateCertificateAuthorityRequestBody withDistinguishedName(DistinguishedName distinguishedName) {
        this.distinguishedName = distinguishedName;
        return this;
    }

    public CreateCertificateAuthorityRequestBody withDistinguishedName(
        Consumer<DistinguishedName> distinguishedNameSetter) {
        if (this.distinguishedName == null) {
            this.distinguishedName = new DistinguishedName();
            distinguishedNameSetter.accept(this.distinguishedName);
        }

        return this;
    }

    /**
     * Get distinguishedName
     * @return distinguishedName
     */
    public DistinguishedName getDistinguishedName() {
        return distinguishedName;
    }

    public void setDistinguishedName(DistinguishedName distinguishedName) {
        this.distinguishedName = distinguishedName;
    }

    public CreateCertificateAuthorityRequestBody withKeyAlgorithm(String keyAlgorithm) {
        this.keyAlgorithm = keyAlgorithm;
        return this;
    }

    /**
     * 密钥算法，可选值如下：   - **RSA2048** : RSA算法，密钥长度2048位；   - **RSA4096** : RSA算法，密钥长度4096位；   - **EC256** : 椭圆曲线算法（Elliptic Curve Digital Signature Algorithm (ECDSA)），密钥长度256位；   - **EC384** : 椭圆曲线算法（Elliptic Curve Digital Signature Algorithm (ECDSA)），密钥长度384位；   - **SM2** : 国家密码管理局颁发的椭圆曲线算法（签名哈希算法SM3），密钥长度256位。（中国站）
     * @return keyAlgorithm
     */
    public String getKeyAlgorithm() {
        return keyAlgorithm;
    }

    public void setKeyAlgorithm(String keyAlgorithm) {
        this.keyAlgorithm = keyAlgorithm;
    }

    public CreateCertificateAuthorityRequestBody withValidity(Validity validity) {
        this.validity = validity;
        return this;
    }

    public CreateCertificateAuthorityRequestBody withValidity(Consumer<Validity> validitySetter) {
        if (this.validity == null) {
            this.validity = new Validity();
            validitySetter.accept(this.validity);
        }

        return this;
    }

    /**
     * Get validity
     * @return validity
     */
    public Validity getValidity() {
        return validity;
    }

    public void setValidity(Validity validity) {
        this.validity = validity;
    }

    public CreateCertificateAuthorityRequestBody withIssuerId(String issuerId) {
        this.issuerId = issuerId;
        return this;
    }

    /**
     * 父CA证书ID，分以下三种情况：   - 创建根CA，根CA为自签名证书，无父CA，将忽略该参数；   - 创建从属CA，并需要直接激活该证书，为必填值；   - 创建从属CA，不需要直接激活该证书，本参数值将被忽略，激活证书时需要再次传入。
     * @return issuerId
     */
    public String getIssuerId() {
        return issuerId;
    }

    public void setIssuerId(String issuerId) {
        this.issuerId = issuerId;
    }

    public CreateCertificateAuthorityRequestBody withPathLength(Integer pathLength) {
        this.pathLength = pathLength;
        return this;
    }

    /**
     * CA证书路径长度，分以下三种情况：   - 创建根CA，为便于后期对证书层级的扩展，根CA默认不对路径长度做限制，故将忽略该参数。证书层级规划可由从属CA做限制；   - 创建从属CA，并需要直接激活该证书，用户可自定义。缺省值为0；   - 创建从属CA，不需要直接激活该证书，本参数值将被忽略。激活证书时若要自定义，需要再次传入；
     * minimum: 0
     * maximum: 6
     * @return pathLength
     */
    public Integer getPathLength() {
        return pathLength;
    }

    public void setPathLength(Integer pathLength) {
        this.pathLength = pathLength;
    }

    public CreateCertificateAuthorityRequestBody withSignatureAlgorithm(String signatureAlgorithm) {
        this.signatureAlgorithm = signatureAlgorithm;
        return this;
    }

    /**
     * 签名哈希算法。 - 分以下三种情况：   - 创建根CA，为必填值；   - 创建从属CA，并需要直接激活该证书，为必填值；   - 创建从属CA，不需要直接激活该证书，本参数值将被忽略，激活证书时需要再次传入。 - 可选值如下：   - **SHA256**   - **SHA384**   - **SHA512**   - **SM3**（中国站）
     * @return signatureAlgorithm
     */
    public String getSignatureAlgorithm() {
        return signatureAlgorithm;
    }

    public void setSignatureAlgorithm(String signatureAlgorithm) {
        this.signatureAlgorithm = signatureAlgorithm;
    }

    public CreateCertificateAuthorityRequestBody withKeyUsages(List<String> keyUsages) {
        this.keyUsages = keyUsages;
        return this;
    }

    public CreateCertificateAuthorityRequestBody addKeyUsagesItem(String keyUsagesItem) {
        if (this.keyUsages == null) {
            this.keyUsages = new ArrayList<>();
        }
        this.keyUsages.add(keyUsagesItem);
        return this;
    }

    public CreateCertificateAuthorityRequestBody withKeyUsages(Consumer<List<String>> keyUsagesSetter) {
        if (this.keyUsages == null) {
            this.keyUsages = new ArrayList<>();
        }
        keyUsagesSetter.accept(this.keyUsages);
        return this;
    }

    /**
     * 密钥用法，具体标准参见RFC 5280中:[4.2.1.3节](https://datatracker.ietf.org/doc/html/rfc5280#section-4.2.1.3)。   - **digitalSignature** : 数字签名；   - **nonRepudiation** : 不可抵赖；   - **keyEncipherment** : 密钥用于加密密钥数据；   - **dataEncipherment** : 用于加密数据；   - **keyAgreement** : 密钥协商；   - **keyCertSign** : 签发证书；   - **cRLSign** : 签发吊销列表；   - **encipherOnly** : 仅用于加密；   - **decipherOnly** : 仅用于解密。 > 缺省值如下： > - 根CA证书：默认为**[digitalSignature,keyCertSign,cRLSign]**，忽略用户传入值； > - 从属CA证书：默认为**[digitalSignature,keyCertSign,cRLSign]**，支持用户自定义。
     * @return keyUsages
     */
    public List<String> getKeyUsages() {
        return keyUsages;
    }

    public void setKeyUsages(List<String> keyUsages) {
        this.keyUsages = keyUsages;
    }

    public CreateCertificateAuthorityRequestBody withCrlConfiguration(CrlConfiguration crlConfiguration) {
        this.crlConfiguration = crlConfiguration;
        return this;
    }

    public CreateCertificateAuthorityRequestBody withCrlConfiguration(
        Consumer<CrlConfiguration> crlConfigurationSetter) {
        if (this.crlConfiguration == null) {
            this.crlConfiguration = new CrlConfiguration();
            crlConfigurationSetter.accept(this.crlConfiguration);
        }

        return this;
    }

    /**
     * Get crlConfiguration
     * @return crlConfiguration
     */
    public CrlConfiguration getCrlConfiguration() {
        return crlConfiguration;
    }

    public void setCrlConfiguration(CrlConfiguration crlConfiguration) {
        this.crlConfiguration = crlConfiguration;
    }

    public CreateCertificateAuthorityRequestBody withEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
        return this;
    }

    /**
     * 企业多项目ID。用户未开通企业多项目时，不需要输入该字段。 用户开通企业多项目时，查询资源可以输入该字段。 若用户不输入该字段，默认查询租户所有有权限的企业多项目下的资源。 此时“enterprise_project_id”取值为“all”。 若用户输入该字段，取值满足以下任一条件.   取值为“all”   取值为“0”   满足正则匹配：“^[0-9a-z]{8}-[0-9a-z]{4}-[0-9a-z]{4}-[0-9a-z]{4}-[0-9a-z]{12}$”
     * @return enterpriseProjectId
     */
    public String getEnterpriseProjectId() {
        return enterpriseProjectId;
    }

    public void setEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
    }

    public CreateCertificateAuthorityRequestBody withCaId(String caId) {
        this.caId = caId;
        return this;
    }

    /**
     * CA证书ID。如果为空，则创建按需CA；如果不为空，则保存包周期CA信息。
     * @return caId
     */
    public String getCaId() {
        return caId;
    }

    public void setCaId(String caId) {
        this.caId = caId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateCertificateAuthorityRequestBody that = (CreateCertificateAuthorityRequestBody) obj;
        return Objects.equals(this.type, that.type) && Objects.equals(this.distinguishedName, that.distinguishedName)
            && Objects.equals(this.keyAlgorithm, that.keyAlgorithm) && Objects.equals(this.validity, that.validity)
            && Objects.equals(this.issuerId, that.issuerId) && Objects.equals(this.pathLength, that.pathLength)
            && Objects.equals(this.signatureAlgorithm, that.signatureAlgorithm)
            && Objects.equals(this.keyUsages, that.keyUsages)
            && Objects.equals(this.crlConfiguration, that.crlConfiguration)
            && Objects.equals(this.enterpriseProjectId, that.enterpriseProjectId)
            && Objects.equals(this.caId, that.caId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type,
            distinguishedName,
            keyAlgorithm,
            validity,
            issuerId,
            pathLength,
            signatureAlgorithm,
            keyUsages,
            crlConfiguration,
            enterpriseProjectId,
            caId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateCertificateAuthorityRequestBody {\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    distinguishedName: ").append(toIndentedString(distinguishedName)).append("\n");
        sb.append("    keyAlgorithm: ").append(toIndentedString(keyAlgorithm)).append("\n");
        sb.append("    validity: ").append(toIndentedString(validity)).append("\n");
        sb.append("    issuerId: ").append(toIndentedString(issuerId)).append("\n");
        sb.append("    pathLength: ").append(toIndentedString(pathLength)).append("\n");
        sb.append("    signatureAlgorithm: ").append(toIndentedString(signatureAlgorithm)).append("\n");
        sb.append("    keyUsages: ").append(toIndentedString(keyUsages)).append("\n");
        sb.append("    crlConfiguration: ").append(toIndentedString(crlConfiguration)).append("\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
        sb.append("    caId: ").append(toIndentedString(caId)).append("\n");
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
