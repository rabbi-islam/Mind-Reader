package com.rabbi.mindreader;

import static com.rabbi.mindreader.SecondActivity.InputValue;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TableRow;
import android.widget.TextView;
import android.widget.Toast;

public class ThirdActivity extends AppCompatActivity {

    private int gettingNumberOfLetter;
    private EditText editText1,editText2,editText3,editText4,editText5;
    private TableRow tableRow1,tableRow2,tableRow3,tableRow4,tableRow5;
    private  Button submitBtn;
    private  String num1,num2,num3,num4,num5,value;
    String   alphabet1,alphabet2,alphabet3,alphabet4,alphabet5,val1;
    int int1, int2, int3, int4, int5;
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        intent = getIntent();
        String msg = intent.getStringExtra(InputValue);
        value= String.valueOf(msg);
        gettingNumberOfLetter= Integer.parseInt(msg);


        tableRow1 = findViewById(R.id.tableRow1);
        tableRow2 = findViewById(R.id.tableRow2);
        tableRow3 = findViewById(R.id.tableRow3);
        tableRow4 = findViewById(R.id.tableRow4);
        tableRow5 = findViewById(R.id.tableRow5);
        tableRow1 = findViewById(R.id.tableRow1);
        editText1 = findViewById(R.id.inputEdittext1);
        editText2 = findViewById(R.id.inputEdittext2);
        editText3 = findViewById(R.id.inputEdittext3);
        editText4 = findViewById(R.id.inputEdittext4);
        editText5 = findViewById(R.id.inputEdittext5);
        submitBtn = findViewById(R.id.submitBtn);

        //Hiding edittext here
        hideEditText();
        settingValuesInRows();




        submitBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                isValidte();
            }
        });





    }
    public void settingValuesInRows(){
        if (gettingNumberOfLetter == 3) {
            tableRow4.setVisibility(View.GONE);
            tableRow5.setVisibility(View.GONE);
            settingAlphabetvalue1();
            settingAlphabetvalue2();
            settingAlphabetvalue3();
        }else if (gettingNumberOfLetter == 4) {
            tableRow5.setVisibility(View.GONE);
            settingAlphabetvalue1();
            settingAlphabetvalue2();
            settingAlphabetvalue3();
            settingAlphabetvalue4();
        }else if (gettingNumberOfLetter == 5) {
            settingAlphabetvalue1();
            settingAlphabetvalue2();
            settingAlphabetvalue3();
            settingAlphabetvalue4();
            settingAlphabetvalue5();
        }
    }
    public void hideEditText(){
        if (gettingNumberOfLetter==3){
            editText4.setVisibility(View.GONE);
            editText5.setVisibility(View.GONE);
        }else if (gettingNumberOfLetter==4){
            editText5.setVisibility(View.GONE);
        }
    }
    public void letterBox(){

        if (int1 == 1) {
            val1 = "A  E  I  M  Q  U  Y";
        } else if (int1 == 2) {
            val1 = "B  F  J  N  R  V  Z";
        } else if (int1 == 3) {
            val1 = "C  G  K  O  S  W   ";
        } else if (int1 == 4) {
            val1 = "D  H  L  P  T  X   ";
        } else {
            val1 = "0";
        }
    }
    public void letterBox2(){

        if (int2 == 1) {
            val1 = "A  E  I  M  Q  U  Y";
        } else if (int2 == 2) {
            val1 = "B  F  J  N  R  V  Z";
        } else if (int2 == 3) {
            val1 = "C  G  K  O  S  W   ";
        } else if (int2 == 4) {
            val1 = "D  H  L  P  T  X   ";
        } else {
            val1 = "0";
        }
    }
    public void letterBox3(){

        if (int3 == 1) {
            val1 = "A  E  I  M  Q  U  Y";
        } else if (int3 == 2) {
            val1 = "B  F  J  N  R  V  Z";
        } else if (int3 == 3) {
            val1 = "C  G  K  O  S  W   ";
        } else if (int3 == 4) {
            val1 = "D  H  L  P  T  X   ";
        } else {
            val1 = "0";
        }
    }
    public void letterBox4(){

        if (int4 == 1) {
            val1 = "A  E  I  M  Q  U  Y";
        } else if (int4 == 2) {
            val1 = "B  F  J  N  R  V  Z";
        } else if (int4 == 3) {
            val1 = "C  G  K  O  S  W   ";
        } else if (int4 == 4) {
            val1 = "D  H  L  P  T  X   ";
        } else {
            val1 = "0";
        }
    }
    public void letterBox5(){

        if (int5 == 1) {
            val1 = "A  E  I  M  Q  U  Y";
        } else if (int5 == 2) {
            val1 = "B  F  J  N  R  V  Z";
        } else if (int5 == 3) {
            val1 = "C  G  K  O  S  W   ";
        } else if (int5 == 4) {
            val1 = "D  H  L  P  T  X   ";
        } else {
            val1 = "0";
        }
    }
    public void settingAlphabetvalue1(){
        alphabet1 = intent.getStringExtra(SecondActivity.alphabetValue1);
        int1 = Integer.parseInt(alphabet1);

        letterBox();

        int[] textViews = {R.id.textView1, R.id.textView2, R.id.textView3, R.id.textView4, R.id.textView5, R.id.textView6, R.id.textView7};
        String myString = val1;
        String[] splitString = myString.split("  ");
        for (int i = 0; i < textViews.length; i++) {
            TextView tv = findViewById(textViews[i]);
            tv.setText(splitString[i]);
        }

    }
    public void settingAlphabetvalue2(){
        alphabet2 = intent.getStringExtra(SecondActivity.alphabetValue2);
        int2 = Integer.parseInt(alphabet2);
        letterBox2();
        int[] textViews2 = {R.id.textView8, R.id.textView9, R.id.textView10, R.id.textView11, R.id.textView12, R.id.textView13, R.id.textView14};
        String myString2 = val1;
        String[] splitString2 = myString2.split("  ");
        for (int i = 0; i < textViews2.length; i++) {
            TextView tv = findViewById(textViews2[i]);
            tv.setText(splitString2[i]);
        }
    }
    public void settingAlphabetvalue3(){
        alphabet3 = intent.getStringExtra(SecondActivity.alphabetValue3);
        int3 = Integer.parseInt(alphabet3);
        letterBox3();

        int[] textViews3 = {R.id.textView15, R.id.textView16, R.id.textView17, R.id.textView18, R.id.textView19, R.id.textView20, R.id.textView21};
        String myString3 = val1;
        String[] splitString3 = myString3.split("  ");
        for (int i = 0; i < textViews3.length; i++) {
            TextView tv = findViewById(textViews3[i]);
            tv.setText(splitString3[i]);
        }
    }
    public void settingAlphabetvalue4(){
        alphabet4 = intent.getStringExtra(SecondActivity.alphabetValue4);
        int4 = Integer.parseInt(alphabet4);
        letterBox4();

        int[] textViews4 = {R.id.textView22, R.id.textView23, R.id.textView24, R.id.textView25, R.id.textView26, R.id.textView27, R.id.textView28};
        String myString4 = val1;
        String[] splitString3 = myString4.split("  ");
        for (int i = 0; i < textViews4.length; i++) {
            TextView tv = findViewById(textViews4[i]);
            tv.setText(splitString3[i]);
        }
    }
    public void settingAlphabetvalue5(){
        alphabet5 = intent.getStringExtra(SecondActivity.alphabetValue5);
        int5 = Integer.parseInt(alphabet5);
        letterBox5();

        int[] textViews5 = {R.id.textView29, R.id.textView30, R.id.textView31, R.id.textView32, R.id.textView33, R.id.textView34, R.id.textView35};
        String myString5 = val1;
        String[] splitString3 = myString5.split("  ");
        for (int i = 0; i < textViews5.length; i++) {
            TextView tv = findViewById(textViews5[i]);
            tv.setText(splitString3[i]);
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

        } else if ((Integer.parseInt(num1)<1) || (Integer.parseInt(num1)>7)){

            Toast.makeText(this, "num1 invalid!", Toast.LENGTH_SHORT).show();

        }else if ((Integer.parseInt(num2)<1) || (Integer.parseInt(num2)>7)){

            Toast.makeText(this, "num2 invalid!!", Toast.LENGTH_SHORT).show();
        }else if ((Integer.parseInt(num3)<1) || (Integer.parseInt(num3)>7)){

            Toast.makeText(this, "num3 invalid!!", Toast.LENGTH_SHORT).show();
        }else{
            sendValue();
        }
    }
    private void validationForFourEditText(){
        if ((num1.isEmpty()) || (num2.isEmpty()) || (num3.isEmpty()) || (num4.isEmpty()) ){

            Toast.makeText(this, "field must not be empty!", Toast.LENGTH_SHORT).show();

        } else if ((Integer.parseInt(num1)<1) || (Integer.parseInt(num1)>7)){

            Toast.makeText(this, "num1 invalid!", Toast.LENGTH_SHORT).show();

        }else if ((Integer.parseInt(num2)<1) || (Integer.parseInt(num2)>7)){

            Toast.makeText(this, "num2 invalid!!", Toast.LENGTH_SHORT).show();
        }else if ((Integer.parseInt(num3)<1) || (Integer.parseInt(num3)>7)){

            Toast.makeText(this, "num3 invalid!!", Toast.LENGTH_SHORT).show();
        }else if ((Integer.parseInt(num4)<1) || (Integer.parseInt(num4)>7)){

            Toast.makeText(this, "num4 invalid!!", Toast.LENGTH_SHORT).show();
        }else{

            sendValue();
        }
    }
    private void validationForFiveEditText(){
        if ((num1.isEmpty()) || (num2.isEmpty()) || (num3.isEmpty()) || (num4.isEmpty()) || (num5.isEmpty()) ){

            Toast.makeText(this, "field must not be empty!", Toast.LENGTH_SHORT).show();

        } else if ((Integer.parseInt(num1)<1) || (Integer.parseInt(num1)>7)){

            Toast.makeText(this, "num1 invalid!", Toast.LENGTH_SHORT).show();

        }else if ((Integer.parseInt(num2)<1) || (Integer.parseInt(num2)>7)){

            Toast.makeText(this, "num2 invalid!!", Toast.LENGTH_SHORT).show();
        }else if ((Integer.parseInt(num3)<1) || (Integer.parseInt(num3)>7)){

            Toast.makeText(this, "num3 invalid!!", Toast.LENGTH_SHORT).show();
        }else if ((Integer.parseInt(num4)<1) || (Integer.parseInt(num4)>7)){

            Toast.makeText(this, "num4 invalid!!", Toast.LENGTH_SHORT).show();
        }else if ((Integer.parseInt(num5)<1) || (Integer.parseInt(num5)>7)){

            Toast.makeText(this, "num5 invalid!!", Toast.LENGTH_SHORT).show();
        }else{
            sendValue();
        }
    }
    public void sendValue(){
        Toast.makeText(this, "Working!", Toast.LENGTH_SHORT).show();

    }
}