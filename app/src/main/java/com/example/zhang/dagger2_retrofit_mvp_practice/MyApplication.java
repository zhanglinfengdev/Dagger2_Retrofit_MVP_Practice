package com.example.zhang.dagger2_retrofit_mvp_practice;

import android.app.Application;

/**
 * Created by zhang on 16-4-19.
 */
public class MyApplication extends Application {


    private AppComponent mAppComponent;


    @Override
    public void onCreate() {
        super.onCreate();

        mAppComponent = DaggerAppComponent.builder()
                .appModule(new AppModule(this))
                .build();
    }


    public AppComponent getAppComponent() {
        return mAppComponent;
    }
}
