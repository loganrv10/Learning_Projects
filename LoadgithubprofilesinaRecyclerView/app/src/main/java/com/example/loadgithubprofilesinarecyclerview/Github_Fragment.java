package com.example.loadgithubprofilesinarecyclerview;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


public class Github_Fragment extends Fragment {
    private RecyclerView recyclerView;
    private EditText mText;
    private Button mSearch;
    List<ResponseDTO> responseList ;
    GithubAdapter githubAdapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_github, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initView(view);
    }

    private void initView(View view) {
        recyclerView = view.findViewById(R.id.recycleView);
        mText = view.findViewById(R.id.EnterId);
        mSearch = view.findViewById(R.id.btnSearch);
        mSearch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               ApiCall();
            }
        });
    }

    private void ApiCall() {
        ApiService apiService=Network.getRetrofitInstance().create(ApiService.class);

        String user=(mText.getText().toString());
        apiService.getData(user).enqueue(new Callback<List<ResponseDTO>>() {
            @Override
            public void onResponse(Call<List<ResponseDTO>> call, Response<List<ResponseDTO>> response) {
                if (response.body()!=null){
                    responseList=response.body();
                    DisplayData();
                }
            }

            @Override
            public void onFailure(Call<List<ResponseDTO>> call, Throwable t) {

            }
        });

    }



    private void DisplayData() {
        GithubAdapter githubAdapter = new GithubAdapter(responseList);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        recyclerView.setAdapter(githubAdapter);
        recyclerView.setLayoutManager(linearLayoutManager);
    }
}