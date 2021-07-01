package com.example.assignment_2_30_6;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity3 extends AppCompatActivity {

    private TextView metvText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        metvText = findViewById(R.id.etvText);
        if (getIntent() != null) {
            String name = getIntent().getStringExtra("abc");
            metvText.setText(name);
        }
    }
}