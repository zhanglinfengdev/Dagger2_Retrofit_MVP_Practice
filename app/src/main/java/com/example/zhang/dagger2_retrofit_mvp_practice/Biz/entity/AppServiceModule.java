package com.example.zhang.dagger2_retrofit_mvp_practice.Biz.entity;

import dagger.Module;
import dagger.Provides;

/**
 * Created by zhang on 16-4-19.
 */
@Module
public class AppServiceModule {

    @Provides
    User provdeUser()
    {
        User user = new User();
        user.setId("1");
        user.setName("feng ge");
        return user;
    }
}
