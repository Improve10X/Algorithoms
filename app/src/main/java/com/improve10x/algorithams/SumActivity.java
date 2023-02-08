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

    private void initViews() {
        seekbarOneSb = findViewById(R.id.seekbar_one_sb);
        seekbarTwoSb = findViewById(R.id.seekbar_two_sb);
        sumBtn = findViewById(R.id.sum_btn);
        resultTxt = findViewById(R.id.result_txt);
    }

    private void handleSumBtn() {
        sumBtn.setOnClickListener(view -> {
            int progress1 = seekbarTwoSb.getProgress();
            int progress2 = seekbarOneSb.getProgress();
            boolean progress = sumIsLessthan100(progress1, progress2);
            resultTxt.setText(progress);
        });
    }

    private boolean sumIsLessthan100(int progres1, int progress2) {
        boolean result = false;
        if (progres1 + progress2 < 100) {
            result = true;
        }
        return result;
    }
}