package com.example.zhang.dagger2_retrofit_mvp_practice.ui.module;

import android.app.Activity;

import dagger.Module;
import dagger.Provides;

/**
 * Created by zhang on 16-4-19.
 */
@Module
public class ActivityModule {
    Activity activity;

    public ActivityModule(Activity activity)
    {
        this.activity = activity;
    }

    //provid注释得函数必须是无参数的，否则将无法初始化
    @Provides
    public Activity providesActivity()
    {
        return activity;
    }
}
