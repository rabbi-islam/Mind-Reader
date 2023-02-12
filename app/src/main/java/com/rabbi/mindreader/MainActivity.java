package com.rabbi.mindreader;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputLayout;

public class MainActivity extends AppCompatActivity {
    public static final String MSG = "com.threedeveloper.mindreader.MSG";
    public static final int MSG1 = 1;

    EditText numberEdittext;
    Button submitButton;
    String value;

    LinearLayout layout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        numberEdittext = findViewById(R.id.inputNumberEdittext);
        submitButton = findViewById(R.id.submitButton);
        layout = findViewById(R.id.relative1);

        CreatepopUpwindow();

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

        } else if (Integer.parseInt(value)<3 || Integer.parseInt(value)>6){
            numberEdittext.setError("Please input between 3 to 6");

        }else {
            Intent intent = new Intent(this, SecondActivity.class);
            intent.putExtra(MSG, value);
            startActivity(intent);
        }


    }

    private void CreatepopUpwindow() {
        LayoutInflater inflater= (LayoutInflater) getSystemService(LAYOUT_INFLATER_SERVICE);
        View popUpView=inflater.inflate(R.layout.mainpopup,null);

        int width= ViewGroup.LayoutParams.MATCH_PARENT;
        int height=ViewGroup.LayoutParams.MATCH_PARENT;
        boolean focusable=true;
        PopupWindow popupWindow=new PopupWindow(popUpView,width,height,focusable);
        layout.post(new Runnable() {
            @Override
            public void run() {
                popupWindow.showAtLocation(layout, Gravity.TOP,50,50);

            }
        });
        TextView Skip ,Gotit;
        Skip=popUpView.findViewById(R.id.Skip);
        Gotit=popUpView.findViewById(R.id.Gotit);
        Skip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                popupWindow.dismiss();
            }
        });
        Gotit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                popupWindow.dismiss();
            }
        });
        // and if you want to close popup when touch Screen
        popUpView.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                popupWindow.dismiss();
                return true;
            }
        });
    }

    }
