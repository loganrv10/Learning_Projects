package com.example.sendmailintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button mGmail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mGmail = findViewById(R.id.Gmail);
        mGmail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent sendIntent = new Intent();
                sendIntent.setAction(Intent.ACTION_SEND);
                sendIntent.putExtra(Intent.EXTRA_TEXT, "Data");
                sendIntent.putExtra(Intent.EXTRA_EMAIL, new String[]{"foo@bar.com"});
                sendIntent.putExtra(Intent.EXTRA_SUBJECT, "Testing subject");
                sendIntent.putExtra(Intent.EXTRA_CC, new String[]{"lloyd@masaiSchool.com"});
                sendIntent.setType("message/rfc822");
                startActivity(sendIntent);
            }
        });
    }
}