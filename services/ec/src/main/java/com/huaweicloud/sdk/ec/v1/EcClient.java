package com.huaweicloud.sdk.ec.v1;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.SyncInvoker;
import com.huaweicloud.sdk.ec.v1.model.AddEcnWithErRequest;
import com.huaweicloud.sdk.ec.v1.model.AddEcnWithErResponse;
import com.huaweicloud.sdk.ec.v1.model.AddEcnWithIegRequest;
import com.huaweicloud.sdk.ec.v1.model.AddEcnWithIegResponse;
import com.huaweicloud.sdk.ec.v1.model.AddVrrpConfigRequest;
import com.huaweicloud.sdk.ec.v1.model.AddVrrpConfigResponse;
import com.huaweicloud.sdk.ec.v1.model.ChangeIegPasswordRequest;
import com.huaweicloud.sdk.ec.v1.model.ChangeIegPasswordResponse;
import com.huaweicloud.sdk.ec.v1.model.CreateEcnAccessPointRequest;
import com.huaweicloud.sdk.ec.v1.model.CreateEcnAccessPointResponse;
import com.huaweicloud.sdk.ec.v1.model.CreateEquipmentLanConfigRequest;
import com.huaweicloud.sdk.ec.v1.model.CreateEquipmentLanConfigResponse;
import com.huaweicloud.sdk.ec.v1.model.CreateEquipmentRequest;
import com.huaweicloud.sdk.ec.v1.model.CreateEquipmentResponse;
import com.huaweicloud.sdk.ec.v1.model.CreateEquipmentStaticRouteConfigRequest;
import com.huaweicloud.sdk.ec.v1.model.CreateEquipmentStaticRouteConfigResponse;
import com.huaweicloud.sdk.ec.v1.model.DeleteEcnAccessPointRequest;
import com.huaweicloud.sdk.ec.v1.model.DeleteEcnAccessPointResponse;
import com.huaweicloud.sdk.ec.v1.model.DeleteEcnWithErRequest;
import com.huaweicloud.sdk.ec.v1.model.DeleteEcnWithErResponse;
import com.huaweicloud.sdk.ec.v1.model.DeleteEcnWithIegRequest;
import com.huaweicloud.sdk.ec.v1.model.DeleteEcnWithIegResponse;
import com.huaweicloud.sdk.ec.v1.model.DeleteEquipmentLanConfigRequest;
import com.huaweicloud.sdk.ec.v1.model.DeleteEquipmentLanConfigResponse;
import com.huaweicloud.sdk.ec.v1.model.DeleteEquipmentRequest;
import com.huaweicloud.sdk.ec.v1.model.DeleteEquipmentResponse;
import com.huaweicloud.sdk.ec.v1.model.DeleteEquipmentStaticRouteConfigRequest;
import com.huaweicloud.sdk.ec.v1.model.DeleteEquipmentStaticRouteConfigResponse;
import com.huaweicloud.sdk.ec.v1.model.DeleteVrrpConfigRequest;
import com.huaweicloud.sdk.ec.v1.model.DeleteVrrpConfigResponse;
import com.huaweicloud.sdk.ec.v1.model.GenerateInitialConfigurationRequest;
import com.huaweicloud.sdk.ec.v1.model.GenerateInitialConfigurationResponse;
import com.huaweicloud.sdk.ec.v1.model.ListEcnAccessPointByEcnIdRequest;
import com.huaweicloud.sdk.ec.v1.model.ListEcnAccessPointByEcnIdResponse;
import com.huaweicloud.sdk.ec.v1.model.ListEcnRequest;
import com.huaweicloud.sdk.ec.v1.model.ListEcnResponse;
import com.huaweicloud.sdk.ec.v1.model.ListEcnWithErRequest;
import com.huaweicloud.sdk.ec.v1.model.ListEcnWithErResponse;
import com.huaweicloud.sdk.ec.v1.model.ListEcnWithIegRequest;
import com.huaweicloud.sdk.ec.v1.model.ListEcnWithIegResponse;
import com.huaweicloud.sdk.ec.v1.model.ListEquipmentInterfaceNameRequest;
import com.huaweicloud.sdk.ec.v1.model.ListEquipmentInterfaceNameResponse;
import com.huaweicloud.sdk.ec.v1.model.ListEquipmentsRequest;
import com.huaweicloud.sdk.ec.v1.model.ListEquipmentsResponse;
import com.huaweicloud.sdk.ec.v1.model.ListIegRequest;
import com.huaweicloud.sdk.ec.v1.model.ListIegResponse;
import com.huaweicloud.sdk.ec.v1.model.RebootEquipmentRequest;
import com.huaweicloud.sdk.ec.v1.model.RebootEquipmentResponse;
import com.huaweicloud.sdk.ec.v1.model.ShowEcnInfoRequest;
import com.huaweicloud.sdk.ec.v1.model.ShowEcnInfoResponse;
import com.huaweicloud.sdk.ec.v1.model.ShowEcnWithIegRequest;
import com.huaweicloud.sdk.ec.v1.model.ShowEcnWithIegResponse;
import com.huaweicloud.sdk.ec.v1.model.ShowEquipmentDnsInfoRequest;
import com.huaweicloud.sdk.ec.v1.model.ShowEquipmentDnsInfoResponse;
import com.huaweicloud.sdk.ec.v1.model.ShowEquipmentInfoRequest;
import com.huaweicloud.sdk.ec.v1.model.ShowEquipmentInfoResponse;
import com.huaweicloud.sdk.ec.v1.model.ShowEquipmentLanInfoRequest;
import com.huaweicloud.sdk.ec.v1.model.ShowEquipmentLanInfoResponse;
import com.huaweicloud.sdk.ec.v1.model.ShowEquipmentOspfRequest;
import com.huaweicloud.sdk.ec.v1.model.ShowEquipmentOspfResponse;
import com.huaweicloud.sdk.ec.v1.model.ShowEquipmentSpecificConfigRequest;
import com.huaweicloud.sdk.ec.v1.model.ShowEquipmentSpecificConfigResponse;
import com.huaweicloud.sdk.ec.v1.model.ShowEquipmentStaticRouteInfoRequest;
import com.huaweicloud.sdk.ec.v1.model.ShowEquipmentStaticRouteInfoResponse;
import com.huaweicloud.sdk.ec.v1.model.ShowEquipmentWanInfoRequest;
import com.huaweicloud.sdk.ec.v1.model.ShowEquipmentWanInfoResponse;
import com.huaweicloud.sdk.ec.v1.model.ShowIegInfoRequest;
import com.huaweicloud.sdk.ec.v1.model.ShowIegInfoResponse;
import com.huaweicloud.sdk.ec.v1.model.ShowQuotasInfoRequest;
import com.huaweicloud.sdk.ec.v1.model.ShowQuotasInfoResponse;
import com.huaweicloud.sdk.ec.v1.model.ShowVrrpConfigRequest;
import com.huaweicloud.sdk.ec.v1.model.ShowVrrpConfigResponse;
import com.huaweicloud.sdk.ec.v1.model.SwitchEquipmentHaTypeRequest;
import com.huaweicloud.sdk.ec.v1.model.SwitchEquipmentHaTypeResponse;
import com.huaweicloud.sdk.ec.v1.model.UpdateEcnAccessPointRequest;
import com.huaweicloud.sdk.ec.v1.model.UpdateEcnAccessPointResponse;
import com.huaweicloud.sdk.ec.v1.model.UpdateEcnRequest;
import com.huaweicloud.sdk.ec.v1.model.UpdateEcnResponse;
import com.huaweicloud.sdk.ec.v1.model.UpdateEquipmentDnsInfoRequest;
import com.huaweicloud.sdk.ec.v1.model.UpdateEquipmentDnsInfoResponse;
import com.huaweicloud.sdk.ec.v1.model.UpdateEquipmentEsnRequest;
import com.huaweicloud.sdk.ec.v1.model.UpdateEquipmentEsnResponse;
import com.huaweicloud.sdk.ec.v1.model.UpdateEquipmentInfoRequest;
import com.huaweicloud.sdk.ec.v1.model.UpdateEquipmentInfoResponse;
import com.huaweicloud.sdk.ec.v1.model.UpdateEquipmentLanConfigRequest;
import com.huaweicloud.sdk.ec.v1.model.UpdateEquipmentLanConfigResponse;
import com.huaweicloud.sdk.ec.v1.model.UpdateEquipmentOspfRequest;
import com.huaweicloud.sdk.ec.v1.model.UpdateEquipmentOspfResponse;
import com.huaweicloud.sdk.ec.v1.model.UpdateEquipmentStaticRouteConfigRequest;
import com.huaweicloud.sdk.ec.v1.model.UpdateEquipmentStaticRouteConfigResponse;
import com.huaweicloud.sdk.ec.v1.model.UpdateEquipmentWanConfigRequest;
import com.huaweicloud.sdk.ec.v1.model.UpdateEquipmentWanConfigResponse;
import com.huaweicloud.sdk.ec.v1.model.UpdateIegRequest;
import com.huaweicloud.sdk.ec.v1.model.UpdateIegResponse;
import com.huaweicloud.sdk.ec.v1.model.UpdateVrrpConfigRequest;
import com.huaweicloud.sdk.ec.v1.model.UpdateVrrpConfigResponse;

public class EcClient {

    protected HcClient hcClient;

    public EcClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<EcClient> newBuilder() {
        ClientBuilder<EcClient> clientBuilder = new ClientBuilder<>(EcClient::new, "GlobalCredentials");
        return clientBuilder;
    }

    /**
     * 添加新的接入点
     *
     * 添加新的接入点
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateEcnAccessPointRequest 请求对象
     * @return CreateEcnAccessPointResponse
     */
    public CreateEcnAccessPointResponse createEcnAccessPoint(CreateEcnAccessPointRequest request) {
        return hcClient.syncInvokeHttp(request, EcMeta.createEcnAccessPoint);
    }

    /**
     * 添加新的接入点
     *
     * 添加新的接入点
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateEcnAccessPointRequest 请求对象
     * @return SyncInvoker<CreateEcnAccessPointRequest, CreateEcnAccessPointResponse>
     */
    public SyncInvoker<CreateEcnAccessPointRequest, CreateEcnAccessPointResponse> createEcnAccessPointInvoker(
        CreateEcnAccessPointRequest request) {
        return new SyncInvoker<CreateEcnAccessPointRequest, CreateEcnAccessPointResponse>(request,
            EcMeta.createEcnAccessPoint, hcClient);
    }

    /**
     * 删除接入点
     *
     * 根据企业连接网络ID，删除接入点
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteEcnAccessPointRequest 请求对象
     * @return DeleteEcnAccessPointResponse
     */
    public DeleteEcnAccessPointResponse deleteEcnAccessPoint(DeleteEcnAccessPointRequest request) {
        return hcClient.syncInvokeHttp(request, EcMeta.deleteEcnAccessPoint);
    }

    /**
     * 删除接入点
     *
     * 根据企业连接网络ID，删除接入点
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteEcnAccessPointRequest 请求对象
     * @return SyncInvoker<DeleteEcnAccessPointRequest, DeleteEcnAccessPointResponse>
     */
    public SyncInvoker<DeleteEcnAccessPointRequest, DeleteEcnAccessPointResponse> deleteEcnAccessPointInvoker(
        DeleteEcnAccessPointRequest request) {
        return new SyncInvoker<DeleteEcnAccessPointRequest, DeleteEcnAccessPointResponse>(request,
            EcMeta.deleteEcnAccessPoint, hcClient);
    }

    /**
     * 查询接入点
     *
     * 根据企业连接网络ID，查询其下所有接入点
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListEcnAccessPointByEcnIdRequest 请求对象
     * @return ListEcnAccessPointByEcnIdResponse
     */
    public ListEcnAccessPointByEcnIdResponse listEcnAccessPointByEcnId(ListEcnAccessPointByEcnIdRequest request) {
        return hcClient.syncInvokeHttp(request, EcMeta.listEcnAccessPointByEcnId);
    }

    /**
     * 查询接入点
     *
     * 根据企业连接网络ID，查询其下所有接入点
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListEcnAccessPointByEcnIdRequest 请求对象
     * @return SyncInvoker<ListEcnAccessPointByEcnIdRequest, ListEcnAccessPointByEcnIdResponse>
     */
    public SyncInvoker<ListEcnAccessPointByEcnIdRequest, ListEcnAccessPointByEcnIdResponse> listEcnAccessPointByEcnIdInvoker(
        ListEcnAccessPointByEcnIdRequest request) {
        return new SyncInvoker<ListEcnAccessPointByEcnIdRequest, ListEcnAccessPointByEcnIdResponse>(request,
            EcMeta.listEcnAccessPointByEcnId, hcClient);
    }

    /**
     * 更新接入点
     *
     * 根据企业连接网络ID，更新接入点
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateEcnAccessPointRequest 请求对象
     * @return UpdateEcnAccessPointResponse
     */
    public UpdateEcnAccessPointResponse updateEcnAccessPoint(UpdateEcnAccessPointRequest request) {
        return hcClient.syncInvokeHttp(request, EcMeta.updateEcnAccessPoint);
    }

    /**
     * 更新接入点
     *
     * 根据企业连接网络ID，更新接入点
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateEcnAccessPointRequest 请求对象
     * @return SyncInvoker<UpdateEcnAccessPointRequest, UpdateEcnAccessPointResponse>
     */
    public SyncInvoker<UpdateEcnAccessPointRequest, UpdateEcnAccessPointResponse> updateEcnAccessPointInvoker(
        UpdateEcnAccessPointRequest request) {
        return new SyncInvoker<UpdateEcnAccessPointRequest, UpdateEcnAccessPointResponse>(request,
            EcMeta.updateEcnAccessPoint, hcClient);
    }

    /**
     * 绑定智能企业网关到企业连接网络
     *
     * 绑定智能企业网关到企业连接网络
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param AddEcnWithIegRequest 请求对象
     * @return AddEcnWithIegResponse
     */
    public AddEcnWithIegResponse addEcnWithIeg(AddEcnWithIegRequest request) {
        return hcClient.syncInvokeHttp(request, EcMeta.addEcnWithIeg);
    }

    /**
     * 绑定智能企业网关到企业连接网络
     *
     * 绑定智能企业网关到企业连接网络
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param AddEcnWithIegRequest 请求对象
     * @return SyncInvoker<AddEcnWithIegRequest, AddEcnWithIegResponse>
     */
    public SyncInvoker<AddEcnWithIegRequest, AddEcnWithIegResponse> addEcnWithIegInvoker(AddEcnWithIegRequest request) {
        return new SyncInvoker<AddEcnWithIegRequest, AddEcnWithIegResponse>(request, EcMeta.addEcnWithIeg, hcClient);
    }

    /**
     * 解除智能企业网关和企业连接网络的绑定
     *
     * 解除智能企业网关和企业连接网络的绑定
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteEcnWithIegRequest 请求对象
     * @return DeleteEcnWithIegResponse
     */
    public DeleteEcnWithIegResponse deleteEcnWithIeg(DeleteEcnWithIegRequest request) {
        return hcClient.syncInvokeHttp(request, EcMeta.deleteEcnWithIeg);
    }

    /**
     * 解除智能企业网关和企业连接网络的绑定
     *
     * 解除智能企业网关和企业连接网络的绑定
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteEcnWithIegRequest 请求对象
     * @return SyncInvoker<DeleteEcnWithIegRequest, DeleteEcnWithIegResponse>
     */
    public SyncInvoker<DeleteEcnWithIegRequest, DeleteEcnWithIegResponse> deleteEcnWithIegInvoker(
        DeleteEcnWithIegRequest request) {
        return new SyncInvoker<DeleteEcnWithIegRequest, DeleteEcnWithIegResponse>(request, EcMeta.deleteEcnWithIeg,
            hcClient);
    }

    /**
     * 查询企业连接网络列表
     *
     * 查询租户的企业连接网络列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListEcnRequest 请求对象
     * @return ListEcnResponse
     */
    public ListEcnResponse listEcn(ListEcnRequest request) {
        return hcClient.syncInvokeHttp(request, EcMeta.listEcn);
    }

    /**
     * 查询企业连接网络列表
     *
     * 查询租户的企业连接网络列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListEcnRequest 请求对象
     * @return SyncInvoker<ListEcnRequest, ListEcnResponse>
     */
    public SyncInvoker<ListEcnRequest, ListEcnResponse> listEcnInvoker(ListEcnRequest request) {
        return new SyncInvoker<ListEcnRequest, ListEcnResponse>(request, EcMeta.listEcn, hcClient);
    }

    /**
     * 查询企业连接网络与智能企业网关绑定关系
     *
     * 根据企业连接网络ID，查询企业连接网络与智能企业网关绑定关系
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListEcnWithIegRequest 请求对象
     * @return ListEcnWithIegResponse
     */
    public ListEcnWithIegResponse listEcnWithIeg(ListEcnWithIegRequest request) {
        return hcClient.syncInvokeHttp(request, EcMeta.listEcnWithIeg);
    }

    /**
     * 查询企业连接网络与智能企业网关绑定关系
     *
     * 根据企业连接网络ID，查询企业连接网络与智能企业网关绑定关系
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListEcnWithIegRequest 请求对象
     * @return SyncInvoker<ListEcnWithIegRequest, ListEcnWithIegResponse>
     */
    public SyncInvoker<ListEcnWithIegRequest, ListEcnWithIegResponse> listEcnWithIegInvoker(
        ListEcnWithIegRequest request) {
        return new SyncInvoker<ListEcnWithIegRequest, ListEcnWithIegResponse>(request, EcMeta.listEcnWithIeg, hcClient);
    }

    /**
     * 查询企业连接网络
     *
     * 根据企业连接网络ID，查询企业连接网络
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowEcnInfoRequest 请求对象
     * @return ShowEcnInfoResponse
     */
    public ShowEcnInfoResponse showEcnInfo(ShowEcnInfoRequest request) {
        return hcClient.syncInvokeHttp(request, EcMeta.showEcnInfo);
    }

    /**
     * 查询企业连接网络
     *
     * 根据企业连接网络ID，查询企业连接网络
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowEcnInfoRequest 请求对象
     * @return SyncInvoker<ShowEcnInfoRequest, ShowEcnInfoResponse>
     */
    public SyncInvoker<ShowEcnInfoRequest, ShowEcnInfoResponse> showEcnInfoInvoker(ShowEcnInfoRequest request) {
        return new SyncInvoker<ShowEcnInfoRequest, ShowEcnInfoResponse>(request, EcMeta.showEcnInfo, hcClient);
    }

    /**
     * 查询企业连接网络与单个智能企业网关绑定关系
     *
     * 查询企业连接网络与单个智能企业网关绑定关系
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowEcnWithIegRequest 请求对象
     * @return ShowEcnWithIegResponse
     */
    public ShowEcnWithIegResponse showEcnWithIeg(ShowEcnWithIegRequest request) {
        return hcClient.syncInvokeHttp(request, EcMeta.showEcnWithIeg);
    }

    /**
     * 查询企业连接网络与单个智能企业网关绑定关系
     *
     * 查询企业连接网络与单个智能企业网关绑定关系
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowEcnWithIegRequest 请求对象
     * @return SyncInvoker<ShowEcnWithIegRequest, ShowEcnWithIegResponse>
     */
    public SyncInvoker<ShowEcnWithIegRequest, ShowEcnWithIegResponse> showEcnWithIegInvoker(
        ShowEcnWithIegRequest request) {
        return new SyncInvoker<ShowEcnWithIegRequest, ShowEcnWithIegResponse>(request, EcMeta.showEcnWithIeg, hcClient);
    }

    /**
     * 更新企业连接网络
     *
     * 根据企业连接网络ID，更新企业连接网络
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateEcnRequest 请求对象
     * @return UpdateEcnResponse
     */
    public UpdateEcnResponse updateEcn(UpdateEcnRequest request) {
        return hcClient.syncInvokeHttp(request, EcMeta.updateEcn);
    }

    /**
     * 更新企业连接网络
     *
     * 根据企业连接网络ID，更新企业连接网络
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateEcnRequest 请求对象
     * @return SyncInvoker<UpdateEcnRequest, UpdateEcnResponse>
     */
    public SyncInvoker<UpdateEcnRequest, UpdateEcnResponse> updateEcnInvoker(UpdateEcnRequest request) {
        return new SyncInvoker<UpdateEcnRequest, UpdateEcnResponse>(request, EcMeta.updateEcn, hcClient);
    }

    /**
     * 激活智能企业网关设备
     *
     * 激活智能企业网关设备
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateEquipmentRequest 请求对象
     * @return CreateEquipmentResponse
     */
    public CreateEquipmentResponse createEquipment(CreateEquipmentRequest request) {
        return hcClient.syncInvokeHttp(request, EcMeta.createEquipment);
    }

    /**
     * 激活智能企业网关设备
     *
     * 激活智能企业网关设备
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateEquipmentRequest 请求对象
     * @return SyncInvoker<CreateEquipmentRequest, CreateEquipmentResponse>
     */
    public SyncInvoker<CreateEquipmentRequest, CreateEquipmentResponse> createEquipmentInvoker(
        CreateEquipmentRequest request) {
        return new SyncInvoker<CreateEquipmentRequest, CreateEquipmentResponse>(request, EcMeta.createEquipment,
            hcClient);
    }

    /**
     * 移除智能企业网关设备
     *
     * 移除智能企业网关设备
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteEquipmentRequest 请求对象
     * @return DeleteEquipmentResponse
     */
    public DeleteEquipmentResponse deleteEquipment(DeleteEquipmentRequest request) {
        return hcClient.syncInvokeHttp(request, EcMeta.deleteEquipment);
    }

    /**
     * 移除智能企业网关设备
     *
     * 移除智能企业网关设备
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteEquipmentRequest 请求对象
     * @return SyncInvoker<DeleteEquipmentRequest, DeleteEquipmentResponse>
     */
    public SyncInvoker<DeleteEquipmentRequest, DeleteEquipmentResponse> deleteEquipmentInvoker(
        DeleteEquipmentRequest request) {
        return new SyncInvoker<DeleteEquipmentRequest, DeleteEquipmentResponse>(request, EcMeta.deleteEquipment,
            hcClient);
    }

    /**
     * 生成智能企业网关设备初始配置
     *
     * 生成智能企业网关设备初始配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param GenerateInitialConfigurationRequest 请求对象
     * @return GenerateInitialConfigurationResponse
     */
    public GenerateInitialConfigurationResponse generateInitialConfiguration(
        GenerateInitialConfigurationRequest request) {
        return hcClient.syncInvokeHttp(request, EcMeta.generateInitialConfiguration);
    }

    /**
     * 生成智能企业网关设备初始配置
     *
     * 生成智能企业网关设备初始配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param GenerateInitialConfigurationRequest 请求对象
     * @return SyncInvoker<GenerateInitialConfigurationRequest, GenerateInitialConfigurationResponse>
     */
    public SyncInvoker<GenerateInitialConfigurationRequest, GenerateInitialConfigurationResponse> generateInitialConfigurationInvoker(
        GenerateInitialConfigurationRequest request) {
        return new SyncInvoker<GenerateInitialConfigurationRequest, GenerateInitialConfigurationResponse>(request,
            EcMeta.generateInitialConfiguration, hcClient);
    }

    /**
     * 查询智能企业网关设备列表
     *
     * 根据智能企业网关ID，查询智能企业网关设备列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListEquipmentsRequest 请求对象
     * @return ListEquipmentsResponse
     */
    public ListEquipmentsResponse listEquipments(ListEquipmentsRequest request) {
        return hcClient.syncInvokeHttp(request, EcMeta.listEquipments);
    }

    /**
     * 查询智能企业网关设备列表
     *
     * 根据智能企业网关ID，查询智能企业网关设备列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListEquipmentsRequest 请求对象
     * @return SyncInvoker<ListEquipmentsRequest, ListEquipmentsResponse>
     */
    public SyncInvoker<ListEquipmentsRequest, ListEquipmentsResponse> listEquipmentsInvoker(
        ListEquipmentsRequest request) {
        return new SyncInvoker<ListEquipmentsRequest, ListEquipmentsResponse>(request, EcMeta.listEquipments, hcClient);
    }

    /**
     * 重启智能企业网关设备
     *
     * 重启智能企业网关设备
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RebootEquipmentRequest 请求对象
     * @return RebootEquipmentResponse
     */
    public RebootEquipmentResponse rebootEquipment(RebootEquipmentRequest request) {
        return hcClient.syncInvokeHttp(request, EcMeta.rebootEquipment);
    }

    /**
     * 重启智能企业网关设备
     *
     * 重启智能企业网关设备
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RebootEquipmentRequest 请求对象
     * @return SyncInvoker<RebootEquipmentRequest, RebootEquipmentResponse>
     */
    public SyncInvoker<RebootEquipmentRequest, RebootEquipmentResponse> rebootEquipmentInvoker(
        RebootEquipmentRequest request) {
        return new SyncInvoker<RebootEquipmentRequest, RebootEquipmentResponse>(request, EcMeta.rebootEquipment,
            hcClient);
    }

    /**
     * 查询智能企业网关设备
     *
     * 查询智能企业网关设备
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowEquipmentInfoRequest 请求对象
     * @return ShowEquipmentInfoResponse
     */
    public ShowEquipmentInfoResponse showEquipmentInfo(ShowEquipmentInfoRequest request) {
        return hcClient.syncInvokeHttp(request, EcMeta.showEquipmentInfo);
    }

    /**
     * 查询智能企业网关设备
     *
     * 查询智能企业网关设备
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowEquipmentInfoRequest 请求对象
     * @return SyncInvoker<ShowEquipmentInfoRequest, ShowEquipmentInfoResponse>
     */
    public SyncInvoker<ShowEquipmentInfoRequest, ShowEquipmentInfoResponse> showEquipmentInfoInvoker(
        ShowEquipmentInfoRequest request) {
        return new SyncInvoker<ShowEquipmentInfoRequest, ShowEquipmentInfoResponse>(request, EcMeta.showEquipmentInfo,
            hcClient);
    }

    /**
     * 查询智能企业网关设备基础规格配置
     *
     * 查询智能企业网关设备基础规格配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowEquipmentSpecificConfigRequest 请求对象
     * @return ShowEquipmentSpecificConfigResponse
     */
    public ShowEquipmentSpecificConfigResponse showEquipmentSpecificConfig(ShowEquipmentSpecificConfigRequest request) {
        return hcClient.syncInvokeHttp(request, EcMeta.showEquipmentSpecificConfig);
    }

    /**
     * 查询智能企业网关设备基础规格配置
     *
     * 查询智能企业网关设备基础规格配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowEquipmentSpecificConfigRequest 请求对象
     * @return SyncInvoker<ShowEquipmentSpecificConfigRequest, ShowEquipmentSpecificConfigResponse>
     */
    public SyncInvoker<ShowEquipmentSpecificConfigRequest, ShowEquipmentSpecificConfigResponse> showEquipmentSpecificConfigInvoker(
        ShowEquipmentSpecificConfigRequest request) {
        return new SyncInvoker<ShowEquipmentSpecificConfigRequest, ShowEquipmentSpecificConfigResponse>(request,
            EcMeta.showEquipmentSpecificConfig, hcClient);
    }

    /**
     * 修改智能企业网关设备ESN
     *
     * 修改智能企业网关设备ESN
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateEquipmentEsnRequest 请求对象
     * @return UpdateEquipmentEsnResponse
     */
    public UpdateEquipmentEsnResponse updateEquipmentEsn(UpdateEquipmentEsnRequest request) {
        return hcClient.syncInvokeHttp(request, EcMeta.updateEquipmentEsn);
    }

    /**
     * 修改智能企业网关设备ESN
     *
     * 修改智能企业网关设备ESN
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateEquipmentEsnRequest 请求对象
     * @return SyncInvoker<UpdateEquipmentEsnRequest, UpdateEquipmentEsnResponse>
     */
    public SyncInvoker<UpdateEquipmentEsnRequest, UpdateEquipmentEsnResponse> updateEquipmentEsnInvoker(
        UpdateEquipmentEsnRequest request) {
        return new SyncInvoker<UpdateEquipmentEsnRequest, UpdateEquipmentEsnResponse>(request,
            EcMeta.updateEquipmentEsn, hcClient);
    }

    /**
     * 更新智能企业网关设备
     *
     * 更新智能企业网关设备
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateEquipmentInfoRequest 请求对象
     * @return UpdateEquipmentInfoResponse
     */
    public UpdateEquipmentInfoResponse updateEquipmentInfo(UpdateEquipmentInfoRequest request) {
        return hcClient.syncInvokeHttp(request, EcMeta.updateEquipmentInfo);
    }

    /**
     * 更新智能企业网关设备
     *
     * 更新智能企业网关设备
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateEquipmentInfoRequest 请求对象
     * @return SyncInvoker<UpdateEquipmentInfoRequest, UpdateEquipmentInfoResponse>
     */
    public SyncInvoker<UpdateEquipmentInfoRequest, UpdateEquipmentInfoResponse> updateEquipmentInfoInvoker(
        UpdateEquipmentInfoRequest request) {
        return new SyncInvoker<UpdateEquipmentInfoRequest, UpdateEquipmentInfoResponse>(request,
            EcMeta.updateEquipmentInfo, hcClient);
    }

    /**
     * 创建智能企业网关设备LAN口配置
     *
     * 创建智能企业网关设备LAN口配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateEquipmentLanConfigRequest 请求对象
     * @return CreateEquipmentLanConfigResponse
     */
    public CreateEquipmentLanConfigResponse createEquipmentLanConfig(CreateEquipmentLanConfigRequest request) {
        return hcClient.syncInvokeHttp(request, EcMeta.createEquipmentLanConfig);
    }

    /**
     * 创建智能企业网关设备LAN口配置
     *
     * 创建智能企业网关设备LAN口配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateEquipmentLanConfigRequest 请求对象
     * @return SyncInvoker<CreateEquipmentLanConfigRequest, CreateEquipmentLanConfigResponse>
     */
    public SyncInvoker<CreateEquipmentLanConfigRequest, CreateEquipmentLanConfigResponse> createEquipmentLanConfigInvoker(
        CreateEquipmentLanConfigRequest request) {
        return new SyncInvoker<CreateEquipmentLanConfigRequest, CreateEquipmentLanConfigResponse>(request,
            EcMeta.createEquipmentLanConfig, hcClient);
    }

    /**
     * 删除智能企业网关设备LAN口配置
     *
     * 删除智能企业网关设备LAN口配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteEquipmentLanConfigRequest 请求对象
     * @return DeleteEquipmentLanConfigResponse
     */
    public DeleteEquipmentLanConfigResponse deleteEquipmentLanConfig(DeleteEquipmentLanConfigRequest request) {
        return hcClient.syncInvokeHttp(request, EcMeta.deleteEquipmentLanConfig);
    }

    /**
     * 删除智能企业网关设备LAN口配置
     *
     * 删除智能企业网关设备LAN口配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteEquipmentLanConfigRequest 请求对象
     * @return SyncInvoker<DeleteEquipmentLanConfigRequest, DeleteEquipmentLanConfigResponse>
     */
    public SyncInvoker<DeleteEquipmentLanConfigRequest, DeleteEquipmentLanConfigResponse> deleteEquipmentLanConfigInvoker(
        DeleteEquipmentLanConfigRequest request) {
        return new SyncInvoker<DeleteEquipmentLanConfigRequest, DeleteEquipmentLanConfigResponse>(request,
            EcMeta.deleteEquipmentLanConfig, hcClient);
    }

    /**
     * 查询智能企业网关已配置的接口名字
     *
     * 查询智能企业网关已配置的接口名字
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListEquipmentInterfaceNameRequest 请求对象
     * @return ListEquipmentInterfaceNameResponse
     */
    public ListEquipmentInterfaceNameResponse listEquipmentInterfaceName(ListEquipmentInterfaceNameRequest request) {
        return hcClient.syncInvokeHttp(request, EcMeta.listEquipmentInterfaceName);
    }

    /**
     * 查询智能企业网关已配置的接口名字
     *
     * 查询智能企业网关已配置的接口名字
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListEquipmentInterfaceNameRequest 请求对象
     * @return SyncInvoker<ListEquipmentInterfaceNameRequest, ListEquipmentInterfaceNameResponse>
     */
    public SyncInvoker<ListEquipmentInterfaceNameRequest, ListEquipmentInterfaceNameResponse> listEquipmentInterfaceNameInvoker(
        ListEquipmentInterfaceNameRequest request) {
        return new SyncInvoker<ListEquipmentInterfaceNameRequest, ListEquipmentInterfaceNameResponse>(request,
            EcMeta.listEquipmentInterfaceName, hcClient);
    }

    /**
     * 查询智能企业网关设备主备DNS配置
     *
     * 查询智能企业网关设备主备DNS配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowEquipmentDnsInfoRequest 请求对象
     * @return ShowEquipmentDnsInfoResponse
     */
    public ShowEquipmentDnsInfoResponse showEquipmentDnsInfo(ShowEquipmentDnsInfoRequest request) {
        return hcClient.syncInvokeHttp(request, EcMeta.showEquipmentDnsInfo);
    }

    /**
     * 查询智能企业网关设备主备DNS配置
     *
     * 查询智能企业网关设备主备DNS配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowEquipmentDnsInfoRequest 请求对象
     * @return SyncInvoker<ShowEquipmentDnsInfoRequest, ShowEquipmentDnsInfoResponse>
     */
    public SyncInvoker<ShowEquipmentDnsInfoRequest, ShowEquipmentDnsInfoResponse> showEquipmentDnsInfoInvoker(
        ShowEquipmentDnsInfoRequest request) {
        return new SyncInvoker<ShowEquipmentDnsInfoRequest, ShowEquipmentDnsInfoResponse>(request,
            EcMeta.showEquipmentDnsInfo, hcClient);
    }

    /**
     * 查询智能企业网关设备LAN口配置
     *
     * 查询智能企业网关设备LAN口配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowEquipmentLanInfoRequest 请求对象
     * @return ShowEquipmentLanInfoResponse
     */
    public ShowEquipmentLanInfoResponse showEquipmentLanInfo(ShowEquipmentLanInfoRequest request) {
        return hcClient.syncInvokeHttp(request, EcMeta.showEquipmentLanInfo);
    }

    /**
     * 查询智能企业网关设备LAN口配置
     *
     * 查询智能企业网关设备LAN口配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowEquipmentLanInfoRequest 请求对象
     * @return SyncInvoker<ShowEquipmentLanInfoRequest, ShowEquipmentLanInfoResponse>
     */
    public SyncInvoker<ShowEquipmentLanInfoRequest, ShowEquipmentLanInfoResponse> showEquipmentLanInfoInvoker(
        ShowEquipmentLanInfoRequest request) {
        return new SyncInvoker<ShowEquipmentLanInfoRequest, ShowEquipmentLanInfoResponse>(request,
            EcMeta.showEquipmentLanInfo, hcClient);
    }

    /**
     * 更新智能企业网关设备主备DNS配置
     *
     * 更新智能企业网关设备主备DNS配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateEquipmentDnsInfoRequest 请求对象
     * @return UpdateEquipmentDnsInfoResponse
     */
    public UpdateEquipmentDnsInfoResponse updateEquipmentDnsInfo(UpdateEquipmentDnsInfoRequest request) {
        return hcClient.syncInvokeHttp(request, EcMeta.updateEquipmentDnsInfo);
    }

    /**
     * 更新智能企业网关设备主备DNS配置
     *
     * 更新智能企业网关设备主备DNS配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateEquipmentDnsInfoRequest 请求对象
     * @return SyncInvoker<UpdateEquipmentDnsInfoRequest, UpdateEquipmentDnsInfoResponse>
     */
    public SyncInvoker<UpdateEquipmentDnsInfoRequest, UpdateEquipmentDnsInfoResponse> updateEquipmentDnsInfoInvoker(
        UpdateEquipmentDnsInfoRequest request) {
        return new SyncInvoker<UpdateEquipmentDnsInfoRequest, UpdateEquipmentDnsInfoResponse>(request,
            EcMeta.updateEquipmentDnsInfo, hcClient);
    }

    /**
     * 更新智能企业网关设备LAN口配置
     *
     * 更新智能企业网关设备LAN口配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateEquipmentLanConfigRequest 请求对象
     * @return UpdateEquipmentLanConfigResponse
     */
    public UpdateEquipmentLanConfigResponse updateEquipmentLanConfig(UpdateEquipmentLanConfigRequest request) {
        return hcClient.syncInvokeHttp(request, EcMeta.updateEquipmentLanConfig);
    }

    /**
     * 更新智能企业网关设备LAN口配置
     *
     * 更新智能企业网关设备LAN口配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateEquipmentLanConfigRequest 请求对象
     * @return SyncInvoker<UpdateEquipmentLanConfigRequest, UpdateEquipmentLanConfigResponse>
     */
    public SyncInvoker<UpdateEquipmentLanConfigRequest, UpdateEquipmentLanConfigResponse> updateEquipmentLanConfigInvoker(
        UpdateEquipmentLanConfigRequest request) {
        return new SyncInvoker<UpdateEquipmentLanConfigRequest, UpdateEquipmentLanConfigResponse>(request,
            EcMeta.updateEquipmentLanConfig, hcClient);
    }

    /**
     * 查询智能企业网关设备OSPF配置
     *
     * 查询智能企业网关设备OSPF配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowEquipmentOspfRequest 请求对象
     * @return ShowEquipmentOspfResponse
     */
    public ShowEquipmentOspfResponse showEquipmentOspf(ShowEquipmentOspfRequest request) {
        return hcClient.syncInvokeHttp(request, EcMeta.showEquipmentOspf);
    }

    /**
     * 查询智能企业网关设备OSPF配置
     *
     * 查询智能企业网关设备OSPF配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowEquipmentOspfRequest 请求对象
     * @return SyncInvoker<ShowEquipmentOspfRequest, ShowEquipmentOspfResponse>
     */
    public SyncInvoker<ShowEquipmentOspfRequest, ShowEquipmentOspfResponse> showEquipmentOspfInvoker(
        ShowEquipmentOspfRequest request) {
        return new SyncInvoker<ShowEquipmentOspfRequest, ShowEquipmentOspfResponse>(request, EcMeta.showEquipmentOspf,
            hcClient);
    }

    /**
     * 配置智能企业网关设备OSPF协议
     *
     * 配置智能企业网关设备OSPF协议
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateEquipmentOspfRequest 请求对象
     * @return UpdateEquipmentOspfResponse
     */
    public UpdateEquipmentOspfResponse updateEquipmentOspf(UpdateEquipmentOspfRequest request) {
        return hcClient.syncInvokeHttp(request, EcMeta.updateEquipmentOspf);
    }

    /**
     * 配置智能企业网关设备OSPF协议
     *
     * 配置智能企业网关设备OSPF协议
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateEquipmentOspfRequest 请求对象
     * @return SyncInvoker<UpdateEquipmentOspfRequest, UpdateEquipmentOspfResponse>
     */
    public SyncInvoker<UpdateEquipmentOspfRequest, UpdateEquipmentOspfResponse> updateEquipmentOspfInvoker(
        UpdateEquipmentOspfRequest request) {
        return new SyncInvoker<UpdateEquipmentOspfRequest, UpdateEquipmentOspfResponse>(request,
            EcMeta.updateEquipmentOspf, hcClient);
    }

    /**
     * 创建智能企业网关设备静态路由配置
     *
     * 创建智能企业网关设备静态路由配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateEquipmentStaticRouteConfigRequest 请求对象
     * @return CreateEquipmentStaticRouteConfigResponse
     */
    public CreateEquipmentStaticRouteConfigResponse createEquipmentStaticRouteConfig(
        CreateEquipmentStaticRouteConfigRequest request) {
        return hcClient.syncInvokeHttp(request, EcMeta.createEquipmentStaticRouteConfig);
    }

    /**
     * 创建智能企业网关设备静态路由配置
     *
     * 创建智能企业网关设备静态路由配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateEquipmentStaticRouteConfigRequest 请求对象
     * @return SyncInvoker<CreateEquipmentStaticRouteConfigRequest, CreateEquipmentStaticRouteConfigResponse>
     */
    public SyncInvoker<CreateEquipmentStaticRouteConfigRequest, CreateEquipmentStaticRouteConfigResponse> createEquipmentStaticRouteConfigInvoker(
        CreateEquipmentStaticRouteConfigRequest request) {
        return new SyncInvoker<CreateEquipmentStaticRouteConfigRequest, CreateEquipmentStaticRouteConfigResponse>(
            request, EcMeta.createEquipmentStaticRouteConfig, hcClient);
    }

    /**
     * 删除智能企业网关设备静态路由配置
     *
     * 删除智能企业网关设备静态路由配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteEquipmentStaticRouteConfigRequest 请求对象
     * @return DeleteEquipmentStaticRouteConfigResponse
     */
    public DeleteEquipmentStaticRouteConfigResponse deleteEquipmentStaticRouteConfig(
        DeleteEquipmentStaticRouteConfigRequest request) {
        return hcClient.syncInvokeHttp(request, EcMeta.deleteEquipmentStaticRouteConfig);
    }

    /**
     * 删除智能企业网关设备静态路由配置
     *
     * 删除智能企业网关设备静态路由配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteEquipmentStaticRouteConfigRequest 请求对象
     * @return SyncInvoker<DeleteEquipmentStaticRouteConfigRequest, DeleteEquipmentStaticRouteConfigResponse>
     */
    public SyncInvoker<DeleteEquipmentStaticRouteConfigRequest, DeleteEquipmentStaticRouteConfigResponse> deleteEquipmentStaticRouteConfigInvoker(
        DeleteEquipmentStaticRouteConfigRequest request) {
        return new SyncInvoker<DeleteEquipmentStaticRouteConfigRequest, DeleteEquipmentStaticRouteConfigResponse>(
            request, EcMeta.deleteEquipmentStaticRouteConfig, hcClient);
    }

    /**
     * 查询智能企业网关设备静态路由配置
     *
     * 查询智能企业网关设备静态路由配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowEquipmentStaticRouteInfoRequest 请求对象
     * @return ShowEquipmentStaticRouteInfoResponse
     */
    public ShowEquipmentStaticRouteInfoResponse showEquipmentStaticRouteInfo(
        ShowEquipmentStaticRouteInfoRequest request) {
        return hcClient.syncInvokeHttp(request, EcMeta.showEquipmentStaticRouteInfo);
    }

    /**
     * 查询智能企业网关设备静态路由配置
     *
     * 查询智能企业网关设备静态路由配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowEquipmentStaticRouteInfoRequest 请求对象
     * @return SyncInvoker<ShowEquipmentStaticRouteInfoRequest, ShowEquipmentStaticRouteInfoResponse>
     */
    public SyncInvoker<ShowEquipmentStaticRouteInfoRequest, ShowEquipmentStaticRouteInfoResponse> showEquipmentStaticRouteInfoInvoker(
        ShowEquipmentStaticRouteInfoRequest request) {
        return new SyncInvoker<ShowEquipmentStaticRouteInfoRequest, ShowEquipmentStaticRouteInfoResponse>(request,
            EcMeta.showEquipmentStaticRouteInfo, hcClient);
    }

    /**
     * 更新智能企业网关设备静态路由配置
     *
     * 更新智能企业网关设备静态路由配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateEquipmentStaticRouteConfigRequest 请求对象
     * @return UpdateEquipmentStaticRouteConfigResponse
     */
    public UpdateEquipmentStaticRouteConfigResponse updateEquipmentStaticRouteConfig(
        UpdateEquipmentStaticRouteConfigRequest request) {
        return hcClient.syncInvokeHttp(request, EcMeta.updateEquipmentStaticRouteConfig);
    }

    /**
     * 更新智能企业网关设备静态路由配置
     *
     * 更新智能企业网关设备静态路由配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateEquipmentStaticRouteConfigRequest 请求对象
     * @return SyncInvoker<UpdateEquipmentStaticRouteConfigRequest, UpdateEquipmentStaticRouteConfigResponse>
     */
    public SyncInvoker<UpdateEquipmentStaticRouteConfigRequest, UpdateEquipmentStaticRouteConfigResponse> updateEquipmentStaticRouteConfigInvoker(
        UpdateEquipmentStaticRouteConfigRequest request) {
        return new SyncInvoker<UpdateEquipmentStaticRouteConfigRequest, UpdateEquipmentStaticRouteConfigResponse>(
            request, EcMeta.updateEquipmentStaticRouteConfig, hcClient);
    }

    /**
     * 查询智能企业网关设备WAN口配置
     *
     * 查询智能企业网关设备WAN口配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowEquipmentWanInfoRequest 请求对象
     * @return ShowEquipmentWanInfoResponse
     */
    public ShowEquipmentWanInfoResponse showEquipmentWanInfo(ShowEquipmentWanInfoRequest request) {
        return hcClient.syncInvokeHttp(request, EcMeta.showEquipmentWanInfo);
    }

    /**
     * 查询智能企业网关设备WAN口配置
     *
     * 查询智能企业网关设备WAN口配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowEquipmentWanInfoRequest 请求对象
     * @return SyncInvoker<ShowEquipmentWanInfoRequest, ShowEquipmentWanInfoResponse>
     */
    public SyncInvoker<ShowEquipmentWanInfoRequest, ShowEquipmentWanInfoResponse> showEquipmentWanInfoInvoker(
        ShowEquipmentWanInfoRequest request) {
        return new SyncInvoker<ShowEquipmentWanInfoRequest, ShowEquipmentWanInfoResponse>(request,
            EcMeta.showEquipmentWanInfo, hcClient);
    }

    /**
     * 更新智能企业网关设备WAN口配置
     *
     * 更新智能企业网关设备WAN口配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateEquipmentWanConfigRequest 请求对象
     * @return UpdateEquipmentWanConfigResponse
     */
    public UpdateEquipmentWanConfigResponse updateEquipmentWanConfig(UpdateEquipmentWanConfigRequest request) {
        return hcClient.syncInvokeHttp(request, EcMeta.updateEquipmentWanConfig);
    }

    /**
     * 更新智能企业网关设备WAN口配置
     *
     * 更新智能企业网关设备WAN口配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateEquipmentWanConfigRequest 请求对象
     * @return SyncInvoker<UpdateEquipmentWanConfigRequest, UpdateEquipmentWanConfigResponse>
     */
    public SyncInvoker<UpdateEquipmentWanConfigRequest, UpdateEquipmentWanConfigResponse> updateEquipmentWanConfigInvoker(
        UpdateEquipmentWanConfigRequest request) {
        return new SyncInvoker<UpdateEquipmentWanConfigRequest, UpdateEquipmentWanConfigResponse>(request,
            EcMeta.updateEquipmentWanConfig, hcClient);
    }

    /**
     * 关联企业路由器到企业连接网络
     *
     * 关联企业路由器到企业连接网络
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param AddEcnWithErRequest 请求对象
     * @return AddEcnWithErResponse
     */
    public AddEcnWithErResponse addEcnWithEr(AddEcnWithErRequest request) {
        return hcClient.syncInvokeHttp(request, EcMeta.addEcnWithEr);
    }

    /**
     * 关联企业路由器到企业连接网络
     *
     * 关联企业路由器到企业连接网络
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param AddEcnWithErRequest 请求对象
     * @return SyncInvoker<AddEcnWithErRequest, AddEcnWithErResponse>
     */
    public SyncInvoker<AddEcnWithErRequest, AddEcnWithErResponse> addEcnWithErInvoker(AddEcnWithErRequest request) {
        return new SyncInvoker<AddEcnWithErRequest, AddEcnWithErResponse>(request, EcMeta.addEcnWithEr, hcClient);
    }

    /**
     * 解除企业路由器和企业连接网络的关联
     *
     * 解除企业路由器和企业连接网络的关联
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteEcnWithErRequest 请求对象
     * @return DeleteEcnWithErResponse
     */
    public DeleteEcnWithErResponse deleteEcnWithEr(DeleteEcnWithErRequest request) {
        return hcClient.syncInvokeHttp(request, EcMeta.deleteEcnWithEr);
    }

    /**
     * 解除企业路由器和企业连接网络的关联
     *
     * 解除企业路由器和企业连接网络的关联
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteEcnWithErRequest 请求对象
     * @return SyncInvoker<DeleteEcnWithErRequest, DeleteEcnWithErResponse>
     */
    public SyncInvoker<DeleteEcnWithErRequest, DeleteEcnWithErResponse> deleteEcnWithErInvoker(
        DeleteEcnWithErRequest request) {
        return new SyncInvoker<DeleteEcnWithErRequest, DeleteEcnWithErResponse>(request, EcMeta.deleteEcnWithEr,
            hcClient);
    }

    /**
     * 查询企业连接网络网与企业路由器关联关系
     *
     * 根据企业连接网络ID，查询企业连接网络网与企业路由器关联关系
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListEcnWithErRequest 请求对象
     * @return ListEcnWithErResponse
     */
    public ListEcnWithErResponse listEcnWithEr(ListEcnWithErRequest request) {
        return hcClient.syncInvokeHttp(request, EcMeta.listEcnWithEr);
    }

    /**
     * 查询企业连接网络网与企业路由器关联关系
     *
     * 根据企业连接网络ID，查询企业连接网络网与企业路由器关联关系
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListEcnWithErRequest 请求对象
     * @return SyncInvoker<ListEcnWithErRequest, ListEcnWithErResponse>
     */
    public SyncInvoker<ListEcnWithErRequest, ListEcnWithErResponse> listEcnWithErInvoker(ListEcnWithErRequest request) {
        return new SyncInvoker<ListEcnWithErRequest, ListEcnWithErResponse>(request, EcMeta.listEcnWithEr, hcClient);
    }

    /**
     * 修改IEG设备admin账户密码
     *
     * 修改IEG设备admin账户密码
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ChangeIegPasswordRequest 请求对象
     * @return ChangeIegPasswordResponse
     */
    public ChangeIegPasswordResponse changeIegPassword(ChangeIegPasswordRequest request) {
        return hcClient.syncInvokeHttp(request, EcMeta.changeIegPassword);
    }

    /**
     * 修改IEG设备admin账户密码
     *
     * 修改IEG设备admin账户密码
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ChangeIegPasswordRequest 请求对象
     * @return SyncInvoker<ChangeIegPasswordRequest, ChangeIegPasswordResponse>
     */
    public SyncInvoker<ChangeIegPasswordRequest, ChangeIegPasswordResponse> changeIegPasswordInvoker(
        ChangeIegPasswordRequest request) {
        return new SyncInvoker<ChangeIegPasswordRequest, ChangeIegPasswordResponse>(request, EcMeta.changeIegPassword,
            hcClient);
    }

    /**
     * 查询租户智能企业网关列表
     *
     * 查询租户智能企业网关列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListIegRequest 请求对象
     * @return ListIegResponse
     */
    public ListIegResponse listIeg(ListIegRequest request) {
        return hcClient.syncInvokeHttp(request, EcMeta.listIeg);
    }

    /**
     * 查询租户智能企业网关列表
     *
     * 查询租户智能企业网关列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListIegRequest 请求对象
     * @return SyncInvoker<ListIegRequest, ListIegResponse>
     */
    public SyncInvoker<ListIegRequest, ListIegResponse> listIegInvoker(ListIegRequest request) {
        return new SyncInvoker<ListIegRequest, ListIegResponse>(request, EcMeta.listIeg, hcClient);
    }

    /**
     * 查询租户单个智能企业网关
     *
     * 根据智能企业网关ID，查询租户智能企业网关
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowIegInfoRequest 请求对象
     * @return ShowIegInfoResponse
     */
    public ShowIegInfoResponse showIegInfo(ShowIegInfoRequest request) {
        return hcClient.syncInvokeHttp(request, EcMeta.showIegInfo);
    }

    /**
     * 查询租户单个智能企业网关
     *
     * 根据智能企业网关ID，查询租户智能企业网关
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowIegInfoRequest 请求对象
     * @return SyncInvoker<ShowIegInfoRequest, ShowIegInfoResponse>
     */
    public SyncInvoker<ShowIegInfoRequest, ShowIegInfoResponse> showIegInfoInvoker(ShowIegInfoRequest request) {
        return new SyncInvoker<ShowIegInfoRequest, ShowIegInfoResponse>(request, EcMeta.showIegInfo, hcClient);
    }

    /**
     * 交换双机主备属性
     *
     * 交换双机主备属性
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param SwitchEquipmentHaTypeRequest 请求对象
     * @return SwitchEquipmentHaTypeResponse
     */
    public SwitchEquipmentHaTypeResponse switchEquipmentHaType(SwitchEquipmentHaTypeRequest request) {
        return hcClient.syncInvokeHttp(request, EcMeta.switchEquipmentHaType);
    }

    /**
     * 交换双机主备属性
     *
     * 交换双机主备属性
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param SwitchEquipmentHaTypeRequest 请求对象
     * @return SyncInvoker<SwitchEquipmentHaTypeRequest, SwitchEquipmentHaTypeResponse>
     */
    public SyncInvoker<SwitchEquipmentHaTypeRequest, SwitchEquipmentHaTypeResponse> switchEquipmentHaTypeInvoker(
        SwitchEquipmentHaTypeRequest request) {
        return new SyncInvoker<SwitchEquipmentHaTypeRequest, SwitchEquipmentHaTypeResponse>(request,
            EcMeta.switchEquipmentHaType, hcClient);
    }

    /**
     * 更新智能企业网关
     *
     * 根据智能企业网关ID，更新智能企业网关
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateIegRequest 请求对象
     * @return UpdateIegResponse
     */
    public UpdateIegResponse updateIeg(UpdateIegRequest request) {
        return hcClient.syncInvokeHttp(request, EcMeta.updateIeg);
    }

    /**
     * 更新智能企业网关
     *
     * 根据智能企业网关ID，更新智能企业网关
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateIegRequest 请求对象
     * @return SyncInvoker<UpdateIegRequest, UpdateIegResponse>
     */
    public SyncInvoker<UpdateIegRequest, UpdateIegResponse> updateIegInvoker(UpdateIegRequest request) {
        return new SyncInvoker<UpdateIegRequest, UpdateIegResponse>(request, EcMeta.updateIeg, hcClient);
    }

    /**
     * 查询EC相关的指定租户的配额
     *
     * 查询EC相关的指定租户的配额
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowQuotasInfoRequest 请求对象
     * @return ShowQuotasInfoResponse
     */
    public ShowQuotasInfoResponse showQuotasInfo(ShowQuotasInfoRequest request) {
        return hcClient.syncInvokeHttp(request, EcMeta.showQuotasInfo);
    }

    /**
     * 查询EC相关的指定租户的配额
     *
     * 查询EC相关的指定租户的配额
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowQuotasInfoRequest 请求对象
     * @return SyncInvoker<ShowQuotasInfoRequest, ShowQuotasInfoResponse>
     */
    public SyncInvoker<ShowQuotasInfoRequest, ShowQuotasInfoResponse> showQuotasInfoInvoker(
        ShowQuotasInfoRequest request) {
        return new SyncInvoker<ShowQuotasInfoRequest, ShowQuotasInfoResponse>(request, EcMeta.showQuotasInfo, hcClient);
    }

    /**
     * 创建vrrp配置
     *
     * 创建vrrp配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param AddVrrpConfigRequest 请求对象
     * @return AddVrrpConfigResponse
     */
    public AddVrrpConfigResponse addVrrpConfig(AddVrrpConfigRequest request) {
        return hcClient.syncInvokeHttp(request, EcMeta.addVrrpConfig);
    }

    /**
     * 创建vrrp配置
     *
     * 创建vrrp配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param AddVrrpConfigRequest 请求对象
     * @return SyncInvoker<AddVrrpConfigRequest, AddVrrpConfigResponse>
     */
    public SyncInvoker<AddVrrpConfigRequest, AddVrrpConfigResponse> addVrrpConfigInvoker(AddVrrpConfigRequest request) {
        return new SyncInvoker<AddVrrpConfigRequest, AddVrrpConfigResponse>(request, EcMeta.addVrrpConfig, hcClient);
    }

    /**
     * 删除vrrp配置
     *
     * 删除vrrp配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteVrrpConfigRequest 请求对象
     * @return DeleteVrrpConfigResponse
     */
    public DeleteVrrpConfigResponse deleteVrrpConfig(DeleteVrrpConfigRequest request) {
        return hcClient.syncInvokeHttp(request, EcMeta.deleteVrrpConfig);
    }

    /**
     * 删除vrrp配置
     *
     * 删除vrrp配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteVrrpConfigRequest 请求对象
     * @return SyncInvoker<DeleteVrrpConfigRequest, DeleteVrrpConfigResponse>
     */
    public SyncInvoker<DeleteVrrpConfigRequest, DeleteVrrpConfigResponse> deleteVrrpConfigInvoker(
        DeleteVrrpConfigRequest request) {
        return new SyncInvoker<DeleteVrrpConfigRequest, DeleteVrrpConfigResponse>(request, EcMeta.deleteVrrpConfig,
            hcClient);
    }

    /**
     * 查询vrrp配置列表
     *
     * 查询vrrp配置列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowVrrpConfigRequest 请求对象
     * @return ShowVrrpConfigResponse
     */
    public ShowVrrpConfigResponse showVrrpConfig(ShowVrrpConfigRequest request) {
        return hcClient.syncInvokeHttp(request, EcMeta.showVrrpConfig);
    }

    /**
     * 查询vrrp配置列表
     *
     * 查询vrrp配置列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowVrrpConfigRequest 请求对象
     * @return SyncInvoker<ShowVrrpConfigRequest, ShowVrrpConfigResponse>
     */
    public SyncInvoker<ShowVrrpConfigRequest, ShowVrrpConfigResponse> showVrrpConfigInvoker(
        ShowVrrpConfigRequest request) {
        return new SyncInvoker<ShowVrrpConfigRequest, ShowVrrpConfigResponse>(request, EcMeta.showVrrpConfig, hcClient);
    }

    /**
     * 更新vrrp配置
     *
     * 更新vrrp配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateVrrpConfigRequest 请求对象
     * @return UpdateVrrpConfigResponse
     */
    public UpdateVrrpConfigResponse updateVrrpConfig(UpdateVrrpConfigRequest request) {
        return hcClient.syncInvokeHttp(request, EcMeta.updateVrrpConfig);
    }

    /**
     * 更新vrrp配置
     *
     * 更新vrrp配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateVrrpConfigRequest 请求对象
     * @return SyncInvoker<UpdateVrrpConfigRequest, UpdateVrrpConfigResponse>
     */
    public SyncInvoker<UpdateVrrpConfigRequest, UpdateVrrpConfigResponse> updateVrrpConfigInvoker(
        UpdateVrrpConfigRequest request) {
        return new SyncInvoker<UpdateVrrpConfigRequest, UpdateVrrpConfigResponse>(request, EcMeta.updateVrrpConfig,
            hcClient);
    }

}
