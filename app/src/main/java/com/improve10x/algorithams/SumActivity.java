package com.improve10x.algorithams;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SumActivity extends AppCompatActivity {
    EditText number1Txt;
    EditText number2Txt;
    Button sumBtn;
    TextView resultTxt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sum);
        inintViews();
    }

    private void inintViews() {
        number1Txt = findViewById(R.id.number1_txt);
        number2Txt = findViewById(R.id.number2_txt);
        sumBtn = findViewById(R.id.sum_btn);
        resultTxt = findViewById(R.id.result_txt);
    }

}