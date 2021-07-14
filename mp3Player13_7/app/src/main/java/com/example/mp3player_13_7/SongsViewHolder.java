package com.example.mp3player_13_7;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class SongsViewHolder extends RecyclerView.ViewHolder {
    private TextView mSongName;
    private TextView mtvDuration;
    private ImageView mivImageView;


    public SongsViewHolder(@NonNull  View itemView) {
        super(itemView);
        initView(itemView);
    }

    private void initView(View itemView) {
        mSongName = itemView.findViewById(R.id.SongName);
        mtvDuration = itemView.findViewById(R.id.tvDuration);
        mivImageView = itemView.findViewById(R.id.ivImageView);

    }


    public void setData(Songs songs) {
        mSongName.setText(songs.getSongName());
        mivImageView.setImageResource(songs.getIvImageView());
        mtvDuration.setText(songs.getTvDuration());
    }
}
