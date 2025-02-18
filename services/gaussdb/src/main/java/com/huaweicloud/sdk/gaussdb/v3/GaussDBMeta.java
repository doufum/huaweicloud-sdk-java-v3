package com.huaweicloud.sdk.gaussdb.v3;

import com.huaweicloud.sdk.core.TypeCasts;
import com.huaweicloud.sdk.core.http.FieldExistence;
import com.huaweicloud.sdk.core.http.HttpMethod;
import com.huaweicloud.sdk.core.http.HttpRequestDef;
import com.huaweicloud.sdk.core.http.LocationType;
import com.huaweicloud.sdk.gaussdb.v3.model.AddDatabasePermissionRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.AddDatabasePermissionResponse;
import com.huaweicloud.sdk.gaussdb.v3.model.ApplyConfigurationRequestBody;
import com.huaweicloud.sdk.gaussdb.v3.model.BackupEncryptRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.BatchOperateInstanceTagRequestBody;
import com.huaweicloud.sdk.gaussdb.v3.model.BatchTagActionRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.BatchTagActionResponse;
import com.huaweicloud.sdk.gaussdb.v3.model.CancelGaussMySqlInstanceEipRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.CancelGaussMySqlInstanceEipResponse;
import com.huaweicloud.sdk.gaussdb.v3.model.CancelScheduleTask;
import com.huaweicloud.sdk.gaussdb.v3.model.CancelScheduleTaskRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.CancelScheduleTaskResponse;
import com.huaweicloud.sdk.gaussdb.v3.model.ChangeGaussMySqlInstanceSpecificationRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.ChangeGaussMySqlInstanceSpecificationResponse;
import com.huaweicloud.sdk.gaussdb.v3.model.ChangeGaussMySqlProxySpecificationRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.ChangeGaussMySqlProxySpecificationResponse;
import com.huaweicloud.sdk.gaussdb.v3.model.CheckResourceRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.CheckResourceRequestBody;
import com.huaweicloud.sdk.gaussdb.v3.model.CheckResourceResponse;
import com.huaweicloud.sdk.gaussdb.v3.model.CloseMysqlProxyRequestBody;
import com.huaweicloud.sdk.gaussdb.v3.model.CopyConfigurationsRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.CopyConfigurationsRequestBody;
import com.huaweicloud.sdk.gaussdb.v3.model.CopyConfigurationsResponse;
import com.huaweicloud.sdk.gaussdb.v3.model.CopyInstanceConfigurationsRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.CopyInstanceConfigurationsRequestBody;
import com.huaweicloud.sdk.gaussdb.v3.model.CopyInstanceConfigurationsResponse;
import com.huaweicloud.sdk.gaussdb.v3.model.CreateAccessControlRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.CreateAccessControlRequestBody;
import com.huaweicloud.sdk.gaussdb.v3.model.CreateAccessControlResponse;
import com.huaweicloud.sdk.gaussdb.v3.model.CreateConfigurationRequestBody;
import com.huaweicloud.sdk.gaussdb.v3.model.CreateDatabaseUserRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.CreateDnsNameReq;
import com.huaweicloud.sdk.gaussdb.v3.model.CreateGaussMySqlBackupRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.CreateGaussMySqlBackupResponse;
import com.huaweicloud.sdk.gaussdb.v3.model.CreateGaussMySqlConfigurationRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.CreateGaussMySqlConfigurationResponse;
import com.huaweicloud.sdk.gaussdb.v3.model.CreateGaussMySqlDatabaseRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.CreateGaussMySqlDatabaseRequestBody;
import com.huaweicloud.sdk.gaussdb.v3.model.CreateGaussMySqlDatabaseResponse;
import com.huaweicloud.sdk.gaussdb.v3.model.CreateGaussMySqlDatabaseUserRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.CreateGaussMySqlDatabaseUserResponse;
import com.huaweicloud.sdk.gaussdb.v3.model.CreateGaussMySqlInstanceRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.CreateGaussMySqlInstanceResponse;
import com.huaweicloud.sdk.gaussdb.v3.model.CreateGaussMySqlProxyRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.CreateGaussMySqlProxyResponse;
import com.huaweicloud.sdk.gaussdb.v3.model.CreateGaussMySqlReadonlyNodeRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.CreateGaussMySqlReadonlyNodeResponse;
import com.huaweicloud.sdk.gaussdb.v3.model.CreateGaussMysqlDnsRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.CreateGaussMysqlDnsResponse;
import com.huaweicloud.sdk.gaussdb.v3.model.CreateRestoreTablesRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.CreateRestoreTablesRequestBody;
import com.huaweicloud.sdk.gaussdb.v3.model.CreateRestoreTablesResponse;
import com.huaweicloud.sdk.gaussdb.v3.model.DeleteDatabasePermissionRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.DeleteDatabasePermissionRequestBody;
import com.huaweicloud.sdk.gaussdb.v3.model.DeleteDatabasePermissionResponse;
import com.huaweicloud.sdk.gaussdb.v3.model.DeleteDatabaseUserRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.DeleteGaussMySqlBackupRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.DeleteGaussMySqlBackupResponse;
import com.huaweicloud.sdk.gaussdb.v3.model.DeleteGaussMySqlConfigurationRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.DeleteGaussMySqlConfigurationResponse;
import com.huaweicloud.sdk.gaussdb.v3.model.DeleteGaussMySqlDatabaseRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.DeleteGaussMySqlDatabaseRequestBody;
import com.huaweicloud.sdk.gaussdb.v3.model.DeleteGaussMySqlDatabaseResponse;
import com.huaweicloud.sdk.gaussdb.v3.model.DeleteGaussMySqlDatabaseUserRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.DeleteGaussMySqlDatabaseUserResponse;
import com.huaweicloud.sdk.gaussdb.v3.model.DeleteGaussMySqlInstanceRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.DeleteGaussMySqlInstanceResponse;
import com.huaweicloud.sdk.gaussdb.v3.model.DeleteGaussMySqlProxyRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.DeleteGaussMySqlProxyResponse;
import com.huaweicloud.sdk.gaussdb.v3.model.DeleteGaussMySqlReadonlyNodeRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.DeleteGaussMySqlReadonlyNodeResponse;
import com.huaweicloud.sdk.gaussdb.v3.model.DeleteScheduleTasKRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.DeleteScheduleTasKRequestBody;
import com.huaweicloud.sdk.gaussdb.v3.model.DeleteScheduleTasKResponse;
import com.huaweicloud.sdk.gaussdb.v3.model.DeleteSqlFilterRuleReq;
import com.huaweicloud.sdk.gaussdb.v3.model.DeleteSqlFilterRuleRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.DeleteSqlFilterRuleResponse;
import com.huaweicloud.sdk.gaussdb.v3.model.DeleteTaskRecordRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.DeleteTaskRecordResponse;
import com.huaweicloud.sdk.gaussdb.v3.model.DescribeBackupEncryptStatusRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.DescribeBackupEncryptStatusResponse;
import com.huaweicloud.sdk.gaussdb.v3.model.EnlargeProxyRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.ExpandGaussMySqlInstanceVolumeRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.ExpandGaussMySqlInstanceVolumeResponse;
import com.huaweicloud.sdk.gaussdb.v3.model.ExpandGaussMySqlProxyRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.ExpandGaussMySqlProxyResponse;
import com.huaweicloud.sdk.gaussdb.v3.model.GrantDatabasePermissionRequestBody;
import com.huaweicloud.sdk.gaussdb.v3.model.InvokeGaussMySqlInstanceSwitchOverRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.InvokeGaussMySqlInstanceSwitchOverResponse;
import com.huaweicloud.sdk.gaussdb.v3.model.ListAuditLogDownloadLinkRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.ListAuditLogDownloadLinkResponse;
import com.huaweicloud.sdk.gaussdb.v3.model.ListConfigurationsDifferencesRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.ListConfigurationsDifferencesRequestBody;
import com.huaweicloud.sdk.gaussdb.v3.model.ListConfigurationsDifferencesResponse;
import com.huaweicloud.sdk.gaussdb.v3.model.ListConfigurationsInstancesRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.ListConfigurationsInstancesResponse;
import com.huaweicloud.sdk.gaussdb.v3.model.ListEnterpriseProjectsRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.ListEnterpriseProjectsResponse;
import com.huaweicloud.sdk.gaussdb.v3.model.ListGaussMySqlConfigurationsRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.ListGaussMySqlConfigurationsResponse;
import com.huaweicloud.sdk.gaussdb.v3.model.ListGaussMySqlDatabaseCharsetsRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.ListGaussMySqlDatabaseCharsetsResponse;
import com.huaweicloud.sdk.gaussdb.v3.model.ListGaussMySqlDatabaseRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.ListGaussMySqlDatabaseResponse;
import com.huaweicloud.sdk.gaussdb.v3.model.ListGaussMySqlDatabaseUserRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.ListGaussMySqlDatabaseUserResponse;
import com.huaweicloud.sdk.gaussdb.v3.model.ListGaussMySqlDedicatedResourcesRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.ListGaussMySqlDedicatedResourcesResponse;
import com.huaweicloud.sdk.gaussdb.v3.model.ListGaussMySqlInstanceDetailInfoRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.ListGaussMySqlInstanceDetailInfoResponse;
import com.huaweicloud.sdk.gaussdb.v3.model.ListGaussMySqlInstancesRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.ListGaussMySqlInstancesResponse;
import com.huaweicloud.sdk.gaussdb.v3.model.ListImmediateJobsRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.ListImmediateJobsResponse;
import com.huaweicloud.sdk.gaussdb.v3.model.ListInstanceConfigurationsRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.ListInstanceConfigurationsResponse;
import com.huaweicloud.sdk.gaussdb.v3.model.ListInstanceTagsRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.ListInstanceTagsResponse;
import com.huaweicloud.sdk.gaussdb.v3.model.ListLtsErrorLogDetailsRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.ListLtsErrorLogDetailsResponse;
import com.huaweicloud.sdk.gaussdb.v3.model.ListLtsSlowlogDetailsRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.ListLtsSlowlogDetailsResponse;
import com.huaweicloud.sdk.gaussdb.v3.model.ListModifyHistoryRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.ListModifyHistoryResponse;
import com.huaweicloud.sdk.gaussdb.v3.model.ListProjectTagsRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.ListProjectTagsResponse;
import com.huaweicloud.sdk.gaussdb.v3.model.ListScheduleJobsRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.ListScheduleJobsResponse;
import com.huaweicloud.sdk.gaussdb.v3.model.LtsLogErrorQueryRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.LtsLogSlowQueryRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.ModifyAliasRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.ModifyBackupEncryptStatusRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.ModifyBackupEncryptStatusResponse;
import com.huaweicloud.sdk.gaussdb.v3.model.ModifyBindEipRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.ModifyDnsNameReq;
import com.huaweicloud.sdk.gaussdb.v3.model.ModifyGaussMySqlProxyRouteModeRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.ModifyGaussMySqlProxyRouteModeRequestBody;
import com.huaweicloud.sdk.gaussdb.v3.model.ModifyGaussMySqlProxyRouteModeResponse;
import com.huaweicloud.sdk.gaussdb.v3.model.ModifyGaussMysqlDnsRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.ModifyGaussMysqlDnsResponse;
import com.huaweicloud.sdk.gaussdb.v3.model.ModifyInternalIpRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.ModifyOpsWindow;
import com.huaweicloud.sdk.gaussdb.v3.model.ModifyPortRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.ModifyProxyConsistRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.ModifySecurityGroupRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.MysqlChangeSpecificationRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.MysqlCreateBackupRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.MysqlCreateReadonlyNodeRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.MysqlExtendInstanceVolumeRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.MysqlInstanceRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.MysqlResetPasswordRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.MysqlUpdateBackupPolicyRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.MysqlUpdateInstanceNameRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.OpenMysqlProxyRequestBody;
import com.huaweicloud.sdk.gaussdb.v3.model.OperateAuditLogRequestV3Body;
import com.huaweicloud.sdk.gaussdb.v3.model.OperateSqlFilterControlReq;
import com.huaweicloud.sdk.gaussdb.v3.model.OperateSqlFilterRuleReq;
import com.huaweicloud.sdk.gaussdb.v3.model.ProxyTransactionSplitRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.ProxyUpdateProxyConnectionPoolTypeRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.ResetDatabasePasswordRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.ResetGaussMySqlDatabasePasswordRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.ResetGaussMySqlDatabasePasswordResponse;
import com.huaweicloud.sdk.gaussdb.v3.model.ResetGaussMySqlPasswordRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.ResetGaussMySqlPasswordResponse;
import com.huaweicloud.sdk.gaussdb.v3.model.RestartGaussMySqlInstanceRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.RestartGaussMySqlInstanceResponse;
import com.huaweicloud.sdk.gaussdb.v3.model.RestartGaussMySqlNodeRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.RestartGaussMySqlNodeResponse;
import com.huaweicloud.sdk.gaussdb.v3.model.RestartNodeRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.RestoreOldInstanceRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.RestoreOldInstanceResponse;
import com.huaweicloud.sdk.gaussdb.v3.model.RestoreRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.SetGaussMySqlProxyWeightRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.SetGaussMySqlProxyWeightResponse;
import com.huaweicloud.sdk.gaussdb.v3.model.SetGaussMySqlQuotasRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.SetGaussMySqlQuotasResponse;
import com.huaweicloud.sdk.gaussdb.v3.model.SetQuotasRequestBody;
import com.huaweicloud.sdk.gaussdb.v3.model.SetSqlFilterRuleRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.SetSqlFilterRuleResponse;
import com.huaweicloud.sdk.gaussdb.v3.model.ShowAuditLogRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.ShowAuditLogResponse;
import com.huaweicloud.sdk.gaussdb.v3.model.ShowAutoScalingPolicyRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.ShowAutoScalingPolicyResponse;
import com.huaweicloud.sdk.gaussdb.v3.model.ShowBackupRestoreTimeRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.ShowBackupRestoreTimeResponse;
import com.huaweicloud.sdk.gaussdb.v3.model.ShowDedicatedResourceInfoRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.ShowDedicatedResourceInfoResponse;
import com.huaweicloud.sdk.gaussdb.v3.model.ShowGaussMySqlBackupListRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.ShowGaussMySqlBackupListResponse;
import com.huaweicloud.sdk.gaussdb.v3.model.ShowGaussMySqlBackupPolicyRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.ShowGaussMySqlBackupPolicyResponse;
import com.huaweicloud.sdk.gaussdb.v3.model.ShowGaussMySqlConfigurationRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.ShowGaussMySqlConfigurationResponse;
import com.huaweicloud.sdk.gaussdb.v3.model.ShowGaussMySqlEngineVersionRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.ShowGaussMySqlEngineVersionResponse;
import com.huaweicloud.sdk.gaussdb.v3.model.ShowGaussMySqlFlavorsRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.ShowGaussMySqlFlavorsResponse;
import com.huaweicloud.sdk.gaussdb.v3.model.ShowGaussMySqlIncrementalBackupListRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.ShowGaussMySqlIncrementalBackupListResponse;
import com.huaweicloud.sdk.gaussdb.v3.model.ShowGaussMySqlInstanceInfoRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.ShowGaussMySqlInstanceInfoResponse;
import com.huaweicloud.sdk.gaussdb.v3.model.ShowGaussMySqlJobInfoRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.ShowGaussMySqlJobInfoResponse;
import com.huaweicloud.sdk.gaussdb.v3.model.ShowGaussMySqlProjectQuotasRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.ShowGaussMySqlProjectQuotasResponse;
import com.huaweicloud.sdk.gaussdb.v3.model.ShowGaussMySqlProxyFlavorsRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.ShowGaussMySqlProxyFlavorsResponse;
import com.huaweicloud.sdk.gaussdb.v3.model.ShowGaussMySqlProxyListRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.ShowGaussMySqlProxyListResponse;
import com.huaweicloud.sdk.gaussdb.v3.model.ShowGaussMySqlQuotasRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.ShowGaussMySqlQuotasResponse;
import com.huaweicloud.sdk.gaussdb.v3.model.ShowInstanceDatabaseVersionRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.ShowInstanceDatabaseVersionResponse;
import com.huaweicloud.sdk.gaussdb.v3.model.ShowInstanceMonitorExtendRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.ShowInstanceMonitorExtendResponse;
import com.huaweicloud.sdk.gaussdb.v3.model.ShowIntelligentDiagnosisAbnormalCountOfInstancesRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.ShowIntelligentDiagnosisAbnormalCountOfInstancesResponse;
import com.huaweicloud.sdk.gaussdb.v3.model.ShowIntelligentDiagnosisInstanceInfosPerMetricRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.ShowIntelligentDiagnosisInstanceInfosPerMetricResponse;
import com.huaweicloud.sdk.gaussdb.v3.model.ShowSqlFilterControlRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.ShowSqlFilterControlResponse;
import com.huaweicloud.sdk.gaussdb.v3.model.ShowSqlFilterRuleRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.ShowSqlFilterRuleResponse;
import com.huaweicloud.sdk.gaussdb.v3.model.ShrinkGaussMySqlProxyRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.ShrinkGaussMySqlProxyRequestBody;
import com.huaweicloud.sdk.gaussdb.v3.model.ShrinkGaussMySqlProxyResponse;
import com.huaweicloud.sdk.gaussdb.v3.model.SwitchAccessControlRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.SwitchAccessControlRequestBody;
import com.huaweicloud.sdk.gaussdb.v3.model.SwitchAccessControlResponse;
import com.huaweicloud.sdk.gaussdb.v3.model.SwitchGaussMySqlConfigurationRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.SwitchGaussMySqlConfigurationResponse;
import com.huaweicloud.sdk.gaussdb.v3.model.SwitchGaussMySqlInstanceSslRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.SwitchGaussMySqlInstanceSslResponse;
import com.huaweicloud.sdk.gaussdb.v3.model.SwitchSSLRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.TaurusModifyInstanceMonitorRequestBody;
import com.huaweicloud.sdk.gaussdb.v3.model.TaurusModifyProxyWeightRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.TaurusProxyScaleRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.TaurusRestartInstanceRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.TaurusSwitchoverRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.UpdateAuditLogRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.UpdateAuditLogResponse;
import com.huaweicloud.sdk.gaussdb.v3.model.UpdateAutoScalingPolicyRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.UpdateAutoScalingPolicyRequestBody;
import com.huaweicloud.sdk.gaussdb.v3.model.UpdateAutoScalingPolicyResponse;
import com.huaweicloud.sdk.gaussdb.v3.model.UpdateBackupOffsitePolicyRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.UpdateBackupOffsitePolicyRequestBody;
import com.huaweicloud.sdk.gaussdb.v3.model.UpdateBackupOffsitePolicyResponse;
import com.huaweicloud.sdk.gaussdb.v3.model.UpdateConfigurationParameterRequestBody;
import com.huaweicloud.sdk.gaussdb.v3.model.UpdateDatabaseCommentRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.UpdateDatabaseUserCommentRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.UpdateGaussMySqlBackupPolicyRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.UpdateGaussMySqlBackupPolicyResponse;
import com.huaweicloud.sdk.gaussdb.v3.model.UpdateGaussMySqlConfigurationRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.UpdateGaussMySqlConfigurationResponse;
import com.huaweicloud.sdk.gaussdb.v3.model.UpdateGaussMySqlDatabaseCommentRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.UpdateGaussMySqlDatabaseCommentResponse;
import com.huaweicloud.sdk.gaussdb.v3.model.UpdateGaussMySqlDatabaseUserCommentRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.UpdateGaussMySqlDatabaseUserCommentResponse;
import com.huaweicloud.sdk.gaussdb.v3.model.UpdateGaussMySqlInstanceAliasRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.UpdateGaussMySqlInstanceAliasResponse;
import com.huaweicloud.sdk.gaussdb.v3.model.UpdateGaussMySqlInstanceEipRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.UpdateGaussMySqlInstanceEipResponse;
import com.huaweicloud.sdk.gaussdb.v3.model.UpdateGaussMySqlInstanceInternalIpRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.UpdateGaussMySqlInstanceInternalIpResponse;
import com.huaweicloud.sdk.gaussdb.v3.model.UpdateGaussMySqlInstanceNameRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.UpdateGaussMySqlInstanceNameResponse;
import com.huaweicloud.sdk.gaussdb.v3.model.UpdateGaussMySqlInstanceOpsWindowRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.UpdateGaussMySqlInstanceOpsWindowResponse;
import com.huaweicloud.sdk.gaussdb.v3.model.UpdateGaussMySqlInstancePortRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.UpdateGaussMySqlInstancePortResponse;
import com.huaweicloud.sdk.gaussdb.v3.model.UpdateGaussMySqlInstanceSecurityGroupRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.UpdateGaussMySqlInstanceSecurityGroupResponse;
import com.huaweicloud.sdk.gaussdb.v3.model.UpdateGaussMySqlQuotasRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.UpdateGaussMySqlQuotasResponse;
import com.huaweicloud.sdk.gaussdb.v3.model.UpdateInstanceConfigurationsRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.UpdateInstanceConfigurationsRequestBody;
import com.huaweicloud.sdk.gaussdb.v3.model.UpdateInstanceConfigurationsResponse;
import com.huaweicloud.sdk.gaussdb.v3.model.UpdateInstanceMonitorRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.UpdateInstanceMonitorResponse;
import com.huaweicloud.sdk.gaussdb.v3.model.UpdateProxyConnectionPoolTypeRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.UpdateProxyConnectionPoolTypeResponse;
import com.huaweicloud.sdk.gaussdb.v3.model.UpdateProxyNewConfigRequestBody;
import com.huaweicloud.sdk.gaussdb.v3.model.UpdateProxyNewConfigurationsRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.UpdateProxyNewConfigurationsResponse;
import com.huaweicloud.sdk.gaussdb.v3.model.UpdateProxyPortRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.UpdateProxyPortRequestBody;
import com.huaweicloud.sdk.gaussdb.v3.model.UpdateProxyPortResponse;
import com.huaweicloud.sdk.gaussdb.v3.model.UpdateProxySessionConsistenceRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.UpdateProxySessionConsistenceResponse;
import com.huaweicloud.sdk.gaussdb.v3.model.UpdateSqlFilterControlRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.UpdateSqlFilterControlResponse;
import com.huaweicloud.sdk.gaussdb.v3.model.UpdateTransactionSplitStatusRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.UpdateTransactionSplitStatusResponse;
import com.huaweicloud.sdk.gaussdb.v3.model.UpgradeDatabaseRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.UpgradeGaussMySqlInstanceDatabaseRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.UpgradeGaussMySqlInstanceDatabaseResponse;

@SuppressWarnings("unchecked")
public class GaussDBMeta {

    public static final HttpRequestDef<AddDatabasePermissionRequest, AddDatabasePermissionResponse> addDatabasePermission =
        genForaddDatabasePermission();

    private static HttpRequestDef<AddDatabasePermissionRequest, AddDatabasePermissionResponse> genForaddDatabasePermission() {
        // basic
        HttpRequestDef.Builder<AddDatabasePermissionRequest, AddDatabasePermissionResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, AddDatabasePermissionRequest.class, AddDatabasePermissionResponse.class)
            .withName("AddDatabasePermission")
            .withUri("/v3/{project_id}/instances/{instance_id}/db-users/privilege")
            .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(AddDatabasePermissionRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(AddDatabasePermissionRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));
        builder.<GrantDatabasePermissionRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(GrantDatabasePermissionRequestBody.class),
            f -> f.withMarshaller(AddDatabasePermissionRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchTagActionRequest, BatchTagActionResponse> batchTagAction =
        genForbatchTagAction();

    private static HttpRequestDef<BatchTagActionRequest, BatchTagActionResponse> genForbatchTagAction() {
        // basic
        HttpRequestDef.Builder<BatchTagActionRequest, BatchTagActionResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, BatchTagActionRequest.class, BatchTagActionResponse.class)
                .withName("BatchTagAction")
                .withUri("/v3/{project_id}/instances/{instance_id}/tags/action")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchTagActionRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchTagActionRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));
        builder.<BatchOperateInstanceTagRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchOperateInstanceTagRequestBody.class),
            f -> f.withMarshaller(BatchTagActionRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CancelGaussMySqlInstanceEipRequest, CancelGaussMySqlInstanceEipResponse> cancelGaussMySqlInstanceEip =
        genForcancelGaussMySqlInstanceEip();

    private static HttpRequestDef<CancelGaussMySqlInstanceEipRequest, CancelGaussMySqlInstanceEipResponse> genForcancelGaussMySqlInstanceEip() {
        // basic
        HttpRequestDef.Builder<CancelGaussMySqlInstanceEipRequest, CancelGaussMySqlInstanceEipResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.PUT,
                    CancelGaussMySqlInstanceEipRequest.class,
                    CancelGaussMySqlInstanceEipResponse.class)
                .withName("CancelGaussMySqlInstanceEip")
                .withUri("/v3/{project_id}/instances/{instance_id}/public-ips/unbind")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CancelGaussMySqlInstanceEipRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CancelGaussMySqlInstanceEipRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CancelScheduleTaskRequest, CancelScheduleTaskResponse> cancelScheduleTask =
        genForcancelScheduleTask();

    private static HttpRequestDef<CancelScheduleTaskRequest, CancelScheduleTaskResponse> genForcancelScheduleTask() {
        // basic
        HttpRequestDef.Builder<CancelScheduleTaskRequest, CancelScheduleTaskResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, CancelScheduleTaskRequest.class, CancelScheduleTaskResponse.class)
                .withName("CancelScheduleTask")
                .withUri("/v3/{project_id}/scheduled-jobs")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CancelScheduleTaskRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));
        builder.<CancelScheduleTask>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CancelScheduleTask.class),
            f -> f.withMarshaller(CancelScheduleTaskRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ChangeGaussMySqlInstanceSpecificationRequest, ChangeGaussMySqlInstanceSpecificationResponse> changeGaussMySqlInstanceSpecification =
        genForchangeGaussMySqlInstanceSpecification();

    private static HttpRequestDef<ChangeGaussMySqlInstanceSpecificationRequest, ChangeGaussMySqlInstanceSpecificationResponse> genForchangeGaussMySqlInstanceSpecification() {
        // basic
        HttpRequestDef.Builder<ChangeGaussMySqlInstanceSpecificationRequest, ChangeGaussMySqlInstanceSpecificationResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    ChangeGaussMySqlInstanceSpecificationRequest.class,
                    ChangeGaussMySqlInstanceSpecificationResponse.class)
                .withName("ChangeGaussMySqlInstanceSpecification")
                .withUri("/v3/{project_id}/instances/{instance_id}/action")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ChangeGaussMySqlInstanceSpecificationRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ChangeGaussMySqlInstanceSpecificationRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));
        builder.<MysqlChangeSpecificationRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(MysqlChangeSpecificationRequest.class),
            f -> f.withMarshaller(ChangeGaussMySqlInstanceSpecificationRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ChangeGaussMySqlProxySpecificationRequest, ChangeGaussMySqlProxySpecificationResponse> changeGaussMySqlProxySpecification =
        genForchangeGaussMySqlProxySpecification();

    private static HttpRequestDef<ChangeGaussMySqlProxySpecificationRequest, ChangeGaussMySqlProxySpecificationResponse> genForchangeGaussMySqlProxySpecification() {
        // basic
        HttpRequestDef.Builder<ChangeGaussMySqlProxySpecificationRequest, ChangeGaussMySqlProxySpecificationResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.PUT,
                    ChangeGaussMySqlProxySpecificationRequest.class,
                    ChangeGaussMySqlProxySpecificationResponse.class)
                .withName("ChangeGaussMySqlProxySpecification")
                .withUri("/v3/{project_id}/instances/{instance_id}/proxy/{proxy_id}/flavor")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ChangeGaussMySqlProxySpecificationRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<String>withRequestField("proxy_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ChangeGaussMySqlProxySpecificationRequest::getProxyId, (req, v) -> {
                req.setProxyId(v);
            }));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ChangeGaussMySqlProxySpecificationRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));
        builder.<TaurusProxyScaleRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(TaurusProxyScaleRequest.class),
            f -> f.withMarshaller(ChangeGaussMySqlProxySpecificationRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CheckResourceRequest, CheckResourceResponse> checkResource =
        genForcheckResource();

    private static HttpRequestDef<CheckResourceRequest, CheckResourceResponse> genForcheckResource() {
        // basic
        HttpRequestDef.Builder<CheckResourceRequest, CheckResourceResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CheckResourceRequest.class, CheckResourceResponse.class)
                .withName("CheckResource")
                .withUri("/v3/{project_id}/resource-check")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CheckResourceRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));
        builder.<CheckResourceRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CheckResourceRequestBody.class),
            f -> f.withMarshaller(CheckResourceRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CopyConfigurationsRequest, CopyConfigurationsResponse> copyConfigurations =
        genForcopyConfigurations();

    private static HttpRequestDef<CopyConfigurationsRequest, CopyConfigurationsResponse> genForcopyConfigurations() {
        // basic
        HttpRequestDef.Builder<CopyConfigurationsRequest, CopyConfigurationsResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CopyConfigurationsRequest.class, CopyConfigurationsResponse.class)
                .withName("CopyConfigurations")
                .withUri("/v3/{project_id}/configurations/{configuration_id}/copy")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("configuration_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CopyConfigurationsRequest::getConfigurationId, (req, v) -> {
                req.setConfigurationId(v);
            }));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CopyConfigurationsRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));
        builder.<CopyConfigurationsRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CopyConfigurationsRequestBody.class),
            f -> f.withMarshaller(CopyConfigurationsRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CopyInstanceConfigurationsRequest, CopyInstanceConfigurationsResponse> copyInstanceConfigurations =
        genForcopyInstanceConfigurations();

    private static HttpRequestDef<CopyInstanceConfigurationsRequest, CopyInstanceConfigurationsResponse> genForcopyInstanceConfigurations() {
        // basic
        HttpRequestDef.Builder<CopyInstanceConfigurationsRequest, CopyInstanceConfigurationsResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    CopyInstanceConfigurationsRequest.class,
                    CopyInstanceConfigurationsResponse.class)
                .withName("CopyInstanceConfigurations")
                .withUri("/v3/{project_id}/instances/{instance_id}/configurations/{configuration_id}/copy")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CopyInstanceConfigurationsRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<String>withRequestField("configuration_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CopyInstanceConfigurationsRequest::getConfigurationId, (req, v) -> {
                req.setConfigurationId(v);
            }));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CopyInstanceConfigurationsRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));
        builder.<CopyInstanceConfigurationsRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CopyInstanceConfigurationsRequestBody.class),
            f -> f.withMarshaller(CopyInstanceConfigurationsRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateAccessControlRequest, CreateAccessControlResponse> createAccessControl =
        genForcreateAccessControl();

    private static HttpRequestDef<CreateAccessControlRequest, CreateAccessControlResponse> genForcreateAccessControl() {
        // basic
        HttpRequestDef.Builder<CreateAccessControlRequest, CreateAccessControlResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateAccessControlRequest.class, CreateAccessControlResponse.class)
                .withName("CreateAccessControl")
                .withUri("/v3/{project_id}/instances/{instance_id}/proxy/{proxy_id}/access-control")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateAccessControlRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<String>withRequestField("proxy_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateAccessControlRequest::getProxyId, (req, v) -> {
                req.setProxyId(v);
            }));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateAccessControlRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));
        builder.<CreateAccessControlRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateAccessControlRequestBody.class),
            f -> f.withMarshaller(CreateAccessControlRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateGaussMySqlBackupRequest, CreateGaussMySqlBackupResponse> createGaussMySqlBackup =
        genForcreateGaussMySqlBackup();

    private static HttpRequestDef<CreateGaussMySqlBackupRequest, CreateGaussMySqlBackupResponse> genForcreateGaussMySqlBackup() {
        // basic
        HttpRequestDef.Builder<CreateGaussMySqlBackupRequest, CreateGaussMySqlBackupResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, CreateGaussMySqlBackupRequest.class, CreateGaussMySqlBackupResponse.class)
            .withName("CreateGaussMySqlBackup")
            .withUri("/v3/{project_id}/backups/create")
            .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateGaussMySqlBackupRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));
        builder.<MysqlCreateBackupRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(MysqlCreateBackupRequest.class),
            f -> f.withMarshaller(CreateGaussMySqlBackupRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateGaussMySqlConfigurationRequest, CreateGaussMySqlConfigurationResponse> createGaussMySqlConfiguration =
        genForcreateGaussMySqlConfiguration();

    private static HttpRequestDef<CreateGaussMySqlConfigurationRequest, CreateGaussMySqlConfigurationResponse> genForcreateGaussMySqlConfiguration() {
        // basic
        HttpRequestDef.Builder<CreateGaussMySqlConfigurationRequest, CreateGaussMySqlConfigurationResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    CreateGaussMySqlConfigurationRequest.class,
                    CreateGaussMySqlConfigurationResponse.class)
                .withName("CreateGaussMySqlConfiguration")
                .withUri("/v3/{project_id}/configurations")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateGaussMySqlConfigurationRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));
        builder.<CreateConfigurationRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateConfigurationRequestBody.class),
            f -> f.withMarshaller(CreateGaussMySqlConfigurationRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateGaussMySqlDatabaseRequest, CreateGaussMySqlDatabaseResponse> createGaussMySqlDatabase =
        genForcreateGaussMySqlDatabase();

    private static HttpRequestDef<CreateGaussMySqlDatabaseRequest, CreateGaussMySqlDatabaseResponse> genForcreateGaussMySqlDatabase() {
        // basic
        HttpRequestDef.Builder<CreateGaussMySqlDatabaseRequest, CreateGaussMySqlDatabaseResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST, CreateGaussMySqlDatabaseRequest.class, CreateGaussMySqlDatabaseResponse.class)
                .withName("CreateGaussMySqlDatabase")
                .withUri("/v3/{project_id}/instances/{instance_id}/databases")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateGaussMySqlDatabaseRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateGaussMySqlDatabaseRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));
        builder.<CreateGaussMySqlDatabaseRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateGaussMySqlDatabaseRequestBody.class),
            f -> f.withMarshaller(CreateGaussMySqlDatabaseRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateGaussMySqlDatabaseUserRequest, CreateGaussMySqlDatabaseUserResponse> createGaussMySqlDatabaseUser =
        genForcreateGaussMySqlDatabaseUser();

    private static HttpRequestDef<CreateGaussMySqlDatabaseUserRequest, CreateGaussMySqlDatabaseUserResponse> genForcreateGaussMySqlDatabaseUser() {
        // basic
        HttpRequestDef.Builder<CreateGaussMySqlDatabaseUserRequest, CreateGaussMySqlDatabaseUserResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    CreateGaussMySqlDatabaseUserRequest.class,
                    CreateGaussMySqlDatabaseUserResponse.class)
                .withName("CreateGaussMySqlDatabaseUser")
                .withUri("/v3/{project_id}/instances/{instance_id}/db-users")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateGaussMySqlDatabaseUserRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateGaussMySqlDatabaseUserRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));
        builder.<CreateDatabaseUserRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateDatabaseUserRequest.class),
            f -> f.withMarshaller(CreateGaussMySqlDatabaseUserRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateGaussMySqlInstanceRequest, CreateGaussMySqlInstanceResponse> createGaussMySqlInstance =
        genForcreateGaussMySqlInstance();

    private static HttpRequestDef<CreateGaussMySqlInstanceRequest, CreateGaussMySqlInstanceResponse> genForcreateGaussMySqlInstance() {
        // basic
        HttpRequestDef.Builder<CreateGaussMySqlInstanceRequest, CreateGaussMySqlInstanceResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST, CreateGaussMySqlInstanceRequest.class, CreateGaussMySqlInstanceResponse.class)
                .withName("CreateGaussMySqlInstance")
                .withUri("/v3/{project_id}/instances")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateGaussMySqlInstanceRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));
        builder.<MysqlInstanceRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(MysqlInstanceRequest.class),
            f -> f.withMarshaller(CreateGaussMySqlInstanceRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateGaussMySqlProxyRequest, CreateGaussMySqlProxyResponse> createGaussMySqlProxy =
        genForcreateGaussMySqlProxy();

    private static HttpRequestDef<CreateGaussMySqlProxyRequest, CreateGaussMySqlProxyResponse> genForcreateGaussMySqlProxy() {
        // basic
        HttpRequestDef.Builder<CreateGaussMySqlProxyRequest, CreateGaussMySqlProxyResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, CreateGaussMySqlProxyRequest.class, CreateGaussMySqlProxyResponse.class)
            .withName("CreateGaussMySqlProxy")
            .withUri("/v3/{project_id}/instances/{instance_id}/proxy")
            .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateGaussMySqlProxyRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateGaussMySqlProxyRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));
        builder.<OpenMysqlProxyRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(OpenMysqlProxyRequestBody.class),
            f -> f.withMarshaller(CreateGaussMySqlProxyRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateGaussMySqlReadonlyNodeRequest, CreateGaussMySqlReadonlyNodeResponse> createGaussMySqlReadonlyNode =
        genForcreateGaussMySqlReadonlyNode();

    private static HttpRequestDef<CreateGaussMySqlReadonlyNodeRequest, CreateGaussMySqlReadonlyNodeResponse> genForcreateGaussMySqlReadonlyNode() {
        // basic
        HttpRequestDef.Builder<CreateGaussMySqlReadonlyNodeRequest, CreateGaussMySqlReadonlyNodeResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    CreateGaussMySqlReadonlyNodeRequest.class,
                    CreateGaussMySqlReadonlyNodeResponse.class)
                .withName("CreateGaussMySqlReadonlyNode")
                .withUri("/v3/{project_id}/instances/{instance_id}/nodes/enlarge")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateGaussMySqlReadonlyNodeRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateGaussMySqlReadonlyNodeRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));
        builder.<MysqlCreateReadonlyNodeRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(MysqlCreateReadonlyNodeRequest.class),
            f -> f.withMarshaller(CreateGaussMySqlReadonlyNodeRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateGaussMysqlDnsRequest, CreateGaussMysqlDnsResponse> createGaussMysqlDns =
        genForcreateGaussMysqlDns();

    private static HttpRequestDef<CreateGaussMysqlDnsRequest, CreateGaussMysqlDnsResponse> genForcreateGaussMysqlDns() {
        // basic
        HttpRequestDef.Builder<CreateGaussMysqlDnsRequest, CreateGaussMysqlDnsResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateGaussMysqlDnsRequest.class, CreateGaussMysqlDnsResponse.class)
                .withName("CreateGaussMysqlDns")
                .withUri("/v3/{project_id}/instances/{instance_id}/dns")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateGaussMysqlDnsRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateGaussMysqlDnsRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));
        builder.<CreateDnsNameReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateDnsNameReq.class),
            f -> f.withMarshaller(CreateGaussMysqlDnsRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateRestoreTablesRequest, CreateRestoreTablesResponse> createRestoreTables =
        genForcreateRestoreTables();

    private static HttpRequestDef<CreateRestoreTablesRequest, CreateRestoreTablesResponse> genForcreateRestoreTables() {
        // basic
        HttpRequestDef.Builder<CreateRestoreTablesRequest, CreateRestoreTablesResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateRestoreTablesRequest.class, CreateRestoreTablesResponse.class)
                .withName("CreateRestoreTables")
                .withUri("/v3/{project_id}/instances/{instance_id}/backups/restore/tables")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateRestoreTablesRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateRestoreTablesRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));
        builder.<CreateRestoreTablesRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateRestoreTablesRequestBody.class),
            f -> f.withMarshaller(CreateRestoreTablesRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteDatabasePermissionRequest, DeleteDatabasePermissionResponse> deleteDatabasePermission =
        genFordeleteDatabasePermission();

    private static HttpRequestDef<DeleteDatabasePermissionRequest, DeleteDatabasePermissionResponse> genFordeleteDatabasePermission() {
        // basic
        HttpRequestDef.Builder<DeleteDatabasePermissionRequest, DeleteDatabasePermissionResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.DELETE,
                    DeleteDatabasePermissionRequest.class,
                    DeleteDatabasePermissionResponse.class)
                .withName("DeleteDatabasePermission")
                .withUri("/v3/{project_id}/instances/{instance_id}/db-users/privilege")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteDatabasePermissionRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteDatabasePermissionRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));
        builder.<DeleteDatabasePermissionRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(DeleteDatabasePermissionRequestBody.class),
            f -> f.withMarshaller(DeleteDatabasePermissionRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteGaussMySqlBackupRequest, DeleteGaussMySqlBackupResponse> deleteGaussMySqlBackup =
        genFordeleteGaussMySqlBackup();

    private static HttpRequestDef<DeleteGaussMySqlBackupRequest, DeleteGaussMySqlBackupResponse> genFordeleteGaussMySqlBackup() {
        // basic
        HttpRequestDef.Builder<DeleteGaussMySqlBackupRequest, DeleteGaussMySqlBackupResponse> builder = HttpRequestDef
            .builder(HttpMethod.DELETE, DeleteGaussMySqlBackupRequest.class, DeleteGaussMySqlBackupResponse.class)
            .withName("DeleteGaussMySqlBackup")
            .withUri("/v3/{project_id}/backups/{backup_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("backup_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteGaussMySqlBackupRequest::getBackupId, (req, v) -> {
                req.setBackupId(v);
            }));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteGaussMySqlBackupRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteGaussMySqlConfigurationRequest, DeleteGaussMySqlConfigurationResponse> deleteGaussMySqlConfiguration =
        genFordeleteGaussMySqlConfiguration();

    private static HttpRequestDef<DeleteGaussMySqlConfigurationRequest, DeleteGaussMySqlConfigurationResponse> genFordeleteGaussMySqlConfiguration() {
        // basic
        HttpRequestDef.Builder<DeleteGaussMySqlConfigurationRequest, DeleteGaussMySqlConfigurationResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.DELETE,
                    DeleteGaussMySqlConfigurationRequest.class,
                    DeleteGaussMySqlConfigurationResponse.class)
                .withName("DeleteGaussMySqlConfiguration")
                .withUri("/v3/{project_id}/configurations/{configuration_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("configuration_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteGaussMySqlConfigurationRequest::getConfigurationId, (req, v) -> {
                req.setConfigurationId(v);
            }));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteGaussMySqlConfigurationRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteGaussMySqlDatabaseRequest, DeleteGaussMySqlDatabaseResponse> deleteGaussMySqlDatabase =
        genFordeleteGaussMySqlDatabase();

    private static HttpRequestDef<DeleteGaussMySqlDatabaseRequest, DeleteGaussMySqlDatabaseResponse> genFordeleteGaussMySqlDatabase() {
        // basic
        HttpRequestDef.Builder<DeleteGaussMySqlDatabaseRequest, DeleteGaussMySqlDatabaseResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.DELETE,
                    DeleteGaussMySqlDatabaseRequest.class,
                    DeleteGaussMySqlDatabaseResponse.class)
                .withName("DeleteGaussMySqlDatabase")
                .withUri("/v3/{project_id}/instances/{instance_id}/databases")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteGaussMySqlDatabaseRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteGaussMySqlDatabaseRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));
        builder.<DeleteGaussMySqlDatabaseRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(DeleteGaussMySqlDatabaseRequestBody.class),
            f -> f.withMarshaller(DeleteGaussMySqlDatabaseRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteGaussMySqlDatabaseUserRequest, DeleteGaussMySqlDatabaseUserResponse> deleteGaussMySqlDatabaseUser =
        genFordeleteGaussMySqlDatabaseUser();

    private static HttpRequestDef<DeleteGaussMySqlDatabaseUserRequest, DeleteGaussMySqlDatabaseUserResponse> genFordeleteGaussMySqlDatabaseUser() {
        // basic
        HttpRequestDef.Builder<DeleteGaussMySqlDatabaseUserRequest, DeleteGaussMySqlDatabaseUserResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.DELETE,
                    DeleteGaussMySqlDatabaseUserRequest.class,
                    DeleteGaussMySqlDatabaseUserResponse.class)
                .withName("DeleteGaussMySqlDatabaseUser")
                .withUri("/v3/{project_id}/instances/{instance_id}/db-users")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteGaussMySqlDatabaseUserRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteGaussMySqlDatabaseUserRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));
        builder.<DeleteDatabaseUserRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(DeleteDatabaseUserRequest.class),
            f -> f.withMarshaller(DeleteGaussMySqlDatabaseUserRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteGaussMySqlInstanceRequest, DeleteGaussMySqlInstanceResponse> deleteGaussMySqlInstance =
        genFordeleteGaussMySqlInstance();

    private static HttpRequestDef<DeleteGaussMySqlInstanceRequest, DeleteGaussMySqlInstanceResponse> genFordeleteGaussMySqlInstance() {
        // basic
        HttpRequestDef.Builder<DeleteGaussMySqlInstanceRequest, DeleteGaussMySqlInstanceResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.DELETE,
                    DeleteGaussMySqlInstanceRequest.class,
                    DeleteGaussMySqlInstanceResponse.class)
                .withName("DeleteGaussMySqlInstance")
                .withUri("/v3/{project_id}/instances/{instance_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteGaussMySqlInstanceRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteGaussMySqlInstanceRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteGaussMySqlProxyRequest, DeleteGaussMySqlProxyResponse> deleteGaussMySqlProxy =
        genFordeleteGaussMySqlProxy();

    private static HttpRequestDef<DeleteGaussMySqlProxyRequest, DeleteGaussMySqlProxyResponse> genFordeleteGaussMySqlProxy() {
        // basic
        HttpRequestDef.Builder<DeleteGaussMySqlProxyRequest, DeleteGaussMySqlProxyResponse> builder = HttpRequestDef
            .builder(HttpMethod.DELETE, DeleteGaussMySqlProxyRequest.class, DeleteGaussMySqlProxyResponse.class)
            .withName("DeleteGaussMySqlProxy")
            .withUri("/v3/{project_id}/instances/{instance_id}/proxy")
            .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteGaussMySqlProxyRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteGaussMySqlProxyRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));
        builder.<CloseMysqlProxyRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(CloseMysqlProxyRequestBody.class),
            f -> f.withMarshaller(DeleteGaussMySqlProxyRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteGaussMySqlReadonlyNodeRequest, DeleteGaussMySqlReadonlyNodeResponse> deleteGaussMySqlReadonlyNode =
        genFordeleteGaussMySqlReadonlyNode();

    private static HttpRequestDef<DeleteGaussMySqlReadonlyNodeRequest, DeleteGaussMySqlReadonlyNodeResponse> genFordeleteGaussMySqlReadonlyNode() {
        // basic
        HttpRequestDef.Builder<DeleteGaussMySqlReadonlyNodeRequest, DeleteGaussMySqlReadonlyNodeResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.DELETE,
                    DeleteGaussMySqlReadonlyNodeRequest.class,
                    DeleteGaussMySqlReadonlyNodeResponse.class)
                .withName("DeleteGaussMySqlReadonlyNode")
                .withUri("/v3/{project_id}/instances/{instance_id}/nodes/{node_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteGaussMySqlReadonlyNodeRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<String>withRequestField("node_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteGaussMySqlReadonlyNodeRequest::getNodeId, (req, v) -> {
                req.setNodeId(v);
            }));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteGaussMySqlReadonlyNodeRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteScheduleTasKRequest, DeleteScheduleTasKResponse> deleteScheduleTasK =
        genFordeleteScheduleTasK();

    private static HttpRequestDef<DeleteScheduleTasKRequest, DeleteScheduleTasKResponse> genFordeleteScheduleTasK() {
        // basic
        HttpRequestDef.Builder<DeleteScheduleTasKRequest, DeleteScheduleTasKResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteScheduleTasKRequest.class, DeleteScheduleTasKResponse.class)
                .withName("DeleteScheduleTasK")
                .withUri("/v3/{project_id}/instance/{instance_id}/scheduled-jobs")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteScheduleTasKRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteScheduleTasKRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));
        builder.<DeleteScheduleTasKRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(DeleteScheduleTasKRequestBody.class),
            f -> f.withMarshaller(DeleteScheduleTasKRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteTaskRecordRequest, DeleteTaskRecordResponse> deleteTaskRecord =
        genFordeleteTaskRecord();

    private static HttpRequestDef<DeleteTaskRecordRequest, DeleteTaskRecordResponse> genFordeleteTaskRecord() {
        // basic
        HttpRequestDef.Builder<DeleteTaskRecordRequest, DeleteTaskRecordResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteTaskRecordRequest.class, DeleteTaskRecordResponse.class)
                .withName("DeleteTaskRecord")
                .withUri("/v3/{project_id}/jobs/{job_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteTaskRecordRequest::getJobId, (req, v) -> {
                req.setJobId(v);
            }));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteTaskRecordRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));

        // response
        builder.<String>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(DeleteTaskRecordResponse::getBody, (response, data) -> {
                response.setBody(data);
            }));

        return builder.build();
    }

    public static final HttpRequestDef<DescribeBackupEncryptStatusRequest, DescribeBackupEncryptStatusResponse> describeBackupEncryptStatus =
        genFordescribeBackupEncryptStatus();

    private static HttpRequestDef<DescribeBackupEncryptStatusRequest, DescribeBackupEncryptStatusResponse> genFordescribeBackupEncryptStatus() {
        // basic
        HttpRequestDef.Builder<DescribeBackupEncryptStatusRequest, DescribeBackupEncryptStatusResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    DescribeBackupEncryptStatusRequest.class,
                    DescribeBackupEncryptStatusResponse.class)
                .withName("DescribeBackupEncryptStatus")
                .withUri("/v3/{project_id}/instances/{instance_id}/backups/encryption")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DescribeBackupEncryptStatusRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DescribeBackupEncryptStatusRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ExpandGaussMySqlInstanceVolumeRequest, ExpandGaussMySqlInstanceVolumeResponse> expandGaussMySqlInstanceVolume =
        genForexpandGaussMySqlInstanceVolume();

    private static HttpRequestDef<ExpandGaussMySqlInstanceVolumeRequest, ExpandGaussMySqlInstanceVolumeResponse> genForexpandGaussMySqlInstanceVolume() {
        // basic
        HttpRequestDef.Builder<ExpandGaussMySqlInstanceVolumeRequest, ExpandGaussMySqlInstanceVolumeResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    ExpandGaussMySqlInstanceVolumeRequest.class,
                    ExpandGaussMySqlInstanceVolumeResponse.class)
                .withName("ExpandGaussMySqlInstanceVolume")
                .withUri("/v3/{project_id}/instances/{instance_id}/volume/extend")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ExpandGaussMySqlInstanceVolumeRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ExpandGaussMySqlInstanceVolumeRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));
        builder.<MysqlExtendInstanceVolumeRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(MysqlExtendInstanceVolumeRequest.class),
            f -> f.withMarshaller(ExpandGaussMySqlInstanceVolumeRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ExpandGaussMySqlProxyRequest, ExpandGaussMySqlProxyResponse> expandGaussMySqlProxy =
        genForexpandGaussMySqlProxy();

    private static HttpRequestDef<ExpandGaussMySqlProxyRequest, ExpandGaussMySqlProxyResponse> genForexpandGaussMySqlProxy() {
        // basic
        HttpRequestDef.Builder<ExpandGaussMySqlProxyRequest, ExpandGaussMySqlProxyResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, ExpandGaussMySqlProxyRequest.class, ExpandGaussMySqlProxyResponse.class)
            .withName("ExpandGaussMySqlProxy")
            .withUri("/v3/{project_id}/instances/{instance_id}/proxy/enlarge")
            .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ExpandGaussMySqlProxyRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ExpandGaussMySqlProxyRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));
        builder.<EnlargeProxyRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(EnlargeProxyRequest.class),
            f -> f.withMarshaller(ExpandGaussMySqlProxyRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<InvokeGaussMySqlInstanceSwitchOverRequest, InvokeGaussMySqlInstanceSwitchOverResponse> invokeGaussMySqlInstanceSwitchOver =
        genForinvokeGaussMySqlInstanceSwitchOver();

    private static HttpRequestDef<InvokeGaussMySqlInstanceSwitchOverRequest, InvokeGaussMySqlInstanceSwitchOverResponse> genForinvokeGaussMySqlInstanceSwitchOver() {
        // basic
        HttpRequestDef.Builder<InvokeGaussMySqlInstanceSwitchOverRequest, InvokeGaussMySqlInstanceSwitchOverResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.PUT,
                    InvokeGaussMySqlInstanceSwitchOverRequest.class,
                    InvokeGaussMySqlInstanceSwitchOverResponse.class)
                .withName("InvokeGaussMySqlInstanceSwitchOver")
                .withUri("/v3/{project_id}/instances/{instance_id}/switchover")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(InvokeGaussMySqlInstanceSwitchOverRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(InvokeGaussMySqlInstanceSwitchOverRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));
        builder.<TaurusSwitchoverRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(TaurusSwitchoverRequest.class),
            f -> f.withMarshaller(InvokeGaussMySqlInstanceSwitchOverRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAuditLogDownloadLinkRequest, ListAuditLogDownloadLinkResponse> listAuditLogDownloadLink =
        genForlistAuditLogDownloadLink();

    private static HttpRequestDef<ListAuditLogDownloadLinkRequest, ListAuditLogDownloadLinkResponse> genForlistAuditLogDownloadLink() {
        // basic
        HttpRequestDef.Builder<ListAuditLogDownloadLinkRequest, ListAuditLogDownloadLinkResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET, ListAuditLogDownloadLinkRequest.class, ListAuditLogDownloadLinkResponse.class)
                .withName("ListAuditLogDownloadLink")
                .withUri("/v3/{project_id}/instance/{instance_id}/auditlog/download-link")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAuditLogDownloadLinkRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<String>withRequestField("node_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAuditLogDownloadLinkRequest::getNodeId, (req, v) -> {
                req.setNodeId(v);
            }));
        builder.<String>withRequestField("last_file_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAuditLogDownloadLinkRequest::getLastFileName, (req, v) -> {
                req.setLastFileName(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAuditLogDownloadLinkRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("start_time",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAuditLogDownloadLinkRequest::getStartTime, (req, v) -> {
                req.setStartTime(v);
            }));
        builder.<String>withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAuditLogDownloadLinkRequest::getEndTime, (req, v) -> {
                req.setEndTime(v);
            }));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAuditLogDownloadLinkRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListConfigurationsDifferencesRequest, ListConfigurationsDifferencesResponse> listConfigurationsDifferences =
        genForlistConfigurationsDifferences();

    private static HttpRequestDef<ListConfigurationsDifferencesRequest, ListConfigurationsDifferencesResponse> genForlistConfigurationsDifferences() {
        // basic
        HttpRequestDef.Builder<ListConfigurationsDifferencesRequest, ListConfigurationsDifferencesResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    ListConfigurationsDifferencesRequest.class,
                    ListConfigurationsDifferencesResponse.class)
                .withName("ListConfigurationsDifferences")
                .withUri("/v3/{project_id}/configurations/comparison")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListConfigurationsDifferencesRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));
        builder.<ListConfigurationsDifferencesRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ListConfigurationsDifferencesRequestBody.class),
            f -> f.withMarshaller(ListConfigurationsDifferencesRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListConfigurationsInstancesRequest, ListConfigurationsInstancesResponse> listConfigurationsInstances =
        genForlistConfigurationsInstances();

    private static HttpRequestDef<ListConfigurationsInstancesRequest, ListConfigurationsInstancesResponse> genForlistConfigurationsInstances() {
        // basic
        HttpRequestDef.Builder<ListConfigurationsInstancesRequest, ListConfigurationsInstancesResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListConfigurationsInstancesRequest.class,
                    ListConfigurationsInstancesResponse.class)
                .withName("ListConfigurationsInstances")
                .withUri("/v3/{project_id}/configurations/{configuration_id}/applicable-instances")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("configuration_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListConfigurationsInstancesRequest::getConfigurationId, (req, v) -> {
                req.setConfigurationId(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListConfigurationsInstancesRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListConfigurationsInstancesRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListConfigurationsInstancesRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListEnterpriseProjectsRequest, ListEnterpriseProjectsResponse> listEnterpriseProjects =
        genForlistEnterpriseProjects();

    private static HttpRequestDef<ListEnterpriseProjectsRequest, ListEnterpriseProjectsResponse> genForlistEnterpriseProjects() {
        // basic
        HttpRequestDef.Builder<ListEnterpriseProjectsRequest, ListEnterpriseProjectsResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListEnterpriseProjectsRequest.class, ListEnterpriseProjectsResponse.class)
            .withName("ListEnterpriseProjects")
            .withUri("/v3/{project_id}/enterprise-projects")
            .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListEnterpriseProjectsRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListEnterpriseProjectsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListEnterpriseProjectsRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListGaussMySqlConfigurationsRequest, ListGaussMySqlConfigurationsResponse> listGaussMySqlConfigurations =
        genForlistGaussMySqlConfigurations();

    private static HttpRequestDef<ListGaussMySqlConfigurationsRequest, ListGaussMySqlConfigurationsResponse> genForlistGaussMySqlConfigurations() {
        // basic
        HttpRequestDef.Builder<ListGaussMySqlConfigurationsRequest, ListGaussMySqlConfigurationsResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListGaussMySqlConfigurationsRequest.class,
                    ListGaussMySqlConfigurationsResponse.class)
                .withName("ListGaussMySqlConfigurations")
                .withUri("/v3/{project_id}/configurations")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListGaussMySqlConfigurationsRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListGaussMySqlConfigurationsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListGaussMySqlConfigurationsRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListGaussMySqlDatabaseRequest, ListGaussMySqlDatabaseResponse> listGaussMySqlDatabase =
        genForlistGaussMySqlDatabase();

    private static HttpRequestDef<ListGaussMySqlDatabaseRequest, ListGaussMySqlDatabaseResponse> genForlistGaussMySqlDatabase() {
        // basic
        HttpRequestDef.Builder<ListGaussMySqlDatabaseRequest, ListGaussMySqlDatabaseResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListGaussMySqlDatabaseRequest.class, ListGaussMySqlDatabaseResponse.class)
            .withName("ListGaussMySqlDatabase")
            .withUri("/v3/{project_id}/instances/{instance_id}/databases")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListGaussMySqlDatabaseRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListGaussMySqlDatabaseRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListGaussMySqlDatabaseRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListGaussMySqlDatabaseRequest::getName, (req, v) -> {
                req.setName(v);
            }));
        builder.<String>withRequestField("charset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListGaussMySqlDatabaseRequest::getCharset, (req, v) -> {
                req.setCharset(v);
            }));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListGaussMySqlDatabaseRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListGaussMySqlDatabaseCharsetsRequest, ListGaussMySqlDatabaseCharsetsResponse> listGaussMySqlDatabaseCharsets =
        genForlistGaussMySqlDatabaseCharsets();

    private static HttpRequestDef<ListGaussMySqlDatabaseCharsetsRequest, ListGaussMySqlDatabaseCharsetsResponse> genForlistGaussMySqlDatabaseCharsets() {
        // basic
        HttpRequestDef.Builder<ListGaussMySqlDatabaseCharsetsRequest, ListGaussMySqlDatabaseCharsetsResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListGaussMySqlDatabaseCharsetsRequest.class,
                    ListGaussMySqlDatabaseCharsetsResponse.class)
                .withName("ListGaussMySqlDatabaseCharsets")
                .withUri("/v3/{project_id}/instances/{instance_id}/databases/charsets")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListGaussMySqlDatabaseCharsetsRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListGaussMySqlDatabaseCharsetsRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListGaussMySqlDatabaseUserRequest, ListGaussMySqlDatabaseUserResponse> listGaussMySqlDatabaseUser =
        genForlistGaussMySqlDatabaseUser();

    private static HttpRequestDef<ListGaussMySqlDatabaseUserRequest, ListGaussMySqlDatabaseUserResponse> genForlistGaussMySqlDatabaseUser() {
        // basic
        HttpRequestDef.Builder<ListGaussMySqlDatabaseUserRequest, ListGaussMySqlDatabaseUserResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListGaussMySqlDatabaseUserRequest.class,
                    ListGaussMySqlDatabaseUserResponse.class)
                .withName("ListGaussMySqlDatabaseUser")
                .withUri("/v3/{project_id}/instances/{instance_id}/db-users")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListGaussMySqlDatabaseUserRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListGaussMySqlDatabaseUserRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListGaussMySqlDatabaseUserRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListGaussMySqlDatabaseUserRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListGaussMySqlDedicatedResourcesRequest, ListGaussMySqlDedicatedResourcesResponse> listGaussMySqlDedicatedResources =
        genForlistGaussMySqlDedicatedResources();

    private static HttpRequestDef<ListGaussMySqlDedicatedResourcesRequest, ListGaussMySqlDedicatedResourcesResponse> genForlistGaussMySqlDedicatedResources() {
        // basic
        HttpRequestDef.Builder<ListGaussMySqlDedicatedResourcesRequest, ListGaussMySqlDedicatedResourcesResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListGaussMySqlDedicatedResourcesRequest.class,
                    ListGaussMySqlDedicatedResourcesResponse.class)
                .withName("ListGaussMySqlDedicatedResources")
                .withUri("/v3/{project_id}/dedicated-resources")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListGaussMySqlDedicatedResourcesRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListGaussMySqlDedicatedResourcesRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListGaussMySqlDedicatedResourcesRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListGaussMySqlInstanceDetailInfoRequest, ListGaussMySqlInstanceDetailInfoResponse> listGaussMySqlInstanceDetailInfo =
        genForlistGaussMySqlInstanceDetailInfo();

    private static HttpRequestDef<ListGaussMySqlInstanceDetailInfoRequest, ListGaussMySqlInstanceDetailInfoResponse> genForlistGaussMySqlInstanceDetailInfo() {
        // basic
        HttpRequestDef.Builder<ListGaussMySqlInstanceDetailInfoRequest, ListGaussMySqlInstanceDetailInfoResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListGaussMySqlInstanceDetailInfoRequest.class,
                    ListGaussMySqlInstanceDetailInfoResponse.class)
                .withName("ListGaussMySqlInstanceDetailInfo")
                .withUri("/v3/{project_id}/instances/details")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_ids",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListGaussMySqlInstanceDetailInfoRequest::getInstanceIds, (req, v) -> {
                req.setInstanceIds(v);
            }));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListGaussMySqlInstanceDetailInfoRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListGaussMySqlInstancesRequest, ListGaussMySqlInstancesResponse> listGaussMySqlInstances =
        genForlistGaussMySqlInstances();

    private static HttpRequestDef<ListGaussMySqlInstancesRequest, ListGaussMySqlInstancesResponse> genForlistGaussMySqlInstances() {
        // basic
        HttpRequestDef.Builder<ListGaussMySqlInstancesRequest, ListGaussMySqlInstancesResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListGaussMySqlInstancesRequest.class, ListGaussMySqlInstancesResponse.class)
            .withName("ListGaussMySqlInstances")
            .withUri("/v3/{project_id}/instances")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListGaussMySqlInstancesRequest::getId, (req, v) -> {
                req.setId(v);
            }));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListGaussMySqlInstancesRequest::getName, (req, v) -> {
                req.setName(v);
            }));
        builder.<String>withRequestField("type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListGaussMySqlInstancesRequest::getType, (req, v) -> {
                req.setType(v);
            }));
        builder.<String>withRequestField("datastore_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListGaussMySqlInstancesRequest::getDatastoreType, (req, v) -> {
                req.setDatastoreType(v);
            }));
        builder.<String>withRequestField("vpc_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListGaussMySqlInstancesRequest::getVpcId, (req, v) -> {
                req.setVpcId(v);
            }));
        builder.<String>withRequestField("subnet_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListGaussMySqlInstancesRequest::getSubnetId, (req, v) -> {
                req.setSubnetId(v);
            }));
        builder.<String>withRequestField("private_ip",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListGaussMySqlInstancesRequest::getPrivateIp, (req, v) -> {
                req.setPrivateIp(v);
            }));
        builder.<String>withRequestField("readonly_private_ip",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListGaussMySqlInstancesRequest::getReadonlyPrivateIp, (req, v) -> {
                req.setReadonlyPrivateIp(v);
            }));
        builder.<String>withRequestField("proxy_ip",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListGaussMySqlInstancesRequest::getProxyIp, (req, v) -> {
                req.setProxyIp(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListGaussMySqlInstancesRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListGaussMySqlInstancesRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("tags",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListGaussMySqlInstancesRequest::getTags, (req, v) -> {
                req.setTags(v);
            }));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListGaussMySqlInstancesRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListImmediateJobsRequest, ListImmediateJobsResponse> listImmediateJobs =
        genForlistImmediateJobs();

    private static HttpRequestDef<ListImmediateJobsRequest, ListImmediateJobsResponse> genForlistImmediateJobs() {
        // basic
        HttpRequestDef.Builder<ListImmediateJobsRequest, ListImmediateJobsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListImmediateJobsRequest.class, ListImmediateJobsResponse.class)
                .withName("ListImmediateJobs")
                .withUri("/v3/{project_id}/immediate-jobs")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListImmediateJobsRequest::getStatus, (req, v) -> {
                req.setStatus(v);
            }));
        builder.<String>withRequestField("job_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListImmediateJobsRequest::getJobName, (req, v) -> {
                req.setJobName(v);
            }));
        builder.<String>withRequestField("job_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListImmediateJobsRequest::getJobId, (req, v) -> {
                req.setJobId(v);
            }));
        builder.<String>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListImmediateJobsRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<String>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListImmediateJobsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("start_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListImmediateJobsRequest::getStartTime, (req, v) -> {
                req.setStartTime(v);
            }));
        builder.<String>withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListImmediateJobsRequest::getEndTime, (req, v) -> {
                req.setEndTime(v);
            }));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListImmediateJobsRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListInstanceConfigurationsRequest, ListInstanceConfigurationsResponse> listInstanceConfigurations =
        genForlistInstanceConfigurations();

    private static HttpRequestDef<ListInstanceConfigurationsRequest, ListInstanceConfigurationsResponse> genForlistInstanceConfigurations() {
        // basic
        HttpRequestDef.Builder<ListInstanceConfigurationsRequest, ListInstanceConfigurationsResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListInstanceConfigurationsRequest.class,
                    ListInstanceConfigurationsResponse.class)
                .withName("ListInstanceConfigurations")
                .withUri("/v3/{project_id}/instances/{instance_id}/configurations")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListInstanceConfigurationsRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListInstanceConfigurationsRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListInstanceConfigurationsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListInstanceConfigurationsRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListInstanceTagsRequest, ListInstanceTagsResponse> listInstanceTags =
        genForlistInstanceTags();

    private static HttpRequestDef<ListInstanceTagsRequest, ListInstanceTagsResponse> genForlistInstanceTags() {
        // basic
        HttpRequestDef.Builder<ListInstanceTagsRequest, ListInstanceTagsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListInstanceTagsRequest.class, ListInstanceTagsResponse.class)
                .withName("ListInstanceTags")
                .withUri("/v3/{project_id}/instances/{instance_id}/tags")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListInstanceTagsRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListInstanceTagsRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListInstanceTagsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListInstanceTagsRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListLtsErrorLogDetailsRequest, ListLtsErrorLogDetailsResponse> listLtsErrorLogDetails =
        genForlistLtsErrorLogDetails();

    private static HttpRequestDef<ListLtsErrorLogDetailsRequest, ListLtsErrorLogDetailsResponse> genForlistLtsErrorLogDetails() {
        // basic
        HttpRequestDef.Builder<ListLtsErrorLogDetailsRequest, ListLtsErrorLogDetailsResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, ListLtsErrorLogDetailsRequest.class, ListLtsErrorLogDetailsResponse.class)
            .withName("ListLtsErrorLogDetails")
            .withUri("/v3.1/{project_id}/instances/{instance_id}/error-logs")
            .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListLtsErrorLogDetailsRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListLtsErrorLogDetailsRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));
        builder.<LtsLogErrorQueryRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(LtsLogErrorQueryRequest.class),
            f -> f.withMarshaller(ListLtsErrorLogDetailsRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListLtsSlowlogDetailsRequest, ListLtsSlowlogDetailsResponse> listLtsSlowlogDetails =
        genForlistLtsSlowlogDetails();

    private static HttpRequestDef<ListLtsSlowlogDetailsRequest, ListLtsSlowlogDetailsResponse> genForlistLtsSlowlogDetails() {
        // basic
        HttpRequestDef.Builder<ListLtsSlowlogDetailsRequest, ListLtsSlowlogDetailsResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, ListLtsSlowlogDetailsRequest.class, ListLtsSlowlogDetailsResponse.class)
            .withName("ListLtsSlowlogDetails")
            .withUri("/v3.1/{project_id}/instances/{instance_id}/slow-logs")
            .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListLtsSlowlogDetailsRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListLtsSlowlogDetailsRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));
        builder.<LtsLogSlowQueryRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(LtsLogSlowQueryRequest.class),
            f -> f.withMarshaller(ListLtsSlowlogDetailsRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListModifyHistoryRequest, ListModifyHistoryResponse> listModifyHistory =
        genForlistModifyHistory();

    private static HttpRequestDef<ListModifyHistoryRequest, ListModifyHistoryResponse> genForlistModifyHistory() {
        // basic
        HttpRequestDef.Builder<ListModifyHistoryRequest, ListModifyHistoryResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListModifyHistoryRequest.class, ListModifyHistoryResponse.class)
                .withName("ListModifyHistory")
                .withUri("/v3/{project_id}/configurations/{configuration_id}/modify-history")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("configuration_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListModifyHistoryRequest::getConfigurationId, (req, v) -> {
                req.setConfigurationId(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListModifyHistoryRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListModifyHistoryRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListModifyHistoryRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListProjectTagsRequest, ListProjectTagsResponse> listProjectTags =
        genForlistProjectTags();

    private static HttpRequestDef<ListProjectTagsRequest, ListProjectTagsResponse> genForlistProjectTags() {
        // basic
        HttpRequestDef.Builder<ListProjectTagsRequest, ListProjectTagsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListProjectTagsRequest.class, ListProjectTagsResponse.class)
                .withName("ListProjectTags")
                .withUri("/v3/{project_id}/tags")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListProjectTagsRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListProjectTagsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListProjectTagsRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListScheduleJobsRequest, ListScheduleJobsResponse> listScheduleJobs =
        genForlistScheduleJobs();

    private static HttpRequestDef<ListScheduleJobsRequest, ListScheduleJobsResponse> genForlistScheduleJobs() {
        // basic
        HttpRequestDef.Builder<ListScheduleJobsRequest, ListScheduleJobsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListScheduleJobsRequest.class, ListScheduleJobsResponse.class)
                .withName("ListScheduleJobs")
                .withUri("/v3/{project_id}/scheduled-jobs")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListScheduleJobsRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<String>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListScheduleJobsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListScheduleJobsRequest::getStatus, (req, v) -> {
                req.setStatus(v);
            }));
        builder.<String>withRequestField("start_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListScheduleJobsRequest::getStartTime, (req, v) -> {
                req.setStartTime(v);
            }));
        builder.<String>withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListScheduleJobsRequest::getEndTime, (req, v) -> {
                req.setEndTime(v);
            }));
        builder.<String>withRequestField("job_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListScheduleJobsRequest::getJobId, (req, v) -> {
                req.setJobId(v);
            }));
        builder.<String>withRequestField("job_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListScheduleJobsRequest::getJobName, (req, v) -> {
                req.setJobName(v);
            }));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListScheduleJobsRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ModifyBackupEncryptStatusRequest, ModifyBackupEncryptStatusResponse> modifyBackupEncryptStatus =
        genFormodifyBackupEncryptStatus();

    private static HttpRequestDef<ModifyBackupEncryptStatusRequest, ModifyBackupEncryptStatusResponse> genFormodifyBackupEncryptStatus() {
        // basic
        HttpRequestDef.Builder<ModifyBackupEncryptStatusRequest, ModifyBackupEncryptStatusResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    ModifyBackupEncryptStatusRequest.class,
                    ModifyBackupEncryptStatusResponse.class)
                .withName("ModifyBackupEncryptStatus")
                .withUri("/v3/{project_id}/instances/{instance_id}/backups/encryption")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ModifyBackupEncryptStatusRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ModifyBackupEncryptStatusRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));
        builder.<BackupEncryptRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BackupEncryptRequest.class),
            f -> f.withMarshaller(ModifyBackupEncryptStatusRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ModifyGaussMySqlProxyRouteModeRequest, ModifyGaussMySqlProxyRouteModeResponse> modifyGaussMySqlProxyRouteMode =
        genFormodifyGaussMySqlProxyRouteMode();

    private static HttpRequestDef<ModifyGaussMySqlProxyRouteModeRequest, ModifyGaussMySqlProxyRouteModeResponse> genFormodifyGaussMySqlProxyRouteMode() {
        // basic
        HttpRequestDef.Builder<ModifyGaussMySqlProxyRouteModeRequest, ModifyGaussMySqlProxyRouteModeResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.PUT,
                    ModifyGaussMySqlProxyRouteModeRequest.class,
                    ModifyGaussMySqlProxyRouteModeResponse.class)
                .withName("ModifyGaussMySqlProxyRouteMode")
                .withUri("/v3/{project_id}/instances/{instance_id}/proxy/{proxy_id}/route-mode")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ModifyGaussMySqlProxyRouteModeRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<String>withRequestField("proxy_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ModifyGaussMySqlProxyRouteModeRequest::getProxyId, (req, v) -> {
                req.setProxyId(v);
            }));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ModifyGaussMySqlProxyRouteModeRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));
        builder.<ModifyGaussMySqlProxyRouteModeRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ModifyGaussMySqlProxyRouteModeRequestBody.class),
            f -> f.withMarshaller(ModifyGaussMySqlProxyRouteModeRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ModifyGaussMysqlDnsRequest, ModifyGaussMysqlDnsResponse> modifyGaussMysqlDns =
        genFormodifyGaussMysqlDns();

    private static HttpRequestDef<ModifyGaussMysqlDnsRequest, ModifyGaussMysqlDnsResponse> genFormodifyGaussMysqlDns() {
        // basic
        HttpRequestDef.Builder<ModifyGaussMysqlDnsRequest, ModifyGaussMysqlDnsResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, ModifyGaussMysqlDnsRequest.class, ModifyGaussMysqlDnsResponse.class)
                .withName("ModifyGaussMysqlDns")
                .withUri("/v3/{project_id}/instances/{instance_id}/dns")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ModifyGaussMysqlDnsRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ModifyGaussMysqlDnsRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));
        builder.<ModifyDnsNameReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ModifyDnsNameReq.class),
            f -> f.withMarshaller(ModifyGaussMysqlDnsRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ResetGaussMySqlDatabasePasswordRequest, ResetGaussMySqlDatabasePasswordResponse> resetGaussMySqlDatabasePassword =
        genForresetGaussMySqlDatabasePassword();

    private static HttpRequestDef<ResetGaussMySqlDatabasePasswordRequest, ResetGaussMySqlDatabasePasswordResponse> genForresetGaussMySqlDatabasePassword() {
        // basic
        HttpRequestDef.Builder<ResetGaussMySqlDatabasePasswordRequest, ResetGaussMySqlDatabasePasswordResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.PUT,
                    ResetGaussMySqlDatabasePasswordRequest.class,
                    ResetGaussMySqlDatabasePasswordResponse.class)
                .withName("ResetGaussMySqlDatabasePassword")
                .withUri("/v3/{project_id}/instances/{instance_id}/db-users/password")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ResetGaussMySqlDatabasePasswordRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ResetGaussMySqlDatabasePasswordRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));
        builder.<ResetDatabasePasswordRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ResetDatabasePasswordRequest.class),
            f -> f.withMarshaller(ResetGaussMySqlDatabasePasswordRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ResetGaussMySqlPasswordRequest, ResetGaussMySqlPasswordResponse> resetGaussMySqlPassword =
        genForresetGaussMySqlPassword();

    private static HttpRequestDef<ResetGaussMySqlPasswordRequest, ResetGaussMySqlPasswordResponse> genForresetGaussMySqlPassword() {
        // basic
        HttpRequestDef.Builder<ResetGaussMySqlPasswordRequest, ResetGaussMySqlPasswordResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, ResetGaussMySqlPasswordRequest.class, ResetGaussMySqlPasswordResponse.class)
            .withName("ResetGaussMySqlPassword")
            .withUri("/v3/{project_id}/instances/{instance_id}/password")
            .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ResetGaussMySqlPasswordRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ResetGaussMySqlPasswordRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));
        builder.<MysqlResetPasswordRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(MysqlResetPasswordRequest.class),
            f -> f.withMarshaller(ResetGaussMySqlPasswordRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RestartGaussMySqlInstanceRequest, RestartGaussMySqlInstanceResponse> restartGaussMySqlInstance =
        genForrestartGaussMySqlInstance();

    private static HttpRequestDef<RestartGaussMySqlInstanceRequest, RestartGaussMySqlInstanceResponse> genForrestartGaussMySqlInstance() {
        // basic
        HttpRequestDef.Builder<RestartGaussMySqlInstanceRequest, RestartGaussMySqlInstanceResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    RestartGaussMySqlInstanceRequest.class,
                    RestartGaussMySqlInstanceResponse.class)
                .withName("RestartGaussMySqlInstance")
                .withUri("/v3/{project_id}/instances/{instance_id}/restart")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(RestartGaussMySqlInstanceRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(RestartGaussMySqlInstanceRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));
        builder.<TaurusRestartInstanceRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(TaurusRestartInstanceRequest.class),
            f -> f.withMarshaller(RestartGaussMySqlInstanceRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RestartGaussMySqlNodeRequest, RestartGaussMySqlNodeResponse> restartGaussMySqlNode =
        genForrestartGaussMySqlNode();

    private static HttpRequestDef<RestartGaussMySqlNodeRequest, RestartGaussMySqlNodeResponse> genForrestartGaussMySqlNode() {
        // basic
        HttpRequestDef.Builder<RestartGaussMySqlNodeRequest, RestartGaussMySqlNodeResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, RestartGaussMySqlNodeRequest.class, RestartGaussMySqlNodeResponse.class)
            .withName("RestartGaussMySqlNode")
            .withUri("/v3/{project_id}/instances/{instance_id}/nodes/{node_id}/restart")
            .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(RestartGaussMySqlNodeRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<String>withRequestField("node_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(RestartGaussMySqlNodeRequest::getNodeId, (req, v) -> {
                req.setNodeId(v);
            }));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(RestartGaussMySqlNodeRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));
        builder.<RestartNodeRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(RestartNodeRequest.class),
            f -> f.withMarshaller(RestartGaussMySqlNodeRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RestoreOldInstanceRequest, RestoreOldInstanceResponse> restoreOldInstance =
        genForrestoreOldInstance();

    private static HttpRequestDef<RestoreOldInstanceRequest, RestoreOldInstanceResponse> genForrestoreOldInstance() {
        // basic
        HttpRequestDef.Builder<RestoreOldInstanceRequest, RestoreOldInstanceResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, RestoreOldInstanceRequest.class, RestoreOldInstanceResponse.class)
                .withName("RestoreOldInstance")
                .withUri("/v3/{project_id}/instances/restore")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(RestoreOldInstanceRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));
        builder.<RestoreRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(RestoreRequest.class),
            f -> f.withMarshaller(RestoreOldInstanceRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<SetGaussMySqlProxyWeightRequest, SetGaussMySqlProxyWeightResponse> setGaussMySqlProxyWeight =
        genForsetGaussMySqlProxyWeight();

    private static HttpRequestDef<SetGaussMySqlProxyWeightRequest, SetGaussMySqlProxyWeightResponse> genForsetGaussMySqlProxyWeight() {
        // basic
        HttpRequestDef.Builder<SetGaussMySqlProxyWeightRequest, SetGaussMySqlProxyWeightResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.PUT, SetGaussMySqlProxyWeightRequest.class, SetGaussMySqlProxyWeightResponse.class)
                .withName("SetGaussMySqlProxyWeight")
                .withUri("/v3/{project_id}/instances/{instance_id}/proxy/{proxy_id}/weight")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SetGaussMySqlProxyWeightRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<String>withRequestField("proxy_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SetGaussMySqlProxyWeightRequest::getProxyId, (req, v) -> {
                req.setProxyId(v);
            }));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SetGaussMySqlProxyWeightRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));
        builder.<TaurusModifyProxyWeightRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(TaurusModifyProxyWeightRequest.class),
            f -> f.withMarshaller(SetGaussMySqlProxyWeightRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<SetGaussMySqlQuotasRequest, SetGaussMySqlQuotasResponse> setGaussMySqlQuotas =
        genForsetGaussMySqlQuotas();

    private static HttpRequestDef<SetGaussMySqlQuotasRequest, SetGaussMySqlQuotasResponse> genForsetGaussMySqlQuotas() {
        // basic
        HttpRequestDef.Builder<SetGaussMySqlQuotasRequest, SetGaussMySqlQuotasResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, SetGaussMySqlQuotasRequest.class, SetGaussMySqlQuotasResponse.class)
                .withName("SetGaussMySqlQuotas")
                .withUri("/v3/{project_id}/quotas")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SetGaussMySqlQuotasRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));
        builder.<SetQuotasRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(SetQuotasRequestBody.class),
            f -> f.withMarshaller(SetGaussMySqlQuotasRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowAuditLogRequest, ShowAuditLogResponse> showAuditLog = genForshowAuditLog();

    private static HttpRequestDef<ShowAuditLogRequest, ShowAuditLogResponse> genForshowAuditLog() {
        // basic
        HttpRequestDef.Builder<ShowAuditLogRequest, ShowAuditLogResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowAuditLogRequest.class, ShowAuditLogResponse.class)
                .withName("ShowAuditLog")
                .withUri("/v3/{project_id}/instance/{instance_id}/audit-log/switch-status")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowAuditLogRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowAuditLogRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowAutoScalingPolicyRequest, ShowAutoScalingPolicyResponse> showAutoScalingPolicy =
        genForshowAutoScalingPolicy();

    private static HttpRequestDef<ShowAutoScalingPolicyRequest, ShowAutoScalingPolicyResponse> genForshowAutoScalingPolicy() {
        // basic
        HttpRequestDef.Builder<ShowAutoScalingPolicyRequest, ShowAutoScalingPolicyResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowAutoScalingPolicyRequest.class, ShowAutoScalingPolicyResponse.class)
            .withName("ShowAutoScalingPolicy")
            .withUri("/v3/{project_id}/instances/{instance_id}/auto-scaling/policy")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowAutoScalingPolicyRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowAutoScalingPolicyRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowBackupRestoreTimeRequest, ShowBackupRestoreTimeResponse> showBackupRestoreTime =
        genForshowBackupRestoreTime();

    private static HttpRequestDef<ShowBackupRestoreTimeRequest, ShowBackupRestoreTimeResponse> genForshowBackupRestoreTime() {
        // basic
        HttpRequestDef.Builder<ShowBackupRestoreTimeRequest, ShowBackupRestoreTimeResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowBackupRestoreTimeRequest.class, ShowBackupRestoreTimeResponse.class)
            .withName("ShowBackupRestoreTime")
            .withUri("/v3/{project_id}/instances/{instance_id}/restore-time")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowBackupRestoreTimeRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<String>withRequestField("date",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowBackupRestoreTimeRequest::getDate, (req, v) -> {
                req.setDate(v);
            }));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowBackupRestoreTimeRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowDedicatedResourceInfoRequest, ShowDedicatedResourceInfoResponse> showDedicatedResourceInfo =
        genForshowDedicatedResourceInfo();

    private static HttpRequestDef<ShowDedicatedResourceInfoRequest, ShowDedicatedResourceInfoResponse> genForshowDedicatedResourceInfo() {
        // basic
        HttpRequestDef.Builder<ShowDedicatedResourceInfoRequest, ShowDedicatedResourceInfoResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ShowDedicatedResourceInfoRequest.class,
                    ShowDedicatedResourceInfoResponse.class)
                .withName("ShowDedicatedResourceInfo")
                .withUri("/v3/{project_id}/dedicated-resource/{dedicated_resource_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("dedicated_resource_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDedicatedResourceInfoRequest::getDedicatedResourceId, (req, v) -> {
                req.setDedicatedResourceId(v);
            }));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDedicatedResourceInfoRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowGaussMySqlBackupListRequest, ShowGaussMySqlBackupListResponse> showGaussMySqlBackupList =
        genForshowGaussMySqlBackupList();

    private static HttpRequestDef<ShowGaussMySqlBackupListRequest, ShowGaussMySqlBackupListResponse> genForshowGaussMySqlBackupList() {
        // basic
        HttpRequestDef.Builder<ShowGaussMySqlBackupListRequest, ShowGaussMySqlBackupListResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET, ShowGaussMySqlBackupListRequest.class, ShowGaussMySqlBackupListResponse.class)
                .withName("ShowGaussMySqlBackupList")
                .withUri("/v3/{project_id}/backups")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowGaussMySqlBackupListRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<String>withRequestField("backup_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowGaussMySqlBackupListRequest::getBackupId, (req, v) -> {
                req.setBackupId(v);
            }));
        builder.<String>withRequestField("backup_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowGaussMySqlBackupListRequest::getBackupType, (req, v) -> {
                req.setBackupType(v);
            }));
        builder.<String>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowGaussMySqlBackupListRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<String>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowGaussMySqlBackupListRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("begin_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowGaussMySqlBackupListRequest::getBeginTime, (req, v) -> {
                req.setBeginTime(v);
            }));
        builder.<String>withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowGaussMySqlBackupListRequest::getEndTime, (req, v) -> {
                req.setEndTime(v);
            }));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowGaussMySqlBackupListRequest::getName, (req, v) -> {
                req.setName(v);
            }));
        builder.<String>withRequestField("instance_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowGaussMySqlBackupListRequest::getInstanceName, (req, v) -> {
                req.setInstanceName(v);
            }));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowGaussMySqlBackupListRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowGaussMySqlBackupPolicyRequest, ShowGaussMySqlBackupPolicyResponse> showGaussMySqlBackupPolicy =
        genForshowGaussMySqlBackupPolicy();

    private static HttpRequestDef<ShowGaussMySqlBackupPolicyRequest, ShowGaussMySqlBackupPolicyResponse> genForshowGaussMySqlBackupPolicy() {
        // basic
        HttpRequestDef.Builder<ShowGaussMySqlBackupPolicyRequest, ShowGaussMySqlBackupPolicyResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ShowGaussMySqlBackupPolicyRequest.class,
                    ShowGaussMySqlBackupPolicyResponse.class)
                .withName("ShowGaussMySqlBackupPolicy")
                .withUri("/v3/{project_id}/instances/{instance_id}/backups/policy")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowGaussMySqlBackupPolicyRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowGaussMySqlBackupPolicyRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowGaussMySqlConfigurationRequest, ShowGaussMySqlConfigurationResponse> showGaussMySqlConfiguration =
        genForshowGaussMySqlConfiguration();

    private static HttpRequestDef<ShowGaussMySqlConfigurationRequest, ShowGaussMySqlConfigurationResponse> genForshowGaussMySqlConfiguration() {
        // basic
        HttpRequestDef.Builder<ShowGaussMySqlConfigurationRequest, ShowGaussMySqlConfigurationResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ShowGaussMySqlConfigurationRequest.class,
                    ShowGaussMySqlConfigurationResponse.class)
                .withName("ShowGaussMySqlConfiguration")
                .withUri("/v3/{project_id}/configurations/{configuration_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("configuration_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowGaussMySqlConfigurationRequest::getConfigurationId, (req, v) -> {
                req.setConfigurationId(v);
            }));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowGaussMySqlConfigurationRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowGaussMySqlEngineVersionRequest, ShowGaussMySqlEngineVersionResponse> showGaussMySqlEngineVersion =
        genForshowGaussMySqlEngineVersion();

    private static HttpRequestDef<ShowGaussMySqlEngineVersionRequest, ShowGaussMySqlEngineVersionResponse> genForshowGaussMySqlEngineVersion() {
        // basic
        HttpRequestDef.Builder<ShowGaussMySqlEngineVersionRequest, ShowGaussMySqlEngineVersionResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ShowGaussMySqlEngineVersionRequest.class,
                    ShowGaussMySqlEngineVersionResponse.class)
                .withName("ShowGaussMySqlEngineVersion")
                .withUri("/v3/{project_id}/datastores/{database_name}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("database_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowGaussMySqlEngineVersionRequest::getDatabaseName, (req, v) -> {
                req.setDatabaseName(v);
            }));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowGaussMySqlEngineVersionRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowGaussMySqlFlavorsRequest, ShowGaussMySqlFlavorsResponse> showGaussMySqlFlavors =
        genForshowGaussMySqlFlavors();

    private static HttpRequestDef<ShowGaussMySqlFlavorsRequest, ShowGaussMySqlFlavorsResponse> genForshowGaussMySqlFlavors() {
        // basic
        HttpRequestDef.Builder<ShowGaussMySqlFlavorsRequest, ShowGaussMySqlFlavorsResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowGaussMySqlFlavorsRequest.class, ShowGaussMySqlFlavorsResponse.class)
            .withName("ShowGaussMySqlFlavors")
            .withUri("/v3/{project_id}/flavors/{database_name}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("database_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowGaussMySqlFlavorsRequest::getDatabaseName, (req, v) -> {
                req.setDatabaseName(v);
            }));
        builder.<String>withRequestField("version_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowGaussMySqlFlavorsRequest::getVersionName, (req, v) -> {
                req.setVersionName(v);
            }));
        builder.<String>withRequestField("availability_zone_mode",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowGaussMySqlFlavorsRequest::getAvailabilityZoneMode, (req, v) -> {
                req.setAvailabilityZoneMode(v);
            }));
        builder.<String>withRequestField("spec_code",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowGaussMySqlFlavorsRequest::getSpecCode, (req, v) -> {
                req.setSpecCode(v);
            }));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowGaussMySqlFlavorsRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowGaussMySqlIncrementalBackupListRequest, ShowGaussMySqlIncrementalBackupListResponse> showGaussMySqlIncrementalBackupList =
        genForshowGaussMySqlIncrementalBackupList();

    private static HttpRequestDef<ShowGaussMySqlIncrementalBackupListRequest, ShowGaussMySqlIncrementalBackupListResponse> genForshowGaussMySqlIncrementalBackupList() {
        // basic
        HttpRequestDef.Builder<ShowGaussMySqlIncrementalBackupListRequest, ShowGaussMySqlIncrementalBackupListResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ShowGaussMySqlIncrementalBackupListRequest.class,
                    ShowGaussMySqlIncrementalBackupListResponse.class)
                .withName("ShowGaussMySqlIncrementalBackupList")
                .withUri("/v3/{project_id}/instances/{instance_id}/incremental-backups")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowGaussMySqlIncrementalBackupListRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<String>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowGaussMySqlIncrementalBackupListRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<String>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowGaussMySqlIncrementalBackupListRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("begin_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowGaussMySqlIncrementalBackupListRequest::getBeginTime, (req, v) -> {
                req.setBeginTime(v);
            }));
        builder.<String>withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowGaussMySqlIncrementalBackupListRequest::getEndTime, (req, v) -> {
                req.setEndTime(v);
            }));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowGaussMySqlIncrementalBackupListRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowGaussMySqlInstanceInfoRequest, ShowGaussMySqlInstanceInfoResponse> showGaussMySqlInstanceInfo =
        genForshowGaussMySqlInstanceInfo();

    private static HttpRequestDef<ShowGaussMySqlInstanceInfoRequest, ShowGaussMySqlInstanceInfoResponse> genForshowGaussMySqlInstanceInfo() {
        // basic
        HttpRequestDef.Builder<ShowGaussMySqlInstanceInfoRequest, ShowGaussMySqlInstanceInfoResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ShowGaussMySqlInstanceInfoRequest.class,
                    ShowGaussMySqlInstanceInfoResponse.class)
                .withName("ShowGaussMySqlInstanceInfo")
                .withUri("/v3/{project_id}/instances/{instance_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowGaussMySqlInstanceInfoRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowGaussMySqlInstanceInfoRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowGaussMySqlJobInfoRequest, ShowGaussMySqlJobInfoResponse> showGaussMySqlJobInfo =
        genForshowGaussMySqlJobInfo();

    private static HttpRequestDef<ShowGaussMySqlJobInfoRequest, ShowGaussMySqlJobInfoResponse> genForshowGaussMySqlJobInfo() {
        // basic
        HttpRequestDef.Builder<ShowGaussMySqlJobInfoRequest, ShowGaussMySqlJobInfoResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowGaussMySqlJobInfoRequest.class, ShowGaussMySqlJobInfoResponse.class)
            .withName("ShowGaussMySqlJobInfo")
            .withUri("/v3/{project_id}/jobs")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowGaussMySqlJobInfoRequest::getId, (req, v) -> {
                req.setId(v);
            }));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowGaussMySqlJobInfoRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowGaussMySqlProjectQuotasRequest, ShowGaussMySqlProjectQuotasResponse> showGaussMySqlProjectQuotas =
        genForshowGaussMySqlProjectQuotas();

    private static HttpRequestDef<ShowGaussMySqlProjectQuotasRequest, ShowGaussMySqlProjectQuotasResponse> genForshowGaussMySqlProjectQuotas() {
        // basic
        HttpRequestDef.Builder<ShowGaussMySqlProjectQuotasRequest, ShowGaussMySqlProjectQuotasResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ShowGaussMySqlProjectQuotasRequest.class,
                    ShowGaussMySqlProjectQuotasResponse.class)
                .withName("ShowGaussMySqlProjectQuotas")
                .withUri("/v3/{project_id}/project-quotas")
                .withContentType("application/json");

        // requests
        builder.<ShowGaussMySqlProjectQuotasRequest.TypeEnum>withRequestField("type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ShowGaussMySqlProjectQuotasRequest.TypeEnum.class),
            f -> f.withMarshaller(ShowGaussMySqlProjectQuotasRequest::getType, (req, v) -> {
                req.setType(v);
            }));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowGaussMySqlProjectQuotasRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowGaussMySqlProxyFlavorsRequest, ShowGaussMySqlProxyFlavorsResponse> showGaussMySqlProxyFlavors =
        genForshowGaussMySqlProxyFlavors();

    private static HttpRequestDef<ShowGaussMySqlProxyFlavorsRequest, ShowGaussMySqlProxyFlavorsResponse> genForshowGaussMySqlProxyFlavors() {
        // basic
        HttpRequestDef.Builder<ShowGaussMySqlProxyFlavorsRequest, ShowGaussMySqlProxyFlavorsResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ShowGaussMySqlProxyFlavorsRequest.class,
                    ShowGaussMySqlProxyFlavorsResponse.class)
                .withName("ShowGaussMySqlProxyFlavors")
                .withUri("/v3/{project_id}/instances/{instance_id}/proxy/flavors")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowGaussMySqlProxyFlavorsRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowGaussMySqlProxyFlavorsRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowGaussMySqlProxyListRequest, ShowGaussMySqlProxyListResponse> showGaussMySqlProxyList =
        genForshowGaussMySqlProxyList();

    private static HttpRequestDef<ShowGaussMySqlProxyListRequest, ShowGaussMySqlProxyListResponse> genForshowGaussMySqlProxyList() {
        // basic
        HttpRequestDef.Builder<ShowGaussMySqlProxyListRequest, ShowGaussMySqlProxyListResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowGaussMySqlProxyListRequest.class, ShowGaussMySqlProxyListResponse.class)
            .withName("ShowGaussMySqlProxyList")
            .withUri("/v3/{project_id}/instances/{instance_id}/proxies")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowGaussMySqlProxyListRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowGaussMySqlProxyListRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowGaussMySqlProxyListRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowGaussMySqlProxyListRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowGaussMySqlQuotasRequest, ShowGaussMySqlQuotasResponse> showGaussMySqlQuotas =
        genForshowGaussMySqlQuotas();

    private static HttpRequestDef<ShowGaussMySqlQuotasRequest, ShowGaussMySqlQuotasResponse> genForshowGaussMySqlQuotas() {
        // basic
        HttpRequestDef.Builder<ShowGaussMySqlQuotasRequest, ShowGaussMySqlQuotasResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowGaussMySqlQuotasRequest.class, ShowGaussMySqlQuotasResponse.class)
            .withName("ShowGaussMySqlQuotas")
            .withUri("/v3/{project_id}/quotas")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowGaussMySqlQuotasRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<String>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowGaussMySqlQuotasRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("enterprise_project_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowGaussMySqlQuotasRequest::getEnterpriseProjectName, (req, v) -> {
                req.setEnterpriseProjectName(v);
            }));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowGaussMySqlQuotasRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowInstanceDatabaseVersionRequest, ShowInstanceDatabaseVersionResponse> showInstanceDatabaseVersion =
        genForshowInstanceDatabaseVersion();

    private static HttpRequestDef<ShowInstanceDatabaseVersionRequest, ShowInstanceDatabaseVersionResponse> genForshowInstanceDatabaseVersion() {
        // basic
        HttpRequestDef.Builder<ShowInstanceDatabaseVersionRequest, ShowInstanceDatabaseVersionResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ShowInstanceDatabaseVersionRequest.class,
                    ShowInstanceDatabaseVersionResponse.class)
                .withName("ShowInstanceDatabaseVersion")
                .withUri("/v3/{project_id}/instances/{instance_id}/database-version")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowInstanceDatabaseVersionRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowInstanceDatabaseVersionRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowInstanceMonitorExtendRequest, ShowInstanceMonitorExtendResponse> showInstanceMonitorExtend =
        genForshowInstanceMonitorExtend();

    private static HttpRequestDef<ShowInstanceMonitorExtendRequest, ShowInstanceMonitorExtendResponse> genForshowInstanceMonitorExtend() {
        // basic
        HttpRequestDef.Builder<ShowInstanceMonitorExtendRequest, ShowInstanceMonitorExtendResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ShowInstanceMonitorExtendRequest.class,
                    ShowInstanceMonitorExtendResponse.class)
                .withName("ShowInstanceMonitorExtend")
                .withUri("/v3/{project_id}/instances/{instance_id}/monitor-policy")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowInstanceMonitorExtendRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowInstanceMonitorExtendRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowIntelligentDiagnosisAbnormalCountOfInstancesRequest, ShowIntelligentDiagnosisAbnormalCountOfInstancesResponse> showIntelligentDiagnosisAbnormalCountOfInstances =
        genForshowIntelligentDiagnosisAbnormalCountOfInstances();

    private static HttpRequestDef<ShowIntelligentDiagnosisAbnormalCountOfInstancesRequest, ShowIntelligentDiagnosisAbnormalCountOfInstancesResponse> genForshowIntelligentDiagnosisAbnormalCountOfInstances() {
        // basic
        HttpRequestDef.Builder<ShowIntelligentDiagnosisAbnormalCountOfInstancesRequest, ShowIntelligentDiagnosisAbnormalCountOfInstancesResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ShowIntelligentDiagnosisAbnormalCountOfInstancesRequest.class,
                    ShowIntelligentDiagnosisAbnormalCountOfInstancesResponse.class)
                .withName("ShowIntelligentDiagnosisAbnormalCountOfInstances")
                .withUri("/v3/{project_id}/instances/diagnosis-instance-count")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowIntelligentDiagnosisAbnormalCountOfInstancesRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowIntelligentDiagnosisInstanceInfosPerMetricRequest, ShowIntelligentDiagnosisInstanceInfosPerMetricResponse> showIntelligentDiagnosisInstanceInfosPerMetric =
        genForshowIntelligentDiagnosisInstanceInfosPerMetric();

    private static HttpRequestDef<ShowIntelligentDiagnosisInstanceInfosPerMetricRequest, ShowIntelligentDiagnosisInstanceInfosPerMetricResponse> genForshowIntelligentDiagnosisInstanceInfosPerMetric() {
        // basic
        HttpRequestDef.Builder<ShowIntelligentDiagnosisInstanceInfosPerMetricRequest, ShowIntelligentDiagnosisInstanceInfosPerMetricResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ShowIntelligentDiagnosisInstanceInfosPerMetricRequest.class,
                    ShowIntelligentDiagnosisInstanceInfosPerMetricResponse.class)
                .withName("ShowIntelligentDiagnosisInstanceInfosPerMetric")
                .withUri("/v3/{project_id}/instances/diagnosis-instance-infos")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("metric_name",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowIntelligentDiagnosisInstanceInfosPerMetricRequest::getMetricName, (req, v) -> {
                req.setMetricName(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowIntelligentDiagnosisInstanceInfosPerMetricRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowIntelligentDiagnosisInstanceInfosPerMetricRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowIntelligentDiagnosisInstanceInfosPerMetricRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShrinkGaussMySqlProxyRequest, ShrinkGaussMySqlProxyResponse> shrinkGaussMySqlProxy =
        genForshrinkGaussMySqlProxy();

    private static HttpRequestDef<ShrinkGaussMySqlProxyRequest, ShrinkGaussMySqlProxyResponse> genForshrinkGaussMySqlProxy() {
        // basic
        HttpRequestDef.Builder<ShrinkGaussMySqlProxyRequest, ShrinkGaussMySqlProxyResponse> builder = HttpRequestDef
            .builder(HttpMethod.PUT, ShrinkGaussMySqlProxyRequest.class, ShrinkGaussMySqlProxyResponse.class)
            .withName("ShrinkGaussMySqlProxy")
            .withUri("/v3/{project_id}/instances/{instance_id}/proxy/{proxy_id}/reduce")
            .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShrinkGaussMySqlProxyRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<String>withRequestField("proxy_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShrinkGaussMySqlProxyRequest::getProxyId, (req, v) -> {
                req.setProxyId(v);
            }));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShrinkGaussMySqlProxyRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));
        builder.<ShrinkGaussMySqlProxyRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ShrinkGaussMySqlProxyRequestBody.class),
            f -> f.withMarshaller(ShrinkGaussMySqlProxyRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<SwitchAccessControlRequest, SwitchAccessControlResponse> switchAccessControl =
        genForswitchAccessControl();

    private static HttpRequestDef<SwitchAccessControlRequest, SwitchAccessControlResponse> genForswitchAccessControl() {
        // basic
        HttpRequestDef.Builder<SwitchAccessControlRequest, SwitchAccessControlResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, SwitchAccessControlRequest.class, SwitchAccessControlResponse.class)
                .withName("SwitchAccessControl")
                .withUri("/v3/{project_id}/instances/{instance_id}/proxy/{proxy_id}/access-control-switch")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SwitchAccessControlRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<String>withRequestField("proxy_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SwitchAccessControlRequest::getProxyId, (req, v) -> {
                req.setProxyId(v);
            }));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SwitchAccessControlRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));
        builder.<SwitchAccessControlRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(SwitchAccessControlRequestBody.class),
            f -> f.withMarshaller(SwitchAccessControlRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<SwitchGaussMySqlConfigurationRequest, SwitchGaussMySqlConfigurationResponse> switchGaussMySqlConfiguration =
        genForswitchGaussMySqlConfiguration();

    private static HttpRequestDef<SwitchGaussMySqlConfigurationRequest, SwitchGaussMySqlConfigurationResponse> genForswitchGaussMySqlConfiguration() {
        // basic
        HttpRequestDef.Builder<SwitchGaussMySqlConfigurationRequest, SwitchGaussMySqlConfigurationResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.PUT,
                    SwitchGaussMySqlConfigurationRequest.class,
                    SwitchGaussMySqlConfigurationResponse.class)
                .withName("SwitchGaussMySqlConfiguration")
                .withUri("/v3/{project_id}/configurations/{configuration_id}/apply")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("configuration_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SwitchGaussMySqlConfigurationRequest::getConfigurationId, (req, v) -> {
                req.setConfigurationId(v);
            }));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SwitchGaussMySqlConfigurationRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));
        builder.<ApplyConfigurationRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ApplyConfigurationRequestBody.class),
            f -> f.withMarshaller(SwitchGaussMySqlConfigurationRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<SwitchGaussMySqlInstanceSslRequest, SwitchGaussMySqlInstanceSslResponse> switchGaussMySqlInstanceSsl =
        genForswitchGaussMySqlInstanceSsl();

    private static HttpRequestDef<SwitchGaussMySqlInstanceSslRequest, SwitchGaussMySqlInstanceSslResponse> genForswitchGaussMySqlInstanceSsl() {
        // basic
        HttpRequestDef.Builder<SwitchGaussMySqlInstanceSslRequest, SwitchGaussMySqlInstanceSslResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.PUT,
                    SwitchGaussMySqlInstanceSslRequest.class,
                    SwitchGaussMySqlInstanceSslResponse.class)
                .withName("SwitchGaussMySqlInstanceSsl")
                .withUri("/v3/{project_id}/instances/{instance_id}/ssl-option")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SwitchGaussMySqlInstanceSslRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SwitchGaussMySqlInstanceSslRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));
        builder.<SwitchSSLRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(SwitchSSLRequest.class),
            f -> f.withMarshaller(SwitchGaussMySqlInstanceSslRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateAuditLogRequest, UpdateAuditLogResponse> updateAuditLog =
        genForupdateAuditLog();

    private static HttpRequestDef<UpdateAuditLogRequest, UpdateAuditLogResponse> genForupdateAuditLog() {
        // basic
        HttpRequestDef.Builder<UpdateAuditLogRequest, UpdateAuditLogResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, UpdateAuditLogRequest.class, UpdateAuditLogResponse.class)
                .withName("UpdateAuditLog")
                .withUri("/v3/{project_id}/instance/{instance_id}/audit-log/switch")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateAuditLogRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateAuditLogRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));
        builder.<OperateAuditLogRequestV3Body>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(OperateAuditLogRequestV3Body.class),
            f -> f.withMarshaller(UpdateAuditLogRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateAutoScalingPolicyRequest, UpdateAutoScalingPolicyResponse> updateAutoScalingPolicy =
        genForupdateAutoScalingPolicy();

    private static HttpRequestDef<UpdateAutoScalingPolicyRequest, UpdateAutoScalingPolicyResponse> genForupdateAutoScalingPolicy() {
        // basic
        HttpRequestDef.Builder<UpdateAutoScalingPolicyRequest, UpdateAutoScalingPolicyResponse> builder = HttpRequestDef
            .builder(HttpMethod.PUT, UpdateAutoScalingPolicyRequest.class, UpdateAutoScalingPolicyResponse.class)
            .withName("UpdateAutoScalingPolicy")
            .withUri("/v3/{project_id}/instances/{instance_id}/auto-scaling/policy")
            .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateAutoScalingPolicyRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateAutoScalingPolicyRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));
        builder.<UpdateAutoScalingPolicyRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateAutoScalingPolicyRequestBody.class),
            f -> f.withMarshaller(UpdateAutoScalingPolicyRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateBackupOffsitePolicyRequest, UpdateBackupOffsitePolicyResponse> updateBackupOffsitePolicy =
        genForupdateBackupOffsitePolicy();

    private static HttpRequestDef<UpdateBackupOffsitePolicyRequest, UpdateBackupOffsitePolicyResponse> genForupdateBackupOffsitePolicy() {
        // basic
        HttpRequestDef.Builder<UpdateBackupOffsitePolicyRequest, UpdateBackupOffsitePolicyResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.PUT,
                    UpdateBackupOffsitePolicyRequest.class,
                    UpdateBackupOffsitePolicyResponse.class)
                .withName("UpdateBackupOffsitePolicy")
                .withUri("/v3/{project_id}/instances/{instance_id}/backups/offsite-policy")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateBackupOffsitePolicyRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateBackupOffsitePolicyRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));
        builder.<UpdateBackupOffsitePolicyRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateBackupOffsitePolicyRequestBody.class),
            f -> f.withMarshaller(UpdateBackupOffsitePolicyRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateGaussMySqlBackupPolicyRequest, UpdateGaussMySqlBackupPolicyResponse> updateGaussMySqlBackupPolicy =
        genForupdateGaussMySqlBackupPolicy();

    private static HttpRequestDef<UpdateGaussMySqlBackupPolicyRequest, UpdateGaussMySqlBackupPolicyResponse> genForupdateGaussMySqlBackupPolicy() {
        // basic
        HttpRequestDef.Builder<UpdateGaussMySqlBackupPolicyRequest, UpdateGaussMySqlBackupPolicyResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.PUT,
                    UpdateGaussMySqlBackupPolicyRequest.class,
                    UpdateGaussMySqlBackupPolicyResponse.class)
                .withName("UpdateGaussMySqlBackupPolicy")
                .withUri("/v3/{project_id}/instances/{instance_id}/backups/policy/update")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateGaussMySqlBackupPolicyRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateGaussMySqlBackupPolicyRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));
        builder.<MysqlUpdateBackupPolicyRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(MysqlUpdateBackupPolicyRequest.class),
            f -> f.withMarshaller(UpdateGaussMySqlBackupPolicyRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateGaussMySqlConfigurationRequest, UpdateGaussMySqlConfigurationResponse> updateGaussMySqlConfiguration =
        genForupdateGaussMySqlConfiguration();

    private static HttpRequestDef<UpdateGaussMySqlConfigurationRequest, UpdateGaussMySqlConfigurationResponse> genForupdateGaussMySqlConfiguration() {
        // basic
        HttpRequestDef.Builder<UpdateGaussMySqlConfigurationRequest, UpdateGaussMySqlConfigurationResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.PUT,
                    UpdateGaussMySqlConfigurationRequest.class,
                    UpdateGaussMySqlConfigurationResponse.class)
                .withName("UpdateGaussMySqlConfiguration")
                .withUri("/v3/{project_id}/configurations/{configuration_id}")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("configuration_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateGaussMySqlConfigurationRequest::getConfigurationId, (req, v) -> {
                req.setConfigurationId(v);
            }));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateGaussMySqlConfigurationRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));
        builder.<UpdateConfigurationParameterRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateConfigurationParameterRequestBody.class),
            f -> f.withMarshaller(UpdateGaussMySqlConfigurationRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateGaussMySqlDatabaseCommentRequest, UpdateGaussMySqlDatabaseCommentResponse> updateGaussMySqlDatabaseComment =
        genForupdateGaussMySqlDatabaseComment();

    private static HttpRequestDef<UpdateGaussMySqlDatabaseCommentRequest, UpdateGaussMySqlDatabaseCommentResponse> genForupdateGaussMySqlDatabaseComment() {
        // basic
        HttpRequestDef.Builder<UpdateGaussMySqlDatabaseCommentRequest, UpdateGaussMySqlDatabaseCommentResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.PUT,
                    UpdateGaussMySqlDatabaseCommentRequest.class,
                    UpdateGaussMySqlDatabaseCommentResponse.class)
                .withName("UpdateGaussMySqlDatabaseComment")
                .withUri("/v3/{project_id}/instances/{instance_id}/databases/comment")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateGaussMySqlDatabaseCommentRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateGaussMySqlDatabaseCommentRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));
        builder.<UpdateDatabaseCommentRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateDatabaseCommentRequest.class),
            f -> f.withMarshaller(UpdateGaussMySqlDatabaseCommentRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateGaussMySqlDatabaseUserCommentRequest, UpdateGaussMySqlDatabaseUserCommentResponse> updateGaussMySqlDatabaseUserComment =
        genForupdateGaussMySqlDatabaseUserComment();

    private static HttpRequestDef<UpdateGaussMySqlDatabaseUserCommentRequest, UpdateGaussMySqlDatabaseUserCommentResponse> genForupdateGaussMySqlDatabaseUserComment() {
        // basic
        HttpRequestDef.Builder<UpdateGaussMySqlDatabaseUserCommentRequest, UpdateGaussMySqlDatabaseUserCommentResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.PUT,
                    UpdateGaussMySqlDatabaseUserCommentRequest.class,
                    UpdateGaussMySqlDatabaseUserCommentResponse.class)
                .withName("UpdateGaussMySqlDatabaseUserComment")
                .withUri("/v3/{project_id}/instances/{instance_id}/db-users/comment")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateGaussMySqlDatabaseUserCommentRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateGaussMySqlDatabaseUserCommentRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));
        builder.<UpdateDatabaseUserCommentRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateDatabaseUserCommentRequest.class),
            f -> f.withMarshaller(UpdateGaussMySqlDatabaseUserCommentRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateGaussMySqlInstanceAliasRequest, UpdateGaussMySqlInstanceAliasResponse> updateGaussMySqlInstanceAlias =
        genForupdateGaussMySqlInstanceAlias();

    private static HttpRequestDef<UpdateGaussMySqlInstanceAliasRequest, UpdateGaussMySqlInstanceAliasResponse> genForupdateGaussMySqlInstanceAlias() {
        // basic
        HttpRequestDef.Builder<UpdateGaussMySqlInstanceAliasRequest, UpdateGaussMySqlInstanceAliasResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.PUT,
                    UpdateGaussMySqlInstanceAliasRequest.class,
                    UpdateGaussMySqlInstanceAliasResponse.class)
                .withName("UpdateGaussMySqlInstanceAlias")
                .withUri("/v3/{project_id}/instances/{instance_id}/alias")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateGaussMySqlInstanceAliasRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateGaussMySqlInstanceAliasRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));
        builder.<ModifyAliasRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ModifyAliasRequest.class),
            f -> f.withMarshaller(UpdateGaussMySqlInstanceAliasRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response
        builder.<String>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(UpdateGaussMySqlInstanceAliasResponse::getBody, (response, data) -> {
                response.setBody(data);
            }));

        return builder.build();
    }

    public static final HttpRequestDef<UpdateGaussMySqlInstanceEipRequest, UpdateGaussMySqlInstanceEipResponse> updateGaussMySqlInstanceEip =
        genForupdateGaussMySqlInstanceEip();

    private static HttpRequestDef<UpdateGaussMySqlInstanceEipRequest, UpdateGaussMySqlInstanceEipResponse> genForupdateGaussMySqlInstanceEip() {
        // basic
        HttpRequestDef.Builder<UpdateGaussMySqlInstanceEipRequest, UpdateGaussMySqlInstanceEipResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.PUT,
                    UpdateGaussMySqlInstanceEipRequest.class,
                    UpdateGaussMySqlInstanceEipResponse.class)
                .withName("UpdateGaussMySqlInstanceEip")
                .withUri("/v3/{project_id}/instances/{instance_id}/public-ips/bind")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateGaussMySqlInstanceEipRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateGaussMySqlInstanceEipRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));
        builder.<ModifyBindEipRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ModifyBindEipRequest.class),
            f -> f.withMarshaller(UpdateGaussMySqlInstanceEipRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateGaussMySqlInstanceInternalIpRequest, UpdateGaussMySqlInstanceInternalIpResponse> updateGaussMySqlInstanceInternalIp =
        genForupdateGaussMySqlInstanceInternalIp();

    private static HttpRequestDef<UpdateGaussMySqlInstanceInternalIpRequest, UpdateGaussMySqlInstanceInternalIpResponse> genForupdateGaussMySqlInstanceInternalIp() {
        // basic
        HttpRequestDef.Builder<UpdateGaussMySqlInstanceInternalIpRequest, UpdateGaussMySqlInstanceInternalIpResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.PUT,
                    UpdateGaussMySqlInstanceInternalIpRequest.class,
                    UpdateGaussMySqlInstanceInternalIpResponse.class)
                .withName("UpdateGaussMySqlInstanceInternalIp")
                .withUri("/v3/{project_id}/instances/{instance_id}/internal-ip")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateGaussMySqlInstanceInternalIpRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateGaussMySqlInstanceInternalIpRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));
        builder.<ModifyInternalIpRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ModifyInternalIpRequest.class),
            f -> f.withMarshaller(UpdateGaussMySqlInstanceInternalIpRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateGaussMySqlInstanceNameRequest, UpdateGaussMySqlInstanceNameResponse> updateGaussMySqlInstanceName =
        genForupdateGaussMySqlInstanceName();

    private static HttpRequestDef<UpdateGaussMySqlInstanceNameRequest, UpdateGaussMySqlInstanceNameResponse> genForupdateGaussMySqlInstanceName() {
        // basic
        HttpRequestDef.Builder<UpdateGaussMySqlInstanceNameRequest, UpdateGaussMySqlInstanceNameResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.PUT,
                    UpdateGaussMySqlInstanceNameRequest.class,
                    UpdateGaussMySqlInstanceNameResponse.class)
                .withName("UpdateGaussMySqlInstanceName")
                .withUri("/v3/{project_id}/instances/{instance_id}/name")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateGaussMySqlInstanceNameRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateGaussMySqlInstanceNameRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));
        builder.<MysqlUpdateInstanceNameRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(MysqlUpdateInstanceNameRequest.class),
            f -> f.withMarshaller(UpdateGaussMySqlInstanceNameRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateGaussMySqlInstanceOpsWindowRequest, UpdateGaussMySqlInstanceOpsWindowResponse> updateGaussMySqlInstanceOpsWindow =
        genForupdateGaussMySqlInstanceOpsWindow();

    private static HttpRequestDef<UpdateGaussMySqlInstanceOpsWindowRequest, UpdateGaussMySqlInstanceOpsWindowResponse> genForupdateGaussMySqlInstanceOpsWindow() {
        // basic
        HttpRequestDef.Builder<UpdateGaussMySqlInstanceOpsWindowRequest, UpdateGaussMySqlInstanceOpsWindowResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.PUT,
                    UpdateGaussMySqlInstanceOpsWindowRequest.class,
                    UpdateGaussMySqlInstanceOpsWindowResponse.class)
                .withName("UpdateGaussMySqlInstanceOpsWindow")
                .withUri("/v3/{project_id}/instances/{instance_id}/ops-window")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateGaussMySqlInstanceOpsWindowRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateGaussMySqlInstanceOpsWindowRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));
        builder.<ModifyOpsWindow>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ModifyOpsWindow.class),
            f -> f.withMarshaller(UpdateGaussMySqlInstanceOpsWindowRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response
        builder.<String>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(UpdateGaussMySqlInstanceOpsWindowResponse::getBody, (response, data) -> {
                response.setBody(data);
            }));

        return builder.build();
    }

    public static final HttpRequestDef<UpdateGaussMySqlInstancePortRequest, UpdateGaussMySqlInstancePortResponse> updateGaussMySqlInstancePort =
        genForupdateGaussMySqlInstancePort();

    private static HttpRequestDef<UpdateGaussMySqlInstancePortRequest, UpdateGaussMySqlInstancePortResponse> genForupdateGaussMySqlInstancePort() {
        // basic
        HttpRequestDef.Builder<UpdateGaussMySqlInstancePortRequest, UpdateGaussMySqlInstancePortResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.PUT,
                    UpdateGaussMySqlInstancePortRequest.class,
                    UpdateGaussMySqlInstancePortResponse.class)
                .withName("UpdateGaussMySqlInstancePort")
                .withUri("/v3/{project_id}/instances/{instance_id}/port")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateGaussMySqlInstancePortRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateGaussMySqlInstancePortRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));
        builder.<ModifyPortRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ModifyPortRequest.class),
            f -> f.withMarshaller(UpdateGaussMySqlInstancePortRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateGaussMySqlInstanceSecurityGroupRequest, UpdateGaussMySqlInstanceSecurityGroupResponse> updateGaussMySqlInstanceSecurityGroup =
        genForupdateGaussMySqlInstanceSecurityGroup();

    private static HttpRequestDef<UpdateGaussMySqlInstanceSecurityGroupRequest, UpdateGaussMySqlInstanceSecurityGroupResponse> genForupdateGaussMySqlInstanceSecurityGroup() {
        // basic
        HttpRequestDef.Builder<UpdateGaussMySqlInstanceSecurityGroupRequest, UpdateGaussMySqlInstanceSecurityGroupResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.PUT,
                    UpdateGaussMySqlInstanceSecurityGroupRequest.class,
                    UpdateGaussMySqlInstanceSecurityGroupResponse.class)
                .withName("UpdateGaussMySqlInstanceSecurityGroup")
                .withUri("/v3/{project_id}/instances/{instance_id}/security-group")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateGaussMySqlInstanceSecurityGroupRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateGaussMySqlInstanceSecurityGroupRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));
        builder.<ModifySecurityGroupRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ModifySecurityGroupRequest.class),
            f -> f.withMarshaller(UpdateGaussMySqlInstanceSecurityGroupRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateGaussMySqlQuotasRequest, UpdateGaussMySqlQuotasResponse> updateGaussMySqlQuotas =
        genForupdateGaussMySqlQuotas();

    private static HttpRequestDef<UpdateGaussMySqlQuotasRequest, UpdateGaussMySqlQuotasResponse> genForupdateGaussMySqlQuotas() {
        // basic
        HttpRequestDef.Builder<UpdateGaussMySqlQuotasRequest, UpdateGaussMySqlQuotasResponse> builder = HttpRequestDef
            .builder(HttpMethod.PUT, UpdateGaussMySqlQuotasRequest.class, UpdateGaussMySqlQuotasResponse.class)
            .withName("UpdateGaussMySqlQuotas")
            .withUri("/v3/{project_id}/quotas")
            .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateGaussMySqlQuotasRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));
        builder.<SetQuotasRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(SetQuotasRequestBody.class),
            f -> f.withMarshaller(UpdateGaussMySqlQuotasRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateInstanceConfigurationsRequest, UpdateInstanceConfigurationsResponse> updateInstanceConfigurations =
        genForupdateInstanceConfigurations();

    private static HttpRequestDef<UpdateInstanceConfigurationsRequest, UpdateInstanceConfigurationsResponse> genForupdateInstanceConfigurations() {
        // basic
        HttpRequestDef.Builder<UpdateInstanceConfigurationsRequest, UpdateInstanceConfigurationsResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.PUT,
                    UpdateInstanceConfigurationsRequest.class,
                    UpdateInstanceConfigurationsResponse.class)
                .withName("UpdateInstanceConfigurations")
                .withUri("/v3/{project_id}/instances/{instance_id}/configurations")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateInstanceConfigurationsRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateInstanceConfigurationsRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));
        builder.<UpdateInstanceConfigurationsRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateInstanceConfigurationsRequestBody.class),
            f -> f.withMarshaller(UpdateInstanceConfigurationsRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateInstanceMonitorRequest, UpdateInstanceMonitorResponse> updateInstanceMonitor =
        genForupdateInstanceMonitor();

    private static HttpRequestDef<UpdateInstanceMonitorRequest, UpdateInstanceMonitorResponse> genForupdateInstanceMonitor() {
        // basic
        HttpRequestDef.Builder<UpdateInstanceMonitorRequest, UpdateInstanceMonitorResponse> builder = HttpRequestDef
            .builder(HttpMethod.PUT, UpdateInstanceMonitorRequest.class, UpdateInstanceMonitorResponse.class)
            .withName("UpdateInstanceMonitor")
            .withUri("/v3/{project_id}/instances/{instance_id}/monitor-policy")
            .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateInstanceMonitorRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateInstanceMonitorRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));
        builder.<TaurusModifyInstanceMonitorRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(TaurusModifyInstanceMonitorRequestBody.class),
            f -> f.withMarshaller(UpdateInstanceMonitorRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateProxyConnectionPoolTypeRequest, UpdateProxyConnectionPoolTypeResponse> updateProxyConnectionPoolType =
        genForupdateProxyConnectionPoolType();

    private static HttpRequestDef<UpdateProxyConnectionPoolTypeRequest, UpdateProxyConnectionPoolTypeResponse> genForupdateProxyConnectionPoolType() {
        // basic
        HttpRequestDef.Builder<UpdateProxyConnectionPoolTypeRequest, UpdateProxyConnectionPoolTypeResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.PUT,
                    UpdateProxyConnectionPoolTypeRequest.class,
                    UpdateProxyConnectionPoolTypeResponse.class)
                .withName("UpdateProxyConnectionPoolType")
                .withUri("/v3/{project_id}/instances/{instance_id}/proxy/{proxy_id}/connection-pool-type")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateProxyConnectionPoolTypeRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<String>withRequestField("proxy_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateProxyConnectionPoolTypeRequest::getProxyId, (req, v) -> {
                req.setProxyId(v);
            }));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateProxyConnectionPoolTypeRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));
        builder.<ProxyUpdateProxyConnectionPoolTypeRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ProxyUpdateProxyConnectionPoolTypeRequest.class),
            f -> f.withMarshaller(UpdateProxyConnectionPoolTypeRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateProxyNewConfigurationsRequest, UpdateProxyNewConfigurationsResponse> updateProxyNewConfigurations =
        genForupdateProxyNewConfigurations();

    private static HttpRequestDef<UpdateProxyNewConfigurationsRequest, UpdateProxyNewConfigurationsResponse> genForupdateProxyNewConfigurations() {
        // basic
        HttpRequestDef.Builder<UpdateProxyNewConfigurationsRequest, UpdateProxyNewConfigurationsResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.PUT,
                    UpdateProxyNewConfigurationsRequest.class,
                    UpdateProxyNewConfigurationsResponse.class)
                .withName("UpdateProxyNewConfigurations")
                .withUri("/v3/{project_id}/instances/{instance_id}/proxy/{proxy_id}/configurations")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateProxyNewConfigurationsRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<String>withRequestField("proxy_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateProxyNewConfigurationsRequest::getProxyId, (req, v) -> {
                req.setProxyId(v);
            }));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateProxyNewConfigurationsRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));
        builder.<UpdateProxyNewConfigRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateProxyNewConfigRequestBody.class),
            f -> f.withMarshaller(UpdateProxyNewConfigurationsRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateProxyPortRequest, UpdateProxyPortResponse> updateProxyPort =
        genForupdateProxyPort();

    private static HttpRequestDef<UpdateProxyPortRequest, UpdateProxyPortResponse> genForupdateProxyPort() {
        // basic
        HttpRequestDef.Builder<UpdateProxyPortRequest, UpdateProxyPortResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateProxyPortRequest.class, UpdateProxyPortResponse.class)
                .withName("UpdateProxyPort")
                .withUri("/v3/{project_id}/instances/{instance_id}/proxy/{proxy_id}/port")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateProxyPortRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<String>withRequestField("proxy_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateProxyPortRequest::getProxyId, (req, v) -> {
                req.setProxyId(v);
            }));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateProxyPortRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));
        builder.<UpdateProxyPortRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateProxyPortRequestBody.class),
            f -> f.withMarshaller(UpdateProxyPortRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateProxySessionConsistenceRequest, UpdateProxySessionConsistenceResponse> updateProxySessionConsistence =
        genForupdateProxySessionConsistence();

    private static HttpRequestDef<UpdateProxySessionConsistenceRequest, UpdateProxySessionConsistenceResponse> genForupdateProxySessionConsistence() {
        // basic
        HttpRequestDef.Builder<UpdateProxySessionConsistenceRequest, UpdateProxySessionConsistenceResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.PUT,
                    UpdateProxySessionConsistenceRequest.class,
                    UpdateProxySessionConsistenceResponse.class)
                .withName("UpdateProxySessionConsistence")
                .withUri("/v3/{project_id}/instances/{instance_id}/proxy/{proxy_id}/session-consistence")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateProxySessionConsistenceRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<String>withRequestField("proxy_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateProxySessionConsistenceRequest::getProxyId, (req, v) -> {
                req.setProxyId(v);
            }));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateProxySessionConsistenceRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));
        builder.<ModifyProxyConsistRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ModifyProxyConsistRequest.class),
            f -> f.withMarshaller(UpdateProxySessionConsistenceRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateTransactionSplitStatusRequest, UpdateTransactionSplitStatusResponse> updateTransactionSplitStatus =
        genForupdateTransactionSplitStatus();

    private static HttpRequestDef<UpdateTransactionSplitStatusRequest, UpdateTransactionSplitStatusResponse> genForupdateTransactionSplitStatus() {
        // basic
        HttpRequestDef.Builder<UpdateTransactionSplitStatusRequest, UpdateTransactionSplitStatusResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    UpdateTransactionSplitStatusRequest.class,
                    UpdateTransactionSplitStatusResponse.class)
                .withName("UpdateTransactionSplitStatus")
                .withUri("/v3/{project_id}/instances/{instance_id}/proxy/transaction-split")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateTransactionSplitStatusRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateTransactionSplitStatusRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));
        builder.<ProxyTransactionSplitRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ProxyTransactionSplitRequest.class),
            f -> f.withMarshaller(UpdateTransactionSplitStatusRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpgradeGaussMySqlInstanceDatabaseRequest, UpgradeGaussMySqlInstanceDatabaseResponse> upgradeGaussMySqlInstanceDatabase =
        genForupgradeGaussMySqlInstanceDatabase();

    private static HttpRequestDef<UpgradeGaussMySqlInstanceDatabaseRequest, UpgradeGaussMySqlInstanceDatabaseResponse> genForupgradeGaussMySqlInstanceDatabase() {
        // basic
        HttpRequestDef.Builder<UpgradeGaussMySqlInstanceDatabaseRequest, UpgradeGaussMySqlInstanceDatabaseResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    UpgradeGaussMySqlInstanceDatabaseRequest.class,
                    UpgradeGaussMySqlInstanceDatabaseResponse.class)
                .withName("UpgradeGaussMySqlInstanceDatabase")
                .withUri("/v3/{project_id}/instances/{instance_id}/db-upgrade")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpgradeGaussMySqlInstanceDatabaseRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpgradeGaussMySqlInstanceDatabaseRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));
        builder.<UpgradeDatabaseRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpgradeDatabaseRequest.class),
            f -> f.withMarshaller(UpgradeGaussMySqlInstanceDatabaseRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteSqlFilterRuleRequest, DeleteSqlFilterRuleResponse> deleteSqlFilterRule =
        genFordeleteSqlFilterRule();

    private static HttpRequestDef<DeleteSqlFilterRuleRequest, DeleteSqlFilterRuleResponse> genFordeleteSqlFilterRule() {
        // basic
        HttpRequestDef.Builder<DeleteSqlFilterRuleRequest, DeleteSqlFilterRuleResponse> builder = HttpRequestDef
            .builder(HttpMethod.DELETE, DeleteSqlFilterRuleRequest.class, DeleteSqlFilterRuleResponse.class)
            .withName("DeleteSqlFilterRule")
            .withUri("/v3/{project_id}/instances/{instance_id}/sql-filter/rules")
            .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteSqlFilterRuleRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteSqlFilterRuleRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));
        builder.<DeleteSqlFilterRuleReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(DeleteSqlFilterRuleReq.class),
            f -> f.withMarshaller(DeleteSqlFilterRuleRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<SetSqlFilterRuleRequest, SetSqlFilterRuleResponse> setSqlFilterRule =
        genForsetSqlFilterRule();

    private static HttpRequestDef<SetSqlFilterRuleRequest, SetSqlFilterRuleResponse> genForsetSqlFilterRule() {
        // basic
        HttpRequestDef.Builder<SetSqlFilterRuleRequest, SetSqlFilterRuleResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, SetSqlFilterRuleRequest.class, SetSqlFilterRuleResponse.class)
                .withName("SetSqlFilterRule")
                .withUri("/v3/{project_id}/instances/{instance_id}/sql-filter/rules")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SetSqlFilterRuleRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SetSqlFilterRuleRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));
        builder.<OperateSqlFilterRuleReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(OperateSqlFilterRuleReq.class),
            f -> f.withMarshaller(SetSqlFilterRuleRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowSqlFilterControlRequest, ShowSqlFilterControlResponse> showSqlFilterControl =
        genForshowSqlFilterControl();

    private static HttpRequestDef<ShowSqlFilterControlRequest, ShowSqlFilterControlResponse> genForshowSqlFilterControl() {
        // basic
        HttpRequestDef.Builder<ShowSqlFilterControlRequest, ShowSqlFilterControlResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowSqlFilterControlRequest.class, ShowSqlFilterControlResponse.class)
            .withName("ShowSqlFilterControl")
            .withUri("/v3/{project_id}/instances/{instance_id}/sql-filter/switch")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowSqlFilterControlRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowSqlFilterControlRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowSqlFilterRuleRequest, ShowSqlFilterRuleResponse> showSqlFilterRule =
        genForshowSqlFilterRule();

    private static HttpRequestDef<ShowSqlFilterRuleRequest, ShowSqlFilterRuleResponse> genForshowSqlFilterRule() {
        // basic
        HttpRequestDef.Builder<ShowSqlFilterRuleRequest, ShowSqlFilterRuleResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowSqlFilterRuleRequest.class, ShowSqlFilterRuleResponse.class)
                .withName("ShowSqlFilterRule")
                .withUri("/v3/{project_id}/instances/{instance_id}/sql-filter/rules")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowSqlFilterRuleRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<String>withRequestField("node_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowSqlFilterRuleRequest::getNodeId, (req, v) -> {
                req.setNodeId(v);
            }));
        builder.<String>withRequestField("sql_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowSqlFilterRuleRequest::getSqlType, (req, v) -> {
                req.setSqlType(v);
            }));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowSqlFilterRuleRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateSqlFilterControlRequest, UpdateSqlFilterControlResponse> updateSqlFilterControl =
        genForupdateSqlFilterControl();

    private static HttpRequestDef<UpdateSqlFilterControlRequest, UpdateSqlFilterControlResponse> genForupdateSqlFilterControl() {
        // basic
        HttpRequestDef.Builder<UpdateSqlFilterControlRequest, UpdateSqlFilterControlResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, UpdateSqlFilterControlRequest.class, UpdateSqlFilterControlResponse.class)
            .withName("UpdateSqlFilterControl")
            .withUri("/v3/{project_id}/instances/{instance_id}/sql-filter/switch")
            .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateSqlFilterControlRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateSqlFilterControlRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));
        builder.<OperateSqlFilterControlReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(OperateSqlFilterControlReq.class),
            f -> f.withMarshaller(UpdateSqlFilterControlRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

}
