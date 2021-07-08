package com.example.assignment_7_7__article_recycleview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements ItemClickListener  {

    private RecyclerView RecycleView;
    private ArrayList<Article> arrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
        buildArticleList();
        setRecycleView();
    }

    private void setRecycleView() {
        ArticleAdapter articleAdapter = new ArticleAdapter(arrayList,this);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        RecycleView.setLayoutManager(linearLayoutManager);
        RecycleView.setAdapter(articleAdapter);
    }


    private void buildArticleList() {
        ArrayList<Article> arrayList = new ArrayList<>();
        arrayList.add(new Article(R.drawable.ocean1,"Beautiful ocean","See the Beautiful oceans of the Pacific coast where the water is so clean you can see the sand.","Subham"));
        arrayList.add(new Article(R.drawable.ocean2,"Strong ocean","The ocean is this beautiful, unexplored place. Why on Earth everyone isn't down there, I don't know.","aditya"));
        arrayList.add(new Article(R.drawable.ocean3,"quiet ocean","The beauty and mystery of the ocean, fills our lives with wonders, vast beyond our imagination..","Prachi"));
        arrayList.add(new Article(R.drawable.ocean4,"Elegant ocean","The ocean is this beautiful, unexplored place. Why on Earth everyone isn't down there, I don't know.","Sudarshan"));
        arrayList.add(new Article(R.drawable.ocean4,"Funny ocean","The human desire to obtain more is a sieve that can never be filled with all the water from the world’s oceans.","Arya"));
        arrayList.add(new Article(R.drawable.land,"Rocky ocean","If everybody had an ocean … everybody’d be surfing … Johnny Manetta and 4 more, Looking For Something to Find","Arya"));
    }

    private void initViews() {
        RecyclerView recyclerView = findViewById(R.id.RecycleView);
    }

    @Override
    public void onItemClicked(int position, Article article) {
        Toast.makeText(MainActivity.this,"Author name is " + article.getmTvAuthorName(),Toast.LENGTH_SHORT).show();
    }

}