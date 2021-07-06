package com.example.evaluationapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class SignUpActivity extends AppCompatActivity {

   private EditText metPersonName;
   private EditText metEmailAddress;
   private EditText metPassword;
   private Button buttonsignup;
   priva

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        getIntent().getStringExtra("key1");
        String action = getIntent().getAction();
    }
}