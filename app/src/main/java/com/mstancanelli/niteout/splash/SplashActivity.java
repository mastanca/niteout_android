package com.mstancanelli.niteout.splash;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;

import com.mstancanelli.niteout.home.HomeActivity;
import com.mstancanelli.niteout.R;

/**
 * Created by mstancanelli on 8/1/16.
 */
public class SplashActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_splash);

        new CountDownTimer(4000, 4000){

            @Override
            public void onTick(long l) {

            }

            @Override
            public void onFinish() {
                Intent intent = new Intent(SplashActivity.this, HomeActivity.class);
                startActivity(intent);
            }
        }.start();
    }
}
