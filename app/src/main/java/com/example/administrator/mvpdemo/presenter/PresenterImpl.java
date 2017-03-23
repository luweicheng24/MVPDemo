package com.example.administrator.mvpdemo.presenter;

import android.content.Context;
import android.util.Log;

import com.example.administrator.mvpdemo.bean.Accounts;
import com.example.administrator.mvpdemo.net.ApiService;
import com.example.administrator.mvpdemo.net.RetrofitManager;
import com.example.administrator.mvpdemo.view.ResuletView;
import com.example.administrator.mvpdemo.view.View;
import com.google.gson.Gson;

import rx.functions.Action1;
import rx.subscriptions.CompositeSubscription;

/**
 * Created by luweicheng on 2017/3/11 0011.
 */

public class PresenterImpl implements Presenter {
    private CompositeSubscription mCompositeSubscription;//订阅事件的管理
    private Context mContext;
    private ResuletView mView;
    private Gson gson;
    public static final String TAG = "PresenterImple类";

    public PresenterImpl(Context context) {
        mContext = context;
        mCompositeSubscription = new CompositeSubscription();
    }


    @Override
    public void onCreate() {

        gson = new Gson();
    }

    @Override
    public void onStop() {
        //取消订阅
        if (mCompositeSubscription.hasSubscriptions()) {
            mCompositeSubscription.unsubscribe();
        }

    }

    @Override
    public void onStart() {

    }

    @Override
    public void onDestroy() {

    }

    @Override
    public void attachView(View view) {
        mView = (ResuletView) view;
    }


    public void login(String name, String password) {
        RetrofitManager.getInstance()
                .getRetrofit(ApiService.class)
                .loginAccounts(name, password)
                .compose(RetrofitManager.<Accounts>resultHandle())
                .subscribe(new Action1<Accounts>() {
                    @Override
                    public void call(Accounts accounts) {
                        Log.e(TAG, "call: "+accounts.toString());
                        mView.success(accounts);
                    }
                });
    }



}
