package org.reshuffle.flowable.bpmn.api;

import com.toucan.flowable.bpmn.model.Paging;
import com.toucan.flowable.bpmn.model.group.Group;
import com.toucan.flowable.bpmn.model.group.GroupRequest;
import com.toucan.flowable.bpmn.model.group.Member;
import com.toucan.flowable.bpmn.model.group.Membership;
import retrofit2.http.*;

import java.util.Map;

/**
 * Created by Administrator on 2018/3/22.
 */
public interface GroupAPI {

    @GET("identity/groups")
    Paging<Group> getGroups();

    @GET("identity/groups")
    Paging<Group> getGroups(@QueryMap Map<String, Object> params);

    @POST("identity/groups")
    Void createGroup(@Body GroupRequest groupRequest);

    @DELETE("identity/groups/{groupId}")
    Void deleteGroup(@Path("groupId") String groupId);

    @GET("identity/groups/{groupId}")
    Group getGroup(@Path("groupId") String groupId);

    @PUT("identity/groups/{groupId}")
    Void updateGroup(@Path("groupId") String groupId, @Body GroupRequest groupRequest);

    @POST("identity/groups/{groupId}/members")
    Membership addMember(@Path("groupId") String groupId, Member member);

    @DELETE("identity/groups/{groupId}/members/{userId}")
    Void deleteMember(@Path("groupId") String groupId, @Path("userId") String userId);
}
