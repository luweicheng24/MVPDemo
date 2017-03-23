package com.example.administrator.mvpdemo.presenter;

import com.example.administrator.mvpdemo.view.View;

/**
 * Created by luweicheng on 2017/3/11 0011.
 */

public interface Presenter {

    void onCreate();
    void onStop();
    void onStart();
    void onDestroy();
    void attachView(View view);
}
