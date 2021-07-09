package com.huaweicloud.sdk.ccm.v1.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * ParseCertificateSigningRequestRequestBody
 */
public class ParseCertificateSigningRequestRequestBody  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="csr")
    
    private String csr;

    public ParseCertificateSigningRequestRequestBody withCsr(String csr) {
        this.csr = csr;
        return this;
    }

    


    /**
     * 证书请求内容
     * @return csr
     */
    public String getCsr() {
        return csr;
    }

    public void setCsr(String csr) {
        this.csr = csr;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ParseCertificateSigningRequestRequestBody parseCertificateSigningRequestRequestBody = (ParseCertificateSigningRequestRequestBody) o;
        return Objects.equals(this.csr, parseCertificateSigningRequestRequestBody.csr);
    }
    @Override
    public int hashCode() {
        return Objects.hash(csr);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ParseCertificateSigningRequestRequestBody {\n");
        sb.append("    csr: ").append(toIndentedString(csr)).append("\n");
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

