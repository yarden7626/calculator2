package com.example.calculator1;

import static com.example.calculator1.R.id.multey;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import java.text.MessageFormat;

public class MainActivity extends AppCompatActivity {

    Button button0, button1, button2, button3, button4, button5, button6,
            button7, button8, button9, buttonAdd, buttonSub, buttonDivision,
            buttonMul, button10, buttonC, buttonEqual;
    EditText crunchifyEditText;
    float mValueOne, mValueTwo;
    boolean crunchifyAddition, mSubtract, crunchifyMultiplication, crunchifyDivision;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button0 = findViewById(R.id.zero);
        button1 =findViewById(R.id.one);
        button2 =  findViewById(R.id.two);
        button3 = findViewById(R.id.three);
        button4 =  findViewById(R.id.four);
        button5 = findViewById(R.id.five);
        button6 =  findViewById(R.id.six);
        button7 = findViewById(R.id.seven);
        button8 =  findViewById(R.id.eight);
        button9 = findViewById(R.id.nine);
        buttonAdd =  findViewById(R.id.plus);
        buttonSub =  findViewById(R.id.minus);
        buttonMul=   findViewById(R.id.multey);
        buttonDivision = findViewById(R.id.division);
        buttonC = findViewById(R.id.Clear);
        buttonEqual = findViewById(R.id.equal);
        crunchifyEditText =  findViewById(R.id.answer);

        button1.setOnClickListener (new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                crunchifyEditText.setText(MessageFormat.format("{0}1", crunchifyEditText.getText()));
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                crunchifyEditText.setText(MessageFormat.format("{0}2", crunchifyEditText.getText()));
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                crunchifyEditText.setText(MessageFormat.format("{0}3", crunchifyEditText.getText()));
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                crunchifyEditText.setText(MessageFormat.format("{0}4", crunchifyEditText.getText()));
            }
        });
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                crunchifyEditText.setText(MessageFormat.format("{0}5", crunchifyEditText.getText()));
            }
        });
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                crunchifyEditText.setText(MessageFormat.format("{0}6", crunchifyEditText.getText()));
            }
        });
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                crunchifyEditText.setText(MessageFormat.format("{0}7", crunchifyEditText.getText()));
            }
        });
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                crunchifyEditText.setText(new StringBuilder().append(crunchifyEditText.getText()).append("8").toString());
            }
        });
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                crunchifyEditText.setText(new StringBuilder().append(crunchifyEditText.getText()).append("9").toString());
            }
        });
        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                crunchifyEditText.setText(MessageFormat.format("{0}0", crunchifyEditText.getText()));
            }
        });
        buttonAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (crunchifyEditText == null) {
                    crunchifyEditText.setText("");
                } else {
                    mValueOne = Float.parseFloat(crunchifyEditText.getText() + getString(R.string.n));
                    crunchifyAddition = true;
                    crunchifyEditText.setText(null);
                }
            }
        });
        buttonSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mValueOne = Float.parseFloat(new StringBuilder().append(crunchifyEditText.getText()).append("").toString());
                mSubtract = true;
                crunchifyEditText.setText(null);
            }
        });
        buttonMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mValueOne = Float.parseFloat(MessageFormat.format("{0}", crunchifyEditText.getText()));
                crunchifyMultiplication = true;
                crunchifyEditText.setText(null);
            }
        });
        buttonDivision.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mValueOne = Float.parseFloat(MessageFormat.format("{0}", crunchifyEditText.getText()));
                crunchifyDivision = true;
                crunchifyEditText.setText(null);
            }
        });
        buttonEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mValueTwo = Float.parseFloat(crunchifyEditText.getText().append(new StringBuilder()).append("").toString());
                if ((crunchifyAddition)) {
                    crunchifyEditText.setText(MessageFormat.format("{0}", mValueOne + mValueTwo));
                    crunchifyAddition = false;
                }
                if (mSubtract) {
                    crunchifyEditText.setText(String.format("%s", mValueOne - mValueTwo));
                    mSubtract = false;
                }
                if (crunchifyMultiplication) {
                    crunchifyEditText.setText(mValueOne * mValueTwo + "");
                    crunchifyMultiplication = false;
                }
                if (crunchifyDivision) {
                    crunchifyEditText.setText(new StringBuilder().append(mValueOne / mValueTwo).append("").toString());
                    crunchifyDivision = false;
                }
            }
        });
        buttonC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                crunchifyEditText.setText("");
            }
        });
        button10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                crunchifyEditText.setText(crunchifyEditText.getText().append(new StringBuilder()).append(".").toString());
            }
        });
    }
}