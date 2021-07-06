package com.example.you_part_7_6_20;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class SecondScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_screen);
        String name = getIntent().getStringExtra("key");
        String action = getIntent().getAction();

    }
}