package com.example.zhang.dagger2_retrofit_mvp_practice.util;

import android.content.Context;
import android.widget.Toast;

import javax.inject.Inject;

/**
 * Created by zhang on 16-4-19.
 */
public class ToastHelper {

    @Inject  //再Inject维度上只能注释无参数的构造函数
    public ToastHelper()
    {

    }

    public void showToast(Context context,String msg)
    {
        Toast.makeText(context,msg,Toast.LENGTH_SHORT).show();
    }

}
