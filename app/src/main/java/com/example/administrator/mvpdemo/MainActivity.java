package com.example.administrator.mvpdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.administrator.mvpdemo.bean.Accounts;
import com.example.administrator.mvpdemo.presenter.PresenterImpl;
import com.example.administrator.mvpdemo.view.ResuletView;
import com.google.gson.Gson;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";
    private PresenterImpl mPresenter;
    private EditText name,psw;
    private Button but_login;
    private Gson gson;
    private TextView tv_login_content;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mPresenter = new PresenterImpl(this);
        gson = new Gson();
        mPresenter.onCreate();
        bindView();
        mPresenter.attachView(new ResuletView() {
            @Override
            public void success(Accounts t) {
                tv_login_content.setText(t.toString());
            }

            @Override
            public void error(String message) {
                tv_login_content.setText(message);
            }
        });
    }


    private void bindView() {
        name = (EditText) findViewById(R.id.et_name);
        psw = (EditText) findViewById(R.id.et_psw);
        but_login = (Button)findViewById(R.id.but_login);
        tv_login_content = (TextView) findViewById(R.id.tv_login_content);

    }

    public void login(View view){
        Log.e(TAG, "login: "+name.getText().toString()+psw.getText().toString());
        mPresenter.login("15001093327","123456");
    }

    @Override
    protected void onStop() {
        super.onStop();
        mPresenter.onStop();
    }
}
