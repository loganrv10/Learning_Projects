package com.example.intentapptoapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText medText;
    private Button mbtnClick;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        medText = findViewById(R.id.edText);
        mbtnClick = findViewById(R.id.btnClick);
        mbtnClick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction( android.content.Intent.ACTION_SEND );
                intent.putExtra("username", medText.getText().toString());
                intent.setType("text/plain");
                if (intent.resolveActivity(getPackageManager()) !=null){
                    startActivity(intent);
                }else{
                    Toast.makeText(MainActivity.this,"package not found",Toast.LENGTH_SHORT).show();
                }

            }
        });
    }
}