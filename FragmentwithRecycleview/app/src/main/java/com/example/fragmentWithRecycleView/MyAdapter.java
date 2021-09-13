package com.example.fragmentWithRecycleView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<ViewHolder> {
     List<ResponseModel> responseList;
     ItemClickListener itemClickListener;

    public MyAdapter(List<ResponseModel> responseList, ItemClickListener itemClickListener) {
        this.responseList = responseList;
        this.itemClickListener = itemClickListener;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_layout,parent,false);
        return new ViewHolder(view,itemClickListener);
    }


    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
     ResponseModel responseModel = responseList.get(position);
     holder.setData(responseModel);
    }


    @Override
    public int getItemCount() {
        return responseList.size();
    }
}
