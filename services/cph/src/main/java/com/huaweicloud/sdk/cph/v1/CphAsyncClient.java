package com.huaweicloud.sdk.cph.v1;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.AsyncInvoker;
import com.huaweicloud.sdk.cph.v1.model.BatchCreateTagsRequest;
import com.huaweicloud.sdk.cph.v1.model.BatchCreateTagsResponse;
import com.huaweicloud.sdk.cph.v1.model.BatchDeleteTagsRequest;
import com.huaweicloud.sdk.cph.v1.model.BatchDeleteTagsResponse;
import com.huaweicloud.sdk.cph.v1.model.BatchExportCloudPhoneDataRequest;
import com.huaweicloud.sdk.cph.v1.model.BatchExportCloudPhoneDataResponse;
import com.huaweicloud.sdk.cph.v1.model.BatchImportCloudPhoneDataRequest;
import com.huaweicloud.sdk.cph.v1.model.BatchImportCloudPhoneDataResponse;
import com.huaweicloud.sdk.cph.v1.model.ChangeCloudPhoneServerModelRequest;
import com.huaweicloud.sdk.cph.v1.model.ChangeCloudPhoneServerModelResponse;
import com.huaweicloud.sdk.cph.v1.model.CreateNet2CloudPhoneServerRequest;
import com.huaweicloud.sdk.cph.v1.model.CreateNet2CloudPhoneServerResponse;
import com.huaweicloud.sdk.cph.v1.model.DeleteShareAppsRequest;
import com.huaweicloud.sdk.cph.v1.model.DeleteShareAppsResponse;
import com.huaweicloud.sdk.cph.v1.model.DeleteShareFilesRequest;
import com.huaweicloud.sdk.cph.v1.model.DeleteShareFilesResponse;
import com.huaweicloud.sdk.cph.v1.model.ImportTrafficRequest;
import com.huaweicloud.sdk.cph.v1.model.ImportTrafficResponse;
import com.huaweicloud.sdk.cph.v1.model.InstallApkRequest;
import com.huaweicloud.sdk.cph.v1.model.InstallApkResponse;
import com.huaweicloud.sdk.cph.v1.model.ListCloudPhoneImagesRequest;
import com.huaweicloud.sdk.cph.v1.model.ListCloudPhoneImagesResponse;
import com.huaweicloud.sdk.cph.v1.model.ListCloudPhoneModelsRequest;
import com.huaweicloud.sdk.cph.v1.model.ListCloudPhoneModelsResponse;
import com.huaweicloud.sdk.cph.v1.model.ListCloudPhoneServerModelsRequest;
import com.huaweicloud.sdk.cph.v1.model.ListCloudPhoneServerModelsResponse;
import com.huaweicloud.sdk.cph.v1.model.ListCloudPhoneServersRequest;
import com.huaweicloud.sdk.cph.v1.model.ListCloudPhoneServersResponse;
import com.huaweicloud.sdk.cph.v1.model.ListCloudPhonesRequest;
import com.huaweicloud.sdk.cph.v1.model.ListCloudPhonesResponse;
import com.huaweicloud.sdk.cph.v1.model.ListEncodeServersRequest;
import com.huaweicloud.sdk.cph.v1.model.ListEncodeServersResponse;
import com.huaweicloud.sdk.cph.v1.model.ListJobsRequest;
import com.huaweicloud.sdk.cph.v1.model.ListJobsResponse;
import com.huaweicloud.sdk.cph.v1.model.ListProjectTagsRequest;
import com.huaweicloud.sdk.cph.v1.model.ListProjectTagsResponse;
import com.huaweicloud.sdk.cph.v1.model.ListResourceInstancesRequest;
import com.huaweicloud.sdk.cph.v1.model.ListResourceInstancesResponse;
import com.huaweicloud.sdk.cph.v1.model.ListResourceTagsRequest;
import com.huaweicloud.sdk.cph.v1.model.ListResourceTagsResponse;
import com.huaweicloud.sdk.cph.v1.model.ListShareFilesRequest;
import com.huaweicloud.sdk.cph.v1.model.ListShareFilesResponse;
import com.huaweicloud.sdk.cph.v1.model.PushFileRequest;
import com.huaweicloud.sdk.cph.v1.model.PushFileResponse;
import com.huaweicloud.sdk.cph.v1.model.PushShareAppsRequest;
import com.huaweicloud.sdk.cph.v1.model.PushShareAppsResponse;
import com.huaweicloud.sdk.cph.v1.model.PushShareFilesRequest;
import com.huaweicloud.sdk.cph.v1.model.PushShareFilesResponse;
import com.huaweicloud.sdk.cph.v1.model.ResetCloudPhoneRequest;
import com.huaweicloud.sdk.cph.v1.model.ResetCloudPhoneResponse;
import com.huaweicloud.sdk.cph.v1.model.RestartCloudPhoneRequest;
import com.huaweicloud.sdk.cph.v1.model.RestartCloudPhoneResponse;
import com.huaweicloud.sdk.cph.v1.model.RestartCloudPhoneServerRequest;
import com.huaweicloud.sdk.cph.v1.model.RestartCloudPhoneServerResponse;
import com.huaweicloud.sdk.cph.v1.model.RestartEncodeServerRequest;
import com.huaweicloud.sdk.cph.v1.model.RestartEncodeServerResponse;
import com.huaweicloud.sdk.cph.v1.model.RunShellCommandRequest;
import com.huaweicloud.sdk.cph.v1.model.RunShellCommandResponse;
import com.huaweicloud.sdk.cph.v1.model.RunSyncCommandRequest;
import com.huaweicloud.sdk.cph.v1.model.RunSyncCommandResponse;
import com.huaweicloud.sdk.cph.v1.model.ShowBandwidthDetailRequest;
import com.huaweicloud.sdk.cph.v1.model.ShowBandwidthDetailResponse;
import com.huaweicloud.sdk.cph.v1.model.ShowCloudPhoneDetailRequest;
import com.huaweicloud.sdk.cph.v1.model.ShowCloudPhoneDetailResponse;
import com.huaweicloud.sdk.cph.v1.model.ShowCloudPhoneServerDetailRequest;
import com.huaweicloud.sdk.cph.v1.model.ShowCloudPhoneServerDetailResponse;
import com.huaweicloud.sdk.cph.v1.model.ShowJobRequest;
import com.huaweicloud.sdk.cph.v1.model.ShowJobResponse;
import com.huaweicloud.sdk.cph.v1.model.StopCloudPhoneRequest;
import com.huaweicloud.sdk.cph.v1.model.StopCloudPhoneResponse;
import com.huaweicloud.sdk.cph.v1.model.UninstallApkRequest;
import com.huaweicloud.sdk.cph.v1.model.UninstallApkResponse;
import com.huaweicloud.sdk.cph.v1.model.UpdateBandwidthRequest;
import com.huaweicloud.sdk.cph.v1.model.UpdateBandwidthResponse;
import com.huaweicloud.sdk.cph.v1.model.UpdateCloudPhonePropertyRequest;
import com.huaweicloud.sdk.cph.v1.model.UpdateCloudPhonePropertyResponse;
import com.huaweicloud.sdk.cph.v1.model.UpdateKeypairRequest;
import com.huaweicloud.sdk.cph.v1.model.UpdateKeypairResponse;
import com.huaweicloud.sdk.cph.v1.model.UpdatePhoneNameRequest;
import com.huaweicloud.sdk.cph.v1.model.UpdatePhoneNameResponse;
import com.huaweicloud.sdk.cph.v1.model.UpdateServerNameRequest;
import com.huaweicloud.sdk.cph.v1.model.UpdateServerNameResponse;

import java.util.concurrent.CompletableFuture;

public class CphAsyncClient {

    protected HcClient hcClient;

    public CphAsyncClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<CphAsyncClient> newBuilder() {
        ClientBuilder<CphAsyncClient> clientBuilder = new ClientBuilder<>(CphAsyncClient::new);
        return clientBuilder;
    }

    /**
     * 批量添加标签
     *
     * 批量添加标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchCreateTagsRequest 请求对象
     * @return CompletableFuture<BatchCreateTagsResponse>
     */
    public CompletableFuture<BatchCreateTagsResponse> batchCreateTagsAsync(BatchCreateTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, CphMeta.batchCreateTags);
    }

    /**
     * 批量添加标签
     *
     * 批量添加标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchCreateTagsRequest 请求对象
     * @return AsyncInvoker<BatchCreateTagsRequest, BatchCreateTagsResponse>
     */
    public AsyncInvoker<BatchCreateTagsRequest, BatchCreateTagsResponse> batchCreateTagsAsyncInvoker(
        BatchCreateTagsRequest request) {
        return new AsyncInvoker<BatchCreateTagsRequest, BatchCreateTagsResponse>(request, CphMeta.batchCreateTags,
            hcClient);
    }

    /**
     * 批量删除标签
     *
     * 批量删除标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchDeleteTagsRequest 请求对象
     * @return CompletableFuture<BatchDeleteTagsResponse>
     */
    public CompletableFuture<BatchDeleteTagsResponse> batchDeleteTagsAsync(BatchDeleteTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, CphMeta.batchDeleteTags);
    }

    /**
     * 批量删除标签
     *
     * 批量删除标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchDeleteTagsRequest 请求对象
     * @return AsyncInvoker<BatchDeleteTagsRequest, BatchDeleteTagsResponse>
     */
    public AsyncInvoker<BatchDeleteTagsRequest, BatchDeleteTagsResponse> batchDeleteTagsAsyncInvoker(
        BatchDeleteTagsRequest request) {
        return new AsyncInvoker<BatchDeleteTagsRequest, BatchDeleteTagsResponse>(request, CphMeta.batchDeleteTags,
            hcClient);
    }

    /**
     * 导出云手机数据
     *
     * 批量导出云手机中的数据。该接口为异步接口。[接口调用前请先确保已完成CPH服务操作OBS桶的委托授权。委托CPH操作OBS桶请参见[委托CPH操作OBS桶](https://support.huaweicloud.com/bestpractice-cph/cph_bp_0050.html)。](tag:hws)[接口调用前请先确保已完成CPH服务操作OBS桶的委托授权。委托CPH操作OBS桶请参见[委托CPH操作OBS桶](https://support.huaweicloud.com/intl/zh-cn/bestpractice-cph/cph_bp_0050.html)。](tag:hws_hk)
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchExportCloudPhoneDataRequest 请求对象
     * @return CompletableFuture<BatchExportCloudPhoneDataResponse>
     */
    public CompletableFuture<BatchExportCloudPhoneDataResponse> batchExportCloudPhoneDataAsync(
        BatchExportCloudPhoneDataRequest request) {
        return hcClient.asyncInvokeHttp(request, CphMeta.batchExportCloudPhoneData);
    }

    /**
     * 导出云手机数据
     *
     * 批量导出云手机中的数据。该接口为异步接口。[接口调用前请先确保已完成CPH服务操作OBS桶的委托授权。委托CPH操作OBS桶请参见[委托CPH操作OBS桶](https://support.huaweicloud.com/bestpractice-cph/cph_bp_0050.html)。](tag:hws)[接口调用前请先确保已完成CPH服务操作OBS桶的委托授权。委托CPH操作OBS桶请参见[委托CPH操作OBS桶](https://support.huaweicloud.com/intl/zh-cn/bestpractice-cph/cph_bp_0050.html)。](tag:hws_hk)
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchExportCloudPhoneDataRequest 请求对象
     * @return AsyncInvoker<BatchExportCloudPhoneDataRequest, BatchExportCloudPhoneDataResponse>
     */
    public AsyncInvoker<BatchExportCloudPhoneDataRequest, BatchExportCloudPhoneDataResponse> batchExportCloudPhoneDataAsyncInvoker(
        BatchExportCloudPhoneDataRequest request) {
        return new AsyncInvoker<BatchExportCloudPhoneDataRequest, BatchExportCloudPhoneDataResponse>(request,
            CphMeta.batchExportCloudPhoneData, hcClient);
    }

    /**
     * 恢复云手机数据
     *
     * 批量恢复数据到云手机中。该接口为异步接口。[接口调用前请先确保已完成CPH服务操作OBS桶的委托授权。委托CPH操作OBS桶请参见[委托CPH操作OBS桶](https://support.huaweicloud.com/bestpractice-cph/cph_bp_0050.html)。](tag:hws)[接口调用前请先确保已完成CPH服务操作OBS桶的委托授权。委托CPH操作OBS桶请参见[委托CPH操作OBS桶](https://support.huaweicloud.com/intl/zh-cn/bestpractice-cph/cph_bp_0050.html)。](tag:hws_hk)
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchImportCloudPhoneDataRequest 请求对象
     * @return CompletableFuture<BatchImportCloudPhoneDataResponse>
     */
    public CompletableFuture<BatchImportCloudPhoneDataResponse> batchImportCloudPhoneDataAsync(
        BatchImportCloudPhoneDataRequest request) {
        return hcClient.asyncInvokeHttp(request, CphMeta.batchImportCloudPhoneData);
    }

    /**
     * 恢复云手机数据
     *
     * 批量恢复数据到云手机中。该接口为异步接口。[接口调用前请先确保已完成CPH服务操作OBS桶的委托授权。委托CPH操作OBS桶请参见[委托CPH操作OBS桶](https://support.huaweicloud.com/bestpractice-cph/cph_bp_0050.html)。](tag:hws)[接口调用前请先确保已完成CPH服务操作OBS桶的委托授权。委托CPH操作OBS桶请参见[委托CPH操作OBS桶](https://support.huaweicloud.com/intl/zh-cn/bestpractice-cph/cph_bp_0050.html)。](tag:hws_hk)
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchImportCloudPhoneDataRequest 请求对象
     * @return AsyncInvoker<BatchImportCloudPhoneDataRequest, BatchImportCloudPhoneDataResponse>
     */
    public AsyncInvoker<BatchImportCloudPhoneDataRequest, BatchImportCloudPhoneDataResponse> batchImportCloudPhoneDataAsyncInvoker(
        BatchImportCloudPhoneDataRequest request) {
        return new AsyncInvoker<BatchImportCloudPhoneDataRequest, BatchImportCloudPhoneDataResponse>(request,
            CphMeta.batchImportCloudPhoneData, hcClient);
    }

    /**
     * 变更云手机服务器规格
     *
     * 变更云手机服务器规格。变更的目标规格也必须为特殊的规格才可变更。接口调用成功后，大约2分钟左右规格会变更结束，在订单中心可以查看到变更的订单状态为成功，且查询服务器的详细信息，可以查看到服务器规格名称已经变成新的规格名称。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ChangeCloudPhoneServerModelRequest 请求对象
     * @return CompletableFuture<ChangeCloudPhoneServerModelResponse>
     */
    public CompletableFuture<ChangeCloudPhoneServerModelResponse> changeCloudPhoneServerModelAsync(
        ChangeCloudPhoneServerModelRequest request) {
        return hcClient.asyncInvokeHttp(request, CphMeta.changeCloudPhoneServerModel);
    }

    /**
     * 变更云手机服务器规格
     *
     * 变更云手机服务器规格。变更的目标规格也必须为特殊的规格才可变更。接口调用成功后，大约2分钟左右规格会变更结束，在订单中心可以查看到变更的订单状态为成功，且查询服务器的详细信息，可以查看到服务器规格名称已经变成新的规格名称。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ChangeCloudPhoneServerModelRequest 请求对象
     * @return AsyncInvoker<ChangeCloudPhoneServerModelRequest, ChangeCloudPhoneServerModelResponse>
     */
    public AsyncInvoker<ChangeCloudPhoneServerModelRequest, ChangeCloudPhoneServerModelResponse> changeCloudPhoneServerModelAsyncInvoker(
        ChangeCloudPhoneServerModelRequest request) {
        return new AsyncInvoker<ChangeCloudPhoneServerModelRequest, ChangeCloudPhoneServerModelResponse>(request,
            CphMeta.changeCloudPhoneServerModel, hcClient);
    }

    /**
     * 购买自定义网络云手机服务器
     *
     * 购买自定义网络的云手机服务器。自定义网络是云手机全新一代网络配置管理模式，支持您复用已有的VPC网络管理云手机服务器，支持云手机服务器复用您已购买的共享带宽等资源。
     * - 请确保您已具有虚拟私有云资源，创建服务器需要指定一个已有的虚拟私有云，否则无法创建服务器。
     * - 请确保已正确创建委托（委托名称cph_admin_trust，委托服务CPH），委托未被删除， 确保委托包含VPC FullAccess权限，委托及权限校验失败将导致云服务器创建失败。创建委托时委托类型选择“云服务”，云服务选择“CPH”，即允许CPH调用云服务。
     * - 请确保您使用的账号具有Security Administrator权限或者具备创建委托的细粒度权限iam:agencies:createAgency。
     * - 请确保您有足够的服务器及网络配额，配额校验不通过将导致创建失败。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateNet2CloudPhoneServerRequest 请求对象
     * @return CompletableFuture<CreateNet2CloudPhoneServerResponse>
     */
    public CompletableFuture<CreateNet2CloudPhoneServerResponse> createNet2CloudPhoneServerAsync(
        CreateNet2CloudPhoneServerRequest request) {
        return hcClient.asyncInvokeHttp(request, CphMeta.createNet2CloudPhoneServer);
    }

    /**
     * 购买自定义网络云手机服务器
     *
     * 购买自定义网络的云手机服务器。自定义网络是云手机全新一代网络配置管理模式，支持您复用已有的VPC网络管理云手机服务器，支持云手机服务器复用您已购买的共享带宽等资源。
     * - 请确保您已具有虚拟私有云资源，创建服务器需要指定一个已有的虚拟私有云，否则无法创建服务器。
     * - 请确保已正确创建委托（委托名称cph_admin_trust，委托服务CPH），委托未被删除， 确保委托包含VPC FullAccess权限，委托及权限校验失败将导致云服务器创建失败。创建委托时委托类型选择“云服务”，云服务选择“CPH”，即允许CPH调用云服务。
     * - 请确保您使用的账号具有Security Administrator权限或者具备创建委托的细粒度权限iam:agencies:createAgency。
     * - 请确保您有足够的服务器及网络配额，配额校验不通过将导致创建失败。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateNet2CloudPhoneServerRequest 请求对象
     * @return AsyncInvoker<CreateNet2CloudPhoneServerRequest, CreateNet2CloudPhoneServerResponse>
     */
    public AsyncInvoker<CreateNet2CloudPhoneServerRequest, CreateNet2CloudPhoneServerResponse> createNet2CloudPhoneServerAsyncInvoker(
        CreateNet2CloudPhoneServerRequest request) {
        return new AsyncInvoker<CreateNet2CloudPhoneServerRequest, CreateNet2CloudPhoneServerResponse>(request,
            CphMeta.createNet2CloudPhoneServer, hcClient);
    }

    /**
     * 删除共享应用
     *
     * 在共享应用存储目录中删除共享应用，该功能仅在支持共享应用的云手机规格上可实现。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteShareAppsRequest 请求对象
     * @return CompletableFuture<DeleteShareAppsResponse>
     */
    public CompletableFuture<DeleteShareAppsResponse> deleteShareAppsAsync(DeleteShareAppsRequest request) {
        return hcClient.asyncInvokeHttp(request, CphMeta.deleteShareApps);
    }

    /**
     * 删除共享应用
     *
     * 在共享应用存储目录中删除共享应用，该功能仅在支持共享应用的云手机规格上可实现。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteShareAppsRequest 请求对象
     * @return AsyncInvoker<DeleteShareAppsRequest, DeleteShareAppsResponse>
     */
    public AsyncInvoker<DeleteShareAppsRequest, DeleteShareAppsResponse> deleteShareAppsAsyncInvoker(
        DeleteShareAppsRequest request) {
        return new AsyncInvoker<DeleteShareAppsRequest, DeleteShareAppsResponse>(request, CphMeta.deleteShareApps,
            hcClient);
    }

    /**
     * 删除共享存储文件
     *
     * 删除共享存储目录中文件，该功能仅在支持共享存储的云手机规格上可实现。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteShareFilesRequest 请求对象
     * @return CompletableFuture<DeleteShareFilesResponse>
     */
    public CompletableFuture<DeleteShareFilesResponse> deleteShareFilesAsync(DeleteShareFilesRequest request) {
        return hcClient.asyncInvokeHttp(request, CphMeta.deleteShareFiles);
    }

    /**
     * 删除共享存储文件
     *
     * 删除共享存储目录中文件，该功能仅在支持共享存储的云手机规格上可实现。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteShareFilesRequest 请求对象
     * @return AsyncInvoker<DeleteShareFilesRequest, DeleteShareFilesResponse>
     */
    public AsyncInvoker<DeleteShareFilesRequest, DeleteShareFilesResponse> deleteShareFilesAsyncInvoker(
        DeleteShareFilesRequest request) {
        return new AsyncInvoker<DeleteShareFilesRequest, DeleteShareFilesResponse>(request, CphMeta.deleteShareFiles,
            hcClient);
    }

    /**
     * 云手机流量导流
     *
     * 手机流量路由修改。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ImportTrafficRequest 请求对象
     * @return CompletableFuture<ImportTrafficResponse>
     */
    public CompletableFuture<ImportTrafficResponse> importTrafficAsync(ImportTrafficRequest request) {
        return hcClient.asyncInvokeHttp(request, CphMeta.importTraffic);
    }

    /**
     * 云手机流量导流
     *
     * 手机流量路由修改。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ImportTrafficRequest 请求对象
     * @return AsyncInvoker<ImportTrafficRequest, ImportTrafficResponse>
     */
    public AsyncInvoker<ImportTrafficRequest, ImportTrafficResponse> importTrafficAsyncInvoker(
        ImportTrafficRequest request) {
        return new AsyncInvoker<ImportTrafficRequest, ImportTrafficResponse>(request, CphMeta.importTraffic, hcClient);
    }

    /**
     * 查询手机镜像
     *
     * 根据项目ID查询可用的手机镜像。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListCloudPhoneImagesRequest 请求对象
     * @return CompletableFuture<ListCloudPhoneImagesResponse>
     */
    public CompletableFuture<ListCloudPhoneImagesResponse> listCloudPhoneImagesAsync(
        ListCloudPhoneImagesRequest request) {
        return hcClient.asyncInvokeHttp(request, CphMeta.listCloudPhoneImages);
    }

    /**
     * 查询手机镜像
     *
     * 根据项目ID查询可用的手机镜像。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListCloudPhoneImagesRequest 请求对象
     * @return AsyncInvoker<ListCloudPhoneImagesRequest, ListCloudPhoneImagesResponse>
     */
    public AsyncInvoker<ListCloudPhoneImagesRequest, ListCloudPhoneImagesResponse> listCloudPhoneImagesAsyncInvoker(
        ListCloudPhoneImagesRequest request) {
        return new AsyncInvoker<ListCloudPhoneImagesRequest, ListCloudPhoneImagesResponse>(request,
            CphMeta.listCloudPhoneImages, hcClient);
    }

    /**
     * 查询云手机规格列表
     *
     * 查询或统计云手机的规格列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListCloudPhoneModelsRequest 请求对象
     * @return CompletableFuture<ListCloudPhoneModelsResponse>
     */
    public CompletableFuture<ListCloudPhoneModelsResponse> listCloudPhoneModelsAsync(
        ListCloudPhoneModelsRequest request) {
        return hcClient.asyncInvokeHttp(request, CphMeta.listCloudPhoneModels);
    }

    /**
     * 查询云手机规格列表
     *
     * 查询或统计云手机的规格列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListCloudPhoneModelsRequest 请求对象
     * @return AsyncInvoker<ListCloudPhoneModelsRequest, ListCloudPhoneModelsResponse>
     */
    public AsyncInvoker<ListCloudPhoneModelsRequest, ListCloudPhoneModelsResponse> listCloudPhoneModelsAsyncInvoker(
        ListCloudPhoneModelsRequest request) {
        return new AsyncInvoker<ListCloudPhoneModelsRequest, ListCloudPhoneModelsResponse>(request,
            CphMeta.listCloudPhoneModels, hcClient);
    }

    /**
     * 查询云手机服务器规格列表
     *
     * 查询云手机服务器的规格列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListCloudPhoneServerModelsRequest 请求对象
     * @return CompletableFuture<ListCloudPhoneServerModelsResponse>
     */
    public CompletableFuture<ListCloudPhoneServerModelsResponse> listCloudPhoneServerModelsAsync(
        ListCloudPhoneServerModelsRequest request) {
        return hcClient.asyncInvokeHttp(request, CphMeta.listCloudPhoneServerModels);
    }

    /**
     * 查询云手机服务器规格列表
     *
     * 查询云手机服务器的规格列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListCloudPhoneServerModelsRequest 请求对象
     * @return AsyncInvoker<ListCloudPhoneServerModelsRequest, ListCloudPhoneServerModelsResponse>
     */
    public AsyncInvoker<ListCloudPhoneServerModelsRequest, ListCloudPhoneServerModelsResponse> listCloudPhoneServerModelsAsyncInvoker(
        ListCloudPhoneServerModelsRequest request) {
        return new AsyncInvoker<ListCloudPhoneServerModelsRequest, ListCloudPhoneServerModelsResponse>(request,
            CphMeta.listCloudPhoneServerModels, hcClient);
    }

    /**
     * 查询云手机服务器列表
     *
     * 分页查询云手机服务器，云手机服务器列表按照创建时间进行降序排列。分页查询可以指定offset以及limit。如果不存在云手机服务器，则返回空列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListCloudPhoneServersRequest 请求对象
     * @return CompletableFuture<ListCloudPhoneServersResponse>
     */
    public CompletableFuture<ListCloudPhoneServersResponse> listCloudPhoneServersAsync(
        ListCloudPhoneServersRequest request) {
        return hcClient.asyncInvokeHttp(request, CphMeta.listCloudPhoneServers);
    }

    /**
     * 查询云手机服务器列表
     *
     * 分页查询云手机服务器，云手机服务器列表按照创建时间进行降序排列。分页查询可以指定offset以及limit。如果不存在云手机服务器，则返回空列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListCloudPhoneServersRequest 请求对象
     * @return AsyncInvoker<ListCloudPhoneServersRequest, ListCloudPhoneServersResponse>
     */
    public AsyncInvoker<ListCloudPhoneServersRequest, ListCloudPhoneServersResponse> listCloudPhoneServersAsyncInvoker(
        ListCloudPhoneServersRequest request) {
        return new AsyncInvoker<ListCloudPhoneServersRequest, ListCloudPhoneServersResponse>(request,
            CphMeta.listCloudPhoneServers, hcClient);
    }

    /**
     * 查询云手机列表
     *
     * 分页查询云手机，云手机列表按照创建时间进行降序排列。分页查询可以指定offset以及limit。如果不存在云手机，则返回空列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListCloudPhonesRequest 请求对象
     * @return CompletableFuture<ListCloudPhonesResponse>
     */
    public CompletableFuture<ListCloudPhonesResponse> listCloudPhonesAsync(ListCloudPhonesRequest request) {
        return hcClient.asyncInvokeHttp(request, CphMeta.listCloudPhones);
    }

    /**
     * 查询云手机列表
     *
     * 分页查询云手机，云手机列表按照创建时间进行降序排列。分页查询可以指定offset以及limit。如果不存在云手机，则返回空列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListCloudPhonesRequest 请求对象
     * @return AsyncInvoker<ListCloudPhonesRequest, ListCloudPhonesResponse>
     */
    public AsyncInvoker<ListCloudPhonesRequest, ListCloudPhonesResponse> listCloudPhonesAsyncInvoker(
        ListCloudPhonesRequest request) {
        return new AsyncInvoker<ListCloudPhonesRequest, ListCloudPhonesResponse>(request, CphMeta.listCloudPhones,
            hcClient);
    }

    /**
     * 查询编码服务
     *
     * 查询编码服务列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListEncodeServersRequest 请求对象
     * @return CompletableFuture<ListEncodeServersResponse>
     */
    public CompletableFuture<ListEncodeServersResponse> listEncodeServersAsync(ListEncodeServersRequest request) {
        return hcClient.asyncInvokeHttp(request, CphMeta.listEncodeServers);
    }

    /**
     * 查询编码服务
     *
     * 查询编码服务列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListEncodeServersRequest 请求对象
     * @return AsyncInvoker<ListEncodeServersRequest, ListEncodeServersResponse>
     */
    public AsyncInvoker<ListEncodeServersRequest, ListEncodeServersResponse> listEncodeServersAsyncInvoker(
        ListEncodeServersRequest request) {
        return new AsyncInvoker<ListEncodeServersRequest, ListEncodeServersResponse>(request, CphMeta.listEncodeServers,
            hcClient);
    }

    /**
     * 查询任务执行状态列表
     *
     * 查询同一个request id下的任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListJobsRequest 请求对象
     * @return CompletableFuture<ListJobsResponse>
     */
    public CompletableFuture<ListJobsResponse> listJobsAsync(ListJobsRequest request) {
        return hcClient.asyncInvokeHttp(request, CphMeta.listJobs);
    }

    /**
     * 查询任务执行状态列表
     *
     * 查询同一个request id下的任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListJobsRequest 请求对象
     * @return AsyncInvoker<ListJobsRequest, ListJobsResponse>
     */
    public AsyncInvoker<ListJobsRequest, ListJobsResponse> listJobsAsyncInvoker(ListJobsRequest request) {
        return new AsyncInvoker<ListJobsRequest, ListJobsResponse>(request, CphMeta.listJobs, hcClient);
    }

    /**
     * 查询项目标签
     *
     * 查询租户在指定区域和资源类型的所有标签集合。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListProjectTagsRequest 请求对象
     * @return CompletableFuture<ListProjectTagsResponse>
     */
    public CompletableFuture<ListProjectTagsResponse> listProjectTagsAsync(ListProjectTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, CphMeta.listProjectTags);
    }

    /**
     * 查询项目标签
     *
     * 查询租户在指定区域和资源类型的所有标签集合。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListProjectTagsRequest 请求对象
     * @return AsyncInvoker<ListProjectTagsRequest, ListProjectTagsResponse>
     */
    public AsyncInvoker<ListProjectTagsRequest, ListProjectTagsResponse> listProjectTagsAsyncInvoker(
        ListProjectTagsRequest request) {
        return new AsyncInvoker<ListProjectTagsRequest, ListProjectTagsResponse>(request, CphMeta.listProjectTags,
            hcClient);
    }

    /**
     * 查询资源实例
     *
     * 查询资源实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListResourceInstancesRequest 请求对象
     * @return CompletableFuture<ListResourceInstancesResponse>
     */
    public CompletableFuture<ListResourceInstancesResponse> listResourceInstancesAsync(
        ListResourceInstancesRequest request) {
        return hcClient.asyncInvokeHttp(request, CphMeta.listResourceInstances);
    }

    /**
     * 查询资源实例
     *
     * 查询资源实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListResourceInstancesRequest 请求对象
     * @return AsyncInvoker<ListResourceInstancesRequest, ListResourceInstancesResponse>
     */
    public AsyncInvoker<ListResourceInstancesRequest, ListResourceInstancesResponse> listResourceInstancesAsyncInvoker(
        ListResourceInstancesRequest request) {
        return new AsyncInvoker<ListResourceInstancesRequest, ListResourceInstancesResponse>(request,
            CphMeta.listResourceInstances, hcClient);
    }

    /**
     * 查询资源标签
     *
     * 查询资源标签列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListResourceTagsRequest 请求对象
     * @return CompletableFuture<ListResourceTagsResponse>
     */
    public CompletableFuture<ListResourceTagsResponse> listResourceTagsAsync(ListResourceTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, CphMeta.listResourceTags);
    }

    /**
     * 查询资源标签
     *
     * 查询资源标签列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListResourceTagsRequest 请求对象
     * @return AsyncInvoker<ListResourceTagsRequest, ListResourceTagsResponse>
     */
    public AsyncInvoker<ListResourceTagsRequest, ListResourceTagsResponse> listResourceTagsAsyncInvoker(
        ListResourceTagsRequest request) {
        return new AsyncInvoker<ListResourceTagsRequest, ListResourceTagsResponse>(request, CphMeta.listResourceTags,
            hcClient);
    }

    /**
     * 查询共享存储文件
     *
     * 查询共享存储指定路径下的文件列表，该功能仅在支持共享存储的云手机规格上可实现。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListShareFilesRequest 请求对象
     * @return CompletableFuture<ListShareFilesResponse>
     */
    public CompletableFuture<ListShareFilesResponse> listShareFilesAsync(ListShareFilesRequest request) {
        return hcClient.asyncInvokeHttp(request, CphMeta.listShareFiles);
    }

    /**
     * 查询共享存储文件
     *
     * 查询共享存储指定路径下的文件列表，该功能仅在支持共享存储的云手机规格上可实现。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListShareFilesRequest 请求对象
     * @return AsyncInvoker<ListShareFilesRequest, ListShareFilesResponse>
     */
    public AsyncInvoker<ListShareFilesRequest, ListShareFilesResponse> listShareFilesAsyncInvoker(
        ListShareFilesRequest request) {
        return new AsyncInvoker<ListShareFilesRequest, ListShareFilesResponse>(request, CphMeta.listShareFiles,
            hcClient);
    }

    /**
     * 推送共享应用
     *
     * 推送应用tar文件至共享应用存储目录中，该功能仅在支持共享应用的云手机规格上可实现。[接口调用前请先确保已完成CPH服务操作OBS桶的委托授权。委托CPH操作OBS桶请参见[委托CPH操作OBS桶](https://support.huaweicloud.com/bestpractice-cph/cph_bp_0050.html)。](tag:hws)[接口调用前请先确保已完成CPH服务操作OBS桶的委托授权。委托CPH操作OBS桶请参见[委托CPH操作OBS桶](https://support.huaweicloud.com/intl/zh-cn/bestpractice-cph/cph_bp_0050.html)。](tag:hws_hk)
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param PushShareAppsRequest 请求对象
     * @return CompletableFuture<PushShareAppsResponse>
     */
    public CompletableFuture<PushShareAppsResponse> pushShareAppsAsync(PushShareAppsRequest request) {
        return hcClient.asyncInvokeHttp(request, CphMeta.pushShareApps);
    }

    /**
     * 推送共享应用
     *
     * 推送应用tar文件至共享应用存储目录中，该功能仅在支持共享应用的云手机规格上可实现。[接口调用前请先确保已完成CPH服务操作OBS桶的委托授权。委托CPH操作OBS桶请参见[委托CPH操作OBS桶](https://support.huaweicloud.com/bestpractice-cph/cph_bp_0050.html)。](tag:hws)[接口调用前请先确保已完成CPH服务操作OBS桶的委托授权。委托CPH操作OBS桶请参见[委托CPH操作OBS桶](https://support.huaweicloud.com/intl/zh-cn/bestpractice-cph/cph_bp_0050.html)。](tag:hws_hk)
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param PushShareAppsRequest 请求对象
     * @return AsyncInvoker<PushShareAppsRequest, PushShareAppsResponse>
     */
    public AsyncInvoker<PushShareAppsRequest, PushShareAppsResponse> pushShareAppsAsyncInvoker(
        PushShareAppsRequest request) {
        return new AsyncInvoker<PushShareAppsRequest, PushShareAppsResponse>(request, CphMeta.pushShareApps, hcClient);
    }

    /**
     * 推送共享存储文件
     *
     * 推送文件至共享存储目录中，该功能仅在支持共享存储的云手机规格上可实现。[接口调用前请先确保已完成CPH服务操作OBS桶的委托授权。委托CPH操作OBS桶请参见[委托CPH操作OBS桶](https://support.huaweicloud.com/bestpractice-cph/cph_bp_0050.html)。](tag:hws)[接口调用前请先确保已完成CPH服务操作OBS桶的委托授权。委托CPH操作OBS桶请参见[委托CPH操作OBS桶](https://support.huaweicloud.com/intl/zh-cn/bestpractice-cph/cph_bp_0050.html)。](tag:hws_hk)
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param PushShareFilesRequest 请求对象
     * @return CompletableFuture<PushShareFilesResponse>
     */
    public CompletableFuture<PushShareFilesResponse> pushShareFilesAsync(PushShareFilesRequest request) {
        return hcClient.asyncInvokeHttp(request, CphMeta.pushShareFiles);
    }

    /**
     * 推送共享存储文件
     *
     * 推送文件至共享存储目录中，该功能仅在支持共享存储的云手机规格上可实现。[接口调用前请先确保已完成CPH服务操作OBS桶的委托授权。委托CPH操作OBS桶请参见[委托CPH操作OBS桶](https://support.huaweicloud.com/bestpractice-cph/cph_bp_0050.html)。](tag:hws)[接口调用前请先确保已完成CPH服务操作OBS桶的委托授权。委托CPH操作OBS桶请参见[委托CPH操作OBS桶](https://support.huaweicloud.com/intl/zh-cn/bestpractice-cph/cph_bp_0050.html)。](tag:hws_hk)
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param PushShareFilesRequest 请求对象
     * @return AsyncInvoker<PushShareFilesRequest, PushShareFilesResponse>
     */
    public AsyncInvoker<PushShareFilesRequest, PushShareFilesResponse> pushShareFilesAsyncInvoker(
        PushShareFilesRequest request) {
        return new AsyncInvoker<PushShareFilesRequest, PushShareFilesResponse>(request, CphMeta.pushShareFiles,
            hcClient);
    }

    /**
     * 重置云手机
     *
     * 批量重置云手机，将云手机恢复出厂设置。该接口为异步接口。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ResetCloudPhoneRequest 请求对象
     * @return CompletableFuture<ResetCloudPhoneResponse>
     */
    public CompletableFuture<ResetCloudPhoneResponse> resetCloudPhoneAsync(ResetCloudPhoneRequest request) {
        return hcClient.asyncInvokeHttp(request, CphMeta.resetCloudPhone);
    }

    /**
     * 重置云手机
     *
     * 批量重置云手机，将云手机恢复出厂设置。该接口为异步接口。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ResetCloudPhoneRequest 请求对象
     * @return AsyncInvoker<ResetCloudPhoneRequest, ResetCloudPhoneResponse>
     */
    public AsyncInvoker<ResetCloudPhoneRequest, ResetCloudPhoneResponse> resetCloudPhoneAsyncInvoker(
        ResetCloudPhoneRequest request) {
        return new AsyncInvoker<ResetCloudPhoneRequest, ResetCloudPhoneResponse>(request, CphMeta.resetCloudPhone,
            hcClient);
    }

    /**
     * 重启云手机
     *
     * 批量重启云手机，也可用于开启云手机。该接口为异步接口。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RestartCloudPhoneRequest 请求对象
     * @return CompletableFuture<RestartCloudPhoneResponse>
     */
    public CompletableFuture<RestartCloudPhoneResponse> restartCloudPhoneAsync(RestartCloudPhoneRequest request) {
        return hcClient.asyncInvokeHttp(request, CphMeta.restartCloudPhone);
    }

    /**
     * 重启云手机
     *
     * 批量重启云手机，也可用于开启云手机。该接口为异步接口。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RestartCloudPhoneRequest 请求对象
     * @return AsyncInvoker<RestartCloudPhoneRequest, RestartCloudPhoneResponse>
     */
    public AsyncInvoker<RestartCloudPhoneRequest, RestartCloudPhoneResponse> restartCloudPhoneAsyncInvoker(
        RestartCloudPhoneRequest request) {
        return new AsyncInvoker<RestartCloudPhoneRequest, RestartCloudPhoneResponse>(request, CphMeta.restartCloudPhone,
            hcClient);
    }

    /**
     * 重启云手机服务器
     *
     * 批量重启云手机服务器。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RestartCloudPhoneServerRequest 请求对象
     * @return CompletableFuture<RestartCloudPhoneServerResponse>
     */
    public CompletableFuture<RestartCloudPhoneServerResponse> restartCloudPhoneServerAsync(
        RestartCloudPhoneServerRequest request) {
        return hcClient.asyncInvokeHttp(request, CphMeta.restartCloudPhoneServer);
    }

    /**
     * 重启云手机服务器
     *
     * 批量重启云手机服务器。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RestartCloudPhoneServerRequest 请求对象
     * @return AsyncInvoker<RestartCloudPhoneServerRequest, RestartCloudPhoneServerResponse>
     */
    public AsyncInvoker<RestartCloudPhoneServerRequest, RestartCloudPhoneServerResponse> restartCloudPhoneServerAsyncInvoker(
        RestartCloudPhoneServerRequest request) {
        return new AsyncInvoker<RestartCloudPhoneServerRequest, RestartCloudPhoneServerResponse>(request,
            CphMeta.restartCloudPhoneServer, hcClient);
    }

    /**
     * 重启编码服务
     *
     * 批量重启编码服务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RestartEncodeServerRequest 请求对象
     * @return CompletableFuture<RestartEncodeServerResponse>
     */
    public CompletableFuture<RestartEncodeServerResponse> restartEncodeServerAsync(RestartEncodeServerRequest request) {
        return hcClient.asyncInvokeHttp(request, CphMeta.restartEncodeServer);
    }

    /**
     * 重启编码服务
     *
     * 批量重启编码服务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RestartEncodeServerRequest 请求对象
     * @return AsyncInvoker<RestartEncodeServerRequest, RestartEncodeServerResponse>
     */
    public AsyncInvoker<RestartEncodeServerRequest, RestartEncodeServerResponse> restartEncodeServerAsyncInvoker(
        RestartEncodeServerRequest request) {
        return new AsyncInvoker<RestartEncodeServerRequest, RestartEncodeServerResponse>(request,
            CphMeta.restartEncodeServer, hcClient);
    }

    /**
     * 查询带宽信息
     *
     * 查询云手机使用的带宽信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowBandwidthDetailRequest 请求对象
     * @return CompletableFuture<ShowBandwidthDetailResponse>
     */
    public CompletableFuture<ShowBandwidthDetailResponse> showBandwidthDetailAsync(ShowBandwidthDetailRequest request) {
        return hcClient.asyncInvokeHttp(request, CphMeta.showBandwidthDetail);
    }

    /**
     * 查询带宽信息
     *
     * 查询云手机使用的带宽信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowBandwidthDetailRequest 请求对象
     * @return AsyncInvoker<ShowBandwidthDetailRequest, ShowBandwidthDetailResponse>
     */
    public AsyncInvoker<ShowBandwidthDetailRequest, ShowBandwidthDetailResponse> showBandwidthDetailAsyncInvoker(
        ShowBandwidthDetailRequest request) {
        return new AsyncInvoker<ShowBandwidthDetailRequest, ShowBandwidthDetailResponse>(request,
            CphMeta.showBandwidthDetail, hcClient);
    }

    /**
     * 查询云手机详情
     *
     * 查询云手机的详细信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowCloudPhoneDetailRequest 请求对象
     * @return CompletableFuture<ShowCloudPhoneDetailResponse>
     */
    public CompletableFuture<ShowCloudPhoneDetailResponse> showCloudPhoneDetailAsync(
        ShowCloudPhoneDetailRequest request) {
        return hcClient.asyncInvokeHttp(request, CphMeta.showCloudPhoneDetail);
    }

    /**
     * 查询云手机详情
     *
     * 查询云手机的详细信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowCloudPhoneDetailRequest 请求对象
     * @return AsyncInvoker<ShowCloudPhoneDetailRequest, ShowCloudPhoneDetailResponse>
     */
    public AsyncInvoker<ShowCloudPhoneDetailRequest, ShowCloudPhoneDetailResponse> showCloudPhoneDetailAsyncInvoker(
        ShowCloudPhoneDetailRequest request) {
        return new AsyncInvoker<ShowCloudPhoneDetailRequest, ShowCloudPhoneDetailResponse>(request,
            CphMeta.showCloudPhoneDetail, hcClient);
    }

    /**
     * 查询云手机服务器详情
     *
     * 根据server_id查询云手机服务器的详细信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowCloudPhoneServerDetailRequest 请求对象
     * @return CompletableFuture<ShowCloudPhoneServerDetailResponse>
     */
    public CompletableFuture<ShowCloudPhoneServerDetailResponse> showCloudPhoneServerDetailAsync(
        ShowCloudPhoneServerDetailRequest request) {
        return hcClient.asyncInvokeHttp(request, CphMeta.showCloudPhoneServerDetail);
    }

    /**
     * 查询云手机服务器详情
     *
     * 根据server_id查询云手机服务器的详细信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowCloudPhoneServerDetailRequest 请求对象
     * @return AsyncInvoker<ShowCloudPhoneServerDetailRequest, ShowCloudPhoneServerDetailResponse>
     */
    public AsyncInvoker<ShowCloudPhoneServerDetailRequest, ShowCloudPhoneServerDetailResponse> showCloudPhoneServerDetailAsyncInvoker(
        ShowCloudPhoneServerDetailRequest request) {
        return new AsyncInvoker<ShowCloudPhoneServerDetailRequest, ShowCloudPhoneServerDetailResponse>(request,
            CphMeta.showCloudPhoneServerDetail, hcClient);
    }

    /**
     * 查询任务执行状态
     *
     * 查询任务的执行状态。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowJobRequest 请求对象
     * @return CompletableFuture<ShowJobResponse>
     */
    public CompletableFuture<ShowJobResponse> showJobAsync(ShowJobRequest request) {
        return hcClient.asyncInvokeHttp(request, CphMeta.showJob);
    }

    /**
     * 查询任务执行状态
     *
     * 查询任务的执行状态。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowJobRequest 请求对象
     * @return AsyncInvoker<ShowJobRequest, ShowJobResponse>
     */
    public AsyncInvoker<ShowJobRequest, ShowJobResponse> showJobAsyncInvoker(ShowJobRequest request) {
        return new AsyncInvoker<ShowJobRequest, ShowJobResponse>(request, CphMeta.showJob, hcClient);
    }

    /**
     * 关闭云手机
     *
     * 批量关闭云手机。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param StopCloudPhoneRequest 请求对象
     * @return CompletableFuture<StopCloudPhoneResponse>
     */
    public CompletableFuture<StopCloudPhoneResponse> stopCloudPhoneAsync(StopCloudPhoneRequest request) {
        return hcClient.asyncInvokeHttp(request, CphMeta.stopCloudPhone);
    }

    /**
     * 关闭云手机
     *
     * 批量关闭云手机。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param StopCloudPhoneRequest 请求对象
     * @return AsyncInvoker<StopCloudPhoneRequest, StopCloudPhoneResponse>
     */
    public AsyncInvoker<StopCloudPhoneRequest, StopCloudPhoneResponse> stopCloudPhoneAsyncInvoker(
        StopCloudPhoneRequest request) {
        return new AsyncInvoker<StopCloudPhoneRequest, StopCloudPhoneResponse>(request, CphMeta.stopCloudPhone,
            hcClient);
    }

    /**
     * 修改共享带宽
     *
     * 修改云手机使用的共享带宽大小。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateBandwidthRequest 请求对象
     * @return CompletableFuture<UpdateBandwidthResponse>
     */
    public CompletableFuture<UpdateBandwidthResponse> updateBandwidthAsync(UpdateBandwidthRequest request) {
        return hcClient.asyncInvokeHttp(request, CphMeta.updateBandwidth);
    }

    /**
     * 修改共享带宽
     *
     * 修改云手机使用的共享带宽大小。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateBandwidthRequest 请求对象
     * @return AsyncInvoker<UpdateBandwidthRequest, UpdateBandwidthResponse>
     */
    public AsyncInvoker<UpdateBandwidthRequest, UpdateBandwidthResponse> updateBandwidthAsyncInvoker(
        UpdateBandwidthRequest request) {
        return new AsyncInvoker<UpdateBandwidthRequest, UpdateBandwidthResponse>(request, CphMeta.updateBandwidth,
            hcClient);
    }

    /**
     * 更新云手机属性
     *
     * 部分云手机属性开放更新能力，部分属性无法更新，部分属性需要重启手机生效，属性约束请云手机属性列表。如果手机处于异常状态，属性更新后需恢复手机状态为运行中才可生效。该接口为异步接口。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateCloudPhonePropertyRequest 请求对象
     * @return CompletableFuture<UpdateCloudPhonePropertyResponse>
     */
    public CompletableFuture<UpdateCloudPhonePropertyResponse> updateCloudPhonePropertyAsync(
        UpdateCloudPhonePropertyRequest request) {
        return hcClient.asyncInvokeHttp(request, CphMeta.updateCloudPhoneProperty);
    }

    /**
     * 更新云手机属性
     *
     * 部分云手机属性开放更新能力，部分属性无法更新，部分属性需要重启手机生效，属性约束请云手机属性列表。如果手机处于异常状态，属性更新后需恢复手机状态为运行中才可生效。该接口为异步接口。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateCloudPhonePropertyRequest 请求对象
     * @return AsyncInvoker<UpdateCloudPhonePropertyRequest, UpdateCloudPhonePropertyResponse>
     */
    public AsyncInvoker<UpdateCloudPhonePropertyRequest, UpdateCloudPhonePropertyResponse> updateCloudPhonePropertyAsyncInvoker(
        UpdateCloudPhonePropertyRequest request) {
        return new AsyncInvoker<UpdateCloudPhonePropertyRequest, UpdateCloudPhonePropertyResponse>(request,
            CphMeta.updateCloudPhoneProperty, hcClient);
    }

    /**
     * 更改密钥对
     *
     * 修改连接云手机的密钥对。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateKeypairRequest 请求对象
     * @return CompletableFuture<UpdateKeypairResponse>
     */
    public CompletableFuture<UpdateKeypairResponse> updateKeypairAsync(UpdateKeypairRequest request) {
        return hcClient.asyncInvokeHttp(request, CphMeta.updateKeypair);
    }

    /**
     * 更改密钥对
     *
     * 修改连接云手机的密钥对。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateKeypairRequest 请求对象
     * @return AsyncInvoker<UpdateKeypairRequest, UpdateKeypairResponse>
     */
    public AsyncInvoker<UpdateKeypairRequest, UpdateKeypairResponse> updateKeypairAsyncInvoker(
        UpdateKeypairRequest request) {
        return new AsyncInvoker<UpdateKeypairRequest, UpdateKeypairResponse>(request, CphMeta.updateKeypair, hcClient);
    }

    /**
     * 修改云手机名称
     *
     * 根据phoneId修改phoneName。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdatePhoneNameRequest 请求对象
     * @return CompletableFuture<UpdatePhoneNameResponse>
     */
    public CompletableFuture<UpdatePhoneNameResponse> updatePhoneNameAsync(UpdatePhoneNameRequest request) {
        return hcClient.asyncInvokeHttp(request, CphMeta.updatePhoneName);
    }

    /**
     * 修改云手机名称
     *
     * 根据phoneId修改phoneName。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdatePhoneNameRequest 请求对象
     * @return AsyncInvoker<UpdatePhoneNameRequest, UpdatePhoneNameResponse>
     */
    public AsyncInvoker<UpdatePhoneNameRequest, UpdatePhoneNameResponse> updatePhoneNameAsyncInvoker(
        UpdatePhoneNameRequest request) {
        return new AsyncInvoker<UpdatePhoneNameRequest, UpdatePhoneNameResponse>(request, CphMeta.updatePhoneName,
            hcClient);
    }

    /**
     * 修改云手机服务器名称
     *
     * 根据serverId修改serverName。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateServerNameRequest 请求对象
     * @return CompletableFuture<UpdateServerNameResponse>
     */
    public CompletableFuture<UpdateServerNameResponse> updateServerNameAsync(UpdateServerNameRequest request) {
        return hcClient.asyncInvokeHttp(request, CphMeta.updateServerName);
    }

    /**
     * 修改云手机服务器名称
     *
     * 根据serverId修改serverName。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateServerNameRequest 请求对象
     * @return AsyncInvoker<UpdateServerNameRequest, UpdateServerNameResponse>
     */
    public AsyncInvoker<UpdateServerNameRequest, UpdateServerNameResponse> updateServerNameAsyncInvoker(
        UpdateServerNameRequest request) {
        return new AsyncInvoker<UpdateServerNameRequest, UpdateServerNameResponse>(request, CphMeta.updateServerName,
            hcClient);
    }

    /**
     * 安装apk
     *
     * 在云手机中安装apk。系统会将指定的apk文件下载后直接安装到云手机中。
     * 支持安装单apk应用和多apk应用。可使用install命令安装单apk应用，一次只支持安装一个apk；可使用install-multiple命令安装多apk应用（多apk应用为单个应用拆分成多个apk），一次只支持同一个应用的多个apk。该接口为异步接口。[接口调用前请先确保已完成CPH服务操作OBS桶的委托授权。委托CPH操作OBS桶请参见[委托CPH操作OBS桶](https://support.huaweicloud.com/bestpractice-cph/cph_bp_0050.html)。](tag:hws)[接口调用前请先确保已完成CPH服务操作OBS桶的委托授权。委托CPH操作OBS桶请参见[委托CPH操作OBS桶](https://support.huaweicloud.com/intl/zh-cn/bestpractice-cph/cph_bp_0050.html)。](tag:hws_hk)
     * - 管理面性能有限，对相同服务器批量执行的ADB命令，将会阻塞云手机其他任务执行。
     * - 建议通过开发应用市场的方式安装apk。允许安装的apk大小限制为2G（即不可将obs桶内大于2G的apk安装到手机中），超过限制将返回错误。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param InstallApkRequest 请求对象
     * @return CompletableFuture<InstallApkResponse>
     */
    public CompletableFuture<InstallApkResponse> installApkAsync(InstallApkRequest request) {
        return hcClient.asyncInvokeHttp(request, CphMeta.installApk);
    }

    /**
     * 安装apk
     *
     * 在云手机中安装apk。系统会将指定的apk文件下载后直接安装到云手机中。
     * 支持安装单apk应用和多apk应用。可使用install命令安装单apk应用，一次只支持安装一个apk；可使用install-multiple命令安装多apk应用（多apk应用为单个应用拆分成多个apk），一次只支持同一个应用的多个apk。该接口为异步接口。[接口调用前请先确保已完成CPH服务操作OBS桶的委托授权。委托CPH操作OBS桶请参见[委托CPH操作OBS桶](https://support.huaweicloud.com/bestpractice-cph/cph_bp_0050.html)。](tag:hws)[接口调用前请先确保已完成CPH服务操作OBS桶的委托授权。委托CPH操作OBS桶请参见[委托CPH操作OBS桶](https://support.huaweicloud.com/intl/zh-cn/bestpractice-cph/cph_bp_0050.html)。](tag:hws_hk)
     * - 管理面性能有限，对相同服务器批量执行的ADB命令，将会阻塞云手机其他任务执行。
     * - 建议通过开发应用市场的方式安装apk。允许安装的apk大小限制为2G（即不可将obs桶内大于2G的apk安装到手机中），超过限制将返回错误。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param InstallApkRequest 请求对象
     * @return AsyncInvoker<InstallApkRequest, InstallApkResponse>
     */
    public AsyncInvoker<InstallApkRequest, InstallApkResponse> installApkAsyncInvoker(InstallApkRequest request) {
        return new AsyncInvoker<InstallApkRequest, InstallApkResponse>(request, CphMeta.installApk, hcClient);
    }

    /**
     * 推送文件
     *
     * 推送文件到云手机文件系统中。系统会将所指定的文件下载解压后，将解压后的内容全部推送到云手机的根目录下。只支持指定tar格式的文件进行推送，您需要将tar文件提前上传至您的OBS桶中。该接口为异步接口。[接口调用前请先确保已完成CPH服务操作OBS桶的委托授权。委托CPH操作OBS桶请参见[委托CPH操作OBS桶](https://support.huaweicloud.com/bestpractice-cph/cph_bp_0050.html)。](tag:hws)[接口调用前请先确保已完成CPH服务操作OBS桶的委托授权。委托CPH操作OBS桶请参见[委托CPH操作OBS桶](https://support.huaweicloud.com/intl/zh-cn/bestpractice-cph/cph_bp_0050.html)。](tag:hws_hk)
     * - 管理面性能有限，对相同服务器批量执行的ADB命令，将会阻塞云手机其他任务执行。
     * - 允许推送的文件大小限制为6G（即不可将obs桶内大于6G的文件推送到手机中），超过限制将返回错误。
     * - 手机的系统有限制，推送到系统盘不保证推送成功，推荐把文件推送到手机的数据盘。所以在构建\&quot;tar\&quot;文件时，应将待推送的文件放到本地创建的data目录后将其打包（如tar -cvf data.tar data ），以确保把文件推送到手机的数据盘下。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param PushFileRequest 请求对象
     * @return CompletableFuture<PushFileResponse>
     */
    public CompletableFuture<PushFileResponse> pushFileAsync(PushFileRequest request) {
        return hcClient.asyncInvokeHttp(request, CphMeta.pushFile);
    }

    /**
     * 推送文件
     *
     * 推送文件到云手机文件系统中。系统会将所指定的文件下载解压后，将解压后的内容全部推送到云手机的根目录下。只支持指定tar格式的文件进行推送，您需要将tar文件提前上传至您的OBS桶中。该接口为异步接口。[接口调用前请先确保已完成CPH服务操作OBS桶的委托授权。委托CPH操作OBS桶请参见[委托CPH操作OBS桶](https://support.huaweicloud.com/bestpractice-cph/cph_bp_0050.html)。](tag:hws)[接口调用前请先确保已完成CPH服务操作OBS桶的委托授权。委托CPH操作OBS桶请参见[委托CPH操作OBS桶](https://support.huaweicloud.com/intl/zh-cn/bestpractice-cph/cph_bp_0050.html)。](tag:hws_hk)
     * - 管理面性能有限，对相同服务器批量执行的ADB命令，将会阻塞云手机其他任务执行。
     * - 允许推送的文件大小限制为6G（即不可将obs桶内大于6G的文件推送到手机中），超过限制将返回错误。
     * - 手机的系统有限制，推送到系统盘不保证推送成功，推荐把文件推送到手机的数据盘。所以在构建\&quot;tar\&quot;文件时，应将待推送的文件放到本地创建的data目录后将其打包（如tar -cvf data.tar data ），以确保把文件推送到手机的数据盘下。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param PushFileRequest 请求对象
     * @return AsyncInvoker<PushFileRequest, PushFileResponse>
     */
    public AsyncInvoker<PushFileRequest, PushFileResponse> pushFileAsyncInvoker(PushFileRequest request) {
        return new AsyncInvoker<PushFileRequest, PushFileResponse>(request, CphMeta.pushFile, hcClient);
    }

    /**
     * 执行异步adb命令
     *
     * 在云手机中执行shell命令。该接口为异步接口。
     * - 管理面性能有限，对相同服务器批量执行的ADB命令，将会阻塞云手机其他任务执行。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RunShellCommandRequest 请求对象
     * @return CompletableFuture<RunShellCommandResponse>
     */
    public CompletableFuture<RunShellCommandResponse> runShellCommandAsync(RunShellCommandRequest request) {
        return hcClient.asyncInvokeHttp(request, CphMeta.runShellCommand);
    }

    /**
     * 执行异步adb命令
     *
     * 在云手机中执行shell命令。该接口为异步接口。
     * - 管理面性能有限，对相同服务器批量执行的ADB命令，将会阻塞云手机其他任务执行。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RunShellCommandRequest 请求对象
     * @return AsyncInvoker<RunShellCommandRequest, RunShellCommandResponse>
     */
    public AsyncInvoker<RunShellCommandRequest, RunShellCommandResponse> runShellCommandAsyncInvoker(
        RunShellCommandRequest request) {
        return new AsyncInvoker<RunShellCommandRequest, RunShellCommandResponse>(request, CphMeta.runShellCommand,
            hcClient);
    }

    /**
     * 执行同步adb命令
     *
     * 在云手机中同步执行命令并返回命令执行的输出信息，该接口仅支持adb shell命令的执行。1分钟内每个用户调用接口次数上限为6次，每个云手机允许执行命令超时时间为2秒，接口时间不超过30秒，执行云手机数越多，接口耗时相应越长。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RunSyncCommandRequest 请求对象
     * @return CompletableFuture<RunSyncCommandResponse>
     */
    public CompletableFuture<RunSyncCommandResponse> runSyncCommandAsync(RunSyncCommandRequest request) {
        return hcClient.asyncInvokeHttp(request, CphMeta.runSyncCommand);
    }

    /**
     * 执行同步adb命令
     *
     * 在云手机中同步执行命令并返回命令执行的输出信息，该接口仅支持adb shell命令的执行。1分钟内每个用户调用接口次数上限为6次，每个云手机允许执行命令超时时间为2秒，接口时间不超过30秒，执行云手机数越多，接口耗时相应越长。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RunSyncCommandRequest 请求对象
     * @return AsyncInvoker<RunSyncCommandRequest, RunSyncCommandResponse>
     */
    public AsyncInvoker<RunSyncCommandRequest, RunSyncCommandResponse> runSyncCommandAsyncInvoker(
        RunSyncCommandRequest request) {
        return new AsyncInvoker<RunSyncCommandRequest, RunSyncCommandResponse>(request, CphMeta.runSyncCommand,
            hcClient);
    }

    /**
     * 卸载apk
     *
     * 在云手机中卸载apk。该接口为异步接口。
     * - 管理面性能有限，对相同服务器批量执行的ADB命令，将会阻塞云手机其他任务执行。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UninstallApkRequest 请求对象
     * @return CompletableFuture<UninstallApkResponse>
     */
    public CompletableFuture<UninstallApkResponse> uninstallApkAsync(UninstallApkRequest request) {
        return hcClient.asyncInvokeHttp(request, CphMeta.uninstallApk);
    }

    /**
     * 卸载apk
     *
     * 在云手机中卸载apk。该接口为异步接口。
     * - 管理面性能有限，对相同服务器批量执行的ADB命令，将会阻塞云手机其他任务执行。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UninstallApkRequest 请求对象
     * @return AsyncInvoker<UninstallApkRequest, UninstallApkResponse>
     */
    public AsyncInvoker<UninstallApkRequest, UninstallApkResponse> uninstallApkAsyncInvoker(
        UninstallApkRequest request) {
        return new AsyncInvoker<UninstallApkRequest, UninstallApkResponse>(request, CphMeta.uninstallApk, hcClient);
    }

}
