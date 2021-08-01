package com.example.sharepreference;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText mTvFirstName,mTvLastName,mTvEmailAddress,mTvPhoneNumber;
    private Button mBtnSaveData;
    private static final String SHARED_PREFERENCE_KEY = "com.xyz.sharedpreferences";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        mBtnSaveData.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String firstname = mTvFirstName.getText().toString();
                String lastname = mTvLastName.getText().toString();
                String Email = mTvEmailAddress.getText().toString();
                String phone = mTvPhoneNumber.getText().toString();


                //using shared preference
                SharedPreferences sharedPreferences = getSharedPreferences(SHARED_PREFERENCE_KEY,MODE_PRIVATE);
                SharedPreferences.Editor editor = sharedPreferences.edit();
                editor.putString("firstName",firstname);
                editor.putString("lastName",lastname);
                editor.putString("emailId",Email);
                editor.putString("phoneNumber",phone);
                editor.apply();

                Intent intent = new Intent(MainActivity.this,MainActivity2.class);
                startActivity(intent);
            }
        });
    }

    private void initView() {
        mTvFirstName = findViewById(R.id.TvFirstName);
        mTvLastName = findViewById(R.id.TvLastName);
        mTvEmailAddress = findViewById(R.id.TvEmailAddress);
        mTvPhoneNumber = findViewById(R.id.TvPhoneNumber);
        mBtnSaveData = findViewById(R.id.BtnSaveData);
    }
}