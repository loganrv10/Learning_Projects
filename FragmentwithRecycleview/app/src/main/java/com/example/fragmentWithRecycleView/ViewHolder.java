package com.example.fragmentWithRecycleView;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

public class ViewHolder extends RecyclerView.ViewHolder {
    CardView cardView;
    ImageView mImage;
    TextView text1, text2;
    ItemClickListener itemClickListener;




    public ViewHolder(@NonNull View itemView,ItemClickListener itemClickListener) {
        super(itemView);
        this.itemClickListener = itemClickListener;
        initView(itemView);
    }

    private void initView(View itemView) {
        cardView = itemView.findViewById(R.id.cardView);
        mImage = itemView.findViewById(R.id.image1);
        text1 = itemView.findViewById(R.id.text1);
        text2 = itemView.findViewById(R.id.text2);
    }
    public void setData(ResponseModel responseModel){
        Glide.with(mImage).load(responseModel.getImage()).into(mImage);
        text1.setText(responseModel.getTitle());
        text2.setText(responseModel.getSubTitle());
         cardView.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                   itemClickListener.onClickListener(responseModel,getAdapterPosition());

             }
         });

    }
}
