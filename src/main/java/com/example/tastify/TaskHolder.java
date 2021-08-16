package com.example.tastify;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class TaskHolder extends RecyclerView.ViewHolder {
    TextView mTvTask;
    Button mBtnRemove;

    Button mBtnAdd;



    public TaskHolder(@NonNull View itemView) {
        super(itemView);
     mTvTask = itemView.findViewById(R.id.TvTask);

     mBtnRemove = itemView.findViewById(R.id.BtnRemove);
     mBtnAdd = itemView.findViewById(R.id.BtnAdd);
    }

    public void setData(Task task){
        mTvTask.setText(task.getTvTask());

    }



}
