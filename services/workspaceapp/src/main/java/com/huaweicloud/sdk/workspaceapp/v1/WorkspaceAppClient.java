package com.huaweicloud.sdk.workspaceapp.v1;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.SyncInvoker;
import com.huaweicloud.sdk.workspaceapp.v1.model.AddAppGroupAuthorizationRequest;
import com.huaweicloud.sdk.workspaceapp.v1.model.AddAppGroupAuthorizationResponse;
import com.huaweicloud.sdk.workspaceapp.v1.model.BatchDeleteAppGroupAuthorizationRequest;
import com.huaweicloud.sdk.workspaceapp.v1.model.BatchDeleteAppGroupAuthorizationResponse;
import com.huaweicloud.sdk.workspaceapp.v1.model.BatchDeleteAppGroupRequest;
import com.huaweicloud.sdk.workspaceapp.v1.model.BatchDeleteAppGroupResponse;
import com.huaweicloud.sdk.workspaceapp.v1.model.BatchDeleteServerRequest;
import com.huaweicloud.sdk.workspaceapp.v1.model.BatchDeleteServerResponse;
import com.huaweicloud.sdk.workspaceapp.v1.model.BatchMigrateHostsServerRequest;
import com.huaweicloud.sdk.workspaceapp.v1.model.BatchMigrateHostsServerResponse;
import com.huaweicloud.sdk.workspaceapp.v1.model.BatchRebootServerRequest;
import com.huaweicloud.sdk.workspaceapp.v1.model.BatchRebootServerResponse;
import com.huaweicloud.sdk.workspaceapp.v1.model.BatchRejoinDomainRequest;
import com.huaweicloud.sdk.workspaceapp.v1.model.BatchRejoinDomainResponse;
import com.huaweicloud.sdk.workspaceapp.v1.model.BatchStartServerRequest;
import com.huaweicloud.sdk.workspaceapp.v1.model.BatchStartServerResponse;
import com.huaweicloud.sdk.workspaceapp.v1.model.BatchStopServerRequest;
import com.huaweicloud.sdk.workspaceapp.v1.model.BatchStopServerResponse;
import com.huaweicloud.sdk.workspaceapp.v1.model.BatchUpdateTsviRequest;
import com.huaweicloud.sdk.workspaceapp.v1.model.BatchUpdateTsviResponse;
import com.huaweicloud.sdk.workspaceapp.v1.model.ChangeServerImageRequest;
import com.huaweicloud.sdk.workspaceapp.v1.model.ChangeServerImageResponse;
import com.huaweicloud.sdk.workspaceapp.v1.model.CheckQuotaRequest;
import com.huaweicloud.sdk.workspaceapp.v1.model.CheckQuotaResponse;
import com.huaweicloud.sdk.workspaceapp.v1.model.CreateAppGroupRequest;
import com.huaweicloud.sdk.workspaceapp.v1.model.CreateAppGroupResponse;
import com.huaweicloud.sdk.workspaceapp.v1.model.CreateAppServersRequest;
import com.huaweicloud.sdk.workspaceapp.v1.model.CreateAppServersResponse;
import com.huaweicloud.sdk.workspaceapp.v1.model.CreateOrUpdateStoragePolicyStatementRequest;
import com.huaweicloud.sdk.workspaceapp.v1.model.CreateOrUpdateStoragePolicyStatementResponse;
import com.huaweicloud.sdk.workspaceapp.v1.model.CreatePersistentStorageRequest;
import com.huaweicloud.sdk.workspaceapp.v1.model.CreatePersistentStorageResponse;
import com.huaweicloud.sdk.workspaceapp.v1.model.CreatePolicyGroupRequest;
import com.huaweicloud.sdk.workspaceapp.v1.model.CreatePolicyGroupResponse;
import com.huaweicloud.sdk.workspaceapp.v1.model.CreatePolicyTemplateRequest;
import com.huaweicloud.sdk.workspaceapp.v1.model.CreatePolicyTemplateResponse;
import com.huaweicloud.sdk.workspaceapp.v1.model.CreateServerGroupRequest;
import com.huaweicloud.sdk.workspaceapp.v1.model.CreateServerGroupResponse;
import com.huaweicloud.sdk.workspaceapp.v1.model.CreateShareFolderRequest;
import com.huaweicloud.sdk.workspaceapp.v1.model.CreateShareFolderResponse;
import com.huaweicloud.sdk.workspaceapp.v1.model.DeletePersistentStorageRequest;
import com.huaweicloud.sdk.workspaceapp.v1.model.DeletePersistentStorageResponse;
import com.huaweicloud.sdk.workspaceapp.v1.model.DeletePolicyGroupRequest;
import com.huaweicloud.sdk.workspaceapp.v1.model.DeletePolicyGroupResponse;
import com.huaweicloud.sdk.workspaceapp.v1.model.DeletePolicyTemplateRequest;
import com.huaweicloud.sdk.workspaceapp.v1.model.DeletePolicyTemplateResponse;
import com.huaweicloud.sdk.workspaceapp.v1.model.DeleteServerGroupsRequest;
import com.huaweicloud.sdk.workspaceapp.v1.model.DeleteServerGroupsResponse;
import com.huaweicloud.sdk.workspaceapp.v1.model.DeleteStorageClaimRequest;
import com.huaweicloud.sdk.workspaceapp.v1.model.DeleteStorageClaimResponse;
import com.huaweicloud.sdk.workspaceapp.v1.model.DeleteUserStorageAttachmentRequest;
import com.huaweicloud.sdk.workspaceapp.v1.model.DeleteUserStorageAttachmentResponse;
import com.huaweicloud.sdk.workspaceapp.v1.model.ListAppConnectionRequest;
import com.huaweicloud.sdk.workspaceapp.v1.model.ListAppConnectionResponse;
import com.huaweicloud.sdk.workspaceapp.v1.model.ListAppGroupAuthorizationRequest;
import com.huaweicloud.sdk.workspaceapp.v1.model.ListAppGroupAuthorizationResponse;
import com.huaweicloud.sdk.workspaceapp.v1.model.ListAppGroupRequest;
import com.huaweicloud.sdk.workspaceapp.v1.model.ListAppGroupResponse;
import com.huaweicloud.sdk.workspaceapp.v1.model.ListAvailabilityZoneRequest;
import com.huaweicloud.sdk.workspaceapp.v1.model.ListAvailabilityZoneResponse;
import com.huaweicloud.sdk.workspaceapp.v1.model.ListPersistentStorageRequest;
import com.huaweicloud.sdk.workspaceapp.v1.model.ListPersistentStorageResponse;
import com.huaweicloud.sdk.workspaceapp.v1.model.ListPolicyGroupRequest;
import com.huaweicloud.sdk.workspaceapp.v1.model.ListPolicyGroupResponse;
import com.huaweicloud.sdk.workspaceapp.v1.model.ListPolicyTemplateRequest;
import com.huaweicloud.sdk.workspaceapp.v1.model.ListPolicyTemplateResponse;
import com.huaweicloud.sdk.workspaceapp.v1.model.ListProductRequest;
import com.huaweicloud.sdk.workspaceapp.v1.model.ListProductResponse;
import com.huaweicloud.sdk.workspaceapp.v1.model.ListPublishedAppRequest;
import com.huaweicloud.sdk.workspaceapp.v1.model.ListPublishedAppResponse;
import com.huaweicloud.sdk.workspaceapp.v1.model.ListServerGroupsRequest;
import com.huaweicloud.sdk.workspaceapp.v1.model.ListServerGroupsResponse;
import com.huaweicloud.sdk.workspaceapp.v1.model.ListServersRequest;
import com.huaweicloud.sdk.workspaceapp.v1.model.ListServersResponse;
import com.huaweicloud.sdk.workspaceapp.v1.model.ListSessionByUserNameRequest;
import com.huaweicloud.sdk.workspaceapp.v1.model.ListSessionByUserNameResponse;
import com.huaweicloud.sdk.workspaceapp.v1.model.ListSessionTypeRequest;
import com.huaweicloud.sdk.workspaceapp.v1.model.ListSessionTypeResponse;
import com.huaweicloud.sdk.workspaceapp.v1.model.ListShareFolderRequest;
import com.huaweicloud.sdk.workspaceapp.v1.model.ListShareFolderResponse;
import com.huaweicloud.sdk.workspaceapp.v1.model.ListStorageAssignmentRequest;
import com.huaweicloud.sdk.workspaceapp.v1.model.ListStorageAssignmentResponse;
import com.huaweicloud.sdk.workspaceapp.v1.model.ListStoragePolicyStatementRequest;
import com.huaweicloud.sdk.workspaceapp.v1.model.ListStoragePolicyStatementResponse;
import com.huaweicloud.sdk.workspaceapp.v1.model.ListTargetsOfPolicyGroupRequest;
import com.huaweicloud.sdk.workspaceapp.v1.model.ListTargetsOfPolicyGroupResponse;
import com.huaweicloud.sdk.workspaceapp.v1.model.ListUserConnectionRequest;
import com.huaweicloud.sdk.workspaceapp.v1.model.ListUserConnectionResponse;
import com.huaweicloud.sdk.workspaceapp.v1.model.ListVolumeTypeRequest;
import com.huaweicloud.sdk.workspaceapp.v1.model.ListVolumeTypeResponse;
import com.huaweicloud.sdk.workspaceapp.v1.model.LogoffUserSessionRequest;
import com.huaweicloud.sdk.workspaceapp.v1.model.LogoffUserSessionResponse;
import com.huaweicloud.sdk.workspaceapp.v1.model.PublishAppRequest;
import com.huaweicloud.sdk.workspaceapp.v1.model.PublishAppResponse;
import com.huaweicloud.sdk.workspaceapp.v1.model.ReinstallServerRequest;
import com.huaweicloud.sdk.workspaceapp.v1.model.ReinstallServerResponse;
import com.huaweicloud.sdk.workspaceapp.v1.model.ShowJobRequest;
import com.huaweicloud.sdk.workspaceapp.v1.model.ShowJobResponse;
import com.huaweicloud.sdk.workspaceapp.v1.model.ShowOriginalPolicyInfoRequest;
import com.huaweicloud.sdk.workspaceapp.v1.model.ShowOriginalPolicyInfoResponse;
import com.huaweicloud.sdk.workspaceapp.v1.model.ShowPublishableAppRequest;
import com.huaweicloud.sdk.workspaceapp.v1.model.ShowPublishableAppResponse;
import com.huaweicloud.sdk.workspaceapp.v1.model.UnpublishAppRequest;
import com.huaweicloud.sdk.workspaceapp.v1.model.UnpublishAppResponse;
import com.huaweicloud.sdk.workspaceapp.v1.model.UpdateAppGroupRequest;
import com.huaweicloud.sdk.workspaceapp.v1.model.UpdateAppGroupResponse;
import com.huaweicloud.sdk.workspaceapp.v1.model.UpdateAppRequest;
import com.huaweicloud.sdk.workspaceapp.v1.model.UpdateAppResponse;
import com.huaweicloud.sdk.workspaceapp.v1.model.UpdatePolicyGroupRequest;
import com.huaweicloud.sdk.workspaceapp.v1.model.UpdatePolicyGroupResponse;
import com.huaweicloud.sdk.workspaceapp.v1.model.UpdatePolicyTemplateRequest;
import com.huaweicloud.sdk.workspaceapp.v1.model.UpdatePolicyTemplateResponse;
import com.huaweicloud.sdk.workspaceapp.v1.model.UpdateServerGroupRequest;
import com.huaweicloud.sdk.workspaceapp.v1.model.UpdateServerGroupResponse;
import com.huaweicloud.sdk.workspaceapp.v1.model.UpdateServerRequest;
import com.huaweicloud.sdk.workspaceapp.v1.model.UpdateServerResponse;
import com.huaweicloud.sdk.workspaceapp.v1.model.UpdateShareFolderAssignmentRequest;
import com.huaweicloud.sdk.workspaceapp.v1.model.UpdateShareFolderAssignmentResponse;
import com.huaweicloud.sdk.workspaceapp.v1.model.UpdateUserFolderAssignmentRequest;
import com.huaweicloud.sdk.workspaceapp.v1.model.UpdateUserFolderAssignmentResponse;
import com.huaweicloud.sdk.workspaceapp.v1.model.UploadAppIconRequest;
import com.huaweicloud.sdk.workspaceapp.v1.model.UploadAppIconResponse;

public class WorkspaceAppClient {

    protected HcClient hcClient;

    public WorkspaceAppClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<WorkspaceAppClient> newBuilder() {
        ClientBuilder<WorkspaceAppClient> clientBuilder = new ClientBuilder<>(WorkspaceAppClient::new);
        return clientBuilder;
    }

    /**
     * 查询已发布应用
     *
     * 查询已发布的应用
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListPublishedAppRequest 请求对象
     * @return ListPublishedAppResponse
     */
    public ListPublishedAppResponse listPublishedApp(ListPublishedAppRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceAppMeta.listPublishedApp);
    }

    /**
     * 查询已发布应用
     *
     * 查询已发布的应用
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListPublishedAppRequest 请求对象
     * @return SyncInvoker<ListPublishedAppRequest, ListPublishedAppResponse>
     */
    public SyncInvoker<ListPublishedAppRequest, ListPublishedAppResponse> listPublishedAppInvoker(
        ListPublishedAppRequest request) {
        return new SyncInvoker<ListPublishedAppRequest, ListPublishedAppResponse>(request,
            WorkspaceAppMeta.listPublishedApp, hcClient);
    }

    /**
     * 发布应用
     *
     * 批量发布应用,不允许发布同名的应用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param PublishAppRequest 请求对象
     * @return PublishAppResponse
     */
    public PublishAppResponse publishApp(PublishAppRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceAppMeta.publishApp);
    }

    /**
     * 发布应用
     *
     * 批量发布应用,不允许发布同名的应用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param PublishAppRequest 请求对象
     * @return SyncInvoker<PublishAppRequest, PublishAppResponse>
     */
    public SyncInvoker<PublishAppRequest, PublishAppResponse> publishAppInvoker(PublishAppRequest request) {
        return new SyncInvoker<PublishAppRequest, PublishAppResponse>(request, WorkspaceAppMeta.publishApp, hcClient);
    }

    /**
     * 可发布应用列表
     *
     * 查询应用组下可发布的应用
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowPublishableAppRequest 请求对象
     * @return ShowPublishableAppResponse
     */
    public ShowPublishableAppResponse showPublishableApp(ShowPublishableAppRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceAppMeta.showPublishableApp);
    }

    /**
     * 可发布应用列表
     *
     * 查询应用组下可发布的应用
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowPublishableAppRequest 请求对象
     * @return SyncInvoker<ShowPublishableAppRequest, ShowPublishableAppResponse>
     */
    public SyncInvoker<ShowPublishableAppRequest, ShowPublishableAppResponse> showPublishableAppInvoker(
        ShowPublishableAppRequest request) {
        return new SyncInvoker<ShowPublishableAppRequest, ShowPublishableAppResponse>(request,
            WorkspaceAppMeta.showPublishableApp, hcClient);
    }

    /**
     * 批量取消应用发布
     *
     * 批量取消应用发布。
     * &gt; - 批量取消应用组下已经发布的应用，应用对应的授权会一起删除，重复执行会按照成功处理(响应200)
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UnpublishAppRequest 请求对象
     * @return UnpublishAppResponse
     */
    public UnpublishAppResponse unpublishApp(UnpublishAppRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceAppMeta.unpublishApp);
    }

    /**
     * 批量取消应用发布
     *
     * 批量取消应用发布。
     * &gt; - 批量取消应用组下已经发布的应用，应用对应的授权会一起删除，重复执行会按照成功处理(响应200)
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UnpublishAppRequest 请求对象
     * @return SyncInvoker<UnpublishAppRequest, UnpublishAppResponse>
     */
    public SyncInvoker<UnpublishAppRequest, UnpublishAppResponse> unpublishAppInvoker(UnpublishAppRequest request) {
        return new SyncInvoker<UnpublishAppRequest, UnpublishAppResponse>(request, WorkspaceAppMeta.unpublishApp,
            hcClient);
    }

    /**
     * 修改应用信息
     *
     * 编辑修改应用信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateAppRequest 请求对象
     * @return UpdateAppResponse
     */
    public UpdateAppResponse updateApp(UpdateAppRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceAppMeta.updateApp);
    }

    /**
     * 修改应用信息
     *
     * 编辑修改应用信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateAppRequest 请求对象
     * @return SyncInvoker<UpdateAppRequest, UpdateAppResponse>
     */
    public SyncInvoker<UpdateAppRequest, UpdateAppResponse> updateAppInvoker(UpdateAppRequest request) {
        return new SyncInvoker<UpdateAppRequest, UpdateAppResponse>(request, WorkspaceAppMeta.updateApp, hcClient);
    }

    /**
     * 修改自定义应用图标
     *
     * 修改自定义应用图标
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UploadAppIconRequest 请求对象
     * @return UploadAppIconResponse
     */
    public UploadAppIconResponse uploadAppIcon(UploadAppIconRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceAppMeta.uploadAppIcon);
    }

    /**
     * 修改自定义应用图标
     *
     * 修改自定义应用图标
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UploadAppIconRequest 请求对象
     * @return SyncInvoker<UploadAppIconRequest, UploadAppIconResponse>
     */
    public SyncInvoker<UploadAppIconRequest, UploadAppIconResponse> uploadAppIconInvoker(UploadAppIconRequest request) {
        return new SyncInvoker<UploadAppIconRequest, UploadAppIconResponse>(request, WorkspaceAppMeta.uploadAppIcon,
            hcClient);
    }

    /**
     * 批量删除应用组
     *
     * 批量删除应用组,重复执行会按照成功处理(响应200)
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchDeleteAppGroupRequest 请求对象
     * @return BatchDeleteAppGroupResponse
     */
    public BatchDeleteAppGroupResponse batchDeleteAppGroup(BatchDeleteAppGroupRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceAppMeta.batchDeleteAppGroup);
    }

    /**
     * 批量删除应用组
     *
     * 批量删除应用组,重复执行会按照成功处理(响应200)
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchDeleteAppGroupRequest 请求对象
     * @return SyncInvoker<BatchDeleteAppGroupRequest, BatchDeleteAppGroupResponse>
     */
    public SyncInvoker<BatchDeleteAppGroupRequest, BatchDeleteAppGroupResponse> batchDeleteAppGroupInvoker(
        BatchDeleteAppGroupRequest request) {
        return new SyncInvoker<BatchDeleteAppGroupRequest, BatchDeleteAppGroupResponse>(request,
            WorkspaceAppMeta.batchDeleteAppGroup, hcClient);
    }

    /**
     * 创建应用组
     *
     * 该API用于创建应用组。
     * &gt; - 应用服务器中安装了不同的应用，这些应用可以组成不同的应用组，进行集中的管理和维护，向用户(组)发布。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateAppGroupRequest 请求对象
     * @return CreateAppGroupResponse
     */
    public CreateAppGroupResponse createAppGroup(CreateAppGroupRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceAppMeta.createAppGroup);
    }

    /**
     * 创建应用组
     *
     * 该API用于创建应用组。
     * &gt; - 应用服务器中安装了不同的应用，这些应用可以组成不同的应用组，进行集中的管理和维护，向用户(组)发布。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateAppGroupRequest 请求对象
     * @return SyncInvoker<CreateAppGroupRequest, CreateAppGroupResponse>
     */
    public SyncInvoker<CreateAppGroupRequest, CreateAppGroupResponse> createAppGroupInvoker(
        CreateAppGroupRequest request) {
        return new SyncInvoker<CreateAppGroupRequest, CreateAppGroupResponse>(request, WorkspaceAppMeta.createAppGroup,
            hcClient);
    }

    /**
     * 查询应用组
     *
     * 查询用户创建的应用组，按照名称、授权类型分页查询。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListAppGroupRequest 请求对象
     * @return ListAppGroupResponse
     */
    public ListAppGroupResponse listAppGroup(ListAppGroupRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceAppMeta.listAppGroup);
    }

    /**
     * 查询应用组
     *
     * 查询用户创建的应用组，按照名称、授权类型分页查询。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListAppGroupRequest 请求对象
     * @return SyncInvoker<ListAppGroupRequest, ListAppGroupResponse>
     */
    public SyncInvoker<ListAppGroupRequest, ListAppGroupResponse> listAppGroupInvoker(ListAppGroupRequest request) {
        return new SyncInvoker<ListAppGroupRequest, ListAppGroupResponse>(request, WorkspaceAppMeta.listAppGroup,
            hcClient);
    }

    /**
     * 修改应用组
     *
     * 修改应用组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateAppGroupRequest 请求对象
     * @return UpdateAppGroupResponse
     */
    public UpdateAppGroupResponse updateAppGroup(UpdateAppGroupRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceAppMeta.updateAppGroup);
    }

    /**
     * 修改应用组
     *
     * 修改应用组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateAppGroupRequest 请求对象
     * @return SyncInvoker<UpdateAppGroupRequest, UpdateAppGroupResponse>
     */
    public SyncInvoker<UpdateAppGroupRequest, UpdateAppGroupResponse> updateAppGroupInvoker(
        UpdateAppGroupRequest request) {
        return new SyncInvoker<UpdateAppGroupRequest, UpdateAppGroupResponse>(request, WorkspaceAppMeta.updateAppGroup,
            hcClient);
    }

    /**
     * 查询云应用套餐
     *
     * 查询云应用套餐，按照条件过滤。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListProductRequest 请求对象
     * @return ListProductResponse
     */
    public ListProductResponse listProduct(ListProductRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceAppMeta.listProduct);
    }

    /**
     * 查询云应用套餐
     *
     * 查询云应用套餐，按照条件过滤。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListProductRequest 请求对象
     * @return SyncInvoker<ListProductRequest, ListProductResponse>
     */
    public SyncInvoker<ListProductRequest, ListProductResponse> listProductInvoker(ListProductRequest request) {
        return new SyncInvoker<ListProductRequest, ListProductResponse>(request, WorkspaceAppMeta.listProduct,
            hcClient);
    }

    /**
     * 查询会话套餐列表
     *
     * 该接口用于查询会话套餐列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListSessionTypeRequest 请求对象
     * @return ListSessionTypeResponse
     */
    public ListSessionTypeResponse listSessionType(ListSessionTypeRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceAppMeta.listSessionType);
    }

    /**
     * 查询会话套餐列表
     *
     * 该接口用于查询会话套餐列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListSessionTypeRequest 请求对象
     * @return SyncInvoker<ListSessionTypeRequest, ListSessionTypeResponse>
     */
    public SyncInvoker<ListSessionTypeRequest, ListSessionTypeResponse> listSessionTypeInvoker(
        ListSessionTypeRequest request) {
        return new SyncInvoker<ListSessionTypeRequest, ListSessionTypeResponse>(request,
            WorkspaceAppMeta.listSessionType, hcClient);
    }

    /**
     * 增加应用组授权
     *
     * 应用组添加用户授权，授权后用户就获得应用组下所有已发布应用的权限访问。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param AddAppGroupAuthorizationRequest 请求对象
     * @return AddAppGroupAuthorizationResponse
     */
    public AddAppGroupAuthorizationResponse addAppGroupAuthorization(AddAppGroupAuthorizationRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceAppMeta.addAppGroupAuthorization);
    }

    /**
     * 增加应用组授权
     *
     * 应用组添加用户授权，授权后用户就获得应用组下所有已发布应用的权限访问。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param AddAppGroupAuthorizationRequest 请求对象
     * @return SyncInvoker<AddAppGroupAuthorizationRequest, AddAppGroupAuthorizationResponse>
     */
    public SyncInvoker<AddAppGroupAuthorizationRequest, AddAppGroupAuthorizationResponse> addAppGroupAuthorizationInvoker(
        AddAppGroupAuthorizationRequest request) {
        return new SyncInvoker<AddAppGroupAuthorizationRequest, AddAppGroupAuthorizationResponse>(request,
            WorkspaceAppMeta.addAppGroupAuthorization, hcClient);
    }

    /**
     * 移除应用组授权
     *
     * 移除应用组内的指定用户的授权，用户授权删除后，用户将没有权限访问应用组内的任何应用。注意：重复执行会按照操作成功处理。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchDeleteAppGroupAuthorizationRequest 请求对象
     * @return BatchDeleteAppGroupAuthorizationResponse
     */
    public BatchDeleteAppGroupAuthorizationResponse batchDeleteAppGroupAuthorization(
        BatchDeleteAppGroupAuthorizationRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceAppMeta.batchDeleteAppGroupAuthorization);
    }

    /**
     * 移除应用组授权
     *
     * 移除应用组内的指定用户的授权，用户授权删除后，用户将没有权限访问应用组内的任何应用。注意：重复执行会按照操作成功处理。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchDeleteAppGroupAuthorizationRequest 请求对象
     * @return SyncInvoker<BatchDeleteAppGroupAuthorizationRequest, BatchDeleteAppGroupAuthorizationResponse>
     */
    public SyncInvoker<BatchDeleteAppGroupAuthorizationRequest, BatchDeleteAppGroupAuthorizationResponse> batchDeleteAppGroupAuthorizationInvoker(
        BatchDeleteAppGroupAuthorizationRequest request) {
        return new SyncInvoker<BatchDeleteAppGroupAuthorizationRequest, BatchDeleteAppGroupAuthorizationResponse>(
            request, WorkspaceAppMeta.batchDeleteAppGroupAuthorization, hcClient);
    }

    /**
     * 查询应用组授权记录
     *
     * 查询应用内已授权的用户列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListAppGroupAuthorizationRequest 请求对象
     * @return ListAppGroupAuthorizationResponse
     */
    public ListAppGroupAuthorizationResponse listAppGroupAuthorization(ListAppGroupAuthorizationRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceAppMeta.listAppGroupAuthorization);
    }

    /**
     * 查询应用组授权记录
     *
     * 查询应用内已授权的用户列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListAppGroupAuthorizationRequest 请求对象
     * @return SyncInvoker<ListAppGroupAuthorizationRequest, ListAppGroupAuthorizationResponse>
     */
    public SyncInvoker<ListAppGroupAuthorizationRequest, ListAppGroupAuthorizationResponse> listAppGroupAuthorizationInvoker(
        ListAppGroupAuthorizationRequest request) {
        return new SyncInvoker<ListAppGroupAuthorizationRequest, ListAppGroupAuthorizationResponse>(request,
            WorkspaceAppMeta.listAppGroupAuthorization, hcClient);
    }

    /**
     * 查询可用分区列表
     *
     * 该接口用于查询支持的可用分区列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListAvailabilityZoneRequest 请求对象
     * @return ListAvailabilityZoneResponse
     */
    public ListAvailabilityZoneResponse listAvailabilityZone(ListAvailabilityZoneRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceAppMeta.listAvailabilityZone);
    }

    /**
     * 查询可用分区列表
     *
     * 该接口用于查询支持的可用分区列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListAvailabilityZoneRequest 请求对象
     * @return SyncInvoker<ListAvailabilityZoneRequest, ListAvailabilityZoneResponse>
     */
    public SyncInvoker<ListAvailabilityZoneRequest, ListAvailabilityZoneResponse> listAvailabilityZoneInvoker(
        ListAvailabilityZoneRequest request) {
        return new SyncInvoker<ListAvailabilityZoneRequest, ListAvailabilityZoneResponse>(request,
            WorkspaceAppMeta.listAvailabilityZone, hcClient);
    }

    /**
     * 查询任务的执行状态
     *
     * 查询Job的执行状态。
     * 
     * 对于创建云应用服务器命令下发后会返回job_id，通过job_id可以查询任务的执行状态。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowJobRequest 请求对象
     * @return ShowJobResponse
     */
    public ShowJobResponse showJob(ShowJobRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceAppMeta.showJob);
    }

    /**
     * 查询任务的执行状态
     *
     * 查询Job的执行状态。
     * 
     * 对于创建云应用服务器命令下发后会返回job_id，通过job_id可以查询任务的执行状态。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowJobRequest 请求对象
     * @return SyncInvoker<ShowJobRequest, ShowJobResponse>
     */
    public SyncInvoker<ShowJobRequest, ShowJobResponse> showJobInvoker(ShowJobRequest request) {
        return new SyncInvoker<ShowJobRequest, ShowJobResponse>(request, WorkspaceAppMeta.showJob, hcClient);
    }

    /**
     * 新增或更新存储目录访问权限自定义策略
     *
     * 新增或更新存储目录访问权限自定义策略(已存在自定义策略时会对已有策略更新)
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateOrUpdateStoragePolicyStatementRequest 请求对象
     * @return CreateOrUpdateStoragePolicyStatementResponse
     */
    public CreateOrUpdateStoragePolicyStatementResponse createOrUpdateStoragePolicyStatement(
        CreateOrUpdateStoragePolicyStatementRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceAppMeta.createOrUpdateStoragePolicyStatement);
    }

    /**
     * 新增或更新存储目录访问权限自定义策略
     *
     * 新增或更新存储目录访问权限自定义策略(已存在自定义策略时会对已有策略更新)
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateOrUpdateStoragePolicyStatementRequest 请求对象
     * @return SyncInvoker<CreateOrUpdateStoragePolicyStatementRequest, CreateOrUpdateStoragePolicyStatementResponse>
     */
    public SyncInvoker<CreateOrUpdateStoragePolicyStatementRequest, CreateOrUpdateStoragePolicyStatementResponse> createOrUpdateStoragePolicyStatementInvoker(
        CreateOrUpdateStoragePolicyStatementRequest request) {
        return new SyncInvoker<CreateOrUpdateStoragePolicyStatementRequest, CreateOrUpdateStoragePolicyStatementResponse>(
            request, WorkspaceAppMeta.createOrUpdateStoragePolicyStatement, hcClient);
    }

    /**
     * 创建WKS存储
     *
     * 创建WKS存储，目前仅支持创建 SFS3.0 容量型文件系统。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreatePersistentStorageRequest 请求对象
     * @return CreatePersistentStorageResponse
     */
    public CreatePersistentStorageResponse createPersistentStorage(CreatePersistentStorageRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceAppMeta.createPersistentStorage);
    }

    /**
     * 创建WKS存储
     *
     * 创建WKS存储，目前仅支持创建 SFS3.0 容量型文件系统。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreatePersistentStorageRequest 请求对象
     * @return SyncInvoker<CreatePersistentStorageRequest, CreatePersistentStorageResponse>
     */
    public SyncInvoker<CreatePersistentStorageRequest, CreatePersistentStorageResponse> createPersistentStorageInvoker(
        CreatePersistentStorageRequest request) {
        return new SyncInvoker<CreatePersistentStorageRequest, CreatePersistentStorageResponse>(request,
            WorkspaceAppMeta.createPersistentStorage, hcClient);
    }

    /**
     * 创建共享存储目录
     *
     * 创建共享存储目录。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateShareFolderRequest 请求对象
     * @return CreateShareFolderResponse
     */
    public CreateShareFolderResponse createShareFolder(CreateShareFolderRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceAppMeta.createShareFolder);
    }

    /**
     * 创建共享存储目录
     *
     * 创建共享存储目录。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateShareFolderRequest 请求对象
     * @return SyncInvoker<CreateShareFolderRequest, CreateShareFolderResponse>
     */
    public SyncInvoker<CreateShareFolderRequest, CreateShareFolderResponse> createShareFolderInvoker(
        CreateShareFolderRequest request) {
        return new SyncInvoker<CreateShareFolderRequest, CreateShareFolderResponse>(request,
            WorkspaceAppMeta.createShareFolder, hcClient);
    }

    /**
     * 删除WKS存储
     *
     * 删除共享存储，只会解除NAS与文件系统之间的关联关系，不会删除文件系统和文件系统中的数据。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeletePersistentStorageRequest 请求对象
     * @return DeletePersistentStorageResponse
     */
    public DeletePersistentStorageResponse deletePersistentStorage(DeletePersistentStorageRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceAppMeta.deletePersistentStorage);
    }

    /**
     * 删除WKS存储
     *
     * 删除共享存储，只会解除NAS与文件系统之间的关联关系，不会删除文件系统和文件系统中的数据。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeletePersistentStorageRequest 请求对象
     * @return SyncInvoker<DeletePersistentStorageRequest, DeletePersistentStorageResponse>
     */
    public SyncInvoker<DeletePersistentStorageRequest, DeletePersistentStorageResponse> deletePersistentStorageInvoker(
        DeletePersistentStorageRequest request) {
        return new SyncInvoker<DeletePersistentStorageRequest, DeletePersistentStorageResponse>(request,
            WorkspaceAppMeta.deletePersistentStorage, hcClient);
    }

    /**
     * 删除共享目录
     *
     * 删除共享存储目录。
     * &gt; 需要删除绑定的用户及用户组，才能删除共享文目录。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteStorageClaimRequest 请求对象
     * @return DeleteStorageClaimResponse
     */
    public DeleteStorageClaimResponse deleteStorageClaim(DeleteStorageClaimRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceAppMeta.deleteStorageClaim);
    }

    /**
     * 删除共享目录
     *
     * 删除共享存储目录。
     * &gt; 需要删除绑定的用户及用户组，才能删除共享文目录。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteStorageClaimRequest 请求对象
     * @return SyncInvoker<DeleteStorageClaimRequest, DeleteStorageClaimResponse>
     */
    public SyncInvoker<DeleteStorageClaimRequest, DeleteStorageClaimResponse> deleteStorageClaimInvoker(
        DeleteStorageClaimRequest request) {
        return new SyncInvoker<DeleteStorageClaimRequest, DeleteStorageClaimResponse>(request,
            WorkspaceAppMeta.deleteStorageClaim, hcClient);
    }

    /**
     * 删除个人存储目录
     *
     * 删除个人存储目录，个人目录中的数据也将永久删除且无法恢复。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteUserStorageAttachmentRequest 请求对象
     * @return DeleteUserStorageAttachmentResponse
     */
    public DeleteUserStorageAttachmentResponse deleteUserStorageAttachment(DeleteUserStorageAttachmentRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceAppMeta.deleteUserStorageAttachment);
    }

    /**
     * 删除个人存储目录
     *
     * 删除个人存储目录，个人目录中的数据也将永久删除且无法恢复。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteUserStorageAttachmentRequest 请求对象
     * @return SyncInvoker<DeleteUserStorageAttachmentRequest, DeleteUserStorageAttachmentResponse>
     */
    public SyncInvoker<DeleteUserStorageAttachmentRequest, DeleteUserStorageAttachmentResponse> deleteUserStorageAttachmentInvoker(
        DeleteUserStorageAttachmentRequest request) {
        return new SyncInvoker<DeleteUserStorageAttachmentRequest, DeleteUserStorageAttachmentResponse>(request,
            WorkspaceAppMeta.deleteUserStorageAttachment, hcClient);
    }

    /**
     * 查询WKS存储
     *
     * 查询WKS存储
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListPersistentStorageRequest 请求对象
     * @return ListPersistentStorageResponse
     */
    public ListPersistentStorageResponse listPersistentStorage(ListPersistentStorageRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceAppMeta.listPersistentStorage);
    }

    /**
     * 查询WKS存储
     *
     * 查询WKS存储
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListPersistentStorageRequest 请求对象
     * @return SyncInvoker<ListPersistentStorageRequest, ListPersistentStorageResponse>
     */
    public SyncInvoker<ListPersistentStorageRequest, ListPersistentStorageResponse> listPersistentStorageInvoker(
        ListPersistentStorageRequest request) {
        return new SyncInvoker<ListPersistentStorageRequest, ListPersistentStorageResponse>(request,
            WorkspaceAppMeta.listPersistentStorage, hcClient);
    }

    /**
     * 查询共享存储目录
     *
     * 查询共享存储目录。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListShareFolderRequest 请求对象
     * @return ListShareFolderResponse
     */
    public ListShareFolderResponse listShareFolder(ListShareFolderRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceAppMeta.listShareFolder);
    }

    /**
     * 查询共享存储目录
     *
     * 查询共享存储目录。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListShareFolderRequest 请求对象
     * @return SyncInvoker<ListShareFolderRequest, ListShareFolderResponse>
     */
    public SyncInvoker<ListShareFolderRequest, ListShareFolderResponse> listShareFolderInvoker(
        ListShareFolderRequest request) {
        return new SyncInvoker<ListShareFolderRequest, ListShareFolderResponse>(request,
            WorkspaceAppMeta.listShareFolder, hcClient);
    }

    /**
     * 查询个人存储目录
     *
     * 查询个人存储目录
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListStorageAssignmentRequest 请求对象
     * @return ListStorageAssignmentResponse
     */
    public ListStorageAssignmentResponse listStorageAssignment(ListStorageAssignmentRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceAppMeta.listStorageAssignment);
    }

    /**
     * 查询个人存储目录
     *
     * 查询个人存储目录
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListStorageAssignmentRequest 请求对象
     * @return SyncInvoker<ListStorageAssignmentRequest, ListStorageAssignmentResponse>
     */
    public SyncInvoker<ListStorageAssignmentRequest, ListStorageAssignmentResponse> listStorageAssignmentInvoker(
        ListStorageAssignmentRequest request) {
        return new SyncInvoker<ListStorageAssignmentRequest, ListStorageAssignmentResponse>(request,
            WorkspaceAppMeta.listStorageAssignment, hcClient);
    }

    /**
     * 查询存储目录访问权限策略
     *
     * 查询存储目录访问权限策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListStoragePolicyStatementRequest 请求对象
     * @return ListStoragePolicyStatementResponse
     */
    public ListStoragePolicyStatementResponse listStoragePolicyStatement(ListStoragePolicyStatementRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceAppMeta.listStoragePolicyStatement);
    }

    /**
     * 查询存储目录访问权限策略
     *
     * 查询存储目录访问权限策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListStoragePolicyStatementRequest 请求对象
     * @return SyncInvoker<ListStoragePolicyStatementRequest, ListStoragePolicyStatementResponse>
     */
    public SyncInvoker<ListStoragePolicyStatementRequest, ListStoragePolicyStatementResponse> listStoragePolicyStatementInvoker(
        ListStoragePolicyStatementRequest request) {
        return new SyncInvoker<ListStoragePolicyStatementRequest, ListStoragePolicyStatementResponse>(request,
            WorkspaceAppMeta.listStoragePolicyStatement, hcClient);
    }

    /**
     * 修改共享目录成员
     *
     * 批量添加或者移除共享目录成员
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateShareFolderAssignmentRequest 请求对象
     * @return UpdateShareFolderAssignmentResponse
     */
    public UpdateShareFolderAssignmentResponse updateShareFolderAssignment(UpdateShareFolderAssignmentRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceAppMeta.updateShareFolderAssignment);
    }

    /**
     * 修改共享目录成员
     *
     * 批量添加或者移除共享目录成员
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateShareFolderAssignmentRequest 请求对象
     * @return SyncInvoker<UpdateShareFolderAssignmentRequest, UpdateShareFolderAssignmentResponse>
     */
    public SyncInvoker<UpdateShareFolderAssignmentRequest, UpdateShareFolderAssignmentResponse> updateShareFolderAssignmentInvoker(
        UpdateShareFolderAssignmentRequest request) {
        return new SyncInvoker<UpdateShareFolderAssignmentRequest, UpdateShareFolderAssignmentResponse>(request,
            WorkspaceAppMeta.updateShareFolderAssignment, hcClient);
    }

    /**
     * 创建个人存储目录
     *
     * 创建个人存储目录,已存在对应目录时,仅更新策略不会重复创建目录
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateUserFolderAssignmentRequest 请求对象
     * @return UpdateUserFolderAssignmentResponse
     */
    public UpdateUserFolderAssignmentResponse updateUserFolderAssignment(UpdateUserFolderAssignmentRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceAppMeta.updateUserFolderAssignment);
    }

    /**
     * 创建个人存储目录
     *
     * 创建个人存储目录,已存在对应目录时,仅更新策略不会重复创建目录
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateUserFolderAssignmentRequest 请求对象
     * @return SyncInvoker<UpdateUserFolderAssignmentRequest, UpdateUserFolderAssignmentResponse>
     */
    public SyncInvoker<UpdateUserFolderAssignmentRequest, UpdateUserFolderAssignmentResponse> updateUserFolderAssignmentInvoker(
        UpdateUserFolderAssignmentRequest request) {
        return new SyncInvoker<UpdateUserFolderAssignmentRequest, UpdateUserFolderAssignmentResponse>(request,
            WorkspaceAppMeta.updateUserFolderAssignment, hcClient);
    }

    /**
     * 新增策略组
     *
     * 新增策略组，通过策略组能灵活的控制客户端访问与接入策略，如：文件、剪切板、会话等。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreatePolicyGroupRequest 请求对象
     * @return CreatePolicyGroupResponse
     */
    public CreatePolicyGroupResponse createPolicyGroup(CreatePolicyGroupRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceAppMeta.createPolicyGroup);
    }

    /**
     * 新增策略组
     *
     * 新增策略组，通过策略组能灵活的控制客户端访问与接入策略，如：文件、剪切板、会话等。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreatePolicyGroupRequest 请求对象
     * @return SyncInvoker<CreatePolicyGroupRequest, CreatePolicyGroupResponse>
     */
    public SyncInvoker<CreatePolicyGroupRequest, CreatePolicyGroupResponse> createPolicyGroupInvoker(
        CreatePolicyGroupRequest request) {
        return new SyncInvoker<CreatePolicyGroupRequest, CreatePolicyGroupResponse>(request,
            WorkspaceAppMeta.createPolicyGroup, hcClient);
    }

    /**
     * 新增策略模板
     *
     * 新增策略模板。策略模板创建好后，用户在创建策略组的时候，就可以根据已有策略模板按需调整配置，快速完成策略组的创建。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreatePolicyTemplateRequest 请求对象
     * @return CreatePolicyTemplateResponse
     */
    public CreatePolicyTemplateResponse createPolicyTemplate(CreatePolicyTemplateRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceAppMeta.createPolicyTemplate);
    }

    /**
     * 新增策略模板
     *
     * 新增策略模板。策略模板创建好后，用户在创建策略组的时候，就可以根据已有策略模板按需调整配置，快速完成策略组的创建。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreatePolicyTemplateRequest 请求对象
     * @return SyncInvoker<CreatePolicyTemplateRequest, CreatePolicyTemplateResponse>
     */
    public SyncInvoker<CreatePolicyTemplateRequest, CreatePolicyTemplateResponse> createPolicyTemplateInvoker(
        CreatePolicyTemplateRequest request) {
        return new SyncInvoker<CreatePolicyTemplateRequest, CreatePolicyTemplateResponse>(request,
            WorkspaceAppMeta.createPolicyTemplate, hcClient);
    }

    /**
     * 删除策略组
     *
     * 删除指定策略组，包含策略组对应的策略信息以及应用对象信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeletePolicyGroupRequest 请求对象
     * @return DeletePolicyGroupResponse
     */
    public DeletePolicyGroupResponse deletePolicyGroup(DeletePolicyGroupRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceAppMeta.deletePolicyGroup);
    }

    /**
     * 删除策略组
     *
     * 删除指定策略组，包含策略组对应的策略信息以及应用对象信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeletePolicyGroupRequest 请求对象
     * @return SyncInvoker<DeletePolicyGroupRequest, DeletePolicyGroupResponse>
     */
    public SyncInvoker<DeletePolicyGroupRequest, DeletePolicyGroupResponse> deletePolicyGroupInvoker(
        DeletePolicyGroupRequest request) {
        return new SyncInvoker<DeletePolicyGroupRequest, DeletePolicyGroupResponse>(request,
            WorkspaceAppMeta.deletePolicyGroup, hcClient);
    }

    /**
     * 删除策略模板
     *
     * 删除指定策略模板，包含策略模板对应的策略信息以及应用对象信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeletePolicyTemplateRequest 请求对象
     * @return DeletePolicyTemplateResponse
     */
    public DeletePolicyTemplateResponse deletePolicyTemplate(DeletePolicyTemplateRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceAppMeta.deletePolicyTemplate);
    }

    /**
     * 删除策略模板
     *
     * 删除指定策略模板，包含策略模板对应的策略信息以及应用对象信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeletePolicyTemplateRequest 请求对象
     * @return SyncInvoker<DeletePolicyTemplateRequest, DeletePolicyTemplateResponse>
     */
    public SyncInvoker<DeletePolicyTemplateRequest, DeletePolicyTemplateResponse> deletePolicyTemplateInvoker(
        DeletePolicyTemplateRequest request) {
        return new SyncInvoker<DeletePolicyTemplateRequest, DeletePolicyTemplateResponse>(request,
            WorkspaceAppMeta.deletePolicyTemplate, hcClient);
    }

    /**
     * 查询策略组列表
     *
     * 查询策略组概要信息列表,包括应用对象和详细策略项。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListPolicyGroupRequest 请求对象
     * @return ListPolicyGroupResponse
     */
    public ListPolicyGroupResponse listPolicyGroup(ListPolicyGroupRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceAppMeta.listPolicyGroup);
    }

    /**
     * 查询策略组列表
     *
     * 查询策略组概要信息列表,包括应用对象和详细策略项。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListPolicyGroupRequest 请求对象
     * @return SyncInvoker<ListPolicyGroupRequest, ListPolicyGroupResponse>
     */
    public SyncInvoker<ListPolicyGroupRequest, ListPolicyGroupResponse> listPolicyGroupInvoker(
        ListPolicyGroupRequest request) {
        return new SyncInvoker<ListPolicyGroupRequest, ListPolicyGroupResponse>(request,
            WorkspaceAppMeta.listPolicyGroup, hcClient);
    }

    /**
     * 查询策略模板列表
     *
     * 查询策略模板概要信息列表，包含策略信息以及应用对象信息。用户在创建策略组的时候，可以根据已有策略模板按需调整配置，快速完成策略组的创建。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListPolicyTemplateRequest 请求对象
     * @return ListPolicyTemplateResponse
     */
    public ListPolicyTemplateResponse listPolicyTemplate(ListPolicyTemplateRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceAppMeta.listPolicyTemplate);
    }

    /**
     * 查询策略模板列表
     *
     * 查询策略模板概要信息列表，包含策略信息以及应用对象信息。用户在创建策略组的时候，可以根据已有策略模板按需调整配置，快速完成策略组的创建。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListPolicyTemplateRequest 请求对象
     * @return SyncInvoker<ListPolicyTemplateRequest, ListPolicyTemplateResponse>
     */
    public SyncInvoker<ListPolicyTemplateRequest, ListPolicyTemplateResponse> listPolicyTemplateInvoker(
        ListPolicyTemplateRequest request) {
        return new SyncInvoker<ListPolicyTemplateRequest, ListPolicyTemplateResponse>(request,
            WorkspaceAppMeta.listPolicyTemplate, hcClient);
    }

    /**
     * 查询策略组应用对象
     *
     * 查询指定策略组所应用的对象。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListTargetsOfPolicyGroupRequest 请求对象
     * @return ListTargetsOfPolicyGroupResponse
     */
    public ListTargetsOfPolicyGroupResponse listTargetsOfPolicyGroup(ListTargetsOfPolicyGroupRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceAppMeta.listTargetsOfPolicyGroup);
    }

    /**
     * 查询策略组应用对象
     *
     * 查询指定策略组所应用的对象。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListTargetsOfPolicyGroupRequest 请求对象
     * @return SyncInvoker<ListTargetsOfPolicyGroupRequest, ListTargetsOfPolicyGroupResponse>
     */
    public SyncInvoker<ListTargetsOfPolicyGroupRequest, ListTargetsOfPolicyGroupResponse> listTargetsOfPolicyGroupInvoker(
        ListTargetsOfPolicyGroupRequest request) {
        return new SyncInvoker<ListTargetsOfPolicyGroupRequest, ListTargetsOfPolicyGroupResponse>(request,
            WorkspaceAppMeta.listTargetsOfPolicyGroup, hcClient);
    }

    /**
     * 查询初始策略项
     *
     * 查询初始策略项，初始策略项是所有协议策略配置项的默认配置，用户可以在初始策略项的基础上根据需求修改指定的配置，创建新的策略组。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowOriginalPolicyInfoRequest 请求对象
     * @return ShowOriginalPolicyInfoResponse
     */
    public ShowOriginalPolicyInfoResponse showOriginalPolicyInfo(ShowOriginalPolicyInfoRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceAppMeta.showOriginalPolicyInfo);
    }

    /**
     * 查询初始策略项
     *
     * 查询初始策略项，初始策略项是所有协议策略配置项的默认配置，用户可以在初始策略项的基础上根据需求修改指定的配置，创建新的策略组。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowOriginalPolicyInfoRequest 请求对象
     * @return SyncInvoker<ShowOriginalPolicyInfoRequest, ShowOriginalPolicyInfoResponse>
     */
    public SyncInvoker<ShowOriginalPolicyInfoRequest, ShowOriginalPolicyInfoResponse> showOriginalPolicyInfoInvoker(
        ShowOriginalPolicyInfoRequest request) {
        return new SyncInvoker<ShowOriginalPolicyInfoRequest, ShowOriginalPolicyInfoResponse>(request,
            WorkspaceAppMeta.showOriginalPolicyInfo, hcClient);
    }

    /**
     * 修改策略组
     *
     * 修改指定策略组的信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdatePolicyGroupRequest 请求对象
     * @return UpdatePolicyGroupResponse
     */
    public UpdatePolicyGroupResponse updatePolicyGroup(UpdatePolicyGroupRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceAppMeta.updatePolicyGroup);
    }

    /**
     * 修改策略组
     *
     * 修改指定策略组的信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdatePolicyGroupRequest 请求对象
     * @return SyncInvoker<UpdatePolicyGroupRequest, UpdatePolicyGroupResponse>
     */
    public SyncInvoker<UpdatePolicyGroupRequest, UpdatePolicyGroupResponse> updatePolicyGroupInvoker(
        UpdatePolicyGroupRequest request) {
        return new SyncInvoker<UpdatePolicyGroupRequest, UpdatePolicyGroupResponse>(request,
            WorkspaceAppMeta.updatePolicyGroup, hcClient);
    }

    /**
     * 修改策略模板
     *
     * 修改指定策略模板的信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdatePolicyTemplateRequest 请求对象
     * @return UpdatePolicyTemplateResponse
     */
    public UpdatePolicyTemplateResponse updatePolicyTemplate(UpdatePolicyTemplateRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceAppMeta.updatePolicyTemplate);
    }

    /**
     * 修改策略模板
     *
     * 修改指定策略模板的信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdatePolicyTemplateRequest 请求对象
     * @return SyncInvoker<UpdatePolicyTemplateRequest, UpdatePolicyTemplateResponse>
     */
    public SyncInvoker<UpdatePolicyTemplateRequest, UpdatePolicyTemplateResponse> updatePolicyTemplateInvoker(
        UpdatePolicyTemplateRequest request) {
        return new SyncInvoker<UpdatePolicyTemplateRequest, UpdatePolicyTemplateResponse>(request,
            WorkspaceAppMeta.updatePolicyTemplate, hcClient);
    }

    /**
     * 配额校验
     *
     * 配额校验，购买服务器前可用调用该接口，校验本次创建服务器资源是否足够。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CheckQuotaRequest 请求对象
     * @return CheckQuotaResponse
     */
    public CheckQuotaResponse checkQuota(CheckQuotaRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceAppMeta.checkQuota);
    }

    /**
     * 配额校验
     *
     * 配额校验，购买服务器前可用调用该接口，校验本次创建服务器资源是否足够。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CheckQuotaRequest 请求对象
     * @return SyncInvoker<CheckQuotaRequest, CheckQuotaResponse>
     */
    public SyncInvoker<CheckQuotaRequest, CheckQuotaResponse> checkQuotaInvoker(CheckQuotaRequest request) {
        return new SyncInvoker<CheckQuotaRequest, CheckQuotaResponse>(request, WorkspaceAppMeta.checkQuota, hcClient);
    }

    /**
     * 批量删除服务器
     *
     * 批量删除服务器
     * &gt; - 仅支持删除按需订购的服务器，包周期订购的服务器需要到Console界面进行退订，订单退订成功后服务器将会自动删除。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchDeleteServerRequest 请求对象
     * @return BatchDeleteServerResponse
     */
    public BatchDeleteServerResponse batchDeleteServer(BatchDeleteServerRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceAppMeta.batchDeleteServer);
    }

    /**
     * 批量删除服务器
     *
     * 批量删除服务器
     * &gt; - 仅支持删除按需订购的服务器，包周期订购的服务器需要到Console界面进行退订，订单退订成功后服务器将会自动删除。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchDeleteServerRequest 请求对象
     * @return SyncInvoker<BatchDeleteServerRequest, BatchDeleteServerResponse>
     */
    public SyncInvoker<BatchDeleteServerRequest, BatchDeleteServerResponse> batchDeleteServerInvoker(
        BatchDeleteServerRequest request) {
        return new SyncInvoker<BatchDeleteServerRequest, BatchDeleteServerResponse>(request,
            WorkspaceAppMeta.batchDeleteServer, hcClient);
    }

    /**
     * 迁移云办公主机下面的服务器到目标云办公主机
     *
     * 迁移云办公主机下面的服务器到目标云办公主机
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchMigrateHostsServerRequest 请求对象
     * @return BatchMigrateHostsServerResponse
     */
    public BatchMigrateHostsServerResponse batchMigrateHostsServer(BatchMigrateHostsServerRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceAppMeta.batchMigrateHostsServer);
    }

    /**
     * 迁移云办公主机下面的服务器到目标云办公主机
     *
     * 迁移云办公主机下面的服务器到目标云办公主机
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchMigrateHostsServerRequest 请求对象
     * @return SyncInvoker<BatchMigrateHostsServerRequest, BatchMigrateHostsServerResponse>
     */
    public SyncInvoker<BatchMigrateHostsServerRequest, BatchMigrateHostsServerResponse> batchMigrateHostsServerInvoker(
        BatchMigrateHostsServerRequest request) {
        return new SyncInvoker<BatchMigrateHostsServerRequest, BatchMigrateHostsServerResponse>(request,
            WorkspaceAppMeta.batchMigrateHostsServer, hcClient);
    }

    /**
     * 重启服务器
     *
     * 重启服务器
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchRebootServerRequest 请求对象
     * @return BatchRebootServerResponse
     */
    public BatchRebootServerResponse batchRebootServer(BatchRebootServerRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceAppMeta.batchRebootServer);
    }

    /**
     * 重启服务器
     *
     * 重启服务器
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchRebootServerRequest 请求对象
     * @return SyncInvoker<BatchRebootServerRequest, BatchRebootServerResponse>
     */
    public SyncInvoker<BatchRebootServerRequest, BatchRebootServerResponse> batchRebootServerInvoker(
        BatchRebootServerRequest request) {
        return new SyncInvoker<BatchRebootServerRequest, BatchRebootServerResponse>(request,
            WorkspaceAppMeta.batchRebootServer, hcClient);
    }

    /**
     * 批量服务器重新加域
     *
     * 批量服务器重新加入AD域，一般用于解决服务器脱域的情况使用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchRejoinDomainRequest 请求对象
     * @return BatchRejoinDomainResponse
     */
    public BatchRejoinDomainResponse batchRejoinDomain(BatchRejoinDomainRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceAppMeta.batchRejoinDomain);
    }

    /**
     * 批量服务器重新加域
     *
     * 批量服务器重新加入AD域，一般用于解决服务器脱域的情况使用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchRejoinDomainRequest 请求对象
     * @return SyncInvoker<BatchRejoinDomainRequest, BatchRejoinDomainResponse>
     */
    public SyncInvoker<BatchRejoinDomainRequest, BatchRejoinDomainResponse> batchRejoinDomainInvoker(
        BatchRejoinDomainRequest request) {
        return new SyncInvoker<BatchRejoinDomainRequest, BatchRejoinDomainResponse>(request,
            WorkspaceAppMeta.batchRejoinDomain, hcClient);
    }

    /**
     * 启动服务器
     *
     * 启动服务器
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchStartServerRequest 请求对象
     * @return BatchStartServerResponse
     */
    public BatchStartServerResponse batchStartServer(BatchStartServerRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceAppMeta.batchStartServer);
    }

    /**
     * 启动服务器
     *
     * 启动服务器
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchStartServerRequest 请求对象
     * @return SyncInvoker<BatchStartServerRequest, BatchStartServerResponse>
     */
    public SyncInvoker<BatchStartServerRequest, BatchStartServerResponse> batchStartServerInvoker(
        BatchStartServerRequest request) {
        return new SyncInvoker<BatchStartServerRequest, BatchStartServerResponse>(request,
            WorkspaceAppMeta.batchStartServer, hcClient);
    }

    /**
     * 关闭服务器
     *
     * 关闭服务器
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchStopServerRequest 请求对象
     * @return BatchStopServerResponse
     */
    public BatchStopServerResponse batchStopServer(BatchStopServerRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceAppMeta.batchStopServer);
    }

    /**
     * 关闭服务器
     *
     * 关闭服务器
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchStopServerRequest 请求对象
     * @return SyncInvoker<BatchStopServerRequest, BatchStopServerResponse>
     */
    public SyncInvoker<BatchStopServerRequest, BatchStopServerResponse> batchStopServerInvoker(
        BatchStopServerRequest request) {
        return new SyncInvoker<BatchStopServerRequest, BatchStopServerResponse>(request,
            WorkspaceAppMeta.batchStopServer, hcClient);
    }

    /**
     * 批量更新服务器虚拟会话IP配置
     *
     * 批量更新服务器虚拟会话IP配置，按需重启机器。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchUpdateTsviRequest 请求对象
     * @return BatchUpdateTsviResponse
     */
    public BatchUpdateTsviResponse batchUpdateTsvi(BatchUpdateTsviRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceAppMeta.batchUpdateTsvi);
    }

    /**
     * 批量更新服务器虚拟会话IP配置
     *
     * 批量更新服务器虚拟会话IP配置，按需重启机器。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchUpdateTsviRequest 请求对象
     * @return SyncInvoker<BatchUpdateTsviRequest, BatchUpdateTsviResponse>
     */
    public SyncInvoker<BatchUpdateTsviRequest, BatchUpdateTsviResponse> batchUpdateTsviInvoker(
        BatchUpdateTsviRequest request) {
        return new SyncInvoker<BatchUpdateTsviRequest, BatchUpdateTsviResponse>(request,
            WorkspaceAppMeta.batchUpdateTsvi, hcClient);
    }

    /**
     * 修改服务器的镜像
     *
     * 修改服务器的镜像
     * &gt; - 服务器的镜像和服务器组的镜像不一样时，支持服务器的镜像切换为服务器组的镜像，并且仅允许同等镜像进行切换，例如：同操作系统，免费镜像切换，同源同价的付费镜像切换。如果服务器组的镜像和服务器的镜像为非同等镜像，建议您直接购买新的服务器，删除或者退订老的服务器。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ChangeServerImageRequest 请求对象
     * @return ChangeServerImageResponse
     */
    public ChangeServerImageResponse changeServerImage(ChangeServerImageRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceAppMeta.changeServerImage);
    }

    /**
     * 修改服务器的镜像
     *
     * 修改服务器的镜像
     * &gt; - 服务器的镜像和服务器组的镜像不一样时，支持服务器的镜像切换为服务器组的镜像，并且仅允许同等镜像进行切换，例如：同操作系统，免费镜像切换，同源同价的付费镜像切换。如果服务器组的镜像和服务器的镜像为非同等镜像，建议您直接购买新的服务器，删除或者退订老的服务器。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ChangeServerImageRequest 请求对象
     * @return SyncInvoker<ChangeServerImageRequest, ChangeServerImageResponse>
     */
    public SyncInvoker<ChangeServerImageRequest, ChangeServerImageResponse> changeServerImageInvoker(
        ChangeServerImageRequest request) {
        return new SyncInvoker<ChangeServerImageRequest, ChangeServerImageResponse>(request,
            WorkspaceAppMeta.changeServerImage, hcClient);
    }

    /**
     * 创建云服务器
     *
     * 创建云服务器接口
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateAppServersRequest 请求对象
     * @return CreateAppServersResponse
     */
    public CreateAppServersResponse createAppServers(CreateAppServersRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceAppMeta.createAppServers);
    }

    /**
     * 创建云服务器
     *
     * 创建云服务器接口
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateAppServersRequest 请求对象
     * @return SyncInvoker<CreateAppServersRequest, CreateAppServersResponse>
     */
    public SyncInvoker<CreateAppServersRequest, CreateAppServersResponse> createAppServersInvoker(
        CreateAppServersRequest request) {
        return new SyncInvoker<CreateAppServersRequest, CreateAppServersResponse>(request,
            WorkspaceAppMeta.createAppServers, hcClient);
    }

    /**
     * 查询服务器列表
     *
     * 查询服务器列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListServersRequest 请求对象
     * @return ListServersResponse
     */
    public ListServersResponse listServers(ListServersRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceAppMeta.listServers);
    }

    /**
     * 查询服务器列表
     *
     * 查询服务器列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListServersRequest 请求对象
     * @return SyncInvoker<ListServersRequest, ListServersResponse>
     */
    public SyncInvoker<ListServersRequest, ListServersResponse> listServersInvoker(ListServersRequest request) {
        return new SyncInvoker<ListServersRequest, ListServersResponse>(request, WorkspaceAppMeta.listServers,
            hcClient);
    }

    /**
     * 重装服务器
     *
     * 重装服务器。
     * &gt; - 使用服务器原有的镜像进行重装，当服务器异常无法恢复时或者服务器运行时间久了，性能下降时，可选择重建服务器。注意：重装时系统盘的数据将会被清理掉。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ReinstallServerRequest 请求对象
     * @return ReinstallServerResponse
     */
    public ReinstallServerResponse reinstallServer(ReinstallServerRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceAppMeta.reinstallServer);
    }

    /**
     * 重装服务器
     *
     * 重装服务器。
     * &gt; - 使用服务器原有的镜像进行重装，当服务器异常无法恢复时或者服务器运行时间久了，性能下降时，可选择重建服务器。注意：重装时系统盘的数据将会被清理掉。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ReinstallServerRequest 请求对象
     * @return SyncInvoker<ReinstallServerRequest, ReinstallServerResponse>
     */
    public SyncInvoker<ReinstallServerRequest, ReinstallServerResponse> reinstallServerInvoker(
        ReinstallServerRequest request) {
        return new SyncInvoker<ReinstallServerRequest, ReinstallServerResponse>(request,
            WorkspaceAppMeta.reinstallServer, hcClient);
    }

    /**
     * 修改服务器
     *
     * 修改服务器。
     * &gt; - 服务器的状态修改为维护模式后，用户打开应用，选择可用的服务器进行接入的时候，会过滤掉处于维护模式的服务器。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateServerRequest 请求对象
     * @return UpdateServerResponse
     */
    public UpdateServerResponse updateServer(UpdateServerRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceAppMeta.updateServer);
    }

    /**
     * 修改服务器
     *
     * 修改服务器。
     * &gt; - 服务器的状态修改为维护模式后，用户打开应用，选择可用的服务器进行接入的时候，会过滤掉处于维护模式的服务器。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateServerRequest 请求对象
     * @return SyncInvoker<UpdateServerRequest, UpdateServerResponse>
     */
    public SyncInvoker<UpdateServerRequest, UpdateServerResponse> updateServerInvoker(UpdateServerRequest request) {
        return new SyncInvoker<UpdateServerRequest, UpdateServerResponse>(request, WorkspaceAppMeta.updateServer,
            hcClient);
    }

    /**
     * 创建服务器组
     *
     * 创建服务器组。
     * &gt; - 服务器组是一组相同配置的服务器集合，服务器组内的服务器使用同一镜像创建，配置相同，运行相同的应用程序。用户在打开云应用时，会根据调度规则选取组内的一台可用服务器进行连接。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateServerGroupRequest 请求对象
     * @return CreateServerGroupResponse
     */
    public CreateServerGroupResponse createServerGroup(CreateServerGroupRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceAppMeta.createServerGroup);
    }

    /**
     * 创建服务器组
     *
     * 创建服务器组。
     * &gt; - 服务器组是一组相同配置的服务器集合，服务器组内的服务器使用同一镜像创建，配置相同，运行相同的应用程序。用户在打开云应用时，会根据调度规则选取组内的一台可用服务器进行连接。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateServerGroupRequest 请求对象
     * @return SyncInvoker<CreateServerGroupRequest, CreateServerGroupResponse>
     */
    public SyncInvoker<CreateServerGroupRequest, CreateServerGroupResponse> createServerGroupInvoker(
        CreateServerGroupRequest request) {
        return new SyncInvoker<CreateServerGroupRequest, CreateServerGroupResponse>(request,
            WorkspaceAppMeta.createServerGroup, hcClient);
    }

    /**
     * 删除服务器组
     *
     * 删除服务器组。
     * - &gt; 删除服务器组之前，需要先删除服务器组内的所有服务器。如果传服务器组已被删除，重复执行删除，则返回成功响应。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteServerGroupsRequest 请求对象
     * @return DeleteServerGroupsResponse
     */
    public DeleteServerGroupsResponse deleteServerGroups(DeleteServerGroupsRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceAppMeta.deleteServerGroups);
    }

    /**
     * 删除服务器组
     *
     * 删除服务器组。
     * - &gt; 删除服务器组之前，需要先删除服务器组内的所有服务器。如果传服务器组已被删除，重复执行删除，则返回成功响应。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteServerGroupsRequest 请求对象
     * @return SyncInvoker<DeleteServerGroupsRequest, DeleteServerGroupsResponse>
     */
    public SyncInvoker<DeleteServerGroupsRequest, DeleteServerGroupsResponse> deleteServerGroupsInvoker(
        DeleteServerGroupsRequest request) {
        return new SyncInvoker<DeleteServerGroupsRequest, DeleteServerGroupsResponse>(request,
            WorkspaceAppMeta.deleteServerGroups, hcClient);
    }

    /**
     * 查询服务器组列表
     *
     * 查询服务器组列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListServerGroupsRequest 请求对象
     * @return ListServerGroupsResponse
     */
    public ListServerGroupsResponse listServerGroups(ListServerGroupsRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceAppMeta.listServerGroups);
    }

    /**
     * 查询服务器组列表
     *
     * 查询服务器组列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListServerGroupsRequest 请求对象
     * @return SyncInvoker<ListServerGroupsRequest, ListServerGroupsResponse>
     */
    public SyncInvoker<ListServerGroupsRequest, ListServerGroupsResponse> listServerGroupsInvoker(
        ListServerGroupsRequest request) {
        return new SyncInvoker<ListServerGroupsRequest, ListServerGroupsResponse>(request,
            WorkspaceAppMeta.listServerGroups, hcClient);
    }

    /**
     * 修改服务器组
     *
     * 修改服务器组。
     * - &gt; 修改服务器组的镜像，系统盘大小，OU信息后，已创建的服务器配置不变，新添加的服务器会使用新的配置创建。修改最大会话数后，用户接入服务器组时，会按照最新的配置进行路由计算。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateServerGroupRequest 请求对象
     * @return UpdateServerGroupResponse
     */
    public UpdateServerGroupResponse updateServerGroup(UpdateServerGroupRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceAppMeta.updateServerGroup);
    }

    /**
     * 修改服务器组
     *
     * 修改服务器组。
     * - &gt; 修改服务器组的镜像，系统盘大小，OU信息后，已创建的服务器配置不变，新添加的服务器会使用新的配置创建。修改最大会话数后，用户接入服务器组时，会按照最新的配置进行路由计算。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateServerGroupRequest 请求对象
     * @return SyncInvoker<UpdateServerGroupRequest, UpdateServerGroupResponse>
     */
    public SyncInvoker<UpdateServerGroupRequest, UpdateServerGroupResponse> updateServerGroupInvoker(
        UpdateServerGroupRequest request) {
        return new SyncInvoker<UpdateServerGroupRequest, UpdateServerGroupResponse>(request,
            WorkspaceAppMeta.updateServerGroup, hcClient);
    }

    /**
     * 查询应用使用记录
     *
     * 查询应用使用记录
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListAppConnectionRequest 请求对象
     * @return ListAppConnectionResponse
     */
    public ListAppConnectionResponse listAppConnection(ListAppConnectionRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceAppMeta.listAppConnection);
    }

    /**
     * 查询应用使用记录
     *
     * 查询应用使用记录
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListAppConnectionRequest 请求对象
     * @return SyncInvoker<ListAppConnectionRequest, ListAppConnectionResponse>
     */
    public SyncInvoker<ListAppConnectionRequest, ListAppConnectionResponse> listAppConnectionInvoker(
        ListAppConnectionRequest request) {
        return new SyncInvoker<ListAppConnectionRequest, ListAppConnectionResponse>(request,
            WorkspaceAppMeta.listAppConnection, hcClient);
    }

    /**
     * 根据用户名查询当前会话
     *
     * 根据用户名查询当前会话
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListSessionByUserNameRequest 请求对象
     * @return ListSessionByUserNameResponse
     */
    public ListSessionByUserNameResponse listSessionByUserName(ListSessionByUserNameRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceAppMeta.listSessionByUserName);
    }

    /**
     * 根据用户名查询当前会话
     *
     * 根据用户名查询当前会话
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListSessionByUserNameRequest 请求对象
     * @return SyncInvoker<ListSessionByUserNameRequest, ListSessionByUserNameResponse>
     */
    public SyncInvoker<ListSessionByUserNameRequest, ListSessionByUserNameResponse> listSessionByUserNameInvoker(
        ListSessionByUserNameRequest request) {
        return new SyncInvoker<ListSessionByUserNameRequest, ListSessionByUserNameResponse>(request,
            WorkspaceAppMeta.listSessionByUserName, hcClient);
    }

    /**
     * 查询用户登录记录
     *
     * 查询用户登录记录
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListUserConnectionRequest 请求对象
     * @return ListUserConnectionResponse
     */
    public ListUserConnectionResponse listUserConnection(ListUserConnectionRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceAppMeta.listUserConnection);
    }

    /**
     * 查询用户登录记录
     *
     * 查询用户登录记录
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListUserConnectionRequest 请求对象
     * @return SyncInvoker<ListUserConnectionRequest, ListUserConnectionResponse>
     */
    public SyncInvoker<ListUserConnectionRequest, ListUserConnectionResponse> listUserConnectionInvoker(
        ListUserConnectionRequest request) {
        return new SyncInvoker<ListUserConnectionRequest, ListUserConnectionResponse>(request,
            WorkspaceAppMeta.listUserConnection, hcClient);
    }

    /**
     * 用户会话注销
     *
     * 用户会话注销
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param LogoffUserSessionRequest 请求对象
     * @return LogoffUserSessionResponse
     */
    public LogoffUserSessionResponse logoffUserSession(LogoffUserSessionRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceAppMeta.logoffUserSession);
    }

    /**
     * 用户会话注销
     *
     * 用户会话注销
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param LogoffUserSessionRequest 请求对象
     * @return SyncInvoker<LogoffUserSessionRequest, LogoffUserSessionResponse>
     */
    public SyncInvoker<LogoffUserSessionRequest, LogoffUserSessionResponse> logoffUserSessionInvoker(
        LogoffUserSessionRequest request) {
        return new SyncInvoker<LogoffUserSessionRequest, LogoffUserSessionResponse>(request,
            WorkspaceAppMeta.logoffUserSession, hcClient);
    }

    /**
     * 查询可用磁盘类型
     *
     * 该接口用于查询可用磁盘类型。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListVolumeTypeRequest 请求对象
     * @return ListVolumeTypeResponse
     */
    public ListVolumeTypeResponse listVolumeType(ListVolumeTypeRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceAppMeta.listVolumeType);
    }

    /**
     * 查询可用磁盘类型
     *
     * 该接口用于查询可用磁盘类型。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListVolumeTypeRequest 请求对象
     * @return SyncInvoker<ListVolumeTypeRequest, ListVolumeTypeResponse>
     */
    public SyncInvoker<ListVolumeTypeRequest, ListVolumeTypeResponse> listVolumeTypeInvoker(
        ListVolumeTypeRequest request) {
        return new SyncInvoker<ListVolumeTypeRequest, ListVolumeTypeResponse>(request, WorkspaceAppMeta.listVolumeType,
            hcClient);
    }

}
