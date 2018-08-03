package org.reshuffle.flowable.bpmn.api;

import com.toucan.flowable.bpmn.model.Paging;
import com.toucan.flowable.bpmn.model.deployment.Deployment;
import com.toucan.flowable.bpmn.model.deployment.DeploymentResource;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2018/3/21.
 */
public interface DeploymentAPI {

    @GET("repository/deployments")
    Paging<Deployment> getDeployments(@QueryMap Map<String, Object> params);

    @GET("repository/deployments")
    Paging<Deployment> getDeployments();

    @DELETE("repository/deployments/{id}")
    String deleteDeployment(@Path("id") String id);

    @GET("repository/deployments/{id}")
    Deployment getDeployment(@Path("id") String id);

    @GET("repository/deployments/{deploymentId}/resources")
    List<DeploymentResource> getResourcesById(@Path("deploymentId") String deploymentId);

    @GET("repository/deployments/{deploymentId}/resourcedata/{resourceName}")
    String getResourceContentById(@Path("deploymentId") String deploymentID, @Path("resourceName") String resourceName);

    @GET("repository/deployments/{deploymentId}/resources/{resourceId}")
    DeploymentResource getResourceWildcard(@Path("deploymentId") String deploymentId, @Path("resourceId") String resourceId);
}
