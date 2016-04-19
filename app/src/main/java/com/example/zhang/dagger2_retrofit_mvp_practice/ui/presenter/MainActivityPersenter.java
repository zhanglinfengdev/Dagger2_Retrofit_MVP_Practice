package com.example.zhang.dagger2_retrofit_mvp_practice.ui.presenter;

import com.example.zhang.dagger2_retrofit_mvp_practice.ui.view.MainActivityView;

/**
 * Created by zhang on 16-4-19.
 */
public class MainActivityPersenter {

    private MainActivityView mainActivityView;


    public MainActivityPersenter(MainActivityView view)
    {
        this.mainActivityView = view ;
    }


    public void showToast(String msg)
    {
        mainActivityView.showToast(msg);
    }

}
