package com.huaweicloud.sdk.servicestage.v3;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.AsyncInvoker;
import com.huaweicloud.sdk.servicestage.v3.model.CreateApplicationRequest;
import com.huaweicloud.sdk.servicestage.v3.model.CreateApplicationResponse;
import com.huaweicloud.sdk.servicestage.v3.model.CreateComponentRequest;
import com.huaweicloud.sdk.servicestage.v3.model.CreateComponentResponse;
import com.huaweicloud.sdk.servicestage.v3.model.CreateEnvironmentRequest;
import com.huaweicloud.sdk.servicestage.v3.model.CreateEnvironmentResponse;
import com.huaweicloud.sdk.servicestage.v3.model.DeleteApplicationConfigurationRequest;
import com.huaweicloud.sdk.servicestage.v3.model.DeleteApplicationConfigurationResponse;
import com.huaweicloud.sdk.servicestage.v3.model.DeleteApplicationRequest;
import com.huaweicloud.sdk.servicestage.v3.model.DeleteApplicationResponse;
import com.huaweicloud.sdk.servicestage.v3.model.DeleteComponentRequest;
import com.huaweicloud.sdk.servicestage.v3.model.DeleteComponentResponse;
import com.huaweicloud.sdk.servicestage.v3.model.DeleteEnvironmentRequest;
import com.huaweicloud.sdk.servicestage.v3.model.DeleteEnvironmentResponse;
import com.huaweicloud.sdk.servicestage.v3.model.ModifyApplicationConfigurationRequest;
import com.huaweicloud.sdk.servicestage.v3.model.ModifyApplicationConfigurationResponse;
import com.huaweicloud.sdk.servicestage.v3.model.ModifyApplicationRequest;
import com.huaweicloud.sdk.servicestage.v3.model.ModifyApplicationResponse;
import com.huaweicloud.sdk.servicestage.v3.model.ModifyComponentRequest;
import com.huaweicloud.sdk.servicestage.v3.model.ModifyComponentResponse;
import com.huaweicloud.sdk.servicestage.v3.model.ModifyEnvironmentRequest;
import com.huaweicloud.sdk.servicestage.v3.model.ModifyEnvironmentResponse;
import com.huaweicloud.sdk.servicestage.v3.model.ModifyResourceInEnvironmentRequest;
import com.huaweicloud.sdk.servicestage.v3.model.ModifyResourceInEnvironmentResponse;
import com.huaweicloud.sdk.servicestage.v3.model.ShowApplicationConfigurationRequest;
import com.huaweicloud.sdk.servicestage.v3.model.ShowApplicationConfigurationResponse;
import com.huaweicloud.sdk.servicestage.v3.model.ShowApplicationInfoRequest;
import com.huaweicloud.sdk.servicestage.v3.model.ShowApplicationInfoResponse;
import com.huaweicloud.sdk.servicestage.v3.model.ShowApplicationsRequest;
import com.huaweicloud.sdk.servicestage.v3.model.ShowApplicationsResponse;
import com.huaweicloud.sdk.servicestage.v3.model.ShowComponentInfoRequest;
import com.huaweicloud.sdk.servicestage.v3.model.ShowComponentInfoResponse;
import com.huaweicloud.sdk.servicestage.v3.model.ShowComponentRecordsRequest;
import com.huaweicloud.sdk.servicestage.v3.model.ShowComponentRecordsResponse;
import com.huaweicloud.sdk.servicestage.v3.model.ShowComponentsInApplicationRequest;
import com.huaweicloud.sdk.servicestage.v3.model.ShowComponentsInApplicationResponse;
import com.huaweicloud.sdk.servicestage.v3.model.ShowComponentsRequest;
import com.huaweicloud.sdk.servicestage.v3.model.ShowComponentsResponse;
import com.huaweicloud.sdk.servicestage.v3.model.ShowEnvironmentInfoRequest;
import com.huaweicloud.sdk.servicestage.v3.model.ShowEnvironmentInfoResponse;
import com.huaweicloud.sdk.servicestage.v3.model.ShowEnvironmentResourcesRequest;
import com.huaweicloud.sdk.servicestage.v3.model.ShowEnvironmentResourcesResponse;
import com.huaweicloud.sdk.servicestage.v3.model.ShowEnvironmentsRequest;
import com.huaweicloud.sdk.servicestage.v3.model.ShowEnvironmentsResponse;
import com.huaweicloud.sdk.servicestage.v3.model.ShowJobInfoRequest;
import com.huaweicloud.sdk.servicestage.v3.model.ShowJobInfoResponse;
import com.huaweicloud.sdk.servicestage.v3.model.ShowRuntimeStacksRequest;
import com.huaweicloud.sdk.servicestage.v3.model.ShowRuntimeStacksResponse;
import com.huaweicloud.sdk.servicestage.v3.model.UpdateComponentActionRequest;
import com.huaweicloud.sdk.servicestage.v3.model.UpdateComponentActionResponse;

import java.util.concurrent.CompletableFuture;

public class ServiceStageAsyncClient {

    protected HcClient hcClient;

    public ServiceStageAsyncClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<ServiceStageAsyncClient> newBuilder() {
        ClientBuilder<ServiceStageAsyncClient> clientBuilder = new ClientBuilder<>(ServiceStageAsyncClient::new);
        return clientBuilder;
    }

    /**
     * 创建应用
     *
     * 应用是一个功能相对完备的业务系统，由一个或多个特性相关的组件组成。
     * 
     * 此API用来创建应用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateApplicationRequest 请求对象
     * @return CompletableFuture<CreateApplicationResponse>
     */
    public CompletableFuture<CreateApplicationResponse> createApplicationAsync(CreateApplicationRequest request) {
        return hcClient.asyncInvokeHttp(request, ServiceStageMeta.createApplication);
    }

    /**
     * 创建应用
     *
     * 应用是一个功能相对完备的业务系统，由一个或多个特性相关的组件组成。
     * 
     * 此API用来创建应用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateApplicationRequest 请求对象
     * @return AsyncInvoker<CreateApplicationRequest, CreateApplicationResponse>
     */
    public AsyncInvoker<CreateApplicationRequest, CreateApplicationResponse> createApplicationAsyncInvoker(
        CreateApplicationRequest request) {
        return new AsyncInvoker<CreateApplicationRequest, CreateApplicationResponse>(request,
            ServiceStageMeta.createApplication, hcClient);
    }

    /**
     * 根据应用ID删除应用
     *
     * 此API通过应用ID删除应用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteApplicationRequest 请求对象
     * @return CompletableFuture<DeleteApplicationResponse>
     */
    public CompletableFuture<DeleteApplicationResponse> deleteApplicationAsync(DeleteApplicationRequest request) {
        return hcClient.asyncInvokeHttp(request, ServiceStageMeta.deleteApplication);
    }

    /**
     * 根据应用ID删除应用
     *
     * 此API通过应用ID删除应用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteApplicationRequest 请求对象
     * @return AsyncInvoker<DeleteApplicationRequest, DeleteApplicationResponse>
     */
    public AsyncInvoker<DeleteApplicationRequest, DeleteApplicationResponse> deleteApplicationAsyncInvoker(
        DeleteApplicationRequest request) {
        return new AsyncInvoker<DeleteApplicationRequest, DeleteApplicationResponse>(request,
            ServiceStageMeta.deleteApplication, hcClient);
    }

    /**
     * 根据应用ID删除应用配置
     *
     * 此API通过应用ID删除应用配置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteApplicationConfigurationRequest 请求对象
     * @return CompletableFuture<DeleteApplicationConfigurationResponse>
     */
    public CompletableFuture<DeleteApplicationConfigurationResponse> deleteApplicationConfigurationAsync(
        DeleteApplicationConfigurationRequest request) {
        return hcClient.asyncInvokeHttp(request, ServiceStageMeta.deleteApplicationConfiguration);
    }

    /**
     * 根据应用ID删除应用配置
     *
     * 此API通过应用ID删除应用配置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteApplicationConfigurationRequest 请求对象
     * @return AsyncInvoker<DeleteApplicationConfigurationRequest, DeleteApplicationConfigurationResponse>
     */
    public AsyncInvoker<DeleteApplicationConfigurationRequest, DeleteApplicationConfigurationResponse> deleteApplicationConfigurationAsyncInvoker(
        DeleteApplicationConfigurationRequest request) {
        return new AsyncInvoker<DeleteApplicationConfigurationRequest, DeleteApplicationConfigurationResponse>(request,
            ServiceStageMeta.deleteApplicationConfiguration, hcClient);
    }

    /**
     * 根据应用ID修改应用信息
     *
     * 此API通过应用ID修改应用信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ModifyApplicationRequest 请求对象
     * @return CompletableFuture<ModifyApplicationResponse>
     */
    public CompletableFuture<ModifyApplicationResponse> modifyApplicationAsync(ModifyApplicationRequest request) {
        return hcClient.asyncInvokeHttp(request, ServiceStageMeta.modifyApplication);
    }

    /**
     * 根据应用ID修改应用信息
     *
     * 此API通过应用ID修改应用信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ModifyApplicationRequest 请求对象
     * @return AsyncInvoker<ModifyApplicationRequest, ModifyApplicationResponse>
     */
    public AsyncInvoker<ModifyApplicationRequest, ModifyApplicationResponse> modifyApplicationAsyncInvoker(
        ModifyApplicationRequest request) {
        return new AsyncInvoker<ModifyApplicationRequest, ModifyApplicationResponse>(request,
            ServiceStageMeta.modifyApplication, hcClient);
    }

    /**
     * 根据应用ID修改应用配置
     *
     * 此API通过应用ID修改应用配置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ModifyApplicationConfigurationRequest 请求对象
     * @return CompletableFuture<ModifyApplicationConfigurationResponse>
     */
    public CompletableFuture<ModifyApplicationConfigurationResponse> modifyApplicationConfigurationAsync(
        ModifyApplicationConfigurationRequest request) {
        return hcClient.asyncInvokeHttp(request, ServiceStageMeta.modifyApplicationConfiguration);
    }

    /**
     * 根据应用ID修改应用配置
     *
     * 此API通过应用ID修改应用配置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ModifyApplicationConfigurationRequest 请求对象
     * @return AsyncInvoker<ModifyApplicationConfigurationRequest, ModifyApplicationConfigurationResponse>
     */
    public AsyncInvoker<ModifyApplicationConfigurationRequest, ModifyApplicationConfigurationResponse> modifyApplicationConfigurationAsyncInvoker(
        ModifyApplicationConfigurationRequest request) {
        return new AsyncInvoker<ModifyApplicationConfigurationRequest, ModifyApplicationConfigurationResponse>(request,
            ServiceStageMeta.modifyApplicationConfiguration, hcClient);
    }

    /**
     * 根据应用ID获取应用配置
     *
     * 此API通过应用ID获取应用配置信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowApplicationConfigurationRequest 请求对象
     * @return CompletableFuture<ShowApplicationConfigurationResponse>
     */
    public CompletableFuture<ShowApplicationConfigurationResponse> showApplicationConfigurationAsync(
        ShowApplicationConfigurationRequest request) {
        return hcClient.asyncInvokeHttp(request, ServiceStageMeta.showApplicationConfiguration);
    }

    /**
     * 根据应用ID获取应用配置
     *
     * 此API通过应用ID获取应用配置信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowApplicationConfigurationRequest 请求对象
     * @return AsyncInvoker<ShowApplicationConfigurationRequest, ShowApplicationConfigurationResponse>
     */
    public AsyncInvoker<ShowApplicationConfigurationRequest, ShowApplicationConfigurationResponse> showApplicationConfigurationAsyncInvoker(
        ShowApplicationConfigurationRequest request) {
        return new AsyncInvoker<ShowApplicationConfigurationRequest, ShowApplicationConfigurationResponse>(request,
            ServiceStageMeta.showApplicationConfiguration, hcClient);
    }

    /**
     * 根据应用ID获取应用详细信息
     *
     * 此API通过应用ID获取应用详细信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowApplicationInfoRequest 请求对象
     * @return CompletableFuture<ShowApplicationInfoResponse>
     */
    public CompletableFuture<ShowApplicationInfoResponse> showApplicationInfoAsync(ShowApplicationInfoRequest request) {
        return hcClient.asyncInvokeHttp(request, ServiceStageMeta.showApplicationInfo);
    }

    /**
     * 根据应用ID获取应用详细信息
     *
     * 此API通过应用ID获取应用详细信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowApplicationInfoRequest 请求对象
     * @return AsyncInvoker<ShowApplicationInfoRequest, ShowApplicationInfoResponse>
     */
    public AsyncInvoker<ShowApplicationInfoRequest, ShowApplicationInfoResponse> showApplicationInfoAsyncInvoker(
        ShowApplicationInfoRequest request) {
        return new AsyncInvoker<ShowApplicationInfoRequest, ShowApplicationInfoResponse>(request,
            ServiceStageMeta.showApplicationInfo, hcClient);
    }

    /**
     * 获取所用应用
     *
     * 获取所有应用信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowApplicationsRequest 请求对象
     * @return CompletableFuture<ShowApplicationsResponse>
     */
    public CompletableFuture<ShowApplicationsResponse> showApplicationsAsync(ShowApplicationsRequest request) {
        return hcClient.asyncInvokeHttp(request, ServiceStageMeta.showApplications);
    }

    /**
     * 获取所用应用
     *
     * 获取所有应用信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowApplicationsRequest 请求对象
     * @return AsyncInvoker<ShowApplicationsRequest, ShowApplicationsResponse>
     */
    public AsyncInvoker<ShowApplicationsRequest, ShowApplicationsResponse> showApplicationsAsyncInvoker(
        ShowApplicationsRequest request) {
        return new AsyncInvoker<ShowApplicationsRequest, ShowApplicationsResponse>(request,
            ServiceStageMeta.showApplications, hcClient);
    }

    /**
     * 应用中创建组件
     *
     * 此API用来在应用中创建组件。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateComponentRequest 请求对象
     * @return CompletableFuture<CreateComponentResponse>
     */
    public CompletableFuture<CreateComponentResponse> createComponentAsync(CreateComponentRequest request) {
        return hcClient.asyncInvokeHttp(request, ServiceStageMeta.createComponent);
    }

    /**
     * 应用中创建组件
     *
     * 此API用来在应用中创建组件。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateComponentRequest 请求对象
     * @return AsyncInvoker<CreateComponentRequest, CreateComponentResponse>
     */
    public AsyncInvoker<CreateComponentRequest, CreateComponentResponse> createComponentAsyncInvoker(
        CreateComponentRequest request) {
        return new AsyncInvoker<CreateComponentRequest, CreateComponentResponse>(request,
            ServiceStageMeta.createComponent, hcClient);
    }

    /**
     * 根据组件ID删除组件
     *
     * 此API通过组件ID删除组件。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteComponentRequest 请求对象
     * @return CompletableFuture<DeleteComponentResponse>
     */
    public CompletableFuture<DeleteComponentResponse> deleteComponentAsync(DeleteComponentRequest request) {
        return hcClient.asyncInvokeHttp(request, ServiceStageMeta.deleteComponent);
    }

    /**
     * 根据组件ID删除组件
     *
     * 此API通过组件ID删除组件。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteComponentRequest 请求对象
     * @return AsyncInvoker<DeleteComponentRequest, DeleteComponentResponse>
     */
    public AsyncInvoker<DeleteComponentRequest, DeleteComponentResponse> deleteComponentAsyncInvoker(
        DeleteComponentRequest request) {
        return new AsyncInvoker<DeleteComponentRequest, DeleteComponentResponse>(request,
            ServiceStageMeta.deleteComponent, hcClient);
    }

    /**
     * 根据组件ID修改组件信息
     *
     * 此API通过组件ID修改组件信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ModifyComponentRequest 请求对象
     * @return CompletableFuture<ModifyComponentResponse>
     */
    public CompletableFuture<ModifyComponentResponse> modifyComponentAsync(ModifyComponentRequest request) {
        return hcClient.asyncInvokeHttp(request, ServiceStageMeta.modifyComponent);
    }

    /**
     * 根据组件ID修改组件信息
     *
     * 此API通过组件ID修改组件信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ModifyComponentRequest 请求对象
     * @return AsyncInvoker<ModifyComponentRequest, ModifyComponentResponse>
     */
    public AsyncInvoker<ModifyComponentRequest, ModifyComponentResponse> modifyComponentAsyncInvoker(
        ModifyComponentRequest request) {
        return new AsyncInvoker<ModifyComponentRequest, ModifyComponentResponse>(request,
            ServiceStageMeta.modifyComponent, hcClient);
    }

    /**
     * 根据组件ID获取组件信息
     *
     * 通过组件ID获取组件信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowComponentInfoRequest 请求对象
     * @return CompletableFuture<ShowComponentInfoResponse>
     */
    public CompletableFuture<ShowComponentInfoResponse> showComponentInfoAsync(ShowComponentInfoRequest request) {
        return hcClient.asyncInvokeHttp(request, ServiceStageMeta.showComponentInfo);
    }

    /**
     * 根据组件ID获取组件信息
     *
     * 通过组件ID获取组件信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowComponentInfoRequest 请求对象
     * @return AsyncInvoker<ShowComponentInfoRequest, ShowComponentInfoResponse>
     */
    public AsyncInvoker<ShowComponentInfoRequest, ShowComponentInfoResponse> showComponentInfoAsyncInvoker(
        ShowComponentInfoRequest request) {
        return new AsyncInvoker<ShowComponentInfoRequest, ShowComponentInfoResponse>(request,
            ServiceStageMeta.showComponentInfo, hcClient);
    }

    /**
     * 通过组件ID获取记录
     *
     * 此API用来通过组件ID获取记录
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowComponentRecordsRequest 请求对象
     * @return CompletableFuture<ShowComponentRecordsResponse>
     */
    public CompletableFuture<ShowComponentRecordsResponse> showComponentRecordsAsync(
        ShowComponentRecordsRequest request) {
        return hcClient.asyncInvokeHttp(request, ServiceStageMeta.showComponentRecords);
    }

    /**
     * 通过组件ID获取记录
     *
     * 此API用来通过组件ID获取记录
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowComponentRecordsRequest 请求对象
     * @return AsyncInvoker<ShowComponentRecordsRequest, ShowComponentRecordsResponse>
     */
    public AsyncInvoker<ShowComponentRecordsRequest, ShowComponentRecordsResponse> showComponentRecordsAsyncInvoker(
        ShowComponentRecordsRequest request) {
        return new AsyncInvoker<ShowComponentRecordsRequest, ShowComponentRecordsResponse>(request,
            ServiceStageMeta.showComponentRecords, hcClient);
    }

    /**
     * 获取所有组件
     *
     * 此API用来获取所有组件
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowComponentsRequest 请求对象
     * @return CompletableFuture<ShowComponentsResponse>
     */
    public CompletableFuture<ShowComponentsResponse> showComponentsAsync(ShowComponentsRequest request) {
        return hcClient.asyncInvokeHttp(request, ServiceStageMeta.showComponents);
    }

    /**
     * 获取所有组件
     *
     * 此API用来获取所有组件
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowComponentsRequest 请求对象
     * @return AsyncInvoker<ShowComponentsRequest, ShowComponentsResponse>
     */
    public AsyncInvoker<ShowComponentsRequest, ShowComponentsResponse> showComponentsAsyncInvoker(
        ShowComponentsRequest request) {
        return new AsyncInvoker<ShowComponentsRequest, ShowComponentsResponse>(request, ServiceStageMeta.showComponents,
            hcClient);
    }

    /**
     * 获取应用所有组件
     *
     * 通过此API获取应用下所有应用组件。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowComponentsInApplicationRequest 请求对象
     * @return CompletableFuture<ShowComponentsInApplicationResponse>
     */
    public CompletableFuture<ShowComponentsInApplicationResponse> showComponentsInApplicationAsync(
        ShowComponentsInApplicationRequest request) {
        return hcClient.asyncInvokeHttp(request, ServiceStageMeta.showComponentsInApplication);
    }

    /**
     * 获取应用所有组件
     *
     * 通过此API获取应用下所有应用组件。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowComponentsInApplicationRequest 请求对象
     * @return AsyncInvoker<ShowComponentsInApplicationRequest, ShowComponentsInApplicationResponse>
     */
    public AsyncInvoker<ShowComponentsInApplicationRequest, ShowComponentsInApplicationResponse> showComponentsInApplicationAsyncInvoker(
        ShowComponentsInApplicationRequest request) {
        return new AsyncInvoker<ShowComponentsInApplicationRequest, ShowComponentsInApplicationResponse>(request,
            ServiceStageMeta.showComponentsInApplication, hcClient);
    }

    /**
     * 根据组件ID下发组件任务
     *
     * 通过组件ID下发组件任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateComponentActionRequest 请求对象
     * @return CompletableFuture<UpdateComponentActionResponse>
     */
    public CompletableFuture<UpdateComponentActionResponse> updateComponentActionAsync(
        UpdateComponentActionRequest request) {
        return hcClient.asyncInvokeHttp(request, ServiceStageMeta.updateComponentAction);
    }

    /**
     * 根据组件ID下发组件任务
     *
     * 通过组件ID下发组件任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateComponentActionRequest 请求对象
     * @return AsyncInvoker<UpdateComponentActionRequest, UpdateComponentActionResponse>
     */
    public AsyncInvoker<UpdateComponentActionRequest, UpdateComponentActionResponse> updateComponentActionAsyncInvoker(
        UpdateComponentActionRequest request) {
        return new AsyncInvoker<UpdateComponentActionRequest, UpdateComponentActionResponse>(request,
            ServiceStageMeta.updateComponentAction, hcClient);
    }

    /**
     * 创建环境
     *
     * 环境是用于应用部署和运行的计算、存储、网络等基础设施的集合。Servicestage把相同VPC下的CCE集群加上多个ELB、RDS、DCS实例组合为一个环境，如：开发环境，测试环境，预生产环境，生产环境。环境内网络互通，可以按环境维度来管理资源、部署服务，减少具体基础设施运维管理的复杂性。
     * 
     * 此API用来创建环境。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateEnvironmentRequest 请求对象
     * @return CompletableFuture<CreateEnvironmentResponse>
     */
    public CompletableFuture<CreateEnvironmentResponse> createEnvironmentAsync(CreateEnvironmentRequest request) {
        return hcClient.asyncInvokeHttp(request, ServiceStageMeta.createEnvironment);
    }

    /**
     * 创建环境
     *
     * 环境是用于应用部署和运行的计算、存储、网络等基础设施的集合。Servicestage把相同VPC下的CCE集群加上多个ELB、RDS、DCS实例组合为一个环境，如：开发环境，测试环境，预生产环境，生产环境。环境内网络互通，可以按环境维度来管理资源、部署服务，减少具体基础设施运维管理的复杂性。
     * 
     * 此API用来创建环境。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateEnvironmentRequest 请求对象
     * @return AsyncInvoker<CreateEnvironmentRequest, CreateEnvironmentResponse>
     */
    public AsyncInvoker<CreateEnvironmentRequest, CreateEnvironmentResponse> createEnvironmentAsyncInvoker(
        CreateEnvironmentRequest request) {
        return new AsyncInvoker<CreateEnvironmentRequest, CreateEnvironmentResponse>(request,
            ServiceStageMeta.createEnvironment, hcClient);
    }

    /**
     * 根据环境ID删除环境
     *
     * 此API通过环境ID删除环境。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteEnvironmentRequest 请求对象
     * @return CompletableFuture<DeleteEnvironmentResponse>
     */
    public CompletableFuture<DeleteEnvironmentResponse> deleteEnvironmentAsync(DeleteEnvironmentRequest request) {
        return hcClient.asyncInvokeHttp(request, ServiceStageMeta.deleteEnvironment);
    }

    /**
     * 根据环境ID删除环境
     *
     * 此API通过环境ID删除环境。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteEnvironmentRequest 请求对象
     * @return AsyncInvoker<DeleteEnvironmentRequest, DeleteEnvironmentResponse>
     */
    public AsyncInvoker<DeleteEnvironmentRequest, DeleteEnvironmentResponse> deleteEnvironmentAsyncInvoker(
        DeleteEnvironmentRequest request) {
        return new AsyncInvoker<DeleteEnvironmentRequest, DeleteEnvironmentResponse>(request,
            ServiceStageMeta.deleteEnvironment, hcClient);
    }

    /**
     * 根据环境ID修改环境
     *
     * 此API通过环境ID修改环境。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ModifyEnvironmentRequest 请求对象
     * @return CompletableFuture<ModifyEnvironmentResponse>
     */
    public CompletableFuture<ModifyEnvironmentResponse> modifyEnvironmentAsync(ModifyEnvironmentRequest request) {
        return hcClient.asyncInvokeHttp(request, ServiceStageMeta.modifyEnvironment);
    }

    /**
     * 根据环境ID修改环境
     *
     * 此API通过环境ID修改环境。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ModifyEnvironmentRequest 请求对象
     * @return AsyncInvoker<ModifyEnvironmentRequest, ModifyEnvironmentResponse>
     */
    public AsyncInvoker<ModifyEnvironmentRequest, ModifyEnvironmentResponse> modifyEnvironmentAsyncInvoker(
        ModifyEnvironmentRequest request) {
        return new AsyncInvoker<ModifyEnvironmentRequest, ModifyEnvironmentResponse>(request,
            ServiceStageMeta.modifyEnvironment, hcClient);
    }

    /**
     * 根据环境ID修改环境资源
     *
     * 此API用来通过环境ID修改环境资源。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ModifyResourceInEnvironmentRequest 请求对象
     * @return CompletableFuture<ModifyResourceInEnvironmentResponse>
     */
    public CompletableFuture<ModifyResourceInEnvironmentResponse> modifyResourceInEnvironmentAsync(
        ModifyResourceInEnvironmentRequest request) {
        return hcClient.asyncInvokeHttp(request, ServiceStageMeta.modifyResourceInEnvironment);
    }

    /**
     * 根据环境ID修改环境资源
     *
     * 此API用来通过环境ID修改环境资源。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ModifyResourceInEnvironmentRequest 请求对象
     * @return AsyncInvoker<ModifyResourceInEnvironmentRequest, ModifyResourceInEnvironmentResponse>
     */
    public AsyncInvoker<ModifyResourceInEnvironmentRequest, ModifyResourceInEnvironmentResponse> modifyResourceInEnvironmentAsyncInvoker(
        ModifyResourceInEnvironmentRequest request) {
        return new AsyncInvoker<ModifyResourceInEnvironmentRequest, ModifyResourceInEnvironmentResponse>(request,
            ServiceStageMeta.modifyResourceInEnvironment, hcClient);
    }

    /**
     * 根据环境ID获取环境详细信息
     *
     * 此API通过环境ID获取环境详细信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowEnvironmentInfoRequest 请求对象
     * @return CompletableFuture<ShowEnvironmentInfoResponse>
     */
    public CompletableFuture<ShowEnvironmentInfoResponse> showEnvironmentInfoAsync(ShowEnvironmentInfoRequest request) {
        return hcClient.asyncInvokeHttp(request, ServiceStageMeta.showEnvironmentInfo);
    }

    /**
     * 根据环境ID获取环境详细信息
     *
     * 此API通过环境ID获取环境详细信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowEnvironmentInfoRequest 请求对象
     * @return AsyncInvoker<ShowEnvironmentInfoRequest, ShowEnvironmentInfoResponse>
     */
    public AsyncInvoker<ShowEnvironmentInfoRequest, ShowEnvironmentInfoResponse> showEnvironmentInfoAsyncInvoker(
        ShowEnvironmentInfoRequest request) {
        return new AsyncInvoker<ShowEnvironmentInfoRequest, ShowEnvironmentInfoResponse>(request,
            ServiceStageMeta.showEnvironmentInfo, hcClient);
    }

    /**
     * 根据环境ID查询环境资源
     *
     * 此API用来根据环境ID查询环境资源。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowEnvironmentResourcesRequest 请求对象
     * @return CompletableFuture<ShowEnvironmentResourcesResponse>
     */
    public CompletableFuture<ShowEnvironmentResourcesResponse> showEnvironmentResourcesAsync(
        ShowEnvironmentResourcesRequest request) {
        return hcClient.asyncInvokeHttp(request, ServiceStageMeta.showEnvironmentResources);
    }

    /**
     * 根据环境ID查询环境资源
     *
     * 此API用来根据环境ID查询环境资源。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowEnvironmentResourcesRequest 请求对象
     * @return AsyncInvoker<ShowEnvironmentResourcesRequest, ShowEnvironmentResourcesResponse>
     */
    public AsyncInvoker<ShowEnvironmentResourcesRequest, ShowEnvironmentResourcesResponse> showEnvironmentResourcesAsyncInvoker(
        ShowEnvironmentResourcesRequest request) {
        return new AsyncInvoker<ShowEnvironmentResourcesRequest, ShowEnvironmentResourcesResponse>(request,
            ServiceStageMeta.showEnvironmentResources, hcClient);
    }

    /**
     * 获取所有环境
     *
     * 此API用来获取所有已经创建环境。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowEnvironmentsRequest 请求对象
     * @return CompletableFuture<ShowEnvironmentsResponse>
     */
    public CompletableFuture<ShowEnvironmentsResponse> showEnvironmentsAsync(ShowEnvironmentsRequest request) {
        return hcClient.asyncInvokeHttp(request, ServiceStageMeta.showEnvironments);
    }

    /**
     * 获取所有环境
     *
     * 此API用来获取所有已经创建环境。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowEnvironmentsRequest 请求对象
     * @return AsyncInvoker<ShowEnvironmentsRequest, ShowEnvironmentsResponse>
     */
    public AsyncInvoker<ShowEnvironmentsRequest, ShowEnvironmentsResponse> showEnvironmentsAsyncInvoker(
        ShowEnvironmentsRequest request) {
        return new AsyncInvoker<ShowEnvironmentsRequest, ShowEnvironmentsResponse>(request,
            ServiceStageMeta.showEnvironments, hcClient);
    }

    /**
     * get cas job infomation
     *
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowJobInfoRequest 请求对象
     * @return CompletableFuture<ShowJobInfoResponse>
     */
    public CompletableFuture<ShowJobInfoResponse> showJobInfoAsync(ShowJobInfoRequest request) {
        return hcClient.asyncInvokeHttp(request, ServiceStageMeta.showJobInfo);
    }

    /**
     * get cas job infomation
     *
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowJobInfoRequest 请求对象
     * @return AsyncInvoker<ShowJobInfoRequest, ShowJobInfoResponse>
     */
    public AsyncInvoker<ShowJobInfoRequest, ShowJobInfoResponse> showJobInfoAsyncInvoker(ShowJobInfoRequest request) {
        return new AsyncInvoker<ShowJobInfoRequest, ShowJobInfoResponse>(request, ServiceStageMeta.showJobInfo,
            hcClient);
    }

    /**
     * 查询运行时栈
     *
     * 获取运行时信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowRuntimeStacksRequest 请求对象
     * @return CompletableFuture<ShowRuntimeStacksResponse>
     */
    public CompletableFuture<ShowRuntimeStacksResponse> showRuntimeStacksAsync(ShowRuntimeStacksRequest request) {
        return hcClient.asyncInvokeHttp(request, ServiceStageMeta.showRuntimeStacks);
    }

    /**
     * 查询运行时栈
     *
     * 获取运行时信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowRuntimeStacksRequest 请求对象
     * @return AsyncInvoker<ShowRuntimeStacksRequest, ShowRuntimeStacksResponse>
     */
    public AsyncInvoker<ShowRuntimeStacksRequest, ShowRuntimeStacksResponse> showRuntimeStacksAsyncInvoker(
        ShowRuntimeStacksRequest request) {
        return new AsyncInvoker<ShowRuntimeStacksRequest, ShowRuntimeStacksResponse>(request,
            ServiceStageMeta.showRuntimeStacks, hcClient);
    }

}
