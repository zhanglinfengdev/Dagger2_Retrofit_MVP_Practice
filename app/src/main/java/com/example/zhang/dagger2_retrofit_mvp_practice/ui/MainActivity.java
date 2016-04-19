package com.example.zhang.dagger2_retrofit_mvp_practice.ui;


import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.zhang.dagger2_retrofit_mvp_practice.Biz.action.ServiceApi_GetUser;
import com.example.zhang.dagger2_retrofit_mvp_practice.Biz.entity.User;
import com.example.zhang.dagger2_retrofit_mvp_practice.MyApplication;
import com.example.zhang.dagger2_retrofit_mvp_practice.R;
import com.example.zhang.dagger2_retrofit_mvp_practice.ui.component.BaseActivity;
import com.example.zhang.dagger2_retrofit_mvp_practice.ui.component.DaggerMainActivityComponent;
import com.example.zhang.dagger2_retrofit_mvp_practice.ui.component.MainActivityComponent;
import com.example.zhang.dagger2_retrofit_mvp_practice.ui.module.ActivityModule;
import com.example.zhang.dagger2_retrofit_mvp_practice.ui.module.MainActivityModule;
import com.example.zhang.dagger2_retrofit_mvp_practice.ui.presenter.MainActivityPersenter;
import com.example.zhang.dagger2_retrofit_mvp_practice.ui.view.MainActivityView;
import com.example.zhang.dagger2_retrofit_mvp_practice.util.ToastHelper;

import javax.inject.Inject;

import retrofit.Callback;
import retrofit.RetrofitError;
import retrofit.client.Response;

public class MainActivity extends BaseActivity implements MainActivityView{

    @Inject
    ToastHelper toastHelper;

    @Inject//此对象一般再biz层此处只是为了演示依赖的对象注入
    ServiceApi_GetUser serviceApi_getUser;

    @Inject
    MainActivityPersenter mainActivityPersenter;


    //暂时没有子级别需要使用到父级别componentso无需提供getMainActivityComponent方法
    private MainActivityComponent mainActivityComponent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mainActivityComponent = DaggerMainActivityComponent.builder()
                .appComponent(((MyApplication) getApplication()).getAppComponent())
                .activityModule(new ActivityModule(getParent()))
                .mainActivityModule(new MainActivityModule(this))
                .build();
        mainActivityComponent.inJect(this);

        initListener();
    }

    private void initListener() {
        ((Button) findViewById(R.id.btn_showToast)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mainActivityPersenter.showToast("注入成功！！！");


                serviceApi_getUser.getUser(new Callback<User>() {
                    @Override
                    public void success(User user, Response response) {

                    }

                    @Override
                    public void failure(RetrofitError error) {

                    }
                },"fengge");
            }
        });
    }


    @Override
    public void showToast(String message) {
        toastHelper.showToast(this,message);
    }
}
