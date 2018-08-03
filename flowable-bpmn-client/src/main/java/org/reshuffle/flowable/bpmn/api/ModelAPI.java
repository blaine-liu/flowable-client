package org.reshuffle.flowable.bpmn.api;

import org.reshuffle.flowable.bpmn.model.Paging;
import org.reshuffle.flowable.bpmn.model.models.Model;
import org.reshuffle.flowable.bpmn.model.models.ModelRequest;
import retrofit2.http.*;

import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2018/3/22.
 */
public interface ModelAPI {

    @GET("repository/models")
    Paging<Model> getModels();

    @GET("repository/models")
    Paging<Model> getModels(@QueryMap Map<String, Object> params);

    @POST("repository/models")
    Model createModel(@Body ModelRequest request);

    @DELETE("repository/models/{modelId}")
    Void deleteModel(@Path("modelId") String modelId);

    @GET("repository/models/{modelId}")
    Model getModel(@Path("modelId") String modelId);

    @PUT("repository/models/{modelId}")
    Model getModel(@Body ModelRequest request);

    @GET("repository/models/{modelId}/source")
    List<String> getModelSource(@Path("modelId") String modelId);
}
