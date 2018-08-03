package org.reshuffle.flowable.bpmn.api;

import org.reshuffle.flowable.bpmn.filter.ExecutionQuery;
import org.reshuffle.flowable.bpmn.model.Paging;
import org.reshuffle.flowable.bpmn.model.RestVariable;
import org.reshuffle.flowable.bpmn.model.execution.ChangeState;
import org.reshuffle.flowable.bpmn.model.execution.Execution;
import org.reshuffle.flowable.bpmn.model.execution.SignalEvent;
import retrofit2.http.*;

import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2018/3/22.
 */
public interface ExecutionAPI {

    @POST("query/executions")
    Paging<Execution> queryExcutions(@Body ExecutionQuery query);

    @GET("runtime/executions")
    Paging<Execution> getExecutions();

    @GET("runtime/executions")
    Paging<Execution> getExecutions(@QueryMap Map<String, Object> params);

    @PUT("runtime/executions")
    Void putExecution(@Body SignalEvent signalEvent);

    @GET("runtime/executions/{executionId}")
    Execution getExecution(@Path("executionId") String executionId);

    @PUT("runtime/executions/{executionId}")
    Void putExecution(@Path("executionId") String executionId, @Body SignalEvent signalEvent);

    @GET("runtime/executions/{executionId}/activities")
    List<String> getExecutionActivities(@Path("executionId") String executionId);

    @POST("runtime/executions/{executionId}/change-state")
    Void changeExectionState(@Path("executionId") String executionId, @Body ChangeState changeState);

    @DELETE("runtime/executions/{executionId}/variables")
    Void deleteAllVariablesById(@Path("executionId") String executionId);

    @GET("runtime/executions/{executionId}/variables")
    List<Execution> getVariablesById(@Path("executionId") String executionId, @Query("scope") String scope);

    @GET("runtime/executions/{executionId}/variables")
    List<Execution> getVariablesById(@Path("executionId") String executionId);

    @POST("runtime/executions/{executionId}/variables")
    Void createVaribles(@Path("executionId") String executionId, @Body List<RestVariable> variables);

    @PUT("runtime/executions/{executionId}/variables")
    Void updateVaribles(@Path("executionId") String executionId, @Body List<RestVariable> variables);

    @PUT("runtime/executions/{executionId}/variables/{variableName}")
    Void deleteVarible(@Path("executionId") String executionId, @Path("variableName") String variableName);

    @GET("runtime/executions/{executionId}/variables/{variableName}")
    RestVariable getVarible(@Path("executionId") String executionId, @Path("variableName") String variableName);

    @PUT("runtime/executions/{executionId}/variables/{variableName}")
    Void updateVarible(@Path("executionId") String executionId, @Path("variableName") String variableName, @Body RestVariable variable);

    @PUT("runtime/executions/{executionId}/variables/{variableName}/data")
    Void getBinaryData(@Path("executionId") String executionId, @Path("variableName") String variableName);
}
