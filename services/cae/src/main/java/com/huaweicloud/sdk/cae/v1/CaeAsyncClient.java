package com.huaweicloud.sdk.cae.v1;

import com.huaweicloud.sdk.cae.v1.model.CreateAgencyRequest;
import com.huaweicloud.sdk.cae.v1.model.CreateAgencyResponse;
import com.huaweicloud.sdk.cae.v1.model.CreateApplicationRequest;
import com.huaweicloud.sdk.cae.v1.model.CreateApplicationResponse;
import com.huaweicloud.sdk.cae.v1.model.CreateCertificateRequest;
import com.huaweicloud.sdk.cae.v1.model.CreateCertificateResponse;
import com.huaweicloud.sdk.cae.v1.model.CreateComponentConfigurationRequest;
import com.huaweicloud.sdk.cae.v1.model.CreateComponentConfigurationResponse;
import com.huaweicloud.sdk.cae.v1.model.CreateComponentRequest;
import com.huaweicloud.sdk.cae.v1.model.CreateComponentResponse;
import com.huaweicloud.sdk.cae.v1.model.CreateDomainRequest;
import com.huaweicloud.sdk.cae.v1.model.CreateDomainResponse;
import com.huaweicloud.sdk.cae.v1.model.CreateEnvironmentRequest;
import com.huaweicloud.sdk.cae.v1.model.CreateEnvironmentResponse;
import com.huaweicloud.sdk.cae.v1.model.CreateTimerRuleRequest;
import com.huaweicloud.sdk.cae.v1.model.CreateTimerRuleResponse;
import com.huaweicloud.sdk.cae.v1.model.CreateVolumeRequest;
import com.huaweicloud.sdk.cae.v1.model.CreateVolumeResponse;
import com.huaweicloud.sdk.cae.v1.model.DeleteApplicationRequest;
import com.huaweicloud.sdk.cae.v1.model.DeleteApplicationResponse;
import com.huaweicloud.sdk.cae.v1.model.DeleteCertificateRequest;
import com.huaweicloud.sdk.cae.v1.model.DeleteCertificateResponse;
import com.huaweicloud.sdk.cae.v1.model.DeleteComponentConfigurationRequest;
import com.huaweicloud.sdk.cae.v1.model.DeleteComponentConfigurationResponse;
import com.huaweicloud.sdk.cae.v1.model.DeleteComponentRequest;
import com.huaweicloud.sdk.cae.v1.model.DeleteComponentResponse;
import com.huaweicloud.sdk.cae.v1.model.DeleteDomainRequest;
import com.huaweicloud.sdk.cae.v1.model.DeleteDomainResponse;
import com.huaweicloud.sdk.cae.v1.model.DeleteEnvironmentRequest;
import com.huaweicloud.sdk.cae.v1.model.DeleteEnvironmentResponse;
import com.huaweicloud.sdk.cae.v1.model.DeleteTimerRuleRequest;
import com.huaweicloud.sdk.cae.v1.model.DeleteTimerRuleResponse;
import com.huaweicloud.sdk.cae.v1.model.DeleteVolumeRequest;
import com.huaweicloud.sdk.cae.v1.model.DeleteVolumeResponse;
import com.huaweicloud.sdk.cae.v1.model.ExecuteActionRequest;
import com.huaweicloud.sdk.cae.v1.model.ExecuteActionResponse;
import com.huaweicloud.sdk.cae.v1.model.ListAgenciesRequest;
import com.huaweicloud.sdk.cae.v1.model.ListAgenciesResponse;
import com.huaweicloud.sdk.cae.v1.model.ListApplicationsRequest;
import com.huaweicloud.sdk.cae.v1.model.ListApplicationsResponse;
import com.huaweicloud.sdk.cae.v1.model.ListCertificatesRequest;
import com.huaweicloud.sdk.cae.v1.model.ListCertificatesResponse;
import com.huaweicloud.sdk.cae.v1.model.ListComponentConfigurationsRequest;
import com.huaweicloud.sdk.cae.v1.model.ListComponentConfigurationsResponse;
import com.huaweicloud.sdk.cae.v1.model.ListComponentEventsRequest;
import com.huaweicloud.sdk.cae.v1.model.ListComponentEventsResponse;
import com.huaweicloud.sdk.cae.v1.model.ListComponentInstancesRequest;
import com.huaweicloud.sdk.cae.v1.model.ListComponentInstancesResponse;
import com.huaweicloud.sdk.cae.v1.model.ListComponentSnapshotsRequest;
import com.huaweicloud.sdk.cae.v1.model.ListComponentSnapshotsResponse;
import com.huaweicloud.sdk.cae.v1.model.ListComponentsRequest;
import com.huaweicloud.sdk.cae.v1.model.ListComponentsResponse;
import com.huaweicloud.sdk.cae.v1.model.ListDomainsRequest;
import com.huaweicloud.sdk.cae.v1.model.ListDomainsResponse;
import com.huaweicloud.sdk.cae.v1.model.ListEipsRequest;
import com.huaweicloud.sdk.cae.v1.model.ListEipsResponse;
import com.huaweicloud.sdk.cae.v1.model.ListEnvironmentsRequest;
import com.huaweicloud.sdk.cae.v1.model.ListEnvironmentsResponse;
import com.huaweicloud.sdk.cae.v1.model.ListTimerRulesRequest;
import com.huaweicloud.sdk.cae.v1.model.ListTimerRulesResponse;
import com.huaweicloud.sdk.cae.v1.model.ListVolumesRequest;
import com.huaweicloud.sdk.cae.v1.model.ListVolumesResponse;
import com.huaweicloud.sdk.cae.v1.model.RetryJobRequest;
import com.huaweicloud.sdk.cae.v1.model.RetryJobResponse;
import com.huaweicloud.sdk.cae.v1.model.ShowApplicationRequest;
import com.huaweicloud.sdk.cae.v1.model.ShowApplicationResponse;
import com.huaweicloud.sdk.cae.v1.model.ShowComponentRequest;
import com.huaweicloud.sdk.cae.v1.model.ShowComponentResponse;
import com.huaweicloud.sdk.cae.v1.model.ShowExecutionResultRequest;
import com.huaweicloud.sdk.cae.v1.model.ShowExecutionResultResponse;
import com.huaweicloud.sdk.cae.v1.model.ShowJobRequest;
import com.huaweicloud.sdk.cae.v1.model.ShowJobResponse;
import com.huaweicloud.sdk.cae.v1.model.UpdateCertificateRequest;
import com.huaweicloud.sdk.cae.v1.model.UpdateCertificateResponse;
import com.huaweicloud.sdk.cae.v1.model.UpdateComponentRequest;
import com.huaweicloud.sdk.cae.v1.model.UpdateComponentResponse;
import com.huaweicloud.sdk.cae.v1.model.UpdateEipRequest;
import com.huaweicloud.sdk.cae.v1.model.UpdateEipResponse;
import com.huaweicloud.sdk.cae.v1.model.UpdateTimerRuleRequest;
import com.huaweicloud.sdk.cae.v1.model.UpdateTimerRuleResponse;
import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.AsyncInvoker;

import java.util.concurrent.CompletableFuture;

public class CaeAsyncClient {

    protected HcClient hcClient;

    public CaeAsyncClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<CaeAsyncClient> newBuilder() {
        ClientBuilder<CaeAsyncClient> clientBuilder = new ClientBuilder<>(CaeAsyncClient::new);
        return clientBuilder;
    }

    /**
     * 创建委托
     *
     * 创建委托。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateAgencyRequest 请求对象
     * @return CompletableFuture<CreateAgencyResponse>
     */
    public CompletableFuture<CreateAgencyResponse> createAgencyAsync(CreateAgencyRequest request) {
        return hcClient.asyncInvokeHttp(request, CaeMeta.createAgency);
    }

    /**
     * 创建委托
     *
     * 创建委托。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateAgencyRequest 请求对象
     * @return AsyncInvoker<CreateAgencyRequest, CreateAgencyResponse>
     */
    public AsyncInvoker<CreateAgencyRequest, CreateAgencyResponse> createAgencyAsyncInvoker(
        CreateAgencyRequest request) {
        return new AsyncInvoker<CreateAgencyRequest, CreateAgencyResponse>(request, CaeMeta.createAgency, hcClient);
    }

    /**
     * 获取委托列表
     *
     * 获取委托列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListAgenciesRequest 请求对象
     * @return CompletableFuture<ListAgenciesResponse>
     */
    public CompletableFuture<ListAgenciesResponse> listAgenciesAsync(ListAgenciesRequest request) {
        return hcClient.asyncInvokeHttp(request, CaeMeta.listAgencies);
    }

    /**
     * 获取委托列表
     *
     * 获取委托列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListAgenciesRequest 请求对象
     * @return AsyncInvoker<ListAgenciesRequest, ListAgenciesResponse>
     */
    public AsyncInvoker<ListAgenciesRequest, ListAgenciesResponse> listAgenciesAsyncInvoker(
        ListAgenciesRequest request) {
        return new AsyncInvoker<ListAgenciesRequest, ListAgenciesResponse>(request, CaeMeta.listAgencies, hcClient);
    }

    /**
     * 创建应用
     *
     * 创建应用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateApplicationRequest 请求对象
     * @return CompletableFuture<CreateApplicationResponse>
     */
    public CompletableFuture<CreateApplicationResponse> createApplicationAsync(CreateApplicationRequest request) {
        return hcClient.asyncInvokeHttp(request, CaeMeta.createApplication);
    }

    /**
     * 创建应用
     *
     * 创建应用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateApplicationRequest 请求对象
     * @return AsyncInvoker<CreateApplicationRequest, CreateApplicationResponse>
     */
    public AsyncInvoker<CreateApplicationRequest, CreateApplicationResponse> createApplicationAsyncInvoker(
        CreateApplicationRequest request) {
        return new AsyncInvoker<CreateApplicationRequest, CreateApplicationResponse>(request, CaeMeta.createApplication,
            hcClient);
    }

    /**
     * 删除应用
     *
     * 删除应用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteApplicationRequest 请求对象
     * @return CompletableFuture<DeleteApplicationResponse>
     */
    public CompletableFuture<DeleteApplicationResponse> deleteApplicationAsync(DeleteApplicationRequest request) {
        return hcClient.asyncInvokeHttp(request, CaeMeta.deleteApplication);
    }

    /**
     * 删除应用
     *
     * 删除应用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteApplicationRequest 请求对象
     * @return AsyncInvoker<DeleteApplicationRequest, DeleteApplicationResponse>
     */
    public AsyncInvoker<DeleteApplicationRequest, DeleteApplicationResponse> deleteApplicationAsyncInvoker(
        DeleteApplicationRequest request) {
        return new AsyncInvoker<DeleteApplicationRequest, DeleteApplicationResponse>(request, CaeMeta.deleteApplication,
            hcClient);
    }

    /**
     * 获取应用列表
     *
     * 获取应用列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListApplicationsRequest 请求对象
     * @return CompletableFuture<ListApplicationsResponse>
     */
    public CompletableFuture<ListApplicationsResponse> listApplicationsAsync(ListApplicationsRequest request) {
        return hcClient.asyncInvokeHttp(request, CaeMeta.listApplications);
    }

    /**
     * 获取应用列表
     *
     * 获取应用列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListApplicationsRequest 请求对象
     * @return AsyncInvoker<ListApplicationsRequest, ListApplicationsResponse>
     */
    public AsyncInvoker<ListApplicationsRequest, ListApplicationsResponse> listApplicationsAsyncInvoker(
        ListApplicationsRequest request) {
        return new AsyncInvoker<ListApplicationsRequest, ListApplicationsResponse>(request, CaeMeta.listApplications,
            hcClient);
    }

    /**
     * 获取应用详情
     *
     * 获取应用详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowApplicationRequest 请求对象
     * @return CompletableFuture<ShowApplicationResponse>
     */
    public CompletableFuture<ShowApplicationResponse> showApplicationAsync(ShowApplicationRequest request) {
        return hcClient.asyncInvokeHttp(request, CaeMeta.showApplication);
    }

    /**
     * 获取应用详情
     *
     * 获取应用详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowApplicationRequest 请求对象
     * @return AsyncInvoker<ShowApplicationRequest, ShowApplicationResponse>
     */
    public AsyncInvoker<ShowApplicationRequest, ShowApplicationResponse> showApplicationAsyncInvoker(
        ShowApplicationRequest request) {
        return new AsyncInvoker<ShowApplicationRequest, ShowApplicationResponse>(request, CaeMeta.showApplication,
            hcClient);
    }

    /**
     * 创建证书
     *
     * 创建证书。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateCertificateRequest 请求对象
     * @return CompletableFuture<CreateCertificateResponse>
     */
    public CompletableFuture<CreateCertificateResponse> createCertificateAsync(CreateCertificateRequest request) {
        return hcClient.asyncInvokeHttp(request, CaeMeta.createCertificate);
    }

    /**
     * 创建证书
     *
     * 创建证书。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateCertificateRequest 请求对象
     * @return AsyncInvoker<CreateCertificateRequest, CreateCertificateResponse>
     */
    public AsyncInvoker<CreateCertificateRequest, CreateCertificateResponse> createCertificateAsyncInvoker(
        CreateCertificateRequest request) {
        return new AsyncInvoker<CreateCertificateRequest, CreateCertificateResponse>(request, CaeMeta.createCertificate,
            hcClient);
    }

    /**
     * 删除证书
     *
     * 删除证书。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteCertificateRequest 请求对象
     * @return CompletableFuture<DeleteCertificateResponse>
     */
    public CompletableFuture<DeleteCertificateResponse> deleteCertificateAsync(DeleteCertificateRequest request) {
        return hcClient.asyncInvokeHttp(request, CaeMeta.deleteCertificate);
    }

    /**
     * 删除证书
     *
     * 删除证书。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteCertificateRequest 请求对象
     * @return AsyncInvoker<DeleteCertificateRequest, DeleteCertificateResponse>
     */
    public AsyncInvoker<DeleteCertificateRequest, DeleteCertificateResponse> deleteCertificateAsyncInvoker(
        DeleteCertificateRequest request) {
        return new AsyncInvoker<DeleteCertificateRequest, DeleteCertificateResponse>(request, CaeMeta.deleteCertificate,
            hcClient);
    }

    /**
     * 获取证书列表
     *
     * 获取证书列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListCertificatesRequest 请求对象
     * @return CompletableFuture<ListCertificatesResponse>
     */
    public CompletableFuture<ListCertificatesResponse> listCertificatesAsync(ListCertificatesRequest request) {
        return hcClient.asyncInvokeHttp(request, CaeMeta.listCertificates);
    }

    /**
     * 获取证书列表
     *
     * 获取证书列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListCertificatesRequest 请求对象
     * @return AsyncInvoker<ListCertificatesRequest, ListCertificatesResponse>
     */
    public AsyncInvoker<ListCertificatesRequest, ListCertificatesResponse> listCertificatesAsyncInvoker(
        ListCertificatesRequest request) {
        return new AsyncInvoker<ListCertificatesRequest, ListCertificatesResponse>(request, CaeMeta.listCertificates,
            hcClient);
    }

    /**
     * 修改证书
     *
     * 修改证书。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateCertificateRequest 请求对象
     * @return CompletableFuture<UpdateCertificateResponse>
     */
    public CompletableFuture<UpdateCertificateResponse> updateCertificateAsync(UpdateCertificateRequest request) {
        return hcClient.asyncInvokeHttp(request, CaeMeta.updateCertificate);
    }

    /**
     * 修改证书
     *
     * 修改证书。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateCertificateRequest 请求对象
     * @return AsyncInvoker<UpdateCertificateRequest, UpdateCertificateResponse>
     */
    public AsyncInvoker<UpdateCertificateRequest, UpdateCertificateResponse> updateCertificateAsyncInvoker(
        UpdateCertificateRequest request) {
        return new AsyncInvoker<UpdateCertificateRequest, UpdateCertificateResponse>(request, CaeMeta.updateCertificate,
            hcClient);
    }

    /**
     * 创建组件
     *
     * 创建组件。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateComponentRequest 请求对象
     * @return CompletableFuture<CreateComponentResponse>
     */
    public CompletableFuture<CreateComponentResponse> createComponentAsync(CreateComponentRequest request) {
        return hcClient.asyncInvokeHttp(request, CaeMeta.createComponent);
    }

    /**
     * 创建组件
     *
     * 创建组件。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateComponentRequest 请求对象
     * @return AsyncInvoker<CreateComponentRequest, CreateComponentResponse>
     */
    public AsyncInvoker<CreateComponentRequest, CreateComponentResponse> createComponentAsyncInvoker(
        CreateComponentRequest request) {
        return new AsyncInvoker<CreateComponentRequest, CreateComponentResponse>(request, CaeMeta.createComponent,
            hcClient);
    }

    /**
     * 删除组件
     *
     * 删除组件。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteComponentRequest 请求对象
     * @return CompletableFuture<DeleteComponentResponse>
     */
    public CompletableFuture<DeleteComponentResponse> deleteComponentAsync(DeleteComponentRequest request) {
        return hcClient.asyncInvokeHttp(request, CaeMeta.deleteComponent);
    }

    /**
     * 删除组件
     *
     * 删除组件。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteComponentRequest 请求对象
     * @return AsyncInvoker<DeleteComponentRequest, DeleteComponentResponse>
     */
    public AsyncInvoker<DeleteComponentRequest, DeleteComponentResponse> deleteComponentAsyncInvoker(
        DeleteComponentRequest request) {
        return new AsyncInvoker<DeleteComponentRequest, DeleteComponentResponse>(request, CaeMeta.deleteComponent,
            hcClient);
    }

    /**
     * 操作组件
     *
     * 对组件执行指定操作，如部署、升级、重启、停止、启动、伸缩、配置、回滚。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ExecuteActionRequest 请求对象
     * @return CompletableFuture<ExecuteActionResponse>
     */
    public CompletableFuture<ExecuteActionResponse> executeActionAsync(ExecuteActionRequest request) {
        return hcClient.asyncInvokeHttp(request, CaeMeta.executeAction);
    }

    /**
     * 操作组件
     *
     * 对组件执行指定操作，如部署、升级、重启、停止、启动、伸缩、配置、回滚。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ExecuteActionRequest 请求对象
     * @return AsyncInvoker<ExecuteActionRequest, ExecuteActionResponse>
     */
    public AsyncInvoker<ExecuteActionRequest, ExecuteActionResponse> executeActionAsyncInvoker(
        ExecuteActionRequest request) {
        return new AsyncInvoker<ExecuteActionRequest, ExecuteActionResponse>(request, CaeMeta.executeAction, hcClient);
    }

    /**
     * 获取组件事件列表
     *
     * 获取组件事件列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListComponentEventsRequest 请求对象
     * @return CompletableFuture<ListComponentEventsResponse>
     */
    public CompletableFuture<ListComponentEventsResponse> listComponentEventsAsync(ListComponentEventsRequest request) {
        return hcClient.asyncInvokeHttp(request, CaeMeta.listComponentEvents);
    }

    /**
     * 获取组件事件列表
     *
     * 获取组件事件列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListComponentEventsRequest 请求对象
     * @return AsyncInvoker<ListComponentEventsRequest, ListComponentEventsResponse>
     */
    public AsyncInvoker<ListComponentEventsRequest, ListComponentEventsResponse> listComponentEventsAsyncInvoker(
        ListComponentEventsRequest request) {
        return new AsyncInvoker<ListComponentEventsRequest, ListComponentEventsResponse>(request,
            CaeMeta.listComponentEvents, hcClient);
    }

    /**
     * 获取组件实例列表
     *
     * 获取组件实例列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListComponentInstancesRequest 请求对象
     * @return CompletableFuture<ListComponentInstancesResponse>
     */
    public CompletableFuture<ListComponentInstancesResponse> listComponentInstancesAsync(
        ListComponentInstancesRequest request) {
        return hcClient.asyncInvokeHttp(request, CaeMeta.listComponentInstances);
    }

    /**
     * 获取组件实例列表
     *
     * 获取组件实例列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListComponentInstancesRequest 请求对象
     * @return AsyncInvoker<ListComponentInstancesRequest, ListComponentInstancesResponse>
     */
    public AsyncInvoker<ListComponentInstancesRequest, ListComponentInstancesResponse> listComponentInstancesAsyncInvoker(
        ListComponentInstancesRequest request) {
        return new AsyncInvoker<ListComponentInstancesRequest, ListComponentInstancesResponse>(request,
            CaeMeta.listComponentInstances, hcClient);
    }

    /**
     * 获取组件快照列表
     *
     * 获取组件快照列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListComponentSnapshotsRequest 请求对象
     * @return CompletableFuture<ListComponentSnapshotsResponse>
     */
    public CompletableFuture<ListComponentSnapshotsResponse> listComponentSnapshotsAsync(
        ListComponentSnapshotsRequest request) {
        return hcClient.asyncInvokeHttp(request, CaeMeta.listComponentSnapshots);
    }

    /**
     * 获取组件快照列表
     *
     * 获取组件快照列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListComponentSnapshotsRequest 请求对象
     * @return AsyncInvoker<ListComponentSnapshotsRequest, ListComponentSnapshotsResponse>
     */
    public AsyncInvoker<ListComponentSnapshotsRequest, ListComponentSnapshotsResponse> listComponentSnapshotsAsyncInvoker(
        ListComponentSnapshotsRequest request) {
        return new AsyncInvoker<ListComponentSnapshotsRequest, ListComponentSnapshotsResponse>(request,
            CaeMeta.listComponentSnapshots, hcClient);
    }

    /**
     * 获取组件列表
     *
     * 获取组件列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListComponentsRequest 请求对象
     * @return CompletableFuture<ListComponentsResponse>
     */
    public CompletableFuture<ListComponentsResponse> listComponentsAsync(ListComponentsRequest request) {
        return hcClient.asyncInvokeHttp(request, CaeMeta.listComponents);
    }

    /**
     * 获取组件列表
     *
     * 获取组件列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListComponentsRequest 请求对象
     * @return AsyncInvoker<ListComponentsRequest, ListComponentsResponse>
     */
    public AsyncInvoker<ListComponentsRequest, ListComponentsResponse> listComponentsAsyncInvoker(
        ListComponentsRequest request) {
        return new AsyncInvoker<ListComponentsRequest, ListComponentsResponse>(request, CaeMeta.listComponents,
            hcClient);
    }

    /**
     * 获取组件详情
     *
     * 获取组件详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowComponentRequest 请求对象
     * @return CompletableFuture<ShowComponentResponse>
     */
    public CompletableFuture<ShowComponentResponse> showComponentAsync(ShowComponentRequest request) {
        return hcClient.asyncInvokeHttp(request, CaeMeta.showComponent);
    }

    /**
     * 获取组件详情
     *
     * 获取组件详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowComponentRequest 请求对象
     * @return AsyncInvoker<ShowComponentRequest, ShowComponentResponse>
     */
    public AsyncInvoker<ShowComponentRequest, ShowComponentResponse> showComponentAsyncInvoker(
        ShowComponentRequest request) {
        return new AsyncInvoker<ShowComponentRequest, ShowComponentResponse>(request, CaeMeta.showComponent, hcClient);
    }

    /**
     * 更新组件
     *
     * 更新组件。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateComponentRequest 请求对象
     * @return CompletableFuture<UpdateComponentResponse>
     */
    public CompletableFuture<UpdateComponentResponse> updateComponentAsync(UpdateComponentRequest request) {
        return hcClient.asyncInvokeHttp(request, CaeMeta.updateComponent);
    }

    /**
     * 更新组件
     *
     * 更新组件。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateComponentRequest 请求对象
     * @return AsyncInvoker<UpdateComponentRequest, UpdateComponentResponse>
     */
    public AsyncInvoker<UpdateComponentRequest, UpdateComponentResponse> updateComponentAsyncInvoker(
        UpdateComponentRequest request) {
        return new AsyncInvoker<UpdateComponentRequest, UpdateComponentResponse>(request, CaeMeta.updateComponent,
            hcClient);
    }

    /**
     * 创建组件配置
     *
     * 创建组件配置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateComponentConfigurationRequest 请求对象
     * @return CompletableFuture<CreateComponentConfigurationResponse>
     */
    public CompletableFuture<CreateComponentConfigurationResponse> createComponentConfigurationAsync(
        CreateComponentConfigurationRequest request) {
        return hcClient.asyncInvokeHttp(request, CaeMeta.createComponentConfiguration);
    }

    /**
     * 创建组件配置
     *
     * 创建组件配置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateComponentConfigurationRequest 请求对象
     * @return AsyncInvoker<CreateComponentConfigurationRequest, CreateComponentConfigurationResponse>
     */
    public AsyncInvoker<CreateComponentConfigurationRequest, CreateComponentConfigurationResponse> createComponentConfigurationAsyncInvoker(
        CreateComponentConfigurationRequest request) {
        return new AsyncInvoker<CreateComponentConfigurationRequest, CreateComponentConfigurationResponse>(request,
            CaeMeta.createComponentConfiguration, hcClient);
    }

    /**
     * 删除组件配置
     *
     * 删除组件配置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteComponentConfigurationRequest 请求对象
     * @return CompletableFuture<DeleteComponentConfigurationResponse>
     */
    public CompletableFuture<DeleteComponentConfigurationResponse> deleteComponentConfigurationAsync(
        DeleteComponentConfigurationRequest request) {
        return hcClient.asyncInvokeHttp(request, CaeMeta.deleteComponentConfiguration);
    }

    /**
     * 删除组件配置
     *
     * 删除组件配置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteComponentConfigurationRequest 请求对象
     * @return AsyncInvoker<DeleteComponentConfigurationRequest, DeleteComponentConfigurationResponse>
     */
    public AsyncInvoker<DeleteComponentConfigurationRequest, DeleteComponentConfigurationResponse> deleteComponentConfigurationAsyncInvoker(
        DeleteComponentConfigurationRequest request) {
        return new AsyncInvoker<DeleteComponentConfigurationRequest, DeleteComponentConfigurationResponse>(request,
            CaeMeta.deleteComponentConfiguration, hcClient);
    }

    /**
     * 获取组件配置列表
     *
     * 获取组件配置列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListComponentConfigurationsRequest 请求对象
     * @return CompletableFuture<ListComponentConfigurationsResponse>
     */
    public CompletableFuture<ListComponentConfigurationsResponse> listComponentConfigurationsAsync(
        ListComponentConfigurationsRequest request) {
        return hcClient.asyncInvokeHttp(request, CaeMeta.listComponentConfigurations);
    }

    /**
     * 获取组件配置列表
     *
     * 获取组件配置列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListComponentConfigurationsRequest 请求对象
     * @return AsyncInvoker<ListComponentConfigurationsRequest, ListComponentConfigurationsResponse>
     */
    public AsyncInvoker<ListComponentConfigurationsRequest, ListComponentConfigurationsResponse> listComponentConfigurationsAsyncInvoker(
        ListComponentConfigurationsRequest request) {
        return new AsyncInvoker<ListComponentConfigurationsRequest, ListComponentConfigurationsResponse>(request,
            CaeMeta.listComponentConfigurations, hcClient);
    }

    /**
     * 创建域名
     *
     * 创建域名。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateDomainRequest 请求对象
     * @return CompletableFuture<CreateDomainResponse>
     */
    public CompletableFuture<CreateDomainResponse> createDomainAsync(CreateDomainRequest request) {
        return hcClient.asyncInvokeHttp(request, CaeMeta.createDomain);
    }

    /**
     * 创建域名
     *
     * 创建域名。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateDomainRequest 请求对象
     * @return AsyncInvoker<CreateDomainRequest, CreateDomainResponse>
     */
    public AsyncInvoker<CreateDomainRequest, CreateDomainResponse> createDomainAsyncInvoker(
        CreateDomainRequest request) {
        return new AsyncInvoker<CreateDomainRequest, CreateDomainResponse>(request, CaeMeta.createDomain, hcClient);
    }

    /**
     * 删除域名
     *
     * 删除域名。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteDomainRequest 请求对象
     * @return CompletableFuture<DeleteDomainResponse>
     */
    public CompletableFuture<DeleteDomainResponse> deleteDomainAsync(DeleteDomainRequest request) {
        return hcClient.asyncInvokeHttp(request, CaeMeta.deleteDomain);
    }

    /**
     * 删除域名
     *
     * 删除域名。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteDomainRequest 请求对象
     * @return AsyncInvoker<DeleteDomainRequest, DeleteDomainResponse>
     */
    public AsyncInvoker<DeleteDomainRequest, DeleteDomainResponse> deleteDomainAsyncInvoker(
        DeleteDomainRequest request) {
        return new AsyncInvoker<DeleteDomainRequest, DeleteDomainResponse>(request, CaeMeta.deleteDomain, hcClient);
    }

    /**
     * 获取域名列表
     *
     * 获取域名列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListDomainsRequest 请求对象
     * @return CompletableFuture<ListDomainsResponse>
     */
    public CompletableFuture<ListDomainsResponse> listDomainsAsync(ListDomainsRequest request) {
        return hcClient.asyncInvokeHttp(request, CaeMeta.listDomains);
    }

    /**
     * 获取域名列表
     *
     * 获取域名列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListDomainsRequest 请求对象
     * @return AsyncInvoker<ListDomainsRequest, ListDomainsResponse>
     */
    public AsyncInvoker<ListDomainsRequest, ListDomainsResponse> listDomainsAsyncInvoker(ListDomainsRequest request) {
        return new AsyncInvoker<ListDomainsRequest, ListDomainsResponse>(request, CaeMeta.listDomains, hcClient);
    }

    /**
     * 获取集群节点弹性公网IP列表
     *
     * 获取集群节点弹性公网IP列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListEipsRequest 请求对象
     * @return CompletableFuture<ListEipsResponse>
     */
    public CompletableFuture<ListEipsResponse> listEipsAsync(ListEipsRequest request) {
        return hcClient.asyncInvokeHttp(request, CaeMeta.listEips);
    }

    /**
     * 获取集群节点弹性公网IP列表
     *
     * 获取集群节点弹性公网IP列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListEipsRequest 请求对象
     * @return AsyncInvoker<ListEipsRequest, ListEipsResponse>
     */
    public AsyncInvoker<ListEipsRequest, ListEipsResponse> listEipsAsyncInvoker(ListEipsRequest request) {
        return new AsyncInvoker<ListEipsRequest, ListEipsResponse>(request, CaeMeta.listEips, hcClient);
    }

    /**
     * 修改带宽
     *
     * 修改带宽。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateEipRequest 请求对象
     * @return CompletableFuture<UpdateEipResponse>
     */
    public CompletableFuture<UpdateEipResponse> updateEipAsync(UpdateEipRequest request) {
        return hcClient.asyncInvokeHttp(request, CaeMeta.updateEip);
    }

    /**
     * 修改带宽
     *
     * 修改带宽。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateEipRequest 请求对象
     * @return AsyncInvoker<UpdateEipRequest, UpdateEipResponse>
     */
    public AsyncInvoker<UpdateEipRequest, UpdateEipResponse> updateEipAsyncInvoker(UpdateEipRequest request) {
        return new AsyncInvoker<UpdateEipRequest, UpdateEipResponse>(request, CaeMeta.updateEip, hcClient);
    }

    /**
     * 创建环境
     *
     * 创建环境。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateEnvironmentRequest 请求对象
     * @return CompletableFuture<CreateEnvironmentResponse>
     */
    public CompletableFuture<CreateEnvironmentResponse> createEnvironmentAsync(CreateEnvironmentRequest request) {
        return hcClient.asyncInvokeHttp(request, CaeMeta.createEnvironment);
    }

    /**
     * 创建环境
     *
     * 创建环境。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateEnvironmentRequest 请求对象
     * @return AsyncInvoker<CreateEnvironmentRequest, CreateEnvironmentResponse>
     */
    public AsyncInvoker<CreateEnvironmentRequest, CreateEnvironmentResponse> createEnvironmentAsyncInvoker(
        CreateEnvironmentRequest request) {
        return new AsyncInvoker<CreateEnvironmentRequest, CreateEnvironmentResponse>(request, CaeMeta.createEnvironment,
            hcClient);
    }

    /**
     * 删除环境
     *
     * 删除环境。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteEnvironmentRequest 请求对象
     * @return CompletableFuture<DeleteEnvironmentResponse>
     */
    public CompletableFuture<DeleteEnvironmentResponse> deleteEnvironmentAsync(DeleteEnvironmentRequest request) {
        return hcClient.asyncInvokeHttp(request, CaeMeta.deleteEnvironment);
    }

    /**
     * 删除环境
     *
     * 删除环境。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteEnvironmentRequest 请求对象
     * @return AsyncInvoker<DeleteEnvironmentRequest, DeleteEnvironmentResponse>
     */
    public AsyncInvoker<DeleteEnvironmentRequest, DeleteEnvironmentResponse> deleteEnvironmentAsyncInvoker(
        DeleteEnvironmentRequest request) {
        return new AsyncInvoker<DeleteEnvironmentRequest, DeleteEnvironmentResponse>(request, CaeMeta.deleteEnvironment,
            hcClient);
    }

    /**
     * 获取环境列表
     *
     * 获取环境列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListEnvironmentsRequest 请求对象
     * @return CompletableFuture<ListEnvironmentsResponse>
     */
    public CompletableFuture<ListEnvironmentsResponse> listEnvironmentsAsync(ListEnvironmentsRequest request) {
        return hcClient.asyncInvokeHttp(request, CaeMeta.listEnvironments);
    }

    /**
     * 获取环境列表
     *
     * 获取环境列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListEnvironmentsRequest 请求对象
     * @return AsyncInvoker<ListEnvironmentsRequest, ListEnvironmentsResponse>
     */
    public AsyncInvoker<ListEnvironmentsRequest, ListEnvironmentsResponse> listEnvironmentsAsyncInvoker(
        ListEnvironmentsRequest request) {
        return new AsyncInvoker<ListEnvironmentsRequest, ListEnvironmentsResponse>(request, CaeMeta.listEnvironments,
            hcClient);
    }

    /**
     * 重试任务
     *
     * 重试任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RetryJobRequest 请求对象
     * @return CompletableFuture<RetryJobResponse>
     */
    public CompletableFuture<RetryJobResponse> retryJobAsync(RetryJobRequest request) {
        return hcClient.asyncInvokeHttp(request, CaeMeta.retryJob);
    }

    /**
     * 重试任务
     *
     * 重试任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RetryJobRequest 请求对象
     * @return AsyncInvoker<RetryJobRequest, RetryJobResponse>
     */
    public AsyncInvoker<RetryJobRequest, RetryJobResponse> retryJobAsyncInvoker(RetryJobRequest request) {
        return new AsyncInvoker<RetryJobRequest, RetryJobResponse>(request, CaeMeta.retryJob, hcClient);
    }

    /**
     * 获取任务详情
     *
     * 获取任务详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowJobRequest 请求对象
     * @return CompletableFuture<ShowJobResponse>
     */
    public CompletableFuture<ShowJobResponse> showJobAsync(ShowJobRequest request) {
        return hcClient.asyncInvokeHttp(request, CaeMeta.showJob);
    }

    /**
     * 获取任务详情
     *
     * 获取任务详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowJobRequest 请求对象
     * @return AsyncInvoker<ShowJobRequest, ShowJobResponse>
     */
    public AsyncInvoker<ShowJobRequest, ShowJobResponse> showJobAsyncInvoker(ShowJobRequest request) {
        return new AsyncInvoker<ShowJobRequest, ShowJobResponse>(request, CaeMeta.showJob, hcClient);
    }

    /**
     * 创建定时启停规则
     *
     * 创建定时启停规则。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateTimerRuleRequest 请求对象
     * @return CompletableFuture<CreateTimerRuleResponse>
     */
    public CompletableFuture<CreateTimerRuleResponse> createTimerRuleAsync(CreateTimerRuleRequest request) {
        return hcClient.asyncInvokeHttp(request, CaeMeta.createTimerRule);
    }

    /**
     * 创建定时启停规则
     *
     * 创建定时启停规则。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateTimerRuleRequest 请求对象
     * @return AsyncInvoker<CreateTimerRuleRequest, CreateTimerRuleResponse>
     */
    public AsyncInvoker<CreateTimerRuleRequest, CreateTimerRuleResponse> createTimerRuleAsyncInvoker(
        CreateTimerRuleRequest request) {
        return new AsyncInvoker<CreateTimerRuleRequest, CreateTimerRuleResponse>(request, CaeMeta.createTimerRule,
            hcClient);
    }

    /**
     * 删除定时启停规则
     *
     * 删除定时启停规则。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteTimerRuleRequest 请求对象
     * @return CompletableFuture<DeleteTimerRuleResponse>
     */
    public CompletableFuture<DeleteTimerRuleResponse> deleteTimerRuleAsync(DeleteTimerRuleRequest request) {
        return hcClient.asyncInvokeHttp(request, CaeMeta.deleteTimerRule);
    }

    /**
     * 删除定时启停规则
     *
     * 删除定时启停规则。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteTimerRuleRequest 请求对象
     * @return AsyncInvoker<DeleteTimerRuleRequest, DeleteTimerRuleResponse>
     */
    public AsyncInvoker<DeleteTimerRuleRequest, DeleteTimerRuleResponse> deleteTimerRuleAsyncInvoker(
        DeleteTimerRuleRequest request) {
        return new AsyncInvoker<DeleteTimerRuleRequest, DeleteTimerRuleResponse>(request, CaeMeta.deleteTimerRule,
            hcClient);
    }

    /**
     * 获取定时启停规则列表
     *
     * 获取定时启停规则列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListTimerRulesRequest 请求对象
     * @return CompletableFuture<ListTimerRulesResponse>
     */
    public CompletableFuture<ListTimerRulesResponse> listTimerRulesAsync(ListTimerRulesRequest request) {
        return hcClient.asyncInvokeHttp(request, CaeMeta.listTimerRules);
    }

    /**
     * 获取定时启停规则列表
     *
     * 获取定时启停规则列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListTimerRulesRequest 请求对象
     * @return AsyncInvoker<ListTimerRulesRequest, ListTimerRulesResponse>
     */
    public AsyncInvoker<ListTimerRulesRequest, ListTimerRulesResponse> listTimerRulesAsyncInvoker(
        ListTimerRulesRequest request) {
        return new AsyncInvoker<ListTimerRulesRequest, ListTimerRulesResponse>(request, CaeMeta.listTimerRules,
            hcClient);
    }

    /**
     * 获取上次定时启停规则的执行情况
     *
     * 获取上次定时启停规则的执行情况。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowExecutionResultRequest 请求对象
     * @return CompletableFuture<ShowExecutionResultResponse>
     */
    public CompletableFuture<ShowExecutionResultResponse> showExecutionResultAsync(ShowExecutionResultRequest request) {
        return hcClient.asyncInvokeHttp(request, CaeMeta.showExecutionResult);
    }

    /**
     * 获取上次定时启停规则的执行情况
     *
     * 获取上次定时启停规则的执行情况。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowExecutionResultRequest 请求对象
     * @return AsyncInvoker<ShowExecutionResultRequest, ShowExecutionResultResponse>
     */
    public AsyncInvoker<ShowExecutionResultRequest, ShowExecutionResultResponse> showExecutionResultAsyncInvoker(
        ShowExecutionResultRequest request) {
        return new AsyncInvoker<ShowExecutionResultRequest, ShowExecutionResultResponse>(request,
            CaeMeta.showExecutionResult, hcClient);
    }

    /**
     * 修改定时启停规则
     *
     * 修改定时启停规则。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateTimerRuleRequest 请求对象
     * @return CompletableFuture<UpdateTimerRuleResponse>
     */
    public CompletableFuture<UpdateTimerRuleResponse> updateTimerRuleAsync(UpdateTimerRuleRequest request) {
        return hcClient.asyncInvokeHttp(request, CaeMeta.updateTimerRule);
    }

    /**
     * 修改定时启停规则
     *
     * 修改定时启停规则。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateTimerRuleRequest 请求对象
     * @return AsyncInvoker<UpdateTimerRuleRequest, UpdateTimerRuleResponse>
     */
    public AsyncInvoker<UpdateTimerRuleRequest, UpdateTimerRuleResponse> updateTimerRuleAsyncInvoker(
        UpdateTimerRuleRequest request) {
        return new AsyncInvoker<UpdateTimerRuleRequest, UpdateTimerRuleResponse>(request, CaeMeta.updateTimerRule,
            hcClient);
    }

    /**
     * 授权云存储
     *
     * 授权云存储。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateVolumeRequest 请求对象
     * @return CompletableFuture<CreateVolumeResponse>
     */
    public CompletableFuture<CreateVolumeResponse> createVolumeAsync(CreateVolumeRequest request) {
        return hcClient.asyncInvokeHttp(request, CaeMeta.createVolume);
    }

    /**
     * 授权云存储
     *
     * 授权云存储。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateVolumeRequest 请求对象
     * @return AsyncInvoker<CreateVolumeRequest, CreateVolumeResponse>
     */
    public AsyncInvoker<CreateVolumeRequest, CreateVolumeResponse> createVolumeAsyncInvoker(
        CreateVolumeRequest request) {
        return new AsyncInvoker<CreateVolumeRequest, CreateVolumeResponse>(request, CaeMeta.createVolume, hcClient);
    }

    /**
     * 解绑云存储
     *
     * 解绑云存储。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteVolumeRequest 请求对象
     * @return CompletableFuture<DeleteVolumeResponse>
     */
    public CompletableFuture<DeleteVolumeResponse> deleteVolumeAsync(DeleteVolumeRequest request) {
        return hcClient.asyncInvokeHttp(request, CaeMeta.deleteVolume);
    }

    /**
     * 解绑云存储
     *
     * 解绑云存储。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteVolumeRequest 请求对象
     * @return AsyncInvoker<DeleteVolumeRequest, DeleteVolumeResponse>
     */
    public AsyncInvoker<DeleteVolumeRequest, DeleteVolumeResponse> deleteVolumeAsyncInvoker(
        DeleteVolumeRequest request) {
        return new AsyncInvoker<DeleteVolumeRequest, DeleteVolumeResponse>(request, CaeMeta.deleteVolume, hcClient);
    }

    /**
     * 获取云存储列表
     *
     * 获取云存储列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListVolumesRequest 请求对象
     * @return CompletableFuture<ListVolumesResponse>
     */
    public CompletableFuture<ListVolumesResponse> listVolumesAsync(ListVolumesRequest request) {
        return hcClient.asyncInvokeHttp(request, CaeMeta.listVolumes);
    }

    /**
     * 获取云存储列表
     *
     * 获取云存储列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListVolumesRequest 请求对象
     * @return AsyncInvoker<ListVolumesRequest, ListVolumesResponse>
     */
    public AsyncInvoker<ListVolumesRequest, ListVolumesResponse> listVolumesAsyncInvoker(ListVolumesRequest request) {
        return new AsyncInvoker<ListVolumesRequest, ListVolumesResponse>(request, CaeMeta.listVolumes, hcClient);
    }

}
