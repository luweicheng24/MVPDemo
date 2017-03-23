package com.example.administrator.mvpdemo.net;

import com.example.administrator.mvpdemo.base.BaseResponse;
import com.example.administrator.mvpdemo.bean.Accounts;

import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;
import rx.Observable;

/**
 * Created by luweicheng on 2017/3/9 0009.
 */

public interface ApiService {
    /**
     * 登录api
     * @param
     * @param
     * @return
     */

    @FormUrlEncoded
    @POST("login.php")
    Observable<BaseResponse<Accounts>> loginAccounts(@Field("account") String name, @Field("pwd") String password);

}
