package com.example.wepartapp8_7_2021;

import android.content.DialogInterface;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.recyclerview.widget.RecyclerView;

public class StudentViewHolder extends RecyclerView.ViewHolder {
    private ImageView mIvStudentImg;
    private TextView mTvName, mTvAge, mTvDob, mTvAddress;
    private ItemCliclListener itemCliclListener;

    public StudentViewHolder(@NonNull View itemView, ItemCliclListener itemCliclListener) {
        super(itemView);
        this.itemCliclListener = itemCliclListener;
        initViews(itemView);
    }

    private void initViews(View itemView) {
        mIvStudentImg = itemView.findViewById(R.id.ivStudentImg);
        mTvName = itemView.findViewById(R.id.tvName);
        mTvAge = itemView.findViewById(R.id.tvAge);
        mTvDob = itemView.findViewById(R.id.tvDob);
        mTvAddress = itemView.findViewById(R.id.tvAddress);
    }

    public void setData(StudentModel student, int position) {
        mIvStudentImg.setImageResource(student.getImageId());
        mTvName.setText(student.getName());
        mTvDob.setText(student.getDOB());
        mTvAge.setText(student.getAge() + " ");
        mIvStudentImg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                itemCliclListener.onItemClicked(student, position);
            }
        });
    }
}