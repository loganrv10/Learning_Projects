package com.example.practicepower;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import java.text.BreakIterator;

public class MainActivity2 extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        if (getIntent() != null) {
            String name = getIntent().getStringExtra("key");
            String action = getIntent().getAction();

        }

    }
 }



