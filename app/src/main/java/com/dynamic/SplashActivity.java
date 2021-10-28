package com.dynamic;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;

import androidx.appcompat.app.AppCompatActivity;

import com.browser.BrowserSdk;
import com.dynamic.util.SupportUtil;

public class SplashActivity extends AppCompatActivity {

    private MediaPlayer mp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if(SupportUtil.isBharatTV(this)){
            setContentView(R.layout.activity_splash);
            mp = MediaPlayer.create(SplashActivity.this, R.raw.notification);
            mp.start();
            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {
                    openActivity();
                }
            }, 2000);
        }else{
            openActivity();
        }
    }

    @Override
    protected void onPause() {
        super.onPause();
        if (mp != null) {
            mp.stop();
        }
    }

    private void openActivity() {
        BrowserSdk.open(this, null, AppValues.APP_URL);
        finish();
    }
}