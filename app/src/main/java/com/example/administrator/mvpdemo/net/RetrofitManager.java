package com.example.administrator.mvpdemo.net;

import com.example.administrator.mvpdemo.base.BaseResponse;
import com.example.administrator.mvpdemo.base.Faulty;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;
import rx.Observable;
import rx.Subscriber;
import rx.android.schedulers.AndroidSchedulers;
import rx.functions.Func1;
import rx.schedulers.Schedulers;

/**
 * Created by luweicheng on 2017/3/9 0009.
 */

public class RetrofitManager {

    private static RetrofitManager retrofitManager;
    public Retrofit mRetrofit;
    private static final String BASE_URL = "http://xsd.gowoai.cn/api/";

    private RetrofitManager() {
    }

    /**
     * 创建单例
     *
     * @return Retrofit实例
     */
    public static RetrofitManager getInstance() {
        if (retrofitManager == null) {
            synchronized (RetrofitManager.class) {
                if (retrofitManager == null) {
                    retrofitManager = new RetrofitManager();
                }
            }

        }

        return retrofitManager;
    }

    public ApiService getRetrofit(Class<?> clazz) {
        mRetrofit = new Retrofit
                .Builder()
                .client(new OkHttpClient())
                .baseUrl(BASE_URL)
                .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        return (ApiService) mRetrofit.create(clazz);
    }

    /**
     * 处理结果数据
     *
     * @param <T>
     * @return
     */


    public static <T> Observable.Transformer<BaseResponse<T>, T> resultHandle() {

        return new Observable.Transformer<BaseResponse<T>, T>() {
            @Override
            public Observable<T> call(Observable<BaseResponse<T>> baseResponseObservable) {
                return baseResponseObservable.flatMap(new Func1<BaseResponse<T>, Observable<T>>() {
                    @Override
                    public Observable<T> call(BaseResponse<T> tBaseResponse) {
                        if (!tBaseResponse.isSuccess()) {
                            throw new Faulty(tBaseResponse.state);
                        }
                        return createData(tBaseResponse.return_data);
                    }
                }).subscribeOn(Schedulers.io())
                        .observeOn(AndroidSchedulers.mainThread());
            }
        };
    }

    /**
     * 创建成功的数据
     *
     * @param data
     * @param <T>
     * @return
     */

    private static <T> Observable<T> createData(final T data) {

        return Observable.create(new Observable.OnSubscribe<T>() {
            @Override
            public void call(Subscriber<? super T> subscriber) {
                try {
                    subscriber.onNext(data);
                    subscriber.onCompleted();
                } catch (Exception e) {
                    subscriber.onError(e);
                }

            }
        });
    }
}
