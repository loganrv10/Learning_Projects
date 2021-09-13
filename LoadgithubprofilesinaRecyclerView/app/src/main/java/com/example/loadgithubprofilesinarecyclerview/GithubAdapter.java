package com.example.loadgithubprofilesinarecyclerview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class GithubAdapter extends RecyclerView.Adapter<GithubHolder> {
   List<ResponseDTO> responseList;

    public GithubAdapter(List<ResponseDTO> responseList) {
        this.responseList = responseList;
    }

    @NonNull
    @Override
    public GithubHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_layout,parent,false);
        return new GithubHolder(view);
    }


    @Override
    public void onBindViewHolder(@NonNull GithubHolder holder, int position) {
     ResponseDTO responseDTO = responseList.get(position);
     holder.setData(responseDTO);
    }


    @Override
    public int getItemCount() {
        return responseList.size();
    }



}
