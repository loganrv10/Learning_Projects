package com.example.myapplicationevaluation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

public class LoginScreen<emailValidation> extends AppCompatActivity {

    EditText medEmail, medPassword;
    Button mBtnLogin;
    CheckBox mtvcheckBox;
    private final String emailValidation = "[a-zA-Z0-9._-]+@[a-z]+\\.+[a-z]+";

    private static final String SHARED_PREFEREBCE_KEY = "FirstDir";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
        mBtnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (mtvcheckBox.isChecked()){
                    String email = medEmail.getText().toString();
                    SharedPreferences sharedPreferences = getSharedPreferences(SHARED_PREFEREBCE_KEY, MODE_PRIVATE);
                    SharedPreferences.Editor editor = sharedPreferences.edit();
                    editor.putString("email",email);
                    editor.apply();
                }else{
                    Toast.makeText(LoginScreen.this,"error",Toast.LENGTH_SHORT).show();
                }
            }

            });
        mBtnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (isEmailValid() && isPasswordValid()){
                    Intent intent = new Intent(LoginScreen.this, HomeScreen.class);
                    intent.putExtra("key",medEmail.getText().toString());
                    startActivity(intent);
                }
            }
        });
    }

    private void initViews() {
        medEmail = findViewById(R.id.edEmail);
        mBtnLogin = findViewById(R.id.BtnLogin);
        medPassword = findViewById(R.id.edPassword);
        mtvcheckBox = findViewById(R.id.tvcheckbox);
    }



    private boolean isEmailValid() {
        if (medEmail.getText().toString().length() >= 1 && medEmail.getText().toString().matches(emailValidation)) {
            return true;
        } else {
            medEmail.setError("Invalid emil");
            return false;
        }
    }

    private boolean isPasswordValid() {
        if (medPassword.getText().toString().length() >= 6) {
            return true;
        } else {
            medPassword.setError("Password is very Short");
            return false;
        }
    }


}