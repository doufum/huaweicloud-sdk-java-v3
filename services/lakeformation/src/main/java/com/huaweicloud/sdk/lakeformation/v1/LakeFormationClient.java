package com.huaweicloud.sdk.lakeformation.v1;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.SyncInvoker;
import com.huaweicloud.sdk.lakeformation.v1.model.AddPartitionsRequest;
import com.huaweicloud.sdk.lakeformation.v1.model.AddPartitionsResponse;
import com.huaweicloud.sdk.lakeformation.v1.model.ApplyForAccessRequest;
import com.huaweicloud.sdk.lakeformation.v1.model.ApplyForAccessResponse;
import com.huaweicloud.sdk.lakeformation.v1.model.AssociatePrincipalsRequest;
import com.huaweicloud.sdk.lakeformation.v1.model.AssociatePrincipalsResponse;
import com.huaweicloud.sdk.lakeformation.v1.model.AssociateRolesRequest;
import com.huaweicloud.sdk.lakeformation.v1.model.AssociateRolesResponse;
import com.huaweicloud.sdk.lakeformation.v1.model.AuthorizeAccessServiceRequest;
import com.huaweicloud.sdk.lakeformation.v1.model.AuthorizeAccessServiceResponse;
import com.huaweicloud.sdk.lakeformation.v1.model.BatchAuthorizeInterfaceRequest;
import com.huaweicloud.sdk.lakeformation.v1.model.BatchAuthorizeInterfaceResponse;
import com.huaweicloud.sdk.lakeformation.v1.model.BatchCancelAuthorizationInterfaceRequest;
import com.huaweicloud.sdk.lakeformation.v1.model.BatchCancelAuthorizationInterfaceResponse;
import com.huaweicloud.sdk.lakeformation.v1.model.BatchCheckPermissionRequest;
import com.huaweicloud.sdk.lakeformation.v1.model.BatchCheckPermissionResponse;
import com.huaweicloud.sdk.lakeformation.v1.model.BatchCreateConstraintRequest;
import com.huaweicloud.sdk.lakeformation.v1.model.BatchCreateConstraintResponse;
import com.huaweicloud.sdk.lakeformation.v1.model.BatchDeletePartitionRequest;
import com.huaweicloud.sdk.lakeformation.v1.model.BatchDeletePartitionResponse;
import com.huaweicloud.sdk.lakeformation.v1.model.BatchDeletePartitionedStatisticsRequest;
import com.huaweicloud.sdk.lakeformation.v1.model.BatchDeletePartitionedStatisticsResponse;
import com.huaweicloud.sdk.lakeformation.v1.model.BatchListPartitionByValuesRequest;
import com.huaweicloud.sdk.lakeformation.v1.model.BatchListPartitionByValuesResponse;
import com.huaweicloud.sdk.lakeformation.v1.model.BatchShowPartitionColumnStatisticsRequest;
import com.huaweicloud.sdk.lakeformation.v1.model.BatchShowPartitionColumnStatisticsResponse;
import com.huaweicloud.sdk.lakeformation.v1.model.BatchUpdateLakeFormationInstanceTagsRequest;
import com.huaweicloud.sdk.lakeformation.v1.model.BatchUpdateLakeFormationInstanceTagsResponse;
import com.huaweicloud.sdk.lakeformation.v1.model.BatchUpdatePartitionRequest;
import com.huaweicloud.sdk.lakeformation.v1.model.BatchUpdatePartitionResponse;
import com.huaweicloud.sdk.lakeformation.v1.model.CountMetaObjRequest;
import com.huaweicloud.sdk.lakeformation.v1.model.CountMetaObjResponse;
import com.huaweicloud.sdk.lakeformation.v1.model.CreateAccessClientRequest;
import com.huaweicloud.sdk.lakeformation.v1.model.CreateAccessClientResponse;
import com.huaweicloud.sdk.lakeformation.v1.model.CreateAgencyRequest;
import com.huaweicloud.sdk.lakeformation.v1.model.CreateAgencyResponse;
import com.huaweicloud.sdk.lakeformation.v1.model.CreateAgreementRequest;
import com.huaweicloud.sdk.lakeformation.v1.model.CreateAgreementResponse;
import com.huaweicloud.sdk.lakeformation.v1.model.CreateCatalogRequest;
import com.huaweicloud.sdk.lakeformation.v1.model.CreateCatalogResponse;
import com.huaweicloud.sdk.lakeformation.v1.model.CreateDatabaseRequest;
import com.huaweicloud.sdk.lakeformation.v1.model.CreateDatabaseResponse;
import com.huaweicloud.sdk.lakeformation.v1.model.CreateFunctionRequest;
import com.huaweicloud.sdk.lakeformation.v1.model.CreateFunctionResponse;
import com.huaweicloud.sdk.lakeformation.v1.model.CreateLakeFormationInstanceRequest;
import com.huaweicloud.sdk.lakeformation.v1.model.CreateLakeFormationInstanceResponse;
import com.huaweicloud.sdk.lakeformation.v1.model.CreateRoleRequest;
import com.huaweicloud.sdk.lakeformation.v1.model.CreateRoleResponse;
import com.huaweicloud.sdk.lakeformation.v1.model.CreateTableRequest;
import com.huaweicloud.sdk.lakeformation.v1.model.CreateTableResponse;
import com.huaweicloud.sdk.lakeformation.v1.model.DeleteAccessClientRequest;
import com.huaweicloud.sdk.lakeformation.v1.model.DeleteAccessClientResponse;
import com.huaweicloud.sdk.lakeformation.v1.model.DeleteAgencyRequest;
import com.huaweicloud.sdk.lakeformation.v1.model.DeleteAgencyResponse;
import com.huaweicloud.sdk.lakeformation.v1.model.DeleteAgreementRequest;
import com.huaweicloud.sdk.lakeformation.v1.model.DeleteAgreementResponse;
import com.huaweicloud.sdk.lakeformation.v1.model.DeleteAllTablesRequest;
import com.huaweicloud.sdk.lakeformation.v1.model.DeleteAllTablesResponse;
import com.huaweicloud.sdk.lakeformation.v1.model.DeleteCatalogRequest;
import com.huaweicloud.sdk.lakeformation.v1.model.DeleteCatalogResponse;
import com.huaweicloud.sdk.lakeformation.v1.model.DeleteConstraintRequest;
import com.huaweicloud.sdk.lakeformation.v1.model.DeleteConstraintResponse;
import com.huaweicloud.sdk.lakeformation.v1.model.DeleteDatabaseRequest;
import com.huaweicloud.sdk.lakeformation.v1.model.DeleteDatabaseResponse;
import com.huaweicloud.sdk.lakeformation.v1.model.DeleteFunctionRequest;
import com.huaweicloud.sdk.lakeformation.v1.model.DeleteFunctionResponse;
import com.huaweicloud.sdk.lakeformation.v1.model.DeleteLakeFormationInstanceRequest;
import com.huaweicloud.sdk.lakeformation.v1.model.DeleteLakeFormationInstanceResponse;
import com.huaweicloud.sdk.lakeformation.v1.model.DeletePartitionColumnStatisticsRequest;
import com.huaweicloud.sdk.lakeformation.v1.model.DeletePartitionColumnStatisticsResponse;
import com.huaweicloud.sdk.lakeformation.v1.model.DeleteRoleRequest;
import com.huaweicloud.sdk.lakeformation.v1.model.DeleteRoleResponse;
import com.huaweicloud.sdk.lakeformation.v1.model.DeleteTableColumnStatisticsRequest;
import com.huaweicloud.sdk.lakeformation.v1.model.DeleteTableColumnStatisticsResponse;
import com.huaweicloud.sdk.lakeformation.v1.model.DeleteTableRequest;
import com.huaweicloud.sdk.lakeformation.v1.model.DeleteTableResponse;
import com.huaweicloud.sdk.lakeformation.v1.model.ListAccessClientInfosRequest;
import com.huaweicloud.sdk.lakeformation.v1.model.ListAccessClientInfosResponse;
import com.huaweicloud.sdk.lakeformation.v1.model.ListAccessInfosRequest;
import com.huaweicloud.sdk.lakeformation.v1.model.ListAccessInfosResponse;
import com.huaweicloud.sdk.lakeformation.v1.model.ListAllFunctionsRequest;
import com.huaweicloud.sdk.lakeformation.v1.model.ListAllFunctionsResponse;
import com.huaweicloud.sdk.lakeformation.v1.model.ListCatalogsRequest;
import com.huaweicloud.sdk.lakeformation.v1.model.ListCatalogsResponse;
import com.huaweicloud.sdk.lakeformation.v1.model.ListConfigsRequest;
import com.huaweicloud.sdk.lakeformation.v1.model.ListConfigsResponse;
import com.huaweicloud.sdk.lakeformation.v1.model.ListConstraintsRequest;
import com.huaweicloud.sdk.lakeformation.v1.model.ListConstraintsResponse;
import com.huaweicloud.sdk.lakeformation.v1.model.ListDatabaseNamesRequest;
import com.huaweicloud.sdk.lakeformation.v1.model.ListDatabaseNamesResponse;
import com.huaweicloud.sdk.lakeformation.v1.model.ListDatabasesRequest;
import com.huaweicloud.sdk.lakeformation.v1.model.ListDatabasesResponse;
import com.huaweicloud.sdk.lakeformation.v1.model.ListFunctionNamesRequest;
import com.huaweicloud.sdk.lakeformation.v1.model.ListFunctionNamesResponse;
import com.huaweicloud.sdk.lakeformation.v1.model.ListFunctionsRequest;
import com.huaweicloud.sdk.lakeformation.v1.model.ListFunctionsResponse;
import com.huaweicloud.sdk.lakeformation.v1.model.ListGroupsForDomainRequest;
import com.huaweicloud.sdk.lakeformation.v1.model.ListGroupsForDomainResponse;
import com.huaweicloud.sdk.lakeformation.v1.model.ListInterfacesRequest;
import com.huaweicloud.sdk.lakeformation.v1.model.ListInterfacesResponse;
import com.huaweicloud.sdk.lakeformation.v1.model.ListLakeFormationInstanceTagsRequest;
import com.huaweicloud.sdk.lakeformation.v1.model.ListLakeFormationInstanceTagsResponse;
import com.huaweicloud.sdk.lakeformation.v1.model.ListLakeFormationInstancesRequest;
import com.huaweicloud.sdk.lakeformation.v1.model.ListLakeFormationInstancesResponse;
import com.huaweicloud.sdk.lakeformation.v1.model.ListObsBucketsRequest;
import com.huaweicloud.sdk.lakeformation.v1.model.ListObsBucketsResponse;
import com.huaweicloud.sdk.lakeformation.v1.model.ListObsObjectRequest;
import com.huaweicloud.sdk.lakeformation.v1.model.ListObsObjectResponse;
import com.huaweicloud.sdk.lakeformation.v1.model.ListPartitionNamesRequest;
import com.huaweicloud.sdk.lakeformation.v1.model.ListPartitionNamesResponse;
import com.huaweicloud.sdk.lakeformation.v1.model.ListPartitionNamesWithoutLimitRequest;
import com.huaweicloud.sdk.lakeformation.v1.model.ListPartitionNamesWithoutLimitResponse;
import com.huaweicloud.sdk.lakeformation.v1.model.ListPartitionsRequest;
import com.huaweicloud.sdk.lakeformation.v1.model.ListPartitionsResponse;
import com.huaweicloud.sdk.lakeformation.v1.model.ListPolicyRequest;
import com.huaweicloud.sdk.lakeformation.v1.model.ListPolicyResponse;
import com.huaweicloud.sdk.lakeformation.v1.model.ListPrincipalsRequest;
import com.huaweicloud.sdk.lakeformation.v1.model.ListPrincipalsResponse;
import com.huaweicloud.sdk.lakeformation.v1.model.ListQuotasRequest;
import com.huaweicloud.sdk.lakeformation.v1.model.ListQuotasResponse;
import com.huaweicloud.sdk.lakeformation.v1.model.ListRoleNamesRequest;
import com.huaweicloud.sdk.lakeformation.v1.model.ListRoleNamesResponse;
import com.huaweicloud.sdk.lakeformation.v1.model.ListRolesRequest;
import com.huaweicloud.sdk.lakeformation.v1.model.ListRolesResponse;
import com.huaweicloud.sdk.lakeformation.v1.model.ListSpecsRequest;
import com.huaweicloud.sdk.lakeformation.v1.model.ListSpecsResponse;
import com.huaweicloud.sdk.lakeformation.v1.model.ListTableColumnStatisticsRequest;
import com.huaweicloud.sdk.lakeformation.v1.model.ListTableColumnStatisticsResponse;
import com.huaweicloud.sdk.lakeformation.v1.model.ListTableMetaRequest;
import com.huaweicloud.sdk.lakeformation.v1.model.ListTableMetaResponse;
import com.huaweicloud.sdk.lakeformation.v1.model.ListTableNamesRequest;
import com.huaweicloud.sdk.lakeformation.v1.model.ListTableNamesResponse;
import com.huaweicloud.sdk.lakeformation.v1.model.ListTablesByNameRequest;
import com.huaweicloud.sdk.lakeformation.v1.model.ListTablesByNameResponse;
import com.huaweicloud.sdk.lakeformation.v1.model.ListTablesRequest;
import com.huaweicloud.sdk.lakeformation.v1.model.ListTablesResponse;
import com.huaweicloud.sdk.lakeformation.v1.model.ListUserRolesRequest;
import com.huaweicloud.sdk.lakeformation.v1.model.ListUserRolesResponse;
import com.huaweicloud.sdk.lakeformation.v1.model.ListUsersRequest;
import com.huaweicloud.sdk.lakeformation.v1.model.ListUsersResponse;
import com.huaweicloud.sdk.lakeformation.v1.model.MoveLakeFormationInstanceOutRecycleBinRequest;
import com.huaweicloud.sdk.lakeformation.v1.model.MoveLakeFormationInstanceOutRecycleBinResponse;
import com.huaweicloud.sdk.lakeformation.v1.model.RevokePrincipalsRequest;
import com.huaweicloud.sdk.lakeformation.v1.model.RevokePrincipalsResponse;
import com.huaweicloud.sdk.lakeformation.v1.model.RevokeRolesRequest;
import com.huaweicloud.sdk.lakeformation.v1.model.RevokeRolesResponse;
import com.huaweicloud.sdk.lakeformation.v1.model.SetPartitionColumnStatisticsRequest;
import com.huaweicloud.sdk.lakeformation.v1.model.SetPartitionColumnStatisticsResponse;
import com.huaweicloud.sdk.lakeformation.v1.model.SetTableColumnStatisticsRequest;
import com.huaweicloud.sdk.lakeformation.v1.model.SetTableColumnStatisticsResponse;
import com.huaweicloud.sdk.lakeformation.v1.model.ShowAccessClientRequest;
import com.huaweicloud.sdk.lakeformation.v1.model.ShowAccessClientResponse;
import com.huaweicloud.sdk.lakeformation.v1.model.ShowAccessServiceRequest;
import com.huaweicloud.sdk.lakeformation.v1.model.ShowAccessServiceResponse;
import com.huaweicloud.sdk.lakeformation.v1.model.ShowAgencyRequest;
import com.huaweicloud.sdk.lakeformation.v1.model.ShowAgencyResponse;
import com.huaweicloud.sdk.lakeformation.v1.model.ShowAgreementRequest;
import com.huaweicloud.sdk.lakeformation.v1.model.ShowAgreementResponse;
import com.huaweicloud.sdk.lakeformation.v1.model.ShowAgreementRuleRequest;
import com.huaweicloud.sdk.lakeformation.v1.model.ShowAgreementRuleResponse;
import com.huaweicloud.sdk.lakeformation.v1.model.ShowCatalogRequest;
import com.huaweicloud.sdk.lakeformation.v1.model.ShowCatalogResponse;
import com.huaweicloud.sdk.lakeformation.v1.model.ShowCredentialRequest;
import com.huaweicloud.sdk.lakeformation.v1.model.ShowCredentialResponse;
import com.huaweicloud.sdk.lakeformation.v1.model.ShowDatabaseRequest;
import com.huaweicloud.sdk.lakeformation.v1.model.ShowDatabaseResponse;
import com.huaweicloud.sdk.lakeformation.v1.model.ShowFunctionRequest;
import com.huaweicloud.sdk.lakeformation.v1.model.ShowFunctionResponse;
import com.huaweicloud.sdk.lakeformation.v1.model.ShowLakeFormationInstanceRequest;
import com.huaweicloud.sdk.lakeformation.v1.model.ShowLakeFormationInstanceResponse;
import com.huaweicloud.sdk.lakeformation.v1.model.ShowRoleRequest;
import com.huaweicloud.sdk.lakeformation.v1.model.ShowRoleResponse;
import com.huaweicloud.sdk.lakeformation.v1.model.ShowSyncPolicyRequest;
import com.huaweicloud.sdk.lakeformation.v1.model.ShowSyncPolicyResponse;
import com.huaweicloud.sdk.lakeformation.v1.model.ShowTableRequest;
import com.huaweicloud.sdk.lakeformation.v1.model.ShowTableResponse;
import com.huaweicloud.sdk.lakeformation.v1.model.UpdateAccessClientRequest;
import com.huaweicloud.sdk.lakeformation.v1.model.UpdateAccessClientResponse;
import com.huaweicloud.sdk.lakeformation.v1.model.UpdateCatalogRequest;
import com.huaweicloud.sdk.lakeformation.v1.model.UpdateCatalogResponse;
import com.huaweicloud.sdk.lakeformation.v1.model.UpdateDatabaseRequest;
import com.huaweicloud.sdk.lakeformation.v1.model.UpdateDatabaseResponse;
import com.huaweicloud.sdk.lakeformation.v1.model.UpdateFunctionRequest;
import com.huaweicloud.sdk.lakeformation.v1.model.UpdateFunctionResponse;
import com.huaweicloud.sdk.lakeformation.v1.model.UpdateLakeFormationInstanceDefaultRequest;
import com.huaweicloud.sdk.lakeformation.v1.model.UpdateLakeFormationInstanceDefaultResponse;
import com.huaweicloud.sdk.lakeformation.v1.model.UpdateLakeFormationInstanceRequest;
import com.huaweicloud.sdk.lakeformation.v1.model.UpdateLakeFormationInstanceResponse;
import com.huaweicloud.sdk.lakeformation.v1.model.UpdateLakeFormationInstanceScaleRequest;
import com.huaweicloud.sdk.lakeformation.v1.model.UpdateLakeFormationInstanceScaleResponse;
import com.huaweicloud.sdk.lakeformation.v1.model.UpdatePrincipalsRequest;
import com.huaweicloud.sdk.lakeformation.v1.model.UpdatePrincipalsResponse;
import com.huaweicloud.sdk.lakeformation.v1.model.UpdateRoleRequest;
import com.huaweicloud.sdk.lakeformation.v1.model.UpdateRoleResponse;
import com.huaweicloud.sdk.lakeformation.v1.model.UpdateRolesRequest;
import com.huaweicloud.sdk.lakeformation.v1.model.UpdateRolesResponse;
import com.huaweicloud.sdk.lakeformation.v1.model.UpdateTableRequest;
import com.huaweicloud.sdk.lakeformation.v1.model.UpdateTableResponse;

public class LakeFormationClient {

    protected HcClient hcClient;

    public LakeFormationClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<LakeFormationClient> newBuilder() {
        ClientBuilder<LakeFormationClient> clientBuilder = new ClientBuilder<>(LakeFormationClient::new);
        return clientBuilder;
    }

    /**
     * 申请接入服务
     *
     * 申请接入服务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ApplyForAccessRequest 请求对象
     * @return ApplyForAccessResponse
     */
    public ApplyForAccessResponse applyForAccess(ApplyForAccessRequest request) {
        return hcClient.syncInvokeHttp(request, LakeFormationMeta.applyForAccess);
    }

    /**
     * 申请接入服务
     *
     * 申请接入服务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ApplyForAccessRequest 请求对象
     * @return SyncInvoker<ApplyForAccessRequest, ApplyForAccessResponse>
     */
    public SyncInvoker<ApplyForAccessRequest, ApplyForAccessResponse> applyForAccessInvoker(
        ApplyForAccessRequest request) {
        return new SyncInvoker<ApplyForAccessRequest, ApplyForAccessResponse>(request, LakeFormationMeta.applyForAccess,
            hcClient);
    }

    /**
     * 批量授权
     *
     * 批量授权接口
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchAuthorizeInterfaceRequest 请求对象
     * @return BatchAuthorizeInterfaceResponse
     */
    public BatchAuthorizeInterfaceResponse batchAuthorizeInterface(BatchAuthorizeInterfaceRequest request) {
        return hcClient.syncInvokeHttp(request, LakeFormationMeta.batchAuthorizeInterface);
    }

    /**
     * 批量授权
     *
     * 批量授权接口
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchAuthorizeInterfaceRequest 请求对象
     * @return SyncInvoker<BatchAuthorizeInterfaceRequest, BatchAuthorizeInterfaceResponse>
     */
    public SyncInvoker<BatchAuthorizeInterfaceRequest, BatchAuthorizeInterfaceResponse> batchAuthorizeInterfaceInvoker(
        BatchAuthorizeInterfaceRequest request) {
        return new SyncInvoker<BatchAuthorizeInterfaceRequest, BatchAuthorizeInterfaceResponse>(request,
            LakeFormationMeta.batchAuthorizeInterface, hcClient);
    }

    /**
     * 取消批量授权
     *
     * 批量取消授权接口
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchCancelAuthorizationInterfaceRequest 请求对象
     * @return BatchCancelAuthorizationInterfaceResponse
     */
    public BatchCancelAuthorizationInterfaceResponse batchCancelAuthorizationInterface(
        BatchCancelAuthorizationInterfaceRequest request) {
        return hcClient.syncInvokeHttp(request, LakeFormationMeta.batchCancelAuthorizationInterface);
    }

    /**
     * 取消批量授权
     *
     * 批量取消授权接口
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchCancelAuthorizationInterfaceRequest 请求对象
     * @return SyncInvoker<BatchCancelAuthorizationInterfaceRequest, BatchCancelAuthorizationInterfaceResponse>
     */
    public SyncInvoker<BatchCancelAuthorizationInterfaceRequest, BatchCancelAuthorizationInterfaceResponse> batchCancelAuthorizationInterfaceInvoker(
        BatchCancelAuthorizationInterfaceRequest request) {
        return new SyncInvoker<BatchCancelAuthorizationInterfaceRequest, BatchCancelAuthorizationInterfaceResponse>(
            request, LakeFormationMeta.batchCancelAuthorizationInterface, hcClient);
    }

    /**
     * 批量鉴权
     *
     * 批量鉴权
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchCheckPermissionRequest 请求对象
     * @return BatchCheckPermissionResponse
     */
    public BatchCheckPermissionResponse batchCheckPermission(BatchCheckPermissionRequest request) {
        return hcClient.syncInvokeHttp(request, LakeFormationMeta.batchCheckPermission);
    }

    /**
     * 批量鉴权
     *
     * 批量鉴权
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchCheckPermissionRequest 请求对象
     * @return SyncInvoker<BatchCheckPermissionRequest, BatchCheckPermissionResponse>
     */
    public SyncInvoker<BatchCheckPermissionRequest, BatchCheckPermissionResponse> batchCheckPermissionInvoker(
        BatchCheckPermissionRequest request) {
        return new SyncInvoker<BatchCheckPermissionRequest, BatchCheckPermissionResponse>(request,
            LakeFormationMeta.batchCheckPermission, hcClient);
    }

    /**
     * 创建服务接入客户端
     *
     * 创建服务接入客户端。
     * 其他限制：
     *   同一个实例下默认最多创建20个接入客户端。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateAccessClientRequest 请求对象
     * @return CreateAccessClientResponse
     */
    public CreateAccessClientResponse createAccessClient(CreateAccessClientRequest request) {
        return hcClient.syncInvokeHttp(request, LakeFormationMeta.createAccessClient);
    }

    /**
     * 创建服务接入客户端
     *
     * 创建服务接入客户端。
     * 其他限制：
     *   同一个实例下默认最多创建20个接入客户端。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateAccessClientRequest 请求对象
     * @return SyncInvoker<CreateAccessClientRequest, CreateAccessClientResponse>
     */
    public SyncInvoker<CreateAccessClientRequest, CreateAccessClientResponse> createAccessClientInvoker(
        CreateAccessClientRequest request) {
        return new SyncInvoker<CreateAccessClientRequest, CreateAccessClientResponse>(request,
            LakeFormationMeta.createAccessClient, hcClient);
    }

    /**
     * 删除服务接入客户端
     *
     * 根据ID删除服务接入客户端
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteAccessClientRequest 请求对象
     * @return DeleteAccessClientResponse
     */
    public DeleteAccessClientResponse deleteAccessClient(DeleteAccessClientRequest request) {
        return hcClient.syncInvokeHttp(request, LakeFormationMeta.deleteAccessClient);
    }

    /**
     * 删除服务接入客户端
     *
     * 根据ID删除服务接入客户端
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteAccessClientRequest 请求对象
     * @return SyncInvoker<DeleteAccessClientRequest, DeleteAccessClientResponse>
     */
    public SyncInvoker<DeleteAccessClientRequest, DeleteAccessClientResponse> deleteAccessClientInvoker(
        DeleteAccessClientRequest request) {
        return new SyncInvoker<DeleteAccessClientRequest, DeleteAccessClientResponse>(request,
            LakeFormationMeta.deleteAccessClient, hcClient);
    }

    /**
     * 获取服务接入客户端信息列表
     *
     * 根据LakeFormation实例获取服务实例相关的接入客户端信息列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListAccessClientInfosRequest 请求对象
     * @return ListAccessClientInfosResponse
     */
    public ListAccessClientInfosResponse listAccessClientInfos(ListAccessClientInfosRequest request) {
        return hcClient.syncInvokeHttp(request, LakeFormationMeta.listAccessClientInfos);
    }

    /**
     * 获取服务接入客户端信息列表
     *
     * 根据LakeFormation实例获取服务实例相关的接入客户端信息列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListAccessClientInfosRequest 请求对象
     * @return SyncInvoker<ListAccessClientInfosRequest, ListAccessClientInfosResponse>
     */
    public SyncInvoker<ListAccessClientInfosRequest, ListAccessClientInfosResponse> listAccessClientInfosInvoker(
        ListAccessClientInfosRequest request) {
        return new SyncInvoker<ListAccessClientInfosRequest, ListAccessClientInfosResponse>(request,
            LakeFormationMeta.listAccessClientInfos, hcClient);
    }

    /**
     * 获取服务接入信息
     *
     * 根据LakeFormation实例获取服务实例相关的接入信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListAccessInfosRequest 请求对象
     * @return ListAccessInfosResponse
     */
    public ListAccessInfosResponse listAccessInfos(ListAccessInfosRequest request) {
        return hcClient.syncInvokeHttp(request, LakeFormationMeta.listAccessInfos);
    }

    /**
     * 获取服务接入信息
     *
     * 根据LakeFormation实例获取服务实例相关的接入信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListAccessInfosRequest 请求对象
     * @return SyncInvoker<ListAccessInfosRequest, ListAccessInfosResponse>
     */
    public SyncInvoker<ListAccessInfosRequest, ListAccessInfosResponse> listAccessInfosInvoker(
        ListAccessInfosRequest request) {
        return new SyncInvoker<ListAccessInfosRequest, ListAccessInfosResponse>(request,
            LakeFormationMeta.listAccessInfos, hcClient);
    }

    /**
     * 查询策略
     *
     * 通过过滤条件查询接口
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListInterfacesRequest 请求对象
     * @return ListInterfacesResponse
     */
    public ListInterfacesResponse listInterfaces(ListInterfacesRequest request) {
        return hcClient.syncInvokeHttp(request, LakeFormationMeta.listInterfaces);
    }

    /**
     * 查询策略
     *
     * 通过过滤条件查询接口
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListInterfacesRequest 请求对象
     * @return SyncInvoker<ListInterfacesRequest, ListInterfacesResponse>
     */
    public SyncInvoker<ListInterfacesRequest, ListInterfacesResponse> listInterfacesInvoker(
        ListInterfacesRequest request) {
        return new SyncInvoker<ListInterfacesRequest, ListInterfacesResponse>(request, LakeFormationMeta.listInterfaces,
            hcClient);
    }

    /**
     * 获取同步权限策略
     *
     * 分页获取同步权限策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListPolicyRequest 请求对象
     * @return ListPolicyResponse
     */
    public ListPolicyResponse listPolicy(ListPolicyRequest request) {
        return hcClient.syncInvokeHttp(request, LakeFormationMeta.listPolicy);
    }

    /**
     * 获取同步权限策略
     *
     * 分页获取同步权限策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListPolicyRequest 请求对象
     * @return SyncInvoker<ListPolicyRequest, ListPolicyResponse>
     */
    public SyncInvoker<ListPolicyRequest, ListPolicyResponse> listPolicyInvoker(ListPolicyRequest request) {
        return new SyncInvoker<ListPolicyRequest, ListPolicyResponse>(request, LakeFormationMeta.listPolicy, hcClient);
    }

    /**
     * 获取服务接入客户端详情
     *
     * 根据ID获取服务接入客户端详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowAccessClientRequest 请求对象
     * @return ShowAccessClientResponse
     */
    public ShowAccessClientResponse showAccessClient(ShowAccessClientRequest request) {
        return hcClient.syncInvokeHttp(request, LakeFormationMeta.showAccessClient);
    }

    /**
     * 获取服务接入客户端详情
     *
     * 根据ID获取服务接入客户端详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowAccessClientRequest 请求对象
     * @return SyncInvoker<ShowAccessClientRequest, ShowAccessClientResponse>
     */
    public SyncInvoker<ShowAccessClientRequest, ShowAccessClientResponse> showAccessClientInvoker(
        ShowAccessClientRequest request) {
        return new SyncInvoker<ShowAccessClientRequest, ShowAccessClientResponse>(request,
            LakeFormationMeta.showAccessClient, hcClient);
    }

    /**
     * 获取同步权限策略
     *
     * 获取同步权限策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowSyncPolicyRequest 请求对象
     * @return ShowSyncPolicyResponse
     */
    public ShowSyncPolicyResponse showSyncPolicy(ShowSyncPolicyRequest request) {
        return hcClient.syncInvokeHttp(request, LakeFormationMeta.showSyncPolicy);
    }

    /**
     * 获取同步权限策略
     *
     * 获取同步权限策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowSyncPolicyRequest 请求对象
     * @return SyncInvoker<ShowSyncPolicyRequest, ShowSyncPolicyResponse>
     */
    public SyncInvoker<ShowSyncPolicyRequest, ShowSyncPolicyResponse> showSyncPolicyInvoker(
        ShowSyncPolicyRequest request) {
        return new SyncInvoker<ShowSyncPolicyRequest, ShowSyncPolicyResponse>(request, LakeFormationMeta.showSyncPolicy,
            hcClient);
    }

    /**
     * 更新服务接入客户端
     *
     * 根据ID更新服务接入客户端
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateAccessClientRequest 请求对象
     * @return UpdateAccessClientResponse
     */
    public UpdateAccessClientResponse updateAccessClient(UpdateAccessClientRequest request) {
        return hcClient.syncInvokeHttp(request, LakeFormationMeta.updateAccessClient);
    }

    /**
     * 更新服务接入客户端
     *
     * 根据ID更新服务接入客户端
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateAccessClientRequest 请求对象
     * @return SyncInvoker<UpdateAccessClientRequest, UpdateAccessClientResponse>
     */
    public SyncInvoker<UpdateAccessClientRequest, UpdateAccessClientResponse> updateAccessClientInvoker(
        UpdateAccessClientRequest request) {
        return new SyncInvoker<UpdateAccessClientRequest, UpdateAccessClientResponse>(request,
            LakeFormationMeta.updateAccessClient, hcClient);
    }

    /**
     * 创建委托
     *
     * 创建委托
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateAgencyRequest 请求对象
     * @return CreateAgencyResponse
     */
    public CreateAgencyResponse createAgency(CreateAgencyRequest request) {
        return hcClient.syncInvokeHttp(request, LakeFormationMeta.createAgency);
    }

    /**
     * 创建委托
     *
     * 创建委托
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateAgencyRequest 请求对象
     * @return SyncInvoker<CreateAgencyRequest, CreateAgencyResponse>
     */
    public SyncInvoker<CreateAgencyRequest, CreateAgencyResponse> createAgencyInvoker(CreateAgencyRequest request) {
        return new SyncInvoker<CreateAgencyRequest, CreateAgencyResponse>(request, LakeFormationMeta.createAgency,
            hcClient);
    }

    /**
     * 删除委托
     *
     * 删除委托
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteAgencyRequest 请求对象
     * @return DeleteAgencyResponse
     */
    public DeleteAgencyResponse deleteAgency(DeleteAgencyRequest request) {
        return hcClient.syncInvokeHttp(request, LakeFormationMeta.deleteAgency);
    }

    /**
     * 删除委托
     *
     * 删除委托
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteAgencyRequest 请求对象
     * @return SyncInvoker<DeleteAgencyRequest, DeleteAgencyResponse>
     */
    public SyncInvoker<DeleteAgencyRequest, DeleteAgencyResponse> deleteAgencyInvoker(DeleteAgencyRequest request) {
        return new SyncInvoker<DeleteAgencyRequest, DeleteAgencyResponse>(request, LakeFormationMeta.deleteAgency,
            hcClient);
    }

    /**
     * 委托查询
     *
     * 委托查询
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowAgencyRequest 请求对象
     * @return ShowAgencyResponse
     */
    public ShowAgencyResponse showAgency(ShowAgencyRequest request) {
        return hcClient.syncInvokeHttp(request, LakeFormationMeta.showAgency);
    }

    /**
     * 委托查询
     *
     * 委托查询
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowAgencyRequest 请求对象
     * @return SyncInvoker<ShowAgencyRequest, ShowAgencyResponse>
     */
    public SyncInvoker<ShowAgencyRequest, ShowAgencyResponse> showAgencyInvoker(ShowAgencyRequest request) {
        return new SyncInvoker<ShowAgencyRequest, ShowAgencyResponse>(request, LakeFormationMeta.showAgency, hcClient);
    }

    /**
     * 创建catalog
     *
     * 创建catalog，会在catalog下创建默认数据库，默认数据库名称为：default
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateCatalogRequest 请求对象
     * @return CreateCatalogResponse
     */
    public CreateCatalogResponse createCatalog(CreateCatalogRequest request) {
        return hcClient.syncInvokeHttp(request, LakeFormationMeta.createCatalog);
    }

    /**
     * 创建catalog
     *
     * 创建catalog，会在catalog下创建默认数据库，默认数据库名称为：default
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateCatalogRequest 请求对象
     * @return SyncInvoker<CreateCatalogRequest, CreateCatalogResponse>
     */
    public SyncInvoker<CreateCatalogRequest, CreateCatalogResponse> createCatalogInvoker(CreateCatalogRequest request) {
        return new SyncInvoker<CreateCatalogRequest, CreateCatalogResponse>(request, LakeFormationMeta.createCatalog,
            hcClient);
    }

    /**
     * 删除catalog对象
     *
     * 删除空的catalog对象。
     * 删除前需要保证catalog下只有默认的数据库，且默认数据库下没有表对象，否则删除失败。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteCatalogRequest 请求对象
     * @return DeleteCatalogResponse
     */
    public DeleteCatalogResponse deleteCatalog(DeleteCatalogRequest request) {
        return hcClient.syncInvokeHttp(request, LakeFormationMeta.deleteCatalog);
    }

    /**
     * 删除catalog对象
     *
     * 删除空的catalog对象。
     * 删除前需要保证catalog下只有默认的数据库，且默认数据库下没有表对象，否则删除失败。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteCatalogRequest 请求对象
     * @return SyncInvoker<DeleteCatalogRequest, DeleteCatalogResponse>
     */
    public SyncInvoker<DeleteCatalogRequest, DeleteCatalogResponse> deleteCatalogInvoker(DeleteCatalogRequest request) {
        return new SyncInvoker<DeleteCatalogRequest, DeleteCatalogResponse>(request, LakeFormationMeta.deleteCatalog,
            hcClient);
    }

    /**
     * 列举catalog信息
     *
     * 根据catalog名字的通配符列举catalog的详细信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListCatalogsRequest 请求对象
     * @return ListCatalogsResponse
     */
    public ListCatalogsResponse listCatalogs(ListCatalogsRequest request) {
        return hcClient.syncInvokeHttp(request, LakeFormationMeta.listCatalogs);
    }

    /**
     * 列举catalog信息
     *
     * 根据catalog名字的通配符列举catalog的详细信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListCatalogsRequest 请求对象
     * @return SyncInvoker<ListCatalogsRequest, ListCatalogsResponse>
     */
    public SyncInvoker<ListCatalogsRequest, ListCatalogsResponse> listCatalogsInvoker(ListCatalogsRequest request) {
        return new SyncInvoker<ListCatalogsRequest, ListCatalogsResponse>(request, LakeFormationMeta.listCatalogs,
            hcClient);
    }

    /**
     * 获取catalog信息
     *
     * 获取catalog信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowCatalogRequest 请求对象
     * @return ShowCatalogResponse
     */
    public ShowCatalogResponse showCatalog(ShowCatalogRequest request) {
        return hcClient.syncInvokeHttp(request, LakeFormationMeta.showCatalog);
    }

    /**
     * 获取catalog信息
     *
     * 获取catalog信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowCatalogRequest 请求对象
     * @return SyncInvoker<ShowCatalogRequest, ShowCatalogResponse>
     */
    public SyncInvoker<ShowCatalogRequest, ShowCatalogResponse> showCatalogInvoker(ShowCatalogRequest request) {
        return new SyncInvoker<ShowCatalogRequest, ShowCatalogResponse>(request, LakeFormationMeta.showCatalog,
            hcClient);
    }

    /**
     * 修改catalog信息
     *
     * 修改catalog信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateCatalogRequest 请求对象
     * @return UpdateCatalogResponse
     */
    public UpdateCatalogResponse updateCatalog(UpdateCatalogRequest request) {
        return hcClient.syncInvokeHttp(request, LakeFormationMeta.updateCatalog);
    }

    /**
     * 修改catalog信息
     *
     * 修改catalog信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateCatalogRequest 请求对象
     * @return SyncInvoker<UpdateCatalogRequest, UpdateCatalogResponse>
     */
    public SyncInvoker<UpdateCatalogRequest, UpdateCatalogResponse> updateCatalogInvoker(UpdateCatalogRequest request) {
        return new SyncInvoker<UpdateCatalogRequest, UpdateCatalogResponse>(request, LakeFormationMeta.updateCatalog,
            hcClient);
    }

    /**
     * 获取所有用户可见的租户面配置
     *
     * 获取所有用户可见的租户面配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListConfigsRequest 请求对象
     * @return ListConfigsResponse
     */
    public ListConfigsResponse listConfigs(ListConfigsRequest request) {
        return hcClient.syncInvokeHttp(request, LakeFormationMeta.listConfigs);
    }

    /**
     * 获取所有用户可见的租户面配置
     *
     * 获取所有用户可见的租户面配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListConfigsRequest 请求对象
     * @return SyncInvoker<ListConfigsRequest, ListConfigsResponse>
     */
    public SyncInvoker<ListConfigsRequest, ListConfigsResponse> listConfigsInvoker(ListConfigsRequest request) {
        return new SyncInvoker<ListConfigsRequest, ListConfigsResponse>(request, LakeFormationMeta.listConfigs,
            hcClient);
    }

    /**
     * 获取临时密钥和securityToken
     *
     * 获取临时密钥和securityToken，失效时间大于等于1小时，请在1小时内更新
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowCredentialRequest 请求对象
     * @return ShowCredentialResponse
     */
    public ShowCredentialResponse showCredential(ShowCredentialRequest request) {
        return hcClient.syncInvokeHttp(request, LakeFormationMeta.showCredential);
    }

    /**
     * 获取临时密钥和securityToken
     *
     * 获取临时密钥和securityToken，失效时间大于等于1小时，请在1小时内更新
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowCredentialRequest 请求对象
     * @return SyncInvoker<ShowCredentialRequest, ShowCredentialResponse>
     */
    public SyncInvoker<ShowCredentialRequest, ShowCredentialResponse> showCredentialInvoker(
        ShowCredentialRequest request) {
        return new SyncInvoker<ShowCredentialRequest, ShowCredentialResponse>(request, LakeFormationMeta.showCredential,
            hcClient);
    }

    /**
     * 创建数据库
     *
     * 创建数据库
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateDatabaseRequest 请求对象
     * @return CreateDatabaseResponse
     */
    public CreateDatabaseResponse createDatabase(CreateDatabaseRequest request) {
        return hcClient.syncInvokeHttp(request, LakeFormationMeta.createDatabase);
    }

    /**
     * 创建数据库
     *
     * 创建数据库
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateDatabaseRequest 请求对象
     * @return SyncInvoker<CreateDatabaseRequest, CreateDatabaseResponse>
     */
    public SyncInvoker<CreateDatabaseRequest, CreateDatabaseResponse> createDatabaseInvoker(
        CreateDatabaseRequest request) {
        return new SyncInvoker<CreateDatabaseRequest, CreateDatabaseResponse>(request, LakeFormationMeta.createDatabase,
            hcClient);
    }

    /**
     * 删除数据库
     *
     * 删除指定数据库，catalog的默认数据库不允许删除。
     * cascade: 指定为true时，删除数据库下的表；指定为false时，只能删除空的数据库
     * delete_data: 指定为true时，级联删除会将表的数据放入回收站；指定为false时，不删除表数据
     * 删除数据库后不支持恢复数据库下的事务表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteDatabaseRequest 请求对象
     * @return DeleteDatabaseResponse
     */
    public DeleteDatabaseResponse deleteDatabase(DeleteDatabaseRequest request) {
        return hcClient.syncInvokeHttp(request, LakeFormationMeta.deleteDatabase);
    }

    /**
     * 删除数据库
     *
     * 删除指定数据库，catalog的默认数据库不允许删除。
     * cascade: 指定为true时，删除数据库下的表；指定为false时，只能删除空的数据库
     * delete_data: 指定为true时，级联删除会将表的数据放入回收站；指定为false时，不删除表数据
     * 删除数据库后不支持恢复数据库下的事务表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteDatabaseRequest 请求对象
     * @return SyncInvoker<DeleteDatabaseRequest, DeleteDatabaseResponse>
     */
    public SyncInvoker<DeleteDatabaseRequest, DeleteDatabaseResponse> deleteDatabaseInvoker(
        DeleteDatabaseRequest request) {
        return new SyncInvoker<DeleteDatabaseRequest, DeleteDatabaseResponse>(request, LakeFormationMeta.deleteDatabase,
            hcClient);
    }

    /**
     * 列举数据库名称信息
     *
     * 列举数据库名称信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListDatabaseNamesRequest 请求对象
     * @return ListDatabaseNamesResponse
     */
    public ListDatabaseNamesResponse listDatabaseNames(ListDatabaseNamesRequest request) {
        return hcClient.syncInvokeHttp(request, LakeFormationMeta.listDatabaseNames);
    }

    /**
     * 列举数据库名称信息
     *
     * 列举数据库名称信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListDatabaseNamesRequest 请求对象
     * @return SyncInvoker<ListDatabaseNamesRequest, ListDatabaseNamesResponse>
     */
    public SyncInvoker<ListDatabaseNamesRequest, ListDatabaseNamesResponse> listDatabaseNamesInvoker(
        ListDatabaseNamesRequest request) {
        return new SyncInvoker<ListDatabaseNamesRequest, ListDatabaseNamesResponse>(request,
            LakeFormationMeta.listDatabaseNames, hcClient);
    }

    /**
     * 列举数据库信息
     *
     * 列举数据库信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListDatabasesRequest 请求对象
     * @return ListDatabasesResponse
     */
    public ListDatabasesResponse listDatabases(ListDatabasesRequest request) {
        return hcClient.syncInvokeHttp(request, LakeFormationMeta.listDatabases);
    }

    /**
     * 列举数据库信息
     *
     * 列举数据库信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListDatabasesRequest 请求对象
     * @return SyncInvoker<ListDatabasesRequest, ListDatabasesResponse>
     */
    public SyncInvoker<ListDatabasesRequest, ListDatabasesResponse> listDatabasesInvoker(ListDatabasesRequest request) {
        return new SyncInvoker<ListDatabasesRequest, ListDatabasesResponse>(request, LakeFormationMeta.listDatabases,
            hcClient);
    }

    /**
     * 获取数据库
     *
     * 获取数据库
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowDatabaseRequest 请求对象
     * @return ShowDatabaseResponse
     */
    public ShowDatabaseResponse showDatabase(ShowDatabaseRequest request) {
        return hcClient.syncInvokeHttp(request, LakeFormationMeta.showDatabase);
    }

    /**
     * 获取数据库
     *
     * 获取数据库
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowDatabaseRequest 请求对象
     * @return SyncInvoker<ShowDatabaseRequest, ShowDatabaseResponse>
     */
    public SyncInvoker<ShowDatabaseRequest, ShowDatabaseResponse> showDatabaseInvoker(ShowDatabaseRequest request) {
        return new SyncInvoker<ShowDatabaseRequest, ShowDatabaseResponse>(request, LakeFormationMeta.showDatabase,
            hcClient);
    }

    /**
     * 修改数据库属性
     *
     * 修改数据库属性
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateDatabaseRequest 请求对象
     * @return UpdateDatabaseResponse
     */
    public UpdateDatabaseResponse updateDatabase(UpdateDatabaseRequest request) {
        return hcClient.syncInvokeHttp(request, LakeFormationMeta.updateDatabase);
    }

    /**
     * 修改数据库属性
     *
     * 修改数据库属性
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateDatabaseRequest 请求对象
     * @return SyncInvoker<UpdateDatabaseRequest, UpdateDatabaseResponse>
     */
    public SyncInvoker<UpdateDatabaseRequest, UpdateDatabaseResponse> updateDatabaseInvoker(
        UpdateDatabaseRequest request) {
        return new SyncInvoker<UpdateDatabaseRequest, UpdateDatabaseResponse>(request, LakeFormationMeta.updateDatabase,
            hcClient);
    }

    /**
     * 创建函数
     *
     * 创建函数
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateFunctionRequest 请求对象
     * @return CreateFunctionResponse
     */
    public CreateFunctionResponse createFunction(CreateFunctionRequest request) {
        return hcClient.syncInvokeHttp(request, LakeFormationMeta.createFunction);
    }

    /**
     * 创建函数
     *
     * 创建函数
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateFunctionRequest 请求对象
     * @return SyncInvoker<CreateFunctionRequest, CreateFunctionResponse>
     */
    public SyncInvoker<CreateFunctionRequest, CreateFunctionResponse> createFunctionInvoker(
        CreateFunctionRequest request) {
        return new SyncInvoker<CreateFunctionRequest, CreateFunctionResponse>(request, LakeFormationMeta.createFunction,
            hcClient);
    }

    /**
     * 删除函数
     *
     * 删除函数
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteFunctionRequest 请求对象
     * @return DeleteFunctionResponse
     */
    public DeleteFunctionResponse deleteFunction(DeleteFunctionRequest request) {
        return hcClient.syncInvokeHttp(request, LakeFormationMeta.deleteFunction);
    }

    /**
     * 删除函数
     *
     * 删除函数
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteFunctionRequest 请求对象
     * @return SyncInvoker<DeleteFunctionRequest, DeleteFunctionResponse>
     */
    public SyncInvoker<DeleteFunctionRequest, DeleteFunctionResponse> deleteFunctionInvoker(
        DeleteFunctionRequest request) {
        return new SyncInvoker<DeleteFunctionRequest, DeleteFunctionResponse>(request, LakeFormationMeta.deleteFunction,
            hcClient);
    }

    /**
     * 列举catalog下所有的函数
     *
     * 获取catalog下所有的函数
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListAllFunctionsRequest 请求对象
     * @return ListAllFunctionsResponse
     */
    public ListAllFunctionsResponse listAllFunctions(ListAllFunctionsRequest request) {
        return hcClient.syncInvokeHttp(request, LakeFormationMeta.listAllFunctions);
    }

    /**
     * 列举catalog下所有的函数
     *
     * 获取catalog下所有的函数
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListAllFunctionsRequest 请求对象
     * @return SyncInvoker<ListAllFunctionsRequest, ListAllFunctionsResponse>
     */
    public SyncInvoker<ListAllFunctionsRequest, ListAllFunctionsResponse> listAllFunctionsInvoker(
        ListAllFunctionsRequest request) {
        return new SyncInvoker<ListAllFunctionsRequest, ListAllFunctionsResponse>(request,
            LakeFormationMeta.listAllFunctions, hcClient);
    }

    /**
     * 列举库下所有函数名称
     *
     * 查询数据库下的所有函数名称列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListFunctionNamesRequest 请求对象
     * @return ListFunctionNamesResponse
     */
    public ListFunctionNamesResponse listFunctionNames(ListFunctionNamesRequest request) {
        return hcClient.syncInvokeHttp(request, LakeFormationMeta.listFunctionNames);
    }

    /**
     * 列举库下所有函数名称
     *
     * 查询数据库下的所有函数名称列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListFunctionNamesRequest 请求对象
     * @return SyncInvoker<ListFunctionNamesRequest, ListFunctionNamesResponse>
     */
    public SyncInvoker<ListFunctionNamesRequest, ListFunctionNamesResponse> listFunctionNamesInvoker(
        ListFunctionNamesRequest request) {
        return new SyncInvoker<ListFunctionNamesRequest, ListFunctionNamesResponse>(request,
            LakeFormationMeta.listFunctionNames, hcClient);
    }

    /**
     * 列举函数
     *
     * 列举函数
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListFunctionsRequest 请求对象
     * @return ListFunctionsResponse
     */
    public ListFunctionsResponse listFunctions(ListFunctionsRequest request) {
        return hcClient.syncInvokeHttp(request, LakeFormationMeta.listFunctions);
    }

    /**
     * 列举函数
     *
     * 列举函数
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListFunctionsRequest 请求对象
     * @return SyncInvoker<ListFunctionsRequest, ListFunctionsResponse>
     */
    public SyncInvoker<ListFunctionsRequest, ListFunctionsResponse> listFunctionsInvoker(ListFunctionsRequest request) {
        return new SyncInvoker<ListFunctionsRequest, ListFunctionsResponse>(request, LakeFormationMeta.listFunctions,
            hcClient);
    }

    /**
     * 查询函数
     *
     * 根据函数名称查询函数信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowFunctionRequest 请求对象
     * @return ShowFunctionResponse
     */
    public ShowFunctionResponse showFunction(ShowFunctionRequest request) {
        return hcClient.syncInvokeHttp(request, LakeFormationMeta.showFunction);
    }

    /**
     * 查询函数
     *
     * 根据函数名称查询函数信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowFunctionRequest 请求对象
     * @return SyncInvoker<ShowFunctionRequest, ShowFunctionResponse>
     */
    public SyncInvoker<ShowFunctionRequest, ShowFunctionResponse> showFunctionInvoker(ShowFunctionRequest request) {
        return new SyncInvoker<ShowFunctionRequest, ShowFunctionResponse>(request, LakeFormationMeta.showFunction,
            hcClient);
    }

    /**
     * 修改函数属性
     *
     * 修改函数属性
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateFunctionRequest 请求对象
     * @return UpdateFunctionResponse
     */
    public UpdateFunctionResponse updateFunction(UpdateFunctionRequest request) {
        return hcClient.syncInvokeHttp(request, LakeFormationMeta.updateFunction);
    }

    /**
     * 修改函数属性
     *
     * 修改函数属性
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateFunctionRequest 请求对象
     * @return SyncInvoker<UpdateFunctionRequest, UpdateFunctionResponse>
     */
    public SyncInvoker<UpdateFunctionRequest, UpdateFunctionResponse> updateFunctionInvoker(
        UpdateFunctionRequest request) {
        return new SyncInvoker<UpdateFunctionRequest, UpdateFunctionResponse>(request, LakeFormationMeta.updateFunction,
            hcClient);
    }

    /**
     * 接入服务授权
     *
     * 接入服务授权
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param AuthorizeAccessServiceRequest 请求对象
     * @return AuthorizeAccessServiceResponse
     */
    public AuthorizeAccessServiceResponse authorizeAccessService(AuthorizeAccessServiceRequest request) {
        return hcClient.syncInvokeHttp(request, LakeFormationMeta.authorizeAccessService);
    }

    /**
     * 接入服务授权
     *
     * 接入服务授权
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param AuthorizeAccessServiceRequest 请求对象
     * @return SyncInvoker<AuthorizeAccessServiceRequest, AuthorizeAccessServiceResponse>
     */
    public SyncInvoker<AuthorizeAccessServiceRequest, AuthorizeAccessServiceResponse> authorizeAccessServiceInvoker(
        AuthorizeAccessServiceRequest request) {
        return new SyncInvoker<AuthorizeAccessServiceRequest, AuthorizeAccessServiceResponse>(request,
            LakeFormationMeta.authorizeAccessService, hcClient);
    }

    /**
     * 注册租户协议
     *
     * 用户授权并委托
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateAgreementRequest 请求对象
     * @return CreateAgreementResponse
     */
    public CreateAgreementResponse createAgreement(CreateAgreementRequest request) {
        return hcClient.syncInvokeHttp(request, LakeFormationMeta.createAgreement);
    }

    /**
     * 注册租户协议
     *
     * 用户授权并委托
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateAgreementRequest 请求对象
     * @return SyncInvoker<CreateAgreementRequest, CreateAgreementResponse>
     */
    public SyncInvoker<CreateAgreementRequest, CreateAgreementResponse> createAgreementInvoker(
        CreateAgreementRequest request) {
        return new SyncInvoker<CreateAgreementRequest, CreateAgreementResponse>(request,
            LakeFormationMeta.createAgreement, hcClient);
    }

    /**
     * 删除租户协议
     *
     * 用户取消授权，同时有权限用户删除委托
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteAgreementRequest 请求对象
     * @return DeleteAgreementResponse
     */
    public DeleteAgreementResponse deleteAgreement(DeleteAgreementRequest request) {
        return hcClient.syncInvokeHttp(request, LakeFormationMeta.deleteAgreement);
    }

    /**
     * 删除租户协议
     *
     * 用户取消授权，同时有权限用户删除委托
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteAgreementRequest 请求对象
     * @return SyncInvoker<DeleteAgreementRequest, DeleteAgreementResponse>
     */
    public SyncInvoker<DeleteAgreementRequest, DeleteAgreementResponse> deleteAgreementInvoker(
        DeleteAgreementRequest request) {
        return new SyncInvoker<DeleteAgreementRequest, DeleteAgreementResponse>(request,
            LakeFormationMeta.deleteAgreement, hcClient);
    }

    /**
     * 查询租户当前的接入服务授权
     *
     * 查询租户当前的接入服务授权
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowAccessServiceRequest 请求对象
     * @return ShowAccessServiceResponse
     */
    public ShowAccessServiceResponse showAccessService(ShowAccessServiceRequest request) {
        return hcClient.syncInvokeHttp(request, LakeFormationMeta.showAccessService);
    }

    /**
     * 查询租户当前的接入服务授权
     *
     * 查询租户当前的接入服务授权
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowAccessServiceRequest 请求对象
     * @return SyncInvoker<ShowAccessServiceRequest, ShowAccessServiceResponse>
     */
    public SyncInvoker<ShowAccessServiceRequest, ShowAccessServiceResponse> showAccessServiceInvoker(
        ShowAccessServiceRequest request) {
        return new SyncInvoker<ShowAccessServiceRequest, ShowAccessServiceResponse>(request,
            LakeFormationMeta.showAccessService, hcClient);
    }

    /**
     * 查询租户是否注册协议
     *
     * 查询租户当前协议和委托信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowAgreementRequest 请求对象
     * @return ShowAgreementResponse
     */
    public ShowAgreementResponse showAgreement(ShowAgreementRequest request) {
        return hcClient.syncInvokeHttp(request, LakeFormationMeta.showAgreement);
    }

    /**
     * 查询租户是否注册协议
     *
     * 查询租户当前协议和委托信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowAgreementRequest 请求对象
     * @return SyncInvoker<ShowAgreementRequest, ShowAgreementResponse>
     */
    public SyncInvoker<ShowAgreementRequest, ShowAgreementResponse> showAgreementInvoker(ShowAgreementRequest request) {
        return new SyncInvoker<ShowAgreementRequest, ShowAgreementResponse>(request, LakeFormationMeta.showAgreement,
            hcClient);
    }

    /**
     * 查询当前系统协议
     *
     * 查询当前系统协议
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowAgreementRuleRequest 请求对象
     * @return ShowAgreementRuleResponse
     */
    public ShowAgreementRuleResponse showAgreementRule(ShowAgreementRuleRequest request) {
        return hcClient.syncInvokeHttp(request, LakeFormationMeta.showAgreementRule);
    }

    /**
     * 查询当前系统协议
     *
     * 查询当前系统协议
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowAgreementRuleRequest 请求对象
     * @return SyncInvoker<ShowAgreementRuleRequest, ShowAgreementRuleResponse>
     */
    public SyncInvoker<ShowAgreementRuleRequest, ShowAgreementRuleResponse> showAgreementRuleInvoker(
        ShowAgreementRuleRequest request) {
        return new SyncInvoker<ShowAgreementRuleRequest, ShowAgreementRuleResponse>(request,
            LakeFormationMeta.showAgreementRule, hcClient);
    }

    /**
     * 元数据数量统计
     *
     * 元数据数量统计接口
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CountMetaObjRequest 请求对象
     * @return CountMetaObjResponse
     */
    public CountMetaObjResponse countMetaObj(CountMetaObjRequest request) {
        return hcClient.syncInvokeHttp(request, LakeFormationMeta.countMetaObj);
    }

    /**
     * 元数据数量统计
     *
     * 元数据数量统计接口
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CountMetaObjRequest 请求对象
     * @return SyncInvoker<CountMetaObjRequest, CountMetaObjResponse>
     */
    public SyncInvoker<CountMetaObjRequest, CountMetaObjResponse> countMetaObjInvoker(CountMetaObjRequest request) {
        return new SyncInvoker<CountMetaObjRequest, CountMetaObjResponse>(request, LakeFormationMeta.countMetaObj,
            hcClient);
    }

    /**
     * 创建实例
     *
     * 创建一个LakeFormation实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateLakeFormationInstanceRequest 请求对象
     * @return CreateLakeFormationInstanceResponse
     */
    public CreateLakeFormationInstanceResponse createLakeFormationInstance(CreateLakeFormationInstanceRequest request) {
        return hcClient.syncInvokeHttp(request, LakeFormationMeta.createLakeFormationInstance);
    }

    /**
     * 创建实例
     *
     * 创建一个LakeFormation实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateLakeFormationInstanceRequest 请求对象
     * @return SyncInvoker<CreateLakeFormationInstanceRequest, CreateLakeFormationInstanceResponse>
     */
    public SyncInvoker<CreateLakeFormationInstanceRequest, CreateLakeFormationInstanceResponse> createLakeFormationInstanceInvoker(
        CreateLakeFormationInstanceRequest request) {
        return new SyncInvoker<CreateLakeFormationInstanceRequest, CreateLakeFormationInstanceResponse>(request,
            LakeFormationMeta.createLakeFormationInstance, hcClient);
    }

    /**
     * 删除实例
     *
     * 根据实例Id删除LakeFormation实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteLakeFormationInstanceRequest 请求对象
     * @return DeleteLakeFormationInstanceResponse
     */
    public DeleteLakeFormationInstanceResponse deleteLakeFormationInstance(DeleteLakeFormationInstanceRequest request) {
        return hcClient.syncInvokeHttp(request, LakeFormationMeta.deleteLakeFormationInstance);
    }

    /**
     * 删除实例
     *
     * 根据实例Id删除LakeFormation实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteLakeFormationInstanceRequest 请求对象
     * @return SyncInvoker<DeleteLakeFormationInstanceRequest, DeleteLakeFormationInstanceResponse>
     */
    public SyncInvoker<DeleteLakeFormationInstanceRequest, DeleteLakeFormationInstanceResponse> deleteLakeFormationInstanceInvoker(
        DeleteLakeFormationInstanceRequest request) {
        return new SyncInvoker<DeleteLakeFormationInstanceRequest, DeleteLakeFormationInstanceResponse>(request,
            LakeFormationMeta.deleteLakeFormationInstance, hcClient);
    }

    /**
     * 查询实例列表
     *
     * 查询用户创建的实例列表信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListLakeFormationInstancesRequest 请求对象
     * @return ListLakeFormationInstancesResponse
     */
    public ListLakeFormationInstancesResponse listLakeFormationInstances(ListLakeFormationInstancesRequest request) {
        return hcClient.syncInvokeHttp(request, LakeFormationMeta.listLakeFormationInstances);
    }

    /**
     * 查询实例列表
     *
     * 查询用户创建的实例列表信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListLakeFormationInstancesRequest 请求对象
     * @return SyncInvoker<ListLakeFormationInstancesRequest, ListLakeFormationInstancesResponse>
     */
    public SyncInvoker<ListLakeFormationInstancesRequest, ListLakeFormationInstancesResponse> listLakeFormationInstancesInvoker(
        ListLakeFormationInstancesRequest request) {
        return new SyncInvoker<ListLakeFormationInstancesRequest, ListLakeFormationInstancesResponse>(request,
            LakeFormationMeta.listLakeFormationInstances, hcClient);
    }

    /**
     * 恢复实例
     *
     * 从回收站恢复LakeFormation实例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param MoveLakeFormationInstanceOutRecycleBinRequest 请求对象
     * @return MoveLakeFormationInstanceOutRecycleBinResponse
     */
    public MoveLakeFormationInstanceOutRecycleBinResponse moveLakeFormationInstanceOutRecycleBin(
        MoveLakeFormationInstanceOutRecycleBinRequest request) {
        return hcClient.syncInvokeHttp(request, LakeFormationMeta.moveLakeFormationInstanceOutRecycleBin);
    }

    /**
     * 恢复实例
     *
     * 从回收站恢复LakeFormation实例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param MoveLakeFormationInstanceOutRecycleBinRequest 请求对象
     * @return SyncInvoker<MoveLakeFormationInstanceOutRecycleBinRequest, MoveLakeFormationInstanceOutRecycleBinResponse>
     */
    public SyncInvoker<MoveLakeFormationInstanceOutRecycleBinRequest, MoveLakeFormationInstanceOutRecycleBinResponse> moveLakeFormationInstanceOutRecycleBinInvoker(
        MoveLakeFormationInstanceOutRecycleBinRequest request) {
        return new SyncInvoker<MoveLakeFormationInstanceOutRecycleBinRequest, MoveLakeFormationInstanceOutRecycleBinResponse>(
            request, LakeFormationMeta.moveLakeFormationInstanceOutRecycleBin, hcClient);
    }

    /**
     * 查询实例详情
     *
     * 使用实例Id查询LakeFormation实例详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowLakeFormationInstanceRequest 请求对象
     * @return ShowLakeFormationInstanceResponse
     */
    public ShowLakeFormationInstanceResponse showLakeFormationInstance(ShowLakeFormationInstanceRequest request) {
        return hcClient.syncInvokeHttp(request, LakeFormationMeta.showLakeFormationInstance);
    }

    /**
     * 查询实例详情
     *
     * 使用实例Id查询LakeFormation实例详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowLakeFormationInstanceRequest 请求对象
     * @return SyncInvoker<ShowLakeFormationInstanceRequest, ShowLakeFormationInstanceResponse>
     */
    public SyncInvoker<ShowLakeFormationInstanceRequest, ShowLakeFormationInstanceResponse> showLakeFormationInstanceInvoker(
        ShowLakeFormationInstanceRequest request) {
        return new SyncInvoker<ShowLakeFormationInstanceRequest, ShowLakeFormationInstanceResponse>(request,
            LakeFormationMeta.showLakeFormationInstance, hcClient);
    }

    /**
     * 更新实例
     *
     * 修改LakeFormation实例信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateLakeFormationInstanceRequest 请求对象
     * @return UpdateLakeFormationInstanceResponse
     */
    public UpdateLakeFormationInstanceResponse updateLakeFormationInstance(UpdateLakeFormationInstanceRequest request) {
        return hcClient.syncInvokeHttp(request, LakeFormationMeta.updateLakeFormationInstance);
    }

    /**
     * 更新实例
     *
     * 修改LakeFormation实例信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateLakeFormationInstanceRequest 请求对象
     * @return SyncInvoker<UpdateLakeFormationInstanceRequest, UpdateLakeFormationInstanceResponse>
     */
    public SyncInvoker<UpdateLakeFormationInstanceRequest, UpdateLakeFormationInstanceResponse> updateLakeFormationInstanceInvoker(
        UpdateLakeFormationInstanceRequest request) {
        return new SyncInvoker<UpdateLakeFormationInstanceRequest, UpdateLakeFormationInstanceResponse>(request,
            LakeFormationMeta.updateLakeFormationInstance, hcClient);
    }

    /**
     * 设为默认实例
     *
     * 设为默认实例，只有非默认实例可以设置为默认实例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateLakeFormationInstanceDefaultRequest 请求对象
     * @return UpdateLakeFormationInstanceDefaultResponse
     */
    public UpdateLakeFormationInstanceDefaultResponse updateLakeFormationInstanceDefault(
        UpdateLakeFormationInstanceDefaultRequest request) {
        return hcClient.syncInvokeHttp(request, LakeFormationMeta.updateLakeFormationInstanceDefault);
    }

    /**
     * 设为默认实例
     *
     * 设为默认实例，只有非默认实例可以设置为默认实例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateLakeFormationInstanceDefaultRequest 请求对象
     * @return SyncInvoker<UpdateLakeFormationInstanceDefaultRequest, UpdateLakeFormationInstanceDefaultResponse>
     */
    public SyncInvoker<UpdateLakeFormationInstanceDefaultRequest, UpdateLakeFormationInstanceDefaultResponse> updateLakeFormationInstanceDefaultInvoker(
        UpdateLakeFormationInstanceDefaultRequest request) {
        return new SyncInvoker<UpdateLakeFormationInstanceDefaultRequest, UpdateLakeFormationInstanceDefaultResponse>(
            request, LakeFormationMeta.updateLakeFormationInstanceDefault, hcClient);
    }

    /**
     * 变更实例规格
     *
     * 变更LakeFormation实例规格
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateLakeFormationInstanceScaleRequest 请求对象
     * @return UpdateLakeFormationInstanceScaleResponse
     */
    public UpdateLakeFormationInstanceScaleResponse updateLakeFormationInstanceScale(
        UpdateLakeFormationInstanceScaleRequest request) {
        return hcClient.syncInvokeHttp(request, LakeFormationMeta.updateLakeFormationInstanceScale);
    }

    /**
     * 变更实例规格
     *
     * 变更LakeFormation实例规格
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateLakeFormationInstanceScaleRequest 请求对象
     * @return SyncInvoker<UpdateLakeFormationInstanceScaleRequest, UpdateLakeFormationInstanceScaleResponse>
     */
    public SyncInvoker<UpdateLakeFormationInstanceScaleRequest, UpdateLakeFormationInstanceScaleResponse> updateLakeFormationInstanceScaleInvoker(
        UpdateLakeFormationInstanceScaleRequest request) {
        return new SyncInvoker<UpdateLakeFormationInstanceScaleRequest, UpdateLakeFormationInstanceScaleResponse>(
            request, LakeFormationMeta.updateLakeFormationInstanceScale, hcClient);
    }

    /**
     * 查询OBS桶列表
     *
     * 查询OBS桶列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListObsBucketsRequest 请求对象
     * @return ListObsBucketsResponse
     */
    public ListObsBucketsResponse listObsBuckets(ListObsBucketsRequest request) {
        return hcClient.syncInvokeHttp(request, LakeFormationMeta.listObsBuckets);
    }

    /**
     * 查询OBS桶列表
     *
     * 查询OBS桶列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListObsBucketsRequest 请求对象
     * @return SyncInvoker<ListObsBucketsRequest, ListObsBucketsResponse>
     */
    public SyncInvoker<ListObsBucketsRequest, ListObsBucketsResponse> listObsBucketsInvoker(
        ListObsBucketsRequest request) {
        return new SyncInvoker<ListObsBucketsRequest, ListObsBucketsResponse>(request, LakeFormationMeta.listObsBuckets,
            hcClient);
    }

    /**
     * 查询obs桶对象列表
     *
     * 查询obs桶对象列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListObsObjectRequest 请求对象
     * @return ListObsObjectResponse
     */
    public ListObsObjectResponse listObsObject(ListObsObjectRequest request) {
        return hcClient.syncInvokeHttp(request, LakeFormationMeta.listObsObject);
    }

    /**
     * 查询obs桶对象列表
     *
     * 查询obs桶对象列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListObsObjectRequest 请求对象
     * @return SyncInvoker<ListObsObjectRequest, ListObsObjectResponse>
     */
    public SyncInvoker<ListObsObjectRequest, ListObsObjectResponse> listObsObjectInvoker(ListObsObjectRequest request) {
        return new SyncInvoker<ListObsObjectRequest, ListObsObjectResponse>(request, LakeFormationMeta.listObsObject,
            hcClient);
    }

    /**
     * 批量添加分区信息
     *
     * 批量添加分区信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param AddPartitionsRequest 请求对象
     * @return AddPartitionsResponse
     */
    public AddPartitionsResponse addPartitions(AddPartitionsRequest request) {
        return hcClient.syncInvokeHttp(request, LakeFormationMeta.addPartitions);
    }

    /**
     * 批量添加分区信息
     *
     * 批量添加分区信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param AddPartitionsRequest 请求对象
     * @return SyncInvoker<AddPartitionsRequest, AddPartitionsResponse>
     */
    public SyncInvoker<AddPartitionsRequest, AddPartitionsResponse> addPartitionsInvoker(AddPartitionsRequest request) {
        return new SyncInvoker<AddPartitionsRequest, AddPartitionsResponse>(request, LakeFormationMeta.addPartitions,
            hcClient);
    }

    /**
     * 批量删除分区信息
     *
     * 非事务表：如果设置删除数据，立刻删除分区数据路径下的数据。
     * 事务表：如果设置删除数据，保留数据在原路径下但对外不可见，待数据超期后统一删除。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchDeletePartitionRequest 请求对象
     * @return BatchDeletePartitionResponse
     */
    public BatchDeletePartitionResponse batchDeletePartition(BatchDeletePartitionRequest request) {
        return hcClient.syncInvokeHttp(request, LakeFormationMeta.batchDeletePartition);
    }

    /**
     * 批量删除分区信息
     *
     * 非事务表：如果设置删除数据，立刻删除分区数据路径下的数据。
     * 事务表：如果设置删除数据，保留数据在原路径下但对外不可见，待数据超期后统一删除。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchDeletePartitionRequest 请求对象
     * @return SyncInvoker<BatchDeletePartitionRequest, BatchDeletePartitionResponse>
     */
    public SyncInvoker<BatchDeletePartitionRequest, BatchDeletePartitionResponse> batchDeletePartitionInvoker(
        BatchDeletePartitionRequest request) {
        return new SyncInvoker<BatchDeletePartitionRequest, BatchDeletePartitionResponse>(request,
            LakeFormationMeta.batchDeletePartition, hcClient);
    }

    /**
     * 批量清空列表信息
     *
     * 删除存在分区的数据及统计信息，保留分区的元数据信息。全部存在、部分存在或都不存在，均返回OK
     * 非事务表：立刻删除分区路径下的数据。
     * 事务表：数据保留但不可见，待被删除数据超期后统一删除。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchDeletePartitionedStatisticsRequest 请求对象
     * @return BatchDeletePartitionedStatisticsResponse
     */
    public BatchDeletePartitionedStatisticsResponse batchDeletePartitionedStatistics(
        BatchDeletePartitionedStatisticsRequest request) {
        return hcClient.syncInvokeHttp(request, LakeFormationMeta.batchDeletePartitionedStatistics);
    }

    /**
     * 批量清空列表信息
     *
     * 删除存在分区的数据及统计信息，保留分区的元数据信息。全部存在、部分存在或都不存在，均返回OK
     * 非事务表：立刻删除分区路径下的数据。
     * 事务表：数据保留但不可见，待被删除数据超期后统一删除。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchDeletePartitionedStatisticsRequest 请求对象
     * @return SyncInvoker<BatchDeletePartitionedStatisticsRequest, BatchDeletePartitionedStatisticsResponse>
     */
    public SyncInvoker<BatchDeletePartitionedStatisticsRequest, BatchDeletePartitionedStatisticsResponse> batchDeletePartitionedStatisticsInvoker(
        BatchDeletePartitionedStatisticsRequest request) {
        return new SyncInvoker<BatchDeletePartitionedStatisticsRequest, BatchDeletePartitionedStatisticsResponse>(
            request, LakeFormationMeta.batchDeletePartitionedStatistics, hcClient);
    }

    /**
     * 批量获取分区信息
     *
     * 批量获取分区信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchListPartitionByValuesRequest 请求对象
     * @return BatchListPartitionByValuesResponse
     */
    public BatchListPartitionByValuesResponse batchListPartitionByValues(BatchListPartitionByValuesRequest request) {
        return hcClient.syncInvokeHttp(request, LakeFormationMeta.batchListPartitionByValues);
    }

    /**
     * 批量获取分区信息
     *
     * 批量获取分区信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchListPartitionByValuesRequest 请求对象
     * @return SyncInvoker<BatchListPartitionByValuesRequest, BatchListPartitionByValuesResponse>
     */
    public SyncInvoker<BatchListPartitionByValuesRequest, BatchListPartitionByValuesResponse> batchListPartitionByValuesInvoker(
        BatchListPartitionByValuesRequest request) {
        return new SyncInvoker<BatchListPartitionByValuesRequest, BatchListPartitionByValuesResponse>(request,
            LakeFormationMeta.batchListPartitionByValues, hcClient);
    }

    /**
     * 批量修改分区信息
     *
     * 所有partition必须要全部存在，如果存在某个partition不存在，就返回失败
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchUpdatePartitionRequest 请求对象
     * @return BatchUpdatePartitionResponse
     */
    public BatchUpdatePartitionResponse batchUpdatePartition(BatchUpdatePartitionRequest request) {
        return hcClient.syncInvokeHttp(request, LakeFormationMeta.batchUpdatePartition);
    }

    /**
     * 批量修改分区信息
     *
     * 所有partition必须要全部存在，如果存在某个partition不存在，就返回失败
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchUpdatePartitionRequest 请求对象
     * @return SyncInvoker<BatchUpdatePartitionRequest, BatchUpdatePartitionResponse>
     */
    public SyncInvoker<BatchUpdatePartitionRequest, BatchUpdatePartitionResponse> batchUpdatePartitionInvoker(
        BatchUpdatePartitionRequest request) {
        return new SyncInvoker<BatchUpdatePartitionRequest, BatchUpdatePartitionResponse>(request,
            LakeFormationMeta.batchUpdatePartition, hcClient);
    }

    /**
     * 列举分区值列表
     *
     * 遍历分区名字列表信息
     * 对于事务表，支持基于表的特定版本遍历分区名字列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListPartitionNamesRequest 请求对象
     * @return ListPartitionNamesResponse
     */
    public ListPartitionNamesResponse listPartitionNames(ListPartitionNamesRequest request) {
        return hcClient.syncInvokeHttp(request, LakeFormationMeta.listPartitionNames);
    }

    /**
     * 列举分区值列表
     *
     * 遍历分区名字列表信息
     * 对于事务表，支持基于表的特定版本遍历分区名字列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListPartitionNamesRequest 请求对象
     * @return SyncInvoker<ListPartitionNamesRequest, ListPartitionNamesResponse>
     */
    public SyncInvoker<ListPartitionNamesRequest, ListPartitionNamesResponse> listPartitionNamesInvoker(
        ListPartitionNamesRequest request) {
        return new SyncInvoker<ListPartitionNamesRequest, ListPartitionNamesResponse>(request,
            LakeFormationMeta.listPartitionNames, hcClient);
    }

    /**
     * 列举全量分区值列表
     *
     * 遍历分区名称列表信息,返回全量的数据。
     * 对于事务表，支持基于表的特定版本遍历分区名称列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListPartitionNamesWithoutLimitRequest 请求对象
     * @return ListPartitionNamesWithoutLimitResponse
     */
    public ListPartitionNamesWithoutLimitResponse listPartitionNamesWithoutLimit(
        ListPartitionNamesWithoutLimitRequest request) {
        return hcClient.syncInvokeHttp(request, LakeFormationMeta.listPartitionNamesWithoutLimit);
    }

    /**
     * 列举全量分区值列表
     *
     * 遍历分区名称列表信息,返回全量的数据。
     * 对于事务表，支持基于表的特定版本遍历分区名称列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListPartitionNamesWithoutLimitRequest 请求对象
     * @return SyncInvoker<ListPartitionNamesWithoutLimitRequest, ListPartitionNamesWithoutLimitResponse>
     */
    public SyncInvoker<ListPartitionNamesWithoutLimitRequest, ListPartitionNamesWithoutLimitResponse> listPartitionNamesWithoutLimitInvoker(
        ListPartitionNamesWithoutLimitRequest request) {
        return new SyncInvoker<ListPartitionNamesWithoutLimitRequest, ListPartitionNamesWithoutLimitResponse>(request,
            LakeFormationMeta.listPartitionNamesWithoutLimit, hcClient);
    }

    /**
     * 列举分区信息
     *
     * 遍历指定数据表下的分区列表，对于事务表，支持基于表的特定版本遍历分区列表。
     * 当过滤条件不为空时，优先根据过滤条件筛选过滤，
     * 当过滤条件为空且分区值不为空时，再根据分区值筛选过滤，
     * 当过滤条件和分区值都为空时，返回指定数据表下所有分区。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListPartitionsRequest 请求对象
     * @return ListPartitionsResponse
     */
    public ListPartitionsResponse listPartitions(ListPartitionsRequest request) {
        return hcClient.syncInvokeHttp(request, LakeFormationMeta.listPartitions);
    }

    /**
     * 列举分区信息
     *
     * 遍历指定数据表下的分区列表，对于事务表，支持基于表的特定版本遍历分区列表。
     * 当过滤条件不为空时，优先根据过滤条件筛选过滤，
     * 当过滤条件为空且分区值不为空时，再根据分区值筛选过滤，
     * 当过滤条件和分区值都为空时，返回指定数据表下所有分区。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListPartitionsRequest 请求对象
     * @return SyncInvoker<ListPartitionsRequest, ListPartitionsResponse>
     */
    public SyncInvoker<ListPartitionsRequest, ListPartitionsResponse> listPartitionsInvoker(
        ListPartitionsRequest request) {
        return new SyncInvoker<ListPartitionsRequest, ListPartitionsResponse>(request, LakeFormationMeta.listPartitions,
            hcClient);
    }

    /**
     * 批量获取分区的列统计信息
     *
     * 批量获取分区的列统计信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchShowPartitionColumnStatisticsRequest 请求对象
     * @return BatchShowPartitionColumnStatisticsResponse
     */
    public BatchShowPartitionColumnStatisticsResponse batchShowPartitionColumnStatistics(
        BatchShowPartitionColumnStatisticsRequest request) {
        return hcClient.syncInvokeHttp(request, LakeFormationMeta.batchShowPartitionColumnStatistics);
    }

    /**
     * 批量获取分区的列统计信息
     *
     * 批量获取分区的列统计信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchShowPartitionColumnStatisticsRequest 请求对象
     * @return SyncInvoker<BatchShowPartitionColumnStatisticsRequest, BatchShowPartitionColumnStatisticsResponse>
     */
    public SyncInvoker<BatchShowPartitionColumnStatisticsRequest, BatchShowPartitionColumnStatisticsResponse> batchShowPartitionColumnStatisticsInvoker(
        BatchShowPartitionColumnStatisticsRequest request) {
        return new SyncInvoker<BatchShowPartitionColumnStatisticsRequest, BatchShowPartitionColumnStatisticsResponse>(
            request, LakeFormationMeta.batchShowPartitionColumnStatistics, hcClient);
    }

    /**
     * 删除分区列的统计信息
     *
     * 删除分区列的统计信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeletePartitionColumnStatisticsRequest 请求对象
     * @return DeletePartitionColumnStatisticsResponse
     */
    public DeletePartitionColumnStatisticsResponse deletePartitionColumnStatistics(
        DeletePartitionColumnStatisticsRequest request) {
        return hcClient.syncInvokeHttp(request, LakeFormationMeta.deletePartitionColumnStatistics);
    }

    /**
     * 删除分区列的统计信息
     *
     * 删除分区列的统计信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeletePartitionColumnStatisticsRequest 请求对象
     * @return SyncInvoker<DeletePartitionColumnStatisticsRequest, DeletePartitionColumnStatisticsResponse>
     */
    public SyncInvoker<DeletePartitionColumnStatisticsRequest, DeletePartitionColumnStatisticsResponse> deletePartitionColumnStatisticsInvoker(
        DeletePartitionColumnStatisticsRequest request) {
        return new SyncInvoker<DeletePartitionColumnStatisticsRequest, DeletePartitionColumnStatisticsResponse>(request,
            LakeFormationMeta.deletePartitionColumnStatistics, hcClient);
    }

    /**
     * 批量设置分区的统计信息
     *
     * 批量设置分区的统计信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param SetPartitionColumnStatisticsRequest 请求对象
     * @return SetPartitionColumnStatisticsResponse
     */
    public SetPartitionColumnStatisticsResponse setPartitionColumnStatistics(
        SetPartitionColumnStatisticsRequest request) {
        return hcClient.syncInvokeHttp(request, LakeFormationMeta.setPartitionColumnStatistics);
    }

    /**
     * 批量设置分区的统计信息
     *
     * 批量设置分区的统计信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param SetPartitionColumnStatisticsRequest 请求对象
     * @return SyncInvoker<SetPartitionColumnStatisticsRequest, SetPartitionColumnStatisticsResponse>
     */
    public SyncInvoker<SetPartitionColumnStatisticsRequest, SetPartitionColumnStatisticsResponse> setPartitionColumnStatisticsInvoker(
        SetPartitionColumnStatisticsRequest request) {
        return new SyncInvoker<SetPartitionColumnStatisticsRequest, SetPartitionColumnStatisticsResponse>(request,
            LakeFormationMeta.setPartitionColumnStatistics, hcClient);
    }

    /**
     * 查询配额
     *
     * 查询用户的配额信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListQuotasRequest 请求对象
     * @return ListQuotasResponse
     */
    public ListQuotasResponse listQuotas(ListQuotasRequest request) {
        return hcClient.syncInvokeHttp(request, LakeFormationMeta.listQuotas);
    }

    /**
     * 查询配额
     *
     * 查询用户的配额信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListQuotasRequest 请求对象
     * @return SyncInvoker<ListQuotasRequest, ListQuotasResponse>
     */
    public SyncInvoker<ListQuotasRequest, ListQuotasResponse> listQuotasInvoker(ListQuotasRequest request) {
        return new SyncInvoker<ListQuotasRequest, ListQuotasResponse>(request, LakeFormationMeta.listQuotas, hcClient);
    }

    /**
     * 将一个或者多个用户/用户组加入角色
     *
     * 将一个或者多个用户/用户组加入角色
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param AssociatePrincipalsRequest 请求对象
     * @return AssociatePrincipalsResponse
     */
    public AssociatePrincipalsResponse associatePrincipals(AssociatePrincipalsRequest request) {
        return hcClient.syncInvokeHttp(request, LakeFormationMeta.associatePrincipals);
    }

    /**
     * 将一个或者多个用户/用户组加入角色
     *
     * 将一个或者多个用户/用户组加入角色
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param AssociatePrincipalsRequest 请求对象
     * @return SyncInvoker<AssociatePrincipalsRequest, AssociatePrincipalsResponse>
     */
    public SyncInvoker<AssociatePrincipalsRequest, AssociatePrincipalsResponse> associatePrincipalsInvoker(
        AssociatePrincipalsRequest request) {
        return new SyncInvoker<AssociatePrincipalsRequest, AssociatePrincipalsResponse>(request,
            LakeFormationMeta.associatePrincipals, hcClient);
    }

    /**
     * 创建role
     *
     * 创建role
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateRoleRequest 请求对象
     * @return CreateRoleResponse
     */
    public CreateRoleResponse createRole(CreateRoleRequest request) {
        return hcClient.syncInvokeHttp(request, LakeFormationMeta.createRole);
    }

    /**
     * 创建role
     *
     * 创建role
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateRoleRequest 请求对象
     * @return SyncInvoker<CreateRoleRequest, CreateRoleResponse>
     */
    public SyncInvoker<CreateRoleRequest, CreateRoleResponse> createRoleInvoker(CreateRoleRequest request) {
        return new SyncInvoker<CreateRoleRequest, CreateRoleResponse>(request, LakeFormationMeta.createRole, hcClient);
    }

    /**
     * 删除角色
     *
     * 删除指定角色
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteRoleRequest 请求对象
     * @return DeleteRoleResponse
     */
    public DeleteRoleResponse deleteRole(DeleteRoleRequest request) {
        return hcClient.syncInvokeHttp(request, LakeFormationMeta.deleteRole);
    }

    /**
     * 删除角色
     *
     * 删除指定角色
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteRoleRequest 请求对象
     * @return SyncInvoker<DeleteRoleRequest, DeleteRoleResponse>
     */
    public SyncInvoker<DeleteRoleRequest, DeleteRoleResponse> deleteRoleInvoker(DeleteRoleRequest request) {
        return new SyncInvoker<DeleteRoleRequest, DeleteRoleResponse>(request, LakeFormationMeta.deleteRole, hcClient);
    }

    /**
     * 查询角色下的用户/用户组
     *
     * 查询角色下的用户/用户组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListPrincipalsRequest 请求对象
     * @return ListPrincipalsResponse
     */
    public ListPrincipalsResponse listPrincipals(ListPrincipalsRequest request) {
        return hcClient.syncInvokeHttp(request, LakeFormationMeta.listPrincipals);
    }

    /**
     * 查询角色下的用户/用户组
     *
     * 查询角色下的用户/用户组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListPrincipalsRequest 请求对象
     * @return SyncInvoker<ListPrincipalsRequest, ListPrincipalsResponse>
     */
    public SyncInvoker<ListPrincipalsRequest, ListPrincipalsResponse> listPrincipalsInvoker(
        ListPrincipalsRequest request) {
        return new SyncInvoker<ListPrincipalsRequest, ListPrincipalsResponse>(request, LakeFormationMeta.listPrincipals,
            hcClient);
    }

    /**
     * 列举所有角色名
     *
     * 查询所有角色名字列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListRoleNamesRequest 请求对象
     * @return ListRoleNamesResponse
     */
    public ListRoleNamesResponse listRoleNames(ListRoleNamesRequest request) {
        return hcClient.syncInvokeHttp(request, LakeFormationMeta.listRoleNames);
    }

    /**
     * 列举所有角色名
     *
     * 查询所有角色名字列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListRoleNamesRequest 请求对象
     * @return SyncInvoker<ListRoleNamesRequest, ListRoleNamesResponse>
     */
    public SyncInvoker<ListRoleNamesRequest, ListRoleNamesResponse> listRoleNamesInvoker(ListRoleNamesRequest request) {
        return new SyncInvoker<ListRoleNamesRequest, ListRoleNamesResponse>(request, LakeFormationMeta.listRoleNames,
            hcClient);
    }

    /**
     * 根据条件分页列举角色
     *
     * 返回所有角色
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListRolesRequest 请求对象
     * @return ListRolesResponse
     */
    public ListRolesResponse listRoles(ListRolesRequest request) {
        return hcClient.syncInvokeHttp(request, LakeFormationMeta.listRoles);
    }

    /**
     * 根据条件分页列举角色
     *
     * 返回所有角色
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListRolesRequest 请求对象
     * @return SyncInvoker<ListRolesRequest, ListRolesResponse>
     */
    public SyncInvoker<ListRolesRequest, ListRolesResponse> listRolesInvoker(ListRolesRequest request) {
        return new SyncInvoker<ListRolesRequest, ListRolesResponse>(request, LakeFormationMeta.listRoles, hcClient);
    }

    /**
     * 将一个或者多个用户/用户组从角色移除
     *
     * 将一个或者多个用户/用户组从角色移除
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RevokePrincipalsRequest 请求对象
     * @return RevokePrincipalsResponse
     */
    public RevokePrincipalsResponse revokePrincipals(RevokePrincipalsRequest request) {
        return hcClient.syncInvokeHttp(request, LakeFormationMeta.revokePrincipals);
    }

    /**
     * 将一个或者多个用户/用户组从角色移除
     *
     * 将一个或者多个用户/用户组从角色移除
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RevokePrincipalsRequest 请求对象
     * @return SyncInvoker<RevokePrincipalsRequest, RevokePrincipalsResponse>
     */
    public SyncInvoker<RevokePrincipalsRequest, RevokePrincipalsResponse> revokePrincipalsInvoker(
        RevokePrincipalsRequest request) {
        return new SyncInvoker<RevokePrincipalsRequest, RevokePrincipalsResponse>(request,
            LakeFormationMeta.revokePrincipals, hcClient);
    }

    /**
     * 获取角色
     *
     * 获取角色
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowRoleRequest 请求对象
     * @return ShowRoleResponse
     */
    public ShowRoleResponse showRole(ShowRoleRequest request) {
        return hcClient.syncInvokeHttp(request, LakeFormationMeta.showRole);
    }

    /**
     * 获取角色
     *
     * 获取角色
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowRoleRequest 请求对象
     * @return SyncInvoker<ShowRoleRequest, ShowRoleResponse>
     */
    public SyncInvoker<ShowRoleRequest, ShowRoleResponse> showRoleInvoker(ShowRoleRequest request) {
        return new SyncInvoker<ShowRoleRequest, ShowRoleResponse>(request, LakeFormationMeta.showRole, hcClient);
    }

    /**
     * 更新角色中的principals
     *
     * 更新角色中的principals
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdatePrincipalsRequest 请求对象
     * @return UpdatePrincipalsResponse
     */
    public UpdatePrincipalsResponse updatePrincipals(UpdatePrincipalsRequest request) {
        return hcClient.syncInvokeHttp(request, LakeFormationMeta.updatePrincipals);
    }

    /**
     * 更新角色中的principals
     *
     * 更新角色中的principals
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdatePrincipalsRequest 请求对象
     * @return SyncInvoker<UpdatePrincipalsRequest, UpdatePrincipalsResponse>
     */
    public SyncInvoker<UpdatePrincipalsRequest, UpdatePrincipalsResponse> updatePrincipalsInvoker(
        UpdatePrincipalsRequest request) {
        return new SyncInvoker<UpdatePrincipalsRequest, UpdatePrincipalsResponse>(request,
            LakeFormationMeta.updatePrincipals, hcClient);
    }

    /**
     * 修改角色信息
     *
     * 修改角色信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateRoleRequest 请求对象
     * @return UpdateRoleResponse
     */
    public UpdateRoleResponse updateRole(UpdateRoleRequest request) {
        return hcClient.syncInvokeHttp(request, LakeFormationMeta.updateRole);
    }

    /**
     * 修改角色信息
     *
     * 修改角色信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateRoleRequest 请求对象
     * @return SyncInvoker<UpdateRoleRequest, UpdateRoleResponse>
     */
    public SyncInvoker<UpdateRoleRequest, UpdateRoleResponse> updateRoleInvoker(UpdateRoleRequest request) {
        return new SyncInvoker<UpdateRoleRequest, UpdateRoleResponse>(request, LakeFormationMeta.updateRole, hcClient);
    }

    /**
     * 
     *
     * 查询规格列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListSpecsRequest 请求对象
     * @return ListSpecsResponse
     */
    public ListSpecsResponse listSpecs(ListSpecsRequest request) {
        return hcClient.syncInvokeHttp(request, LakeFormationMeta.listSpecs);
    }

    /**
     * 
     *
     * 查询规格列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListSpecsRequest 请求对象
     * @return SyncInvoker<ListSpecsRequest, ListSpecsResponse>
     */
    public SyncInvoker<ListSpecsRequest, ListSpecsResponse> listSpecsInvoker(ListSpecsRequest request) {
        return new SyncInvoker<ListSpecsRequest, ListSpecsResponse>(request, LakeFormationMeta.listSpecs, hcClient);
    }

    /**
     * 创建表
     *
     * 创建表操作
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateTableRequest 请求对象
     * @return CreateTableResponse
     */
    public CreateTableResponse createTable(CreateTableRequest request) {
        return hcClient.syncInvokeHttp(request, LakeFormationMeta.createTable);
    }

    /**
     * 创建表
     *
     * 创建表操作
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateTableRequest 请求对象
     * @return SyncInvoker<CreateTableRequest, CreateTableResponse>
     */
    public SyncInvoker<CreateTableRequest, CreateTableResponse> createTableInvoker(CreateTableRequest request) {
        return new SyncInvoker<CreateTableRequest, CreateTableResponse>(request, LakeFormationMeta.createTable,
            hcClient);
    }

    /**
     * 清空表的数据
     *
     * 清空表以及表下所有分区的数据及统计信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteAllTablesRequest 请求对象
     * @return DeleteAllTablesResponse
     */
    public DeleteAllTablesResponse deleteAllTables(DeleteAllTablesRequest request) {
        return hcClient.syncInvokeHttp(request, LakeFormationMeta.deleteAllTables);
    }

    /**
     * 清空表的数据
     *
     * 清空表以及表下所有分区的数据及统计信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteAllTablesRequest 请求对象
     * @return SyncInvoker<DeleteAllTablesRequest, DeleteAllTablesResponse>
     */
    public SyncInvoker<DeleteAllTablesRequest, DeleteAllTablesResponse> deleteAllTablesInvoker(
        DeleteAllTablesRequest request) {
        return new SyncInvoker<DeleteAllTablesRequest, DeleteAllTablesResponse>(request,
            LakeFormationMeta.deleteAllTables, hcClient);
    }

    /**
     * 删除表
     *
     * 删除表及表下的分区
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteTableRequest 请求对象
     * @return DeleteTableResponse
     */
    public DeleteTableResponse deleteTable(DeleteTableRequest request) {
        return hcClient.syncInvokeHttp(request, LakeFormationMeta.deleteTable);
    }

    /**
     * 删除表
     *
     * 删除表及表下的分区
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteTableRequest 请求对象
     * @return SyncInvoker<DeleteTableRequest, DeleteTableResponse>
     */
    public SyncInvoker<DeleteTableRequest, DeleteTableResponse> deleteTableInvoker(DeleteTableRequest request) {
        return new SyncInvoker<DeleteTableRequest, DeleteTableResponse>(request, LakeFormationMeta.deleteTable,
            hcClient);
    }

    /**
     * 分页获取表的描述信息
     *
     * 通过数据库通配符和表通配符，找到符合条件的表并返回表的描述信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListTableMetaRequest 请求对象
     * @return ListTableMetaResponse
     */
    public ListTableMetaResponse listTableMeta(ListTableMetaRequest request) {
        return hcClient.syncInvokeHttp(request, LakeFormationMeta.listTableMeta);
    }

    /**
     * 分页获取表的描述信息
     *
     * 通过数据库通配符和表通配符，找到符合条件的表并返回表的描述信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListTableMetaRequest 请求对象
     * @return SyncInvoker<ListTableMetaRequest, ListTableMetaResponse>
     */
    public SyncInvoker<ListTableMetaRequest, ListTableMetaResponse> listTableMetaInvoker(ListTableMetaRequest request) {
        return new SyncInvoker<ListTableMetaRequest, ListTableMetaResponse>(request, LakeFormationMeta.listTableMeta,
            hcClient);
    }

    /**
     * 列举库下所有表名
     *
     * 查询数据库下的所有表名字列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListTableNamesRequest 请求对象
     * @return ListTableNamesResponse
     */
    public ListTableNamesResponse listTableNames(ListTableNamesRequest request) {
        return hcClient.syncInvokeHttp(request, LakeFormationMeta.listTableNames);
    }

    /**
     * 列举库下所有表名
     *
     * 查询数据库下的所有表名字列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListTableNamesRequest 请求对象
     * @return SyncInvoker<ListTableNamesRequest, ListTableNamesResponse>
     */
    public SyncInvoker<ListTableNamesRequest, ListTableNamesResponse> listTableNamesInvoker(
        ListTableNamesRequest request) {
        return new SyncInvoker<ListTableNamesRequest, ListTableNamesResponse>(request, LakeFormationMeta.listTableNames,
            hcClient);
    }

    /**
     * 根据条件分页列举表信息
     *
     * 返回数据库下符合查询条件的表的元数据信息，不支持事务操作
     * 当表名通配符或表类型不为空时，优先根据表名和类型筛选过滤
     * 当表名通配符或表类型为空时，再根据属性筛选过滤
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListTablesRequest 请求对象
     * @return ListTablesResponse
     */
    public ListTablesResponse listTables(ListTablesRequest request) {
        return hcClient.syncInvokeHttp(request, LakeFormationMeta.listTables);
    }

    /**
     * 根据条件分页列举表信息
     *
     * 返回数据库下符合查询条件的表的元数据信息，不支持事务操作
     * 当表名通配符或表类型不为空时，优先根据表名和类型筛选过滤
     * 当表名通配符或表类型为空时，再根据属性筛选过滤
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListTablesRequest 请求对象
     * @return SyncInvoker<ListTablesRequest, ListTablesResponse>
     */
    public SyncInvoker<ListTablesRequest, ListTablesResponse> listTablesInvoker(ListTablesRequest request) {
        return new SyncInvoker<ListTablesRequest, ListTablesResponse>(request, LakeFormationMeta.listTables, hcClient);
    }

    /**
     * 根据表名列举表信息
     *
     * 根据表名查询数据库下的表信息列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListTablesByNameRequest 请求对象
     * @return ListTablesByNameResponse
     */
    public ListTablesByNameResponse listTablesByName(ListTablesByNameRequest request) {
        return hcClient.syncInvokeHttp(request, LakeFormationMeta.listTablesByName);
    }

    /**
     * 根据表名列举表信息
     *
     * 根据表名查询数据库下的表信息列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListTablesByNameRequest 请求对象
     * @return SyncInvoker<ListTablesByNameRequest, ListTablesByNameResponse>
     */
    public SyncInvoker<ListTablesByNameRequest, ListTablesByNameResponse> listTablesByNameInvoker(
        ListTablesByNameRequest request) {
        return new SyncInvoker<ListTablesByNameRequest, ListTablesByNameResponse>(request,
            LakeFormationMeta.listTablesByName, hcClient);
    }

    /**
     * 获取表信息
     *
     * 获取表信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowTableRequest 请求对象
     * @return ShowTableResponse
     */
    public ShowTableResponse showTable(ShowTableRequest request) {
        return hcClient.syncInvokeHttp(request, LakeFormationMeta.showTable);
    }

    /**
     * 获取表信息
     *
     * 获取表信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowTableRequest 请求对象
     * @return SyncInvoker<ShowTableRequest, ShowTableResponse>
     */
    public SyncInvoker<ShowTableRequest, ShowTableResponse> showTableInvoker(ShowTableRequest request) {
        return new SyncInvoker<ShowTableRequest, ShowTableResponse>(request, LakeFormationMeta.showTable, hcClient);
    }

    /**
     * 修改表信息
     *
     * 修改表信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateTableRequest 请求对象
     * @return UpdateTableResponse
     */
    public UpdateTableResponse updateTable(UpdateTableRequest request) {
        return hcClient.syncInvokeHttp(request, LakeFormationMeta.updateTable);
    }

    /**
     * 修改表信息
     *
     * 修改表信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateTableRequest 请求对象
     * @return SyncInvoker<UpdateTableRequest, UpdateTableResponse>
     */
    public SyncInvoker<UpdateTableRequest, UpdateTableResponse> updateTableInvoker(UpdateTableRequest request) {
        return new SyncInvoker<UpdateTableRequest, UpdateTableResponse>(request, LakeFormationMeta.updateTable,
            hcClient);
    }

    /**
     * 删除表的指定列统计信息
     *
     * 删除表的指定列统计信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteTableColumnStatisticsRequest 请求对象
     * @return DeleteTableColumnStatisticsResponse
     */
    public DeleteTableColumnStatisticsResponse deleteTableColumnStatistics(DeleteTableColumnStatisticsRequest request) {
        return hcClient.syncInvokeHttp(request, LakeFormationMeta.deleteTableColumnStatistics);
    }

    /**
     * 删除表的指定列统计信息
     *
     * 删除表的指定列统计信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteTableColumnStatisticsRequest 请求对象
     * @return SyncInvoker<DeleteTableColumnStatisticsRequest, DeleteTableColumnStatisticsResponse>
     */
    public SyncInvoker<DeleteTableColumnStatisticsRequest, DeleteTableColumnStatisticsResponse> deleteTableColumnStatisticsInvoker(
        DeleteTableColumnStatisticsRequest request) {
        return new SyncInvoker<DeleteTableColumnStatisticsRequest, DeleteTableColumnStatisticsResponse>(request,
            LakeFormationMeta.deleteTableColumnStatistics, hcClient);
    }

    /**
     * 获取表的列统计信息
     *
     * 获取表的列统计信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListTableColumnStatisticsRequest 请求对象
     * @return ListTableColumnStatisticsResponse
     */
    public ListTableColumnStatisticsResponse listTableColumnStatistics(ListTableColumnStatisticsRequest request) {
        return hcClient.syncInvokeHttp(request, LakeFormationMeta.listTableColumnStatistics);
    }

    /**
     * 获取表的列统计信息
     *
     * 获取表的列统计信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListTableColumnStatisticsRequest 请求对象
     * @return SyncInvoker<ListTableColumnStatisticsRequest, ListTableColumnStatisticsResponse>
     */
    public SyncInvoker<ListTableColumnStatisticsRequest, ListTableColumnStatisticsResponse> listTableColumnStatisticsInvoker(
        ListTableColumnStatisticsRequest request) {
        return new SyncInvoker<ListTableColumnStatisticsRequest, ListTableColumnStatisticsResponse>(request,
            LakeFormationMeta.listTableColumnStatistics, hcClient);
    }

    /**
     * 更新表的列统计信息
     *
     * 更新表的列统计信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param SetTableColumnStatisticsRequest 请求对象
     * @return SetTableColumnStatisticsResponse
     */
    public SetTableColumnStatisticsResponse setTableColumnStatistics(SetTableColumnStatisticsRequest request) {
        return hcClient.syncInvokeHttp(request, LakeFormationMeta.setTableColumnStatistics);
    }

    /**
     * 更新表的列统计信息
     *
     * 更新表的列统计信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param SetTableColumnStatisticsRequest 请求对象
     * @return SyncInvoker<SetTableColumnStatisticsRequest, SetTableColumnStatisticsResponse>
     */
    public SyncInvoker<SetTableColumnStatisticsRequest, SetTableColumnStatisticsResponse> setTableColumnStatisticsInvoker(
        SetTableColumnStatisticsRequest request) {
        return new SyncInvoker<SetTableColumnStatisticsRequest, SetTableColumnStatisticsResponse>(request,
            LakeFormationMeta.setTableColumnStatistics, hcClient);
    }

    /**
     * 批量创建列限制条件
     *
     * 批量创建表的列限制条件
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchCreateConstraintRequest 请求对象
     * @return BatchCreateConstraintResponse
     */
    public BatchCreateConstraintResponse batchCreateConstraint(BatchCreateConstraintRequest request) {
        return hcClient.syncInvokeHttp(request, LakeFormationMeta.batchCreateConstraint);
    }

    /**
     * 批量创建列限制条件
     *
     * 批量创建表的列限制条件
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchCreateConstraintRequest 请求对象
     * @return SyncInvoker<BatchCreateConstraintRequest, BatchCreateConstraintResponse>
     */
    public SyncInvoker<BatchCreateConstraintRequest, BatchCreateConstraintResponse> batchCreateConstraintInvoker(
        BatchCreateConstraintRequest request) {
        return new SyncInvoker<BatchCreateConstraintRequest, BatchCreateConstraintResponse>(request,
            LakeFormationMeta.batchCreateConstraint, hcClient);
    }

    /**
     * 删除列限制条件
     *
     * 删除列限制条件
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteConstraintRequest 请求对象
     * @return DeleteConstraintResponse
     */
    public DeleteConstraintResponse deleteConstraint(DeleteConstraintRequest request) {
        return hcClient.syncInvokeHttp(request, LakeFormationMeta.deleteConstraint);
    }

    /**
     * 删除列限制条件
     *
     * 删除列限制条件
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteConstraintRequest 请求对象
     * @return SyncInvoker<DeleteConstraintRequest, DeleteConstraintResponse>
     */
    public SyncInvoker<DeleteConstraintRequest, DeleteConstraintResponse> deleteConstraintInvoker(
        DeleteConstraintRequest request) {
        return new SyncInvoker<DeleteConstraintRequest, DeleteConstraintResponse>(request,
            LakeFormationMeta.deleteConstraint, hcClient);
    }

    /**
     * 获取列限制条件
     *
     * 若查询外键信息，需要在参数中填写被引用表的数据库名和表名。如：parent_db&#x3D;db1&amp;parent_tbl&#x3D;tbl1
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListConstraintsRequest 请求对象
     * @return ListConstraintsResponse
     */
    public ListConstraintsResponse listConstraints(ListConstraintsRequest request) {
        return hcClient.syncInvokeHttp(request, LakeFormationMeta.listConstraints);
    }

    /**
     * 获取列限制条件
     *
     * 若查询外键信息，需要在参数中填写被引用表的数据库名和表名。如：parent_db&#x3D;db1&amp;parent_tbl&#x3D;tbl1
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListConstraintsRequest 请求对象
     * @return SyncInvoker<ListConstraintsRequest, ListConstraintsResponse>
     */
    public SyncInvoker<ListConstraintsRequest, ListConstraintsResponse> listConstraintsInvoker(
        ListConstraintsRequest request) {
        return new SyncInvoker<ListConstraintsRequest, ListConstraintsResponse>(request,
            LakeFormationMeta.listConstraints, hcClient);
    }

    /**
     * 批量更新标签
     *
     * 为指定实例批量更新标签
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchUpdateLakeFormationInstanceTagsRequest 请求对象
     * @return BatchUpdateLakeFormationInstanceTagsResponse
     */
    public BatchUpdateLakeFormationInstanceTagsResponse batchUpdateLakeFormationInstanceTags(
        BatchUpdateLakeFormationInstanceTagsRequest request) {
        return hcClient.syncInvokeHttp(request, LakeFormationMeta.batchUpdateLakeFormationInstanceTags);
    }

    /**
     * 批量更新标签
     *
     * 为指定实例批量更新标签
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchUpdateLakeFormationInstanceTagsRequest 请求对象
     * @return SyncInvoker<BatchUpdateLakeFormationInstanceTagsRequest, BatchUpdateLakeFormationInstanceTagsResponse>
     */
    public SyncInvoker<BatchUpdateLakeFormationInstanceTagsRequest, BatchUpdateLakeFormationInstanceTagsResponse> batchUpdateLakeFormationInstanceTagsInvoker(
        BatchUpdateLakeFormationInstanceTagsRequest request) {
        return new SyncInvoker<BatchUpdateLakeFormationInstanceTagsRequest, BatchUpdateLakeFormationInstanceTagsResponse>(
            request, LakeFormationMeta.batchUpdateLakeFormationInstanceTags, hcClient);
    }

    /**
     * 查询资源标签集合
     *
     * 查询租户在指定Project中实例类型的所有资源标签集合
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListLakeFormationInstanceTagsRequest 请求对象
     * @return ListLakeFormationInstanceTagsResponse
     */
    public ListLakeFormationInstanceTagsResponse listLakeFormationInstanceTags(
        ListLakeFormationInstanceTagsRequest request) {
        return hcClient.syncInvokeHttp(request, LakeFormationMeta.listLakeFormationInstanceTags);
    }

    /**
     * 查询资源标签集合
     *
     * 查询租户在指定Project中实例类型的所有资源标签集合
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListLakeFormationInstanceTagsRequest 请求对象
     * @return SyncInvoker<ListLakeFormationInstanceTagsRequest, ListLakeFormationInstanceTagsResponse>
     */
    public SyncInvoker<ListLakeFormationInstanceTagsRequest, ListLakeFormationInstanceTagsResponse> listLakeFormationInstanceTagsInvoker(
        ListLakeFormationInstanceTagsRequest request) {
        return new SyncInvoker<ListLakeFormationInstanceTagsRequest, ListLakeFormationInstanceTagsResponse>(request,
            LakeFormationMeta.listLakeFormationInstanceTags, hcClient);
    }

    /**
     * 将多个角色授予User
     *
     * 将多个角色授予User
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param AssociateRolesRequest 请求对象
     * @return AssociateRolesResponse
     */
    public AssociateRolesResponse associateRoles(AssociateRolesRequest request) {
        return hcClient.syncInvokeHttp(request, LakeFormationMeta.associateRoles);
    }

    /**
     * 将多个角色授予User
     *
     * 将多个角色授予User
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param AssociateRolesRequest 请求对象
     * @return SyncInvoker<AssociateRolesRequest, AssociateRolesResponse>
     */
    public SyncInvoker<AssociateRolesRequest, AssociateRolesResponse> associateRolesInvoker(
        AssociateRolesRequest request) {
        return new SyncInvoker<AssociateRolesRequest, AssociateRolesResponse>(request, LakeFormationMeta.associateRoles,
            hcClient);
    }

    /**
     * 查询用户的角色列表
     *
     * 查询用户的角色列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListUserRolesRequest 请求对象
     * @return ListUserRolesResponse
     */
    public ListUserRolesResponse listUserRoles(ListUserRolesRequest request) {
        return hcClient.syncInvokeHttp(request, LakeFormationMeta.listUserRoles);
    }

    /**
     * 查询用户的角色列表
     *
     * 查询用户的角色列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListUserRolesRequest 请求对象
     * @return SyncInvoker<ListUserRolesRequest, ListUserRolesResponse>
     */
    public SyncInvoker<ListUserRolesRequest, ListUserRolesResponse> listUserRolesInvoker(ListUserRolesRequest request) {
        return new SyncInvoker<ListUserRolesRequest, ListUserRolesResponse>(request, LakeFormationMeta.listUserRoles,
            hcClient);
    }

    /**
     * 获取用户列表
     *
     * 获取用户列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListUsersRequest 请求对象
     * @return ListUsersResponse
     */
    public ListUsersResponse listUsers(ListUsersRequest request) {
        return hcClient.syncInvokeHttp(request, LakeFormationMeta.listUsers);
    }

    /**
     * 获取用户列表
     *
     * 获取用户列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListUsersRequest 请求对象
     * @return SyncInvoker<ListUsersRequest, ListUsersResponse>
     */
    public SyncInvoker<ListUsersRequest, ListUsersResponse> listUsersInvoker(ListUsersRequest request) {
        return new SyncInvoker<ListUsersRequest, ListUsersResponse>(request, LakeFormationMeta.listUsers, hcClient);
    }

    /**
     * 将一个或者多个角色从用户移除
     *
     * 将一个或者多个角色从用户移除
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RevokeRolesRequest 请求对象
     * @return RevokeRolesResponse
     */
    public RevokeRolesResponse revokeRoles(RevokeRolesRequest request) {
        return hcClient.syncInvokeHttp(request, LakeFormationMeta.revokeRoles);
    }

    /**
     * 将一个或者多个角色从用户移除
     *
     * 将一个或者多个角色从用户移除
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RevokeRolesRequest 请求对象
     * @return SyncInvoker<RevokeRolesRequest, RevokeRolesResponse>
     */
    public SyncInvoker<RevokeRolesRequest, RevokeRolesResponse> revokeRolesInvoker(RevokeRolesRequest request) {
        return new SyncInvoker<RevokeRolesRequest, RevokeRolesResponse>(request, LakeFormationMeta.revokeRoles,
            hcClient);
    }

    /**
     * 更新用户中的角色
     *
     * 更新用户中的角色
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateRolesRequest 请求对象
     * @return UpdateRolesResponse
     */
    public UpdateRolesResponse updateRoles(UpdateRolesRequest request) {
        return hcClient.syncInvokeHttp(request, LakeFormationMeta.updateRoles);
    }

    /**
     * 更新用户中的角色
     *
     * 更新用户中的角色
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateRolesRequest 请求对象
     * @return SyncInvoker<UpdateRolesRequest, UpdateRolesResponse>
     */
    public SyncInvoker<UpdateRolesRequest, UpdateRolesResponse> updateRolesInvoker(UpdateRolesRequest request) {
        return new SyncInvoker<UpdateRolesRequest, UpdateRolesResponse>(request, LakeFormationMeta.updateRoles,
            hcClient);
    }

    /**
     * 获取租户的用户组
     *
     * 获取租户的用户组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListGroupsForDomainRequest 请求对象
     * @return ListGroupsForDomainResponse
     */
    public ListGroupsForDomainResponse listGroupsForDomain(ListGroupsForDomainRequest request) {
        return hcClient.syncInvokeHttp(request, LakeFormationMeta.listGroupsForDomain);
    }

    /**
     * 获取租户的用户组
     *
     * 获取租户的用户组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListGroupsForDomainRequest 请求对象
     * @return SyncInvoker<ListGroupsForDomainRequest, ListGroupsForDomainResponse>
     */
    public SyncInvoker<ListGroupsForDomainRequest, ListGroupsForDomainResponse> listGroupsForDomainInvoker(
        ListGroupsForDomainRequest request) {
        return new SyncInvoker<ListGroupsForDomainRequest, ListGroupsForDomainResponse>(request,
            LakeFormationMeta.listGroupsForDomain, hcClient);
    }

}
