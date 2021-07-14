package com.example.mp3player_13_7;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private TextView mSongName;
    private TextView mtvDuration;
    private ImageView mivImageView;
    private Button mtvPlay, mtvPause, mtvDelete;
    ArrayList<Songs> songsList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        buildList();
        setRecycleView();
    }

    private void setRecycleView() {
        SongAdapter songAdapter = new SongAdapter(songsList);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(songAdapter);
    }

    private void buildList() {
     for (int i = 0; i < 9; i++){
         Songs songs = new Songs("besabriya",R.drawable.besabriya,"3 min");
     }


    }

    private void initView() {
        mSongName = findViewById(R.id.SongName);
        mivImageView = findViewById(R.id.ivImageView);
        mtvDuration = findViewById(R.id.tvDuration);
        recyclerView = findViewById(R.id.recycleView);
        mtvPlay = findViewById(R.id.tvPlay);
        mtvPause = findViewById(R.id.tvPause);
        mtvDelete = findViewById(R.id.tvDelete);
    }
}