package com.example.wepartapp8_7_2021;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.DialogInterface;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity implements ItemCliclListener {

    private RecyclerView recyclerView;
    private final ArrayList<StudentModel> arrayList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
        buildList();
        setRecycleView();
    }

    private void setRecycleView() {
        StudentAdapter studentAdapter = new StudentAdapter(arrayList, this);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(studentAdapter);
    }

    private void buildList() {
        for (int i = 0; i < 100; i++) {
            StudentModel studentModel = new StudentModel("Subham kumar", 22,
                    "Jharkhand dhanbad", "22/07/1999", R.drawable.abc_b);
            arrayList.add(studentModel);
        }
    }

    private void initViews() {
        recyclerView = findViewById(R.id.recycleView);

    }


    @Override
    public void onItemClicked(StudentModel student, int position) {
        Log.d("MainActivity", "onItemClicked at position" + (position + 1));AlertDialog alertDialog = new AlertDialog.Builder(this)
                .setTitle("Hey this is the Data")
                .setMessage(
                        student.getName() + "\n"
                                + student.getAge() + "\n"
                                + student.getDOB() + "\n"
                                + student.getAddress()
                ).
                        setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                dialog.dismiss();
                            }
                        }).
                        setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                dialog.dismiss();
                            }
                        }).
                        show();

    }
}
