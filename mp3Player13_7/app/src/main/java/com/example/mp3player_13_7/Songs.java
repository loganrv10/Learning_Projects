package com.example.mp3player_13_7;

import android.widget.TextView;

public class Songs {
    private String SongName;
    private int ivImageView;
    private String tvDuration;

    public Songs(String songName, int ivImageView, String tvDuration) {
        SongName = songName;
        this.ivImageView = ivImageView;
        this.tvDuration = tvDuration;
    }

    public String getSongName() {
        return SongName;
    }

    public int getIvImageView() {
        return ivImageView;
    }

    public String getTvDuration() {
        return tvDuration;
    }
}
