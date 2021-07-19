package com.example.app1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    private EditText mEtUserId;
    private Button mBtnGetData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {
        mEtUserId = findViewById(R.id.etUserId);
        mBtnGetData = findViewById(R.id.btnGetData);
        mBtnGetData.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                callApi();
            }
        });
    }

    private void callApi() {
        Intent intent = new Intent(MainActivity.this, SecondActivity.class);

        ApiService apiService = Network.getRetrofitInstance().create(ApiService.class);
        int userId = Integer.parseInt(mEtUserId.getText().toString());
        apiService.getPost(userId).enqueue(new Callback<ResponseDTO>() {
            @Override
            public void onResponse(Call<ResponseDTO> call, Response<ResponseDTO> response) {
                

            }

            @Override
            public void onFailure(Call<ResponseDTO> call, Throwable t) {
                Toast.makeText(MainActivity.this, "Data Not Send", Toast.LENGTH_SHORT).show();
            }
            });
        }

}
