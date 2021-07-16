package com.example.a16_7_we_partretrofit;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class PostViewHolder extends RecyclerView.ViewHolder {

    private TextView mtvNAme;
    private TextView mtvEmail;
    private TextView mtvBody;


    public PostViewHolder(@NonNull View itemView) {
        super(itemView);
        initViews(itemView);
    }

    private void initViews(View itemView) {
        mtvBody = itemView.findViewById(R.id.tvBody);
        mtvEmail = itemView.findViewById(R.id.tvEmail);
        mtvNAme = itemView.findViewById(R.id.tvName);
    }

    public void setData(ResponseModel responseModel){
        mtvNAme.setText(responseModel.getName());
        mtvEmail.setText(responseModel.getEmail());
        mtvBody.setText(responseModel.getBody());
    }
}
