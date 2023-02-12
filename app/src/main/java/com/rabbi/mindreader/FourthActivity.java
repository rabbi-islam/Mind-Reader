package com.rabbi.mindreader;

import androidx.appcompat.app.AppCompatActivity;

import android.animation.ObjectAnimator;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.airbnb.lottie.LottieAnimationView;

public class FourthActivity extends AppCompatActivity {

    TextView showingText;
    LottieAnimationView lottieAnimationView;
    RelativeLayout root;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourth);

        showingText = findViewById(R.id.showingText);
        lottieAnimationView = findViewById(R.id.lottieAnimation);
        root = findViewById(R.id.root);


        Intent intent = getIntent();
        String output = intent.getStringExtra(ThirdActivity.FINAL_OUTPUT);

//        lottieAnimationView.animate().translationX(1400).setDuration(1000).setStartDelay(0);

//        ObjectAnimator animation = ObjectAnimator.ofFloat(showingText, "translationX", 100f);
//        animation.setDuration(2000);
//        animation.start();



        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                showingText.setText(output);
                startAnimation();
            } 
        },3000);

    }
    private void startAnimation(){
        Animation animation = AnimationUtils.loadAnimation(this,R.anim.anim);
        showingText.startAnimation(animation);
    }
}