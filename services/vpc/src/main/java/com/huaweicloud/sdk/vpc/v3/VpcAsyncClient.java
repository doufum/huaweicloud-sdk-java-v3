package com.huaweicloud.sdk.vpc.v3;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.AsyncInvoker;
import com.huaweicloud.sdk.vpc.v3.model.AddFirewallRulesRequest;
import com.huaweicloud.sdk.vpc.v3.model.AddFirewallRulesResponse;
import com.huaweicloud.sdk.vpc.v3.model.AddSecurityGroupsRequest;
import com.huaweicloud.sdk.vpc.v3.model.AddSecurityGroupsResponse;
import com.huaweicloud.sdk.vpc.v3.model.AddSourcesToTrafficMirrorSessionRequest;
import com.huaweicloud.sdk.vpc.v3.model.AddSourcesToTrafficMirrorSessionResponse;
import com.huaweicloud.sdk.vpc.v3.model.AddVpcExtendCidrRequest;
import com.huaweicloud.sdk.vpc.v3.model.AddVpcExtendCidrResponse;
import com.huaweicloud.sdk.vpc.v3.model.AssociateSubnetFirewallRequest;
import com.huaweicloud.sdk.vpc.v3.model.AssociateSubnetFirewallResponse;
import com.huaweicloud.sdk.vpc.v3.model.BatchCreateSecurityGroupRulesRequest;
import com.huaweicloud.sdk.vpc.v3.model.BatchCreateSecurityGroupRulesResponse;
import com.huaweicloud.sdk.vpc.v3.model.BatchCreateSubNetworkInterfaceRequest;
import com.huaweicloud.sdk.vpc.v3.model.BatchCreateSubNetworkInterfaceResponse;
import com.huaweicloud.sdk.vpc.v3.model.CreateAddressGroupRequest;
import com.huaweicloud.sdk.vpc.v3.model.CreateAddressGroupResponse;
import com.huaweicloud.sdk.vpc.v3.model.CreateFirewallRequest;
import com.huaweicloud.sdk.vpc.v3.model.CreateFirewallResponse;
import com.huaweicloud.sdk.vpc.v3.model.CreateSecurityGroupRequest;
import com.huaweicloud.sdk.vpc.v3.model.CreateSecurityGroupResponse;
import com.huaweicloud.sdk.vpc.v3.model.CreateSecurityGroupRuleRequest;
import com.huaweicloud.sdk.vpc.v3.model.CreateSecurityGroupRuleResponse;
import com.huaweicloud.sdk.vpc.v3.model.CreateSubNetworkInterfaceRequest;
import com.huaweicloud.sdk.vpc.v3.model.CreateSubNetworkInterfaceResponse;
import com.huaweicloud.sdk.vpc.v3.model.CreateTrafficMirrorFilterRequest;
import com.huaweicloud.sdk.vpc.v3.model.CreateTrafficMirrorFilterResponse;
import com.huaweicloud.sdk.vpc.v3.model.CreateTrafficMirrorFilterRuleRequest;
import com.huaweicloud.sdk.vpc.v3.model.CreateTrafficMirrorFilterRuleResponse;
import com.huaweicloud.sdk.vpc.v3.model.CreateTrafficMirrorSessionRequest;
import com.huaweicloud.sdk.vpc.v3.model.CreateTrafficMirrorSessionResponse;
import com.huaweicloud.sdk.vpc.v3.model.CreateVpcRequest;
import com.huaweicloud.sdk.vpc.v3.model.CreateVpcResponse;
import com.huaweicloud.sdk.vpc.v3.model.DeleteAddressGroupRequest;
import com.huaweicloud.sdk.vpc.v3.model.DeleteAddressGroupResponse;
import com.huaweicloud.sdk.vpc.v3.model.DeleteFirewallRequest;
import com.huaweicloud.sdk.vpc.v3.model.DeleteFirewallResponse;
import com.huaweicloud.sdk.vpc.v3.model.DeleteIpAddressGroupForceRequest;
import com.huaweicloud.sdk.vpc.v3.model.DeleteIpAddressGroupForceResponse;
import com.huaweicloud.sdk.vpc.v3.model.DeleteSecurityGroupRequest;
import com.huaweicloud.sdk.vpc.v3.model.DeleteSecurityGroupResponse;
import com.huaweicloud.sdk.vpc.v3.model.DeleteSecurityGroupRuleRequest;
import com.huaweicloud.sdk.vpc.v3.model.DeleteSecurityGroupRuleResponse;
import com.huaweicloud.sdk.vpc.v3.model.DeleteSubNetworkInterfaceRequest;
import com.huaweicloud.sdk.vpc.v3.model.DeleteSubNetworkInterfaceResponse;
import com.huaweicloud.sdk.vpc.v3.model.DeleteTrafficMirrorFilterRequest;
import com.huaweicloud.sdk.vpc.v3.model.DeleteTrafficMirrorFilterResponse;
import com.huaweicloud.sdk.vpc.v3.model.DeleteTrafficMirrorFilterRuleRequest;
import com.huaweicloud.sdk.vpc.v3.model.DeleteTrafficMirrorFilterRuleResponse;
import com.huaweicloud.sdk.vpc.v3.model.DeleteTrafficMirrorSessionRequest;
import com.huaweicloud.sdk.vpc.v3.model.DeleteTrafficMirrorSessionResponse;
import com.huaweicloud.sdk.vpc.v3.model.DeleteVpcRequest;
import com.huaweicloud.sdk.vpc.v3.model.DeleteVpcResponse;
import com.huaweicloud.sdk.vpc.v3.model.DisassociateSubnetFirewallRequest;
import com.huaweicloud.sdk.vpc.v3.model.DisassociateSubnetFirewallResponse;
import com.huaweicloud.sdk.vpc.v3.model.ListAddressGroupRequest;
import com.huaweicloud.sdk.vpc.v3.model.ListAddressGroupResponse;
import com.huaweicloud.sdk.vpc.v3.model.ListFirewallRequest;
import com.huaweicloud.sdk.vpc.v3.model.ListFirewallResponse;
import com.huaweicloud.sdk.vpc.v3.model.ListSecurityGroupRulesRequest;
import com.huaweicloud.sdk.vpc.v3.model.ListSecurityGroupRulesResponse;
import com.huaweicloud.sdk.vpc.v3.model.ListSecurityGroupsRequest;
import com.huaweicloud.sdk.vpc.v3.model.ListSecurityGroupsResponse;
import com.huaweicloud.sdk.vpc.v3.model.ListSubNetworkInterfacesRequest;
import com.huaweicloud.sdk.vpc.v3.model.ListSubNetworkInterfacesResponse;
import com.huaweicloud.sdk.vpc.v3.model.ListTrafficMirrorFilterRulesRequest;
import com.huaweicloud.sdk.vpc.v3.model.ListTrafficMirrorFilterRulesResponse;
import com.huaweicloud.sdk.vpc.v3.model.ListTrafficMirrorFiltersRequest;
import com.huaweicloud.sdk.vpc.v3.model.ListTrafficMirrorFiltersResponse;
import com.huaweicloud.sdk.vpc.v3.model.ListTrafficMirrorSessionsRequest;
import com.huaweicloud.sdk.vpc.v3.model.ListTrafficMirrorSessionsResponse;
import com.huaweicloud.sdk.vpc.v3.model.ListVpcsRequest;
import com.huaweicloud.sdk.vpc.v3.model.ListVpcsResponse;
import com.huaweicloud.sdk.vpc.v3.model.MigrateSubNetworkInterfaceRequest;
import com.huaweicloud.sdk.vpc.v3.model.MigrateSubNetworkInterfaceResponse;
import com.huaweicloud.sdk.vpc.v3.model.RemoveFirewallRulesRequest;
import com.huaweicloud.sdk.vpc.v3.model.RemoveFirewallRulesResponse;
import com.huaweicloud.sdk.vpc.v3.model.RemoveSecurityGroupsRequest;
import com.huaweicloud.sdk.vpc.v3.model.RemoveSecurityGroupsResponse;
import com.huaweicloud.sdk.vpc.v3.model.RemoveSourcesFromTrafficMirrorSessionRequest;
import com.huaweicloud.sdk.vpc.v3.model.RemoveSourcesFromTrafficMirrorSessionResponse;
import com.huaweicloud.sdk.vpc.v3.model.RemoveVpcExtendCidrRequest;
import com.huaweicloud.sdk.vpc.v3.model.RemoveVpcExtendCidrResponse;
import com.huaweicloud.sdk.vpc.v3.model.ShowAddressGroupRequest;
import com.huaweicloud.sdk.vpc.v3.model.ShowAddressGroupResponse;
import com.huaweicloud.sdk.vpc.v3.model.ShowFirewallRequest;
import com.huaweicloud.sdk.vpc.v3.model.ShowFirewallResponse;
import com.huaweicloud.sdk.vpc.v3.model.ShowSecurityGroupRequest;
import com.huaweicloud.sdk.vpc.v3.model.ShowSecurityGroupResponse;
import com.huaweicloud.sdk.vpc.v3.model.ShowSecurityGroupRuleRequest;
import com.huaweicloud.sdk.vpc.v3.model.ShowSecurityGroupRuleResponse;
import com.huaweicloud.sdk.vpc.v3.model.ShowSubNetworkInterfaceRequest;
import com.huaweicloud.sdk.vpc.v3.model.ShowSubNetworkInterfaceResponse;
import com.huaweicloud.sdk.vpc.v3.model.ShowSubNetworkInterfacesQuantityRequest;
import com.huaweicloud.sdk.vpc.v3.model.ShowSubNetworkInterfacesQuantityResponse;
import com.huaweicloud.sdk.vpc.v3.model.ShowTrafficMirrorFilterRequest;
import com.huaweicloud.sdk.vpc.v3.model.ShowTrafficMirrorFilterResponse;
import com.huaweicloud.sdk.vpc.v3.model.ShowTrafficMirrorFilterRuleRequest;
import com.huaweicloud.sdk.vpc.v3.model.ShowTrafficMirrorFilterRuleResponse;
import com.huaweicloud.sdk.vpc.v3.model.ShowTrafficMirrorSessionRequest;
import com.huaweicloud.sdk.vpc.v3.model.ShowTrafficMirrorSessionResponse;
import com.huaweicloud.sdk.vpc.v3.model.ShowVpcRequest;
import com.huaweicloud.sdk.vpc.v3.model.ShowVpcResponse;
import com.huaweicloud.sdk.vpc.v3.model.UpdateAddressGroupRequest;
import com.huaweicloud.sdk.vpc.v3.model.UpdateAddressGroupResponse;
import com.huaweicloud.sdk.vpc.v3.model.UpdateFirewallRequest;
import com.huaweicloud.sdk.vpc.v3.model.UpdateFirewallResponse;
import com.huaweicloud.sdk.vpc.v3.model.UpdateFirewallRulesRequest;
import com.huaweicloud.sdk.vpc.v3.model.UpdateFirewallRulesResponse;
import com.huaweicloud.sdk.vpc.v3.model.UpdateSecurityGroupRequest;
import com.huaweicloud.sdk.vpc.v3.model.UpdateSecurityGroupResponse;
import com.huaweicloud.sdk.vpc.v3.model.UpdateSubNetworkInterfaceRequest;
import com.huaweicloud.sdk.vpc.v3.model.UpdateSubNetworkInterfaceResponse;
import com.huaweicloud.sdk.vpc.v3.model.UpdateTrafficMirrorFilterRequest;
import com.huaweicloud.sdk.vpc.v3.model.UpdateTrafficMirrorFilterResponse;
import com.huaweicloud.sdk.vpc.v3.model.UpdateTrafficMirrorFilterRuleRequest;
import com.huaweicloud.sdk.vpc.v3.model.UpdateTrafficMirrorFilterRuleResponse;
import com.huaweicloud.sdk.vpc.v3.model.UpdateTrafficMirrorSessionRequest;
import com.huaweicloud.sdk.vpc.v3.model.UpdateTrafficMirrorSessionResponse;
import com.huaweicloud.sdk.vpc.v3.model.UpdateVpcRequest;
import com.huaweicloud.sdk.vpc.v3.model.UpdateVpcResponse;

import java.util.concurrent.CompletableFuture;

public class VpcAsyncClient {

    protected HcClient hcClient;

    public VpcAsyncClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<VpcAsyncClient> newBuilder() {
        ClientBuilder<VpcAsyncClient> clientBuilder = new ClientBuilder<>(VpcAsyncClient::new);
        return clientBuilder;
    }

    /**
     * 端口插入安全组
     *
     * 端口插入安全组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param AddSecurityGroupsRequest 请求对象
     * @return CompletableFuture<AddSecurityGroupsResponse>
     */
    public CompletableFuture<AddSecurityGroupsResponse> addSecurityGroupsAsync(AddSecurityGroupsRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.addSecurityGroups);
    }

    /**
     * 端口插入安全组
     *
     * 端口插入安全组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param AddSecurityGroupsRequest 请求对象
     * @return AsyncInvoker<AddSecurityGroupsRequest, AddSecurityGroupsResponse>
     */
    public AsyncInvoker<AddSecurityGroupsRequest, AddSecurityGroupsResponse> addSecurityGroupsAsyncInvoker(
        AddSecurityGroupsRequest request) {
        return new AsyncInvoker<AddSecurityGroupsRequest, AddSecurityGroupsResponse>(request, VpcMeta.addSecurityGroups,
            hcClient);
    }

    /**
     * 流量镜像会话添加镜像源
     *
     * 流量镜像会话添加镜像源
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param AddSourcesToTrafficMirrorSessionRequest 请求对象
     * @return CompletableFuture<AddSourcesToTrafficMirrorSessionResponse>
     */
    public CompletableFuture<AddSourcesToTrafficMirrorSessionResponse> addSourcesToTrafficMirrorSessionAsync(
        AddSourcesToTrafficMirrorSessionRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.addSourcesToTrafficMirrorSession);
    }

    /**
     * 流量镜像会话添加镜像源
     *
     * 流量镜像会话添加镜像源
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param AddSourcesToTrafficMirrorSessionRequest 请求对象
     * @return AsyncInvoker<AddSourcesToTrafficMirrorSessionRequest, AddSourcesToTrafficMirrorSessionResponse>
     */
    public AsyncInvoker<AddSourcesToTrafficMirrorSessionRequest, AddSourcesToTrafficMirrorSessionResponse> addSourcesToTrafficMirrorSessionAsyncInvoker(
        AddSourcesToTrafficMirrorSessionRequest request) {
        return new AsyncInvoker<AddSourcesToTrafficMirrorSessionRequest, AddSourcesToTrafficMirrorSessionResponse>(
            request, VpcMeta.addSourcesToTrafficMirrorSession, hcClient);
    }

    /**
     * 批量创建安全组规则
     *
     * 在特定安全组下批量创建安全组规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchCreateSecurityGroupRulesRequest 请求对象
     * @return CompletableFuture<BatchCreateSecurityGroupRulesResponse>
     */
    public CompletableFuture<BatchCreateSecurityGroupRulesResponse> batchCreateSecurityGroupRulesAsync(
        BatchCreateSecurityGroupRulesRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.batchCreateSecurityGroupRules);
    }

    /**
     * 批量创建安全组规则
     *
     * 在特定安全组下批量创建安全组规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchCreateSecurityGroupRulesRequest 请求对象
     * @return AsyncInvoker<BatchCreateSecurityGroupRulesRequest, BatchCreateSecurityGroupRulesResponse>
     */
    public AsyncInvoker<BatchCreateSecurityGroupRulesRequest, BatchCreateSecurityGroupRulesResponse> batchCreateSecurityGroupRulesAsyncInvoker(
        BatchCreateSecurityGroupRulesRequest request) {
        return new AsyncInvoker<BatchCreateSecurityGroupRulesRequest, BatchCreateSecurityGroupRulesResponse>(request,
            VpcMeta.batchCreateSecurityGroupRules, hcClient);
    }

    /**
     * 批量创建辅助弹性网卡
     *
     * 批量创建辅助弹性网卡
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchCreateSubNetworkInterfaceRequest 请求对象
     * @return CompletableFuture<BatchCreateSubNetworkInterfaceResponse>
     */
    public CompletableFuture<BatchCreateSubNetworkInterfaceResponse> batchCreateSubNetworkInterfaceAsync(
        BatchCreateSubNetworkInterfaceRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.batchCreateSubNetworkInterface);
    }

    /**
     * 批量创建辅助弹性网卡
     *
     * 批量创建辅助弹性网卡
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchCreateSubNetworkInterfaceRequest 请求对象
     * @return AsyncInvoker<BatchCreateSubNetworkInterfaceRequest, BatchCreateSubNetworkInterfaceResponse>
     */
    public AsyncInvoker<BatchCreateSubNetworkInterfaceRequest, BatchCreateSubNetworkInterfaceResponse> batchCreateSubNetworkInterfaceAsyncInvoker(
        BatchCreateSubNetworkInterfaceRequest request) {
        return new AsyncInvoker<BatchCreateSubNetworkInterfaceRequest, BatchCreateSubNetworkInterfaceResponse>(request,
            VpcMeta.batchCreateSubNetworkInterface, hcClient);
    }

    /**
     * 创建安全组
     *
     * 创建安全组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateSecurityGroupRequest 请求对象
     * @return CompletableFuture<CreateSecurityGroupResponse>
     */
    public CompletableFuture<CreateSecurityGroupResponse> createSecurityGroupAsync(CreateSecurityGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.createSecurityGroup);
    }

    /**
     * 创建安全组
     *
     * 创建安全组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateSecurityGroupRequest 请求对象
     * @return AsyncInvoker<CreateSecurityGroupRequest, CreateSecurityGroupResponse>
     */
    public AsyncInvoker<CreateSecurityGroupRequest, CreateSecurityGroupResponse> createSecurityGroupAsyncInvoker(
        CreateSecurityGroupRequest request) {
        return new AsyncInvoker<CreateSecurityGroupRequest, CreateSecurityGroupResponse>(request,
            VpcMeta.createSecurityGroup, hcClient);
    }

    /**
     * 创建安全组规则
     *
     * 创建安全组规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateSecurityGroupRuleRequest 请求对象
     * @return CompletableFuture<CreateSecurityGroupRuleResponse>
     */
    public CompletableFuture<CreateSecurityGroupRuleResponse> createSecurityGroupRuleAsync(
        CreateSecurityGroupRuleRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.createSecurityGroupRule);
    }

    /**
     * 创建安全组规则
     *
     * 创建安全组规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateSecurityGroupRuleRequest 请求对象
     * @return AsyncInvoker<CreateSecurityGroupRuleRequest, CreateSecurityGroupRuleResponse>
     */
    public AsyncInvoker<CreateSecurityGroupRuleRequest, CreateSecurityGroupRuleResponse> createSecurityGroupRuleAsyncInvoker(
        CreateSecurityGroupRuleRequest request) {
        return new AsyncInvoker<CreateSecurityGroupRuleRequest, CreateSecurityGroupRuleResponse>(request,
            VpcMeta.createSecurityGroupRule, hcClient);
    }

    /**
     * 创建辅助弹性网卡
     *
     * 创建辅助弹性网卡
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateSubNetworkInterfaceRequest 请求对象
     * @return CompletableFuture<CreateSubNetworkInterfaceResponse>
     */
    public CompletableFuture<CreateSubNetworkInterfaceResponse> createSubNetworkInterfaceAsync(
        CreateSubNetworkInterfaceRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.createSubNetworkInterface);
    }

    /**
     * 创建辅助弹性网卡
     *
     * 创建辅助弹性网卡
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateSubNetworkInterfaceRequest 请求对象
     * @return AsyncInvoker<CreateSubNetworkInterfaceRequest, CreateSubNetworkInterfaceResponse>
     */
    public AsyncInvoker<CreateSubNetworkInterfaceRequest, CreateSubNetworkInterfaceResponse> createSubNetworkInterfaceAsyncInvoker(
        CreateSubNetworkInterfaceRequest request) {
        return new AsyncInvoker<CreateSubNetworkInterfaceRequest, CreateSubNetworkInterfaceResponse>(request,
            VpcMeta.createSubNetworkInterface, hcClient);
    }

    /**
     * 创建流量镜像筛选条件
     *
     * 创建流量镜像筛选条件
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateTrafficMirrorFilterRequest 请求对象
     * @return CompletableFuture<CreateTrafficMirrorFilterResponse>
     */
    public CompletableFuture<CreateTrafficMirrorFilterResponse> createTrafficMirrorFilterAsync(
        CreateTrafficMirrorFilterRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.createTrafficMirrorFilter);
    }

    /**
     * 创建流量镜像筛选条件
     *
     * 创建流量镜像筛选条件
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateTrafficMirrorFilterRequest 请求对象
     * @return AsyncInvoker<CreateTrafficMirrorFilterRequest, CreateTrafficMirrorFilterResponse>
     */
    public AsyncInvoker<CreateTrafficMirrorFilterRequest, CreateTrafficMirrorFilterResponse> createTrafficMirrorFilterAsyncInvoker(
        CreateTrafficMirrorFilterRequest request) {
        return new AsyncInvoker<CreateTrafficMirrorFilterRequest, CreateTrafficMirrorFilterResponse>(request,
            VpcMeta.createTrafficMirrorFilter, hcClient);
    }

    /**
     * 创建流量镜像筛选规则
     *
     * 创建流量镜像筛选规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateTrafficMirrorFilterRuleRequest 请求对象
     * @return CompletableFuture<CreateTrafficMirrorFilterRuleResponse>
     */
    public CompletableFuture<CreateTrafficMirrorFilterRuleResponse> createTrafficMirrorFilterRuleAsync(
        CreateTrafficMirrorFilterRuleRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.createTrafficMirrorFilterRule);
    }

    /**
     * 创建流量镜像筛选规则
     *
     * 创建流量镜像筛选规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateTrafficMirrorFilterRuleRequest 请求对象
     * @return AsyncInvoker<CreateTrafficMirrorFilterRuleRequest, CreateTrafficMirrorFilterRuleResponse>
     */
    public AsyncInvoker<CreateTrafficMirrorFilterRuleRequest, CreateTrafficMirrorFilterRuleResponse> createTrafficMirrorFilterRuleAsyncInvoker(
        CreateTrafficMirrorFilterRuleRequest request) {
        return new AsyncInvoker<CreateTrafficMirrorFilterRuleRequest, CreateTrafficMirrorFilterRuleResponse>(request,
            VpcMeta.createTrafficMirrorFilterRule, hcClient);
    }

    /**
     * 创建流量镜像会话
     *
     * 创建流量镜像会话
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateTrafficMirrorSessionRequest 请求对象
     * @return CompletableFuture<CreateTrafficMirrorSessionResponse>
     */
    public CompletableFuture<CreateTrafficMirrorSessionResponse> createTrafficMirrorSessionAsync(
        CreateTrafficMirrorSessionRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.createTrafficMirrorSession);
    }

    /**
     * 创建流量镜像会话
     *
     * 创建流量镜像会话
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateTrafficMirrorSessionRequest 请求对象
     * @return AsyncInvoker<CreateTrafficMirrorSessionRequest, CreateTrafficMirrorSessionResponse>
     */
    public AsyncInvoker<CreateTrafficMirrorSessionRequest, CreateTrafficMirrorSessionResponse> createTrafficMirrorSessionAsyncInvoker(
        CreateTrafficMirrorSessionRequest request) {
        return new AsyncInvoker<CreateTrafficMirrorSessionRequest, CreateTrafficMirrorSessionResponse>(request,
            VpcMeta.createTrafficMirrorSession, hcClient);
    }

    /**
     * 删除安全组
     *
     * 删除安全组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteSecurityGroupRequest 请求对象
     * @return CompletableFuture<DeleteSecurityGroupResponse>
     */
    public CompletableFuture<DeleteSecurityGroupResponse> deleteSecurityGroupAsync(DeleteSecurityGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.deleteSecurityGroup);
    }

    /**
     * 删除安全组
     *
     * 删除安全组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteSecurityGroupRequest 请求对象
     * @return AsyncInvoker<DeleteSecurityGroupRequest, DeleteSecurityGroupResponse>
     */
    public AsyncInvoker<DeleteSecurityGroupRequest, DeleteSecurityGroupResponse> deleteSecurityGroupAsyncInvoker(
        DeleteSecurityGroupRequest request) {
        return new AsyncInvoker<DeleteSecurityGroupRequest, DeleteSecurityGroupResponse>(request,
            VpcMeta.deleteSecurityGroup, hcClient);
    }

    /**
     * 删除安全组规则
     *
     * 删除安全组规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteSecurityGroupRuleRequest 请求对象
     * @return CompletableFuture<DeleteSecurityGroupRuleResponse>
     */
    public CompletableFuture<DeleteSecurityGroupRuleResponse> deleteSecurityGroupRuleAsync(
        DeleteSecurityGroupRuleRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.deleteSecurityGroupRule);
    }

    /**
     * 删除安全组规则
     *
     * 删除安全组规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteSecurityGroupRuleRequest 请求对象
     * @return AsyncInvoker<DeleteSecurityGroupRuleRequest, DeleteSecurityGroupRuleResponse>
     */
    public AsyncInvoker<DeleteSecurityGroupRuleRequest, DeleteSecurityGroupRuleResponse> deleteSecurityGroupRuleAsyncInvoker(
        DeleteSecurityGroupRuleRequest request) {
        return new AsyncInvoker<DeleteSecurityGroupRuleRequest, DeleteSecurityGroupRuleResponse>(request,
            VpcMeta.deleteSecurityGroupRule, hcClient);
    }

    /**
     * 删除辅助弹性网卡
     *
     * 删除辅助弹性网卡
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteSubNetworkInterfaceRequest 请求对象
     * @return CompletableFuture<DeleteSubNetworkInterfaceResponse>
     */
    public CompletableFuture<DeleteSubNetworkInterfaceResponse> deleteSubNetworkInterfaceAsync(
        DeleteSubNetworkInterfaceRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.deleteSubNetworkInterface);
    }

    /**
     * 删除辅助弹性网卡
     *
     * 删除辅助弹性网卡
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteSubNetworkInterfaceRequest 请求对象
     * @return AsyncInvoker<DeleteSubNetworkInterfaceRequest, DeleteSubNetworkInterfaceResponse>
     */
    public AsyncInvoker<DeleteSubNetworkInterfaceRequest, DeleteSubNetworkInterfaceResponse> deleteSubNetworkInterfaceAsyncInvoker(
        DeleteSubNetworkInterfaceRequest request) {
        return new AsyncInvoker<DeleteSubNetworkInterfaceRequest, DeleteSubNetworkInterfaceResponse>(request,
            VpcMeta.deleteSubNetworkInterface, hcClient);
    }

    /**
     * 删除流量镜像筛选条件
     *
     * 删除流量镜像筛选条件
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteTrafficMirrorFilterRequest 请求对象
     * @return CompletableFuture<DeleteTrafficMirrorFilterResponse>
     */
    public CompletableFuture<DeleteTrafficMirrorFilterResponse> deleteTrafficMirrorFilterAsync(
        DeleteTrafficMirrorFilterRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.deleteTrafficMirrorFilter);
    }

    /**
     * 删除流量镜像筛选条件
     *
     * 删除流量镜像筛选条件
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteTrafficMirrorFilterRequest 请求对象
     * @return AsyncInvoker<DeleteTrafficMirrorFilterRequest, DeleteTrafficMirrorFilterResponse>
     */
    public AsyncInvoker<DeleteTrafficMirrorFilterRequest, DeleteTrafficMirrorFilterResponse> deleteTrafficMirrorFilterAsyncInvoker(
        DeleteTrafficMirrorFilterRequest request) {
        return new AsyncInvoker<DeleteTrafficMirrorFilterRequest, DeleteTrafficMirrorFilterResponse>(request,
            VpcMeta.deleteTrafficMirrorFilter, hcClient);
    }

    /**
     * 删除流量镜像筛选规则
     *
     * 删除流量镜像筛选规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteTrafficMirrorFilterRuleRequest 请求对象
     * @return CompletableFuture<DeleteTrafficMirrorFilterRuleResponse>
     */
    public CompletableFuture<DeleteTrafficMirrorFilterRuleResponse> deleteTrafficMirrorFilterRuleAsync(
        DeleteTrafficMirrorFilterRuleRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.deleteTrafficMirrorFilterRule);
    }

    /**
     * 删除流量镜像筛选规则
     *
     * 删除流量镜像筛选规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteTrafficMirrorFilterRuleRequest 请求对象
     * @return AsyncInvoker<DeleteTrafficMirrorFilterRuleRequest, DeleteTrafficMirrorFilterRuleResponse>
     */
    public AsyncInvoker<DeleteTrafficMirrorFilterRuleRequest, DeleteTrafficMirrorFilterRuleResponse> deleteTrafficMirrorFilterRuleAsyncInvoker(
        DeleteTrafficMirrorFilterRuleRequest request) {
        return new AsyncInvoker<DeleteTrafficMirrorFilterRuleRequest, DeleteTrafficMirrorFilterRuleResponse>(request,
            VpcMeta.deleteTrafficMirrorFilterRule, hcClient);
    }

    /**
     * 删除流量镜像会话
     *
     * 删除流量镜像会话
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteTrafficMirrorSessionRequest 请求对象
     * @return CompletableFuture<DeleteTrafficMirrorSessionResponse>
     */
    public CompletableFuture<DeleteTrafficMirrorSessionResponse> deleteTrafficMirrorSessionAsync(
        DeleteTrafficMirrorSessionRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.deleteTrafficMirrorSession);
    }

    /**
     * 删除流量镜像会话
     *
     * 删除流量镜像会话
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteTrafficMirrorSessionRequest 请求对象
     * @return AsyncInvoker<DeleteTrafficMirrorSessionRequest, DeleteTrafficMirrorSessionResponse>
     */
    public AsyncInvoker<DeleteTrafficMirrorSessionRequest, DeleteTrafficMirrorSessionResponse> deleteTrafficMirrorSessionAsyncInvoker(
        DeleteTrafficMirrorSessionRequest request) {
        return new AsyncInvoker<DeleteTrafficMirrorSessionRequest, DeleteTrafficMirrorSessionResponse>(request,
            VpcMeta.deleteTrafficMirrorSession, hcClient);
    }

    /**
     * 查询安全组规则列表
     *
     * 查询安全组规则列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListSecurityGroupRulesRequest 请求对象
     * @return CompletableFuture<ListSecurityGroupRulesResponse>
     */
    public CompletableFuture<ListSecurityGroupRulesResponse> listSecurityGroupRulesAsync(
        ListSecurityGroupRulesRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.listSecurityGroupRules);
    }

    /**
     * 查询安全组规则列表
     *
     * 查询安全组规则列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListSecurityGroupRulesRequest 请求对象
     * @return AsyncInvoker<ListSecurityGroupRulesRequest, ListSecurityGroupRulesResponse>
     */
    public AsyncInvoker<ListSecurityGroupRulesRequest, ListSecurityGroupRulesResponse> listSecurityGroupRulesAsyncInvoker(
        ListSecurityGroupRulesRequest request) {
        return new AsyncInvoker<ListSecurityGroupRulesRequest, ListSecurityGroupRulesResponse>(request,
            VpcMeta.listSecurityGroupRules, hcClient);
    }

    /**
     * 查询安全组列表
     *
     * 查询某租户下的安全组列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListSecurityGroupsRequest 请求对象
     * @return CompletableFuture<ListSecurityGroupsResponse>
     */
    public CompletableFuture<ListSecurityGroupsResponse> listSecurityGroupsAsync(ListSecurityGroupsRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.listSecurityGroups);
    }

    /**
     * 查询安全组列表
     *
     * 查询某租户下的安全组列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListSecurityGroupsRequest 请求对象
     * @return AsyncInvoker<ListSecurityGroupsRequest, ListSecurityGroupsResponse>
     */
    public AsyncInvoker<ListSecurityGroupsRequest, ListSecurityGroupsResponse> listSecurityGroupsAsyncInvoker(
        ListSecurityGroupsRequest request) {
        return new AsyncInvoker<ListSecurityGroupsRequest, ListSecurityGroupsResponse>(request,
            VpcMeta.listSecurityGroups, hcClient);
    }

    /**
     * 查询租户下辅助弹性网卡列表
     *
     * 查询辅助弹性网卡列表，单次查询最多返回2000条数据
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListSubNetworkInterfacesRequest 请求对象
     * @return CompletableFuture<ListSubNetworkInterfacesResponse>
     */
    public CompletableFuture<ListSubNetworkInterfacesResponse> listSubNetworkInterfacesAsync(
        ListSubNetworkInterfacesRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.listSubNetworkInterfaces);
    }

    /**
     * 查询租户下辅助弹性网卡列表
     *
     * 查询辅助弹性网卡列表，单次查询最多返回2000条数据
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListSubNetworkInterfacesRequest 请求对象
     * @return AsyncInvoker<ListSubNetworkInterfacesRequest, ListSubNetworkInterfacesResponse>
     */
    public AsyncInvoker<ListSubNetworkInterfacesRequest, ListSubNetworkInterfacesResponse> listSubNetworkInterfacesAsyncInvoker(
        ListSubNetworkInterfacesRequest request) {
        return new AsyncInvoker<ListSubNetworkInterfacesRequest, ListSubNetworkInterfacesResponse>(request,
            VpcMeta.listSubNetworkInterfaces, hcClient);
    }

    /**
     * 查询流量镜像筛选规则列表
     *
     * 查询流量镜像筛选规则列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListTrafficMirrorFilterRulesRequest 请求对象
     * @return CompletableFuture<ListTrafficMirrorFilterRulesResponse>
     */
    public CompletableFuture<ListTrafficMirrorFilterRulesResponse> listTrafficMirrorFilterRulesAsync(
        ListTrafficMirrorFilterRulesRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.listTrafficMirrorFilterRules);
    }

    /**
     * 查询流量镜像筛选规则列表
     *
     * 查询流量镜像筛选规则列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListTrafficMirrorFilterRulesRequest 请求对象
     * @return AsyncInvoker<ListTrafficMirrorFilterRulesRequest, ListTrafficMirrorFilterRulesResponse>
     */
    public AsyncInvoker<ListTrafficMirrorFilterRulesRequest, ListTrafficMirrorFilterRulesResponse> listTrafficMirrorFilterRulesAsyncInvoker(
        ListTrafficMirrorFilterRulesRequest request) {
        return new AsyncInvoker<ListTrafficMirrorFilterRulesRequest, ListTrafficMirrorFilterRulesResponse>(request,
            VpcMeta.listTrafficMirrorFilterRules, hcClient);
    }

    /**
     * 查询流量镜像筛选条件列表
     *
     * 查询流量镜像筛选条件列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListTrafficMirrorFiltersRequest 请求对象
     * @return CompletableFuture<ListTrafficMirrorFiltersResponse>
     */
    public CompletableFuture<ListTrafficMirrorFiltersResponse> listTrafficMirrorFiltersAsync(
        ListTrafficMirrorFiltersRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.listTrafficMirrorFilters);
    }

    /**
     * 查询流量镜像筛选条件列表
     *
     * 查询流量镜像筛选条件列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListTrafficMirrorFiltersRequest 请求对象
     * @return AsyncInvoker<ListTrafficMirrorFiltersRequest, ListTrafficMirrorFiltersResponse>
     */
    public AsyncInvoker<ListTrafficMirrorFiltersRequest, ListTrafficMirrorFiltersResponse> listTrafficMirrorFiltersAsyncInvoker(
        ListTrafficMirrorFiltersRequest request) {
        return new AsyncInvoker<ListTrafficMirrorFiltersRequest, ListTrafficMirrorFiltersResponse>(request,
            VpcMeta.listTrafficMirrorFilters, hcClient);
    }

    /**
     * 查询流量镜像会话列表
     *
     * 查询流量镜像会话列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListTrafficMirrorSessionsRequest 请求对象
     * @return CompletableFuture<ListTrafficMirrorSessionsResponse>
     */
    public CompletableFuture<ListTrafficMirrorSessionsResponse> listTrafficMirrorSessionsAsync(
        ListTrafficMirrorSessionsRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.listTrafficMirrorSessions);
    }

    /**
     * 查询流量镜像会话列表
     *
     * 查询流量镜像会话列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListTrafficMirrorSessionsRequest 请求对象
     * @return AsyncInvoker<ListTrafficMirrorSessionsRequest, ListTrafficMirrorSessionsResponse>
     */
    public AsyncInvoker<ListTrafficMirrorSessionsRequest, ListTrafficMirrorSessionsResponse> listTrafficMirrorSessionsAsyncInvoker(
        ListTrafficMirrorSessionsRequest request) {
        return new AsyncInvoker<ListTrafficMirrorSessionsRequest, ListTrafficMirrorSessionsResponse>(request,
            VpcMeta.listTrafficMirrorSessions, hcClient);
    }

    /**
     * 迁移辅助弹性网卡
     *
     * 批量迁移辅助弹性网卡
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param MigrateSubNetworkInterfaceRequest 请求对象
     * @return CompletableFuture<MigrateSubNetworkInterfaceResponse>
     */
    public CompletableFuture<MigrateSubNetworkInterfaceResponse> migrateSubNetworkInterfaceAsync(
        MigrateSubNetworkInterfaceRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.migrateSubNetworkInterface);
    }

    /**
     * 迁移辅助弹性网卡
     *
     * 批量迁移辅助弹性网卡
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param MigrateSubNetworkInterfaceRequest 请求对象
     * @return AsyncInvoker<MigrateSubNetworkInterfaceRequest, MigrateSubNetworkInterfaceResponse>
     */
    public AsyncInvoker<MigrateSubNetworkInterfaceRequest, MigrateSubNetworkInterfaceResponse> migrateSubNetworkInterfaceAsyncInvoker(
        MigrateSubNetworkInterfaceRequest request) {
        return new AsyncInvoker<MigrateSubNetworkInterfaceRequest, MigrateSubNetworkInterfaceResponse>(request,
            VpcMeta.migrateSubNetworkInterface, hcClient);
    }

    /**
     * 端口移除安全组
     *
     * 端口移除安全组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RemoveSecurityGroupsRequest 请求对象
     * @return CompletableFuture<RemoveSecurityGroupsResponse>
     */
    public CompletableFuture<RemoveSecurityGroupsResponse> removeSecurityGroupsAsync(
        RemoveSecurityGroupsRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.removeSecurityGroups);
    }

    /**
     * 端口移除安全组
     *
     * 端口移除安全组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RemoveSecurityGroupsRequest 请求对象
     * @return AsyncInvoker<RemoveSecurityGroupsRequest, RemoveSecurityGroupsResponse>
     */
    public AsyncInvoker<RemoveSecurityGroupsRequest, RemoveSecurityGroupsResponse> removeSecurityGroupsAsyncInvoker(
        RemoveSecurityGroupsRequest request) {
        return new AsyncInvoker<RemoveSecurityGroupsRequest, RemoveSecurityGroupsResponse>(request,
            VpcMeta.removeSecurityGroups, hcClient);
    }

    /**
     * 流量镜像会话移除镜像源
     *
     * 流量镜像会话移除镜像源
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RemoveSourcesFromTrafficMirrorSessionRequest 请求对象
     * @return CompletableFuture<RemoveSourcesFromTrafficMirrorSessionResponse>
     */
    public CompletableFuture<RemoveSourcesFromTrafficMirrorSessionResponse> removeSourcesFromTrafficMirrorSessionAsync(
        RemoveSourcesFromTrafficMirrorSessionRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.removeSourcesFromTrafficMirrorSession);
    }

    /**
     * 流量镜像会话移除镜像源
     *
     * 流量镜像会话移除镜像源
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RemoveSourcesFromTrafficMirrorSessionRequest 请求对象
     * @return AsyncInvoker<RemoveSourcesFromTrafficMirrorSessionRequest, RemoveSourcesFromTrafficMirrorSessionResponse>
     */
    public AsyncInvoker<RemoveSourcesFromTrafficMirrorSessionRequest, RemoveSourcesFromTrafficMirrorSessionResponse> removeSourcesFromTrafficMirrorSessionAsyncInvoker(
        RemoveSourcesFromTrafficMirrorSessionRequest request) {
        return new AsyncInvoker<RemoveSourcesFromTrafficMirrorSessionRequest, RemoveSourcesFromTrafficMirrorSessionResponse>(
            request, VpcMeta.removeSourcesFromTrafficMirrorSession, hcClient);
    }

    /**
     * 查询安全组
     *
     * 查询单个安全组详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowSecurityGroupRequest 请求对象
     * @return CompletableFuture<ShowSecurityGroupResponse>
     */
    public CompletableFuture<ShowSecurityGroupResponse> showSecurityGroupAsync(ShowSecurityGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.showSecurityGroup);
    }

    /**
     * 查询安全组
     *
     * 查询单个安全组详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowSecurityGroupRequest 请求对象
     * @return AsyncInvoker<ShowSecurityGroupRequest, ShowSecurityGroupResponse>
     */
    public AsyncInvoker<ShowSecurityGroupRequest, ShowSecurityGroupResponse> showSecurityGroupAsyncInvoker(
        ShowSecurityGroupRequest request) {
        return new AsyncInvoker<ShowSecurityGroupRequest, ShowSecurityGroupResponse>(request, VpcMeta.showSecurityGroup,
            hcClient);
    }

    /**
     * 查询安全组规则
     *
     * 查询单个安全组规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowSecurityGroupRuleRequest 请求对象
     * @return CompletableFuture<ShowSecurityGroupRuleResponse>
     */
    public CompletableFuture<ShowSecurityGroupRuleResponse> showSecurityGroupRuleAsync(
        ShowSecurityGroupRuleRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.showSecurityGroupRule);
    }

    /**
     * 查询安全组规则
     *
     * 查询单个安全组规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowSecurityGroupRuleRequest 请求对象
     * @return AsyncInvoker<ShowSecurityGroupRuleRequest, ShowSecurityGroupRuleResponse>
     */
    public AsyncInvoker<ShowSecurityGroupRuleRequest, ShowSecurityGroupRuleResponse> showSecurityGroupRuleAsyncInvoker(
        ShowSecurityGroupRuleRequest request) {
        return new AsyncInvoker<ShowSecurityGroupRuleRequest, ShowSecurityGroupRuleResponse>(request,
            VpcMeta.showSecurityGroupRule, hcClient);
    }

    /**
     * 查询租户下辅助弹性网卡
     *
     * 查询辅助弹性网卡详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowSubNetworkInterfaceRequest 请求对象
     * @return CompletableFuture<ShowSubNetworkInterfaceResponse>
     */
    public CompletableFuture<ShowSubNetworkInterfaceResponse> showSubNetworkInterfaceAsync(
        ShowSubNetworkInterfaceRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.showSubNetworkInterface);
    }

    /**
     * 查询租户下辅助弹性网卡
     *
     * 查询辅助弹性网卡详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowSubNetworkInterfaceRequest 请求对象
     * @return AsyncInvoker<ShowSubNetworkInterfaceRequest, ShowSubNetworkInterfaceResponse>
     */
    public AsyncInvoker<ShowSubNetworkInterfaceRequest, ShowSubNetworkInterfaceResponse> showSubNetworkInterfaceAsyncInvoker(
        ShowSubNetworkInterfaceRequest request) {
        return new AsyncInvoker<ShowSubNetworkInterfaceRequest, ShowSubNetworkInterfaceResponse>(request,
            VpcMeta.showSubNetworkInterface, hcClient);
    }

    /**
     * 查询租户下辅助弹性网卡数目
     *
     * 查询辅助弹性网卡数目
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowSubNetworkInterfacesQuantityRequest 请求对象
     * @return CompletableFuture<ShowSubNetworkInterfacesQuantityResponse>
     */
    public CompletableFuture<ShowSubNetworkInterfacesQuantityResponse> showSubNetworkInterfacesQuantityAsync(
        ShowSubNetworkInterfacesQuantityRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.showSubNetworkInterfacesQuantity);
    }

    /**
     * 查询租户下辅助弹性网卡数目
     *
     * 查询辅助弹性网卡数目
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowSubNetworkInterfacesQuantityRequest 请求对象
     * @return AsyncInvoker<ShowSubNetworkInterfacesQuantityRequest, ShowSubNetworkInterfacesQuantityResponse>
     */
    public AsyncInvoker<ShowSubNetworkInterfacesQuantityRequest, ShowSubNetworkInterfacesQuantityResponse> showSubNetworkInterfacesQuantityAsyncInvoker(
        ShowSubNetworkInterfacesQuantityRequest request) {
        return new AsyncInvoker<ShowSubNetworkInterfacesQuantityRequest, ShowSubNetworkInterfacesQuantityResponse>(
            request, VpcMeta.showSubNetworkInterfacesQuantity, hcClient);
    }

    /**
     * 查询流量镜像筛选条件详情
     *
     * 查询流量镜像筛选条件详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowTrafficMirrorFilterRequest 请求对象
     * @return CompletableFuture<ShowTrafficMirrorFilterResponse>
     */
    public CompletableFuture<ShowTrafficMirrorFilterResponse> showTrafficMirrorFilterAsync(
        ShowTrafficMirrorFilterRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.showTrafficMirrorFilter);
    }

    /**
     * 查询流量镜像筛选条件详情
     *
     * 查询流量镜像筛选条件详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowTrafficMirrorFilterRequest 请求对象
     * @return AsyncInvoker<ShowTrafficMirrorFilterRequest, ShowTrafficMirrorFilterResponse>
     */
    public AsyncInvoker<ShowTrafficMirrorFilterRequest, ShowTrafficMirrorFilterResponse> showTrafficMirrorFilterAsyncInvoker(
        ShowTrafficMirrorFilterRequest request) {
        return new AsyncInvoker<ShowTrafficMirrorFilterRequest, ShowTrafficMirrorFilterResponse>(request,
            VpcMeta.showTrafficMirrorFilter, hcClient);
    }

    /**
     * 查询流量镜像筛选规则详情
     *
     * 查询流量镜像筛选规则详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowTrafficMirrorFilterRuleRequest 请求对象
     * @return CompletableFuture<ShowTrafficMirrorFilterRuleResponse>
     */
    public CompletableFuture<ShowTrafficMirrorFilterRuleResponse> showTrafficMirrorFilterRuleAsync(
        ShowTrafficMirrorFilterRuleRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.showTrafficMirrorFilterRule);
    }

    /**
     * 查询流量镜像筛选规则详情
     *
     * 查询流量镜像筛选规则详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowTrafficMirrorFilterRuleRequest 请求对象
     * @return AsyncInvoker<ShowTrafficMirrorFilterRuleRequest, ShowTrafficMirrorFilterRuleResponse>
     */
    public AsyncInvoker<ShowTrafficMirrorFilterRuleRequest, ShowTrafficMirrorFilterRuleResponse> showTrafficMirrorFilterRuleAsyncInvoker(
        ShowTrafficMirrorFilterRuleRequest request) {
        return new AsyncInvoker<ShowTrafficMirrorFilterRuleRequest, ShowTrafficMirrorFilterRuleResponse>(request,
            VpcMeta.showTrafficMirrorFilterRule, hcClient);
    }

    /**
     * 查询流量镜像会话详情
     *
     * 查询流量镜像会话详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowTrafficMirrorSessionRequest 请求对象
     * @return CompletableFuture<ShowTrafficMirrorSessionResponse>
     */
    public CompletableFuture<ShowTrafficMirrorSessionResponse> showTrafficMirrorSessionAsync(
        ShowTrafficMirrorSessionRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.showTrafficMirrorSession);
    }

    /**
     * 查询流量镜像会话详情
     *
     * 查询流量镜像会话详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowTrafficMirrorSessionRequest 请求对象
     * @return AsyncInvoker<ShowTrafficMirrorSessionRequest, ShowTrafficMirrorSessionResponse>
     */
    public AsyncInvoker<ShowTrafficMirrorSessionRequest, ShowTrafficMirrorSessionResponse> showTrafficMirrorSessionAsyncInvoker(
        ShowTrafficMirrorSessionRequest request) {
        return new AsyncInvoker<ShowTrafficMirrorSessionRequest, ShowTrafficMirrorSessionResponse>(request,
            VpcMeta.showTrafficMirrorSession, hcClient);
    }

    /**
     * 更新安全组
     *
     * 更新安全组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateSecurityGroupRequest 请求对象
     * @return CompletableFuture<UpdateSecurityGroupResponse>
     */
    public CompletableFuture<UpdateSecurityGroupResponse> updateSecurityGroupAsync(UpdateSecurityGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.updateSecurityGroup);
    }

    /**
     * 更新安全组
     *
     * 更新安全组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateSecurityGroupRequest 请求对象
     * @return AsyncInvoker<UpdateSecurityGroupRequest, UpdateSecurityGroupResponse>
     */
    public AsyncInvoker<UpdateSecurityGroupRequest, UpdateSecurityGroupResponse> updateSecurityGroupAsyncInvoker(
        UpdateSecurityGroupRequest request) {
        return new AsyncInvoker<UpdateSecurityGroupRequest, UpdateSecurityGroupResponse>(request,
            VpcMeta.updateSecurityGroup, hcClient);
    }

    /**
     * 更新辅助弹性网卡
     *
     * 更新辅助弹性网卡
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateSubNetworkInterfaceRequest 请求对象
     * @return CompletableFuture<UpdateSubNetworkInterfaceResponse>
     */
    public CompletableFuture<UpdateSubNetworkInterfaceResponse> updateSubNetworkInterfaceAsync(
        UpdateSubNetworkInterfaceRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.updateSubNetworkInterface);
    }

    /**
     * 更新辅助弹性网卡
     *
     * 更新辅助弹性网卡
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateSubNetworkInterfaceRequest 请求对象
     * @return AsyncInvoker<UpdateSubNetworkInterfaceRequest, UpdateSubNetworkInterfaceResponse>
     */
    public AsyncInvoker<UpdateSubNetworkInterfaceRequest, UpdateSubNetworkInterfaceResponse> updateSubNetworkInterfaceAsyncInvoker(
        UpdateSubNetworkInterfaceRequest request) {
        return new AsyncInvoker<UpdateSubNetworkInterfaceRequest, UpdateSubNetworkInterfaceResponse>(request,
            VpcMeta.updateSubNetworkInterface, hcClient);
    }

    /**
     * 更新流量镜像筛选条件
     *
     * 更新流量镜像筛选条件
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateTrafficMirrorFilterRequest 请求对象
     * @return CompletableFuture<UpdateTrafficMirrorFilterResponse>
     */
    public CompletableFuture<UpdateTrafficMirrorFilterResponse> updateTrafficMirrorFilterAsync(
        UpdateTrafficMirrorFilterRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.updateTrafficMirrorFilter);
    }

    /**
     * 更新流量镜像筛选条件
     *
     * 更新流量镜像筛选条件
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateTrafficMirrorFilterRequest 请求对象
     * @return AsyncInvoker<UpdateTrafficMirrorFilterRequest, UpdateTrafficMirrorFilterResponse>
     */
    public AsyncInvoker<UpdateTrafficMirrorFilterRequest, UpdateTrafficMirrorFilterResponse> updateTrafficMirrorFilterAsyncInvoker(
        UpdateTrafficMirrorFilterRequest request) {
        return new AsyncInvoker<UpdateTrafficMirrorFilterRequest, UpdateTrafficMirrorFilterResponse>(request,
            VpcMeta.updateTrafficMirrorFilter, hcClient);
    }

    /**
     * 更新流量镜像筛选规则
     *
     * 更新流量镜像筛选规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateTrafficMirrorFilterRuleRequest 请求对象
     * @return CompletableFuture<UpdateTrafficMirrorFilterRuleResponse>
     */
    public CompletableFuture<UpdateTrafficMirrorFilterRuleResponse> updateTrafficMirrorFilterRuleAsync(
        UpdateTrafficMirrorFilterRuleRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.updateTrafficMirrorFilterRule);
    }

    /**
     * 更新流量镜像筛选规则
     *
     * 更新流量镜像筛选规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateTrafficMirrorFilterRuleRequest 请求对象
     * @return AsyncInvoker<UpdateTrafficMirrorFilterRuleRequest, UpdateTrafficMirrorFilterRuleResponse>
     */
    public AsyncInvoker<UpdateTrafficMirrorFilterRuleRequest, UpdateTrafficMirrorFilterRuleResponse> updateTrafficMirrorFilterRuleAsyncInvoker(
        UpdateTrafficMirrorFilterRuleRequest request) {
        return new AsyncInvoker<UpdateTrafficMirrorFilterRuleRequest, UpdateTrafficMirrorFilterRuleResponse>(request,
            VpcMeta.updateTrafficMirrorFilterRule, hcClient);
    }

    /**
     * 更新流量镜像会话
     *
     * 更新流量镜像会话
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateTrafficMirrorSessionRequest 请求对象
     * @return CompletableFuture<UpdateTrafficMirrorSessionResponse>
     */
    public CompletableFuture<UpdateTrafficMirrorSessionResponse> updateTrafficMirrorSessionAsync(
        UpdateTrafficMirrorSessionRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.updateTrafficMirrorSession);
    }

    /**
     * 更新流量镜像会话
     *
     * 更新流量镜像会话
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateTrafficMirrorSessionRequest 请求对象
     * @return AsyncInvoker<UpdateTrafficMirrorSessionRequest, UpdateTrafficMirrorSessionResponse>
     */
    public AsyncInvoker<UpdateTrafficMirrorSessionRequest, UpdateTrafficMirrorSessionResponse> updateTrafficMirrorSessionAsyncInvoker(
        UpdateTrafficMirrorSessionRequest request) {
        return new AsyncInvoker<UpdateTrafficMirrorSessionRequest, UpdateTrafficMirrorSessionResponse>(request,
            VpcMeta.updateTrafficMirrorSession, hcClient);
    }

    /**
     * 网络ACL插入规则
     *
     * 网络ACL插入规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param AddFirewallRulesRequest 请求对象
     * @return CompletableFuture<AddFirewallRulesResponse>
     */
    public CompletableFuture<AddFirewallRulesResponse> addFirewallRulesAsync(AddFirewallRulesRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.addFirewallRules);
    }

    /**
     * 网络ACL插入规则
     *
     * 网络ACL插入规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param AddFirewallRulesRequest 请求对象
     * @return AsyncInvoker<AddFirewallRulesRequest, AddFirewallRulesResponse>
     */
    public AsyncInvoker<AddFirewallRulesRequest, AddFirewallRulesResponse> addFirewallRulesAsyncInvoker(
        AddFirewallRulesRequest request) {
        return new AsyncInvoker<AddFirewallRulesRequest, AddFirewallRulesResponse>(request, VpcMeta.addFirewallRules,
            hcClient);
    }

    /**
     * 网络ACL绑定子网
     *
     * 网络ACL绑定子网
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param AssociateSubnetFirewallRequest 请求对象
     * @return CompletableFuture<AssociateSubnetFirewallResponse>
     */
    public CompletableFuture<AssociateSubnetFirewallResponse> associateSubnetFirewallAsync(
        AssociateSubnetFirewallRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.associateSubnetFirewall);
    }

    /**
     * 网络ACL绑定子网
     *
     * 网络ACL绑定子网
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param AssociateSubnetFirewallRequest 请求对象
     * @return AsyncInvoker<AssociateSubnetFirewallRequest, AssociateSubnetFirewallResponse>
     */
    public AsyncInvoker<AssociateSubnetFirewallRequest, AssociateSubnetFirewallResponse> associateSubnetFirewallAsyncInvoker(
        AssociateSubnetFirewallRequest request) {
        return new AsyncInvoker<AssociateSubnetFirewallRequest, AssociateSubnetFirewallResponse>(request,
            VpcMeta.associateSubnetFirewall, hcClient);
    }

    /**
     * 创建网络ACL
     *
     * 创建网络ACL
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateFirewallRequest 请求对象
     * @return CompletableFuture<CreateFirewallResponse>
     */
    public CompletableFuture<CreateFirewallResponse> createFirewallAsync(CreateFirewallRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.createFirewall);
    }

    /**
     * 创建网络ACL
     *
     * 创建网络ACL
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateFirewallRequest 请求对象
     * @return AsyncInvoker<CreateFirewallRequest, CreateFirewallResponse>
     */
    public AsyncInvoker<CreateFirewallRequest, CreateFirewallResponse> createFirewallAsyncInvoker(
        CreateFirewallRequest request) {
        return new AsyncInvoker<CreateFirewallRequest, CreateFirewallResponse>(request, VpcMeta.createFirewall,
            hcClient);
    }

    /**
     * 删除网络ACL
     *
     * 删除网络ACL
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteFirewallRequest 请求对象
     * @return CompletableFuture<DeleteFirewallResponse>
     */
    public CompletableFuture<DeleteFirewallResponse> deleteFirewallAsync(DeleteFirewallRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.deleteFirewall);
    }

    /**
     * 删除网络ACL
     *
     * 删除网络ACL
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteFirewallRequest 请求对象
     * @return AsyncInvoker<DeleteFirewallRequest, DeleteFirewallResponse>
     */
    public AsyncInvoker<DeleteFirewallRequest, DeleteFirewallResponse> deleteFirewallAsyncInvoker(
        DeleteFirewallRequest request) {
        return new AsyncInvoker<DeleteFirewallRequest, DeleteFirewallResponse>(request, VpcMeta.deleteFirewall,
            hcClient);
    }

    /**
     * 网络ACL解绑子网
     *
     * 网络ACL解绑子网
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DisassociateSubnetFirewallRequest 请求对象
     * @return CompletableFuture<DisassociateSubnetFirewallResponse>
     */
    public CompletableFuture<DisassociateSubnetFirewallResponse> disassociateSubnetFirewallAsync(
        DisassociateSubnetFirewallRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.disassociateSubnetFirewall);
    }

    /**
     * 网络ACL解绑子网
     *
     * 网络ACL解绑子网
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DisassociateSubnetFirewallRequest 请求对象
     * @return AsyncInvoker<DisassociateSubnetFirewallRequest, DisassociateSubnetFirewallResponse>
     */
    public AsyncInvoker<DisassociateSubnetFirewallRequest, DisassociateSubnetFirewallResponse> disassociateSubnetFirewallAsyncInvoker(
        DisassociateSubnetFirewallRequest request) {
        return new AsyncInvoker<DisassociateSubnetFirewallRequest, DisassociateSubnetFirewallResponse>(request,
            VpcMeta.disassociateSubnetFirewall, hcClient);
    }

    /**
     * 查询网络ACL列表
     *
     * 查询网络ACL列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListFirewallRequest 请求对象
     * @return CompletableFuture<ListFirewallResponse>
     */
    public CompletableFuture<ListFirewallResponse> listFirewallAsync(ListFirewallRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.listFirewall);
    }

    /**
     * 查询网络ACL列表
     *
     * 查询网络ACL列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListFirewallRequest 请求对象
     * @return AsyncInvoker<ListFirewallRequest, ListFirewallResponse>
     */
    public AsyncInvoker<ListFirewallRequest, ListFirewallResponse> listFirewallAsyncInvoker(
        ListFirewallRequest request) {
        return new AsyncInvoker<ListFirewallRequest, ListFirewallResponse>(request, VpcMeta.listFirewall, hcClient);
    }

    /**
     * 网络ACL移除规则
     *
     * 网络ACL移除规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RemoveFirewallRulesRequest 请求对象
     * @return CompletableFuture<RemoveFirewallRulesResponse>
     */
    public CompletableFuture<RemoveFirewallRulesResponse> removeFirewallRulesAsync(RemoveFirewallRulesRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.removeFirewallRules);
    }

    /**
     * 网络ACL移除规则
     *
     * 网络ACL移除规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RemoveFirewallRulesRequest 请求对象
     * @return AsyncInvoker<RemoveFirewallRulesRequest, RemoveFirewallRulesResponse>
     */
    public AsyncInvoker<RemoveFirewallRulesRequest, RemoveFirewallRulesResponse> removeFirewallRulesAsyncInvoker(
        RemoveFirewallRulesRequest request) {
        return new AsyncInvoker<RemoveFirewallRulesRequest, RemoveFirewallRulesResponse>(request,
            VpcMeta.removeFirewallRules, hcClient);
    }

    /**
     * 查询网络ACL详情
     *
     * 查询网络ACL详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowFirewallRequest 请求对象
     * @return CompletableFuture<ShowFirewallResponse>
     */
    public CompletableFuture<ShowFirewallResponse> showFirewallAsync(ShowFirewallRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.showFirewall);
    }

    /**
     * 查询网络ACL详情
     *
     * 查询网络ACL详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowFirewallRequest 请求对象
     * @return AsyncInvoker<ShowFirewallRequest, ShowFirewallResponse>
     */
    public AsyncInvoker<ShowFirewallRequest, ShowFirewallResponse> showFirewallAsyncInvoker(
        ShowFirewallRequest request) {
        return new AsyncInvoker<ShowFirewallRequest, ShowFirewallResponse>(request, VpcMeta.showFirewall, hcClient);
    }

    /**
     * 更新网络ACL
     *
     * 更新网络ACL
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateFirewallRequest 请求对象
     * @return CompletableFuture<UpdateFirewallResponse>
     */
    public CompletableFuture<UpdateFirewallResponse> updateFirewallAsync(UpdateFirewallRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.updateFirewall);
    }

    /**
     * 更新网络ACL
     *
     * 更新网络ACL
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateFirewallRequest 请求对象
     * @return AsyncInvoker<UpdateFirewallRequest, UpdateFirewallResponse>
     */
    public AsyncInvoker<UpdateFirewallRequest, UpdateFirewallResponse> updateFirewallAsyncInvoker(
        UpdateFirewallRequest request) {
        return new AsyncInvoker<UpdateFirewallRequest, UpdateFirewallResponse>(request, VpcMeta.updateFirewall,
            hcClient);
    }

    /**
     * 网络ACL更新规则
     *
     * 网络ACL更新规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateFirewallRulesRequest 请求对象
     * @return CompletableFuture<UpdateFirewallRulesResponse>
     */
    public CompletableFuture<UpdateFirewallRulesResponse> updateFirewallRulesAsync(UpdateFirewallRulesRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.updateFirewallRules);
    }

    /**
     * 网络ACL更新规则
     *
     * 网络ACL更新规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateFirewallRulesRequest 请求对象
     * @return AsyncInvoker<UpdateFirewallRulesRequest, UpdateFirewallRulesResponse>
     */
    public AsyncInvoker<UpdateFirewallRulesRequest, UpdateFirewallRulesResponse> updateFirewallRulesAsyncInvoker(
        UpdateFirewallRulesRequest request) {
        return new AsyncInvoker<UpdateFirewallRulesRequest, UpdateFirewallRulesResponse>(request,
            VpcMeta.updateFirewallRules, hcClient);
    }

    /**
     * 创建地址组
     *
     * 创建地址组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateAddressGroupRequest 请求对象
     * @return CompletableFuture<CreateAddressGroupResponse>
     */
    public CompletableFuture<CreateAddressGroupResponse> createAddressGroupAsync(CreateAddressGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.createAddressGroup);
    }

    /**
     * 创建地址组
     *
     * 创建地址组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateAddressGroupRequest 请求对象
     * @return AsyncInvoker<CreateAddressGroupRequest, CreateAddressGroupResponse>
     */
    public AsyncInvoker<CreateAddressGroupRequest, CreateAddressGroupResponse> createAddressGroupAsyncInvoker(
        CreateAddressGroupRequest request) {
        return new AsyncInvoker<CreateAddressGroupRequest, CreateAddressGroupResponse>(request,
            VpcMeta.createAddressGroup, hcClient);
    }

    /**
     * 删除地址组
     *
     * 删除地址组，非强制删除，删除前请确保未被其他资源引用
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteAddressGroupRequest 请求对象
     * @return CompletableFuture<DeleteAddressGroupResponse>
     */
    public CompletableFuture<DeleteAddressGroupResponse> deleteAddressGroupAsync(DeleteAddressGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.deleteAddressGroup);
    }

    /**
     * 删除地址组
     *
     * 删除地址组，非强制删除，删除前请确保未被其他资源引用
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteAddressGroupRequest 请求对象
     * @return AsyncInvoker<DeleteAddressGroupRequest, DeleteAddressGroupResponse>
     */
    public AsyncInvoker<DeleteAddressGroupRequest, DeleteAddressGroupResponse> deleteAddressGroupAsyncInvoker(
        DeleteAddressGroupRequest request) {
        return new AsyncInvoker<DeleteAddressGroupRequest, DeleteAddressGroupResponse>(request,
            VpcMeta.deleteAddressGroup, hcClient);
    }

    /**
     * 强制删除地址组
     *
     * 强制删除地址组，删除的地址组与安全组规则关联时，会删除地址组与关联的安全组规则。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteIpAddressGroupForceRequest 请求对象
     * @return CompletableFuture<DeleteIpAddressGroupForceResponse>
     */
    public CompletableFuture<DeleteIpAddressGroupForceResponse> deleteIpAddressGroupForceAsync(
        DeleteIpAddressGroupForceRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.deleteIpAddressGroupForce);
    }

    /**
     * 强制删除地址组
     *
     * 强制删除地址组，删除的地址组与安全组规则关联时，会删除地址组与关联的安全组规则。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteIpAddressGroupForceRequest 请求对象
     * @return AsyncInvoker<DeleteIpAddressGroupForceRequest, DeleteIpAddressGroupForceResponse>
     */
    public AsyncInvoker<DeleteIpAddressGroupForceRequest, DeleteIpAddressGroupForceResponse> deleteIpAddressGroupForceAsyncInvoker(
        DeleteIpAddressGroupForceRequest request) {
        return new AsyncInvoker<DeleteIpAddressGroupForceRequest, DeleteIpAddressGroupForceResponse>(request,
            VpcMeta.deleteIpAddressGroupForce, hcClient);
    }

    /**
     * 查询地址组列表
     *
     * 查询地址组列表，根据过滤条件进行过滤。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListAddressGroupRequest 请求对象
     * @return CompletableFuture<ListAddressGroupResponse>
     */
    public CompletableFuture<ListAddressGroupResponse> listAddressGroupAsync(ListAddressGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.listAddressGroup);
    }

    /**
     * 查询地址组列表
     *
     * 查询地址组列表，根据过滤条件进行过滤。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListAddressGroupRequest 请求对象
     * @return AsyncInvoker<ListAddressGroupRequest, ListAddressGroupResponse>
     */
    public AsyncInvoker<ListAddressGroupRequest, ListAddressGroupResponse> listAddressGroupAsyncInvoker(
        ListAddressGroupRequest request) {
        return new AsyncInvoker<ListAddressGroupRequest, ListAddressGroupResponse>(request, VpcMeta.listAddressGroup,
            hcClient);
    }

    /**
     * 查询地址组
     *
     * 查询地址组详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowAddressGroupRequest 请求对象
     * @return CompletableFuture<ShowAddressGroupResponse>
     */
    public CompletableFuture<ShowAddressGroupResponse> showAddressGroupAsync(ShowAddressGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.showAddressGroup);
    }

    /**
     * 查询地址组
     *
     * 查询地址组详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowAddressGroupRequest 请求对象
     * @return AsyncInvoker<ShowAddressGroupRequest, ShowAddressGroupResponse>
     */
    public AsyncInvoker<ShowAddressGroupRequest, ShowAddressGroupResponse> showAddressGroupAsyncInvoker(
        ShowAddressGroupRequest request) {
        return new AsyncInvoker<ShowAddressGroupRequest, ShowAddressGroupResponse>(request, VpcMeta.showAddressGroup,
            hcClient);
    }

    /**
     * 更新地址组
     *
     * 更新地址组。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateAddressGroupRequest 请求对象
     * @return CompletableFuture<UpdateAddressGroupResponse>
     */
    public CompletableFuture<UpdateAddressGroupResponse> updateAddressGroupAsync(UpdateAddressGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.updateAddressGroup);
    }

    /**
     * 更新地址组
     *
     * 更新地址组。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateAddressGroupRequest 请求对象
     * @return AsyncInvoker<UpdateAddressGroupRequest, UpdateAddressGroupResponse>
     */
    public AsyncInvoker<UpdateAddressGroupRequest, UpdateAddressGroupResponse> updateAddressGroupAsyncInvoker(
        UpdateAddressGroupRequest request) {
        return new AsyncInvoker<UpdateAddressGroupRequest, UpdateAddressGroupResponse>(request,
            VpcMeta.updateAddressGroup, hcClient);
    }

    /**
     * 添加VPC扩展网段
     *
     * 添加VPC的扩展网段
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param AddVpcExtendCidrRequest 请求对象
     * @return CompletableFuture<AddVpcExtendCidrResponse>
     */
    public CompletableFuture<AddVpcExtendCidrResponse> addVpcExtendCidrAsync(AddVpcExtendCidrRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.addVpcExtendCidr);
    }

    /**
     * 添加VPC扩展网段
     *
     * 添加VPC的扩展网段
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param AddVpcExtendCidrRequest 请求对象
     * @return AsyncInvoker<AddVpcExtendCidrRequest, AddVpcExtendCidrResponse>
     */
    public AsyncInvoker<AddVpcExtendCidrRequest, AddVpcExtendCidrResponse> addVpcExtendCidrAsyncInvoker(
        AddVpcExtendCidrRequest request) {
        return new AsyncInvoker<AddVpcExtendCidrRequest, AddVpcExtendCidrResponse>(request, VpcMeta.addVpcExtendCidr,
            hcClient);
    }

    /**
     * 创建VPC
     *
     * 创建虚拟私有云
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateVpcRequest 请求对象
     * @return CompletableFuture<CreateVpcResponse>
     */
    public CompletableFuture<CreateVpcResponse> createVpcAsync(CreateVpcRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.createVpc);
    }

    /**
     * 创建VPC
     *
     * 创建虚拟私有云
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateVpcRequest 请求对象
     * @return AsyncInvoker<CreateVpcRequest, CreateVpcResponse>
     */
    public AsyncInvoker<CreateVpcRequest, CreateVpcResponse> createVpcAsyncInvoker(CreateVpcRequest request) {
        return new AsyncInvoker<CreateVpcRequest, CreateVpcResponse>(request, VpcMeta.createVpc, hcClient);
    }

    /**
     * 删除VPC
     *
     * 删除VPC
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteVpcRequest 请求对象
     * @return CompletableFuture<DeleteVpcResponse>
     */
    public CompletableFuture<DeleteVpcResponse> deleteVpcAsync(DeleteVpcRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.deleteVpc);
    }

    /**
     * 删除VPC
     *
     * 删除VPC
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteVpcRequest 请求对象
     * @return AsyncInvoker<DeleteVpcRequest, DeleteVpcResponse>
     */
    public AsyncInvoker<DeleteVpcRequest, DeleteVpcResponse> deleteVpcAsyncInvoker(DeleteVpcRequest request) {
        return new AsyncInvoker<DeleteVpcRequest, DeleteVpcResponse>(request, VpcMeta.deleteVpc, hcClient);
    }

    /**
     * 查询VPC列表
     *
     * 查询vpc列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListVpcsRequest 请求对象
     * @return CompletableFuture<ListVpcsResponse>
     */
    public CompletableFuture<ListVpcsResponse> listVpcsAsync(ListVpcsRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.listVpcs);
    }

    /**
     * 查询VPC列表
     *
     * 查询vpc列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListVpcsRequest 请求对象
     * @return AsyncInvoker<ListVpcsRequest, ListVpcsResponse>
     */
    public AsyncInvoker<ListVpcsRequest, ListVpcsResponse> listVpcsAsyncInvoker(ListVpcsRequest request) {
        return new AsyncInvoker<ListVpcsRequest, ListVpcsResponse>(request, VpcMeta.listVpcs, hcClient);
    }

    /**
     * 移除VPC扩展网段
     *
     * 移除VPC扩展网段
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RemoveVpcExtendCidrRequest 请求对象
     * @return CompletableFuture<RemoveVpcExtendCidrResponse>
     */
    public CompletableFuture<RemoveVpcExtendCidrResponse> removeVpcExtendCidrAsync(RemoveVpcExtendCidrRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.removeVpcExtendCidr);
    }

    /**
     * 移除VPC扩展网段
     *
     * 移除VPC扩展网段
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RemoveVpcExtendCidrRequest 请求对象
     * @return AsyncInvoker<RemoveVpcExtendCidrRequest, RemoveVpcExtendCidrResponse>
     */
    public AsyncInvoker<RemoveVpcExtendCidrRequest, RemoveVpcExtendCidrResponse> removeVpcExtendCidrAsyncInvoker(
        RemoveVpcExtendCidrRequest request) {
        return new AsyncInvoker<RemoveVpcExtendCidrRequest, RemoveVpcExtendCidrResponse>(request,
            VpcMeta.removeVpcExtendCidr, hcClient);
    }

    /**
     * 查询VPC详情
     *
     * 查询vpc详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowVpcRequest 请求对象
     * @return CompletableFuture<ShowVpcResponse>
     */
    public CompletableFuture<ShowVpcResponse> showVpcAsync(ShowVpcRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.showVpc);
    }

    /**
     * 查询VPC详情
     *
     * 查询vpc详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowVpcRequest 请求对象
     * @return AsyncInvoker<ShowVpcRequest, ShowVpcResponse>
     */
    public AsyncInvoker<ShowVpcRequest, ShowVpcResponse> showVpcAsyncInvoker(ShowVpcRequest request) {
        return new AsyncInvoker<ShowVpcRequest, ShowVpcResponse>(request, VpcMeta.showVpc, hcClient);
    }

    /**
     * 更新VPC
     *
     * 更新vpc
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateVpcRequest 请求对象
     * @return CompletableFuture<UpdateVpcResponse>
     */
    public CompletableFuture<UpdateVpcResponse> updateVpcAsync(UpdateVpcRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.updateVpc);
    }

    /**
     * 更新VPC
     *
     * 更新vpc
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateVpcRequest 请求对象
     * @return AsyncInvoker<UpdateVpcRequest, UpdateVpcResponse>
     */
    public AsyncInvoker<UpdateVpcRequest, UpdateVpcResponse> updateVpcAsyncInvoker(UpdateVpcRequest request) {
        return new AsyncInvoker<UpdateVpcRequest, UpdateVpcResponse>(request, VpcMeta.updateVpc, hcClient);
    }

}
