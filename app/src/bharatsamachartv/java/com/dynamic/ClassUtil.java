package com.dynamic;

import android.app.Activity;

import com.dynamic.util.SupportUtil;

public class ClassUtil {

    public static void openBrowser(Activity activity) {
        if (activity != null) {
            SupportUtil.openInAppBrowser(activity, null, AppValues.APP_URL);
            activity.finish();
        }
    }
}
