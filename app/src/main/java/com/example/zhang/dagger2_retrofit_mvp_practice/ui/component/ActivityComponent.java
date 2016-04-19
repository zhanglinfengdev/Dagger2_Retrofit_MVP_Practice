package com.example.zhang.dagger2_retrofit_mvp_practice.ui.component;

import android.app.Activity;

import com.example.zhang.dagger2_retrofit_mvp_practice.ui.module.ActivityModule;

import dagger.Component;

/**
 * Created by zhang on 16-4-19.
 */
@Component(modules = ActivityModule.class)
public interface ActivityComponent  {

    Activity getActivity();

}
