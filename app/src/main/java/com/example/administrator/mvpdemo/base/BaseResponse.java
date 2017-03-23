package com.example.administrator.mvpdemo.base;

/**
 * Created by luweicheng on 2017/3/13 0013.
 */

public class BaseResponse<T> {
    public String state;
    public T return_data;
    public Boolean isSuccess(){
        return state.equals("1");
    }
}
