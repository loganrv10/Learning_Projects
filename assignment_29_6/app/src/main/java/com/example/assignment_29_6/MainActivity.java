package com.example.assignment_29_6;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    private TextView mtvEnter;
    private EditText metMessage;
    private Button mbtClickhere;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       metMessage = findViewById(R.id.etMessage);
       metMessage.addTextChangedListener(new TextWatcher() {
           @Override
           public void beforeTextChanged(CharSequence s, int start, int count, int after) {
               Log.d("Subham","Charactherbeforechange" + s.toString());
           }

           @Override
           public void onTextChanged(CharSequence s, int start, int before, int count) {
               Log.d("Subham","Charactheronchange" + s.toString());
           }

           @Override
           public void afterTextChanged(Editable s) {
               Log.d("Subham","Charactherafterchange" + s.toString());
               if(s.toString().length()>=6){
                   Toast.makeText(MainActivity.this,s.toString(),Toast.LENGTH_SHORT).show();
               }
           }
       });


    }
}