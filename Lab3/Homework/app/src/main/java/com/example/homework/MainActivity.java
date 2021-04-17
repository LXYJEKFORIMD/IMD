package com.example.homework;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private int num = 0;
    private TextView CountNum;
    private Button CountButton;
    private Button ZeroButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        CountNum = findViewById(R.id.CountNum);
        CountButton = findViewById(R.id.CountButton);
        ZeroButton = findViewById(R.id.ZeroButton);
        CountButton.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor("#FA436A")));
    }

    public void showToast(View view) {
        Toast toast = Toast.makeText(this, R.string.toast_message, Toast.LENGTH_SHORT);
        toast.show();
    }

    public void setZero(View view) {
        num = 0;
        if (CountNum != null) {
            CountNum.setText(Integer.toString(num));
        }
        if (ZeroButton != null) {
            ZeroButton.setEnabled(false);
        }
        if (CountButton != null) {
            CountButton.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor("#FA436A")));
        }
    }

    public void countUp(View view) {
        num++;
        if (CountNum != null) {
            CountNum.setText(Integer.toString(num));
        }
        if (ZeroButton != null) {
            ZeroButton.setEnabled(true);
        }
        if (CountButton != null) {
            if(num % 2 == 1) {
                CountButton.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor("#0071E3")));
            } else {
                CountButton.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor("#FA436A")));
            }
        }
    }
}