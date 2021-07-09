package com.example.assignment_7_7__article_recycleview;



public class Article {

    private int ivImage;
    private String tvHeading;
    private String tvPara;
    private String tvAuthoeName;

    public int getIvImage() {
        return ivImage;
    }

    public String getTvHeading() {
        return tvHeading;
    }

    public String getTvPara() {
        return tvPara;
    }

    public String getTvAuthoeName() {
        return tvAuthoeName;
    }

    public Article(int ivImage, String tvHeading, String tvPara, String tvAuthoeName) {
        this.ivImage = ivImage;
        this.tvHeading = tvHeading;
        this.tvPara = tvPara;
        this.tvAuthoeName = tvAuthoeName;
    }
}
