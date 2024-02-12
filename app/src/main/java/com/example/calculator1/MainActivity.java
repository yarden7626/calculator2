package com.example.calculator1;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    Button buttonZero, buttonOne, buttonTwo, buttonThree, buttonFour, buttonFive,
            buttonSix, buttonSeven, buttonEight, buttonNine, buttonAdd, buttonSubtract,
            buttonMultiply, buttonDivide, buttonEqual, buttonClear, buttonChangeSign,
            buttonDelete, buttonPoint;
    TextView textViewAnswer;

    float mValueOne, mValueTwo;
    boolean addition, subtract;
    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        buttonZero = findViewById(R.id.zero);
        buttonOne = findViewById(R.id.one);
        buttonTwo = findViewById(R.id.two);
        buttonThree = findViewById(R.id.three);
        buttonFour = findViewById(R.id.four);
        buttonFive = findViewById(R.id.five);
        buttonSix = findViewById(R.id.six);
        buttonSeven = findViewById(R.id.seven);
        buttonEight = findViewById(R.id.eight);
        buttonNine = findViewById(R.id.nine);
        buttonAdd = findViewById(R.id.plus);
        buttonSubtract = findViewById(R.id.minus);
        buttonMultiply = findViewById(R.id.multiply);
        buttonDivide = findViewById(R.id.division);
        buttonEqual = findViewById(R.id.equal);
        buttonClear=findViewById(R.id.Clear);
        buttonChangeSign = findViewById(R.id.ChangeSign);
        buttonDelete = findViewById(R.id.delete);
        buttonPoint = findViewById(R.id.point);
        textViewAnswer = findViewById(R.id.answer);
        // מאזין לכפתורים
        buttonOne.setOnClickListener(v -> textViewAnswer.setText(textViewAnswer.getText() + "1"));
        buttonTwo.setOnClickListener(v -> textViewAnswer.setText(textViewAnswer.getText() + "2"));


        // מאזין לכפתור חיבור
        buttonAdd.setOnClickListener(v -> {
            if (v == textViewAnswer) {
                textViewAnswer.setText("v");
            } else {
                mValueOne = Float.parseFloat(String.valueOf(textViewAnswer.getText()));
                addition = true;
                textViewAnswer.setText(null);
            }
        });
        // מאזין לכפתור חיסור
        buttonSubtract.setOnClickListener(v -> {
            if (textViewAnswer == v) {
                textViewAnswer.setText("v");
            } else {
                mValueOne = Float.parseFloat(String.valueOf(textViewAnswer.getText()));
                subtract = true;
                textViewAnswer.setText(null);
            }
        });

        // מאזין לכפתור השוויון
        buttonEqual.setOnClickListener(v -> {
            mValueTwo = Float.parseFloat(String.valueOf(textViewAnswer.getText()));
            if (addition) {
                textViewAnswer.setText(String.valueOf(mValueOne + mValueTwo));
                addition = false;
            }

        });

        // מאזין לכפתור נקה
        buttonClear.setOnClickListener(v -> textViewAnswer.setText(""));
    }
}