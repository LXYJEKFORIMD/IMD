package com.example.hellotoast;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class SayHello extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_say_hello);
        Intent intent = getIntent();
        int Number = intent.getIntExtra(MainActivity.EXTRA_NUMBER, 0);
        TextView textView = findViewById(R.id.HelloText);
        String text = textView.getText() + Integer.toString(Number);
        textView.setText(text);
    }
}