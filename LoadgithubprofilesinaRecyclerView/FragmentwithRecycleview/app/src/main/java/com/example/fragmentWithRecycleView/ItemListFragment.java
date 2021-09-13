package com.example.fragmentWithRecycleView;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.Display;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


public class ItemListFragment extends Fragment implements ItemClickListener{

     List<ResponseModel> responseList = new ArrayList<>();
     RecyclerView recyclerView;
    private NavController navcontroller;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_item_list, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initview(view);
        navcontroller = Navigation.findNavController(view);
    }

    private void initview(View view) {
        recyclerView = view.findViewById(R.id.recycleView);
       ApiService apiService = Network.getRetrofitInstance().create(ApiService.class);
       Call<List<ResponseModel>> call = apiService.getData();
       call.enqueue(new Callback<List<ResponseModel>>() {
           @Override
           public void onResponse(Call<List<ResponseModel>> call, Response<List<ResponseModel>> response) {
               if (response.code() == HttpURLConnection.HTTP_OK){
                   responseList = response.body();
                   DisplayData();
               }
           }

           @Override
           public void onFailure(Call<List<ResponseModel>> call, Throwable t) {

           }
       });


       }

    private void DisplayData() {
        MyAdapter myAdapter = new MyAdapter(responseList,this);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        recyclerView.setAdapter(myAdapter);
        recyclerView.setLayoutManager(linearLayoutManager);

    }

    @Override
    public void onClickListener(ResponseModel responseModel) {

        navcontroller.navigate(R.id.action_itemListFragment_to_itemDetailFragment2);
        Bundle bundle = new Bundle();

    }

}


