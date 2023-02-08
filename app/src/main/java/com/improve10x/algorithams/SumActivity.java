package com.improve10x.algorithams;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.SeekBar;
import android.widget.TextView;

public class SumActivity extends AppCompatActivity {
    SeekBar seekbarOneSb;
    SeekBar seekbarTwoSb;
    Button sumBtn;
    TextView resultTxt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sum);
        initViews();
        handleSumBtn();
    }

    @Override
    protected void onPause() {
        super.onPause();
        seekbarOneSb.setProgress(0);
        seekbarTwoSb.setProgress(0);
        resultTxt.setText("");
    }

    private void initViews() {
        seekbarOneSb = findViewById(R.id.seekbar_one_sb);
        seekbarTwoSb = findViewById(R.id.seekbar_two_sb);
        sumBtn = findViewById(R.id.sum_btn);
        resultTxt = findViewById(R.id.result_txt);
    }

    private void handleSumBtn() {
        sumBtn.setOnClickListener(v -> {
            int progressOne = seekbarOneSb.getProgress();
            int progressTwo = seekbarTwoSb.getProgress();
            String progress = sumIsLessThan100(progressOne, progressTwo);
            resultTxt.setText(progress);
        });

    }

    private String sumIsLessThan100(int progressOne, int progressTwo) {
        boolean result = false;
        if (progressOne + progressTwo < 100) {
            result = true;
        }
        return result + " ";
    }


}