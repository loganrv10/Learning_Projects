package com.example.mp3player_13_7;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements ItemOnClicker{

    private RecyclerView recyclerView;

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
        SongAdapter songAdapter = new SongAdapter(songsList,this);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(songAdapter);
    }

    private void buildList() {
     for (int i = 0; i < 19; i++){

        if (i % 2 == 0){
            Songs songs = new Songs("Fikar Not " + i,R.drawable.besabriya,"3 min",R.raw.fikar);
            songsList.add(songs);
        }else {
            Songs songs = new Songs("Kal ki baat "+ i,R.drawable.bhai,"4min",R.raw.kkb);
            songsList.add(songs);
        }
     }


    }

    private void initView() {
        recyclerView = findViewById(R.id.recycleView);
    }


    @Override
    public void onClick(int position, Songs song) {
//        if (mediaPlayer != null) {
//            mediaPlayer.reset();
//        }
//        mediaPlayer = MediaPlayer.create(getApplicationContext(), song.getMusic());
//        mediaPlayer.start();
    }

    @Override
    public void pause() {
//        if (mediaPlayer != null) {
//            mediaPlayer.pause();
//        }
    }

    @Override
    public void delete(Songs song) {
      songsList.remove(song);

    }

}