package com.huaweicloud.sdk.identitycenterstore.v1;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.AsyncInvoker;
import com.huaweicloud.sdk.identitycenterstore.v1.model.ListUsersRequest;
import com.huaweicloud.sdk.identitycenterstore.v1.model.ListUsersResponse;

import java.util.concurrent.CompletableFuture;

public class IdentityCenterStoreAsyncClient {

    protected HcClient hcClient;

    public IdentityCenterStoreAsyncClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<IdentityCenterStoreAsyncClient> newBuilder() {
        ClientBuilder<IdentityCenterStoreAsyncClient> clientBuilder =
            new ClientBuilder<>(IdentityCenterStoreAsyncClient::new, "GlobalCredentials");
        return clientBuilder;
    }

    /**
     * 列出用户
     *
     * 查询指定IdentityStore下的IdentityCenter用户列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListUsersRequest 请求对象
     * @return CompletableFuture<ListUsersResponse>
     */
    public CompletableFuture<ListUsersResponse> listUsersAsync(ListUsersRequest request) {
        return hcClient.asyncInvokeHttp(request, IdentityCenterStoreMeta.listUsers);
    }

    /**
     * 列出用户
     *
     * 查询指定IdentityStore下的IdentityCenter用户列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListUsersRequest 请求对象
     * @return AsyncInvoker<ListUsersRequest, ListUsersResponse>
     */
    public AsyncInvoker<ListUsersRequest, ListUsersResponse> listUsersAsyncInvoker(ListUsersRequest request) {
        return new AsyncInvoker<ListUsersRequest, ListUsersResponse>(request, IdentityCenterStoreMeta.listUsers,
            hcClient);
    }

}
