package com.tyh.tools;

import android.app.Application;

/**
 * <p>@author : tyh</p>
 * <p>@time : 2021/8/28</p>
 * <p>@for : </p>
 * <p></p>
 */
public class App extends Application {
    public static Application mContext;

    @Override
    public void onCreate() {
        super.onCreate();
        mContext = this;
    }



}
