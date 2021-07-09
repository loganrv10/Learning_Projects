package com.example.assignmentceo;

import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class FamousViewHolder extends RecyclerView.ViewHolder {
private ImageView ivPicture;
private TextView tvHeading,tvAge,tvProfession;
private RelativeLayout relativeLayout;
private ItemClickListener itemClickListener;

    public FamousViewHolder(@NonNull View itemView,ItemClickListener itemClickListener) {
        super(itemView);
        this.itemClickListener = itemClickListener;
        initView(itemView);
    }

    private void initView(View itemView) {
        ivPicture = itemView.findViewById(R.id.ivPicture);
        relativeLayout = itemView.findViewById(R.id.Relativelayout);
        tvAge = itemView.findViewById(R.id.tvAge);
        tvHeading = itemView.findViewById(R.id.tvHeading);
        tvProfession = itemView.findViewById(R.id.tvProfession);
    }

    void setData(Famous famous){
        ivPicture.setImageResource(famous.getIvPicture());
        tvAge.setText(famous.getTvAge());
        tvHeading.setText(famous.getTvHeading());
        tvProfession.setText(famous.getTvProfession());
        relativeLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                itemClickListener.onItemClicked(famous);
            }
        });
    }
}

