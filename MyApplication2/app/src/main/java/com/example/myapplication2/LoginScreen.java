package com.example.myapplication2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginScreen extends AppCompatActivity {
    private  EditText mEditMAil,mEditPass;
    Button mBtnSave;
    private String emailValidation = "[a-zA-Z0-9._-]+@[a-z]+\\.+[a-z]+";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_receive);
        initView();
        mBtnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (isvalidateMAil() && isvalidatePassword()) {
                    Intent intent1 = new Intent(LoginScreen.this, MainActivity3.class);
                    intent1.putExtra("Email", mEditMAil.getText().toString());
                    intent1.putExtra("password", mEditPass.getText().toString());
                    startActivity(intent1);
                }
            }
        });


    }

    private boolean isvalidatePassword() {
        if (mEditMAil.getText().toString().matches(emailValidation)){
            return true;
        }else{
            mEditMAil.setError("Incorrect Email");
            return false;
        }
    }

    private boolean isvalidateMAil() {
        if (mEditPass.getText().toString().length()>5){
            return true;
        }else{
            mEditPass.setError("Wrong password");
            return false;
        }
    }

    private void initView() {
        mEditMAil = findViewById(R.id.EvEmail);
        mEditPass = findViewById(R.id.EvPassword);
        mBtnSave = findViewById(R.id.BtnSave);
    }
}