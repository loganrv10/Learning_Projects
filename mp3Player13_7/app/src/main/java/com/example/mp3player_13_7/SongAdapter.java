package com.example.mp3player_13_7;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class SongAdapter extends RecyclerView.Adapter<SongsViewHolder> {
   private ArrayList<Songs>songsList;
    private ItemOnClicker itemOnClicker;

    public SongAdapter(ArrayList<Songs> songsList, ItemOnClicker itemOnClicker) {
        this.songsList = songsList;
        this.itemOnClicker = itemOnClicker;
    }

    @NonNull
    @Override
    public SongsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_layout, parent,false);

        return new SongsViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull SongsViewHolder holder, int position) {
    Songs songs = songsList.get(position);
     holder.setData(songs,itemOnClicker);
    }

    @Override
    public int getItemCount() {
        return songsList.size() ;
    }
}
