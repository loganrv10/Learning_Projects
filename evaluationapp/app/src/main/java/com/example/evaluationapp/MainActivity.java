package com.example.evaluationapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
     private Button msigninhome;
     private Button mcreateaccounthome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button msigninhome = findViewById(R.id.signinhome);

        msigninhome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SignInActivity.class);
                intent.setAction("ABC");
                startActivity(intent);
            }
        });
        Button mcreateaccounthome = findViewById(R.id.createaccounthome);
        mcreateaccounthome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SignUpActivity.class);
                intent.setAction("ABC");
                startActivity(intent);
            }
        });
    }
}