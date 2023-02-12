package com.rabbi.mindreader;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class SplashActivity extends AppCompatActivity {

    TextView mindReaderText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        mindReaderText = findViewById(R.id.mindReaderText);
        startAnimation();

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                startActivity(new Intent(SplashActivity.this,MainActivity.class));

            }
        },3500);
    }

    private void startAnimation(){
        Animation animation = AnimationUtils.loadAnimation(this,R.anim.anim_for_splash_screen);
        mindReaderText.startAnimation(animation);
    }
}