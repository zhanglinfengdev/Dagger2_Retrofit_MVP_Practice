package com.example.zhang.dagger2_retrofit_mvp_practice;

import android.app.Application;

import dagger.Module;
import dagger.Provides;

/**
 * Created by zhang on 16-4-19.
 */
@Module
public class AppModule {

    private Application application;

    public AppModule(Application application)
    {
        this.application = application;
    }

    @Provides
    public Application providesApplication()
    {
        return application;
    }

}
