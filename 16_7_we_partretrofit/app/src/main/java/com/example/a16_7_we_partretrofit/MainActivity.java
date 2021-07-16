package com.example.a16_7_we_partretrofit;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    private EditText metPostId;
    private Button mBtnFetch;
    private RecyclerView recyclerView;
    private List<ResponseModel>responseModels;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();

    }
    private void setRecycleView() {
       PostAdapter postAdapter = new PostAdapter(responseModels);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(postAdapter);
    }

    private void callApi() {
        Apiservice apiservice = Network.getInstance().create(Apiservice.class);
        int postId = Integer.parseInt(metPostId.getText().toString());
        apiservice.getPosts(postId).enqueue(new Callback<List<ResponseModel>>() {
            @Override
            public void onResponse(Call<List<ResponseModel>> call, Response<List<ResponseModel>> response) {
                if (response.body()!= null){
                    responseModels = response.body();
                    setRecycleView();
                }
            }



            @Override
            public void onFailure(Call<List<ResponseModel>> call, Throwable t) {

            }
        });
    }


    private void initView() {
        metPostId = findViewById(R.id.etPostId);
        mBtnFetch = findViewById(R.id.btnFetch);
        recyclerView = findViewById(R.id.recyclerView);
        mBtnFetch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                callApi();
            }


        });
    }
}


