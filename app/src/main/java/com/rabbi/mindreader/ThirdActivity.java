package com.rabbi.mindreader;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

public class ThirdActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        Intent intent = getIntent();
        String msg = intent.getStringExtra(SecondActivity.InputValue);

        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show();
    }
}