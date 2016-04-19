package com.example.zhang.dagger2_retrofit_mvp_practice.ui.module;

import com.example.zhang.dagger2_retrofit_mvp_practice.ui.presenter.MainActivityPersenter;
import com.example.zhang.dagger2_retrofit_mvp_practice.ui.view.MainActivityView;

import dagger.Module;
import dagger.Provides;

/**
 * Created by zhang on 16-4-19.
 */
@Module
public class MainActivityModule {

    private MainActivityView mainActivityView;

    public MainActivityModule(MainActivityView mainActivityView)
    {
        this.mainActivityView = mainActivityView;
    }

    @Provides
    MainActivityPersenter providesMainActivityPersenter(){
        return new MainActivityPersenter(mainActivityView);
    }

}
