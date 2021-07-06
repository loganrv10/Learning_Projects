package com.example.you_part_7_6_20;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private EditText medfirstname;
    private EditText medlastname;
    private EditText medEmail;
    private EditText medPhone;
    private Button mBtn_saveDetail;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button mBtn_saveDetail = findViewById(R.id.Btn_saveDetail);
        initViewsAndListeners();

        Context context = getActivity();
        SharedPreferences sharedPref = context.getSharedPreferences(
                getString(R.string.preference_file_key), Context.MODE_PRIVATE);

        }

    private Context getActivity() {
    }

    private void initViewsAndListeners() {
        medfirstname = findViewById(R.id.edfirstname);
        medlastname = findViewById(R.id.edlastname);
        medEmail = findViewById(R.id.edEmail);
        medPhone = findViewById(R.id.edPhone);
        mBtn_saveDetail = findViewById(R.id.Btn_saveDetail);
        medfirstname.setOnClickListener((View.OnClickListener) this);
        medlastname.setOnClickListener((View.OnClickListener) this);
        medEmail.setOnClickListener((View.OnClickListener) this);
        mBtn_saveDetail.setOnClickListener((View.OnClickListener) this);
        


    }
}
}
}