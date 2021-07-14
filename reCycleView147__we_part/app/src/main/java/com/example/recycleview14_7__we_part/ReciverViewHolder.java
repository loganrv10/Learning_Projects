package com.example.recycleview14_7__we_part;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ReciverViewHolder extends RecyclerView.ViewHolder{
    private TextView mTvReciverMessage;

    public ReciverViewHolder(@NonNull View itemView) {
        super(itemView);
        initViews(itemView);
    }

    private void initViews(View itemView) {
        mTvReciverMessage = itemView.findViewById(R.id.tvReceiverMessage);
    }
    public void setData(ReciverModel reciverModel){
      mTvReciverMessage.setText(reciverModel.getReciverMessage());
    }
}
