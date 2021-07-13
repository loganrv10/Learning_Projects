package com.example.wepart13_7notify;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class EmployeeViewHolder extends RecyclerView.ViewHolder {

    private ItemClickListerner itemClickListener;
    private TextView mTvName;
    private TextView mTvAge;
    private TextView mTvAddress;
    private ImageView mIvEdit;

    public EmployeeViewHolder(@NonNull View itemView, ItemClickListerner itemClickListener) {
        super(itemView);
        this.itemClickListener = itemClickListener;
        initViews(itemView);
    }

    private void initViews(View itemView) {
        mTvAddress = itemView.findViewById(R.id.tvAddress);
        mTvName = itemView.findViewById(R.id.tvName);
        mIvEdit = itemView.findViewById(R.id.ivEdit);
        mTvAge = itemView.findViewById(R.id.tvAge);
    }

    public void setData(Employee employee) {
        mTvName.setText(employee.getName());
        mTvAddress.setText(employee.getAddress());
        mTvAge.setText(employee.getAge()+ "");
        mIvEdit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                itemClickListener.onItemClicked(getAdapterPosition(), employee);
            }
        });
    }
}