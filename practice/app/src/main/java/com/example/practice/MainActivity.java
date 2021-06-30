package com.example.practice;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity{

private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.tvText);
        Log.d("Subh", "on create");


    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("Subh","on start");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("Subh","on restart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("Subh","on resume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        textView.setText("hey screen rotated");
        Log.d("Subh","on Pause");
    }

    @Override
    protected void onRestoreInstanceState(@NonNull Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        Log.d("Subh","ON RESTORE");
        String data = savedInstanceState.getString("data");
        textView.setText(data);
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("Subh","on Stop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("Subh","on Destroy");
    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        Log.d("Subh", "on save instance");
        outState.putString("data","Hey screen rotated");
    }
}

