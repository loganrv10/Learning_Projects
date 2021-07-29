package com.example.formfillapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    private TextView mEdOrganisationName1,mEdCustomerName1,EdPhoneNo1,EdEmail1,EdAddress1,EdTaxNumber1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        initView();
        Intent intent = getIntent();
        String orNAme = intent.getStringExtra("organ");
        mEdOrganisationName1.setText(orNAme);
        String customerName = intent.getStringExtra("customer");
        mEdCustomerName1.setText(customerName);
        String phnum = intent.getStringExtra("Phone");
        EdPhoneNo1.setText(phnum);
        String Email = intent.getStringExtra("email");
        EdEmail1.setText(Email);
        String add = intent.getStringExtra("address");
        EdAddress1.setText(add);
        String taxation = intent.getStringExtra("tax");
        EdTaxNumber1.setText(taxation);

    }

    private void initView() {
        mEdOrganisationName1 = findViewById(R.id.EdOrganisationName1);
        mEdCustomerName1 = findViewById(R.id.EdCustomerName1);
        EdPhoneNo1 = findViewById(R.id.EdPhoneNo1);
        EdAddress1 = findViewById(R.id.EdAddress1);
        EdEmail1 = findViewById(R.id.EdEmail1);
        EdTaxNumber1 = findViewById(R.id.EdTaxNumber1);
    }
}