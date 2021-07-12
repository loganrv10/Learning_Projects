package com.example.birdsappplication;

public class Birds {
    private int ivPicture;
    private String tvBirdName;
    public Birds(int ivPicture, String tvBirdName) {
        this.ivPicture = ivPicture;
        this.tvBirdName = tvBirdName;
    }

    public int getIvPicture() {
        return ivPicture;
    }

    public String getTvBirdName() {
        return tvBirdName;
    }
}
