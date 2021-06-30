package com.example.wepart30_6;

import android.content.Intent;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class HomeActivity extends AppCompatActivity {
    private TextView mTvUserName;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        mTvUserName = findViewById(R.id.tvUserName);
        Intent intent = getIntent();
        String userName = intent.getStringExtra("username");
        mTvUserName.setText(userName);
    }
}