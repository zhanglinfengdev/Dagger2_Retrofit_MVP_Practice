package com.example.zhang.dagger2_retrofit_mvp_practice.ui.component;

import android.app.Activity;

import com.example.zhang.dagger2_retrofit_mvp_practice.AppComponent;
import com.example.zhang.dagger2_retrofit_mvp_practice.ui.MainActivity;
import com.example.zhang.dagger2_retrofit_mvp_practice.ui.module.ActivityModule;
import com.example.zhang.dagger2_retrofit_mvp_practice.ui.module.MainActivityModule;
import com.example.zhang.dagger2_retrofit_mvp_practice.ui.presenter.MainActivityPersenter;

import dagger.Component;

/**
 * Created by zhang on 16-4-19.
 */
@Component(dependencies = {AppComponent.class},
        modules = {MainActivityModule.class,ActivityModule.class})
public interface MainActivityComponent extends ActivityComponent {

    public void inJect(MainActivity mainActivity);

    MainActivityPersenter getMainActivityPersenter();

    Activity getActivity();

}
