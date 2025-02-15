package com.huaweicloud.sdk.drs.v5;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.AsyncInvoker;
import com.huaweicloud.sdk.drs.v5.model.BatchCreateJobsAsyncRequest;
import com.huaweicloud.sdk.drs.v5.model.BatchCreateJobsAsyncResponse;
import com.huaweicloud.sdk.drs.v5.model.BatchDeleteJobsByIdRequest;
import com.huaweicloud.sdk.drs.v5.model.BatchDeleteJobsByIdResponse;
import com.huaweicloud.sdk.drs.v5.model.BatchExecuteJobActionsRequest;
import com.huaweicloud.sdk.drs.v5.model.BatchExecuteJobActionsResponse;
import com.huaweicloud.sdk.drs.v5.model.BatchStopJobsActionRequest;
import com.huaweicloud.sdk.drs.v5.model.BatchStopJobsActionResponse;
import com.huaweicloud.sdk.drs.v5.model.BatchTagActionRequest;
import com.huaweicloud.sdk.drs.v5.model.BatchTagActionResponse;
import com.huaweicloud.sdk.drs.v5.model.CheckDataFilterRequest;
import com.huaweicloud.sdk.drs.v5.model.CheckDataFilterResponse;
import com.huaweicloud.sdk.drs.v5.model.CollectColumnsRequest;
import com.huaweicloud.sdk.drs.v5.model.CollectColumnsResponse;
import com.huaweicloud.sdk.drs.v5.model.CollectDbObjectsAsyncRequest;
import com.huaweicloud.sdk.drs.v5.model.CollectDbObjectsAsyncResponse;
import com.huaweicloud.sdk.drs.v5.model.CollectDbObjectsInfoRequest;
import com.huaweicloud.sdk.drs.v5.model.CollectDbObjectsInfoResponse;
import com.huaweicloud.sdk.drs.v5.model.CollectPositionAsyncRequest;
import com.huaweicloud.sdk.drs.v5.model.CollectPositionAsyncResponse;
import com.huaweicloud.sdk.drs.v5.model.CommitAsyncJobRequest;
import com.huaweicloud.sdk.drs.v5.model.CommitAsyncJobResponse;
import com.huaweicloud.sdk.drs.v5.model.CopyJobRequest;
import com.huaweicloud.sdk.drs.v5.model.CopyJobResponse;
import com.huaweicloud.sdk.drs.v5.model.CreateJobRequest;
import com.huaweicloud.sdk.drs.v5.model.CreateJobResponse;
import com.huaweicloud.sdk.drs.v5.model.DeleteJobRequest;
import com.huaweicloud.sdk.drs.v5.model.DeleteJobResponse;
import com.huaweicloud.sdk.drs.v5.model.DownloadBatchCreateTemplateRequest;
import com.huaweicloud.sdk.drs.v5.model.DownloadBatchCreateTemplateResponse;
import com.huaweicloud.sdk.drs.v5.model.DownloadDbObjectTemplateRequest;
import com.huaweicloud.sdk.drs.v5.model.DownloadDbObjectTemplateResponse;
import com.huaweicloud.sdk.drs.v5.model.ExecuteJobActionRequest;
import com.huaweicloud.sdk.drs.v5.model.ExecuteJobActionResponse;
import com.huaweicloud.sdk.drs.v5.model.ExportOperationInfoRequest;
import com.huaweicloud.sdk.drs.v5.model.ExportOperationInfoResponse;
import com.huaweicloud.sdk.drs.v5.model.ImportBatchCreateJobsRequest;
import com.huaweicloud.sdk.drs.v5.model.ImportBatchCreateJobsResponse;
import com.huaweicloud.sdk.drs.v5.model.ListAsyncJobDetailRequest;
import com.huaweicloud.sdk.drs.v5.model.ListAsyncJobDetailResponse;
import com.huaweicloud.sdk.drs.v5.model.ListAsyncJobsRequest;
import com.huaweicloud.sdk.drs.v5.model.ListAsyncJobsResponse;
import com.huaweicloud.sdk.drs.v5.model.ListDbObjectsRequest;
import com.huaweicloud.sdk.drs.v5.model.ListDbObjectsResponse;
import com.huaweicloud.sdk.drs.v5.model.ListJobsRequest;
import com.huaweicloud.sdk.drs.v5.model.ListJobsResponse;
import com.huaweicloud.sdk.drs.v5.model.ListLinksRequest;
import com.huaweicloud.sdk.drs.v5.model.ListLinksResponse;
import com.huaweicloud.sdk.drs.v5.model.ListProjectTagsRequest;
import com.huaweicloud.sdk.drs.v5.model.ListProjectTagsResponse;
import com.huaweicloud.sdk.drs.v5.model.ShowActionsRequest;
import com.huaweicloud.sdk.drs.v5.model.ShowActionsResponse;
import com.huaweicloud.sdk.drs.v5.model.ShowColumnInfoResultRequest;
import com.huaweicloud.sdk.drs.v5.model.ShowColumnInfoResultResponse;
import com.huaweicloud.sdk.drs.v5.model.ShowComparePolicyRequest;
import com.huaweicloud.sdk.drs.v5.model.ShowComparePolicyResponse;
import com.huaweicloud.sdk.drs.v5.model.ShowDataFilteringResultRequest;
import com.huaweicloud.sdk.drs.v5.model.ShowDataFilteringResultResponse;
import com.huaweicloud.sdk.drs.v5.model.ShowDataProcessingRulesResultRequest;
import com.huaweicloud.sdk.drs.v5.model.ShowDataProcessingRulesResultResponse;
import com.huaweicloud.sdk.drs.v5.model.ShowDataProgressRequest;
import com.huaweicloud.sdk.drs.v5.model.ShowDataProgressResponse;
import com.huaweicloud.sdk.drs.v5.model.ShowDbObjectCollectionStatusRequest;
import com.huaweicloud.sdk.drs.v5.model.ShowDbObjectCollectionStatusResponse;
import com.huaweicloud.sdk.drs.v5.model.ShowDbObjectTemplateProgressRequest;
import com.huaweicloud.sdk.drs.v5.model.ShowDbObjectTemplateProgressResponse;
import com.huaweicloud.sdk.drs.v5.model.ShowDbObjectTemplateResultRequest;
import com.huaweicloud.sdk.drs.v5.model.ShowDbObjectTemplateResultResponse;
import com.huaweicloud.sdk.drs.v5.model.ShowDbObjectsListRequest;
import com.huaweicloud.sdk.drs.v5.model.ShowDbObjectsListResponse;
import com.huaweicloud.sdk.drs.v5.model.ShowDirtyDataRequest;
import com.huaweicloud.sdk.drs.v5.model.ShowDirtyDataResponse;
import com.huaweicloud.sdk.drs.v5.model.ShowEnterpriseProjectRequest;
import com.huaweicloud.sdk.drs.v5.model.ShowEnterpriseProjectResponse;
import com.huaweicloud.sdk.drs.v5.model.ShowHealthCompareJobListRequest;
import com.huaweicloud.sdk.drs.v5.model.ShowHealthCompareJobListResponse;
import com.huaweicloud.sdk.drs.v5.model.ShowIncrementComponentsDetailRequest;
import com.huaweicloud.sdk.drs.v5.model.ShowIncrementComponentsDetailResponse;
import com.huaweicloud.sdk.drs.v5.model.ShowInstanceTagsRequest;
import com.huaweicloud.sdk.drs.v5.model.ShowInstanceTagsResponse;
import com.huaweicloud.sdk.drs.v5.model.ShowJobDetailRequest;
import com.huaweicloud.sdk.drs.v5.model.ShowJobDetailResponse;
import com.huaweicloud.sdk.drs.v5.model.ShowMeteringRequest;
import com.huaweicloud.sdk.drs.v5.model.ShowMeteringResponse;
import com.huaweicloud.sdk.drs.v5.model.ShowMonitorDataRequest;
import com.huaweicloud.sdk.drs.v5.model.ShowMonitorDataResponse;
import com.huaweicloud.sdk.drs.v5.model.ShowObjectMappingRequest;
import com.huaweicloud.sdk.drs.v5.model.ShowObjectMappingResponse;
import com.huaweicloud.sdk.drs.v5.model.ShowPositionResultRequest;
import com.huaweicloud.sdk.drs.v5.model.ShowPositionResultResponse;
import com.huaweicloud.sdk.drs.v5.model.ShowProgressDataRequest;
import com.huaweicloud.sdk.drs.v5.model.ShowProgressDataResponse;
import com.huaweicloud.sdk.drs.v5.model.ShowSupportObjectTypeRequest;
import com.huaweicloud.sdk.drs.v5.model.ShowSupportObjectTypeResponse;
import com.huaweicloud.sdk.drs.v5.model.ShowUpdateObjectSavingStatusRequest;
import com.huaweicloud.sdk.drs.v5.model.ShowUpdateObjectSavingStatusResponse;
import com.huaweicloud.sdk.drs.v5.model.StopJobActionRequest;
import com.huaweicloud.sdk.drs.v5.model.StopJobActionResponse;
import com.huaweicloud.sdk.drs.v5.model.UpdateBatchAsyncJobsRequest;
import com.huaweicloud.sdk.drs.v5.model.UpdateBatchAsyncJobsResponse;
import com.huaweicloud.sdk.drs.v5.model.UpdateDataProgressRequest;
import com.huaweicloud.sdk.drs.v5.model.UpdateDataProgressResponse;
import com.huaweicloud.sdk.drs.v5.model.UpdateJobRequest;
import com.huaweicloud.sdk.drs.v5.model.UpdateJobResponse;
import com.huaweicloud.sdk.drs.v5.model.UpdateStartPositionRequest;
import com.huaweicloud.sdk.drs.v5.model.UpdateStartPositionResponse;
import com.huaweicloud.sdk.drs.v5.model.UploadDbObjectTemplateRequest;
import com.huaweicloud.sdk.drs.v5.model.UploadDbObjectTemplateResponse;
import com.huaweicloud.sdk.drs.v5.model.ValidateJobNameRequest;
import com.huaweicloud.sdk.drs.v5.model.ValidateJobNameResponse;

import java.util.concurrent.CompletableFuture;

public class DrsAsyncClient {

    protected HcClient hcClient;

    public DrsAsyncClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<DrsAsyncClient> newBuilder() {
        ClientBuilder<DrsAsyncClient> clientBuilder = new ClientBuilder<>(DrsAsyncClient::new);
        return clientBuilder;
    }

    /**
     * 批量异步创建任务
     *
     * 批量异步创建任务，根据请求参数不同，可以批量异步创建实时迁移、实时同步、实时灾备等任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchCreateJobsAsyncRequest 请求对象
     * @return CompletableFuture<BatchCreateJobsAsyncResponse>
     */
    public CompletableFuture<BatchCreateJobsAsyncResponse> batchCreateJobsAsyncAsync(
        BatchCreateJobsAsyncRequest request) {
        return hcClient.asyncInvokeHttp(request, DrsMeta.batchCreateJobsAsync);
    }

    /**
     * 批量异步创建任务
     *
     * 批量异步创建任务，根据请求参数不同，可以批量异步创建实时迁移、实时同步、实时灾备等任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchCreateJobsAsyncRequest 请求对象
     * @return AsyncInvoker<BatchCreateJobsAsyncRequest, BatchCreateJobsAsyncResponse>
     */
    public AsyncInvoker<BatchCreateJobsAsyncRequest, BatchCreateJobsAsyncResponse> batchCreateJobsAsyncAsyncInvoker(
        BatchCreateJobsAsyncRequest request) {
        return new AsyncInvoker<BatchCreateJobsAsyncRequest, BatchCreateJobsAsyncResponse>(request,
            DrsMeta.batchCreateJobsAsync, hcClient);
    }

    /**
     * 批量删除任务
     *
     * 批量删除租户指定ID任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchDeleteJobsByIdRequest 请求对象
     * @return CompletableFuture<BatchDeleteJobsByIdResponse>
     */
    public CompletableFuture<BatchDeleteJobsByIdResponse> batchDeleteJobsByIdAsync(BatchDeleteJobsByIdRequest request) {
        return hcClient.asyncInvokeHttp(request, DrsMeta.batchDeleteJobsById);
    }

    /**
     * 批量删除任务
     *
     * 批量删除租户指定ID任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchDeleteJobsByIdRequest 请求对象
     * @return AsyncInvoker<BatchDeleteJobsByIdRequest, BatchDeleteJobsByIdResponse>
     */
    public AsyncInvoker<BatchDeleteJobsByIdRequest, BatchDeleteJobsByIdResponse> batchDeleteJobsByIdAsyncInvoker(
        BatchDeleteJobsByIdRequest request) {
        return new AsyncInvoker<BatchDeleteJobsByIdRequest, BatchDeleteJobsByIdResponse>(request,
            DrsMeta.batchDeleteJobsById, hcClient);
    }

    /**
     * 批量操作指定ID任务
     *
     * 批量操作租户指定ID任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchExecuteJobActionsRequest 请求对象
     * @return CompletableFuture<BatchExecuteJobActionsResponse>
     */
    public CompletableFuture<BatchExecuteJobActionsResponse> batchExecuteJobActionsAsync(
        BatchExecuteJobActionsRequest request) {
        return hcClient.asyncInvokeHttp(request, DrsMeta.batchExecuteJobActions);
    }

    /**
     * 批量操作指定ID任务
     *
     * 批量操作租户指定ID任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchExecuteJobActionsRequest 请求对象
     * @return AsyncInvoker<BatchExecuteJobActionsRequest, BatchExecuteJobActionsResponse>
     */
    public AsyncInvoker<BatchExecuteJobActionsRequest, BatchExecuteJobActionsResponse> batchExecuteJobActionsAsyncInvoker(
        BatchExecuteJobActionsRequest request) {
        return new AsyncInvoker<BatchExecuteJobActionsRequest, BatchExecuteJobActionsResponse>(request,
            DrsMeta.batchExecuteJobActions, hcClient);
    }

    /**
     * 批量结束任务
     *
     * 批量结束租户指定ID任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchStopJobsActionRequest 请求对象
     * @return CompletableFuture<BatchStopJobsActionResponse>
     */
    public CompletableFuture<BatchStopJobsActionResponse> batchStopJobsActionAsync(BatchStopJobsActionRequest request) {
        return hcClient.asyncInvokeHttp(request, DrsMeta.batchStopJobsAction);
    }

    /**
     * 批量结束任务
     *
     * 批量结束租户指定ID任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchStopJobsActionRequest 请求对象
     * @return AsyncInvoker<BatchStopJobsActionRequest, BatchStopJobsActionResponse>
     */
    public AsyncInvoker<BatchStopJobsActionRequest, BatchStopJobsActionResponse> batchStopJobsActionAsyncInvoker(
        BatchStopJobsActionRequest request) {
        return new AsyncInvoker<BatchStopJobsActionRequest, BatchStopJobsActionResponse>(request,
            DrsMeta.batchStopJobsAction, hcClient);
    }

    /**
     * 批量添加或删除资源标签
     *
     * 批量添加删除资源标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchTagActionRequest 请求对象
     * @return CompletableFuture<BatchTagActionResponse>
     */
    public CompletableFuture<BatchTagActionResponse> batchTagActionAsync(BatchTagActionRequest request) {
        return hcClient.asyncInvokeHttp(request, DrsMeta.batchTagAction);
    }

    /**
     * 批量添加或删除资源标签
     *
     * 批量添加删除资源标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchTagActionRequest 请求对象
     * @return AsyncInvoker<BatchTagActionRequest, BatchTagActionResponse>
     */
    public AsyncInvoker<BatchTagActionRequest, BatchTagActionResponse> batchTagActionAsyncInvoker(
        BatchTagActionRequest request) {
        return new AsyncInvoker<BatchTagActionRequest, BatchTagActionResponse>(request, DrsMeta.batchTagAction,
            hcClient);
    }

    /**
     * 数据过滤规则校验
     *
     * 数据过滤规则校验
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CheckDataFilterRequest 请求对象
     * @return CompletableFuture<CheckDataFilterResponse>
     */
    public CompletableFuture<CheckDataFilterResponse> checkDataFilterAsync(CheckDataFilterRequest request) {
        return hcClient.asyncInvokeHttp(request, DrsMeta.checkDataFilter);
    }

    /**
     * 数据过滤规则校验
     *
     * 数据过滤规则校验
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CheckDataFilterRequest 请求对象
     * @return AsyncInvoker<CheckDataFilterRequest, CheckDataFilterResponse>
     */
    public AsyncInvoker<CheckDataFilterRequest, CheckDataFilterResponse> checkDataFilterAsyncInvoker(
        CheckDataFilterRequest request) {
        return new AsyncInvoker<CheckDataFilterRequest, CheckDataFilterResponse>(request, DrsMeta.checkDataFilter,
            hcClient);
    }

    /**
     * 采集指定数据库表的列信息
     *
     * 采集指定数据库表的列信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CollectColumnsRequest 请求对象
     * @return CompletableFuture<CollectColumnsResponse>
     */
    public CompletableFuture<CollectColumnsResponse> collectColumnsAsync(CollectColumnsRequest request) {
        return hcClient.asyncInvokeHttp(request, DrsMeta.collectColumns);
    }

    /**
     * 采集指定数据库表的列信息
     *
     * 采集指定数据库表的列信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CollectColumnsRequest 请求对象
     * @return AsyncInvoker<CollectColumnsRequest, CollectColumnsResponse>
     */
    public AsyncInvoker<CollectColumnsRequest, CollectColumnsResponse> collectColumnsAsyncInvoker(
        CollectColumnsRequest request) {
        return new AsyncInvoker<CollectColumnsRequest, CollectColumnsResponse>(request, DrsMeta.collectColumns,
            hcClient);
    }

    /**
     * 提交查询数据库对象信息
     *
     * 提交查询数据库对象信息。例如：
     * - 当type取值为source时，表示查询源库库表信息。
     * - 当源库库表信息有变化时，则type取值为source，is_refresh取值为true。
     * - 当已同步到目标库的库表信息过大，需要提前将数据加载到缓存中时，type取值为synchronized。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CollectDbObjectsAsyncRequest 请求对象
     * @return CompletableFuture<CollectDbObjectsAsyncResponse>
     */
    public CompletableFuture<CollectDbObjectsAsyncResponse> collectDbObjectsAsyncAsync(
        CollectDbObjectsAsyncRequest request) {
        return hcClient.asyncInvokeHttp(request, DrsMeta.collectDbObjectsAsync);
    }

    /**
     * 提交查询数据库对象信息
     *
     * 提交查询数据库对象信息。例如：
     * - 当type取值为source时，表示查询源库库表信息。
     * - 当源库库表信息有变化时，则type取值为source，is_refresh取值为true。
     * - 当已同步到目标库的库表信息过大，需要提前将数据加载到缓存中时，type取值为synchronized。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CollectDbObjectsAsyncRequest 请求对象
     * @return AsyncInvoker<CollectDbObjectsAsyncRequest, CollectDbObjectsAsyncResponse>
     */
    public AsyncInvoker<CollectDbObjectsAsyncRequest, CollectDbObjectsAsyncResponse> collectDbObjectsAsyncAsyncInvoker(
        CollectDbObjectsAsyncRequest request) {
        return new AsyncInvoker<CollectDbObjectsAsyncRequest, CollectDbObjectsAsyncResponse>(request,
            DrsMeta.collectDbObjectsAsync, hcClient);
    }

    /**
     * 提交查询数据库对象信息
     *
     * 提交查询数据库对象信息。例如：
     * - 当type取值为source时，表示查询源库库表信息。
     * - 当源库库表信息有变化时，则type取值为source，is_refresh取值为true。
     * - 当已同步到目标库的库表信息过大，需要提前将数据加载到缓存中时，type取值为synchronized。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CollectDbObjectsInfoRequest 请求对象
     * @return CompletableFuture<CollectDbObjectsInfoResponse>
     */
    public CompletableFuture<CollectDbObjectsInfoResponse> collectDbObjectsInfoAsync(
        CollectDbObjectsInfoRequest request) {
        return hcClient.asyncInvokeHttp(request, DrsMeta.collectDbObjectsInfo);
    }

    /**
     * 提交查询数据库对象信息
     *
     * 提交查询数据库对象信息。例如：
     * - 当type取值为source时，表示查询源库库表信息。
     * - 当源库库表信息有变化时，则type取值为source，is_refresh取值为true。
     * - 当已同步到目标库的库表信息过大，需要提前将数据加载到缓存中时，type取值为synchronized。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CollectDbObjectsInfoRequest 请求对象
     * @return AsyncInvoker<CollectDbObjectsInfoRequest, CollectDbObjectsInfoResponse>
     */
    public AsyncInvoker<CollectDbObjectsInfoRequest, CollectDbObjectsInfoResponse> collectDbObjectsInfoAsyncInvoker(
        CollectDbObjectsInfoRequest request) {
        return new AsyncInvoker<CollectDbObjectsInfoRequest, CollectDbObjectsInfoResponse>(request,
            DrsMeta.collectDbObjectsInfo, hcClient);
    }

    /**
     * 采集数据库位点信息
     *
     * 采集数据库位点信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CollectPositionAsyncRequest 请求对象
     * @return CompletableFuture<CollectPositionAsyncResponse>
     */
    public CompletableFuture<CollectPositionAsyncResponse> collectPositionAsyncAsync(
        CollectPositionAsyncRequest request) {
        return hcClient.asyncInvokeHttp(request, DrsMeta.collectPositionAsync);
    }

    /**
     * 采集数据库位点信息
     *
     * 采集数据库位点信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CollectPositionAsyncRequest 请求对象
     * @return AsyncInvoker<CollectPositionAsyncRequest, CollectPositionAsyncResponse>
     */
    public AsyncInvoker<CollectPositionAsyncRequest, CollectPositionAsyncResponse> collectPositionAsyncAsyncInvoker(
        CollectPositionAsyncRequest request) {
        return new AsyncInvoker<CollectPositionAsyncRequest, CollectPositionAsyncResponse>(request,
            DrsMeta.collectPositionAsync, hcClient);
    }

    /**
     * 提交批量创建异步任务
     *
     * 提交批量创建异步任务，当批量异步任务创建或更新参数后，系统会自动开始进行参数校验，待所有任务成功完成参数校验后并且无报错时，可调用此接口开始创建DRS任务实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CommitAsyncJobRequest 请求对象
     * @return CompletableFuture<CommitAsyncJobResponse>
     */
    public CompletableFuture<CommitAsyncJobResponse> commitAsyncJobAsync(CommitAsyncJobRequest request) {
        return hcClient.asyncInvokeHttp(request, DrsMeta.commitAsyncJob);
    }

    /**
     * 提交批量创建异步任务
     *
     * 提交批量创建异步任务，当批量异步任务创建或更新参数后，系统会自动开始进行参数校验，待所有任务成功完成参数校验后并且无报错时，可调用此接口开始创建DRS任务实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CommitAsyncJobRequest 请求对象
     * @return AsyncInvoker<CommitAsyncJobRequest, CommitAsyncJobResponse>
     */
    public AsyncInvoker<CommitAsyncJobRequest, CommitAsyncJobResponse> commitAsyncJobAsyncInvoker(
        CommitAsyncJobRequest request) {
        return new AsyncInvoker<CommitAsyncJobRequest, CommitAsyncJobResponse>(request, DrsMeta.commitAsyncJob,
            hcClient);
    }

    /**
     * 克隆任务
     *
     * DRS支持通过克隆功能，快速复制现有同步任务的配置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CopyJobRequest 请求对象
     * @return CompletableFuture<CopyJobResponse>
     */
    public CompletableFuture<CopyJobResponse> copyJobAsync(CopyJobRequest request) {
        return hcClient.asyncInvokeHttp(request, DrsMeta.copyJob);
    }

    /**
     * 克隆任务
     *
     * DRS支持通过克隆功能，快速复制现有同步任务的配置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CopyJobRequest 请求对象
     * @return AsyncInvoker<CopyJobRequest, CopyJobResponse>
     */
    public AsyncInvoker<CopyJobRequest, CopyJobResponse> copyJobAsyncInvoker(CopyJobRequest request) {
        return new AsyncInvoker<CopyJobRequest, CopyJobResponse>(request, DrsMeta.copyJob, hcClient);
    }

    /**
     * 创建任务
     *
     * 创建单个任务，根据请求参数不同，可以创建单个实时迁移、实时同步、实时灾备等任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateJobRequest 请求对象
     * @return CompletableFuture<CreateJobResponse>
     */
    public CompletableFuture<CreateJobResponse> createJobAsync(CreateJobRequest request) {
        return hcClient.asyncInvokeHttp(request, DrsMeta.createJob);
    }

    /**
     * 创建任务
     *
     * 创建单个任务，根据请求参数不同，可以创建单个实时迁移、实时同步、实时灾备等任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateJobRequest 请求对象
     * @return AsyncInvoker<CreateJobRequest, CreateJobResponse>
     */
    public AsyncInvoker<CreateJobRequest, CreateJobResponse> createJobAsyncInvoker(CreateJobRequest request) {
        return new AsyncInvoker<CreateJobRequest, CreateJobResponse>(request, DrsMeta.createJob, hcClient);
    }

    /**
     * 删除指定ID任务
     *
     * 删除租户指定ID任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteJobRequest 请求对象
     * @return CompletableFuture<DeleteJobResponse>
     */
    public CompletableFuture<DeleteJobResponse> deleteJobAsync(DeleteJobRequest request) {
        return hcClient.asyncInvokeHttp(request, DrsMeta.deleteJob);
    }

    /**
     * 删除指定ID任务
     *
     * 删除租户指定ID任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteJobRequest 请求对象
     * @return AsyncInvoker<DeleteJobRequest, DeleteJobResponse>
     */
    public AsyncInvoker<DeleteJobRequest, DeleteJobResponse> deleteJobAsyncInvoker(DeleteJobRequest request) {
        return new AsyncInvoker<DeleteJobRequest, DeleteJobResponse>(request, DrsMeta.deleteJob, hcClient);
    }

    /**
     * 下载批量导入任务模板
     *
     * 下载批量导入任务模板
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DownloadBatchCreateTemplateRequest 请求对象
     * @return CompletableFuture<DownloadBatchCreateTemplateResponse>
     */
    public CompletableFuture<DownloadBatchCreateTemplateResponse> downloadBatchCreateTemplateAsync(
        DownloadBatchCreateTemplateRequest request) {
        return hcClient.asyncInvokeHttp(request, DrsMeta.downloadBatchCreateTemplate);
    }

    /**
     * 下载批量导入任务模板
     *
     * 下载批量导入任务模板
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DownloadBatchCreateTemplateRequest 请求对象
     * @return AsyncInvoker<DownloadBatchCreateTemplateRequest, DownloadBatchCreateTemplateResponse>
     */
    public AsyncInvoker<DownloadBatchCreateTemplateRequest, DownloadBatchCreateTemplateResponse> downloadBatchCreateTemplateAsyncInvoker(
        DownloadBatchCreateTemplateRequest request) {
        return new AsyncInvoker<DownloadBatchCreateTemplateRequest, DownloadBatchCreateTemplateResponse>(request,
            DrsMeta.downloadBatchCreateTemplate, hcClient);
    }

    /**
     * 对象选择（文件导入 - 模板下载）
     *
     * 对象选择（文件导入 - 模板下载）。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DownloadDbObjectTemplateRequest 请求对象
     * @return CompletableFuture<DownloadDbObjectTemplateResponse>
     */
    public CompletableFuture<DownloadDbObjectTemplateResponse> downloadDbObjectTemplateAsync(
        DownloadDbObjectTemplateRequest request) {
        return hcClient.asyncInvokeHttp(request, DrsMeta.downloadDbObjectTemplate);
    }

    /**
     * 对象选择（文件导入 - 模板下载）
     *
     * 对象选择（文件导入 - 模板下载）。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DownloadDbObjectTemplateRequest 请求对象
     * @return AsyncInvoker<DownloadDbObjectTemplateRequest, DownloadDbObjectTemplateResponse>
     */
    public AsyncInvoker<DownloadDbObjectTemplateRequest, DownloadDbObjectTemplateResponse> downloadDbObjectTemplateAsyncInvoker(
        DownloadDbObjectTemplateRequest request) {
        return new AsyncInvoker<DownloadDbObjectTemplateRequest, DownloadDbObjectTemplateResponse>(request,
            DrsMeta.downloadDbObjectTemplate, hcClient);
    }

    /**
     * 操作指定ID任务
     *
     * 操作租户指定ID任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ExecuteJobActionRequest 请求对象
     * @return CompletableFuture<ExecuteJobActionResponse>
     */
    public CompletableFuture<ExecuteJobActionResponse> executeJobActionAsync(ExecuteJobActionRequest request) {
        return hcClient.asyncInvokeHttp(request, DrsMeta.executeJobAction);
    }

    /**
     * 操作指定ID任务
     *
     * 操作租户指定ID任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ExecuteJobActionRequest 请求对象
     * @return AsyncInvoker<ExecuteJobActionRequest, ExecuteJobActionResponse>
     */
    public AsyncInvoker<ExecuteJobActionRequest, ExecuteJobActionResponse> executeJobActionAsyncInvoker(
        ExecuteJobActionRequest request) {
        return new AsyncInvoker<ExecuteJobActionRequest, ExecuteJobActionResponse>(request, DrsMeta.executeJobAction,
            hcClient);
    }

    /**
     * 导出任务操作统计信息
     *
     * 导出指定任务操作统计信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ExportOperationInfoRequest 请求对象
     * @return CompletableFuture<ExportOperationInfoResponse>
     */
    public CompletableFuture<ExportOperationInfoResponse> exportOperationInfoAsync(ExportOperationInfoRequest request) {
        return hcClient.asyncInvokeHttp(request, DrsMeta.exportOperationInfo);
    }

    /**
     * 导出任务操作统计信息
     *
     * 导出指定任务操作统计信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ExportOperationInfoRequest 请求对象
     * @return AsyncInvoker<ExportOperationInfoRequest, ExportOperationInfoResponse>
     */
    public AsyncInvoker<ExportOperationInfoRequest, ExportOperationInfoResponse> exportOperationInfoAsyncInvoker(
        ExportOperationInfoRequest request) {
        return new AsyncInvoker<ExportOperationInfoRequest, ExportOperationInfoResponse>(request,
            DrsMeta.exportOperationInfo, hcClient);
    }

    /**
     * 批量导入任务
     *
     * 批量导入任务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ImportBatchCreateJobsRequest 请求对象
     * @return CompletableFuture<ImportBatchCreateJobsResponse>
     */
    public CompletableFuture<ImportBatchCreateJobsResponse> importBatchCreateJobsAsync(
        ImportBatchCreateJobsRequest request) {
        return hcClient.asyncInvokeHttp(request, DrsMeta.importBatchCreateJobs);
    }

    /**
     * 批量导入任务
     *
     * 批量导入任务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ImportBatchCreateJobsRequest 请求对象
     * @return AsyncInvoker<ImportBatchCreateJobsRequest, ImportBatchCreateJobsResponse>
     */
    public AsyncInvoker<ImportBatchCreateJobsRequest, ImportBatchCreateJobsResponse> importBatchCreateJobsAsyncInvoker(
        ImportBatchCreateJobsRequest request) {
        return new AsyncInvoker<ImportBatchCreateJobsRequest, ImportBatchCreateJobsResponse>(request,
            DrsMeta.importBatchCreateJobs, hcClient);
    }

    /**
     * 查询指定ID批量异步任务详情
     *
     * 查询租户指定ID批量异步任务详情，默认为任务的“create_time”降序排序获取结果，支持分页查询。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListAsyncJobDetailRequest 请求对象
     * @return CompletableFuture<ListAsyncJobDetailResponse>
     */
    public CompletableFuture<ListAsyncJobDetailResponse> listAsyncJobDetailAsync(ListAsyncJobDetailRequest request) {
        return hcClient.asyncInvokeHttp(request, DrsMeta.listAsyncJobDetail);
    }

    /**
     * 查询指定ID批量异步任务详情
     *
     * 查询租户指定ID批量异步任务详情，默认为任务的“create_time”降序排序获取结果，支持分页查询。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListAsyncJobDetailRequest 请求对象
     * @return AsyncInvoker<ListAsyncJobDetailRequest, ListAsyncJobDetailResponse>
     */
    public AsyncInvoker<ListAsyncJobDetailRequest, ListAsyncJobDetailResponse> listAsyncJobDetailAsyncInvoker(
        ListAsyncJobDetailRequest request) {
        return new AsyncInvoker<ListAsyncJobDetailRequest, ListAsyncJobDetailResponse>(request,
            DrsMeta.listAsyncJobDetail, hcClient);
    }

    /**
     * 查询批量异步创建的任务列表
     *
     * 查询租户批量异步创建的任务列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListAsyncJobsRequest 请求对象
     * @return CompletableFuture<ListAsyncJobsResponse>
     */
    public CompletableFuture<ListAsyncJobsResponse> listAsyncJobsAsync(ListAsyncJobsRequest request) {
        return hcClient.asyncInvokeHttp(request, DrsMeta.listAsyncJobs);
    }

    /**
     * 查询批量异步创建的任务列表
     *
     * 查询租户批量异步创建的任务列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListAsyncJobsRequest 请求对象
     * @return AsyncInvoker<ListAsyncJobsRequest, ListAsyncJobsResponse>
     */
    public AsyncInvoker<ListAsyncJobsRequest, ListAsyncJobsResponse> listAsyncJobsAsyncInvoker(
        ListAsyncJobsRequest request) {
        return new AsyncInvoker<ListAsyncJobsRequest, ListAsyncJobsResponse>(request, DrsMeta.listAsyncJobs, hcClient);
    }

    /**
     * 查询数据库对象信息
     *
     * 查询数据库对象信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListDbObjectsRequest 请求对象
     * @return CompletableFuture<ListDbObjectsResponse>
     */
    public CompletableFuture<ListDbObjectsResponse> listDbObjectsAsync(ListDbObjectsRequest request) {
        return hcClient.asyncInvokeHttp(request, DrsMeta.listDbObjects);
    }

    /**
     * 查询数据库对象信息
     *
     * 查询数据库对象信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListDbObjectsRequest 请求对象
     * @return AsyncInvoker<ListDbObjectsRequest, ListDbObjectsResponse>
     */
    public AsyncInvoker<ListDbObjectsRequest, ListDbObjectsResponse> listDbObjectsAsyncInvoker(
        ListDbObjectsRequest request) {
        return new AsyncInvoker<ListDbObjectsRequest, ListDbObjectsResponse>(request, DrsMeta.listDbObjects, hcClient);
    }

    /**
     * 查询任务列表
     *
     * 查询租户任务列表，可以根据企业项目，引擎类型，网络类型，任务状态，任务名称，任务ID进行查询。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListJobsRequest 请求对象
     * @return CompletableFuture<ListJobsResponse>
     */
    public CompletableFuture<ListJobsResponse> listJobsAsync(ListJobsRequest request) {
        return hcClient.asyncInvokeHttp(request, DrsMeta.listJobs);
    }

    /**
     * 查询任务列表
     *
     * 查询租户任务列表，可以根据企业项目，引擎类型，网络类型，任务状态，任务名称，任务ID进行查询。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListJobsRequest 请求对象
     * @return AsyncInvoker<ListJobsRequest, ListJobsResponse>
     */
    public AsyncInvoker<ListJobsRequest, ListJobsResponse> listJobsAsyncInvoker(ListJobsRequest request) {
        return new AsyncInvoker<ListJobsRequest, ListJobsResponse>(request, DrsMeta.listJobs, hcClient);
    }

    /**
     * 查询可用链路信息
     *
     * 根据参数不同，可查询实时迁移、实时同步、实时灾备等可用链路信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListLinksRequest 请求对象
     * @return CompletableFuture<ListLinksResponse>
     */
    public CompletableFuture<ListLinksResponse> listLinksAsync(ListLinksRequest request) {
        return hcClient.asyncInvokeHttp(request, DrsMeta.listLinks);
    }

    /**
     * 查询可用链路信息
     *
     * 根据参数不同，可查询实时迁移、实时同步、实时灾备等可用链路信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListLinksRequest 请求对象
     * @return AsyncInvoker<ListLinksRequest, ListLinksResponse>
     */
    public AsyncInvoker<ListLinksRequest, ListLinksResponse> listLinksAsyncInvoker(ListLinksRequest request) {
        return new AsyncInvoker<ListLinksRequest, ListLinksResponse>(request, DrsMeta.listLinks, hcClient);
    }

    /**
     * 查询项目标签
     *
     * 查询指定project ID下不同任务类型的所有标签集合。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListProjectTagsRequest 请求对象
     * @return CompletableFuture<ListProjectTagsResponse>
     */
    public CompletableFuture<ListProjectTagsResponse> listProjectTagsAsync(ListProjectTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, DrsMeta.listProjectTags);
    }

    /**
     * 查询项目标签
     *
     * 查询指定project ID下不同任务类型的所有标签集合。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListProjectTagsRequest 请求对象
     * @return AsyncInvoker<ListProjectTagsRequest, ListProjectTagsResponse>
     */
    public AsyncInvoker<ListProjectTagsRequest, ListProjectTagsResponse> listProjectTagsAsyncInvoker(
        ListProjectTagsRequest request) {
        return new AsyncInvoker<ListProjectTagsRequest, ListProjectTagsResponse>(request, DrsMeta.listProjectTags,
            hcClient);
    }

    /**
     * 获取指定任务操作信息
     *
     * 获取指定任务允许、不允许、当前操作信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowActionsRequest 请求对象
     * @return CompletableFuture<ShowActionsResponse>
     */
    public CompletableFuture<ShowActionsResponse> showActionsAsync(ShowActionsRequest request) {
        return hcClient.asyncInvokeHttp(request, DrsMeta.showActions);
    }

    /**
     * 获取指定任务操作信息
     *
     * 获取指定任务允许、不允许、当前操作信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowActionsRequest 请求对象
     * @return AsyncInvoker<ShowActionsRequest, ShowActionsResponse>
     */
    public AsyncInvoker<ShowActionsRequest, ShowActionsResponse> showActionsAsyncInvoker(ShowActionsRequest request) {
        return new AsyncInvoker<ShowActionsRequest, ShowActionsResponse>(request, DrsMeta.showActions, hcClient);
    }

    /**
     * 获取指定数据库表列信息
     *
     * 获取指定数据库表列信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowColumnInfoResultRequest 请求对象
     * @return CompletableFuture<ShowColumnInfoResultResponse>
     */
    public CompletableFuture<ShowColumnInfoResultResponse> showColumnInfoResultAsync(
        ShowColumnInfoResultRequest request) {
        return hcClient.asyncInvokeHttp(request, DrsMeta.showColumnInfoResult);
    }

    /**
     * 获取指定数据库表列信息
     *
     * 获取指定数据库表列信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowColumnInfoResultRequest 请求对象
     * @return AsyncInvoker<ShowColumnInfoResultRequest, ShowColumnInfoResultResponse>
     */
    public AsyncInvoker<ShowColumnInfoResultRequest, ShowColumnInfoResultResponse> showColumnInfoResultAsyncInvoker(
        ShowColumnInfoResultRequest request) {
        return new AsyncInvoker<ShowColumnInfoResultRequest, ShowColumnInfoResultResponse>(request,
            DrsMeta.showColumnInfoResult, hcClient);
    }

    /**
     * 查询对比策略
     *
     * 查询对比策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowComparePolicyRequest 请求对象
     * @return CompletableFuture<ShowComparePolicyResponse>
     */
    public CompletableFuture<ShowComparePolicyResponse> showComparePolicyAsync(ShowComparePolicyRequest request) {
        return hcClient.asyncInvokeHttp(request, DrsMeta.showComparePolicy);
    }

    /**
     * 查询对比策略
     *
     * 查询对比策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowComparePolicyRequest 请求对象
     * @return AsyncInvoker<ShowComparePolicyRequest, ShowComparePolicyResponse>
     */
    public AsyncInvoker<ShowComparePolicyRequest, ShowComparePolicyResponse> showComparePolicyAsyncInvoker(
        ShowComparePolicyRequest request) {
        return new AsyncInvoker<ShowComparePolicyRequest, ShowComparePolicyResponse>(request, DrsMeta.showComparePolicy,
            hcClient);
    }

    /**
     * 获取数据过滤校验结果
     *
     * 获取数据过滤校验结果
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowDataFilteringResultRequest 请求对象
     * @return CompletableFuture<ShowDataFilteringResultResponse>
     */
    public CompletableFuture<ShowDataFilteringResultResponse> showDataFilteringResultAsync(
        ShowDataFilteringResultRequest request) {
        return hcClient.asyncInvokeHttp(request, DrsMeta.showDataFilteringResult);
    }

    /**
     * 获取数据过滤校验结果
     *
     * 获取数据过滤校验结果
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowDataFilteringResultRequest 请求对象
     * @return AsyncInvoker<ShowDataFilteringResultRequest, ShowDataFilteringResultResponse>
     */
    public AsyncInvoker<ShowDataFilteringResultRequest, ShowDataFilteringResultResponse> showDataFilteringResultAsyncInvoker(
        ShowDataFilteringResultRequest request) {
        return new AsyncInvoker<ShowDataFilteringResultRequest, ShowDataFilteringResultResponse>(request,
            DrsMeta.showDataFilteringResult, hcClient);
    }

    /**
     * 获取指定任务数据加工规则更新结果
     *
     * 获取指定任务数据加工规则更新结果
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowDataProcessingRulesResultRequest 请求对象
     * @return CompletableFuture<ShowDataProcessingRulesResultResponse>
     */
    public CompletableFuture<ShowDataProcessingRulesResultResponse> showDataProcessingRulesResultAsync(
        ShowDataProcessingRulesResultRequest request) {
        return hcClient.asyncInvokeHttp(request, DrsMeta.showDataProcessingRulesResult);
    }

    /**
     * 获取指定任务数据加工规则更新结果
     *
     * 获取指定任务数据加工规则更新结果
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowDataProcessingRulesResultRequest 请求对象
     * @return AsyncInvoker<ShowDataProcessingRulesResultRequest, ShowDataProcessingRulesResultResponse>
     */
    public AsyncInvoker<ShowDataProcessingRulesResultRequest, ShowDataProcessingRulesResultResponse> showDataProcessingRulesResultAsyncInvoker(
        ShowDataProcessingRulesResultRequest request) {
        return new AsyncInvoker<ShowDataProcessingRulesResultRequest, ShowDataProcessingRulesResultResponse>(request,
            DrsMeta.showDataProcessingRulesResult, hcClient);
    }

    /**
     * 查询数据加工规则
     *
     * 查询数据加工规则:包含数据库表的映射信息、列信息、数据过滤信息、附加列信息、DDL以及DML信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowDataProgressRequest 请求对象
     * @return CompletableFuture<ShowDataProgressResponse>
     */
    public CompletableFuture<ShowDataProgressResponse> showDataProgressAsync(ShowDataProgressRequest request) {
        return hcClient.asyncInvokeHttp(request, DrsMeta.showDataProgress);
    }

    /**
     * 查询数据加工规则
     *
     * 查询数据加工规则:包含数据库表的映射信息、列信息、数据过滤信息、附加列信息、DDL以及DML信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowDataProgressRequest 请求对象
     * @return AsyncInvoker<ShowDataProgressRequest, ShowDataProgressResponse>
     */
    public AsyncInvoker<ShowDataProgressRequest, ShowDataProgressResponse> showDataProgressAsyncInvoker(
        ShowDataProgressRequest request) {
        return new AsyncInvoker<ShowDataProgressRequest, ShowDataProgressResponse>(request, DrsMeta.showDataProgress,
            hcClient);
    }

    /**
     * 获取提交查询数据库对象信息的结果
     *
     * 获取提交查询数据库对象信息的结果。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowDbObjectCollectionStatusRequest 请求对象
     * @return CompletableFuture<ShowDbObjectCollectionStatusResponse>
     */
    public CompletableFuture<ShowDbObjectCollectionStatusResponse> showDbObjectCollectionStatusAsync(
        ShowDbObjectCollectionStatusRequest request) {
        return hcClient.asyncInvokeHttp(request, DrsMeta.showDbObjectCollectionStatus);
    }

    /**
     * 获取提交查询数据库对象信息的结果
     *
     * 获取提交查询数据库对象信息的结果。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowDbObjectCollectionStatusRequest 请求对象
     * @return AsyncInvoker<ShowDbObjectCollectionStatusRequest, ShowDbObjectCollectionStatusResponse>
     */
    public AsyncInvoker<ShowDbObjectCollectionStatusRequest, ShowDbObjectCollectionStatusResponse> showDbObjectCollectionStatusAsyncInvoker(
        ShowDbObjectCollectionStatusRequest request) {
        return new AsyncInvoker<ShowDbObjectCollectionStatusRequest, ShowDbObjectCollectionStatusResponse>(request,
            DrsMeta.showDbObjectCollectionStatus, hcClient);
    }

    /**
     * 对象选择（文件导入 - 进度查询）
     *
     * 对象选择（文件导入 - 进度查询）。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowDbObjectTemplateProgressRequest 请求对象
     * @return CompletableFuture<ShowDbObjectTemplateProgressResponse>
     */
    public CompletableFuture<ShowDbObjectTemplateProgressResponse> showDbObjectTemplateProgressAsync(
        ShowDbObjectTemplateProgressRequest request) {
        return hcClient.asyncInvokeHttp(request, DrsMeta.showDbObjectTemplateProgress);
    }

    /**
     * 对象选择（文件导入 - 进度查询）
     *
     * 对象选择（文件导入 - 进度查询）。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowDbObjectTemplateProgressRequest 请求对象
     * @return AsyncInvoker<ShowDbObjectTemplateProgressRequest, ShowDbObjectTemplateProgressResponse>
     */
    public AsyncInvoker<ShowDbObjectTemplateProgressRequest, ShowDbObjectTemplateProgressResponse> showDbObjectTemplateProgressAsyncInvoker(
        ShowDbObjectTemplateProgressRequest request) {
        return new AsyncInvoker<ShowDbObjectTemplateProgressRequest, ShowDbObjectTemplateProgressResponse>(request,
            DrsMeta.showDbObjectTemplateProgress, hcClient);
    }

    /**
     * 对象选择（文件导入 - 获取导入结果）
     *
     * 对象选择（文件导入 - 获取导入结果）。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowDbObjectTemplateResultRequest 请求对象
     * @return CompletableFuture<ShowDbObjectTemplateResultResponse>
     */
    public CompletableFuture<ShowDbObjectTemplateResultResponse> showDbObjectTemplateResultAsync(
        ShowDbObjectTemplateResultRequest request) {
        return hcClient.asyncInvokeHttp(request, DrsMeta.showDbObjectTemplateResult);
    }

    /**
     * 对象选择（文件导入 - 获取导入结果）
     *
     * 对象选择（文件导入 - 获取导入结果）。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowDbObjectTemplateResultRequest 请求对象
     * @return AsyncInvoker<ShowDbObjectTemplateResultRequest, ShowDbObjectTemplateResultResponse>
     */
    public AsyncInvoker<ShowDbObjectTemplateResultRequest, ShowDbObjectTemplateResultResponse> showDbObjectTemplateResultAsyncInvoker(
        ShowDbObjectTemplateResultRequest request) {
        return new AsyncInvoker<ShowDbObjectTemplateResultRequest, ShowDbObjectTemplateResultResponse>(request,
            DrsMeta.showDbObjectTemplateResult, hcClient);
    }

    /**
     * 查询数据库对象信息
     *
     * 查询数据库对象信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowDbObjectsListRequest 请求对象
     * @return CompletableFuture<ShowDbObjectsListResponse>
     */
    public CompletableFuture<ShowDbObjectsListResponse> showDbObjectsListAsync(ShowDbObjectsListRequest request) {
        return hcClient.asyncInvokeHttp(request, DrsMeta.showDbObjectsList);
    }

    /**
     * 查询数据库对象信息
     *
     * 查询数据库对象信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowDbObjectsListRequest 请求对象
     * @return AsyncInvoker<ShowDbObjectsListRequest, ShowDbObjectsListResponse>
     */
    public AsyncInvoker<ShowDbObjectsListRequest, ShowDbObjectsListResponse> showDbObjectsListAsyncInvoker(
        ShowDbObjectsListRequest request) {
        return new AsyncInvoker<ShowDbObjectsListRequest, ShowDbObjectsListResponse>(request, DrsMeta.showDbObjectsList,
            hcClient);
    }

    /**
     * 查询异常数据列表
     *
     * 查询异常数据列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowDirtyDataRequest 请求对象
     * @return CompletableFuture<ShowDirtyDataResponse>
     */
    public CompletableFuture<ShowDirtyDataResponse> showDirtyDataAsync(ShowDirtyDataRequest request) {
        return hcClient.asyncInvokeHttp(request, DrsMeta.showDirtyData);
    }

    /**
     * 查询异常数据列表
     *
     * 查询异常数据列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowDirtyDataRequest 请求对象
     * @return AsyncInvoker<ShowDirtyDataRequest, ShowDirtyDataResponse>
     */
    public AsyncInvoker<ShowDirtyDataRequest, ShowDirtyDataResponse> showDirtyDataAsyncInvoker(
        ShowDirtyDataRequest request) {
        return new AsyncInvoker<ShowDirtyDataRequest, ShowDirtyDataResponse>(request, DrsMeta.showDirtyData, hcClient);
    }

    /**
     * 查询企业项目列表
     *
     * 查询企业项目列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowEnterpriseProjectRequest 请求对象
     * @return CompletableFuture<ShowEnterpriseProjectResponse>
     */
    public CompletableFuture<ShowEnterpriseProjectResponse> showEnterpriseProjectAsync(
        ShowEnterpriseProjectRequest request) {
        return hcClient.asyncInvokeHttp(request, DrsMeta.showEnterpriseProject);
    }

    /**
     * 查询企业项目列表
     *
     * 查询企业项目列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowEnterpriseProjectRequest 请求对象
     * @return AsyncInvoker<ShowEnterpriseProjectRequest, ShowEnterpriseProjectResponse>
     */
    public AsyncInvoker<ShowEnterpriseProjectRequest, ShowEnterpriseProjectResponse> showEnterpriseProjectAsyncInvoker(
        ShowEnterpriseProjectRequest request) {
        return new AsyncInvoker<ShowEnterpriseProjectRequest, ShowEnterpriseProjectResponse>(request,
            DrsMeta.showEnterpriseProject, hcClient);
    }

    /**
     * 查询健康对比列表
     *
     * 查询健康对比列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowHealthCompareJobListRequest 请求对象
     * @return CompletableFuture<ShowHealthCompareJobListResponse>
     */
    public CompletableFuture<ShowHealthCompareJobListResponse> showHealthCompareJobListAsync(
        ShowHealthCompareJobListRequest request) {
        return hcClient.asyncInvokeHttp(request, DrsMeta.showHealthCompareJobList);
    }

    /**
     * 查询健康对比列表
     *
     * 查询健康对比列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowHealthCompareJobListRequest 请求对象
     * @return AsyncInvoker<ShowHealthCompareJobListRequest, ShowHealthCompareJobListResponse>
     */
    public AsyncInvoker<ShowHealthCompareJobListRequest, ShowHealthCompareJobListResponse> showHealthCompareJobListAsyncInvoker(
        ShowHealthCompareJobListRequest request) {
        return new AsyncInvoker<ShowHealthCompareJobListRequest, ShowHealthCompareJobListResponse>(request,
            DrsMeta.showHealthCompareJobList, hcClient);
    }

    /**
     * 查询增量组件详情
     *
     * 查询任务同步的增量组件的详细信息，实时同步任务，任务模式为增量或者全量+增量才支持。具体介绍可以参考：[查询同步进度](https://support.huaweicloud.com/realtimesyn-drs/drs_10_0007.html)
     * - 支持的引擎：oracle-to-gaussdbv5，oracle-to-gaussdbv5ha，gaussdbv5，gaussdbv5-to-mysql，gaussdbv5-to-gaussdbv5ha，gaussdbv5ha，gaussdbv5ha-to-gaussdbv5，gaussdbv5-to-dws，gaussdbv5ha-to-dws，gaussdbv5-to-oracle，gaussdbv5ha-to-oracle，oracle-to-dws，oracle-to-mysql
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowIncrementComponentsDetailRequest 请求对象
     * @return CompletableFuture<ShowIncrementComponentsDetailResponse>
     */
    public CompletableFuture<ShowIncrementComponentsDetailResponse> showIncrementComponentsDetailAsync(
        ShowIncrementComponentsDetailRequest request) {
        return hcClient.asyncInvokeHttp(request, DrsMeta.showIncrementComponentsDetail);
    }

    /**
     * 查询增量组件详情
     *
     * 查询任务同步的增量组件的详细信息，实时同步任务，任务模式为增量或者全量+增量才支持。具体介绍可以参考：[查询同步进度](https://support.huaweicloud.com/realtimesyn-drs/drs_10_0007.html)
     * - 支持的引擎：oracle-to-gaussdbv5，oracle-to-gaussdbv5ha，gaussdbv5，gaussdbv5-to-mysql，gaussdbv5-to-gaussdbv5ha，gaussdbv5ha，gaussdbv5ha-to-gaussdbv5，gaussdbv5-to-dws，gaussdbv5ha-to-dws，gaussdbv5-to-oracle，gaussdbv5ha-to-oracle，oracle-to-dws，oracle-to-mysql
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowIncrementComponentsDetailRequest 请求对象
     * @return AsyncInvoker<ShowIncrementComponentsDetailRequest, ShowIncrementComponentsDetailResponse>
     */
    public AsyncInvoker<ShowIncrementComponentsDetailRequest, ShowIncrementComponentsDetailResponse> showIncrementComponentsDetailAsyncInvoker(
        ShowIncrementComponentsDetailRequest request) {
        return new AsyncInvoker<ShowIncrementComponentsDetailRequest, ShowIncrementComponentsDetailResponse>(request,
            DrsMeta.showIncrementComponentsDetail, hcClient);
    }

    /**
     * 查询资源标签
     *
     * 查询指定实例的标签信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowInstanceTagsRequest 请求对象
     * @return CompletableFuture<ShowInstanceTagsResponse>
     */
    public CompletableFuture<ShowInstanceTagsResponse> showInstanceTagsAsync(ShowInstanceTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, DrsMeta.showInstanceTags);
    }

    /**
     * 查询资源标签
     *
     * 查询指定实例的标签信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowInstanceTagsRequest 请求对象
     * @return AsyncInvoker<ShowInstanceTagsRequest, ShowInstanceTagsResponse>
     */
    public AsyncInvoker<ShowInstanceTagsRequest, ShowInstanceTagsResponse> showInstanceTagsAsyncInvoker(
        ShowInstanceTagsRequest request) {
        return new AsyncInvoker<ShowInstanceTagsRequest, ShowInstanceTagsResponse>(request, DrsMeta.showInstanceTags,
            hcClient);
    }

    /**
     * 查询任务详情
     *
     * 查询任务详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowJobDetailRequest 请求对象
     * @return CompletableFuture<ShowJobDetailResponse>
     */
    public CompletableFuture<ShowJobDetailResponse> showJobDetailAsync(ShowJobDetailRequest request) {
        return hcClient.asyncInvokeHttp(request, DrsMeta.showJobDetail);
    }

    /**
     * 查询任务详情
     *
     * 查询任务详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowJobDetailRequest 请求对象
     * @return AsyncInvoker<ShowJobDetailRequest, ShowJobDetailResponse>
     */
    public AsyncInvoker<ShowJobDetailRequest, ShowJobDetailResponse> showJobDetailAsyncInvoker(
        ShowJobDetailRequest request) {
        return new AsyncInvoker<ShowJobDetailRequest, ShowJobDetailResponse>(request, DrsMeta.showJobDetail, hcClient);
    }

    /**
     * 获取任务价格信息
     *
     * 获取询价接口的参数。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowMeteringRequest 请求对象
     * @return CompletableFuture<ShowMeteringResponse>
     */
    public CompletableFuture<ShowMeteringResponse> showMeteringAsync(ShowMeteringRequest request) {
        return hcClient.asyncInvokeHttp(request, DrsMeta.showMetering);
    }

    /**
     * 获取任务价格信息
     *
     * 获取询价接口的参数。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowMeteringRequest 请求对象
     * @return AsyncInvoker<ShowMeteringRequest, ShowMeteringResponse>
     */
    public AsyncInvoker<ShowMeteringRequest, ShowMeteringResponse> showMeteringAsyncInvoker(
        ShowMeteringRequest request) {
        return new AsyncInvoker<ShowMeteringRequest, ShowMeteringResponse>(request, DrsMeta.showMetering, hcClient);
    }

    /**
     * 查询监控数据
     *
     * 获取任务监控数据。
     * - Cassandra灾备不支持。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowMonitorDataRequest 请求对象
     * @return CompletableFuture<ShowMonitorDataResponse>
     */
    public CompletableFuture<ShowMonitorDataResponse> showMonitorDataAsync(ShowMonitorDataRequest request) {
        return hcClient.asyncInvokeHttp(request, DrsMeta.showMonitorData);
    }

    /**
     * 查询监控数据
     *
     * 获取任务监控数据。
     * - Cassandra灾备不支持。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowMonitorDataRequest 请求对象
     * @return AsyncInvoker<ShowMonitorDataRequest, ShowMonitorDataResponse>
     */
    public AsyncInvoker<ShowMonitorDataRequest, ShowMonitorDataResponse> showMonitorDataAsyncInvoker(
        ShowMonitorDataRequest request) {
        return new AsyncInvoker<ShowMonitorDataRequest, ShowMonitorDataResponse>(request, DrsMeta.showMonitorData,
            hcClient);
    }

    /**
     * 查询同步映射列表
     *
     * 查询实时同步映射关系包括对象选择时的库映射、schema映射、表映射和数据加工时的列映射。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowObjectMappingRequest 请求对象
     * @return CompletableFuture<ShowObjectMappingResponse>
     */
    public CompletableFuture<ShowObjectMappingResponse> showObjectMappingAsync(ShowObjectMappingRequest request) {
        return hcClient.asyncInvokeHttp(request, DrsMeta.showObjectMapping);
    }

    /**
     * 查询同步映射列表
     *
     * 查询实时同步映射关系包括对象选择时的库映射、schema映射、表映射和数据加工时的列映射。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowObjectMappingRequest 请求对象
     * @return AsyncInvoker<ShowObjectMappingRequest, ShowObjectMappingResponse>
     */
    public AsyncInvoker<ShowObjectMappingRequest, ShowObjectMappingResponse> showObjectMappingAsyncInvoker(
        ShowObjectMappingRequest request) {
        return new AsyncInvoker<ShowObjectMappingRequest, ShowObjectMappingResponse>(request, DrsMeta.showObjectMapping,
            hcClient);
    }

    /**
     * 获取查询数据库位点的结果
     *
     * 获取查询数据库位点的结果
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowPositionResultRequest 请求对象
     * @return CompletableFuture<ShowPositionResultResponse>
     */
    public CompletableFuture<ShowPositionResultResponse> showPositionResultAsync(ShowPositionResultRequest request) {
        return hcClient.asyncInvokeHttp(request, DrsMeta.showPositionResult);
    }

    /**
     * 获取查询数据库位点的结果
     *
     * 获取查询数据库位点的结果
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowPositionResultRequest 请求对象
     * @return AsyncInvoker<ShowPositionResultRequest, ShowPositionResultResponse>
     */
    public AsyncInvoker<ShowPositionResultRequest, ShowPositionResultResponse> showPositionResultAsyncInvoker(
        ShowPositionResultRequest request) {
        return new AsyncInvoker<ShowPositionResultRequest, ShowPositionResultResponse>(request,
            DrsMeta.showPositionResult, hcClient);
    }

    /**
     * 查询数据级流式对比列表
     *
     * 查询不同迁移对象类型的迁移进度。
     * 说明：
     * - 目前仅MySQL-&gt;MySQL、MySQL-&gt;GaussDB(for MySQL)、MongoDB-&gt;DDS、DDS-&gt;MongoDB的迁移支持查看迁移明细。
     * - 在任务未结束前，不能修改源库和目标库的所有用户、密码和用户权限等。
     * - 全量、增量完成不代表任务结束，如果存在触发器和事件将会进行迁移。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowProgressDataRequest 请求对象
     * @return CompletableFuture<ShowProgressDataResponse>
     */
    public CompletableFuture<ShowProgressDataResponse> showProgressDataAsync(ShowProgressDataRequest request) {
        return hcClient.asyncInvokeHttp(request, DrsMeta.showProgressData);
    }

    /**
     * 查询数据级流式对比列表
     *
     * 查询不同迁移对象类型的迁移进度。
     * 说明：
     * - 目前仅MySQL-&gt;MySQL、MySQL-&gt;GaussDB(for MySQL)、MongoDB-&gt;DDS、DDS-&gt;MongoDB的迁移支持查看迁移明细。
     * - 在任务未结束前，不能修改源库和目标库的所有用户、密码和用户权限等。
     * - 全量、增量完成不代表任务结束，如果存在触发器和事件将会进行迁移。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowProgressDataRequest 请求对象
     * @return AsyncInvoker<ShowProgressDataRequest, ShowProgressDataResponse>
     */
    public AsyncInvoker<ShowProgressDataRequest, ShowProgressDataResponse> showProgressDataAsyncInvoker(
        ShowProgressDataRequest request) {
        return new AsyncInvoker<ShowProgressDataRequest, ShowProgressDataResponse>(request, DrsMeta.showProgressData,
            hcClient);
    }

    /**
     * 查询是否支持对象选择和列映射
     *
     * 查询任务支持的对象选择类型、列映射、支持搜索的对象类型等信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowSupportObjectTypeRequest 请求对象
     * @return CompletableFuture<ShowSupportObjectTypeResponse>
     */
    public CompletableFuture<ShowSupportObjectTypeResponse> showSupportObjectTypeAsync(
        ShowSupportObjectTypeRequest request) {
        return hcClient.asyncInvokeHttp(request, DrsMeta.showSupportObjectType);
    }

    /**
     * 查询是否支持对象选择和列映射
     *
     * 查询任务支持的对象选择类型、列映射、支持搜索的对象类型等信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowSupportObjectTypeRequest 请求对象
     * @return AsyncInvoker<ShowSupportObjectTypeRequest, ShowSupportObjectTypeResponse>
     */
    public AsyncInvoker<ShowSupportObjectTypeRequest, ShowSupportObjectTypeResponse> showSupportObjectTypeAsyncInvoker(
        ShowSupportObjectTypeRequest request) {
        return new AsyncInvoker<ShowSupportObjectTypeRequest, ShowSupportObjectTypeResponse>(request,
            DrsMeta.showSupportObjectType, hcClient);
    }

    /**
     * 获取对象保存进度
     *
     * 获取对象保存进度。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowUpdateObjectSavingStatusRequest 请求对象
     * @return CompletableFuture<ShowUpdateObjectSavingStatusResponse>
     */
    public CompletableFuture<ShowUpdateObjectSavingStatusResponse> showUpdateObjectSavingStatusAsync(
        ShowUpdateObjectSavingStatusRequest request) {
        return hcClient.asyncInvokeHttp(request, DrsMeta.showUpdateObjectSavingStatus);
    }

    /**
     * 获取对象保存进度
     *
     * 获取对象保存进度。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowUpdateObjectSavingStatusRequest 请求对象
     * @return AsyncInvoker<ShowUpdateObjectSavingStatusRequest, ShowUpdateObjectSavingStatusResponse>
     */
    public AsyncInvoker<ShowUpdateObjectSavingStatusRequest, ShowUpdateObjectSavingStatusResponse> showUpdateObjectSavingStatusAsyncInvoker(
        ShowUpdateObjectSavingStatusRequest request) {
        return new AsyncInvoker<ShowUpdateObjectSavingStatusRequest, ShowUpdateObjectSavingStatusResponse>(request,
            DrsMeta.showUpdateObjectSavingStatus, hcClient);
    }

    /**
     * 结束任务
     *
     * 结束租户指定ID任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param StopJobActionRequest 请求对象
     * @return CompletableFuture<StopJobActionResponse>
     */
    public CompletableFuture<StopJobActionResponse> stopJobActionAsync(StopJobActionRequest request) {
        return hcClient.asyncInvokeHttp(request, DrsMeta.stopJobAction);
    }

    /**
     * 结束任务
     *
     * 结束租户指定ID任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param StopJobActionRequest 请求对象
     * @return AsyncInvoker<StopJobActionRequest, StopJobActionResponse>
     */
    public AsyncInvoker<StopJobActionRequest, StopJobActionResponse> stopJobActionAsyncInvoker(
        StopJobActionRequest request) {
        return new AsyncInvoker<StopJobActionRequest, StopJobActionResponse>(request, DrsMeta.stopJobAction, hcClient);
    }

    /**
     * 更新指定ID批量异步任务详情
     *
     * 更新租户指定ID批量异步任务详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateBatchAsyncJobsRequest 请求对象
     * @return CompletableFuture<UpdateBatchAsyncJobsResponse>
     */
    public CompletableFuture<UpdateBatchAsyncJobsResponse> updateBatchAsyncJobsAsync(
        UpdateBatchAsyncJobsRequest request) {
        return hcClient.asyncInvokeHttp(request, DrsMeta.updateBatchAsyncJobs);
    }

    /**
     * 更新指定ID批量异步任务详情
     *
     * 更新租户指定ID批量异步任务详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateBatchAsyncJobsRequest 请求对象
     * @return AsyncInvoker<UpdateBatchAsyncJobsRequest, UpdateBatchAsyncJobsResponse>
     */
    public AsyncInvoker<UpdateBatchAsyncJobsRequest, UpdateBatchAsyncJobsResponse> updateBatchAsyncJobsAsyncInvoker(
        UpdateBatchAsyncJobsRequest request) {
        return new AsyncInvoker<UpdateBatchAsyncJobsRequest, UpdateBatchAsyncJobsResponse>(request,
            DrsMeta.updateBatchAsyncJobs, hcClient);
    }

    /**
     * 更新指定任务数据加工规则
     *
     * 更新指定任务数据加工规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateDataProgressRequest 请求对象
     * @return CompletableFuture<UpdateDataProgressResponse>
     */
    public CompletableFuture<UpdateDataProgressResponse> updateDataProgressAsync(UpdateDataProgressRequest request) {
        return hcClient.asyncInvokeHttp(request, DrsMeta.updateDataProgress);
    }

    /**
     * 更新指定任务数据加工规则
     *
     * 更新指定任务数据加工规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateDataProgressRequest 请求对象
     * @return AsyncInvoker<UpdateDataProgressRequest, UpdateDataProgressResponse>
     */
    public AsyncInvoker<UpdateDataProgressRequest, UpdateDataProgressResponse> updateDataProgressAsyncInvoker(
        UpdateDataProgressRequest request) {
        return new AsyncInvoker<UpdateDataProgressRequest, UpdateDataProgressResponse>(request,
            DrsMeta.updateDataProgress, hcClient);
    }

    /**
     * 更新指定ID任务详情
     *
     * 更新租户指定ID任务详情。
     * 当type取值为db_object， 进行异步处理。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateJobRequest 请求对象
     * @return CompletableFuture<UpdateJobResponse>
     */
    public CompletableFuture<UpdateJobResponse> updateJobAsync(UpdateJobRequest request) {
        return hcClient.asyncInvokeHttp(request, DrsMeta.updateJob);
    }

    /**
     * 更新指定ID任务详情
     *
     * 更新租户指定ID任务详情。
     * 当type取值为db_object， 进行异步处理。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateJobRequest 请求对象
     * @return AsyncInvoker<UpdateJobRequest, UpdateJobResponse>
     */
    public AsyncInvoker<UpdateJobRequest, UpdateJobResponse> updateJobAsyncInvoker(UpdateJobRequest request) {
        return new AsyncInvoker<UpdateJobRequest, UpdateJobResponse>(request, DrsMeta.updateJob, hcClient);
    }

    /**
     * 更新增量任务启动位点
     *
     * 更新增量任务的启动位点。
     * - 仅engine_type为mysql,mysql-to-dws,mysql-to-taurus,taurus,mysql-to-oracle,taurus-to-oracle,taurus-to-mysql,mysql-to-kafka,taurus-to-kafka,mongodb-to-kafka,mongodb且为单增量实时同步任务支持。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateStartPositionRequest 请求对象
     * @return CompletableFuture<UpdateStartPositionResponse>
     */
    public CompletableFuture<UpdateStartPositionResponse> updateStartPositionAsync(UpdateStartPositionRequest request) {
        return hcClient.asyncInvokeHttp(request, DrsMeta.updateStartPosition);
    }

    /**
     * 更新增量任务启动位点
     *
     * 更新增量任务的启动位点。
     * - 仅engine_type为mysql,mysql-to-dws,mysql-to-taurus,taurus,mysql-to-oracle,taurus-to-oracle,taurus-to-mysql,mysql-to-kafka,taurus-to-kafka,mongodb-to-kafka,mongodb且为单增量实时同步任务支持。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateStartPositionRequest 请求对象
     * @return AsyncInvoker<UpdateStartPositionRequest, UpdateStartPositionResponse>
     */
    public AsyncInvoker<UpdateStartPositionRequest, UpdateStartPositionResponse> updateStartPositionAsyncInvoker(
        UpdateStartPositionRequest request) {
        return new AsyncInvoker<UpdateStartPositionRequest, UpdateStartPositionResponse>(request,
            DrsMeta.updateStartPosition, hcClient);
    }

    /**
     * 对象选择（文件导入 - 模板上传）
     *
     * 对象选择（文件导入 - 模板上传）。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UploadDbObjectTemplateRequest 请求对象
     * @return CompletableFuture<UploadDbObjectTemplateResponse>
     */
    public CompletableFuture<UploadDbObjectTemplateResponse> uploadDbObjectTemplateAsync(
        UploadDbObjectTemplateRequest request) {
        return hcClient.asyncInvokeHttp(request, DrsMeta.uploadDbObjectTemplate);
    }

    /**
     * 对象选择（文件导入 - 模板上传）
     *
     * 对象选择（文件导入 - 模板上传）。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UploadDbObjectTemplateRequest 请求对象
     * @return AsyncInvoker<UploadDbObjectTemplateRequest, UploadDbObjectTemplateResponse>
     */
    public AsyncInvoker<UploadDbObjectTemplateRequest, UploadDbObjectTemplateResponse> uploadDbObjectTemplateAsyncInvoker(
        UploadDbObjectTemplateRequest request) {
        return new AsyncInvoker<UploadDbObjectTemplateRequest, UploadDbObjectTemplateResponse>(request,
            DrsMeta.uploadDbObjectTemplate, hcClient);
    }

    /**
     * 任务名称校验
     *
     * 创建任务时对任务名称进行校验。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ValidateJobNameRequest 请求对象
     * @return CompletableFuture<ValidateJobNameResponse>
     */
    public CompletableFuture<ValidateJobNameResponse> validateJobNameAsync(ValidateJobNameRequest request) {
        return hcClient.asyncInvokeHttp(request, DrsMeta.validateJobName);
    }

    /**
     * 任务名称校验
     *
     * 创建任务时对任务名称进行校验。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ValidateJobNameRequest 请求对象
     * @return AsyncInvoker<ValidateJobNameRequest, ValidateJobNameResponse>
     */
    public AsyncInvoker<ValidateJobNameRequest, ValidateJobNameResponse> validateJobNameAsyncInvoker(
        ValidateJobNameRequest request) {
        return new AsyncInvoker<ValidateJobNameRequest, ValidateJobNameResponse>(request, DrsMeta.validateJobName,
            hcClient);
    }

}
