package org.reshuffle.flowable.bpmn;

import com.toucan.flowable.bpmn.api.DeploymentAPI;
import com.toucan.flowable.bpmn.api.EngineAPI;
import com.toucan.flowable.bpmn.ext.AuthorizationInterceptor;
import com.toucan.flowable.bpmn.ext.GsonConverterFactory;
import com.toucan.flowable.bpmn.ext.SyncCallAdapterFactory;
import okhttp3.OkHttpClient;
import org.reshuffle.flowable.bpmn.api.DeploymentAPI;
import retrofit2.Retrofit;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Created by Administrator on 2018/3/20.
 */
public class FlowableClient {

    private static final AtomicReference<FlowableClient> instance = new AtomicReference<>(new FlowableClient());

    private static final AtomicReference<OkHttpClient> httpClient = new AtomicReference<>(null);

    private static final AtomicReference<Retrofit> retrofit = new AtomicReference<>(null);

    private static final AtomicBoolean isConnect = new AtomicBoolean(false);

    private FlowableClient() {
    }

    public static FlowableClient getInstance() {
        return instance.get();
    }

    public FlowableClient connect(String endpoint, String username, String password) {
        if (endpoint == null || endpoint.isEmpty()) {
            throw new IllegalArgumentException("Invalid url");
        }
        if (httpClient.get() == null) {
            OkHttpClient.Builder builder = new OkHttpClient.Builder();
            builder.addInterceptor(new AuthorizationInterceptor(username, password));
            httpClient.compareAndSet(null, builder.build());
        }
        if (retrofit.get() == null) {
            retrofit.compareAndSet(null, new Retrofit.Builder()
                    .baseUrl(endpoint)
                    .addCallAdapterFactory(new SyncCallAdapterFactory())
                    .addConverterFactory(GsonConverterFactory.create())
                    .client(httpClient.get())
                    .build());
        }
        isConnect.compareAndSet(false, true);
        return this;
    }

    public EngineAPI getEngineAPI() {
        return this.getAPI(EngineAPI.class);
    }

    public DeploymentAPI getDeploymentAPI() {
        return this.getAPI(DeploymentAPI.class);
    }

    private <T> T getAPI(Class<T> clazz) {
        if (!isConnect.get()) {
            throw new IllegalStateException("You must call connect method first");
        }

        return retrofit.get().create(clazz);
    }
}
