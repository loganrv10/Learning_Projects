package com.example.mp3player_13_7;

import android.media.MediaPlayer;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class SongsViewHolder extends RecyclerView.ViewHolder {
    private TextView mSongName;
    private TextView mtvDuration;
    private ImageView mivImageView;
    private Button mtvPlay, mtvPause, mtvDelete;

    public SongsViewHolder(@NonNull  View itemView) {
        super(itemView);
        initView(itemView);
    }

    private void initView(View itemView) {
        mSongName = itemView.findViewById(R.id.SongName);
        mtvDuration = itemView.findViewById(R.id.tvDuration);
        mivImageView = itemView.findViewById(R.id.ivImageView);
        mtvPlay = itemView.findViewById(R.id.tvPlay);
        mtvPause = itemView.findViewById(R.id.tvPause);
        mtvDelete = itemView.findViewById(R.id.tvDelete);

    }


    public void setData(Songs songs, ItemOnClicker itemOnClicker) {
        mSongName.setText(songs.getSongName());
        mivImageView.setImageResource(songs.getIvImageView());
        mtvDuration.setText(songs.getTvDuration() + " ");
        MediaPlayer mediaPlayer = MediaPlayer.create(mSongName.getContext(),songs.getMusic());

        mtvPlay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer.start();
            }
        });

        mtvPause.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer.pause();
            }
        });

        mtvDelete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                itemOnClicker.delete(songs);
            }
        });
    }
}
