package com.rabbi.mindreader;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {

    public static final String InputValue = "com.threedeveloper.mindreader.MSG";
    public static final String alphabetValue1 = "com";
    public static final String alphabetValue2 = "com1";
    public static final String alphabetValue3 = "com3";
    public static final String alphabetValue4 = "com4";
    public static final String alphabetValue5 = "com5";


    int gettingNumberOfLetter;
    EditText editText1,editText2,editText3,editText4,editText5;
    Button submitBtn;
    String num1,num2,num3,num4,num5,value;
    String val1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Intent intent = getIntent();
        String msg = intent.getStringExtra(MainActivity.MSG);
        value= String.valueOf(msg);
        gettingNumberOfLetter= Integer.parseInt(msg);



        editText1 = findViewById(R.id.inputNumberEdittext1);
        editText2 = findViewById(R.id.inputNumberEdittext2);
        editText3 = findViewById(R.id.inputNumberEdittext3);
        editText4 = findViewById(R.id.inputNumberEdittext4);
        editText5 = findViewById(R.id.inputNumberEdittext5);
        submitBtn = findViewById(R.id.submitButton);


        //Hiding edittext here
        hideEditText();
        submitBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                isValidte();
            }
        });
    }



    public void hideEditText(){
         if (gettingNumberOfLetter==3){
             editText4.setVisibility(View.GONE);
             editText5.setVisibility(View.GONE);
        }else if (gettingNumberOfLetter==4){
             editText5.setVisibility(View.GONE);
        }
    }

    public void isValidte(){

        num1 = editText1.getText().toString().trim();
        num2 = editText2.getText().toString().trim();
        num3 = editText3.getText().toString().trim();
        num4 = editText4.getText().toString().trim();
        num5 = editText5.getText().toString().trim();


         if (gettingNumberOfLetter==3){
             validationForThreeEditText();
        }else if (gettingNumberOfLetter==4){
             validationForFourEditText();
        }else if (gettingNumberOfLetter==5){
             validationForFiveEditText();
        }

}


    private void validationForThreeEditText(){
        if ((num1.isEmpty()) || (num2.isEmpty()) || (num3.isEmpty())){

            Toast.makeText(this, "field must not be empty!", Toast.LENGTH_SHORT).show();

        } else if ((Integer.parseInt(num1)<1) || (Integer.parseInt(num1)>4)){

            Toast.makeText(this, "num1 invalid!", Toast.LENGTH_SHORT).show();

        }else if ((Integer.parseInt(num2)<1) || (Integer.parseInt(num2)>4)){

            Toast.makeText(this, "num2 invalid!!", Toast.LENGTH_SHORT).show();
        }else if ((Integer.parseInt(num3)<1) || (Integer.parseInt(num3)>4)){

            Toast.makeText(this, "num3 invalid!!", Toast.LENGTH_SHORT).show();
        }else{
            sendValue();
        }
    }
    private void validationForFourEditText(){
        if ((num1.isEmpty()) || (num2.isEmpty()) || (num3.isEmpty()) || (num4.isEmpty()) ){

            Toast.makeText(this, "field must not be empty!", Toast.LENGTH_SHORT).show();

        } else if ((Integer.parseInt(num1)<1) || (Integer.parseInt(num1)>4)){

            Toast.makeText(this, "num1 invalid!", Toast.LENGTH_SHORT).show();

        }else if ((Integer.parseInt(num2)<1) || (Integer.parseInt(num2)>4)){

            Toast.makeText(this, "num2 invalid!!", Toast.LENGTH_SHORT).show();
        }else if ((Integer.parseInt(num3)<1) || (Integer.parseInt(num3)>4)){

            Toast.makeText(this, "num3 invalid!!", Toast.LENGTH_SHORT).show();
        }else if ((Integer.parseInt(num4)<1) || (Integer.parseInt(num4)>4)){

            Toast.makeText(this, "num4 invalid!!", Toast.LENGTH_SHORT).show();
        }else{

            sendValue();
        }
    }
    private void validationForFiveEditText(){
        if ((num1.isEmpty()) || (num2.isEmpty()) || (num3.isEmpty()) || (num4.isEmpty()) || (num5.isEmpty()) ){

            Toast.makeText(this, "field must not be empty!", Toast.LENGTH_SHORT).show();

        } else if ((Integer.parseInt(num1)<1) || (Integer.parseInt(num1)>4)){

            Toast.makeText(this, "num1 invalid!", Toast.LENGTH_SHORT).show();

        }else if ((Integer.parseInt(num2)<1) || (Integer.parseInt(num2)>4)){

            Toast.makeText(this, "num2 invalid!!", Toast.LENGTH_SHORT).show();
        }else if ((Integer.parseInt(num3)<1) || (Integer.parseInt(num3)>4)){

            Toast.makeText(this, "num3 invalid!!", Toast.LENGTH_SHORT).show();
        }else if ((Integer.parseInt(num4)<1) || (Integer.parseInt(num4)>4)){

            Toast.makeText(this, "num4 invalid!!", Toast.LENGTH_SHORT).show();
        }else if ((Integer.parseInt(num5)<1) || (Integer.parseInt(num5)>4)){

            Toast.makeText(this, "num5 invalid!!", Toast.LENGTH_SHORT).show();
        }else{
            sendValue();
        }
    }
    public void sendValue(){
        //sending edittext number in 3rd activity got from 1st activity
        Intent intent = new Intent(this, ThirdActivity.class);
        intent.putExtra(InputValue, value);

        if (gettingNumberOfLetter==3){
            intent.putExtra(alphabetValue1, num1);
            intent.putExtra(alphabetValue2, num2);
            intent.putExtra(alphabetValue3, num3);
        }else if (gettingNumberOfLetter==4){
            intent.putExtra(alphabetValue1, num1);
            intent.putExtra(alphabetValue2, num2);
            intent.putExtra(alphabetValue3, num3);
            intent.putExtra(alphabetValue4, num4);
        }else if (gettingNumberOfLetter==5){
            intent.putExtra(alphabetValue1, num1);
            intent.putExtra(alphabetValue2, num2);
            intent.putExtra(alphabetValue3, num3);
            intent.putExtra(alphabetValue4, num4);
            intent.putExtra(alphabetValue5, num5);
        }
        startActivity(intent);

    }

}