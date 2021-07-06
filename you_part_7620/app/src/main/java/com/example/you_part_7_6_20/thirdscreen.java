package com.example.you_part_7_6_20;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.net.URI;

public class thirdscreen extends AppCompatActivity {

    TextView tvlast1,tvlast2,tvlast3,tvlast4,mTVNoOfSeats,mTVDateOfShow;
    Button BtnConfirmDetail;
    AlertDialog.Builder builder;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thirdscreen);
        initViews();
        showDataHere();
        BtnConfirmDetail.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
            @Override
            public void onClick(View v) {
                AlertDialog alert = builder.create();
                alert.setTitle("Confirmed");
                alert.show();
            }
        });

    }


    private void showDataHere() {
        SharedPreferences sharedPreferences = getSharedPreferences("firstDir",MODE_PRIVATE);
        String firstName  = sharedPreferences.getString("firstName","");
        String lastName  = sharedPreferences.getString("lastName","");
        String emailId  = sharedPreferences.getString("emailid","");
        String phonenumber  = sharedPreferences.getString("phoneNumber","");
        String numberOfseats  = sharedPreferences.getString("NoOfSeats","");
        String date  = sharedPreferences.getString("DateOfShow","");
        tvlast1.setText(firstName);
        tvlast2.setText(lastName);
        tvlast3.setText(emailId);
        tvlast4.setText(phonenumber);
        mTVNoOfSeats.setText(numberOfseats);
        mTVDateOfShow.setText(date);
    }
    private void initViews() {
        tvlast1 = findViewById(R.id.tvlast1);
        tvlast2 = findViewById(R.id.tvlast2);
        tvlast3 = findViewById(R.id.tvlast3);
        tvlast4 = findViewById(R.id.tvlast4);
        mTVNoOfSeats = findViewById(R.id.mTVNoOfSeats);
        mTVDateOfShow = findViewById(R.id.mTVDateOfShow);
        BtnConfirmDetail = findViewById(R.id.BtnConfirmDetail);
    }
}