package com.huaweicloud.sdk.koomap.v1;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.SyncInvoker;
import com.huaweicloud.sdk.koomap.v1.model.AddSpurPointRequest;
import com.huaweicloud.sdk.koomap.v1.model.AddSpurPointResponse;
import com.huaweicloud.sdk.koomap.v1.model.CreateCommonWorkspaceRequest;
import com.huaweicloud.sdk.koomap.v1.model.CreateCommonWorkspaceResponse;
import com.huaweicloud.sdk.koomap.v1.model.CreateMarkerInfoRequest;
import com.huaweicloud.sdk.koomap.v1.model.CreateMarkerInfoResponse;
import com.huaweicloud.sdk.koomap.v1.model.CreateReal3DTaskRequest;
import com.huaweicloud.sdk.koomap.v1.model.CreateReal3DTaskResponse;
import com.huaweicloud.sdk.koomap.v1.model.CreateTaskRequest;
import com.huaweicloud.sdk.koomap.v1.model.CreateTaskResponse;
import com.huaweicloud.sdk.koomap.v1.model.DeleteCommonWorkspaceRequest;
import com.huaweicloud.sdk.koomap.v1.model.DeleteCommonWorkspaceResponse;
import com.huaweicloud.sdk.koomap.v1.model.DeleteMarkPointInfoRequest;
import com.huaweicloud.sdk.koomap.v1.model.DeleteMarkPointInfoResponse;
import com.huaweicloud.sdk.koomap.v1.model.DeleteReal3DProductRequest;
import com.huaweicloud.sdk.koomap.v1.model.DeleteReal3DProductResponse;
import com.huaweicloud.sdk.koomap.v1.model.DeleteReal3DTaskRequest;
import com.huaweicloud.sdk.koomap.v1.model.DeleteReal3DTaskResponse;
import com.huaweicloud.sdk.koomap.v1.model.DeleteSpurPointRequest;
import com.huaweicloud.sdk.koomap.v1.model.DeleteSpurPointResponse;
import com.huaweicloud.sdk.koomap.v1.model.DeleteTaskRequest;
import com.huaweicloud.sdk.koomap.v1.model.DeleteTaskResponse;
import com.huaweicloud.sdk.koomap.v1.model.EstimateSpurPointRequest;
import com.huaweicloud.sdk.koomap.v1.model.EstimateSpurPointResponse;
import com.huaweicloud.sdk.koomap.v1.model.ListCommonWorkspaceRequest;
import com.huaweicloud.sdk.koomap.v1.model.ListCommonWorkspaceResponse;
import com.huaweicloud.sdk.koomap.v1.model.ListFolderRequest;
import com.huaweicloud.sdk.koomap.v1.model.ListFolderResponse;
import com.huaweicloud.sdk.koomap.v1.model.ListImageBaseInfoRequest;
import com.huaweicloud.sdk.koomap.v1.model.ListImageBaseInfoResponse;
import com.huaweicloud.sdk.koomap.v1.model.ListMarkPointsRequest;
import com.huaweicloud.sdk.koomap.v1.model.ListMarkPointsResponse;
import com.huaweicloud.sdk.koomap.v1.model.ListReal3DProductsRequest;
import com.huaweicloud.sdk.koomap.v1.model.ListReal3DProductsResponse;
import com.huaweicloud.sdk.koomap.v1.model.ListSpurPointsRequest;
import com.huaweicloud.sdk.koomap.v1.model.ListSpurPointsResponse;
import com.huaweicloud.sdk.koomap.v1.model.ListTaskInfoRequest;
import com.huaweicloud.sdk.koomap.v1.model.ListTaskInfoResponse;
import com.huaweicloud.sdk.koomap.v1.model.ListTasksInWorkspaceRequest;
import com.huaweicloud.sdk.koomap.v1.model.ListTasksInWorkspaceResponse;
import com.huaweicloud.sdk.koomap.v1.model.ListUsageInfoRequest;
import com.huaweicloud.sdk.koomap.v1.model.ListUsageInfoResponse;
import com.huaweicloud.sdk.koomap.v1.model.SaveMarkPointInfoRequest;
import com.huaweicloud.sdk.koomap.v1.model.SaveMarkPointInfoResponse;
import com.huaweicloud.sdk.koomap.v1.model.ShowReal3DUsageRequest;
import com.huaweicloud.sdk.koomap.v1.model.ShowReal3DUsageResponse;
import com.huaweicloud.sdk.koomap.v1.model.ShowSpurPredictStatusRequest;
import com.huaweicloud.sdk.koomap.v1.model.ShowSpurPredictStatusResponse;
import com.huaweicloud.sdk.koomap.v1.model.ShowTaskOverviewInWorkspaceRequest;
import com.huaweicloud.sdk.koomap.v1.model.ShowTaskOverviewInWorkspaceResponse;
import com.huaweicloud.sdk.koomap.v1.model.ShowTaskOverviewRequest;
import com.huaweicloud.sdk.koomap.v1.model.ShowTaskOverviewResponse;
import com.huaweicloud.sdk.koomap.v1.model.StartNaviRequest;
import com.huaweicloud.sdk.koomap.v1.model.StartNaviResponse;
import com.huaweicloud.sdk.koomap.v1.model.StartReal3DTaskRequest;
import com.huaweicloud.sdk.koomap.v1.model.StartReal3DTaskResponse;
import com.huaweicloud.sdk.koomap.v1.model.StartTaskRequest;
import com.huaweicloud.sdk.koomap.v1.model.StartTaskResponse;
import com.huaweicloud.sdk.koomap.v1.model.StartVpsRequest;
import com.huaweicloud.sdk.koomap.v1.model.StartVpsResponse;
import com.huaweicloud.sdk.koomap.v1.model.StopReal3DTaskRequest;
import com.huaweicloud.sdk.koomap.v1.model.StopReal3DTaskResponse;
import com.huaweicloud.sdk.koomap.v1.model.StopTaskRequest;
import com.huaweicloud.sdk.koomap.v1.model.StopTaskResponse;
import com.huaweicloud.sdk.koomap.v1.model.UpdateCommonWorkspaceRequest;
import com.huaweicloud.sdk.koomap.v1.model.UpdateCommonWorkspaceResponse;
import com.huaweicloud.sdk.koomap.v1.model.UpdateReal3DTaskArchivedStatusRequest;
import com.huaweicloud.sdk.koomap.v1.model.UpdateReal3DTaskArchivedStatusResponse;
import com.huaweicloud.sdk.koomap.v1.model.UpdateReal3DTaskRequest;
import com.huaweicloud.sdk.koomap.v1.model.UpdateReal3DTaskResponse;
import com.huaweicloud.sdk.koomap.v1.model.UpdateTaskArchivedStatusRequest;
import com.huaweicloud.sdk.koomap.v1.model.UpdateTaskArchivedStatusResponse;
import com.huaweicloud.sdk.koomap.v1.model.ValidateImageRequest;
import com.huaweicloud.sdk.koomap.v1.model.ValidateImageResponse;

public class KooMapClient {

    protected HcClient hcClient;

    public KooMapClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<KooMapClient> newBuilder() {
        ClientBuilder<KooMapClient> clientBuilder = new ClientBuilder<>(KooMapClient::new);
        return clientBuilder;
    }

    /**
     * 新增图片上的刺点
     *
     * 用户选择生产资料列表中的像控点信息，并在图片中标记出来的过程叫做刺点。该接口用来在图片上新增刺点，刺点的具体信息包括： 
     * - 像控点的经度、纬度、高度及精度信息。
     * - 刺点所在的图片ID，以及在图片中的像素点位置信息，包括横向和纵向像素值。
     * - 刺点所属的任务ID信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param AddSpurPointRequest 请求对象
     * @return AddSpurPointResponse
     */
    public AddSpurPointResponse addSpurPoint(AddSpurPointRequest request) {
        return hcClient.syncInvokeHttp(request, KooMapMeta.addSpurPoint);
    }

    /**
     * 新增图片上的刺点
     *
     * 用户选择生产资料列表中的像控点信息，并在图片中标记出来的过程叫做刺点。该接口用来在图片上新增刺点，刺点的具体信息包括： 
     * - 像控点的经度、纬度、高度及精度信息。
     * - 刺点所在的图片ID，以及在图片中的像素点位置信息，包括横向和纵向像素值。
     * - 刺点所属的任务ID信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param AddSpurPointRequest 请求对象
     * @return SyncInvoker<AddSpurPointRequest, AddSpurPointResponse>
     */
    public SyncInvoker<AddSpurPointRequest, AddSpurPointResponse> addSpurPointInvoker(AddSpurPointRequest request) {
        return new SyncInvoker<AddSpurPointRequest, AddSpurPointResponse>(request, KooMapMeta.addSpurPoint, hcClient);
    }

    /**
     * 创建工作共享空间
     *
     * 该接口支持创建工作共享空间，便于对任务进行分类管理。一个租户创建的工作共享空间上限为500个，工作共享空间名称不能重复（大小写不敏感）。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateCommonWorkspaceRequest 请求对象
     * @return CreateCommonWorkspaceResponse
     */
    public CreateCommonWorkspaceResponse createCommonWorkspace(CreateCommonWorkspaceRequest request) {
        return hcClient.syncInvokeHttp(request, KooMapMeta.createCommonWorkspace);
    }

    /**
     * 创建工作共享空间
     *
     * 该接口支持创建工作共享空间，便于对任务进行分类管理。一个租户创建的工作共享空间上限为500个，工作共享空间名称不能重复（大小写不敏感）。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateCommonWorkspaceRequest 请求对象
     * @return SyncInvoker<CreateCommonWorkspaceRequest, CreateCommonWorkspaceResponse>
     */
    public SyncInvoker<CreateCommonWorkspaceRequest, CreateCommonWorkspaceResponse> createCommonWorkspaceInvoker(
        CreateCommonWorkspaceRequest request) {
        return new SyncInvoker<CreateCommonWorkspaceRequest, CreateCommonWorkspaceResponse>(request,
            KooMapMeta.createCommonWorkspace, hcClient);
    }

    /**
     * 生成刺点文件
     *
     * 根据当前任务中的所有图片的刺点信息，生成算法运行时需要的刺点文件。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateMarkerInfoRequest 请求对象
     * @return CreateMarkerInfoResponse
     */
    public CreateMarkerInfoResponse createMarkerInfo(CreateMarkerInfoRequest request) {
        return hcClient.syncInvokeHttp(request, KooMapMeta.createMarkerInfo);
    }

    /**
     * 生成刺点文件
     *
     * 根据当前任务中的所有图片的刺点信息，生成算法运行时需要的刺点文件。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateMarkerInfoRequest 请求对象
     * @return SyncInvoker<CreateMarkerInfoRequest, CreateMarkerInfoResponse>
     */
    public SyncInvoker<CreateMarkerInfoRequest, CreateMarkerInfoResponse> createMarkerInfoInvoker(
        CreateMarkerInfoRequest request) {
        return new SyncInvoker<CreateMarkerInfoRequest, CreateMarkerInfoResponse>(request, KooMapMeta.createMarkerInfo,
            hcClient);
    }

    /**
     * 创建实景三维建模任务
     *
     * 创建实景三维建模任务时，必须绑定工作共享空间。每个工作共享空间内可绑定的任务上限为500个，任务名称需唯一，不能重复（大小写不敏感）。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateReal3DTaskRequest 请求对象
     * @return CreateReal3DTaskResponse
     */
    public CreateReal3DTaskResponse createReal3DTask(CreateReal3DTaskRequest request) {
        return hcClient.syncInvokeHttp(request, KooMapMeta.createReal3DTask);
    }

    /**
     * 创建实景三维建模任务
     *
     * 创建实景三维建模任务时，必须绑定工作共享空间。每个工作共享空间内可绑定的任务上限为500个，任务名称需唯一，不能重复（大小写不敏感）。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateReal3DTaskRequest 请求对象
     * @return SyncInvoker<CreateReal3DTaskRequest, CreateReal3DTaskResponse>
     */
    public SyncInvoker<CreateReal3DTaskRequest, CreateReal3DTaskResponse> createReal3DTaskInvoker(
        CreateReal3DTaskRequest request) {
        return new SyncInvoker<CreateReal3DTaskRequest, CreateReal3DTaskResponse>(request, KooMapMeta.createReal3DTask,
            hcClient);
    }

    /**
     * 新建任务
     *
     * 在工作共享空间内新建数据处理任务，新建任务的“成果影像名称”参数可从“校验原始影像文件”接口中获取。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateTaskRequest 请求对象
     * @return CreateTaskResponse
     */
    public CreateTaskResponse createTask(CreateTaskRequest request) {
        return hcClient.syncInvokeHttp(request, KooMapMeta.createTask);
    }

    /**
     * 新建任务
     *
     * 在工作共享空间内新建数据处理任务，新建任务的“成果影像名称”参数可从“校验原始影像文件”接口中获取。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateTaskRequest 请求对象
     * @return SyncInvoker<CreateTaskRequest, CreateTaskResponse>
     */
    public SyncInvoker<CreateTaskRequest, CreateTaskResponse> createTaskInvoker(CreateTaskRequest request) {
        return new SyncInvoker<CreateTaskRequest, CreateTaskResponse>(request, KooMapMeta.createTask, hcClient);
    }

    /**
     * 删除工作共享空间
     *
     * 该接口用于删除一个工作共享空间。在删除之前，必须保证空间未被置顶且空间内没有任务，否则会删除失败。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteCommonWorkspaceRequest 请求对象
     * @return DeleteCommonWorkspaceResponse
     */
    public DeleteCommonWorkspaceResponse deleteCommonWorkspace(DeleteCommonWorkspaceRequest request) {
        return hcClient.syncInvokeHttp(request, KooMapMeta.deleteCommonWorkspace);
    }

    /**
     * 删除工作共享空间
     *
     * 该接口用于删除一个工作共享空间。在删除之前，必须保证空间未被置顶且空间内没有任务，否则会删除失败。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteCommonWorkspaceRequest 请求对象
     * @return SyncInvoker<DeleteCommonWorkspaceRequest, DeleteCommonWorkspaceResponse>
     */
    public SyncInvoker<DeleteCommonWorkspaceRequest, DeleteCommonWorkspaceResponse> deleteCommonWorkspaceInvoker(
        DeleteCommonWorkspaceRequest request) {
        return new SyncInvoker<DeleteCommonWorkspaceRequest, DeleteCommonWorkspaceResponse>(request,
            KooMapMeta.deleteCommonWorkspace, hcClient);
    }

    /**
     * 删除用户已上传的像控点信息
     *
     * 删除上传过的像控点信息（生产资料）。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteMarkPointInfoRequest 请求对象
     * @return DeleteMarkPointInfoResponse
     */
    public DeleteMarkPointInfoResponse deleteMarkPointInfo(DeleteMarkPointInfoRequest request) {
        return hcClient.syncInvokeHttp(request, KooMapMeta.deleteMarkPointInfo);
    }

    /**
     * 删除用户已上传的像控点信息
     *
     * 删除上传过的像控点信息（生产资料）。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteMarkPointInfoRequest 请求对象
     * @return SyncInvoker<DeleteMarkPointInfoRequest, DeleteMarkPointInfoResponse>
     */
    public SyncInvoker<DeleteMarkPointInfoRequest, DeleteMarkPointInfoResponse> deleteMarkPointInfoInvoker(
        DeleteMarkPointInfoRequest request) {
        return new SyncInvoker<DeleteMarkPointInfoRequest, DeleteMarkPointInfoResponse>(request,
            KooMapMeta.deleteMarkPointInfo, hcClient);
    }

    /**
     * 删除实景三维成果影像
     *
     * 删除实景三维成果影像。仅当成果影像状态为“available”时才可以删除。该接口执行后，成果影像状态更新为“deleting”。在完成删除后成果影像将被删除，且数据不可恢复。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteReal3DProductRequest 请求对象
     * @return DeleteReal3DProductResponse
     */
    public DeleteReal3DProductResponse deleteReal3DProduct(DeleteReal3DProductRequest request) {
        return hcClient.syncInvokeHttp(request, KooMapMeta.deleteReal3DProduct);
    }

    /**
     * 删除实景三维成果影像
     *
     * 删除实景三维成果影像。仅当成果影像状态为“available”时才可以删除。该接口执行后，成果影像状态更新为“deleting”。在完成删除后成果影像将被删除，且数据不可恢复。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteReal3DProductRequest 请求对象
     * @return SyncInvoker<DeleteReal3DProductRequest, DeleteReal3DProductResponse>
     */
    public SyncInvoker<DeleteReal3DProductRequest, DeleteReal3DProductResponse> deleteReal3DProductInvoker(
        DeleteReal3DProductRequest request) {
        return new SyncInvoker<DeleteReal3DProductRequest, DeleteReal3DProductResponse>(request,
            KooMapMeta.deleteReal3DProduct, hcClient);
    }

    /**
     * 删除实景三维建模任务
     *
     * 该接口用于删除状态为初始化（INIT）、启动失败（START_FAILED）、运行失败（FAILED）、已停止（STOP_SUCCESS）或运行成功（SUCCESS）的任务。注意：删除任务不影响已完成建模的三维成果影像数据。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteReal3DTaskRequest 请求对象
     * @return DeleteReal3DTaskResponse
     */
    public DeleteReal3DTaskResponse deleteReal3DTask(DeleteReal3DTaskRequest request) {
        return hcClient.syncInvokeHttp(request, KooMapMeta.deleteReal3DTask);
    }

    /**
     * 删除实景三维建模任务
     *
     * 该接口用于删除状态为初始化（INIT）、启动失败（START_FAILED）、运行失败（FAILED）、已停止（STOP_SUCCESS）或运行成功（SUCCESS）的任务。注意：删除任务不影响已完成建模的三维成果影像数据。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteReal3DTaskRequest 请求对象
     * @return SyncInvoker<DeleteReal3DTaskRequest, DeleteReal3DTaskResponse>
     */
    public SyncInvoker<DeleteReal3DTaskRequest, DeleteReal3DTaskResponse> deleteReal3DTaskInvoker(
        DeleteReal3DTaskRequest request) {
        return new SyncInvoker<DeleteReal3DTaskRequest, DeleteReal3DTaskResponse>(request, KooMapMeta.deleteReal3DTask,
            hcClient);
    }

    /**
     * 删除图片上的刺点
     *
     * 根据刺点ID, 删除图片上的刺点。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteSpurPointRequest 请求对象
     * @return DeleteSpurPointResponse
     */
    public DeleteSpurPointResponse deleteSpurPoint(DeleteSpurPointRequest request) {
        return hcClient.syncInvokeHttp(request, KooMapMeta.deleteSpurPoint);
    }

    /**
     * 删除图片上的刺点
     *
     * 根据刺点ID, 删除图片上的刺点。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteSpurPointRequest 请求对象
     * @return SyncInvoker<DeleteSpurPointRequest, DeleteSpurPointResponse>
     */
    public SyncInvoker<DeleteSpurPointRequest, DeleteSpurPointResponse> deleteSpurPointInvoker(
        DeleteSpurPointRequest request) {
        return new SyncInvoker<DeleteSpurPointRequest, DeleteSpurPointResponse>(request, KooMapMeta.deleteSpurPoint,
            hcClient);
    }

    /**
     * 删除任务
     *
     * 用于任务的删除。只有失败、未运行、停止成功状态的任务可以删除，删除成功后任务不在任务列表中显示。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteTaskRequest 请求对象
     * @return DeleteTaskResponse
     */
    public DeleteTaskResponse deleteTask(DeleteTaskRequest request) {
        return hcClient.syncInvokeHttp(request, KooMapMeta.deleteTask);
    }

    /**
     * 删除任务
     *
     * 用于任务的删除。只有失败、未运行、停止成功状态的任务可以删除，删除成功后任务不在任务列表中显示。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteTaskRequest 请求对象
     * @return SyncInvoker<DeleteTaskRequest, DeleteTaskResponse>
     */
    public SyncInvoker<DeleteTaskRequest, DeleteTaskResponse> deleteTaskInvoker(DeleteTaskRequest request) {
        return new SyncInvoker<DeleteTaskRequest, DeleteTaskResponse>(request, KooMapMeta.deleteTask, hcClient);
    }

    /**
     * 预测刺点信息
     *
     * 根据选中的像控点信息，筛选出可能包含该像控点的图片列表，并给出像控点在图片中的位置，提供刺点参考信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param EstimateSpurPointRequest 请求对象
     * @return EstimateSpurPointResponse
     */
    public EstimateSpurPointResponse estimateSpurPoint(EstimateSpurPointRequest request) {
        return hcClient.syncInvokeHttp(request, KooMapMeta.estimateSpurPoint);
    }

    /**
     * 预测刺点信息
     *
     * 根据选中的像控点信息，筛选出可能包含该像控点的图片列表，并给出像控点在图片中的位置，提供刺点参考信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param EstimateSpurPointRequest 请求对象
     * @return SyncInvoker<EstimateSpurPointRequest, EstimateSpurPointResponse>
     */
    public SyncInvoker<EstimateSpurPointRequest, EstimateSpurPointResponse> estimateSpurPointInvoker(
        EstimateSpurPointRequest request) {
        return new SyncInvoker<EstimateSpurPointRequest, EstimateSpurPointResponse>(request,
            KooMapMeta.estimateSpurPoint, hcClient);
    }

    /**
     * 查询工作共享空间列表
     *
     * 该接口用于分页查询工作共享空间列表，支持过滤条件：
     * - 工作共享空间名称（workspace_name）：支持模糊查询。
     * - 工作共享空间是否置顶显示：最多可置顶4个工作共享空间。
     * - 创建时间范围（create_time_from和create_time_to）：UTC时间格式字符串，格式为yyyy-MM-dd&#39;T&#39;HH:mm:ss&#39;Z&#39;。
     * - 更新时间范围（update_time_from和update_time_to）：UTC时间格式字符串，格式为yyyy-MM-dd&#39;T&#39;HH:mm:ss&#39;Z&#39;。
     * - 分页参数：偏移量offset（缺省值为0），每页限制数量limit（缺省值为10）。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListCommonWorkspaceRequest 请求对象
     * @return ListCommonWorkspaceResponse
     */
    public ListCommonWorkspaceResponse listCommonWorkspace(ListCommonWorkspaceRequest request) {
        return hcClient.syncInvokeHttp(request, KooMapMeta.listCommonWorkspace);
    }

    /**
     * 查询工作共享空间列表
     *
     * 该接口用于分页查询工作共享空间列表，支持过滤条件：
     * - 工作共享空间名称（workspace_name）：支持模糊查询。
     * - 工作共享空间是否置顶显示：最多可置顶4个工作共享空间。
     * - 创建时间范围（create_time_from和create_time_to）：UTC时间格式字符串，格式为yyyy-MM-dd&#39;T&#39;HH:mm:ss&#39;Z&#39;。
     * - 更新时间范围（update_time_from和update_time_to）：UTC时间格式字符串，格式为yyyy-MM-dd&#39;T&#39;HH:mm:ss&#39;Z&#39;。
     * - 分页参数：偏移量offset（缺省值为0），每页限制数量limit（缺省值为10）。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListCommonWorkspaceRequest 请求对象
     * @return SyncInvoker<ListCommonWorkspaceRequest, ListCommonWorkspaceResponse>
     */
    public SyncInvoker<ListCommonWorkspaceRequest, ListCommonWorkspaceResponse> listCommonWorkspaceInvoker(
        ListCommonWorkspaceRequest request) {
        return new SyncInvoker<ListCommonWorkspaceRequest, ListCommonWorkspaceResponse>(request,
            KooMapMeta.listCommonWorkspace, hcClient);
    }

    /**
     * 查询当前租户的影像列表
     *
     * 根据分页条件（分页的偏移量或每页的数据量），查询当前租户的影像基本信息列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListFolderRequest 请求对象
     * @return ListFolderResponse
     */
    public ListFolderResponse listFolder(ListFolderRequest request) {
        return hcClient.syncInvokeHttp(request, KooMapMeta.listFolder);
    }

    /**
     * 查询当前租户的影像列表
     *
     * 根据分页条件（分页的偏移量或每页的数据量），查询当前租户的影像基本信息列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListFolderRequest 请求对象
     * @return SyncInvoker<ListFolderRequest, ListFolderResponse>
     */
    public SyncInvoker<ListFolderRequest, ListFolderResponse> listFolderInvoker(ListFolderRequest request) {
        return new SyncInvoker<ListFolderRequest, ListFolderResponse>(request, KooMapMeta.listFolder, hcClient);
    }

    /**
     * 查询卫星影像基本信息
     *
     * 根据过滤条件查询卫星影像信息列表。过滤条件有：影像名称、上传日期、影像别名、影像等级、影像状态、是否为成果数据、分页偏移量、每页显示条数。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListImageBaseInfoRequest 请求对象
     * @return ListImageBaseInfoResponse
     */
    public ListImageBaseInfoResponse listImageBaseInfo(ListImageBaseInfoRequest request) {
        return hcClient.syncInvokeHttp(request, KooMapMeta.listImageBaseInfo);
    }

    /**
     * 查询卫星影像基本信息
     *
     * 根据过滤条件查询卫星影像信息列表。过滤条件有：影像名称、上传日期、影像别名、影像等级、影像状态、是否为成果数据、分页偏移量、每页显示条数。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListImageBaseInfoRequest 请求对象
     * @return SyncInvoker<ListImageBaseInfoRequest, ListImageBaseInfoResponse>
     */
    public SyncInvoker<ListImageBaseInfoRequest, ListImageBaseInfoResponse> listImageBaseInfoInvoker(
        ListImageBaseInfoRequest request) {
        return new SyncInvoker<ListImageBaseInfoRequest, ListImageBaseInfoResponse>(request,
            KooMapMeta.listImageBaseInfo, hcClient);
    }

    /**
     * 获取用户上传的像控点信息
     *
     * 获取用户上传的所有像控点信息（生产资料）。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListMarkPointsRequest 请求对象
     * @return ListMarkPointsResponse
     */
    public ListMarkPointsResponse listMarkPoints(ListMarkPointsRequest request) {
        return hcClient.syncInvokeHttp(request, KooMapMeta.listMarkPoints);
    }

    /**
     * 获取用户上传的像控点信息
     *
     * 获取用户上传的所有像控点信息（生产资料）。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListMarkPointsRequest 请求对象
     * @return SyncInvoker<ListMarkPointsRequest, ListMarkPointsResponse>
     */
    public SyncInvoker<ListMarkPointsRequest, ListMarkPointsResponse> listMarkPointsInvoker(
        ListMarkPointsRequest request) {
        return new SyncInvoker<ListMarkPointsRequest, ListMarkPointsResponse>(request, KooMapMeta.listMarkPoints,
            hcClient);
    }

    /**
     * 查询实景三维成果影像列表
     *
     * 查询实景三维成果影像列表。返回成果影像查询结果以更新时间倒序排列，支持根据以下条件查询：
     * - product_name：成果影像名称，模糊匹配。
     * - product_id：成果影像ID，精确匹配。
     * - offset：查询记录偏移量，设置忽略前面多少个记录，缺省值为0。
     * - limit：查询返回的记录条数，缺省值为10。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListReal3DProductsRequest 请求对象
     * @return ListReal3DProductsResponse
     */
    public ListReal3DProductsResponse listReal3DProducts(ListReal3DProductsRequest request) {
        return hcClient.syncInvokeHttp(request, KooMapMeta.listReal3DProducts);
    }

    /**
     * 查询实景三维成果影像列表
     *
     * 查询实景三维成果影像列表。返回成果影像查询结果以更新时间倒序排列，支持根据以下条件查询：
     * - product_name：成果影像名称，模糊匹配。
     * - product_id：成果影像ID，精确匹配。
     * - offset：查询记录偏移量，设置忽略前面多少个记录，缺省值为0。
     * - limit：查询返回的记录条数，缺省值为10。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListReal3DProductsRequest 请求对象
     * @return SyncInvoker<ListReal3DProductsRequest, ListReal3DProductsResponse>
     */
    public SyncInvoker<ListReal3DProductsRequest, ListReal3DProductsResponse> listReal3DProductsInvoker(
        ListReal3DProductsRequest request) {
        return new SyncInvoker<ListReal3DProductsRequest, ListReal3DProductsResponse>(request,
            KooMapMeta.listReal3DProducts, hcClient);
    }

    /**
     * 获取单张图片里的所有刺点信息
     *
     * 获取单张图片里的所有刺点信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListSpurPointsRequest 请求对象
     * @return ListSpurPointsResponse
     */
    public ListSpurPointsResponse listSpurPoints(ListSpurPointsRequest request) {
        return hcClient.syncInvokeHttp(request, KooMapMeta.listSpurPoints);
    }

    /**
     * 获取单张图片里的所有刺点信息
     *
     * 获取单张图片里的所有刺点信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListSpurPointsRequest 请求对象
     * @return SyncInvoker<ListSpurPointsRequest, ListSpurPointsResponse>
     */
    public SyncInvoker<ListSpurPointsRequest, ListSpurPointsResponse> listSpurPointsInvoker(
        ListSpurPointsRequest request) {
        return new SyncInvoker<ListSpurPointsRequest, ListSpurPointsResponse>(request, KooMapMeta.listSpurPoints,
            hcClient);
    }

    /**
     * 查询任务
     *
     * 根据设置的过滤条件（任务状态）分页查询任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListTaskInfoRequest 请求对象
     * @return ListTaskInfoResponse
     */
    public ListTaskInfoResponse listTaskInfo(ListTaskInfoRequest request) {
        return hcClient.syncInvokeHttp(request, KooMapMeta.listTaskInfo);
    }

    /**
     * 查询任务
     *
     * 根据设置的过滤条件（任务状态）分页查询任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListTaskInfoRequest 请求对象
     * @return SyncInvoker<ListTaskInfoRequest, ListTaskInfoResponse>
     */
    public SyncInvoker<ListTaskInfoRequest, ListTaskInfoResponse> listTaskInfoInvoker(ListTaskInfoRequest request) {
        return new SyncInvoker<ListTaskInfoRequest, ListTaskInfoResponse>(request, KooMapMeta.listTaskInfo, hcClient);
    }

    /**
     * 分页查询工作共享空间内实景三维任务列表
     *
     * 对单个工作共享空间内的任务进行分页查询，支持过滤条件：
     * - 任务名称（task_name）：支持模糊查询。
     * - 任务类型（task_type）：支持REAL3D-UNCTRL和REAL3D-CTRL。
     * - 任务ID（task_ids）：支持同时过滤多个任务ID。
     * - 任务状态（task_status）：支持同时过滤多个任务状态。
     * - 创建时间范围（create_time_from和create_time_to）：为UTC时间格式字符串，格式为yyyy-MM-dd&#39;T&#39;HH:mm:ss&#39;Z&#39;。
     * - 更新时间范围（update_time_from和update_time_to）：为UTC时间格式字符串，格式为yyyy-MM-dd&#39;T&#39;HH:mm:ss&#39;Z&#39;。
     * - 分页参数：偏移量offset（缺省值为0）、每页数量limit（缺省值为10）。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListTasksInWorkspaceRequest 请求对象
     * @return ListTasksInWorkspaceResponse
     */
    public ListTasksInWorkspaceResponse listTasksInWorkspace(ListTasksInWorkspaceRequest request) {
        return hcClient.syncInvokeHttp(request, KooMapMeta.listTasksInWorkspace);
    }

    /**
     * 分页查询工作共享空间内实景三维任务列表
     *
     * 对单个工作共享空间内的任务进行分页查询，支持过滤条件：
     * - 任务名称（task_name）：支持模糊查询。
     * - 任务类型（task_type）：支持REAL3D-UNCTRL和REAL3D-CTRL。
     * - 任务ID（task_ids）：支持同时过滤多个任务ID。
     * - 任务状态（task_status）：支持同时过滤多个任务状态。
     * - 创建时间范围（create_time_from和create_time_to）：为UTC时间格式字符串，格式为yyyy-MM-dd&#39;T&#39;HH:mm:ss&#39;Z&#39;。
     * - 更新时间范围（update_time_from和update_time_to）：为UTC时间格式字符串，格式为yyyy-MM-dd&#39;T&#39;HH:mm:ss&#39;Z&#39;。
     * - 分页参数：偏移量offset（缺省值为0）、每页数量limit（缺省值为10）。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListTasksInWorkspaceRequest 请求对象
     * @return SyncInvoker<ListTasksInWorkspaceRequest, ListTasksInWorkspaceResponse>
     */
    public SyncInvoker<ListTasksInWorkspaceRequest, ListTasksInWorkspaceResponse> listTasksInWorkspaceInvoker(
        ListTasksInWorkspaceRequest request) {
        return new SyncInvoker<ListTasksInWorkspaceRequest, ListTasksInWorkspaceResponse>(request,
            KooMapMeta.listTasksInWorkspace, hcClient);
    }

    /**
     * 查询用量
     *
     * 您可以查询时空专属存储服务或卫星影像生产服务的用量统计。
     * - 时空专属存储服务：统计导入的原始影像、矢量数据、生产资料和成果影像存储总量。
     * - 卫星影像生产服务：统计L2、L3、L4、L5等级的成果影像存储用量、成功处理的次数。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListUsageInfoRequest 请求对象
     * @return ListUsageInfoResponse
     */
    public ListUsageInfoResponse listUsageInfo(ListUsageInfoRequest request) {
        return hcClient.syncInvokeHttp(request, KooMapMeta.listUsageInfo);
    }

    /**
     * 查询用量
     *
     * 您可以查询时空专属存储服务或卫星影像生产服务的用量统计。
     * - 时空专属存储服务：统计导入的原始影像、矢量数据、生产资料和成果影像存储总量。
     * - 卫星影像生产服务：统计L2、L3、L4、L5等级的成果影像存储用量、成功处理的次数。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListUsageInfoRequest 请求对象
     * @return SyncInvoker<ListUsageInfoRequest, ListUsageInfoResponse>
     */
    public SyncInvoker<ListUsageInfoRequest, ListUsageInfoResponse> listUsageInfoInvoker(ListUsageInfoRequest request) {
        return new SyncInvoker<ListUsageInfoRequest, ListUsageInfoResponse>(request, KooMapMeta.listUsageInfo,
            hcClient);
    }

    /**
     * 保存用户上传的像控点信息
     *
     * 保存用户上传的像控点文本信息（生产资料）：
     * - 文本信息包含多行，每行的数据格式为“名称 经度 纬度 高度 精度”。
     * - 名称要求不超过50个字符。
     * - 经度、纬度、高度、精度信息都为Double数据格式。经度、纬度、高度要求为WGS84地理坐标系下的经纬度坐标，数据范围：[-10000000, 10000000]。精度（单位：米）数据范围：（0, 100）。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param SaveMarkPointInfoRequest 请求对象
     * @return SaveMarkPointInfoResponse
     */
    public SaveMarkPointInfoResponse saveMarkPointInfo(SaveMarkPointInfoRequest request) {
        return hcClient.syncInvokeHttp(request, KooMapMeta.saveMarkPointInfo);
    }

    /**
     * 保存用户上传的像控点信息
     *
     * 保存用户上传的像控点文本信息（生产资料）：
     * - 文本信息包含多行，每行的数据格式为“名称 经度 纬度 高度 精度”。
     * - 名称要求不超过50个字符。
     * - 经度、纬度、高度、精度信息都为Double数据格式。经度、纬度、高度要求为WGS84地理坐标系下的经纬度坐标，数据范围：[-10000000, 10000000]。精度（单位：米）数据范围：（0, 100）。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param SaveMarkPointInfoRequest 请求对象
     * @return SyncInvoker<SaveMarkPointInfoRequest, SaveMarkPointInfoResponse>
     */
    public SyncInvoker<SaveMarkPointInfoRequest, SaveMarkPointInfoResponse> saveMarkPointInfoInvoker(
        SaveMarkPointInfoRequest request) {
        return new SyncInvoker<SaveMarkPointInfoRequest, SaveMarkPointInfoResponse>(request,
            KooMapMeta.saveMarkPointInfo, hcClient);
    }

    /**
     * 查询实景三维用量
     *
     * 您可以查询实景三维生产服务（当前仅实现基础版）时空专属存储或影像建模的用量统计。
     * - 时空专属存储：统计导入的原始影像、生产资料和成果影像存储总量（单位为“GB”）。
     * - 影像建模用量：统计成功建模的倾斜影像的像素点数量（单位为“GP”，即十亿像素）、成功建模的次数。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowReal3DUsageRequest 请求对象
     * @return ShowReal3DUsageResponse
     */
    public ShowReal3DUsageResponse showReal3DUsage(ShowReal3DUsageRequest request) {
        return hcClient.syncInvokeHttp(request, KooMapMeta.showReal3DUsage);
    }

    /**
     * 查询实景三维用量
     *
     * 您可以查询实景三维生产服务（当前仅实现基础版）时空专属存储或影像建模的用量统计。
     * - 时空专属存储：统计导入的原始影像、生产资料和成果影像存储总量（单位为“GB”）。
     * - 影像建模用量：统计成功建模的倾斜影像的像素点数量（单位为“GP”，即十亿像素）、成功建模的次数。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowReal3DUsageRequest 请求对象
     * @return SyncInvoker<ShowReal3DUsageRequest, ShowReal3DUsageResponse>
     */
    public SyncInvoker<ShowReal3DUsageRequest, ShowReal3DUsageResponse> showReal3DUsageInvoker(
        ShowReal3DUsageRequest request) {
        return new SyncInvoker<ShowReal3DUsageRequest, ShowReal3DUsageResponse>(request, KooMapMeta.showReal3DUsage,
            hcClient);
    }

    /**
     * 查询当前任务的刺点预测状态
     *
     * 查询当前任务的刺点预测状态，返回的“status”取值为“2”时，表示刺点预测功能可用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowSpurPredictStatusRequest 请求对象
     * @return ShowSpurPredictStatusResponse
     */
    public ShowSpurPredictStatusResponse showSpurPredictStatus(ShowSpurPredictStatusRequest request) {
        return hcClient.syncInvokeHttp(request, KooMapMeta.showSpurPredictStatus);
    }

    /**
     * 查询当前任务的刺点预测状态
     *
     * 查询当前任务的刺点预测状态，返回的“status”取值为“2”时，表示刺点预测功能可用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowSpurPredictStatusRequest 请求对象
     * @return SyncInvoker<ShowSpurPredictStatusRequest, ShowSpurPredictStatusResponse>
     */
    public SyncInvoker<ShowSpurPredictStatusRequest, ShowSpurPredictStatusResponse> showSpurPredictStatusInvoker(
        ShowSpurPredictStatusRequest request) {
        return new SyncInvoker<ShowSpurPredictStatusRequest, ShowSpurPredictStatusResponse>(request,
            KooMapMeta.showSpurPredictStatus, hcClient);
    }

    /**
     * 查看任务概览
     *
     * 查看工作共享空间下的任务概览，包括全部任务数量以及成功、执行中、失败、已归档状态的任务数量。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowTaskOverviewRequest 请求对象
     * @return ShowTaskOverviewResponse
     */
    public ShowTaskOverviewResponse showTaskOverview(ShowTaskOverviewRequest request) {
        return hcClient.syncInvokeHttp(request, KooMapMeta.showTaskOverview);
    }

    /**
     * 查看任务概览
     *
     * 查看工作共享空间下的任务概览，包括全部任务数量以及成功、执行中、失败、已归档状态的任务数量。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowTaskOverviewRequest 请求对象
     * @return SyncInvoker<ShowTaskOverviewRequest, ShowTaskOverviewResponse>
     */
    public SyncInvoker<ShowTaskOverviewRequest, ShowTaskOverviewResponse> showTaskOverviewInvoker(
        ShowTaskOverviewRequest request) {
        return new SyncInvoker<ShowTaskOverviewRequest, ShowTaskOverviewResponse>(request, KooMapMeta.showTaskOverview,
            hcClient);
    }

    /**
     * 展示工作共享空间内任务概览
     *
     * 该接口用于展示工作共享空间内任务的概览信息。包含：
     * 
     * - 任务总数（total_count）：在该空间内已创建的实景三维任务数量。
     * - 运行中数量（running_count）：在该空间内正在运行的实景三维任务数量，包含的任务状态有PENDING、STARTING、RUNNING、STOPPING。
     * - 成功数量（success_count）：在该空间内执行成功的任务数量，包含的任务状态有SUCCESS、STOP_SUCCESS。
     * - 失败数量（failed_count）：在该空间内执行失败的任务数量，包含的任务状态有START_FAILED、FAILED。
     * - 已归档数量（archived_count）：在该空间内已归档的任务数量，包含的任务状态有ARCHIVED。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowTaskOverviewInWorkspaceRequest 请求对象
     * @return ShowTaskOverviewInWorkspaceResponse
     */
    public ShowTaskOverviewInWorkspaceResponse showTaskOverviewInWorkspace(ShowTaskOverviewInWorkspaceRequest request) {
        return hcClient.syncInvokeHttp(request, KooMapMeta.showTaskOverviewInWorkspace);
    }

    /**
     * 展示工作共享空间内任务概览
     *
     * 该接口用于展示工作共享空间内任务的概览信息。包含：
     * 
     * - 任务总数（total_count）：在该空间内已创建的实景三维任务数量。
     * - 运行中数量（running_count）：在该空间内正在运行的实景三维任务数量，包含的任务状态有PENDING、STARTING、RUNNING、STOPPING。
     * - 成功数量（success_count）：在该空间内执行成功的任务数量，包含的任务状态有SUCCESS、STOP_SUCCESS。
     * - 失败数量（failed_count）：在该空间内执行失败的任务数量，包含的任务状态有START_FAILED、FAILED。
     * - 已归档数量（archived_count）：在该空间内已归档的任务数量，包含的任务状态有ARCHIVED。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowTaskOverviewInWorkspaceRequest 请求对象
     * @return SyncInvoker<ShowTaskOverviewInWorkspaceRequest, ShowTaskOverviewInWorkspaceResponse>
     */
    public SyncInvoker<ShowTaskOverviewInWorkspaceRequest, ShowTaskOverviewInWorkspaceResponse> showTaskOverviewInWorkspaceInvoker(
        ShowTaskOverviewInWorkspaceRequest request) {
        return new SyncInvoker<ShowTaskOverviewInWorkspaceRequest, ShowTaskOverviewInWorkspaceResponse>(request,
            KooMapMeta.showTaskOverviewInWorkspace, hcClient);
    }

    /**
     * AR导航
     *
     * AR导航是新型的地图导航方法，基于摄像头实时捕捉的实景画面，将地图导航信息通过数字内容的形态叠加在实景画面中，生成虚拟的3D导航指引。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param StartNaviRequest 请求对象
     * @return StartNaviResponse
     */
    public StartNaviResponse startNavi(StartNaviRequest request) {
        return hcClient.syncInvokeHttp(request, KooMapMeta.startNavi);
    }

    /**
     * AR导航
     *
     * AR导航是新型的地图导航方法，基于摄像头实时捕捉的实景画面，将地图导航信息通过数字内容的形态叠加在实景画面中，生成虚拟的3D导航指引。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param StartNaviRequest 请求对象
     * @return SyncInvoker<StartNaviRequest, StartNaviResponse>
     */
    public SyncInvoker<StartNaviRequest, StartNaviResponse> startNaviInvoker(StartNaviRequest request) {
        return new SyncInvoker<StartNaviRequest, StartNaviResponse>(request, KooMapMeta.startNavi, hcClient);
    }

    /**
     * 启动实景三维建模任务
     *
     * 该接口用于启动任务。该接口运行成功后，任务状态更新为等待中（PENDING），此时任务添加到启动队列中等待运行资源就绪。资源就绪后任务状态更新为启动中（STARTING），启动成功后任务状态更新为运行中（RUNNING），若启动失败则任务状态更新为启动失败（START_FAILED）。当建模任务类型为有控建模时，为了提升刺点效率需要先对影像进行空三建模。执行空三建模需要设置请求体的“run_AT_only”为“true”，空三建模成功后，任务状态更新为空三建模成功（BUNDLE_SUCCESS）。
     * 
     * 任务允许启动的状态为：初始化（INIT）、已停止（STOP_SUCCESS）、运行失败（FAILED）、空三建模成功（BUNDLE_SUCCESS）。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param StartReal3DTaskRequest 请求对象
     * @return StartReal3DTaskResponse
     */
    public StartReal3DTaskResponse startReal3DTask(StartReal3DTaskRequest request) {
        return hcClient.syncInvokeHttp(request, KooMapMeta.startReal3DTask);
    }

    /**
     * 启动实景三维建模任务
     *
     * 该接口用于启动任务。该接口运行成功后，任务状态更新为等待中（PENDING），此时任务添加到启动队列中等待运行资源就绪。资源就绪后任务状态更新为启动中（STARTING），启动成功后任务状态更新为运行中（RUNNING），若启动失败则任务状态更新为启动失败（START_FAILED）。当建模任务类型为有控建模时，为了提升刺点效率需要先对影像进行空三建模。执行空三建模需要设置请求体的“run_AT_only”为“true”，空三建模成功后，任务状态更新为空三建模成功（BUNDLE_SUCCESS）。
     * 
     * 任务允许启动的状态为：初始化（INIT）、已停止（STOP_SUCCESS）、运行失败（FAILED）、空三建模成功（BUNDLE_SUCCESS）。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param StartReal3DTaskRequest 请求对象
     * @return SyncInvoker<StartReal3DTaskRequest, StartReal3DTaskResponse>
     */
    public SyncInvoker<StartReal3DTaskRequest, StartReal3DTaskResponse> startReal3DTaskInvoker(
        StartReal3DTaskRequest request) {
        return new SyncInvoker<StartReal3DTaskRequest, StartReal3DTaskResponse>(request, KooMapMeta.startReal3DTask,
            hcClient);
    }

    /**
     * 启动任务
     *
     * 启动任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param StartTaskRequest 请求对象
     * @return StartTaskResponse
     */
    public StartTaskResponse startTask(StartTaskRequest request) {
        return hcClient.syncInvokeHttp(request, KooMapMeta.startTask);
    }

    /**
     * 启动任务
     *
     * 启动任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param StartTaskRequest 请求对象
     * @return SyncInvoker<StartTaskRequest, StartTaskResponse>
     */
    public SyncInvoker<StartTaskRequest, StartTaskResponse> startTaskInvoker(StartTaskRequest request) {
        return new SyncInvoker<StartTaskRequest, StartTaskResponse>(request, KooMapMeta.startTask, hcClient);
    }

    /**
     * 视觉定位
     *
     * 视觉定位是根据图像耦合GPS数据确定设备的位置的一项技术。首先通过拍摄一系列具有已知位置的图像并分析它们的关键视觉特征（例如建筑物或桥梁的轮廓）来创建地图，以创建这些视觉特征的大规模且可快速搜索的索引。将设备图像中的特征与索引中的特征进行比较，可获得目标设备的位姿。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param StartVpsRequest 请求对象
     * @return StartVpsResponse
     */
    public StartVpsResponse startVps(StartVpsRequest request) {
        return hcClient.syncInvokeHttp(request, KooMapMeta.startVps);
    }

    /**
     * 视觉定位
     *
     * 视觉定位是根据图像耦合GPS数据确定设备的位置的一项技术。首先通过拍摄一系列具有已知位置的图像并分析它们的关键视觉特征（例如建筑物或桥梁的轮廓）来创建地图，以创建这些视觉特征的大规模且可快速搜索的索引。将设备图像中的特征与索引中的特征进行比较，可获得目标设备的位姿。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param StartVpsRequest 请求对象
     * @return SyncInvoker<StartVpsRequest, StartVpsResponse>
     */
    public SyncInvoker<StartVpsRequest, StartVpsResponse> startVpsInvoker(StartVpsRequest request) {
        return new SyncInvoker<StartVpsRequest, StartVpsResponse>(request, KooMapMeta.startVps, hcClient);
    }

    /**
     * 停止实景三维建模任务
     *
     * 可停止任务状态为等待中（PENDING）、启动中（STARTING）或者运行中（RUNNING）的任务。
     * 
     * - 等待中（PENDING）的任务执行停止后将更新为初始化（INIT）状态。
     * - 启动中（STARTING）和正在运行（RUNNING）的任务执行停止后将更新为停止中（STOPPING）状态，并且在停止完成后更新为已停止（STOP_SUCCESS）状态。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param StopReal3DTaskRequest 请求对象
     * @return StopReal3DTaskResponse
     */
    public StopReal3DTaskResponse stopReal3DTask(StopReal3DTaskRequest request) {
        return hcClient.syncInvokeHttp(request, KooMapMeta.stopReal3DTask);
    }

    /**
     * 停止实景三维建模任务
     *
     * 可停止任务状态为等待中（PENDING）、启动中（STARTING）或者运行中（RUNNING）的任务。
     * 
     * - 等待中（PENDING）的任务执行停止后将更新为初始化（INIT）状态。
     * - 启动中（STARTING）和正在运行（RUNNING）的任务执行停止后将更新为停止中（STOPPING）状态，并且在停止完成后更新为已停止（STOP_SUCCESS）状态。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param StopReal3DTaskRequest 请求对象
     * @return SyncInvoker<StopReal3DTaskRequest, StopReal3DTaskResponse>
     */
    public SyncInvoker<StopReal3DTaskRequest, StopReal3DTaskResponse> stopReal3DTaskInvoker(
        StopReal3DTaskRequest request) {
        return new SyncInvoker<StopReal3DTaskRequest, StopReal3DTaskResponse>(request, KooMapMeta.stopReal3DTask,
            hcClient);
    }

    /**
     * 停止任务
     *
     * 停止任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param StopTaskRequest 请求对象
     * @return StopTaskResponse
     */
    public StopTaskResponse stopTask(StopTaskRequest request) {
        return hcClient.syncInvokeHttp(request, KooMapMeta.stopTask);
    }

    /**
     * 停止任务
     *
     * 停止任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param StopTaskRequest 请求对象
     * @return SyncInvoker<StopTaskRequest, StopTaskResponse>
     */
    public SyncInvoker<StopTaskRequest, StopTaskResponse> stopTaskInvoker(StopTaskRequest request) {
        return new SyncInvoker<StopTaskRequest, StopTaskResponse>(request, KooMapMeta.stopTask, hcClient);
    }

    /**
     * 更新工作共享空间
     *
     * 该接口用于工作共享空间信息的更新。可以更新的内容包括：
     * 
     * - 工作共享空间名称。
     * - 工作共享空间描述。
     * - 工作共享空间是否置顶显示（不超过4个工作空间）。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateCommonWorkspaceRequest 请求对象
     * @return UpdateCommonWorkspaceResponse
     */
    public UpdateCommonWorkspaceResponse updateCommonWorkspace(UpdateCommonWorkspaceRequest request) {
        return hcClient.syncInvokeHttp(request, KooMapMeta.updateCommonWorkspace);
    }

    /**
     * 更新工作共享空间
     *
     * 该接口用于工作共享空间信息的更新。可以更新的内容包括：
     * 
     * - 工作共享空间名称。
     * - 工作共享空间描述。
     * - 工作共享空间是否置顶显示（不超过4个工作空间）。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateCommonWorkspaceRequest 请求对象
     * @return SyncInvoker<UpdateCommonWorkspaceRequest, UpdateCommonWorkspaceResponse>
     */
    public SyncInvoker<UpdateCommonWorkspaceRequest, UpdateCommonWorkspaceResponse> updateCommonWorkspaceInvoker(
        UpdateCommonWorkspaceRequest request) {
        return new SyncInvoker<UpdateCommonWorkspaceRequest, UpdateCommonWorkspaceResponse>(request,
            KooMapMeta.updateCommonWorkspace, hcClient);
    }

    /**
     * 更新实景三维建模任务
     *
     * 该接口用于更新任务信息，包括名称、类型、描述、建模影像ID、建模参数以及建模坐标系。任务更新成功后状态更新为初始化（INIT）。仅支持更新非运行状态且未完成的任务：
     * 
     * - 初始化（INIT）
     * - 启动失败（START_FAILED）
     * - 运行失败（FAILED）
     * - 已停止（STOP_SUCCESS）
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateReal3DTaskRequest 请求对象
     * @return UpdateReal3DTaskResponse
     */
    public UpdateReal3DTaskResponse updateReal3DTask(UpdateReal3DTaskRequest request) {
        return hcClient.syncInvokeHttp(request, KooMapMeta.updateReal3DTask);
    }

    /**
     * 更新实景三维建模任务
     *
     * 该接口用于更新任务信息，包括名称、类型、描述、建模影像ID、建模参数以及建模坐标系。任务更新成功后状态更新为初始化（INIT）。仅支持更新非运行状态且未完成的任务：
     * 
     * - 初始化（INIT）
     * - 启动失败（START_FAILED）
     * - 运行失败（FAILED）
     * - 已停止（STOP_SUCCESS）
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateReal3DTaskRequest 请求对象
     * @return SyncInvoker<UpdateReal3DTaskRequest, UpdateReal3DTaskResponse>
     */
    public SyncInvoker<UpdateReal3DTaskRequest, UpdateReal3DTaskResponse> updateReal3DTaskInvoker(
        UpdateReal3DTaskRequest request) {
        return new SyncInvoker<UpdateReal3DTaskRequest, UpdateReal3DTaskResponse>(request, KooMapMeta.updateReal3DTask,
            hcClient);
    }

    /**
     * 归档/取消归档实景三维建模任务
     *
     * 该接口用于归档运行成功的任务或取消任务的归档状态。
     * - 归档：任务状态从运行成功（SUCCESS）更新为已归档（ARCHIVED）。工作共享空间中查询任务列表时默认不返回已归档的任务记录，如果要查询已归档任务，则需要在查询过滤条件中添加任务ID或已归档（ARCHIVED）状态。
     * - 取消归档：任务状态从已归档（ARCHIVED）更新为运行成功（SUCCESS）。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateReal3DTaskArchivedStatusRequest 请求对象
     * @return UpdateReal3DTaskArchivedStatusResponse
     */
    public UpdateReal3DTaskArchivedStatusResponse updateReal3DTaskArchivedStatus(
        UpdateReal3DTaskArchivedStatusRequest request) {
        return hcClient.syncInvokeHttp(request, KooMapMeta.updateReal3DTaskArchivedStatus);
    }

    /**
     * 归档/取消归档实景三维建模任务
     *
     * 该接口用于归档运行成功的任务或取消任务的归档状态。
     * - 归档：任务状态从运行成功（SUCCESS）更新为已归档（ARCHIVED）。工作共享空间中查询任务列表时默认不返回已归档的任务记录，如果要查询已归档任务，则需要在查询过滤条件中添加任务ID或已归档（ARCHIVED）状态。
     * - 取消归档：任务状态从已归档（ARCHIVED）更新为运行成功（SUCCESS）。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateReal3DTaskArchivedStatusRequest 请求对象
     * @return SyncInvoker<UpdateReal3DTaskArchivedStatusRequest, UpdateReal3DTaskArchivedStatusResponse>
     */
    public SyncInvoker<UpdateReal3DTaskArchivedStatusRequest, UpdateReal3DTaskArchivedStatusResponse> updateReal3DTaskArchivedStatusInvoker(
        UpdateReal3DTaskArchivedStatusRequest request) {
        return new SyncInvoker<UpdateReal3DTaskArchivedStatusRequest, UpdateReal3DTaskArchivedStatusResponse>(request,
            KooMapMeta.updateReal3DTaskArchivedStatus, hcClient);
    }

    /**
     * 归档/取消归档任务
     *
     * 任务的归档和取消归档操作，归档成功之后的任务不会在任务列表显示。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateTaskArchivedStatusRequest 请求对象
     * @return UpdateTaskArchivedStatusResponse
     */
    public UpdateTaskArchivedStatusResponse updateTaskArchivedStatus(UpdateTaskArchivedStatusRequest request) {
        return hcClient.syncInvokeHttp(request, KooMapMeta.updateTaskArchivedStatus);
    }

    /**
     * 归档/取消归档任务
     *
     * 任务的归档和取消归档操作，归档成功之后的任务不会在任务列表显示。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateTaskArchivedStatusRequest 请求对象
     * @return SyncInvoker<UpdateTaskArchivedStatusRequest, UpdateTaskArchivedStatusResponse>
     */
    public SyncInvoker<UpdateTaskArchivedStatusRequest, UpdateTaskArchivedStatusResponse> updateTaskArchivedStatusInvoker(
        UpdateTaskArchivedStatusRequest request) {
        return new SyncInvoker<UpdateTaskArchivedStatusRequest, UpdateTaskArchivedStatusResponse>(request,
            KooMapMeta.updateTaskArchivedStatus, hcClient);
    }

    /**
     * 校验原始影像文件
     *
     * 校验原始影像文件是否满足匹配规则（全色与多光谱一一对应或全为多光谱）并返回成果影像名称。如果不满足匹配规则，会以报错方式提示用户。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ValidateImageRequest 请求对象
     * @return ValidateImageResponse
     */
    public ValidateImageResponse validateImage(ValidateImageRequest request) {
        return hcClient.syncInvokeHttp(request, KooMapMeta.validateImage);
    }

    /**
     * 校验原始影像文件
     *
     * 校验原始影像文件是否满足匹配规则（全色与多光谱一一对应或全为多光谱）并返回成果影像名称。如果不满足匹配规则，会以报错方式提示用户。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ValidateImageRequest 请求对象
     * @return SyncInvoker<ValidateImageRequest, ValidateImageResponse>
     */
    public SyncInvoker<ValidateImageRequest, ValidateImageResponse> validateImageInvoker(ValidateImageRequest request) {
        return new SyncInvoker<ValidateImageRequest, ValidateImageResponse>(request, KooMapMeta.validateImage,
            hcClient);
    }

}
