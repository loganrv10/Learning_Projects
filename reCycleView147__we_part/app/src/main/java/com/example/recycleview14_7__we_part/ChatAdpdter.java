package com.example.recycleview14_7__we_part;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ChatAdpdter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    private ArrayList<BaseModel> baseModelArrayList;

    public ChatAdpdter(ArrayList<BaseModel> baseModelArrayList) {
        this.baseModelArrayList = baseModelArrayList;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        switch (viewType) {
            case 0:
                View view1 = LayoutInflater.from(parent.getContext()).inflate(R.layout.sender_item_layout, parent, false);
                return new SenderViewHolder(view1);
            case 1:
                View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.receiver_item_layout, parent, false);
                return new ReciverViewHolder(view);
        }
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        int viewType = baseModelArrayList.get(position).getViewType();
        switch (viewType) {
            case 0:
                if (holder instanceof SenderViewHolder) {
                    SenderModel senderModel = (SenderModel) baseModelArrayList.get(position);
                    ((SenderViewHolder) holder).setData(senderModel);
                }
                break;
            case 1:
                if (holder instanceof ReciverViewHolder) {
                    ReciverModel reciverModel = (ReciverModel) baseModelArrayList.get(position);
                    ((ReciverViewHolder) holder).setData(reciverModel);
                }
                break;
        }
    }

    @Override
    public int getItemViewType(int position) {
        return baseModelArrayList.get(position).getViewType();
    }


    @Override
    public int getItemCount() {
        return baseModelArrayList.size();
    }
}
