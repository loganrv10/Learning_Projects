package com.example.intentapp1;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText mEditText1;
    private Button Btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mEditText1 = findViewById(R.id.EditView1);
        Btn = findViewById(R.id.BtnSave);
        Btn.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("QueryPermissionsNeeded")
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent();
                intent1.setAction(android.content.Intent.ACTION_SEND );
                intent1.putExtra("name",mEditText1.getText().toString());
                startActivity(intent1);

                if (intent1.resolveActivity(getPackageManager()) != null){
                    startActivity(intent1);
                }else{
                    Toast.makeText(MainActivity.this,"Not found", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}