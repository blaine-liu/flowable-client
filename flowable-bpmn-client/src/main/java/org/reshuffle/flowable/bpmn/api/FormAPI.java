package org.reshuffle.flowable.bpmn.api;

import com.toucan.flowable.bpmn.model.form.FormData;
import com.toucan.flowable.bpmn.model.form.SubmitFormRequest;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.QueryMap;

import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2018/3/22.
 */
public interface FormAPI {

    @GET("form/form-data")
    List<FormData> getFormDatas();

    @GET("form/form-data")
    List<FormData> getFormDatas(@QueryMap Map<String, Object> params);

    @POST("for/form-data")
    Void createFormData(@Body SubmitFormRequest request);
}
