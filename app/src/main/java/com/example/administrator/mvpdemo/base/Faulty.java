package com.example.administrator.mvpdemo.base;

/**
 * Created by luweicheng on 2017/3/13 0013.
 */

public class Faulty extends RuntimeException {
    /**
     * 异常处理类
     */
    private String errorState;
    public Faulty(String errorState){
    }


}
