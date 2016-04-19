package com.example.zhang.dagger2_retrofit_mvp_practice.Biz.action;


import com.squareup.okhttp.OkHttpClient;

import java.util.concurrent.TimeUnit;

import dagger.Module;
import dagger.Provides;
import retrofit.RestAdapter;
import retrofit.client.OkClient;

/**
 * Created by zhang on 16-4-19.
 */
@Module
public class ServiceApi_GetUserModule {

    private static final String ROOT_PATH = "http：//www.baidu.com";

    @Provides
    OkHttpClient provdesOkHttpClient()
    {
        OkHttpClient okHttpClient = new OkHttpClient();
        okHttpClient.setConnectTimeout(60 * 1000 , TimeUnit.MILLISECONDS);
        okHttpClient.setReadTimeout(60 * 100,TimeUnit.MICROSECONDS);
        return okHttpClient;
    }


    @Provides
    RestAdapter providerestAdapter()
    {
         return new RestAdapter.Builder()
                 .setEndpoint(ROOT_PATH)
                 .setClient(new OkClient(provdesOkHttpClient()))
                 .build();
    }

    @Provides
    ServiceApi_GetUser provideServiceApi()
    {
        return providerestAdapter().create(ServiceApi_GetUser.class);
    }

}
