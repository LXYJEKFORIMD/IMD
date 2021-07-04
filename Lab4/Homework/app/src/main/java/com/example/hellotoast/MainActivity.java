package com.example.hellotoast;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private int num = 0;
    private TextView countNum;
    public static final String EXTRA_NUMBER =
            "com.example.android.homework.extra.NUMBER";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        countNum = findViewById(R.id.CountNum);
    }

    public void sayHello(View view) {
        Intent intent = new Intent(this, SayHello.class);
        intent.putExtra(EXTRA_NUMBER, num);
        startActivity(intent);
    }

    public void countUp(View view) {
        num++;
        if (countNum != null) {
            countNum.setText(Integer.toString(num));
        }
    }
}