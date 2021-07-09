package com.example.assignmentceo;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class FamousAdaptor extends RecyclerView.Adapter<FamousViewHolder> {
    private ArrayList<Famous> itemList;
    private ItemClickListener itemClickListener;




    public FamousAdaptor(ArrayList<Famous> itemList, ItemClickListener itemClickListener) {
        this.itemList = itemList;
        this.itemClickListener = itemClickListener;
    }


    @NonNull
    @org.jetbrains.annotations.NotNull
    @Override
    public FamousViewHolder onCreateViewHolder( ViewGroup parent, int viewType) {
         View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_layout,parent,false);
        return new FamousViewHolder(view,itemClickListener);
    }

    @Override
    public void onBindViewHolder( FamousViewHolder holder, int position) {
        Famous famous = itemList.get(position);
        holder.setData(famous);
    }

    @Override
    public int getItemCount() {
        return itemList.size();
    }
}
