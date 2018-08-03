package org.reshuffle.flowable.bpmn;

import com.toucan.flowable.bpmn.api.EngineAPI;
import com.toucan.flowable.bpmn.model.engine.EngineInfo;
import org.junit.Test;
import org.reshuffle.flowable.bpmn.api.EngineAPI;
import org.reshuffle.flowable.bpmn.model.engine.EngineInfo;

import java.util.concurrent.ExecutionException;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

/**
 * Created by Administrator on 2018/3/20.
 */
public class EngineAPITest {

    @Test
    public void testEngineInfo() throws ExecutionException, InterruptedException {
        EngineAPI engineAPI = FlowableClient.getInstance().connect(Constants.EndPoint, Constants.USERNAME, Constants.PASSWORD).getEngineAPI();
        assertNotNull(engineAPI);
        EngineInfo engineInfo = engineAPI.getEngineInfo();
        assertNotNull(engineInfo);
        assertEquals(Version.getSupportVersion(), engineInfo.getVersion());
    }

}
