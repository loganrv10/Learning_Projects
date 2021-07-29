package com.example.formfillapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private EditText mEdOrganisationName,mEdCustomerName,EdPhoneNo,EdEmail,EdAddress,EdTaxNumber;
    Button BtnCheck;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        BtnCheck.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                intent.putExtra("organ",mEdOrganisationName.getText().toString());
                intent.putExtra("customer",mEdCustomerName.getText().toString());
                intent.putExtra("Phone",EdPhoneNo.getText().toString());
                intent.putExtra("address",EdAddress.getText().toString());
                intent.putExtra("email",EdEmail.getText().toString());
                intent.putExtra("tax",EdTaxNumber.getText().toString());
                startActivity(intent);
            }
        });

    }

    private void initView() {
        BtnCheck = findViewById(R.id.BtnCheck);
        mEdOrganisationName = findViewById(R.id.EdOrganisationName);
        mEdCustomerName = findViewById(R.id.EdCustomerName);
        EdPhoneNo = findViewById(R.id.EdPhoneNo);
        EdAddress = findViewById(R.id.EdAddress);
        EdEmail = findViewById(R.id.EdEmail);
        EdTaxNumber = findViewById(R.id.EdTaxNumber);

    }
}