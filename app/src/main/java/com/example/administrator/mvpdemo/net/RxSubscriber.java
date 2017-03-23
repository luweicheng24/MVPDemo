package com.example.administrator.mvpdemo.net;

import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;

import rx.Subscriber;

/**
 * Created by luweicheng on 2017/3/13 0013.
 */

public abstract class RxSubscriber<T> extends Subscriber<T> {
    private Context mContext;
    private Dialog dialog;
    public RxSubscriber(Context mContext){
        this.mContext = mContext;
    }

    @Override
    public void onStart() {
        super.onStart();
        ProgressDialog.show(mContext,null,"加载中 。。。");
    }

    @Override
    public void onNext(T t) {
        _onNext(t);
    }

    @Override
    public void onError(Throwable e) {

    }

    protected abstract void _onNext(T t);
    protected abstract void _onError(Throwable e);
}
