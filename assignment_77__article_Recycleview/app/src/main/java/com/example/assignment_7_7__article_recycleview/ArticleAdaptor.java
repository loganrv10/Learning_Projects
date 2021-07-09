package com.example.assignment_7_7__article_recycleview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;

public class ArticleAdaptor extends RecyclerView.Adapter<ArticleViewHolder> {
  private ArrayList<Article> arrayList;
    private ItemClickListener itemClickListener;

    public ArticleAdaptor(ArrayList<Article> arrayList, ItemClickListener itemClickListener) {
        this.arrayList = arrayList;
        this.itemClickListener = itemClickListener;
    }

    @Override
    public ArticleViewHolder onCreateViewHolder(@NonNull @NotNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_itemview,parent,false);
        return new ArticleViewHolder(view,itemClickListener);
    }

    @Override
    public void onBindViewHolder(@NonNull @NotNull ArticleViewHolder holder, int position) {
        Article article = arrayList.get(position);
        holder.setData(article);
    }


    @Override
    public int getItemCount() {
        return arrayList.size();
    }
}
