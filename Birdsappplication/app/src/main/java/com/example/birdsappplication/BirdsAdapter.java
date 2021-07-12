package com.example.birdsappplication;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class BirdsAdapter extends RecyclerView.Adapter<BirdViewHolder> {
     private ArrayList<Birds>birdList;



    @Override
    public BirdViewHolder onCreateViewHolder(@NonNull  ViewGroup parent, int viewType) {
        final View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_layout,parent,false);
        return new BirdViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull BirdViewHolder holder, int position) {
           Birds birds = birdList.get(position);
    }

    @Override
    public int getItemCount() {
        return 0;
    }
}
