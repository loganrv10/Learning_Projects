package com.example.myapplication2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity3 extends AppCompatActivity {

    private TextView mEmail, mPassword;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        mEmail = findViewById(R.id.Email);
        mPassword = findViewById(R.id.Password);

        Intent intent = getIntent();
        String userName = intent.getStringExtra("Email");
        String passcode = intent.getStringExtra("password");
        mEmail.setText(userName);
        mPassword.setText(passcode);
    }

}