package com.example.wepartapp8_7_2021;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;

public class StudentAdapter extends RecyclerView.Adapter<StudentViewHolder> {
    private ArrayList<StudentModel>studentList;
    private ItemCliclListener itemCliclListener;

    public StudentAdapter(ArrayList<StudentModel> studentList, ItemCliclListener itemCliclListener) {
        this.studentList = studentList;
        this.itemCliclListener = itemCliclListener;
    }



    @NotNull
    @Override
    public StudentViewHolder onCreateViewHolder(@NonNull @NotNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_layout,parent,false);
        return new StudentViewHolder(view,itemCliclListener);
    }

    @Override
    public void onBindViewHolder(@NonNull @NotNull StudentViewHolder holder, int position) {
        StudentModel studentModel = studentList.get(position);
        holder.setData(studentModel,position);
    }

    @Override
    public int getItemCount() {
        return studentList.size();
    }
}
