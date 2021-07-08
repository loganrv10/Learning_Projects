package com.example.assignment_7_7__article_recycleview;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import org.jetbrains.annotations.NotNull;

public class ArticleViewHolder extends RecyclerView.ViewHolder {
   private final ItemClickListener itemClickListener;
   private ImageView mivImage;
   private TextView mtvHeading;
   private TextView para;

    public ArticleViewHolder(@NonNull @NotNull View itemView, ItemClickListener itemClickListener) {
        super(itemView);
        this.itemClickListener = itemClickListener;
        initView();
    }

    private void initView() {
    mivImage = itemView.findViewById(R.id.ivImage);
    mtvHeading = itemView.findViewById(R.id.tvHeading);
    para = itemView.findViewById(R.id.TvPara);
    }
    public void setData(Article article) {
        mivImage.setImageResource(article.getIvImage());
        mtvHeading.setText(article.getTvHeading());
        para = itemView.findViewById(R.id.TvPara);
        mivImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                itemClickListener.onItemClicked(getAdapterPosition(), article);
            }
        });
    }
}

