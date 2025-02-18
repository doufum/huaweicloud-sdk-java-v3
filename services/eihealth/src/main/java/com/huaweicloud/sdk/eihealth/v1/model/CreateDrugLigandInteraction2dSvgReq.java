package com.huaweicloud.sdk.eihealth.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 生成相互作用2D图请求体
 */
public class CreateDrugLigandInteraction2dSvgReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "receptor_file")

    private ReceptorDrugFile receptorFile;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ligand_file")

    private DrugFile ligandFile;

    public CreateDrugLigandInteraction2dSvgReq withReceptorFile(ReceptorDrugFile receptorFile) {
        this.receptorFile = receptorFile;
        return this;
    }

    public CreateDrugLigandInteraction2dSvgReq withReceptorFile(Consumer<ReceptorDrugFile> receptorFileSetter) {
        if (this.receptorFile == null) {
            this.receptorFile = new ReceptorDrugFile();
            receptorFileSetter.accept(this.receptorFile);
        }

        return this;
    }

    /**
     * Get receptorFile
     * @return receptorFile
     */
    public ReceptorDrugFile getReceptorFile() {
        return receptorFile;
    }

    public void setReceptorFile(ReceptorDrugFile receptorFile) {
        this.receptorFile = receptorFile;
    }

    public CreateDrugLigandInteraction2dSvgReq withLigandFile(DrugFile ligandFile) {
        this.ligandFile = ligandFile;
        return this;
    }

    public CreateDrugLigandInteraction2dSvgReq withLigandFile(Consumer<DrugFile> ligandFileSetter) {
        if (this.ligandFile == null) {
            this.ligandFile = new DrugFile();
            ligandFileSetter.accept(this.ligandFile);
        }

        return this;
    }

    /**
     * Get ligandFile
     * @return ligandFile
     */
    public DrugFile getLigandFile() {
        return ligandFile;
    }

    public void setLigandFile(DrugFile ligandFile) {
        this.ligandFile = ligandFile;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateDrugLigandInteraction2dSvgReq that = (CreateDrugLigandInteraction2dSvgReq) obj;
        return Objects.equals(this.receptorFile, that.receptorFile) && Objects.equals(this.ligandFile, that.ligandFile);
    }

    @Override
    public int hashCode() {
        return Objects.hash(receptorFile, ligandFile);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateDrugLigandInteraction2dSvgReq {\n");
        sb.append("    receptorFile: ").append(toIndentedString(receptorFile)).append("\n");
        sb.append("    ligandFile: ").append(toIndentedString(ligandFile)).append("\n");
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
