package org.reshuffle.flowable.bpmn.api;

import com.toucan.flowable.bpmn.model.Paging;
import com.toucan.flowable.bpmn.model.Users.User;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

import java.util.Map;

public interface UserAPI {

    @GET("identity/users")
    Paging<User> getUsers(@QueryMap Map<String, Object> params);

    @GET("identity/users")
    Paging<User> getUsers();

    @DELETE("identity/users/{id}")
    String deleteUsers(@Path("id") String id);

    @GET("identity/users/{id}")
    User getUser(@Path("id") String id);
}
