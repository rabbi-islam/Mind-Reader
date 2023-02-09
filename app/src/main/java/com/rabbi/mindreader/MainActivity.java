package com.rabbi.mindreader;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputLayout;

public class MainActivity extends AppCompatActivity {
    public static final String MSG = "com.threedeveloper.mindreader.MSG";
    public static final int MSG1 = 1;

    EditText numberEdittext;
    Button submitButton;
    String value;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        numberEdittext = findViewById(R.id.inputNumberEdittext);
        submitButton = findViewById(R.id.submitButton);

        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
             isValidte();
            }
        });


    }

    public void isValidte() {
        value = numberEdittext.getText().toString();
        if (value.isEmpty()){
            numberEdittext.setError("Empty!!");

        } else if (Integer.parseInt(value)<3 || Integer.parseInt(value)>5){
            numberEdittext.setError("Please input between 3 to 5");

        }else {
            Intent intent = new Intent(this, SecondActivity.class);
            intent.putExtra(MSG, value);
            startActivity(intent);
        }


    }


    }
