package org.reshuffle.flowable.bpmn.ext;

import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import retrofit2.Converter;
import retrofit2.Retrofit;

import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;

/**
 * Created by Administrator on 2018/3/21.
 */
@Deprecated
public class JsonStringConverterFactory extends Converter.Factory {

    private final Converter.Factory delegateFactory;

    public JsonStringConverterFactory(Converter.Factory delegateFactory) {
        this.delegateFactory = delegateFactory;
    }

    @Override
    public Converter<?, String> stringConverter(Type type, Annotation[] annotations, Retrofit retrofit) {
        for (Annotation annotation : annotations) {
            if (annotation instanceof JsonParams) {
                // NOTE: If you also have a JSON converter factory installed in addition to this factory,
                // you can call retrofit.requestBodyConverter(type, annotations) instead of having a
                // reference to it explicitly as a field.
                Converter<?, RequestBody> delegate = delegateFactory.requestBodyConverter(type, annotations, new Annotation[0], retrofit);
                return new DelegateToStringConverter<>(delegate);
            }
        }
        return null;
    }

    @Override
    public Converter<ResponseBody, ?> responseBodyConverter(Type type, Annotation[] annotations, Retrofit retrofit) {
        return delegateFactory.responseBodyConverter(type, annotations, retrofit);
    }

    @Override
    public Converter<?, RequestBody> requestBodyConverter(Type type, Annotation[] parameterAnnotations, Annotation[] methodAnnotations, Retrofit retrofit) {
        return delegateFactory.requestBodyConverter(type, parameterAnnotations, methodAnnotations, retrofit);
    }

    static class DelegateToStringConverter<T> implements Converter<T, String> {
        private final Converter<T, RequestBody> delegate;

        DelegateToStringConverter(Converter<T, RequestBody> delegate) {
            this.delegate = delegate;
        }

        @Override
        public String convert(T value) throws IOException {
//            Buffer buffer = new Buffer();
//            delegate.convert(value).writeTo(buffer);
//            return buffer.readUtf8();
            return "?asda=asdas&sdab=123";
        }
    }
}
