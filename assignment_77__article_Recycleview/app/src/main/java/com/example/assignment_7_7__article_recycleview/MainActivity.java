package com.example.assignment_7_7__article_recycleview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements ItemClickListener{
    private RecyclerView mRecyclerView;
    private ArrayList<Article> arrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        buildActicleList();
        setRecycleView();
    }

    private void setRecycleView() {
     ArticleAdaptor articleAdaptor = new ArticleAdaptor(arrayList,this);
     LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
     mRecyclerView.setLayoutManager(linearLayoutManager);
     mRecyclerView.setAdapter(articleAdaptor);
    }

    private void buildActicleList() {
        arrayList = new ArrayList<>();
        arrayList.add(new Article(R.drawable.ocean2,"Blue ocean","The ocean is this beautiful, unexplored place. Why on Earth everyone isn't down there","Subham kumar"));
        arrayList.add(new Article(R.drawable.ocean1,"Blue ocean","The ocean is this beautiful, unexplored place. Why on Earth everyone isn't down there","lucifer kumar"));
        arrayList.add(new Article(R.drawable.ocean4,"Blue ocean","The ocean is this beautiful, unexplored place. Why on Earth everyone isn't down there","Akshay kumar"));
        arrayList.add(new Article(R.drawable.ocean3,"Blue ocean","The ocean is this beautiful, unexplored place. Why on Earth everyone isn't down there","Subham kumar"));
        arrayList.add(new Article(R.drawable.ocean4,"Blue ocean","The ocean is this beautiful, unexplored place. Why on Earth everyone isn't down there","Ravan kumar"));
        arrayList.add(new Article(R.drawable.ocean3,"Blue ocean","The ocean is this beautiful, unexplored place. Why on Earth everyone isn't down there","john kumar"));


    }


    private void initView() {
    mRecyclerView = findViewById(R.id.RecycleView);
    }


    @Override
    public void onItemClicked(int position, Article article) {
        Toast.makeText(MainActivity.this,"Author name is " + article.getTvAuthoeName(),Toast.LENGTH_SHORT).show();
    }
}
