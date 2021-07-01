package com.example.assignment_2_30_6;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import static android.widget.Toast.makeText;

public class Login_Screen extends AppCompatActivity {
    EditText meTvemail;
    EditText meTPassword;
    Button meTBtn;


    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_screen);
        meTvemail = findViewById(R.id.eTvemail);
        meTPassword = findViewById(R.id.eTPassword);
        meTBtn = findViewById(R.id.eTBtn);
        meTBtn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                if (isEmailValid()) {
                    Intent intent = new Intent(Login_Screen.this, MainActivity3.class);
                    intent.putExtra("abc", meTvemail.getText().toString());
                    startActivity(intent);
                }
            }
        });
    }
    private boolean isEmailValid() {
        String mismatches = "[a-zA-Z0-9._-]+@[a-z]+\\.+[a-z]+";
        if (meTvemail.getText().toString().length() >= 1 && meTvemail.getText().toString().matches(mismatches)) {
            return true;
        } else {
            meTvemail.setError("Invalid emil");
            return false;
        }
    }
}
