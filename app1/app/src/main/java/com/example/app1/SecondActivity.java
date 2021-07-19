package com.example.app1;

import android.annotation.SuppressLint;
import android.app.AppComponentFactory;
import android.graphics.Color;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {
    private TextView mTvName;
    private TextView mTvYear;
    private TextView mTvCompany;
    private LinearLayout linearLayout;

    @Override
    protected void onCreate(@Nullable  Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        initView();
        if (getIntent() != null){
            String firstName = getIntent().getStringExtra("firstMame");
            String year = getIntent().getStringExtra("year");
            String companyName = getIntent().getStringExtra("companyName");

            mTvName.setText(firstName);
            mTvYear.setText(year);
            mTvCompany.setText(companyName);

        }
    }

    private void initView() {
        mTvCompany = findViewById(R.id.tvCompany);
        mTvYear = findViewById(R.id.tvYear);
        mTvName = findViewById(R.id.tvName);
        linearLayout = findViewById(R.id.linearLayout);
    }
}
