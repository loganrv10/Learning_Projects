package com.example.myapplicationretrofitassogn;

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

    private EditText metUserId;
    private Button mBtncallApi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        Apiservice();

    }

    private void Apiservice() {
        Intent intent = new Intent(MainActivity.this, SecondActivity.class);
        ApiService apiService = Network.getInstance().create(ApiService.class);
        int useId = Integer.parseInt(metUserId.getText().toString());
        apiService.getUser(useId).enqueue(new Callback<ResponseModel>() {
            @Override
            public void onResponse(Call<ResponseModel> call, Response<ResponseModel> response) {
                ResponseModel model = response.body();
                String name = model.getData().getName();
                String year = String.valueOf(model.getData().getYear());
                String company = model.getData().getName();
                String color = model.getData().getColor();
                intent.putExtra("firstName",name);
                intent.putExtra("year",year);
                intent.putExtra("companyName",company);
                intent.putExtra("color", color);
                startActivity(intent);


            }

            @Override
            public void onFailure(Call<ResponseModel> call, Throwable t) {
            Toast.makeText(MainActivity.this, "Data Not Send", Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void initView() {
        metUserId = findViewById(R.id.etUserId);
        mBtncallApi = findViewById(R.id.BtncallApi);
    }



}