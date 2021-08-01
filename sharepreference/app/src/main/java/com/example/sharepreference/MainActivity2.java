package com.example.sharepreference;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    private TextView mTvFirstName1,mTvLastName1,mTvEmailAddress1,mTvPhoneNumber1;
    private Button mBtnSaveData1;
    private EditText medNoOfSeats,medDateOfShow;

    private static final String Second_key = "com.xyz.sharedpreferences";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        initView();
        showData();
        mBtnSaveData1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String Date = medDateOfShow.getText().toString();
                String Seats = medNoOfSeats.getText().toString();


                SharedPreferences sharedPreferences = getSharedPreferences(Second_key,MODE_PRIVATE);
                SharedPreferences.Editor editor = sharedPreferences.edit();
                editor.putString("Date",Date);
                editor.putString("Seats", Seats);
                editor.apply();

                Intent intent = new Intent(MainActivity2.this,MainActivity3.class);
                startActivity(intent);
            }
        });
    }

    private void showData() {
     SharedPreferences sharedPreferences= getSharedPreferences("com.xyz.sharedpreferences",MODE_PRIVATE);
     String FirstName = sharedPreferences.getString("firstName","");
      mTvFirstName1.setText(FirstName);
     String LastName = sharedPreferences.getString("lastName","");
     mTvLastName1.setText(LastName);
     String emailadd = sharedPreferences.getString("emailId","");
     mTvEmailAddress1.setText(emailadd);
     String phoneno = sharedPreferences.getString("phoneNumber","");
     mTvPhoneNumber1.setText(phoneno);
    }

    private void initView() {
        mTvFirstName1 = findViewById(R.id.TvFirstName1);
        mTvLastName1 = findViewById(R.id.TvLastName1);
        mTvEmailAddress1 = findViewById(R.id.TvEmailAddress1);
        mTvPhoneNumber1 = findViewById(R.id.TvPhoneNumber1);
        mBtnSaveData1 = findViewById(R.id.BtnSaveData1);
        medDateOfShow = findViewById(R.id.edDateOfShow);
        medNoOfSeats = findViewById(R.id.edNoOfSeats);
    }
}