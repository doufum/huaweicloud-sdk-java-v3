package com.huaweicloud.sdk.dws.v2;

import com.huaweicloud.sdk.core.TypeCasts;
import com.huaweicloud.sdk.core.http.FieldExistence;
import com.huaweicloud.sdk.core.http.HttpMethod;
import com.huaweicloud.sdk.core.http.HttpRequestDef;
import com.huaweicloud.sdk.core.http.LocationType;
import com.huaweicloud.sdk.dws.v2.model.AddSnapshotCrossRegionPolicyRequest;
import com.huaweicloud.sdk.dws.v2.model.AddSnapshotCrossRegionPolicyRequestBody;
import com.huaweicloud.sdk.dws.v2.model.AddSnapshotCrossRegionPolicyResponse;
import com.huaweicloud.sdk.dws.v2.model.AddWorkloadQueueRequest;
import com.huaweicloud.sdk.dws.v2.model.AddWorkloadQueueResponse;
import com.huaweicloud.sdk.dws.v2.model.AlarmSubRequest;
import com.huaweicloud.sdk.dws.v2.model.AlarmSubUpdateRequest;
import com.huaweicloud.sdk.dws.v2.model.AssociateEipRequest;
import com.huaweicloud.sdk.dws.v2.model.AssociateEipResponse;
import com.huaweicloud.sdk.dws.v2.model.AssociateElbRequest;
import com.huaweicloud.sdk.dws.v2.model.AssociateElbResponse;
import com.huaweicloud.sdk.dws.v2.model.BackupPolicy;
import com.huaweicloud.sdk.dws.v2.model.BatchCreateClusterCnRequest;
import com.huaweicloud.sdk.dws.v2.model.BatchCreateClusterCnResponse;
import com.huaweicloud.sdk.dws.v2.model.BatchCreateCn;
import com.huaweicloud.sdk.dws.v2.model.BatchCreateResourceTagRequest;
import com.huaweicloud.sdk.dws.v2.model.BatchCreateResourceTagResponse;
import com.huaweicloud.sdk.dws.v2.model.BatchCreateResourceTags;
import com.huaweicloud.sdk.dws.v2.model.BatchDeleteClusterCnRequest;
import com.huaweicloud.sdk.dws.v2.model.BatchDeleteClusterCnResponse;
import com.huaweicloud.sdk.dws.v2.model.BatchDeleteCn;
import com.huaweicloud.sdk.dws.v2.model.BatchDeleteResourceTagRequest;
import com.huaweicloud.sdk.dws.v2.model.BatchDeleteResourceTagResponse;
import com.huaweicloud.sdk.dws.v2.model.BatchDeleteResourceTags;
import com.huaweicloud.sdk.dws.v2.model.CancelReadonlyClusterRequest;
import com.huaweicloud.sdk.dws.v2.model.CancelReadonlyClusterResponse;
import com.huaweicloud.sdk.dws.v2.model.CheckClusterRequest;
import com.huaweicloud.sdk.dws.v2.model.CheckClusterResponse;
import com.huaweicloud.sdk.dws.v2.model.CheckDisasterNameRequest;
import com.huaweicloud.sdk.dws.v2.model.CheckDisasterNameResponse;
import com.huaweicloud.sdk.dws.v2.model.CheckTableRestoreRequest;
import com.huaweicloud.sdk.dws.v2.model.CheckTableRestoreRequestBody;
import com.huaweicloud.sdk.dws.v2.model.CheckTableRestoreResponse;
import com.huaweicloud.sdk.dws.v2.model.ClusterCheckRequestBody;
import com.huaweicloud.sdk.dws.v2.model.ClusterDescriptionInfo;
import com.huaweicloud.sdk.dws.v2.model.ClusterShrinkReq;
import com.huaweicloud.sdk.dws.v2.model.ConfigurationParameterValues;
import com.huaweicloud.sdk.dws.v2.model.CopySnapshotRequest;
import com.huaweicloud.sdk.dws.v2.model.CopySnapshotResponse;
import com.huaweicloud.sdk.dws.v2.model.CreateAlarmSubRequest;
import com.huaweicloud.sdk.dws.v2.model.CreateAlarmSubResponse;
import com.huaweicloud.sdk.dws.v2.model.CreateClusterDns;
import com.huaweicloud.sdk.dws.v2.model.CreateClusterDnsRequest;
import com.huaweicloud.sdk.dws.v2.model.CreateClusterDnsResponse;
import com.huaweicloud.sdk.dws.v2.model.CreateClusterRequest;
import com.huaweicloud.sdk.dws.v2.model.CreateClusterRequestBody;
import com.huaweicloud.sdk.dws.v2.model.CreateClusterResponse;
import com.huaweicloud.sdk.dws.v2.model.CreateClusterV2Request;
import com.huaweicloud.sdk.dws.v2.model.CreateClusterV2Response;
import com.huaweicloud.sdk.dws.v2.model.CreateClusterWorkloadRequest;
import com.huaweicloud.sdk.dws.v2.model.CreateClusterWorkloadResponse;
import com.huaweicloud.sdk.dws.v2.model.CreateDataSourceRequest;
import com.huaweicloud.sdk.dws.v2.model.CreateDataSourceResponse;
import com.huaweicloud.sdk.dws.v2.model.CreateDisasterRecoveryReq;
import com.huaweicloud.sdk.dws.v2.model.CreateDisasterRecoveryRequest;
import com.huaweicloud.sdk.dws.v2.model.CreateDisasterRecoveryResponse;
import com.huaweicloud.sdk.dws.v2.model.CreateEventSubRequest;
import com.huaweicloud.sdk.dws.v2.model.CreateEventSubResponse;
import com.huaweicloud.sdk.dws.v2.model.CreateSnapshotPolicyRequest;
import com.huaweicloud.sdk.dws.v2.model.CreateSnapshotPolicyResponse;
import com.huaweicloud.sdk.dws.v2.model.CreateSnapshotRequest;
import com.huaweicloud.sdk.dws.v2.model.CreateSnapshotRequestBody;
import com.huaweicloud.sdk.dws.v2.model.CreateSnapshotResponse;
import com.huaweicloud.sdk.dws.v2.model.CreateWorkloadPlanRequest;
import com.huaweicloud.sdk.dws.v2.model.CreateWorkloadPlanResponse;
import com.huaweicloud.sdk.dws.v2.model.DatabaseOmUserActionReq;
import com.huaweicloud.sdk.dws.v2.model.DatabasePermissionReq;
import com.huaweicloud.sdk.dws.v2.model.DatabaseUserInfoReq;
import com.huaweicloud.sdk.dws.v2.model.DeleteAlarmSubRequest;
import com.huaweicloud.sdk.dws.v2.model.DeleteAlarmSubResponse;
import com.huaweicloud.sdk.dws.v2.model.DeleteClusterDnsRequest;
import com.huaweicloud.sdk.dws.v2.model.DeleteClusterDnsResponse;
import com.huaweicloud.sdk.dws.v2.model.DeleteClusterRequest;
import com.huaweicloud.sdk.dws.v2.model.DeleteClusterRequestBody;
import com.huaweicloud.sdk.dws.v2.model.DeleteClusterResponse;
import com.huaweicloud.sdk.dws.v2.model.DeleteDataSourceRequest;
import com.huaweicloud.sdk.dws.v2.model.DeleteDataSourceResponse;
import com.huaweicloud.sdk.dws.v2.model.DeleteDisasterRecoveryRequest;
import com.huaweicloud.sdk.dws.v2.model.DeleteDisasterRecoveryResponse;
import com.huaweicloud.sdk.dws.v2.model.DeleteEventSubRequest;
import com.huaweicloud.sdk.dws.v2.model.DeleteEventSubResponse;
import com.huaweicloud.sdk.dws.v2.model.DeleteSnapshotCrossRegionPolicyRequest;
import com.huaweicloud.sdk.dws.v2.model.DeleteSnapshotCrossRegionPolicyResponse;
import com.huaweicloud.sdk.dws.v2.model.DeleteSnapshotPolicyRequest;
import com.huaweicloud.sdk.dws.v2.model.DeleteSnapshotPolicyResponse;
import com.huaweicloud.sdk.dws.v2.model.DeleteSnapshotRequest;
import com.huaweicloud.sdk.dws.v2.model.DeleteSnapshotResponse;
import com.huaweicloud.sdk.dws.v2.model.DeleteWorkloadPlanRequest;
import com.huaweicloud.sdk.dws.v2.model.DeleteWorkloadPlanResponse;
import com.huaweicloud.sdk.dws.v2.model.DeleteWorkloadQueueRequest;
import com.huaweicloud.sdk.dws.v2.model.DeleteWorkloadQueueResponse;
import com.huaweicloud.sdk.dws.v2.model.DisassociateEipRequest;
import com.huaweicloud.sdk.dws.v2.model.DisassociateEipResponse;
import com.huaweicloud.sdk.dws.v2.model.DisassociateElbRequest;
import com.huaweicloud.sdk.dws.v2.model.DisassociateElbResponse;
import com.huaweicloud.sdk.dws.v2.model.DiskResp;
import com.huaweicloud.sdk.dws.v2.model.EventSubRequest;
import com.huaweicloud.sdk.dws.v2.model.EventSubUpdateRequest;
import com.huaweicloud.sdk.dws.v2.model.ExecuteClusterUpgradeActionRequest;
import com.huaweicloud.sdk.dws.v2.model.ExecuteClusterUpgradeActionRequestBody;
import com.huaweicloud.sdk.dws.v2.model.ExecuteClusterUpgradeActionResponse;
import com.huaweicloud.sdk.dws.v2.model.ExecuteDatabaseOmUserActionRequest;
import com.huaweicloud.sdk.dws.v2.model.ExecuteDatabaseOmUserActionResponse;
import com.huaweicloud.sdk.dws.v2.model.ExecuteRedistributionClusterRequest;
import com.huaweicloud.sdk.dws.v2.model.ExecuteRedistributionClusterResponse;
import com.huaweicloud.sdk.dws.v2.model.ExpandInstanceStorage;
import com.huaweicloud.sdk.dws.v2.model.ExpandInstanceStorageRequest;
import com.huaweicloud.sdk.dws.v2.model.ExpandInstanceStorageResponse;
import com.huaweicloud.sdk.dws.v2.model.ExtDataSourceReq;
import com.huaweicloud.sdk.dws.v2.model.HostOverviewResponse;
import com.huaweicloud.sdk.dws.v2.model.IndicatorInfo;
import com.huaweicloud.sdk.dws.v2.model.LinkCopyReq;
import com.huaweicloud.sdk.dws.v2.model.ListAlarmConfigsRequest;
import com.huaweicloud.sdk.dws.v2.model.ListAlarmConfigsResponse;
import com.huaweicloud.sdk.dws.v2.model.ListAlarmDetailRequest;
import com.huaweicloud.sdk.dws.v2.model.ListAlarmDetailResponse;
import com.huaweicloud.sdk.dws.v2.model.ListAlarmStatisticRequest;
import com.huaweicloud.sdk.dws.v2.model.ListAlarmStatisticResponse;
import com.huaweicloud.sdk.dws.v2.model.ListAlarmSubsRequest;
import com.huaweicloud.sdk.dws.v2.model.ListAlarmSubsResponse;
import com.huaweicloud.sdk.dws.v2.model.ListAuditLogRequest;
import com.huaweicloud.sdk.dws.v2.model.ListAuditLogResponse;
import com.huaweicloud.sdk.dws.v2.model.ListAvailabilityZonesRequest;
import com.huaweicloud.sdk.dws.v2.model.ListAvailabilityZonesResponse;
import com.huaweicloud.sdk.dws.v2.model.ListAvailableDisasterClustersRequest;
import com.huaweicloud.sdk.dws.v2.model.ListAvailableDisasterClustersResponse;
import com.huaweicloud.sdk.dws.v2.model.ListClusterCnRequest;
import com.huaweicloud.sdk.dws.v2.model.ListClusterCnResponse;
import com.huaweicloud.sdk.dws.v2.model.ListClusterConfigurationsParameterRequest;
import com.huaweicloud.sdk.dws.v2.model.ListClusterConfigurationsParameterResponse;
import com.huaweicloud.sdk.dws.v2.model.ListClusterConfigurationsRequest;
import com.huaweicloud.sdk.dws.v2.model.ListClusterConfigurationsResponse;
import com.huaweicloud.sdk.dws.v2.model.ListClusterDetailsRequest;
import com.huaweicloud.sdk.dws.v2.model.ListClusterDetailsResponse;
import com.huaweicloud.sdk.dws.v2.model.ListClusterScaleInNumbersRequest;
import com.huaweicloud.sdk.dws.v2.model.ListClusterScaleInNumbersResponse;
import com.huaweicloud.sdk.dws.v2.model.ListClusterSnapshotsRequest;
import com.huaweicloud.sdk.dws.v2.model.ListClusterSnapshotsResponse;
import com.huaweicloud.sdk.dws.v2.model.ListClusterTagsRequest;
import com.huaweicloud.sdk.dws.v2.model.ListClusterTagsResponse;
import com.huaweicloud.sdk.dws.v2.model.ListClusterWorkloadRequest;
import com.huaweicloud.sdk.dws.v2.model.ListClusterWorkloadResponse;
import com.huaweicloud.sdk.dws.v2.model.ListClustersRequest;
import com.huaweicloud.sdk.dws.v2.model.ListClustersResponse;
import com.huaweicloud.sdk.dws.v2.model.ListConfigurationsAuditRecordsRequest;
import com.huaweicloud.sdk.dws.v2.model.ListConfigurationsAuditRecordsResponse;
import com.huaweicloud.sdk.dws.v2.model.ListDataSourceRequest;
import com.huaweicloud.sdk.dws.v2.model.ListDataSourceResponse;
import com.huaweicloud.sdk.dws.v2.model.ListDatabaseUsersRequest;
import com.huaweicloud.sdk.dws.v2.model.ListDatabaseUsersResponse;
import com.huaweicloud.sdk.dws.v2.model.ListDisasterRecoverRequest;
import com.huaweicloud.sdk.dws.v2.model.ListDisasterRecoverResponse;
import com.huaweicloud.sdk.dws.v2.model.ListDssPoolsRequest;
import com.huaweicloud.sdk.dws.v2.model.ListDssPoolsResponse;
import com.huaweicloud.sdk.dws.v2.model.ListElbsRequest;
import com.huaweicloud.sdk.dws.v2.model.ListElbsResponse;
import com.huaweicloud.sdk.dws.v2.model.ListEventSpecsRequest;
import com.huaweicloud.sdk.dws.v2.model.ListEventSpecsResponse;
import com.huaweicloud.sdk.dws.v2.model.ListEventSubsRequest;
import com.huaweicloud.sdk.dws.v2.model.ListEventSubsResponse;
import com.huaweicloud.sdk.dws.v2.model.ListEventsRequest;
import com.huaweicloud.sdk.dws.v2.model.ListEventsResponse;
import com.huaweicloud.sdk.dws.v2.model.ListHostDiskRequest;
import com.huaweicloud.sdk.dws.v2.model.ListHostDiskResponse;
import com.huaweicloud.sdk.dws.v2.model.ListHostNetRequest;
import com.huaweicloud.sdk.dws.v2.model.ListHostNetResponse;
import com.huaweicloud.sdk.dws.v2.model.ListHostOverviewRequest;
import com.huaweicloud.sdk.dws.v2.model.ListHostOverviewResponse;
import com.huaweicloud.sdk.dws.v2.model.ListJobDetailsRequest;
import com.huaweicloud.sdk.dws.v2.model.ListJobDetailsResponse;
import com.huaweicloud.sdk.dws.v2.model.ListMonitorIndicatorDataRequest;
import com.huaweicloud.sdk.dws.v2.model.ListMonitorIndicatorDataResponse;
import com.huaweicloud.sdk.dws.v2.model.ListMonitorIndicatorsRequest;
import com.huaweicloud.sdk.dws.v2.model.ListMonitorIndicatorsResponse;
import com.huaweicloud.sdk.dws.v2.model.ListNodeTypesRequest;
import com.huaweicloud.sdk.dws.v2.model.ListNodeTypesResponse;
import com.huaweicloud.sdk.dws.v2.model.ListQuotasRequest;
import com.huaweicloud.sdk.dws.v2.model.ListQuotasResponse;
import com.huaweicloud.sdk.dws.v2.model.ListSnapshotCrossRegionPolicyRequest;
import com.huaweicloud.sdk.dws.v2.model.ListSnapshotCrossRegionPolicyResponse;
import com.huaweicloud.sdk.dws.v2.model.ListSnapshotCrossRegionRequest;
import com.huaweicloud.sdk.dws.v2.model.ListSnapshotCrossRegionResponse;
import com.huaweicloud.sdk.dws.v2.model.ListSnapshotDetailsRequest;
import com.huaweicloud.sdk.dws.v2.model.ListSnapshotDetailsResponse;
import com.huaweicloud.sdk.dws.v2.model.ListSnapshotPolicyRequest;
import com.huaweicloud.sdk.dws.v2.model.ListSnapshotPolicyResponse;
import com.huaweicloud.sdk.dws.v2.model.ListSnapshotStatisticsRequest;
import com.huaweicloud.sdk.dws.v2.model.ListSnapshotStatisticsResponse;
import com.huaweicloud.sdk.dws.v2.model.ListSnapshotsRequest;
import com.huaweicloud.sdk.dws.v2.model.ListSnapshotsResponse;
import com.huaweicloud.sdk.dws.v2.model.ListStatisticsRequest;
import com.huaweicloud.sdk.dws.v2.model.ListStatisticsResponse;
import com.huaweicloud.sdk.dws.v2.model.ListTagsRequest;
import com.huaweicloud.sdk.dws.v2.model.ListTagsResponse;
import com.huaweicloud.sdk.dws.v2.model.ListUpdatableVersionRequest;
import com.huaweicloud.sdk.dws.v2.model.ListUpdatableVersionResponse;
import com.huaweicloud.sdk.dws.v2.model.ListUpdateRecordRequest;
import com.huaweicloud.sdk.dws.v2.model.ListUpdateRecordResponse;
import com.huaweicloud.sdk.dws.v2.model.ListWorkloadQueueRequest;
import com.huaweicloud.sdk.dws.v2.model.ListWorkloadQueueResponse;
import com.huaweicloud.sdk.dws.v2.model.MaintenanceWindow;
import com.huaweicloud.sdk.dws.v2.model.ModifyClusterDns;
import com.huaweicloud.sdk.dws.v2.model.NetResp;
import com.huaweicloud.sdk.dws.v2.model.PauseDisasterRecoveryRequest;
import com.huaweicloud.sdk.dws.v2.model.PauseDisasterRecoveryResponse;
import com.huaweicloud.sdk.dws.v2.model.ReconfigureExtDataSourceActionReq;
import com.huaweicloud.sdk.dws.v2.model.RedistributionReq;
import com.huaweicloud.sdk.dws.v2.model.ResetPasswordRequest;
import com.huaweicloud.sdk.dws.v2.model.ResetPasswordRequestBody;
import com.huaweicloud.sdk.dws.v2.model.ResetPasswordResponse;
import com.huaweicloud.sdk.dws.v2.model.ResizeClusterRequest;
import com.huaweicloud.sdk.dws.v2.model.ResizeClusterRequestBody;
import com.huaweicloud.sdk.dws.v2.model.ResizeClusterResponse;
import com.huaweicloud.sdk.dws.v2.model.RestartClusterRequest;
import com.huaweicloud.sdk.dws.v2.model.RestartClusterRequestBody;
import com.huaweicloud.sdk.dws.v2.model.RestartClusterResponse;
import com.huaweicloud.sdk.dws.v2.model.RestoreClusterRequest;
import com.huaweicloud.sdk.dws.v2.model.RestoreClusterRequestBody;
import com.huaweicloud.sdk.dws.v2.model.RestoreClusterResponse;
import com.huaweicloud.sdk.dws.v2.model.RestoreDisasterRequest;
import com.huaweicloud.sdk.dws.v2.model.RestoreDisasterResponse;
import com.huaweicloud.sdk.dws.v2.model.RestoreTableRequest;
import com.huaweicloud.sdk.dws.v2.model.RestoreTableRequestBody;
import com.huaweicloud.sdk.dws.v2.model.RestoreTableResponse;
import com.huaweicloud.sdk.dws.v2.model.SaveClusterDescriptionInfoRequest;
import com.huaweicloud.sdk.dws.v2.model.SaveClusterDescriptionInfoResponse;
import com.huaweicloud.sdk.dws.v2.model.ShowClusterRedistributionRequest;
import com.huaweicloud.sdk.dws.v2.model.ShowClusterRedistributionResponse;
import com.huaweicloud.sdk.dws.v2.model.ShowDatabaseAuthorityRequest;
import com.huaweicloud.sdk.dws.v2.model.ShowDatabaseAuthorityResponse;
import com.huaweicloud.sdk.dws.v2.model.ShowDatabaseOmUserStatusRequest;
import com.huaweicloud.sdk.dws.v2.model.ShowDatabaseOmUserStatusResponse;
import com.huaweicloud.sdk.dws.v2.model.ShowDatabaseUserRequest;
import com.huaweicloud.sdk.dws.v2.model.ShowDatabaseUserResponse;
import com.huaweicloud.sdk.dws.v2.model.ShowDisasterDetailRequest;
import com.huaweicloud.sdk.dws.v2.model.ShowDisasterDetailResponse;
import com.huaweicloud.sdk.dws.v2.model.ShowDisasterProgressRequest;
import com.huaweicloud.sdk.dws.v2.model.ShowDisasterProgressResponse;
import com.huaweicloud.sdk.dws.v2.model.ShowInstanceRequest;
import com.huaweicloud.sdk.dws.v2.model.ShowInstanceResponse;
import com.huaweicloud.sdk.dws.v2.model.ShowWorkloadPlanRequest;
import com.huaweicloud.sdk.dws.v2.model.ShowWorkloadPlanResponse;
import com.huaweicloud.sdk.dws.v2.model.ShrinkClusterRequest;
import com.huaweicloud.sdk.dws.v2.model.ShrinkClusterResponse;
import com.huaweicloud.sdk.dws.v2.model.StartDisasterRecoveryRequest;
import com.huaweicloud.sdk.dws.v2.model.StartDisasterRecoveryResponse;
import com.huaweicloud.sdk.dws.v2.model.StartWorkloadPlanRequest;
import com.huaweicloud.sdk.dws.v2.model.StartWorkloadPlanResponse;
import com.huaweicloud.sdk.dws.v2.model.StopWorkloadPlanRequest;
import com.huaweicloud.sdk.dws.v2.model.StopWorkloadPlanResponse;
import com.huaweicloud.sdk.dws.v2.model.SwitchFailoverDisasterRequest;
import com.huaweicloud.sdk.dws.v2.model.SwitchFailoverDisasterResponse;
import com.huaweicloud.sdk.dws.v2.model.SwitchOverClusterRequest;
import com.huaweicloud.sdk.dws.v2.model.SwitchOverClusterResponse;
import com.huaweicloud.sdk.dws.v2.model.SwitchoverDisasterRecoveryRequest;
import com.huaweicloud.sdk.dws.v2.model.SwitchoverDisasterRecoveryResponse;
import com.huaweicloud.sdk.dws.v2.model.SyncIamUsersRequest;
import com.huaweicloud.sdk.dws.v2.model.SyncIamUsersResponse;
import com.huaweicloud.sdk.dws.v2.model.TrendQueryDataResp;
import com.huaweicloud.sdk.dws.v2.model.UpdateAlarmSubRequest;
import com.huaweicloud.sdk.dws.v2.model.UpdateAlarmSubResponse;
import com.huaweicloud.sdk.dws.v2.model.UpdateClusterDnsRequest;
import com.huaweicloud.sdk.dws.v2.model.UpdateClusterDnsResponse;
import com.huaweicloud.sdk.dws.v2.model.UpdateConfigurationRequest;
import com.huaweicloud.sdk.dws.v2.model.UpdateConfigurationResponse;
import com.huaweicloud.sdk.dws.v2.model.UpdateDataSourceRequest;
import com.huaweicloud.sdk.dws.v2.model.UpdateDataSourceResponse;
import com.huaweicloud.sdk.dws.v2.model.UpdateDatabaseAuthorityRequest;
import com.huaweicloud.sdk.dws.v2.model.UpdateDatabaseAuthorityResponse;
import com.huaweicloud.sdk.dws.v2.model.UpdateDatabaseUserInfoRequest;
import com.huaweicloud.sdk.dws.v2.model.UpdateDatabaseUserInfoResponse;
import com.huaweicloud.sdk.dws.v2.model.UpdateDisasterInfoRequest;
import com.huaweicloud.sdk.dws.v2.model.UpdateDisasterInfoResponse;
import com.huaweicloud.sdk.dws.v2.model.UpdateDisasterRecoveryRequest;
import com.huaweicloud.sdk.dws.v2.model.UpdateEventSubRequest;
import com.huaweicloud.sdk.dws.v2.model.UpdateEventSubResponse;
import com.huaweicloud.sdk.dws.v2.model.UpdateMaintenanceWindowRequest;
import com.huaweicloud.sdk.dws.v2.model.UpdateMaintenanceWindowResponse;
import com.huaweicloud.sdk.dws.v2.model.V2CreateClusterReq;
import com.huaweicloud.sdk.dws.v2.model.WorkloadPlanReq;
import com.huaweicloud.sdk.dws.v2.model.WorkloadQueueReq;
import com.huaweicloud.sdk.dws.v2.model.WorkloadStatusReq;

import java.util.List;

@SuppressWarnings("unchecked")
public class DwsMeta {

    public static final HttpRequestDef<AddSnapshotCrossRegionPolicyRequest, AddSnapshotCrossRegionPolicyResponse> addSnapshotCrossRegionPolicy =
        genForaddSnapshotCrossRegionPolicy();

    private static HttpRequestDef<AddSnapshotCrossRegionPolicyRequest, AddSnapshotCrossRegionPolicyResponse> genForaddSnapshotCrossRegionPolicy() {
        // basic
        HttpRequestDef.Builder<AddSnapshotCrossRegionPolicyRequest, AddSnapshotCrossRegionPolicyResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    AddSnapshotCrossRegionPolicyRequest.class,
                    AddSnapshotCrossRegionPolicyResponse.class)
                .withName("AddSnapshotCrossRegionPolicy")
                .withUri("/v1/{project_id}/snapshots/cross-region-policies")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<AddSnapshotCrossRegionPolicyRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(AddSnapshotCrossRegionPolicyRequestBody.class),
            f -> f.withMarshaller(AddSnapshotCrossRegionPolicyRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<AddWorkloadQueueRequest, AddWorkloadQueueResponse> addWorkloadQueue =
        genForaddWorkloadQueue();

    private static HttpRequestDef<AddWorkloadQueueRequest, AddWorkloadQueueResponse> genForaddWorkloadQueue() {
        // basic
        HttpRequestDef.Builder<AddWorkloadQueueRequest, AddWorkloadQueueResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, AddWorkloadQueueRequest.class, AddWorkloadQueueResponse.class)
                .withName("AddWorkloadQueue")
                .withUri("/v2/{project_id}/clusters/{cluster_id}/workload/queues")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(AddWorkloadQueueRequest::getClusterId, (req, v) -> {
                req.setClusterId(v);
            }));
        builder.<WorkloadQueueReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(WorkloadQueueReq.class),
            f -> f.withMarshaller(AddWorkloadQueueRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<AssociateEipRequest, AssociateEipResponse> associateEip = genForassociateEip();

    private static HttpRequestDef<AssociateEipRequest, AssociateEipResponse> genForassociateEip() {
        // basic
        HttpRequestDef.Builder<AssociateEipRequest, AssociateEipResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, AssociateEipRequest.class, AssociateEipResponse.class)
                .withName("AssociateEip")
                .withUri("/v2/{project_id}/clusters/{cluster_id}/eips/{eip_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(AssociateEipRequest::getClusterId, (req, v) -> {
                req.setClusterId(v);
            }));
        builder.<String>withRequestField("eip_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(AssociateEipRequest::getEipId, (req, v) -> {
                req.setEipId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<AssociateElbRequest, AssociateElbResponse> associateElb = genForassociateElb();

    private static HttpRequestDef<AssociateElbRequest, AssociateElbResponse> genForassociateElb() {
        // basic
        HttpRequestDef.Builder<AssociateElbRequest, AssociateElbResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, AssociateElbRequest.class, AssociateElbResponse.class)
                .withName("AssociateElb")
                .withUri("/v2/{project_id}/clusters/{cluster_id}/elbs/{elb_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(AssociateElbRequest::getClusterId, (req, v) -> {
                req.setClusterId(v);
            }));
        builder.<String>withRequestField("elb_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(AssociateElbRequest::getElbId, (req, v) -> {
                req.setElbId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchCreateClusterCnRequest, BatchCreateClusterCnResponse> batchCreateClusterCn =
        genForbatchCreateClusterCn();

    private static HttpRequestDef<BatchCreateClusterCnRequest, BatchCreateClusterCnResponse> genForbatchCreateClusterCn() {
        // basic
        HttpRequestDef.Builder<BatchCreateClusterCnRequest, BatchCreateClusterCnResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, BatchCreateClusterCnRequest.class, BatchCreateClusterCnResponse.class)
            .withName("BatchCreateClusterCn")
            .withUri("/v1.0/{project_id}/clusters/{cluster_id}/cns/batch-create")
            .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchCreateClusterCnRequest::getClusterId, (req, v) -> {
                req.setClusterId(v);
            }));
        builder.<BatchCreateCn>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchCreateCn.class),
            f -> f.withMarshaller(BatchCreateClusterCnRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchCreateResourceTagRequest, BatchCreateResourceTagResponse> batchCreateResourceTag =
        genForbatchCreateResourceTag();

    private static HttpRequestDef<BatchCreateResourceTagRequest, BatchCreateResourceTagResponse> genForbatchCreateResourceTag() {
        // basic
        HttpRequestDef.Builder<BatchCreateResourceTagRequest, BatchCreateResourceTagResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, BatchCreateResourceTagRequest.class, BatchCreateResourceTagResponse.class)
            .withName("BatchCreateResourceTag")
            .withUri("/v1.0/{project_id}/clusters/{cluster_id}/tags/batch-create")
            .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchCreateResourceTagRequest::getClusterId, (req, v) -> {
                req.setClusterId(v);
            }));
        builder.<BatchCreateResourceTags>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchCreateResourceTags.class),
            f -> f.withMarshaller(BatchCreateResourceTagRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchDeleteClusterCnRequest, BatchDeleteClusterCnResponse> batchDeleteClusterCn =
        genForbatchDeleteClusterCn();

    private static HttpRequestDef<BatchDeleteClusterCnRequest, BatchDeleteClusterCnResponse> genForbatchDeleteClusterCn() {
        // basic
        HttpRequestDef.Builder<BatchDeleteClusterCnRequest, BatchDeleteClusterCnResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, BatchDeleteClusterCnRequest.class, BatchDeleteClusterCnResponse.class)
            .withName("BatchDeleteClusterCn")
            .withUri("/v1.0/{project_id}/clusters/{cluster_id}/cns/batch-delete")
            .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchDeleteClusterCnRequest::getClusterId, (req, v) -> {
                req.setClusterId(v);
            }));
        builder.<BatchDeleteCn>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchDeleteCn.class),
            f -> f.withMarshaller(BatchDeleteClusterCnRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchDeleteResourceTagRequest, BatchDeleteResourceTagResponse> batchDeleteResourceTag =
        genForbatchDeleteResourceTag();

    private static HttpRequestDef<BatchDeleteResourceTagRequest, BatchDeleteResourceTagResponse> genForbatchDeleteResourceTag() {
        // basic
        HttpRequestDef.Builder<BatchDeleteResourceTagRequest, BatchDeleteResourceTagResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, BatchDeleteResourceTagRequest.class, BatchDeleteResourceTagResponse.class)
            .withName("BatchDeleteResourceTag")
            .withUri("/v1.0/{project_id}/clusters/{cluster_id}/tags/batch-delete")
            .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchDeleteResourceTagRequest::getClusterId, (req, v) -> {
                req.setClusterId(v);
            }));
        builder.<BatchDeleteResourceTags>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchDeleteResourceTags.class),
            f -> f.withMarshaller(BatchDeleteResourceTagRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CancelReadonlyClusterRequest, CancelReadonlyClusterResponse> cancelReadonlyCluster =
        genForcancelReadonlyCluster();

    private static HttpRequestDef<CancelReadonlyClusterRequest, CancelReadonlyClusterResponse> genForcancelReadonlyCluster() {
        // basic
        HttpRequestDef.Builder<CancelReadonlyClusterRequest, CancelReadonlyClusterResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, CancelReadonlyClusterRequest.class, CancelReadonlyClusterResponse.class)
            .withName("CancelReadonlyCluster")
            .withUri("/v1.0/{project_id}/clusters/{cluster_id}/cancel-readonly")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CancelReadonlyClusterRequest::getClusterId, (req, v) -> {
                req.setClusterId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CheckClusterRequest, CheckClusterResponse> checkCluster = genForcheckCluster();

    private static HttpRequestDef<CheckClusterRequest, CheckClusterResponse> genForcheckCluster() {
        // basic
        HttpRequestDef.Builder<CheckClusterRequest, CheckClusterResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CheckClusterRequest.class, CheckClusterResponse.class)
                .withName("CheckCluster")
                .withUri("/v2/{project_id}/cluster-precheck")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<ClusterCheckRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ClusterCheckRequestBody.class),
            f -> f.withMarshaller(CheckClusterRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CheckDisasterNameRequest, CheckDisasterNameResponse> checkDisasterName =
        genForcheckDisasterName();

    private static HttpRequestDef<CheckDisasterNameRequest, CheckDisasterNameResponse> genForcheckDisasterName() {
        // basic
        HttpRequestDef.Builder<CheckDisasterNameRequest, CheckDisasterNameResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, CheckDisasterNameRequest.class, CheckDisasterNameResponse.class)
                .withName("CheckDisasterName")
                .withUri("/v2/{project_id}/disaster-recovery/check-name")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("dr_name",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CheckDisasterNameRequest::getDrName, (req, v) -> {
                req.setDrName(v);
            }));
        builder.<String>withRequestField("type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CheckDisasterNameRequest::getType, (req, v) -> {
                req.setType(v);
            }));
        builder.<String>withRequestField("standby_region",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CheckDisasterNameRequest::getStandbyRegion, (req, v) -> {
                req.setStandbyRegion(v);
            }));
        builder.<String>withRequestField("standby_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CheckDisasterNameRequest::getStandbyProjectId, (req, v) -> {
                req.setStandbyProjectId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CheckTableRestoreRequest, CheckTableRestoreResponse> checkTableRestore =
        genForcheckTableRestore();

    private static HttpRequestDef<CheckTableRestoreRequest, CheckTableRestoreResponse> genForcheckTableRestore() {
        // basic
        HttpRequestDef.Builder<CheckTableRestoreRequest, CheckTableRestoreResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CheckTableRestoreRequest.class, CheckTableRestoreResponse.class)
                .withName("CheckTableRestore")
                .withUri("/v1/{project_id}/snapshots/{snapshot_id}/table-restore-check")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("snapshot_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CheckTableRestoreRequest::getSnapshotId, (req, v) -> {
                req.setSnapshotId(v);
            }));
        builder.<CheckTableRestoreRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CheckTableRestoreRequestBody.class),
            f -> f.withMarshaller(CheckTableRestoreRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CopySnapshotRequest, CopySnapshotResponse> copySnapshot = genForcopySnapshot();

    private static HttpRequestDef<CopySnapshotRequest, CopySnapshotResponse> genForcopySnapshot() {
        // basic
        HttpRequestDef.Builder<CopySnapshotRequest, CopySnapshotResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CopySnapshotRequest.class, CopySnapshotResponse.class)
                .withName("CopySnapshot")
                .withUri("/v1.0/{project_id}/snapshots/{snapshot_id}/linked-copy")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("snapshot_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CopySnapshotRequest::getSnapshotId, (req, v) -> {
                req.setSnapshotId(v);
            }));
        builder.<LinkCopyReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(LinkCopyReq.class),
            f -> f.withMarshaller(CopySnapshotRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateAlarmSubRequest, CreateAlarmSubResponse> createAlarmSub =
        genForcreateAlarmSub();

    private static HttpRequestDef<CreateAlarmSubRequest, CreateAlarmSubResponse> genForcreateAlarmSub() {
        // basic
        HttpRequestDef.Builder<CreateAlarmSubRequest, CreateAlarmSubResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateAlarmSubRequest.class, CreateAlarmSubResponse.class)
                .withName("CreateAlarmSub")
                .withUri("/v2/{project_id}/alarm-subs")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<AlarmSubRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(AlarmSubRequest.class),
            f -> f.withMarshaller(CreateAlarmSubRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateClusterRequest, CreateClusterResponse> createCluster =
        genForcreateCluster();

    private static HttpRequestDef<CreateClusterRequest, CreateClusterResponse> genForcreateCluster() {
        // basic
        HttpRequestDef.Builder<CreateClusterRequest, CreateClusterResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateClusterRequest.class, CreateClusterResponse.class)
                .withName("CreateCluster")
                .withUri("/v1.0/{project_id}/clusters")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<CreateClusterRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateClusterRequestBody.class),
            f -> f.withMarshaller(CreateClusterRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateClusterDnsRequest, CreateClusterDnsResponse> createClusterDns =
        genForcreateClusterDns();

    private static HttpRequestDef<CreateClusterDnsRequest, CreateClusterDnsResponse> genForcreateClusterDns() {
        // basic
        HttpRequestDef.Builder<CreateClusterDnsRequest, CreateClusterDnsResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateClusterDnsRequest.class, CreateClusterDnsResponse.class)
                .withName("CreateClusterDns")
                .withUri("/v1.0/{project_id}/clusters/{cluster_id}/dns")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateClusterDnsRequest::getClusterId, (req, v) -> {
                req.setClusterId(v);
            }));
        builder.<CreateClusterDns>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateClusterDns.class),
            f -> f.withMarshaller(CreateClusterDnsRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateClusterV2Request, CreateClusterV2Response> createClusterV2 =
        genForcreateClusterV2();

    private static HttpRequestDef<CreateClusterV2Request, CreateClusterV2Response> genForcreateClusterV2() {
        // basic
        HttpRequestDef.Builder<CreateClusterV2Request, CreateClusterV2Response> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateClusterV2Request.class, CreateClusterV2Response.class)
                .withName("CreateClusterV2")
                .withUri("/v2/{project_id}/clusters")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<V2CreateClusterReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(V2CreateClusterReq.class),
            f -> f.withMarshaller(CreateClusterV2Request::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateClusterWorkloadRequest, CreateClusterWorkloadResponse> createClusterWorkload =
        genForcreateClusterWorkload();

    private static HttpRequestDef<CreateClusterWorkloadRequest, CreateClusterWorkloadResponse> genForcreateClusterWorkload() {
        // basic
        HttpRequestDef.Builder<CreateClusterWorkloadRequest, CreateClusterWorkloadResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, CreateClusterWorkloadRequest.class, CreateClusterWorkloadResponse.class)
            .withName("CreateClusterWorkload")
            .withUri("/v2/{project_id}/clusters/{cluster_id}/workload")
            .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateClusterWorkloadRequest::getClusterId, (req, v) -> {
                req.setClusterId(v);
            }));
        builder.<WorkloadStatusReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(WorkloadStatusReq.class),
            f -> f.withMarshaller(CreateClusterWorkloadRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateDataSourceRequest, CreateDataSourceResponse> createDataSource =
        genForcreateDataSource();

    private static HttpRequestDef<CreateDataSourceRequest, CreateDataSourceResponse> genForcreateDataSource() {
        // basic
        HttpRequestDef.Builder<CreateDataSourceRequest, CreateDataSourceResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateDataSourceRequest.class, CreateDataSourceResponse.class)
                .withName("CreateDataSource")
                .withUri("/v1.0/{project_id}/clusters/{cluster_id}/ext-data-sources")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateDataSourceRequest::getClusterId, (req, v) -> {
                req.setClusterId(v);
            }));
        builder.<ExtDataSourceReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ExtDataSourceReq.class),
            f -> f.withMarshaller(CreateDataSourceRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateDisasterRecoveryRequest, CreateDisasterRecoveryResponse> createDisasterRecovery =
        genForcreateDisasterRecovery();

    private static HttpRequestDef<CreateDisasterRecoveryRequest, CreateDisasterRecoveryResponse> genForcreateDisasterRecovery() {
        // basic
        HttpRequestDef.Builder<CreateDisasterRecoveryRequest, CreateDisasterRecoveryResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, CreateDisasterRecoveryRequest.class, CreateDisasterRecoveryResponse.class)
            .withName("CreateDisasterRecovery")
            .withUri("/v2/{project_id}/disaster-recoveries")
            .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<CreateDisasterRecoveryReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateDisasterRecoveryReq.class),
            f -> f.withMarshaller(CreateDisasterRecoveryRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateEventSubRequest, CreateEventSubResponse> createEventSub =
        genForcreateEventSub();

    private static HttpRequestDef<CreateEventSubRequest, CreateEventSubResponse> genForcreateEventSub() {
        // basic
        HttpRequestDef.Builder<CreateEventSubRequest, CreateEventSubResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateEventSubRequest.class, CreateEventSubResponse.class)
                .withName("CreateEventSub")
                .withUri("/v2/{project_id}/event-subs")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<EventSubRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(EventSubRequest.class),
            f -> f.withMarshaller(CreateEventSubRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateSnapshotRequest, CreateSnapshotResponse> createSnapshot =
        genForcreateSnapshot();

    private static HttpRequestDef<CreateSnapshotRequest, CreateSnapshotResponse> genForcreateSnapshot() {
        // basic
        HttpRequestDef.Builder<CreateSnapshotRequest, CreateSnapshotResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateSnapshotRequest.class, CreateSnapshotResponse.class)
                .withName("CreateSnapshot")
                .withUri("/v1.0/{project_id}/snapshots")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<CreateSnapshotRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateSnapshotRequestBody.class),
            f -> f.withMarshaller(CreateSnapshotRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateSnapshotPolicyRequest, CreateSnapshotPolicyResponse> createSnapshotPolicy =
        genForcreateSnapshotPolicy();

    private static HttpRequestDef<CreateSnapshotPolicyRequest, CreateSnapshotPolicyResponse> genForcreateSnapshotPolicy() {
        // basic
        HttpRequestDef.Builder<CreateSnapshotPolicyRequest, CreateSnapshotPolicyResponse> builder = HttpRequestDef
            .builder(HttpMethod.PUT, CreateSnapshotPolicyRequest.class, CreateSnapshotPolicyResponse.class)
            .withName("CreateSnapshotPolicy")
            .withUri("/v2/{project_id}/clusters/{cluster_id}/snapshot-policies")
            .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateSnapshotPolicyRequest::getClusterId, (req, v) -> {
                req.setClusterId(v);
            }));
        builder.<BackupPolicy>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(BackupPolicy.class),
            f -> f.withMarshaller(CreateSnapshotPolicyRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response
        builder.<String>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(CreateSnapshotPolicyResponse::getBody, (response, data) -> {
                response.setBody(data);
            }));

        return builder.build();
    }

    public static final HttpRequestDef<CreateWorkloadPlanRequest, CreateWorkloadPlanResponse> createWorkloadPlan =
        genForcreateWorkloadPlan();

    private static HttpRequestDef<CreateWorkloadPlanRequest, CreateWorkloadPlanResponse> genForcreateWorkloadPlan() {
        // basic
        HttpRequestDef.Builder<CreateWorkloadPlanRequest, CreateWorkloadPlanResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateWorkloadPlanRequest.class, CreateWorkloadPlanResponse.class)
                .withName("CreateWorkloadPlan")
                .withUri("/v2/{project_id}/clusters/{cluster_id}/workload/plans")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateWorkloadPlanRequest::getClusterId, (req, v) -> {
                req.setClusterId(v);
            }));
        builder.<WorkloadPlanReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(WorkloadPlanReq.class),
            f -> f.withMarshaller(CreateWorkloadPlanRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteAlarmSubRequest, DeleteAlarmSubResponse> deleteAlarmSub =
        genFordeleteAlarmSub();

    private static HttpRequestDef<DeleteAlarmSubRequest, DeleteAlarmSubResponse> genFordeleteAlarmSub() {
        // basic
        HttpRequestDef.Builder<DeleteAlarmSubRequest, DeleteAlarmSubResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteAlarmSubRequest.class, DeleteAlarmSubResponse.class)
                .withName("DeleteAlarmSub")
                .withUri("/v2/{project_id}/alarm-subs/{alarm_sub_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("alarm_sub_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteAlarmSubRequest::getAlarmSubId, (req, v) -> {
                req.setAlarmSubId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteClusterRequest, DeleteClusterResponse> deleteCluster =
        genFordeleteCluster();

    private static HttpRequestDef<DeleteClusterRequest, DeleteClusterResponse> genFordeleteCluster() {
        // basic
        HttpRequestDef.Builder<DeleteClusterRequest, DeleteClusterResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteClusterRequest.class, DeleteClusterResponse.class)
                .withName("DeleteCluster")
                .withUri("/v1.0/{project_id}/clusters/{cluster_id}")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteClusterRequest::getClusterId, (req, v) -> {
                req.setClusterId(v);
            }));
        builder.<DeleteClusterRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(DeleteClusterRequestBody.class),
            f -> f.withMarshaller(DeleteClusterRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteClusterDnsRequest, DeleteClusterDnsResponse> deleteClusterDns =
        genFordeleteClusterDns();

    private static HttpRequestDef<DeleteClusterDnsRequest, DeleteClusterDnsResponse> genFordeleteClusterDns() {
        // basic
        HttpRequestDef.Builder<DeleteClusterDnsRequest, DeleteClusterDnsResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteClusterDnsRequest.class, DeleteClusterDnsResponse.class)
                .withName("DeleteClusterDns")
                .withUri("/v1.0/{project_id}/clusters/{cluster_id}/dns")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteClusterDnsRequest::getClusterId, (req, v) -> {
                req.setClusterId(v);
            }));
        builder.<String>withRequestField("type",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteClusterDnsRequest::getType, (req, v) -> {
                req.setType(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteDataSourceRequest, DeleteDataSourceResponse> deleteDataSource =
        genFordeleteDataSource();

    private static HttpRequestDef<DeleteDataSourceRequest, DeleteDataSourceResponse> genFordeleteDataSource() {
        // basic
        HttpRequestDef.Builder<DeleteDataSourceRequest, DeleteDataSourceResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteDataSourceRequest.class, DeleteDataSourceResponse.class)
                .withName("DeleteDataSource")
                .withUri("/v1.0/{project_id}/clusters/{cluster_id}/ext-data-sources/{ext_data_source_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteDataSourceRequest::getClusterId, (req, v) -> {
                req.setClusterId(v);
            }));
        builder.<String>withRequestField("ext_data_source_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteDataSourceRequest::getExtDataSourceId, (req, v) -> {
                req.setExtDataSourceId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteDisasterRecoveryRequest, DeleteDisasterRecoveryResponse> deleteDisasterRecovery =
        genFordeleteDisasterRecovery();

    private static HttpRequestDef<DeleteDisasterRecoveryRequest, DeleteDisasterRecoveryResponse> genFordeleteDisasterRecovery() {
        // basic
        HttpRequestDef.Builder<DeleteDisasterRecoveryRequest, DeleteDisasterRecoveryResponse> builder = HttpRequestDef
            .builder(HttpMethod.DELETE, DeleteDisasterRecoveryRequest.class, DeleteDisasterRecoveryResponse.class)
            .withName("DeleteDisasterRecovery")
            .withUri("/v2/{project_id}/disaster-recovery/{disaster_recovery_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("disaster_recovery_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteDisasterRecoveryRequest::getDisasterRecoveryId, (req, v) -> {
                req.setDisasterRecoveryId(v);
            }));

        // response
        builder.<String>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(DeleteDisasterRecoveryResponse::getBody, (response, data) -> {
                response.setBody(data);
            }));

        return builder.build();
    }

    public static final HttpRequestDef<DeleteEventSubRequest, DeleteEventSubResponse> deleteEventSub =
        genFordeleteEventSub();

    private static HttpRequestDef<DeleteEventSubRequest, DeleteEventSubResponse> genFordeleteEventSub() {
        // basic
        HttpRequestDef.Builder<DeleteEventSubRequest, DeleteEventSubResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteEventSubRequest.class, DeleteEventSubResponse.class)
                .withName("DeleteEventSub")
                .withUri("/v2/{project_id}/event-subs/{event_sub_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("event_sub_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteEventSubRequest::getEventSubId, (req, v) -> {
                req.setEventSubId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteSnapshotRequest, DeleteSnapshotResponse> deleteSnapshot =
        genFordeleteSnapshot();

    private static HttpRequestDef<DeleteSnapshotRequest, DeleteSnapshotResponse> genFordeleteSnapshot() {
        // basic
        HttpRequestDef.Builder<DeleteSnapshotRequest, DeleteSnapshotResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteSnapshotRequest.class, DeleteSnapshotResponse.class)
                .withName("DeleteSnapshot")
                .withUri("/v1.0/{project_id}/snapshots/{snapshot_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("snapshot_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteSnapshotRequest::getSnapshotId, (req, v) -> {
                req.setSnapshotId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteSnapshotCrossRegionPolicyRequest, DeleteSnapshotCrossRegionPolicyResponse> deleteSnapshotCrossRegionPolicy =
        genFordeleteSnapshotCrossRegionPolicy();

    private static HttpRequestDef<DeleteSnapshotCrossRegionPolicyRequest, DeleteSnapshotCrossRegionPolicyResponse> genFordeleteSnapshotCrossRegionPolicy() {
        // basic
        HttpRequestDef.Builder<DeleteSnapshotCrossRegionPolicyRequest, DeleteSnapshotCrossRegionPolicyResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.DELETE,
                    DeleteSnapshotCrossRegionPolicyRequest.class,
                    DeleteSnapshotCrossRegionPolicyResponse.class)
                .withName("DeleteSnapshotCrossRegionPolicy")
                .withUri("/v1/{project_id}/snapshots/cross-region-policies")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteSnapshotCrossRegionPolicyRequest::getClusterId, (req, v) -> {
                req.setClusterId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteSnapshotPolicyRequest, DeleteSnapshotPolicyResponse> deleteSnapshotPolicy =
        genFordeleteSnapshotPolicy();

    private static HttpRequestDef<DeleteSnapshotPolicyRequest, DeleteSnapshotPolicyResponse> genFordeleteSnapshotPolicy() {
        // basic
        HttpRequestDef.Builder<DeleteSnapshotPolicyRequest, DeleteSnapshotPolicyResponse> builder = HttpRequestDef
            .builder(HttpMethod.DELETE, DeleteSnapshotPolicyRequest.class, DeleteSnapshotPolicyResponse.class)
            .withName("DeleteSnapshotPolicy")
            .withUri("/v1.0/{project_id}/clusters/{cluster_id}/snapshot-policies/{id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteSnapshotPolicyRequest::getClusterId, (req, v) -> {
                req.setClusterId(v);
            }));
        builder.<String>withRequestField("id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteSnapshotPolicyRequest::getId, (req, v) -> {
                req.setId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteWorkloadPlanRequest, DeleteWorkloadPlanResponse> deleteWorkloadPlan =
        genFordeleteWorkloadPlan();

    private static HttpRequestDef<DeleteWorkloadPlanRequest, DeleteWorkloadPlanResponse> genFordeleteWorkloadPlan() {
        // basic
        HttpRequestDef.Builder<DeleteWorkloadPlanRequest, DeleteWorkloadPlanResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteWorkloadPlanRequest.class, DeleteWorkloadPlanResponse.class)
                .withName("DeleteWorkloadPlan")
                .withUri("/v2/{project_id}/clusters/{cluster_id}/workload/plans/{plan_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteWorkloadPlanRequest::getClusterId, (req, v) -> {
                req.setClusterId(v);
            }));
        builder.<String>withRequestField("plan_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteWorkloadPlanRequest::getPlanId, (req, v) -> {
                req.setPlanId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteWorkloadQueueRequest, DeleteWorkloadQueueResponse> deleteWorkloadQueue =
        genFordeleteWorkloadQueue();

    private static HttpRequestDef<DeleteWorkloadQueueRequest, DeleteWorkloadQueueResponse> genFordeleteWorkloadQueue() {
        // basic
        HttpRequestDef.Builder<DeleteWorkloadQueueRequest, DeleteWorkloadQueueResponse> builder = HttpRequestDef
            .builder(HttpMethod.DELETE, DeleteWorkloadQueueRequest.class, DeleteWorkloadQueueResponse.class)
            .withName("DeleteWorkloadQueue")
            .withUri("/v2/{project_id}/clusters/{cluster_id}/workload/queues")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteWorkloadQueueRequest::getClusterId, (req, v) -> {
                req.setClusterId(v);
            }));
        builder.<String>withRequestField("logical_cluster_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteWorkloadQueueRequest::getLogicalClusterName, (req, v) -> {
                req.setLogicalClusterName(v);
            }));
        builder.<String>withRequestField("workload_queue_name",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteWorkloadQueueRequest::getWorkloadQueueName, (req, v) -> {
                req.setWorkloadQueueName(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DisassociateEipRequest, DisassociateEipResponse> disassociateEip =
        genFordisassociateEip();

    private static HttpRequestDef<DisassociateEipRequest, DisassociateEipResponse> genFordisassociateEip() {
        // basic
        HttpRequestDef.Builder<DisassociateEipRequest, DisassociateEipResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DisassociateEipRequest.class, DisassociateEipResponse.class)
                .withName("DisassociateEip")
                .withUri("/v2/{project_id}/clusters/{cluster_id}/eips/{eip_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DisassociateEipRequest::getClusterId, (req, v) -> {
                req.setClusterId(v);
            }));
        builder.<String>withRequestField("eip_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DisassociateEipRequest::getEipId, (req, v) -> {
                req.setEipId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DisassociateElbRequest, DisassociateElbResponse> disassociateElb =
        genFordisassociateElb();

    private static HttpRequestDef<DisassociateElbRequest, DisassociateElbResponse> genFordisassociateElb() {
        // basic
        HttpRequestDef.Builder<DisassociateElbRequest, DisassociateElbResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DisassociateElbRequest.class, DisassociateElbResponse.class)
                .withName("DisassociateElb")
                .withUri("/v2/{project_id}/clusters/{cluster_id}/elbs/{elb_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DisassociateElbRequest::getClusterId, (req, v) -> {
                req.setClusterId(v);
            }));
        builder.<String>withRequestField("elb_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DisassociateElbRequest::getElbId, (req, v) -> {
                req.setElbId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ExecuteClusterUpgradeActionRequest, ExecuteClusterUpgradeActionResponse> executeClusterUpgradeAction =
        genForexecuteClusterUpgradeAction();

    private static HttpRequestDef<ExecuteClusterUpgradeActionRequest, ExecuteClusterUpgradeActionResponse> genForexecuteClusterUpgradeAction() {
        // basic
        HttpRequestDef.Builder<ExecuteClusterUpgradeActionRequest, ExecuteClusterUpgradeActionResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    ExecuteClusterUpgradeActionRequest.class,
                    ExecuteClusterUpgradeActionResponse.class)
                .withName("ExecuteClusterUpgradeAction")
                .withUri("/v1/{project_id}/clusters/{cluster_id}/upgrade-management/action")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ExecuteClusterUpgradeActionRequest::getClusterId, (req, v) -> {
                req.setClusterId(v);
            }));
        builder.<ExecuteClusterUpgradeActionRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ExecuteClusterUpgradeActionRequestBody.class),
            f -> f.withMarshaller(ExecuteClusterUpgradeActionRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ExecuteDatabaseOmUserActionRequest, ExecuteDatabaseOmUserActionResponse> executeDatabaseOmUserAction =
        genForexecuteDatabaseOmUserAction();

    private static HttpRequestDef<ExecuteDatabaseOmUserActionRequest, ExecuteDatabaseOmUserActionResponse> genForexecuteDatabaseOmUserAction() {
        // basic
        HttpRequestDef.Builder<ExecuteDatabaseOmUserActionRequest, ExecuteDatabaseOmUserActionResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    ExecuteDatabaseOmUserActionRequest.class,
                    ExecuteDatabaseOmUserActionResponse.class)
                .withName("ExecuteDatabaseOmUserAction")
                .withUri("/v1/{project_id}/clusters/{cluster_id}/db-manager/om-user/action")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ExecuteDatabaseOmUserActionRequest::getClusterId, (req, v) -> {
                req.setClusterId(v);
            }));
        builder.<DatabaseOmUserActionReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(DatabaseOmUserActionReq.class),
            f -> f.withMarshaller(ExecuteDatabaseOmUserActionRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ExecuteRedistributionClusterRequest, ExecuteRedistributionClusterResponse> executeRedistributionCluster =
        genForexecuteRedistributionCluster();

    private static HttpRequestDef<ExecuteRedistributionClusterRequest, ExecuteRedistributionClusterResponse> genForexecuteRedistributionCluster() {
        // basic
        HttpRequestDef.Builder<ExecuteRedistributionClusterRequest, ExecuteRedistributionClusterResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    ExecuteRedistributionClusterRequest.class,
                    ExecuteRedistributionClusterResponse.class)
                .withName("ExecuteRedistributionCluster")
                .withUri("/v2/{project_id}/clusters/{cluster_id}/redistribution")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ExecuteRedistributionClusterRequest::getClusterId, (req, v) -> {
                req.setClusterId(v);
            }));
        builder.<RedistributionReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RedistributionReq.class),
            f -> f.withMarshaller(ExecuteRedistributionClusterRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response
        builder.<String>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ExecuteRedistributionClusterResponse::getBody, (response, data) -> {
                response.setBody(data);
            }));

        return builder.build();
    }

    public static final HttpRequestDef<ExpandInstanceStorageRequest, ExpandInstanceStorageResponse> expandInstanceStorage =
        genForexpandInstanceStorage();

    private static HttpRequestDef<ExpandInstanceStorageRequest, ExpandInstanceStorageResponse> genForexpandInstanceStorage() {
        // basic
        HttpRequestDef.Builder<ExpandInstanceStorageRequest, ExpandInstanceStorageResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, ExpandInstanceStorageRequest.class, ExpandInstanceStorageResponse.class)
            .withName("ExpandInstanceStorage")
            .withUri("/v1.0/{project_id}/clusters/{cluster_id}/expand-instance-storage")
            .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ExpandInstanceStorageRequest::getClusterId, (req, v) -> {
                req.setClusterId(v);
            }));
        builder.<ExpandInstanceStorage>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ExpandInstanceStorage.class),
            f -> f.withMarshaller(ExpandInstanceStorageRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAlarmConfigsRequest, ListAlarmConfigsResponse> listAlarmConfigs =
        genForlistAlarmConfigs();

    private static HttpRequestDef<ListAlarmConfigsRequest, ListAlarmConfigsResponse> genForlistAlarmConfigs() {
        // basic
        HttpRequestDef.Builder<ListAlarmConfigsRequest, ListAlarmConfigsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListAlarmConfigsRequest.class, ListAlarmConfigsResponse.class)
                .withName("ListAlarmConfigs")
                .withUri("/v2/{project_id}/alarm-configs")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAlarmConfigsRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<String>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAlarmConfigsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAlarmDetailRequest, ListAlarmDetailResponse> listAlarmDetail =
        genForlistAlarmDetail();

    private static HttpRequestDef<ListAlarmDetailRequest, ListAlarmDetailResponse> genForlistAlarmDetail() {
        // basic
        HttpRequestDef.Builder<ListAlarmDetailRequest, ListAlarmDetailResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListAlarmDetailRequest.class, ListAlarmDetailResponse.class)
                .withName("ListAlarmDetail")
                .withUri("/v2/{project_id}/alarms")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("time_zone",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAlarmDetailRequest::getTimeZone, (req, v) -> {
                req.setTimeZone(v);
            }));
        builder.<String>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAlarmDetailRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<String>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAlarmDetailRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAlarmStatisticRequest, ListAlarmStatisticResponse> listAlarmStatistic =
        genForlistAlarmStatistic();

    private static HttpRequestDef<ListAlarmStatisticRequest, ListAlarmStatisticResponse> genForlistAlarmStatistic() {
        // basic
        HttpRequestDef.Builder<ListAlarmStatisticRequest, ListAlarmStatisticResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListAlarmStatisticRequest.class, ListAlarmStatisticResponse.class)
                .withName("ListAlarmStatistic")
                .withUri("/v2/{project_id}/alarm-statistic")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("time_zone",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAlarmStatisticRequest::getTimeZone, (req, v) -> {
                req.setTimeZone(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAlarmSubsRequest, ListAlarmSubsResponse> listAlarmSubs =
        genForlistAlarmSubs();

    private static HttpRequestDef<ListAlarmSubsRequest, ListAlarmSubsResponse> genForlistAlarmSubs() {
        // basic
        HttpRequestDef.Builder<ListAlarmSubsRequest, ListAlarmSubsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListAlarmSubsRequest.class, ListAlarmSubsResponse.class)
                .withName("ListAlarmSubs")
                .withUri("/v2/{project_id}/alarm-subs")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAlarmSubsRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<String>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAlarmSubsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAuditLogRequest, ListAuditLogResponse> listAuditLog = genForlistAuditLog();

    private static HttpRequestDef<ListAuditLogRequest, ListAuditLogResponse> genForlistAuditLog() {
        // basic
        HttpRequestDef.Builder<ListAuditLogRequest, ListAuditLogResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListAuditLogRequest.class, ListAuditLogResponse.class)
                .withName("ListAuditLog")
                .withUri("/v1.0/{project_id}/clusters/{cluster_id}/audit-log-records")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAuditLogRequest::getClusterId, (req, v) -> {
                req.setClusterId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAvailabilityZonesRequest, ListAvailabilityZonesResponse> listAvailabilityZones =
        genForlistAvailabilityZones();

    private static HttpRequestDef<ListAvailabilityZonesRequest, ListAvailabilityZonesResponse> genForlistAvailabilityZones() {
        // basic
        HttpRequestDef.Builder<ListAvailabilityZonesRequest, ListAvailabilityZonesResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListAvailabilityZonesRequest.class, ListAvailabilityZonesResponse.class)
            .withName("ListAvailabilityZones")
            .withUri("/v1.0/{project_id}/availability-zones")
            .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAvailableDisasterClustersRequest, ListAvailableDisasterClustersResponse> listAvailableDisasterClusters =
        genForlistAvailableDisasterClusters();

    private static HttpRequestDef<ListAvailableDisasterClustersRequest, ListAvailableDisasterClustersResponse> genForlistAvailableDisasterClusters() {
        // basic
        HttpRequestDef.Builder<ListAvailableDisasterClustersRequest, ListAvailableDisasterClustersResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListAvailableDisasterClustersRequest.class,
                    ListAvailableDisasterClustersResponse.class)
                .withName("ListAvailableDisasterClusters")
                .withUri("/v2/{project_id}/disaster-recovery-clusters")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("primary_cluster_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAvailableDisasterClustersRequest::getPrimaryClusterId, (req, v) -> {
                req.setPrimaryClusterId(v);
            }));
        builder.<String>withRequestField("primary_spec_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAvailableDisasterClustersRequest::getPrimarySpecId, (req, v) -> {
                req.setPrimarySpecId(v);
            }));
        builder.<String>withRequestField("primary_cluster_dn_num",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAvailableDisasterClustersRequest::getPrimaryClusterDnNum, (req, v) -> {
                req.setPrimaryClusterDnNum(v);
            }));
        builder.<String>withRequestField("standby_region",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAvailableDisasterClustersRequest::getStandbyRegion, (req, v) -> {
                req.setStandbyRegion(v);
            }));
        builder.<String>withRequestField("standby_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAvailableDisasterClustersRequest::getStandbyProjectId, (req, v) -> {
                req.setStandbyProjectId(v);
            }));
        builder.<String>withRequestField("standby_az_code",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAvailableDisasterClustersRequest::getStandbyAzCode, (req, v) -> {
                req.setStandbyAzCode(v);
            }));
        builder.<String>withRequestField("dr_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAvailableDisasterClustersRequest::getDrType, (req, v) -> {
                req.setDrType(v);
            }));
        builder.<String>withRequestField("datastore_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAvailableDisasterClustersRequest::getDatastoreType, (req, v) -> {
                req.setDatastoreType(v);
            }));
        builder.<String>withRequestField("datastore_version",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAvailableDisasterClustersRequest::getDatastoreVersion, (req, v) -> {
                req.setDatastoreVersion(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListClusterCnRequest, ListClusterCnResponse> listClusterCn =
        genForlistClusterCn();

    private static HttpRequestDef<ListClusterCnRequest, ListClusterCnResponse> genForlistClusterCn() {
        // basic
        HttpRequestDef.Builder<ListClusterCnRequest, ListClusterCnResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListClusterCnRequest.class, ListClusterCnResponse.class)
                .withName("ListClusterCn")
                .withUri("/v1.0/{project_id}/clusters/{cluster_id}/cns")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListClusterCnRequest::getClusterId, (req, v) -> {
                req.setClusterId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListClusterConfigurationsRequest, ListClusterConfigurationsResponse> listClusterConfigurations =
        genForlistClusterConfigurations();

    private static HttpRequestDef<ListClusterConfigurationsRequest, ListClusterConfigurationsResponse> genForlistClusterConfigurations() {
        // basic
        HttpRequestDef.Builder<ListClusterConfigurationsRequest, ListClusterConfigurationsResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListClusterConfigurationsRequest.class,
                    ListClusterConfigurationsResponse.class)
                .withName("ListClusterConfigurations")
                .withUri("/v1.0/{project_id}/clusters/{cluster_id}/configurations")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListClusterConfigurationsRequest::getClusterId, (req, v) -> {
                req.setClusterId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListClusterConfigurationsParameterRequest, ListClusterConfigurationsParameterResponse> listClusterConfigurationsParameter =
        genForlistClusterConfigurationsParameter();

    private static HttpRequestDef<ListClusterConfigurationsParameterRequest, ListClusterConfigurationsParameterResponse> genForlistClusterConfigurationsParameter() {
        // basic
        HttpRequestDef.Builder<ListClusterConfigurationsParameterRequest, ListClusterConfigurationsParameterResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListClusterConfigurationsParameterRequest.class,
                    ListClusterConfigurationsParameterResponse.class)
                .withName("ListClusterConfigurationsParameter")
                .withUri("/v1.0/{project_id}/clusters/{cluster_id}/configurations/{configuration_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListClusterConfigurationsParameterRequest::getClusterId, (req, v) -> {
                req.setClusterId(v);
            }));
        builder.<String>withRequestField("configuration_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListClusterConfigurationsParameterRequest::getConfigurationId, (req, v) -> {
                req.setConfigurationId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListClusterDetailsRequest, ListClusterDetailsResponse> listClusterDetails =
        genForlistClusterDetails();

    private static HttpRequestDef<ListClusterDetailsRequest, ListClusterDetailsResponse> genForlistClusterDetails() {
        // basic
        HttpRequestDef.Builder<ListClusterDetailsRequest, ListClusterDetailsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListClusterDetailsRequest.class, ListClusterDetailsResponse.class)
                .withName("ListClusterDetails")
                .withUri("/v1.0/{project_id}/clusters/{cluster_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListClusterDetailsRequest::getClusterId, (req, v) -> {
                req.setClusterId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListClusterScaleInNumbersRequest, ListClusterScaleInNumbersResponse> listClusterScaleInNumbers =
        genForlistClusterScaleInNumbers();

    private static HttpRequestDef<ListClusterScaleInNumbersRequest, ListClusterScaleInNumbersResponse> genForlistClusterScaleInNumbers() {
        // basic
        HttpRequestDef.Builder<ListClusterScaleInNumbersRequest, ListClusterScaleInNumbersResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListClusterScaleInNumbersRequest.class,
                    ListClusterScaleInNumbersResponse.class)
                .withName("ListClusterScaleInNumbers")
                .withUri("/v1.0/{project_id}/clusters/{cluster_id}/shrink-numbers")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListClusterScaleInNumbersRequest::getClusterId, (req, v) -> {
                req.setClusterId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListClusterSnapshotsRequest, ListClusterSnapshotsResponse> listClusterSnapshots =
        genForlistClusterSnapshots();

    private static HttpRequestDef<ListClusterSnapshotsRequest, ListClusterSnapshotsResponse> genForlistClusterSnapshots() {
        // basic
        HttpRequestDef.Builder<ListClusterSnapshotsRequest, ListClusterSnapshotsResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListClusterSnapshotsRequest.class, ListClusterSnapshotsResponse.class)
            .withName("ListClusterSnapshots")
            .withUri("/v1.0/{project_id}/clusters/{cluster_id}/snapshots")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListClusterSnapshotsRequest::getClusterId, (req, v) -> {
                req.setClusterId(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListClusterSnapshotsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListClusterSnapshotsRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<String>withRequestField("sort_key",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListClusterSnapshotsRequest::getSortKey, (req, v) -> {
                req.setSortKey(v);
            }));
        builder.<String>withRequestField("sort_dir",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListClusterSnapshotsRequest::getSortDir, (req, v) -> {
                req.setSortDir(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListClusterTagsRequest, ListClusterTagsResponse> listClusterTags =
        genForlistClusterTags();

    private static HttpRequestDef<ListClusterTagsRequest, ListClusterTagsResponse> genForlistClusterTags() {
        // basic
        HttpRequestDef.Builder<ListClusterTagsRequest, ListClusterTagsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListClusterTagsRequest.class, ListClusterTagsResponse.class)
                .withName("ListClusterTags")
                .withUri("/v1.0/{project_id}/clusters/{cluster_id}/tags")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListClusterTagsRequest::getClusterId, (req, v) -> {
                req.setClusterId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListClusterWorkloadRequest, ListClusterWorkloadResponse> listClusterWorkload =
        genForlistClusterWorkload();

    private static HttpRequestDef<ListClusterWorkloadRequest, ListClusterWorkloadResponse> genForlistClusterWorkload() {
        // basic
        HttpRequestDef.Builder<ListClusterWorkloadRequest, ListClusterWorkloadResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListClusterWorkloadRequest.class, ListClusterWorkloadResponse.class)
                .withName("ListClusterWorkload")
                .withUri("/v2/{project_id}/clusters/{cluster_id}/workload")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListClusterWorkloadRequest::getClusterId, (req, v) -> {
                req.setClusterId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListClustersRequest, ListClustersResponse> listClusters = genForlistClusters();

    private static HttpRequestDef<ListClustersRequest, ListClustersResponse> genForlistClusters() {
        // basic
        HttpRequestDef.Builder<ListClustersRequest, ListClustersResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListClustersRequest.class, ListClustersResponse.class)
                .withName("ListClusters")
                .withUri("/v1.0/{project_id}/clusters")
                .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListConfigurationsAuditRecordsRequest, ListConfigurationsAuditRecordsResponse> listConfigurationsAuditRecords =
        genForlistConfigurationsAuditRecords();

    private static HttpRequestDef<ListConfigurationsAuditRecordsRequest, ListConfigurationsAuditRecordsResponse> genForlistConfigurationsAuditRecords() {
        // basic
        HttpRequestDef.Builder<ListConfigurationsAuditRecordsRequest, ListConfigurationsAuditRecordsResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListConfigurationsAuditRecordsRequest.class,
                    ListConfigurationsAuditRecordsResponse.class)
                .withName("ListConfigurationsAuditRecords")
                .withUri("/v1/{project_id}/clusters/{cluster_id}/configurations/audit-records")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListConfigurationsAuditRecordsRequest::getClusterId, (req, v) -> {
                req.setClusterId(v);
            }));
        builder.<Long>withRequestField("action_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListConfigurationsAuditRecordsRequest::getActionTime, (req, v) -> {
                req.setActionTime(v);
            }));
        builder.<String>withRequestField("filter_by",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListConfigurationsAuditRecordsRequest::getFilterBy, (req, v) -> {
                req.setFilterBy(v);
            }));
        builder.<String>withRequestField("filter",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListConfigurationsAuditRecordsRequest::getFilter, (req, v) -> {
                req.setFilter(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListConfigurationsAuditRecordsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListConfigurationsAuditRecordsRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListDataSourceRequest, ListDataSourceResponse> listDataSource =
        genForlistDataSource();

    private static HttpRequestDef<ListDataSourceRequest, ListDataSourceResponse> genForlistDataSource() {
        // basic
        HttpRequestDef.Builder<ListDataSourceRequest, ListDataSourceResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListDataSourceRequest.class, ListDataSourceResponse.class)
                .withName("ListDataSource")
                .withUri("/v1.0/{project_id}/clusters/{cluster_id}/ext-data-sources")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDataSourceRequest::getClusterId, (req, v) -> {
                req.setClusterId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListDatabaseUsersRequest, ListDatabaseUsersResponse> listDatabaseUsers =
        genForlistDatabaseUsers();

    private static HttpRequestDef<ListDatabaseUsersRequest, ListDatabaseUsersResponse> genForlistDatabaseUsers() {
        // basic
        HttpRequestDef.Builder<ListDatabaseUsersRequest, ListDatabaseUsersResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListDatabaseUsersRequest.class, ListDatabaseUsersResponse.class)
                .withName("ListDatabaseUsers")
                .withUri("/v1/{project_id}/clusters/{cluster_id}/db-manager/users")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDatabaseUsersRequest::getClusterId, (req, v) -> {
                req.setClusterId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListDisasterRecoverRequest, ListDisasterRecoverResponse> listDisasterRecover =
        genForlistDisasterRecover();

    private static HttpRequestDef<ListDisasterRecoverRequest, ListDisasterRecoverResponse> genForlistDisasterRecover() {
        // basic
        HttpRequestDef.Builder<ListDisasterRecoverRequest, ListDisasterRecoverResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListDisasterRecoverRequest.class, ListDisasterRecoverResponse.class)
                .withName("ListDisasterRecover")
                .withUri("/v2/{project_id}/disaster-recoveries")
                .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListDssPoolsRequest, ListDssPoolsResponse> listDssPools = genForlistDssPools();

    private static HttpRequestDef<ListDssPoolsRequest, ListDssPoolsResponse> genForlistDssPools() {
        // basic
        HttpRequestDef.Builder<ListDssPoolsRequest, ListDssPoolsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListDssPoolsRequest.class, ListDssPoolsResponse.class)
                .withName("ListDssPools")
                .withUri("/v1.0/{project_id}/dss-pools")
                .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListElbsRequest, ListElbsResponse> listElbs = genForlistElbs();

    private static HttpRequestDef<ListElbsRequest, ListElbsResponse> genForlistElbs() {
        // basic
        HttpRequestDef.Builder<ListElbsRequest, ListElbsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListElbsRequest.class, ListElbsResponse.class)
                .withName("ListElbs")
                .withUri("/v2/{project_id}/clusters/{cluster_id}/elbs")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListElbsRequest::getClusterId, (req, v) -> {
                req.setClusterId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListEventSpecsRequest, ListEventSpecsResponse> listEventSpecs =
        genForlistEventSpecs();

    private static HttpRequestDef<ListEventSpecsRequest, ListEventSpecsResponse> genForlistEventSpecs() {
        // basic
        HttpRequestDef.Builder<ListEventSpecsRequest, ListEventSpecsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListEventSpecsRequest.class, ListEventSpecsResponse.class)
                .withName("ListEventSpecs")
                .withUri("/v2/{project_id}/event-specs")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("spec_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListEventSpecsRequest::getSpecName, (req, v) -> {
                req.setSpecName(v);
            }));
        builder.<String>withRequestField("category",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListEventSpecsRequest::getCategory, (req, v) -> {
                req.setCategory(v);
            }));
        builder.<String>withRequestField("severity",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListEventSpecsRequest::getSeverity, (req, v) -> {
                req.setSeverity(v);
            }));
        builder.<String>withRequestField("source_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListEventSpecsRequest::getSourceType, (req, v) -> {
                req.setSourceType(v);
            }));
        builder.<String>withRequestField("tag",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListEventSpecsRequest::getTag, (req, v) -> {
                req.setTag(v);
            }));
        builder.<String>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListEventSpecsRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<String>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListEventSpecsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListEventSubsRequest, ListEventSubsResponse> listEventSubs =
        genForlistEventSubs();

    private static HttpRequestDef<ListEventSubsRequest, ListEventSubsResponse> genForlistEventSubs() {
        // basic
        HttpRequestDef.Builder<ListEventSubsRequest, ListEventSubsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListEventSubsRequest.class, ListEventSubsResponse.class)
                .withName("ListEventSubs")
                .withUri("/v2/{project_id}/event-subs")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListEventSubsRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<String>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListEventSubsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListEventsRequest, ListEventsResponse> listEvents = genForlistEvents();

    private static HttpRequestDef<ListEventsRequest, ListEventsResponse> genForlistEvents() {
        // basic
        HttpRequestDef.Builder<ListEventsRequest, ListEventsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListEventsRequest.class, ListEventsResponse.class)
                .withName("ListEvents")
                .withUri("/v2/{project_id}/events")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListEventsRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<String>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListEventsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListHostDiskRequest, ListHostDiskResponse> listHostDisk = genForlistHostDisk();

    private static HttpRequestDef<ListHostDiskRequest, ListHostDiskResponse> genForlistHostDisk() {
        // basic
        HttpRequestDef.Builder<ListHostDiskRequest, ListHostDiskResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListHostDiskRequest.class, ListHostDiskResponse.class)
                .withName("ListHostDisk")
                .withUri("/v1.0/{project_id}/dms/disk")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListHostDiskRequest::getClusterId, (req, v) -> {
                req.setClusterId(v);
            }));
        builder.<String>withRequestField("instance_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListHostDiskRequest::getInstanceName, (req, v) -> {
                req.setInstanceName(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListHostDiskRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListHostDiskRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));

        // response
        builder.<List<DiskResp>>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListHostDiskResponse::getBody, (response, data) -> {
                response.setBody(data);
            }).withInnerContainerType(DiskResp.class));

        return builder.build();
    }

    public static final HttpRequestDef<ListHostNetRequest, ListHostNetResponse> listHostNet = genForlistHostNet();

    private static HttpRequestDef<ListHostNetRequest, ListHostNetResponse> genForlistHostNet() {
        // basic
        HttpRequestDef.Builder<ListHostNetRequest, ListHostNetResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListHostNetRequest.class, ListHostNetResponse.class)
                .withName("ListHostNet")
                .withUri("/v1.0/{project_id}/dms/net")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListHostNetRequest::getClusterId, (req, v) -> {
                req.setClusterId(v);
            }));
        builder.<String>withRequestField("instance_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListHostNetRequest::getInstanceName, (req, v) -> {
                req.setInstanceName(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListHostNetRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListHostNetRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));

        // response
        builder.<List<NetResp>>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListHostNetResponse::getBody, (response, data) -> {
                response.setBody(data);
            }).withInnerContainerType(NetResp.class));

        return builder.build();
    }

    public static final HttpRequestDef<ListHostOverviewRequest, ListHostOverviewResponse> listHostOverview =
        genForlistHostOverview();

    private static HttpRequestDef<ListHostOverviewRequest, ListHostOverviewResponse> genForlistHostOverview() {
        // basic
        HttpRequestDef.Builder<ListHostOverviewRequest, ListHostOverviewResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListHostOverviewRequest.class, ListHostOverviewResponse.class)
                .withName("ListHostOverview")
                .withUri("/v1.0/{project_id}/dms/host-overview")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListHostOverviewRequest::getClusterId, (req, v) -> {
                req.setClusterId(v);
            }));
        builder.<String>withRequestField("instance_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListHostOverviewRequest::getInstanceName, (req, v) -> {
                req.setInstanceName(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListHostOverviewRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListHostOverviewRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));

        // response
        builder.<List<HostOverviewResponse>>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListHostOverviewResponse::getBody, (response, data) -> {
                response.setBody(data);
            }).withInnerContainerType(HostOverviewResponse.class));

        return builder.build();
    }

    public static final HttpRequestDef<ListJobDetailsRequest, ListJobDetailsResponse> listJobDetails =
        genForlistJobDetails();

    private static HttpRequestDef<ListJobDetailsRequest, ListJobDetailsResponse> genForlistJobDetails() {
        // basic
        HttpRequestDef.Builder<ListJobDetailsRequest, ListJobDetailsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListJobDetailsRequest.class, ListJobDetailsResponse.class)
                .withName("ListJobDetails")
                .withUri("/v1.0/{project_id}/job/{job_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListJobDetailsRequest::getJobId, (req, v) -> {
                req.setJobId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListMonitorIndicatorDataRequest, ListMonitorIndicatorDataResponse> listMonitorIndicatorData =
        genForlistMonitorIndicatorData();

    private static HttpRequestDef<ListMonitorIndicatorDataRequest, ListMonitorIndicatorDataResponse> genForlistMonitorIndicatorData() {
        // basic
        HttpRequestDef.Builder<ListMonitorIndicatorDataRequest, ListMonitorIndicatorDataResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET, ListMonitorIndicatorDataRequest.class, ListMonitorIndicatorDataResponse.class)
                .withName("ListMonitorIndicatorData")
                .withUri("/v1.0/{project_id}/dms/metric-data")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("from",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListMonitorIndicatorDataRequest::getFrom, (req, v) -> {
                req.setFrom(v);
            }));
        builder.<String>withRequestField("to",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListMonitorIndicatorDataRequest::getTo, (req, v) -> {
                req.setTo(v);
            }));
        builder.<String>withRequestField("function",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListMonitorIndicatorDataRequest::getFunction, (req, v) -> {
                req.setFunction(v);
            }));
        builder.<String>withRequestField("period",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListMonitorIndicatorDataRequest::getPeriod, (req, v) -> {
                req.setPeriod(v);
            }));
        builder.<String>withRequestField("indicator_name",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListMonitorIndicatorDataRequest::getIndicatorName, (req, v) -> {
                req.setIndicatorName(v);
            }));
        builder.<String>withRequestField("dim0",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListMonitorIndicatorDataRequest::getDim0, (req, v) -> {
                req.setDim0(v);
            }));
        builder.<String>withRequestField("dim1",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListMonitorIndicatorDataRequest::getDim1, (req, v) -> {
                req.setDim1(v);
            }));

        // response
        builder.<List<TrendQueryDataResp>>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListMonitorIndicatorDataResponse::getBody, (response, data) -> {
                response.setBody(data);
            }).withInnerContainerType(TrendQueryDataResp.class));

        return builder.build();
    }

    public static final HttpRequestDef<ListMonitorIndicatorsRequest, ListMonitorIndicatorsResponse> listMonitorIndicators =
        genForlistMonitorIndicators();

    private static HttpRequestDef<ListMonitorIndicatorsRequest, ListMonitorIndicatorsResponse> genForlistMonitorIndicators() {
        // basic
        HttpRequestDef.Builder<ListMonitorIndicatorsRequest, ListMonitorIndicatorsResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListMonitorIndicatorsRequest.class, ListMonitorIndicatorsResponse.class)
            .withName("ListMonitorIndicators")
            .withUri("/v1.0/{project_id}/dms/metric-data/indicators")
            .withContentType("application/json");

        // requests

        // response
        builder.<List<IndicatorInfo>>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListMonitorIndicatorsResponse::getBody, (response, data) -> {
                response.setBody(data);
            }).withInnerContainerType(IndicatorInfo.class));

        return builder.build();
    }

    public static final HttpRequestDef<ListNodeTypesRequest, ListNodeTypesResponse> listNodeTypes =
        genForlistNodeTypes();

    private static HttpRequestDef<ListNodeTypesRequest, ListNodeTypesResponse> genForlistNodeTypes() {
        // basic
        HttpRequestDef.Builder<ListNodeTypesRequest, ListNodeTypesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListNodeTypesRequest.class, ListNodeTypesResponse.class)
                .withName("ListNodeTypes")
                .withUri("/v2/{project_id}/node-types")
                .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListQuotasRequest, ListQuotasResponse> listQuotas = genForlistQuotas();

    private static HttpRequestDef<ListQuotasRequest, ListQuotasResponse> genForlistQuotas() {
        // basic
        HttpRequestDef.Builder<ListQuotasRequest, ListQuotasResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListQuotasRequest.class, ListQuotasResponse.class)
                .withName("ListQuotas")
                .withUri("/v1.0/{project_id}/quotas")
                .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListSnapshotCrossRegionRequest, ListSnapshotCrossRegionResponse> listSnapshotCrossRegion =
        genForlistSnapshotCrossRegion();

    private static HttpRequestDef<ListSnapshotCrossRegionRequest, ListSnapshotCrossRegionResponse> genForlistSnapshotCrossRegion() {
        // basic
        HttpRequestDef.Builder<ListSnapshotCrossRegionRequest, ListSnapshotCrossRegionResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListSnapshotCrossRegionRequest.class, ListSnapshotCrossRegionResponse.class)
            .withName("ListSnapshotCrossRegion")
            .withUri("/v1/{project_id}/snapshots/cross-regions")
            .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListSnapshotCrossRegionRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListSnapshotCrossRegionRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListSnapshotCrossRegionPolicyRequest, ListSnapshotCrossRegionPolicyResponse> listSnapshotCrossRegionPolicy =
        genForlistSnapshotCrossRegionPolicy();

    private static HttpRequestDef<ListSnapshotCrossRegionPolicyRequest, ListSnapshotCrossRegionPolicyResponse> genForlistSnapshotCrossRegionPolicy() {
        // basic
        HttpRequestDef.Builder<ListSnapshotCrossRegionPolicyRequest, ListSnapshotCrossRegionPolicyResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListSnapshotCrossRegionPolicyRequest.class,
                    ListSnapshotCrossRegionPolicyResponse.class)
                .withName("ListSnapshotCrossRegionPolicy")
                .withUri("/v1/{project_id}/snapshots/cross-region-policies")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSnapshotCrossRegionPolicyRequest::getClusterId, (req, v) -> {
                req.setClusterId(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListSnapshotCrossRegionPolicyRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListSnapshotCrossRegionPolicyRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListSnapshotDetailsRequest, ListSnapshotDetailsResponse> listSnapshotDetails =
        genForlistSnapshotDetails();

    private static HttpRequestDef<ListSnapshotDetailsRequest, ListSnapshotDetailsResponse> genForlistSnapshotDetails() {
        // basic
        HttpRequestDef.Builder<ListSnapshotDetailsRequest, ListSnapshotDetailsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListSnapshotDetailsRequest.class, ListSnapshotDetailsResponse.class)
                .withName("ListSnapshotDetails")
                .withUri("/v1.0/{project_id}/snapshots/{snapshot_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("snapshot_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSnapshotDetailsRequest::getSnapshotId, (req, v) -> {
                req.setSnapshotId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListSnapshotPolicyRequest, ListSnapshotPolicyResponse> listSnapshotPolicy =
        genForlistSnapshotPolicy();

    private static HttpRequestDef<ListSnapshotPolicyRequest, ListSnapshotPolicyResponse> genForlistSnapshotPolicy() {
        // basic
        HttpRequestDef.Builder<ListSnapshotPolicyRequest, ListSnapshotPolicyResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListSnapshotPolicyRequest.class, ListSnapshotPolicyResponse.class)
                .withName("ListSnapshotPolicy")
                .withUri("/v2/{project_id}/clusters/{cluster_id}/snapshot-policies")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSnapshotPolicyRequest::getClusterId, (req, v) -> {
                req.setClusterId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListSnapshotStatisticsRequest, ListSnapshotStatisticsResponse> listSnapshotStatistics =
        genForlistSnapshotStatistics();

    private static HttpRequestDef<ListSnapshotStatisticsRequest, ListSnapshotStatisticsResponse> genForlistSnapshotStatistics() {
        // basic
        HttpRequestDef.Builder<ListSnapshotStatisticsRequest, ListSnapshotStatisticsResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListSnapshotStatisticsRequest.class, ListSnapshotStatisticsResponse.class)
            .withName("ListSnapshotStatistics")
            .withUri("/v1.0/{project_id}/clusters/{cluster_id}/snapshots/statistics")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSnapshotStatisticsRequest::getClusterId, (req, v) -> {
                req.setClusterId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListSnapshotsRequest, ListSnapshotsResponse> listSnapshots =
        genForlistSnapshots();

    private static HttpRequestDef<ListSnapshotsRequest, ListSnapshotsResponse> genForlistSnapshots() {
        // basic
        HttpRequestDef.Builder<ListSnapshotsRequest, ListSnapshotsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListSnapshotsRequest.class, ListSnapshotsResponse.class)
                .withName("ListSnapshots")
                .withUri("/v1.0/{project_id}/snapshots")
                .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListStatisticsRequest, ListStatisticsResponse> listStatistics =
        genForlistStatistics();

    private static HttpRequestDef<ListStatisticsRequest, ListStatisticsResponse> genForlistStatistics() {
        // basic
        HttpRequestDef.Builder<ListStatisticsRequest, ListStatisticsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListStatisticsRequest.class, ListStatisticsResponse.class)
                .withName("ListStatistics")
                .withUri("/v1.0/{project_id}/statistics")
                .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListTagsRequest, ListTagsResponse> listTags = genForlistTags();

    private static HttpRequestDef<ListTagsRequest, ListTagsResponse> genForlistTags() {
        // basic
        HttpRequestDef.Builder<ListTagsRequest, ListTagsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListTagsRequest.class, ListTagsResponse.class)
                .withName("ListTags")
                .withUri("/v1.0/{project_id}/tags")
                .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListUpdatableVersionRequest, ListUpdatableVersionResponse> listUpdatableVersion =
        genForlistUpdatableVersion();

    private static HttpRequestDef<ListUpdatableVersionRequest, ListUpdatableVersionResponse> genForlistUpdatableVersion() {
        // basic
        HttpRequestDef.Builder<ListUpdatableVersionRequest, ListUpdatableVersionResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListUpdatableVersionRequest.class, ListUpdatableVersionResponse.class)
            .withName("ListUpdatableVersion")
            .withUri("/v1/{project_id}/clusters/{cluster_id}/upgrade-management/avail-versions")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListUpdatableVersionRequest::getClusterId, (req, v) -> {
                req.setClusterId(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListUpdatableVersionRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListUpdatableVersionRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListUpdateRecordRequest, ListUpdateRecordResponse> listUpdateRecord =
        genForlistUpdateRecord();

    private static HttpRequestDef<ListUpdateRecordRequest, ListUpdateRecordResponse> genForlistUpdateRecord() {
        // basic
        HttpRequestDef.Builder<ListUpdateRecordRequest, ListUpdateRecordResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListUpdateRecordRequest.class, ListUpdateRecordResponse.class)
                .withName("ListUpdateRecord")
                .withUri("/v1/{project_id}/clusters/{cluster_id}/upgrade-management/records")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListUpdateRecordRequest::getClusterId, (req, v) -> {
                req.setClusterId(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListUpdateRecordRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListUpdateRecordRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListWorkloadQueueRequest, ListWorkloadQueueResponse> listWorkloadQueue =
        genForlistWorkloadQueue();

    private static HttpRequestDef<ListWorkloadQueueRequest, ListWorkloadQueueResponse> genForlistWorkloadQueue() {
        // basic
        HttpRequestDef.Builder<ListWorkloadQueueRequest, ListWorkloadQueueResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListWorkloadQueueRequest.class, ListWorkloadQueueResponse.class)
                .withName("ListWorkloadQueue")
                .withUri("/v2/{project_id}/clusters/{cluster_id}/workload/queues")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListWorkloadQueueRequest::getClusterId, (req, v) -> {
                req.setClusterId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<PauseDisasterRecoveryRequest, PauseDisasterRecoveryResponse> pauseDisasterRecovery =
        genForpauseDisasterRecovery();

    private static HttpRequestDef<PauseDisasterRecoveryRequest, PauseDisasterRecoveryResponse> genForpauseDisasterRecovery() {
        // basic
        HttpRequestDef.Builder<PauseDisasterRecoveryRequest, PauseDisasterRecoveryResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, PauseDisasterRecoveryRequest.class, PauseDisasterRecoveryResponse.class)
            .withName("PauseDisasterRecovery")
            .withUri("/v2/{project_id}/disaster-recovery/{disaster_recovery_id}/pause")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("disaster_recovery_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(PauseDisasterRecoveryRequest::getDisasterRecoveryId, (req, v) -> {
                req.setDisasterRecoveryId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ResetPasswordRequest, ResetPasswordResponse> resetPassword =
        genForresetPassword();

    private static HttpRequestDef<ResetPasswordRequest, ResetPasswordResponse> genForresetPassword() {
        // basic
        HttpRequestDef.Builder<ResetPasswordRequest, ResetPasswordResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ResetPasswordRequest.class, ResetPasswordResponse.class)
                .withName("ResetPassword")
                .withUri("/v1.0/{project_id}/clusters/{cluster_id}/reset-password")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ResetPasswordRequest::getClusterId, (req, v) -> {
                req.setClusterId(v);
            }));
        builder.<ResetPasswordRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ResetPasswordRequestBody.class),
            f -> f.withMarshaller(ResetPasswordRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ResizeClusterRequest, ResizeClusterResponse> resizeCluster =
        genForresizeCluster();

    private static HttpRequestDef<ResizeClusterRequest, ResizeClusterResponse> genForresizeCluster() {
        // basic
        HttpRequestDef.Builder<ResizeClusterRequest, ResizeClusterResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ResizeClusterRequest.class, ResizeClusterResponse.class)
                .withName("ResizeCluster")
                .withUri("/v1.0/{project_id}/clusters/{cluster_id}/resize")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ResizeClusterRequest::getClusterId, (req, v) -> {
                req.setClusterId(v);
            }));
        builder.<ResizeClusterRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ResizeClusterRequestBody.class),
            f -> f.withMarshaller(ResizeClusterRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RestartClusterRequest, RestartClusterResponse> restartCluster =
        genForrestartCluster();

    private static HttpRequestDef<RestartClusterRequest, RestartClusterResponse> genForrestartCluster() {
        // basic
        HttpRequestDef.Builder<RestartClusterRequest, RestartClusterResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, RestartClusterRequest.class, RestartClusterResponse.class)
                .withName("RestartCluster")
                .withUri("/v1.0/{project_id}/clusters/{cluster_id}/restart")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(RestartClusterRequest::getClusterId, (req, v) -> {
                req.setClusterId(v);
            }));
        builder.<RestartClusterRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RestartClusterRequestBody.class),
            f -> f.withMarshaller(RestartClusterRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RestoreClusterRequest, RestoreClusterResponse> restoreCluster =
        genForrestoreCluster();

    private static HttpRequestDef<RestoreClusterRequest, RestoreClusterResponse> genForrestoreCluster() {
        // basic
        HttpRequestDef.Builder<RestoreClusterRequest, RestoreClusterResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, RestoreClusterRequest.class, RestoreClusterResponse.class)
                .withName("RestoreCluster")
                .withUri("/v1.0/{project_id}/snapshots/{snapshot_id}/actions")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("snapshot_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(RestoreClusterRequest::getSnapshotId, (req, v) -> {
                req.setSnapshotId(v);
            }));
        builder.<RestoreClusterRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RestoreClusterRequestBody.class),
            f -> f.withMarshaller(RestoreClusterRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RestoreDisasterRequest, RestoreDisasterResponse> restoreDisaster =
        genForrestoreDisaster();

    private static HttpRequestDef<RestoreDisasterRequest, RestoreDisasterResponse> genForrestoreDisaster() {
        // basic
        HttpRequestDef.Builder<RestoreDisasterRequest, RestoreDisasterResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, RestoreDisasterRequest.class, RestoreDisasterResponse.class)
                .withName("RestoreDisaster")
                .withUri("/v2/{project_id}/disaster-recovery/{disaster_recovery_id}/recovery")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("disaster_recovery_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(RestoreDisasterRequest::getDisasterRecoveryId, (req, v) -> {
                req.setDisasterRecoveryId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RestoreTableRequest, RestoreTableResponse> restoreTable = genForrestoreTable();

    private static HttpRequestDef<RestoreTableRequest, RestoreTableResponse> genForrestoreTable() {
        // basic
        HttpRequestDef.Builder<RestoreTableRequest, RestoreTableResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, RestoreTableRequest.class, RestoreTableResponse.class)
                .withName("RestoreTable")
                .withUri("/v1/{project_id}/snapshots/{snapshot_id}/table-restore")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("snapshot_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(RestoreTableRequest::getSnapshotId, (req, v) -> {
                req.setSnapshotId(v);
            }));
        builder.<RestoreTableRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RestoreTableRequestBody.class),
            f -> f.withMarshaller(RestoreTableRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<SaveClusterDescriptionInfoRequest, SaveClusterDescriptionInfoResponse> saveClusterDescriptionInfo =
        genForsaveClusterDescriptionInfo();

    private static HttpRequestDef<SaveClusterDescriptionInfoRequest, SaveClusterDescriptionInfoResponse> genForsaveClusterDescriptionInfo() {
        // basic
        HttpRequestDef.Builder<SaveClusterDescriptionInfoRequest, SaveClusterDescriptionInfoResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    SaveClusterDescriptionInfoRequest.class,
                    SaveClusterDescriptionInfoResponse.class)
                .withName("SaveClusterDescriptionInfo")
                .withUri("/v1/{project_id}/clusters/{cluster_id}/description")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SaveClusterDescriptionInfoRequest::getClusterId, (req, v) -> {
                req.setClusterId(v);
            }));
        builder.<String>withRequestField("namespace",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SaveClusterDescriptionInfoRequest::getNamespace, (req, v) -> {
                req.setNamespace(v);
            }));
        builder.<ClusterDescriptionInfo>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ClusterDescriptionInfo.class),
            f -> f.withMarshaller(SaveClusterDescriptionInfoRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowClusterRedistributionRequest, ShowClusterRedistributionResponse> showClusterRedistribution =
        genForshowClusterRedistribution();

    private static HttpRequestDef<ShowClusterRedistributionRequest, ShowClusterRedistributionResponse> genForshowClusterRedistribution() {
        // basic
        HttpRequestDef.Builder<ShowClusterRedistributionRequest, ShowClusterRedistributionResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ShowClusterRedistributionRequest.class,
                    ShowClusterRedistributionResponse.class)
                .withName("ShowClusterRedistribution")
                .withUri("/v2/{project_id}/clusters/{cluster_id}/redistribution")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowClusterRedistributionRequest::getClusterId, (req, v) -> {
                req.setClusterId(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowClusterRedistributionRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowClusterRedistributionRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<String>withRequestField("db_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowClusterRedistributionRequest::getDbName, (req, v) -> {
                req.setDbName(v);
            }));
        builder.<String>withRequestField("table_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowClusterRedistributionRequest::getTableName, (req, v) -> {
                req.setTableName(v);
            }));
        builder.<String>withRequestField("type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowClusterRedistributionRequest::getType, (req, v) -> {
                req.setType(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowDatabaseAuthorityRequest, ShowDatabaseAuthorityResponse> showDatabaseAuthority =
        genForshowDatabaseAuthority();

    private static HttpRequestDef<ShowDatabaseAuthorityRequest, ShowDatabaseAuthorityResponse> genForshowDatabaseAuthority() {
        // basic
        HttpRequestDef.Builder<ShowDatabaseAuthorityRequest, ShowDatabaseAuthorityResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowDatabaseAuthorityRequest.class, ShowDatabaseAuthorityResponse.class)
            .withName("ShowDatabaseAuthority")
            .withUri("/v1/{project_id}/clusters/{cluster_id}/db-manager/authority")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDatabaseAuthorityRequest::getClusterId, (req, v) -> {
                req.setClusterId(v);
            }));
        builder.<String>withRequestField("type",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDatabaseAuthorityRequest::getType, (req, v) -> {
                req.setType(v);
            }));
        builder.<List<String>>withRequestField("name",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ShowDatabaseAuthorityRequest::getName, (req, v) -> {
                req.setName(v);
            }));
        builder.<String>withRequestField("database",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDatabaseAuthorityRequest::getDatabase, (req, v) -> {
                req.setDatabase(v);
            }));
        builder.<String>withRequestField("schema",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDatabaseAuthorityRequest::getSchema, (req, v) -> {
                req.setSchema(v);
            }));
        builder.<String>withRequestField("table",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDatabaseAuthorityRequest::getTable, (req, v) -> {
                req.setTable(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowDatabaseOmUserStatusRequest, ShowDatabaseOmUserStatusResponse> showDatabaseOmUserStatus =
        genForshowDatabaseOmUserStatus();

    private static HttpRequestDef<ShowDatabaseOmUserStatusRequest, ShowDatabaseOmUserStatusResponse> genForshowDatabaseOmUserStatus() {
        // basic
        HttpRequestDef.Builder<ShowDatabaseOmUserStatusRequest, ShowDatabaseOmUserStatusResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET, ShowDatabaseOmUserStatusRequest.class, ShowDatabaseOmUserStatusResponse.class)
                .withName("ShowDatabaseOmUserStatus")
                .withUri("/v1/{project_id}/clusters/{cluster_id}/db-manager/om-user/status")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDatabaseOmUserStatusRequest::getClusterId, (req, v) -> {
                req.setClusterId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowDatabaseUserRequest, ShowDatabaseUserResponse> showDatabaseUser =
        genForshowDatabaseUser();

    private static HttpRequestDef<ShowDatabaseUserRequest, ShowDatabaseUserResponse> genForshowDatabaseUser() {
        // basic
        HttpRequestDef.Builder<ShowDatabaseUserRequest, ShowDatabaseUserResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowDatabaseUserRequest.class, ShowDatabaseUserResponse.class)
                .withName("ShowDatabaseUser")
                .withUri("/v1/{project_id}/clusters/{cluster_id}/db-manager/users/{name}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDatabaseUserRequest::getClusterId, (req, v) -> {
                req.setClusterId(v);
            }));
        builder.<String>withRequestField("name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDatabaseUserRequest::getName, (req, v) -> {
                req.setName(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowDisasterDetailRequest, ShowDisasterDetailResponse> showDisasterDetail =
        genForshowDisasterDetail();

    private static HttpRequestDef<ShowDisasterDetailRequest, ShowDisasterDetailResponse> genForshowDisasterDetail() {
        // basic
        HttpRequestDef.Builder<ShowDisasterDetailRequest, ShowDisasterDetailResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowDisasterDetailRequest.class, ShowDisasterDetailResponse.class)
                .withName("ShowDisasterDetail")
                .withUri("/v2/{project_id}/disaster-recovery/{disaster_recovery_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("disaster_recovery_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDisasterDetailRequest::getDisasterRecoveryId, (req, v) -> {
                req.setDisasterRecoveryId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowDisasterProgressRequest, ShowDisasterProgressResponse> showDisasterProgress =
        genForshowDisasterProgress();

    private static HttpRequestDef<ShowDisasterProgressRequest, ShowDisasterProgressResponse> genForshowDisasterProgress() {
        // basic
        HttpRequestDef.Builder<ShowDisasterProgressRequest, ShowDisasterProgressResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowDisasterProgressRequest.class, ShowDisasterProgressResponse.class)
            .withName("ShowDisasterProgress")
            .withUri("/v1/{project_id}/disaster-recovery/{disaster_recovery_id}/show-progress")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("disaster_recovery_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDisasterProgressRequest::getDisasterRecoveryId, (req, v) -> {
                req.setDisasterRecoveryId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowInstanceRequest, ShowInstanceResponse> showInstance = genForshowInstance();

    private static HttpRequestDef<ShowInstanceRequest, ShowInstanceResponse> genForshowInstance() {
        // basic
        HttpRequestDef.Builder<ShowInstanceRequest, ShowInstanceResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowInstanceRequest.class, ShowInstanceResponse.class)
                .withName("ShowInstance")
                .withUri("/v2/{project_id}/instances/{instance_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowInstanceRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowWorkloadPlanRequest, ShowWorkloadPlanResponse> showWorkloadPlan =
        genForshowWorkloadPlan();

    private static HttpRequestDef<ShowWorkloadPlanRequest, ShowWorkloadPlanResponse> genForshowWorkloadPlan() {
        // basic
        HttpRequestDef.Builder<ShowWorkloadPlanRequest, ShowWorkloadPlanResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowWorkloadPlanRequest.class, ShowWorkloadPlanResponse.class)
                .withName("ShowWorkloadPlan")
                .withUri("/v2/{project_id}/clusters/{cluster_id}/workload/plans/{plan_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowWorkloadPlanRequest::getClusterId, (req, v) -> {
                req.setClusterId(v);
            }));
        builder.<String>withRequestField("plan_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowWorkloadPlanRequest::getPlanId, (req, v) -> {
                req.setPlanId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShrinkClusterRequest, ShrinkClusterResponse> shrinkCluster =
        genForshrinkCluster();

    private static HttpRequestDef<ShrinkClusterRequest, ShrinkClusterResponse> genForshrinkCluster() {
        // basic
        HttpRequestDef.Builder<ShrinkClusterRequest, ShrinkClusterResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ShrinkClusterRequest.class, ShrinkClusterResponse.class)
                .withName("ShrinkCluster")
                .withUri("/v1.0/{project_id}/clusters/{cluster_id}/cluster-shrink")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShrinkClusterRequest::getClusterId, (req, v) -> {
                req.setClusterId(v);
            }));
        builder.<ClusterShrinkReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ClusterShrinkReq.class),
            f -> f.withMarshaller(ShrinkClusterRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<StartDisasterRecoveryRequest, StartDisasterRecoveryResponse> startDisasterRecovery =
        genForstartDisasterRecovery();

    private static HttpRequestDef<StartDisasterRecoveryRequest, StartDisasterRecoveryResponse> genForstartDisasterRecovery() {
        // basic
        HttpRequestDef.Builder<StartDisasterRecoveryRequest, StartDisasterRecoveryResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, StartDisasterRecoveryRequest.class, StartDisasterRecoveryResponse.class)
            .withName("StartDisasterRecovery")
            .withUri("/v2/{project_id}/disaster-recovery/{disaster_recovery_id}/start")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("disaster_recovery_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(StartDisasterRecoveryRequest::getDisasterRecoveryId, (req, v) -> {
                req.setDisasterRecoveryId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<StartWorkloadPlanRequest, StartWorkloadPlanResponse> startWorkloadPlan =
        genForstartWorkloadPlan();

    private static HttpRequestDef<StartWorkloadPlanRequest, StartWorkloadPlanResponse> genForstartWorkloadPlan() {
        // basic
        HttpRequestDef.Builder<StartWorkloadPlanRequest, StartWorkloadPlanResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, StartWorkloadPlanRequest.class, StartWorkloadPlanResponse.class)
                .withName("StartWorkloadPlan")
                .withUri("/v2/{project_id}/clusters/{cluster_id}/workload/plans/{plan_id}/start")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(StartWorkloadPlanRequest::getClusterId, (req, v) -> {
                req.setClusterId(v);
            }));
        builder.<String>withRequestField("plan_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(StartWorkloadPlanRequest::getPlanId, (req, v) -> {
                req.setPlanId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<StopWorkloadPlanRequest, StopWorkloadPlanResponse> stopWorkloadPlan =
        genForstopWorkloadPlan();

    private static HttpRequestDef<StopWorkloadPlanRequest, StopWorkloadPlanResponse> genForstopWorkloadPlan() {
        // basic
        HttpRequestDef.Builder<StopWorkloadPlanRequest, StopWorkloadPlanResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, StopWorkloadPlanRequest.class, StopWorkloadPlanResponse.class)
                .withName("StopWorkloadPlan")
                .withUri("/v2/{project_id}/clusters/{cluster_id}/workload/plans/{plan_id}/stop")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(StopWorkloadPlanRequest::getClusterId, (req, v) -> {
                req.setClusterId(v);
            }));
        builder.<String>withRequestField("plan_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(StopWorkloadPlanRequest::getPlanId, (req, v) -> {
                req.setPlanId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<SwitchFailoverDisasterRequest, SwitchFailoverDisasterResponse> switchFailoverDisaster =
        genForswitchFailoverDisaster();

    private static HttpRequestDef<SwitchFailoverDisasterRequest, SwitchFailoverDisasterResponse> genForswitchFailoverDisaster() {
        // basic
        HttpRequestDef.Builder<SwitchFailoverDisasterRequest, SwitchFailoverDisasterResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, SwitchFailoverDisasterRequest.class, SwitchFailoverDisasterResponse.class)
            .withName("SwitchFailoverDisaster")
            .withUri("/v2/{project_id}/disaster-recovery/{disaster_recovery_id}/failover")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("disaster_recovery_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SwitchFailoverDisasterRequest::getDisasterRecoveryId, (req, v) -> {
                req.setDisasterRecoveryId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<SwitchOverClusterRequest, SwitchOverClusterResponse> switchOverCluster =
        genForswitchOverCluster();

    private static HttpRequestDef<SwitchOverClusterRequest, SwitchOverClusterResponse> genForswitchOverCluster() {
        // basic
        HttpRequestDef.Builder<SwitchOverClusterRequest, SwitchOverClusterResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, SwitchOverClusterRequest.class, SwitchOverClusterResponse.class)
                .withName("SwitchOverCluster")
                .withUri("/v1.0/{project_id}/clusters/{cluster_id}/switchover")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SwitchOverClusterRequest::getClusterId, (req, v) -> {
                req.setClusterId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<SwitchoverDisasterRecoveryRequest, SwitchoverDisasterRecoveryResponse> switchoverDisasterRecovery =
        genForswitchoverDisasterRecovery();

    private static HttpRequestDef<SwitchoverDisasterRecoveryRequest, SwitchoverDisasterRecoveryResponse> genForswitchoverDisasterRecovery() {
        // basic
        HttpRequestDef.Builder<SwitchoverDisasterRecoveryRequest, SwitchoverDisasterRecoveryResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    SwitchoverDisasterRecoveryRequest.class,
                    SwitchoverDisasterRecoveryResponse.class)
                .withName("SwitchoverDisasterRecovery")
                .withUri("/v2/{project_id}/disaster-recovery/{disaster_recovery_id}/switchover")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("disaster_recovery_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SwitchoverDisasterRecoveryRequest::getDisasterRecoveryId, (req, v) -> {
                req.setDisasterRecoveryId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<SyncIamUsersRequest, SyncIamUsersResponse> syncIamUsers = genForsyncIamUsers();

    private static HttpRequestDef<SyncIamUsersRequest, SyncIamUsersResponse> genForsyncIamUsers() {
        // basic
        HttpRequestDef.Builder<SyncIamUsersRequest, SyncIamUsersResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, SyncIamUsersRequest.class, SyncIamUsersResponse.class)
                .withName("SyncIamUsers")
                .withUri("/v1/{project_id}/clusters/{cluster_id}/db-manager/sync-iam-user")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SyncIamUsersRequest::getClusterId, (req, v) -> {
                req.setClusterId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateAlarmSubRequest, UpdateAlarmSubResponse> updateAlarmSub =
        genForupdateAlarmSub();

    private static HttpRequestDef<UpdateAlarmSubRequest, UpdateAlarmSubResponse> genForupdateAlarmSub() {
        // basic
        HttpRequestDef.Builder<UpdateAlarmSubRequest, UpdateAlarmSubResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateAlarmSubRequest.class, UpdateAlarmSubResponse.class)
                .withName("UpdateAlarmSub")
                .withUri("/v2/{project_id}/alarm-subs/{alarm_sub_id}")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("alarm_sub_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateAlarmSubRequest::getAlarmSubId, (req, v) -> {
                req.setAlarmSubId(v);
            }));
        builder.<AlarmSubUpdateRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(AlarmSubUpdateRequest.class),
            f -> f.withMarshaller(UpdateAlarmSubRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateClusterDnsRequest, UpdateClusterDnsResponse> updateClusterDns =
        genForupdateClusterDns();

    private static HttpRequestDef<UpdateClusterDnsRequest, UpdateClusterDnsResponse> genForupdateClusterDns() {
        // basic
        HttpRequestDef.Builder<UpdateClusterDnsRequest, UpdateClusterDnsResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateClusterDnsRequest.class, UpdateClusterDnsResponse.class)
                .withName("UpdateClusterDns")
                .withUri("/v1.0/{project_id}/clusters/{cluster_id}/dns")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateClusterDnsRequest::getClusterId, (req, v) -> {
                req.setClusterId(v);
            }));
        builder.<ModifyClusterDns>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ModifyClusterDns.class),
            f -> f.withMarshaller(UpdateClusterDnsRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateConfigurationRequest, UpdateConfigurationResponse> updateConfiguration =
        genForupdateConfiguration();

    private static HttpRequestDef<UpdateConfigurationRequest, UpdateConfigurationResponse> genForupdateConfiguration() {
        // basic
        HttpRequestDef.Builder<UpdateConfigurationRequest, UpdateConfigurationResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateConfigurationRequest.class, UpdateConfigurationResponse.class)
                .withName("UpdateConfiguration")
                .withUri("/v2/{project_id}/clusters/{cluster_id}/configurations/{configuration_id}")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateConfigurationRequest::getClusterId, (req, v) -> {
                req.setClusterId(v);
            }));
        builder.<String>withRequestField("configuration_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateConfigurationRequest::getConfigurationId, (req, v) -> {
                req.setConfigurationId(v);
            }));
        builder.<ConfigurationParameterValues>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ConfigurationParameterValues.class),
            f -> f.withMarshaller(UpdateConfigurationRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateDataSourceRequest, UpdateDataSourceResponse> updateDataSource =
        genForupdateDataSource();

    private static HttpRequestDef<UpdateDataSourceRequest, UpdateDataSourceResponse> genForupdateDataSource() {
        // basic
        HttpRequestDef.Builder<UpdateDataSourceRequest, UpdateDataSourceResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateDataSourceRequest.class, UpdateDataSourceResponse.class)
                .withName("UpdateDataSource")
                .withUri("/v1.0/{project_id}/clusters/{cluster_id}/ext-data-sources/{ext_data_source_id}")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateDataSourceRequest::getClusterId, (req, v) -> {
                req.setClusterId(v);
            }));
        builder.<String>withRequestField("ext_data_source_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateDataSourceRequest::getExtDataSourceId, (req, v) -> {
                req.setExtDataSourceId(v);
            }));
        builder.<ReconfigureExtDataSourceActionReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ReconfigureExtDataSourceActionReq.class),
            f -> f.withMarshaller(UpdateDataSourceRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateDatabaseAuthorityRequest, UpdateDatabaseAuthorityResponse> updateDatabaseAuthority =
        genForupdateDatabaseAuthority();

    private static HttpRequestDef<UpdateDatabaseAuthorityRequest, UpdateDatabaseAuthorityResponse> genForupdateDatabaseAuthority() {
        // basic
        HttpRequestDef.Builder<UpdateDatabaseAuthorityRequest, UpdateDatabaseAuthorityResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, UpdateDatabaseAuthorityRequest.class, UpdateDatabaseAuthorityResponse.class)
            .withName("UpdateDatabaseAuthority")
            .withUri("/v1/{project_id}/clusters/{cluster_id}/db-manager/authority")
            .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateDatabaseAuthorityRequest::getClusterId, (req, v) -> {
                req.setClusterId(v);
            }));
        builder.<DatabasePermissionReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(DatabasePermissionReq.class),
            f -> f.withMarshaller(UpdateDatabaseAuthorityRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateDatabaseUserInfoRequest, UpdateDatabaseUserInfoResponse> updateDatabaseUserInfo =
        genForupdateDatabaseUserInfo();

    private static HttpRequestDef<UpdateDatabaseUserInfoRequest, UpdateDatabaseUserInfoResponse> genForupdateDatabaseUserInfo() {
        // basic
        HttpRequestDef.Builder<UpdateDatabaseUserInfoRequest, UpdateDatabaseUserInfoResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, UpdateDatabaseUserInfoRequest.class, UpdateDatabaseUserInfoResponse.class)
            .withName("UpdateDatabaseUserInfo")
            .withUri("/v1/{project_id}/clusters/{cluster_id}/db-manager/users/{name}")
            .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateDatabaseUserInfoRequest::getClusterId, (req, v) -> {
                req.setClusterId(v);
            }));
        builder.<String>withRequestField("name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateDatabaseUserInfoRequest::getName, (req, v) -> {
                req.setName(v);
            }));
        builder.<DatabaseUserInfoReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(DatabaseUserInfoReq.class),
            f -> f.withMarshaller(UpdateDatabaseUserInfoRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateDisasterInfoRequest, UpdateDisasterInfoResponse> updateDisasterInfo =
        genForupdateDisasterInfo();

    private static HttpRequestDef<UpdateDisasterInfoRequest, UpdateDisasterInfoResponse> genForupdateDisasterInfo() {
        // basic
        HttpRequestDef.Builder<UpdateDisasterInfoRequest, UpdateDisasterInfoResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateDisasterInfoRequest.class, UpdateDisasterInfoResponse.class)
                .withName("UpdateDisasterInfo")
                .withUri("/v2/{project_id}/disaster-recovery/{disaster_recovery_id}")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("disaster_recovery_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateDisasterInfoRequest::getDisasterRecoveryId, (req, v) -> {
                req.setDisasterRecoveryId(v);
            }));
        builder.<UpdateDisasterRecoveryRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(UpdateDisasterRecoveryRequest.class),
            f -> f.withMarshaller(UpdateDisasterInfoRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateEventSubRequest, UpdateEventSubResponse> updateEventSub =
        genForupdateEventSub();

    private static HttpRequestDef<UpdateEventSubRequest, UpdateEventSubResponse> genForupdateEventSub() {
        // basic
        HttpRequestDef.Builder<UpdateEventSubRequest, UpdateEventSubResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateEventSubRequest.class, UpdateEventSubResponse.class)
                .withName("UpdateEventSub")
                .withUri("/v2/{project_id}/event-subs/{event_sub_id}")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("event_sub_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateEventSubRequest::getEventSubId, (req, v) -> {
                req.setEventSubId(v);
            }));
        builder.<EventSubUpdateRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(EventSubUpdateRequest.class),
            f -> f.withMarshaller(UpdateEventSubRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateMaintenanceWindowRequest, UpdateMaintenanceWindowResponse> updateMaintenanceWindow =
        genForupdateMaintenanceWindow();

    private static HttpRequestDef<UpdateMaintenanceWindowRequest, UpdateMaintenanceWindowResponse> genForupdateMaintenanceWindow() {
        // basic
        HttpRequestDef.Builder<UpdateMaintenanceWindowRequest, UpdateMaintenanceWindowResponse> builder = HttpRequestDef
            .builder(HttpMethod.PUT, UpdateMaintenanceWindowRequest.class, UpdateMaintenanceWindowResponse.class)
            .withName("UpdateMaintenanceWindow")
            .withUri("/v1.0/{project_id}/clusters/{cluster_id}/maintenance-window")
            .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateMaintenanceWindowRequest::getClusterId, (req, v) -> {
                req.setClusterId(v);
            }));
        builder.<MaintenanceWindow>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(MaintenanceWindow.class),
            f -> f.withMarshaller(UpdateMaintenanceWindowRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

}
