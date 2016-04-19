package com.example.zhang.dagger2_retrofit_mvp_practice.ui.component;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.example.zhang.dagger2_retrofit_mvp_practice.ui.module.ActivityModule;

/**
 * Created by zhang on 16-4-19.
 */
public class BaseActivity extends AppCompatActivity {

    private ActivityComponent activityComponent;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        activityComponent = DaggerActivityComponent.builder()
                .activityModule(new ActivityModule(this))
                .build();

    }


    public ActivityComponent getActivityComponent()
    {
        return activityComponent;
    }
}
