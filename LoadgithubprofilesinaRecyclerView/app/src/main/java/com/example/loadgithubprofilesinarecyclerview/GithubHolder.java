package com.example.loadgithubprofilesinarecyclerview;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

public class GithubHolder extends RecyclerView.ViewHolder {

    private ImageView imageView;
    private TextView mLogin,mName;

    public GithubHolder(@NonNull View itemView) {
        super(itemView);
        initView(itemView);
    }

    private void initView(View itemView) {
      mLogin = itemView.findViewById(R.id.idLogin);
      mName = itemView.findViewById(R.id.idName);
      imageView = itemView.findViewById(R.id.idImageGithub);
    }

    public void setData(ResponseDTO responseDTO){
        Glide.with(imageView).load(responseDTO.getOwner().getAvatarUrl()).into(imageView);
        mName.setText(responseDTO.getName());
        mLogin.setText(responseDTO.getOwner().getLogin());
    }

}


/*
  Glide.with(mIvProfile).load(responseModelItem.getOwner().getAvatarUrl()).into(mIvProfile);
        mTvName.setText(responseModelItem.getName());
        mTvLogin.setText(responseModelItem.getOwner().getLogin());
 */