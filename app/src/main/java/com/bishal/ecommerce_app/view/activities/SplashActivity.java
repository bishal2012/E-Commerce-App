package com.bishal.ecommerce_app.view.activities;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.app.FragmentActivity;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import com.bishal.ecommerce_app.R;


public class SplashActivity extends FragmentActivity {

    private Animation animation;
    private ImageView logo;
    private TextView appTitle;
    private TextView appSlogan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        Thread t = new Thread() {
            public void run() {

                try {

                    sleep(5000);
                } catch (Exception e) {
                }
                Intent i = new Intent(SplashActivity.this,ECartHomeActivity.class);
                startActivity(i);
                finish();

            }

        };
        t.start();
    }

    @Override
    public void onBackPressed() {
        // Do nothing
    }

}
