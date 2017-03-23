package com.example.administrator.mvpdemo.view;

import com.example.administrator.mvpdemo.bean.Accounts;

/**
 * Created by luweicheng on 2017/3/11 0011.
 */

public interface ResuletView extends View{
    void success(Accounts accounts);
    void error(String message);
}
