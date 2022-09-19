package com.dynamic;

import android.app.Activity;

import com.browser.BrowserSdk;

public class ClassUtil {

    public static void openBrowser(Activity activity) {
        if (activity != null) {
            BrowserSdk.open(activity, null, AppValues.APP_URL);
            activity.finish();
        }
    }
}
