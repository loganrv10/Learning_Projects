package com.example.a16_7_we_partretrofit;


import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;

import androidx.recyclerview.widget.RecyclerView;


import java.util.List;

public class PostAdapter extends RecyclerView.Adapter<PostViewHolder> {
     private List<ResponseModel>responseList;

    public PostAdapter(List<ResponseModel> responseList) {
        this.responseList = responseList;
    }

    @NonNull
    @Override
    public PostViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_layout,parent,false);
        return new PostViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull  PostViewHolder holder, int position) {
     ResponseModel responseModel = responseList.get(position);
     holder.setData(responseModel);

    }



    @Override
    public int getItemCount() {
        return responseList.size();
    }
}
