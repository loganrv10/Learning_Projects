package com.example.assignmentceo;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.DialogInterface;
import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements ItemClickListener{

    private RecyclerView recyclerView;
    ArrayList<Famous> itemList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
        buildRecycleData();
        setRecycleAdapter();
    }

    private void setRecycleAdapter() {
            FamousAdaptor famousAdaptor = new FamousAdaptor(itemList,this);
            LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
            recyclerView.setLayoutManager(linearLayoutManager);
            recyclerView.setAdapter(famousAdaptor);


    }

    private void buildRecycleData() {
     itemList = new ArrayList<>();
     for (int i= 0; i < 15; i++){
         if (i % 3 ==0){
             itemList.add(new Famous(R.drawable.bhai,"Masai","31","Business"));
         }else if (i % 3 == 1){
             itemList.add(new Famous(R.drawable.subham,"Intezaar","21","Business"));
         }else if (i % 3 == 2){
             itemList.add(new Famous(R.drawable.jeff,"Amazon","56","Business"));
         }
        }
    }

    private void initViews() {
        recyclerView = findViewById(R.id.RecycleView);
    }

    @Override
    public void onItemClicked(Famous famous) {
        AlertDialog alertDialog = new AlertDialog.Builder(this)
                .setTitle("")
                .setMessage(
                        famous.getTvHeading() + "\n" +
                                famous.getTvAge()
                ).setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                    }
                }).setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                    }
                }).show();
    }
}