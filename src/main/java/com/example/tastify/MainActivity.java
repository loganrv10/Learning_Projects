package com.example.tastify;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements OnClickListener{
    RecyclerView recyclerView;
    ArrayList<Task> taskList;
    EditText  medtText;
    Button mBtnRemove, newBtn;
    CardView cardView;


    Button mBtnAdd;
    TaskAdapter taskAdapter;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        builtList();
        setRecycleView();
        mBtnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cardView.setVisibility(View.VISIBLE);
                newBtn.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Task task = new Task(medtText.getText().toString());
                        cardView.setVisibility(View.GONE);
                        taskList.add(task);
                        taskAdapter.notifyDataSetChanged();
                    }
                });
            }
        });


    }

    private void setRecycleView() {
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(MainActivity.this);
        TaskAdapter taskAdapter = new TaskAdapter(taskList);
        recyclerView.setAdapter(taskAdapter);
        recyclerView.setLayoutManager(linearLayoutManager);


    }

    private void builtList() {
        taskList = new ArrayList<>();
         taskList.add(new Task("Shubham"));
         taskList.add(new Task("adi"));
         taskList.add(new Task("umang"));

    }


    private void initView() {
        recyclerView = findViewById(R.id.recycleview);

         medtText = findViewById(R.id.edtText);
        mBtnRemove = findViewById(R.id.BtnRemove);
        mBtnAdd = findViewById(R.id.BtnAdd);
        medtText = findViewById(R.id.edtText);
        cardView = findViewById(R.id.cardView);
        newBtn = findViewById(R.id.newBtn);

    }


    @Override
    public void edit(int position, Task task) {
        cardView.setVisibility(View.VISIBLE);

        newBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Task task = new Task(medtText.getText().toString());
                cardView.setVisibility(View.GONE);
                taskList.set(position,task);
                taskAdapter.notifyDataSetChanged();
            }
        });

    }

    @Override
    public void delete(int position, Task task) {
      mBtnRemove.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View v) {
            taskList.remove(position);
            taskAdapter.notifyDataSetChanged();
          }
      });
    }
}