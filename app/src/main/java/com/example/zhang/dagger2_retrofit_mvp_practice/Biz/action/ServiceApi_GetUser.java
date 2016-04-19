package com.example.zhang.dagger2_retrofit_mvp_practice.Biz.action;

import com.example.zhang.dagger2_retrofit_mvp_practice.Biz.entity.User;

import retrofit.Callback;
import retrofit.http.GET;
import retrofit.http.Path;

/**
 * Created by zhang on 16-4-19.
 */
public interface ServiceApi_GetUser {

    @GET("/users/{name}/describetion")
    public void getUser(Callback<User> callback,@Path("name") String name);

}
