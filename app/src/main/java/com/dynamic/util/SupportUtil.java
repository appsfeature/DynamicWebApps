package com.dynamic.util;

import android.content.Context;

public class SupportUtil {

    private static final String APPLICATION_ID_BHARAT_TV = "com.uttarpradeshtv";
    private static final String APPLICATION_ALL_IN_ONE = "com.allinone.allinoneglobalmarket";

    public static boolean isBharatTV(Context context) {
        return context.getPackageName().equals(APPLICATION_ID_BHARAT_TV);
    }
    public static boolean isAllInOne(Context context) {
        return context.getPackageName().equals(APPLICATION_ALL_IN_ONE);
    }

}
