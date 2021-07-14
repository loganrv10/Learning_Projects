package com.example.mp3player_13_7;

import android.widget.TextView;

public class Songs {
    private String SongName;
    private int ivImageView;
    private String tvDuration;
    private int music;



    public Songs(String songName, int ivImageView, String tvDuration, int music) {
        SongName = songName;
        this.ivImageView = ivImageView;
        this.tvDuration = tvDuration;
        this.music = music;
    }

    public String getSongName() {
        return SongName;
    }

    public int getIvImageView() {
        return ivImageView;
    }

    public int getMusic() {
        return music;
    }

    public String getTvDuration() {
        return tvDuration;
    }
}
