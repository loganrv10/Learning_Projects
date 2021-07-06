package com.example.you_part_7_6_20;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SecondScreen extends AppCompatActivity {
    TextView tv1, tv2, tv3, tv4;
    EditText mEtDateOfShow, mEtNoOfSeats;
    Button mBtnBook;
    private static final String SHARED_PREFERENCE_KEY = "FirstDir";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_screen);
        initViews();
        showData();
        mBtnBook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String seats = mEtNoOfSeats.getText().toString();
                String date = mEtDateOfShow.getText().toString();
                SharedPreferences sharedPreferences = getSharedPreferences(SHARED_PREFERENCE_KEY, MODE_PRIVATE);
                SharedPreferences.Editor editor = sharedPreferences.edit();
                editor.putString("NoOfSeats", seats);
                editor.putString("DateOfShow", date);
                editor.apply();
                Intent intent = new Intent(SecondScreen.this, thirdscreen.class);
                startActivity(intent);
            }
        });
    }

    private void initViews() {
        tv1 = findViewById(R.id.tv1);
        tv2 = findViewById(R.id.tv2);
        tv3 = findViewById(R.id.tv3);
        mEtNoOfSeats = findViewById(R.id.mEtNoOfSeats);
        mEtDateOfShow = findViewById(R.id.mEtDateOfShow);
        mBtnBook = findViewById(R.id.mBtnBook);
    }

    private void showData() {
        SharedPreferences sharedPreferences = getSharedPreferences("firstDir", MODE_PRIVATE);
        String firstName = sharedPreferences.getString("firstName", "");
        String lastName = sharedPreferences.getString("lastName", "");
        String emailId = sharedPreferences.getString("emailid", "");
        tv1.setText(firstName);
        tv2.setText(lastName);
        tv3.setText(emailId);

    }
}