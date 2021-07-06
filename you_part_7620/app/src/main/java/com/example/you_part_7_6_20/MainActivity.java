package com.example.you_part_7_6_20;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity{
    EditText medfirstname,medlastname,medEmail,medPhone;
    Button mBtn_saveDetail;
    private static final String SHARED_PREFERENCE_KEY = "FirstDir";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button mBtn_saveDetail = findViewById(R.id.Btn_saveDetail);
        initViews();
        mBtn_saveDetail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String firstName = medfirstname.getText().toString().trim();
                String lastName = medlastname.getText().toString();
                String emailId = medEmail.getText().toString();
                String phoneNumber = medPhone.getText().toString();

//                using shared preference share
                SharedPreferences sharedPreferences = getSharedPreferences(SHARED_PREFERENCE_KEY, MODE_PRIVATE);
                SharedPreferences.Editor editor = sharedPreferences.edit();
                editor.putString("firstName", firstName);
                editor.putString("lastName", lastName);
                editor.putString("emailid", emailId);
                editor.putString("phoneNumber", phoneNumber);
                editor.apply();

//                using Intent
                Intent intent = new Intent(MainActivity.this, SecondScreen.class);
                startActivity(intent);
            }
        });
}
    private void initViews() {
        medfirstname = findViewById(R.id.edfirstname);
        medlastname = findViewById(R.id.edlastname);
        medEmail = findViewById(R.id.edEmail);
        medPhone = findViewById(R.id.edPhone);
       mBtn_saveDetail = findViewById(R.id.Btn_saveDetail);
    }

}


