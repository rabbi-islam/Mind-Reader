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
        String str1 = intent.getStringExtra(SecondActivity.alphabetValue1);
        String str2 = intent.getStringExtra(SecondActivity.alphabetValue2);
        String str3 = intent.getStringExtra(SecondActivity.alphabetValue3);

        Toast.makeText(this, str1, Toast.LENGTH_SHORT).show();
        Toast.makeText(this, str2, Toast.LENGTH_SHORT).show();
        Toast.makeText(this, str3, Toast.LENGTH_SHORT).show();
    }
}