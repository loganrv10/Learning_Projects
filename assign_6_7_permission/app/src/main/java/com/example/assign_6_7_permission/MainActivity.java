package com.example.assign_6_7_permission;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import android.Manifest;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private static final int REQUEST_CODE = 0;
    private Button mbtncamera;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mbtncamera = findViewById(R.id.btncamera);
        mbtncamera.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String[] permission ={Manifest.permission.CAMERA,Manifest.permission.CAMERA};
                ActivityCompat.requestPermissions(MainActivity.this,permission,REQUEST_CODE);
            }
        });
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull @org.jetbrains.annotations.NotNull String[] permissions, @NonNull @org.jetbrains.annotations.NotNull int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        if (grantResults[0] == PackageManager.PERMISSION_GRANTED ) {
            showToast("Permission Granted");
        }else if(grantResults[0] == PackageManager.PERMISSION_DENIED){
            showToast("Permission Denied");
        }

    }
    private void showToast(String message) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }

}