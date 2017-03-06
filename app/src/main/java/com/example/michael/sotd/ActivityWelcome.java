package com.example.michael.sotd;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

public class ActivityWelcome extends AppCompatActivity {
    private static int WELCOME_TIMEOUT = 3000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        final TextView image = (TextView) findViewById(R.id.t1);
        final Animation animationFadeIn = AnimationUtils.loadAnimation(this, R.anim.fade_in);

        image.startAnimation(animationFadeIn);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent homeIntent = new Intent(ActivityWelcome.this, ActivityMain.class);
                startActivity(homeIntent);

                finish();
            }
        }, WELCOME_TIMEOUT);
    }
}
