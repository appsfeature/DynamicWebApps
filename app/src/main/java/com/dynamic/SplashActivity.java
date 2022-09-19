package com.dynamic;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;

import androidx.appcompat.app.AppCompatActivity;

import com.dynamic.util.SupportUtil;

public class SplashActivity extends AppCompatActivity {

    private MediaPlayer mp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        try {
            if(SupportUtil.isBharatTV(this)){
                setContentView(R.layout.activity_splash);
                mp = MediaPlayer.create(SplashActivity.this, R.raw.notification);
                if (mp != null) {
                    mp.start();
                }
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        ClassUtil.openBrowser(SplashActivity.this);
                    }
                }, 2000);
            }else{
                ClassUtil.openBrowser(SplashActivity.this);
            }
        } catch (IllegalStateException e) {
            e.printStackTrace();
        }
    }

    @Override
    protected void onPause() {
        super.onPause();
        if (mp != null) {
            mp.stop();
        }
    }
}