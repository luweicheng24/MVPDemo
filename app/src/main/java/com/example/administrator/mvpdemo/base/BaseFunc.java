package com.example.administrator.mvpdemo.base;

import android.util.Log;

import rx.functions.Func1;

/**
 * Created by luweicheng on 2017/3/13 0013.
 */

public  class BaseFunc<T> implements Func1<BaseResponse<T>, T> {

    @Override
    public T call(BaseResponse<T> tBaseResponse) {
        Log.e("BaseFun1", "call: "+tBaseResponse.return_data.toString());
        if (!tBaseResponse.isSuccess()) {
           throw new Faulty(tBaseResponse.state);
        }
        return tBaseResponse.return_data;
    }
}
