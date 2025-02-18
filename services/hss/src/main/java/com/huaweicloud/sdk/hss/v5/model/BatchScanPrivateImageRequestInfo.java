package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * BatchScanPrivateImageRequestInfo
 */
public class BatchScanPrivateImageRequestInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "repo_type")

    private String repoType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "image_info_list")

    private List<BatchScanSwrImageInfo> imageInfoList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "operate_all")

    private Boolean operateAll;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "namespace")

    private String namespace;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "image_name")

    private String imageName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "image_version")

    private String imageVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "image_type")

    private String imageType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "scan_status")

    private String scanStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "latest_version")

    private Boolean latestVersion;

    public BatchScanPrivateImageRequestInfo withRepoType(String repoType) {
        this.repoType = repoType;
        return this;
    }

    /**
     * 仓库类型，现阶段接入了swr镜像仓库，包含如下:   - SWR : SWR镜像仓库
     * @return repoType
     */
    public String getRepoType() {
        return repoType;
    }

    public void setRepoType(String repoType) {
        this.repoType = repoType;
    }

    public BatchScanPrivateImageRequestInfo withImageInfoList(List<BatchScanSwrImageInfo> imageInfoList) {
        this.imageInfoList = imageInfoList;
        return this;
    }

    public BatchScanPrivateImageRequestInfo addImageInfoListItem(BatchScanSwrImageInfo imageInfoListItem) {
        if (this.imageInfoList == null) {
            this.imageInfoList = new ArrayList<>();
        }
        this.imageInfoList.add(imageInfoListItem);
        return this;
    }

    public BatchScanPrivateImageRequestInfo withImageInfoList(
        Consumer<List<BatchScanSwrImageInfo>> imageInfoListSetter) {
        if (this.imageInfoList == null) {
            this.imageInfoList = new ArrayList<>();
        }
        imageInfoListSetter.accept(this.imageInfoList);
        return this;
    }

    /**
     * 要扫描的镜像信息列表，operate_all参数为false时为必填
     * @return imageInfoList
     */
    public List<BatchScanSwrImageInfo> getImageInfoList() {
        return imageInfoList;
    }

    public void setImageInfoList(List<BatchScanSwrImageInfo> imageInfoList) {
        this.imageInfoList = imageInfoList;
    }

    public BatchScanPrivateImageRequestInfo withOperateAll(Boolean operateAll) {
        this.operateAll = operateAll;
        return this;
    }

    /**
     * 若为true全量查询，可筛选条件全部查询，若image_info_list为空，则必填
     * @return operateAll
     */
    public Boolean getOperateAll() {
        return operateAll;
    }

    public void setOperateAll(Boolean operateAll) {
        this.operateAll = operateAll;
    }

    public BatchScanPrivateImageRequestInfo withNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    /**
     * 组织名称
     * @return namespace
     */
    public String getNamespace() {
        return namespace;
    }

    public void setNamespace(String namespace) {
        this.namespace = namespace;
    }

    public BatchScanPrivateImageRequestInfo withImageName(String imageName) {
        this.imageName = imageName;
        return this;
    }

    /**
     * 镜像名称
     * @return imageName
     */
    public String getImageName() {
        return imageName;
    }

    public void setImageName(String imageName) {
        this.imageName = imageName;
    }

    public BatchScanPrivateImageRequestInfo withImageVersion(String imageVersion) {
        this.imageVersion = imageVersion;
        return this;
    }

    /**
     * 镜像版本
     * @return imageVersion
     */
    public String getImageVersion() {
        return imageVersion;
    }

    public void setImageVersion(String imageVersion) {
        this.imageVersion = imageVersion;
    }

    public BatchScanPrivateImageRequestInfo withImageType(String imageType) {
        this.imageType = imageType;
        return this;
    }

    /**
     * 镜像类型，包含如下:   - private_image : 私有镜像仓库   - shared_image : 共享镜像仓库
     * @return imageType
     */
    public String getImageType() {
        return imageType;
    }

    public void setImageType(String imageType) {
        this.imageType = imageType;
    }

    public BatchScanPrivateImageRequestInfo withScanStatus(String scanStatus) {
        this.scanStatus = scanStatus;
        return this;
    }

    /**
     * 扫描状态，包含如下:   - unscan : 未扫描   - success : 扫描完成   - scanning : 扫描中   - failed : 扫描失败   - download_failed : 下载失败   - image_oversized : 镜像超大
     * @return scanStatus
     */
    public String getScanStatus() {
        return scanStatus;
    }

    public void setScanStatus(String scanStatus) {
        this.scanStatus = scanStatus;
    }

    public BatchScanPrivateImageRequestInfo withLatestVersion(Boolean latestVersion) {
        this.latestVersion = latestVersion;
        return this;
    }

    /**
     * 仅关注最新版本镜像
     * @return latestVersion
     */
    public Boolean getLatestVersion() {
        return latestVersion;
    }

    public void setLatestVersion(Boolean latestVersion) {
        this.latestVersion = latestVersion;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BatchScanPrivateImageRequestInfo that = (BatchScanPrivateImageRequestInfo) obj;
        return Objects.equals(this.repoType, that.repoType) && Objects.equals(this.imageInfoList, that.imageInfoList)
            && Objects.equals(this.operateAll, that.operateAll) && Objects.equals(this.namespace, that.namespace)
            && Objects.equals(this.imageName, that.imageName) && Objects.equals(this.imageVersion, that.imageVersion)
            && Objects.equals(this.imageType, that.imageType) && Objects.equals(this.scanStatus, that.scanStatus)
            && Objects.equals(this.latestVersion, that.latestVersion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(repoType,
            imageInfoList,
            operateAll,
            namespace,
            imageName,
            imageVersion,
            imageType,
            scanStatus,
            latestVersion);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchScanPrivateImageRequestInfo {\n");
        sb.append("    repoType: ").append(toIndentedString(repoType)).append("\n");
        sb.append("    imageInfoList: ").append(toIndentedString(imageInfoList)).append("\n");
        sb.append("    operateAll: ").append(toIndentedString(operateAll)).append("\n");
        sb.append("    namespace: ").append(toIndentedString(namespace)).append("\n");
        sb.append("    imageName: ").append(toIndentedString(imageName)).append("\n");
        sb.append("    imageVersion: ").append(toIndentedString(imageVersion)).append("\n");
        sb.append("    imageType: ").append(toIndentedString(imageType)).append("\n");
        sb.append("    scanStatus: ").append(toIndentedString(scanStatus)).append("\n");
        sb.append("    latestVersion: ").append(toIndentedString(latestVersion)).append("\n");
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
