package com.murat.articlemode;

import android.util.Log;

public class LogDebug {

    private static final String TAG = "SUPER_LOG";

    public static void d(String message) {
        Log.d(TAG, message);
    }
}
