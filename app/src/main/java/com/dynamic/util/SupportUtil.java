package com.dynamic.util;

import android.content.Context;
import android.content.Intent;

import com.browser.BrowserSdk;
import com.browser.util.BrowserConstant;
import com.dynamic.AppBrowserActivity;

public class SupportUtil {

    private static final String APPLICATION_ID_BHARAT_TV = "com.uttarpradeshtv";
    private static final String APPLICATION_ALL_IN_ONE = "com.allinone.allinoneglobalmarket";

    public static boolean isBharatTV(Context context) {
        return context.getPackageName().equals(APPLICATION_ID_BHARAT_TV);
    }
    public static boolean isAllInOne(Context context) {
        return context.getPackageName().equals(APPLICATION_ALL_IN_ONE);
    }

    public static void openInAppBrowser(Context context, String title, String webUrl) {
        try {
            Intent intent = new Intent(context, AppBrowserActivity.class);
            intent.putExtra(BrowserConstant.WEB_VIEW_URL, webUrl);
            intent.putExtra(BrowserConstant.TITLE, title);
            context.startActivity(intent);
        } catch (Exception e) {
            e.printStackTrace();
            BrowserSdk.showToast(context, "No option available for take action.");
        }
    }


}
