package com.huaweicloud.sdk.asm.v1;

import com.huaweicloud.sdk.asm.v1.model.CreateMeshRequest;
import com.huaweicloud.sdk.asm.v1.model.CreateMeshResponse;
import com.huaweicloud.sdk.asm.v1.model.DeleteMeshRequest;
import com.huaweicloud.sdk.asm.v1.model.DeleteMeshResponse;
import com.huaweicloud.sdk.asm.v1.model.ListMeshesRequest;
import com.huaweicloud.sdk.asm.v1.model.ListMeshesResponse;
import com.huaweicloud.sdk.asm.v1.model.Mesh;
import com.huaweicloud.sdk.asm.v1.model.ShowMeshRequest;
import com.huaweicloud.sdk.asm.v1.model.ShowMeshResponse;
import com.huaweicloud.sdk.core.TypeCasts;
import com.huaweicloud.sdk.core.http.FieldExistence;
import com.huaweicloud.sdk.core.http.HttpMethod;
import com.huaweicloud.sdk.core.http.HttpRequestDef;
import com.huaweicloud.sdk.core.http.LocationType;

@SuppressWarnings("unchecked")
public class AsmMeta {

    public static final HttpRequestDef<CreateMeshRequest, CreateMeshResponse> createMesh = genForcreateMesh();

    private static HttpRequestDef<CreateMeshRequest, CreateMeshResponse> genForcreateMesh() {
        // basic
        HttpRequestDef.Builder<CreateMeshRequest, CreateMeshResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateMeshRequest.class, CreateMeshResponse.class)
                .withName("CreateMesh")
                .withUri("/v1/meshes")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("X-Apply-ProjectID",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateMeshRequest::getXApplyProjectID, (req, v) -> {
                req.setXApplyProjectID(v);
            }));
        builder.<Mesh>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Mesh.class),
            f -> f.withMarshaller(CreateMeshRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteMeshRequest, DeleteMeshResponse> deleteMesh = genFordeleteMesh();

    private static HttpRequestDef<DeleteMeshRequest, DeleteMeshResponse> genFordeleteMesh() {
        // basic
        HttpRequestDef.Builder<DeleteMeshRequest, DeleteMeshResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteMeshRequest.class, DeleteMeshResponse.class)
                .withName("DeleteMesh")
                .withUri("/v1/meshes/{mesh_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("mesh_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteMeshRequest::getMeshId, (req, v) -> {
                req.setMeshId(v);
            }));
        builder.<String>withRequestField("X-Apply-ProjectID",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteMeshRequest::getXApplyProjectID, (req, v) -> {
                req.setXApplyProjectID(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListMeshesRequest, ListMeshesResponse> listMeshes = genForlistMeshes();

    private static HttpRequestDef<ListMeshesRequest, ListMeshesResponse> genForlistMeshes() {
        // basic
        HttpRequestDef.Builder<ListMeshesRequest, ListMeshesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListMeshesRequest.class, ListMeshesResponse.class)
                .withName("ListMeshes")
                .withUri("/v1/meshes")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("X-Apply-ProjectID",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListMeshesRequest::getXApplyProjectID, (req, v) -> {
                req.setXApplyProjectID(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowMeshRequest, ShowMeshResponse> showMesh = genForshowMesh();

    private static HttpRequestDef<ShowMeshRequest, ShowMeshResponse> genForshowMesh() {
        // basic
        HttpRequestDef.Builder<ShowMeshRequest, ShowMeshResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowMeshRequest.class, ShowMeshResponse.class)
                .withName("ShowMesh")
                .withUri("/v1/meshes/{mesh_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("mesh_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowMeshRequest::getMeshId, (req, v) -> {
                req.setMeshId(v);
            }));
        builder.<String>withRequestField("X-Apply-ProjectID",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowMeshRequest::getXApplyProjectID, (req, v) -> {
                req.setXApplyProjectID(v);
            }));

        // response

        return builder.build();
    }

}
