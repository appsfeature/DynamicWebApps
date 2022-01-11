package com.dynamic;

import android.app.Application;

import com.browser.BrowserSdk;
import com.browser.BuildConfig;

public class AppApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        BrowserSdk.getInstance().setDebugMode(BuildConfig.DEBUG);
    }
}
