package org.reshuffle.flowable.bpmn.api;

import com.toucan.flowable.bpmn.model.engine.EngineInfo;
import retrofit2.http.GET;

/**
 * Created by Administrator on 2018/3/19.
 */
public interface EngineAPI {

    @GET("management/engine")
    EngineInfo getEngineInfo();
}
