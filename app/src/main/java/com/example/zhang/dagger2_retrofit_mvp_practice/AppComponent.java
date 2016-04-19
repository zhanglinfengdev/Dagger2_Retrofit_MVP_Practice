package com.example.zhang.dagger2_retrofit_mvp_practice;

import android.app.Application;

import com.example.zhang.dagger2_retrofit_mvp_practice.Biz.action.ServiceApi_GetUser;
import com.example.zhang.dagger2_retrofit_mvp_practice.Biz.action.ServiceApi_GetUserModule;
import com.example.zhang.dagger2_retrofit_mvp_practice.Biz.entity.AppServiceModule;
import com.example.zhang.dagger2_retrofit_mvp_practice.Biz.entity.User;
import com.squareup.okhttp.OkHttpClient;

import dagger.Component;
import retrofit.RestAdapter;

/**
 * Created by zhang on 16-4-19.
 */
@Component(modules = {AppModule.class,ServiceApi_GetUserModule.class, AppServiceModule.class})
public interface AppComponent {

    public void inject(Application application);

    Application getApplication();


    User getUser();

    OkHttpClient getOkHttpClient();

    RestAdapter getRestAdapter();

    ServiceApi_GetUser getServiceApi_GetUser();
}
