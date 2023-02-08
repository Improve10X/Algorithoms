package com.improve10x.algorithams;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class DivisibleActivity extends AppCompatActivity {
    EditText numberTxt;
    Button divisibleBtn;
    TextView remainderTxt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_divisible);
        handleInitViews();
        handleDivisibleBtn();
    }

    @Override
    protected void onPause() {
        super.onPause();
        numberTxt.setText("");
        remainderTxt.setText("");
    }

    private void handleDivisibleBtn() {
        divisibleBtn.setOnClickListener(v -> {
            String number = numberTxt.getText().toString();
            String division = divisibleByFive(number);
            remainderTxt.setText(division);
        });
    }

    private String divisibleByFive(String number) {
        int a = Integer.parseInt(number);
        boolean result = false;
        if (a % 5 == 0){
            result = true;
        }
        return result + "";
    }

    private void handleInitViews() {
        numberTxt = findViewById(R.id.number_txt);
        divisibleBtn = findViewById(R.id.divisible_btn);
        remainderTxt = findViewById(R.id.remainder_txt);
    }
}