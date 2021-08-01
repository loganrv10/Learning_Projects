package com.example.sharepreference;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity3 extends AppCompatActivity {

    private Button mBtnContinue;
    AlertDialog.Builder builder;
    private TextView mTvFirstName1,mTvLastName1,mTvEmailAddress1,mTvPhoneNumber1, medNoOfSeats,medDateOfShow;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        intiviews();
        showData();
        ShowData();
        mBtnContinue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog alertDialog = builder.create();
                alertDialog.setTitle("Confirmed");
                alertDialog.show();
            }
        });
    }

    private void ShowData() {
        SharedPreferences sharedPreferences = getSharedPreferences("com.xyz.sharedpreferences",MODE_PRIVATE);
        String Date = sharedPreferences.getString("Date","");
        medDateOfShow.setText(Date);
        String Seat = sharedPreferences.getString("Seats","");
        medNoOfSeats.setText(Seat);

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

    private void intiviews() {
        mTvFirstName1 = findViewById(R.id.TvFirstName1);
        mTvLastName1 = findViewById(R.id.TvLastName1);
        mTvEmailAddress1 = findViewById(R.id.TvEmailAddress1);
        mTvPhoneNumber1 = findViewById(R.id.TvPhoneNumber1);
        mBtnContinue = findViewById(R.id.BtnContinue);
        medDateOfShow = findViewById(R.id.edDateOfShow);
        medNoOfSeats = findViewById(R.id.edNoOfSeats);
        builder = new AlertDialog.Builder(this);
    }
}