package com.example.assignment_7_7__article_recycleview;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import org.jetbrains.annotations.NotNull;

public class ArticleViewHolder extends RecyclerView.ViewHolder {
     private ImageView mivImage;
     private TextView mtvHeading;
     private TextView mtvPara;
     private ItemClickListener itemClickListener;


    public ArticleViewHolder(@NonNull View itemView, ItemClickListener itemClickListener) {
        super(itemView);
        this.itemClickListener = itemClickListener;
        initView(itemView);

    }

    private void initView( View itemView) {
        mivImage = itemView.findViewById(R.id.ivImage);
        mtvHeading = itemView.findViewById(R.id.tvHeading);
        mtvPara = itemView.findViewById(R.id.tvPara);
    }

    public void setData(Article article){
        mivImage.setImageResource(article.getIvImage());
        mtvHeading.setText(article.getTvHeading());
        mtvPara.setText(article.getTvPara());
        mivImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                itemClickListener.onItemClicked(getAdapterPosition(),article);
            }
        });
    }
}
