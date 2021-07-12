package com.example.app2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        if(getIntent() != null && getIntent().getExtras() !=null){
            String data = getIntent().getStringExtra("username");
            Toast.makeText(MainActivity2.this," " + data, Toast.LENGTH_SHORT).show();
        }
    }
 }
