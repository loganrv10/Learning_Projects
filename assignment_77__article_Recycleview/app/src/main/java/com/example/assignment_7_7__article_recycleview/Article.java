package com.example.assignment_7_7__article_recycleview;

public class Article {
    private final int ivImage;
    private final String tvHeading;
    private final String mTvPara;
    private final String mTvAuthorName;



    public Article(int ivImage, String tvHeading, String mTvPara, String mTvAuthorName) {
        this.ivImage = ivImage;
        this.tvHeading = tvHeading;
        this.mTvPara =  mTvPara;
        this.mTvAuthorName = mTvAuthorName;
    }

    public int getIvImage() {
        return ivImage;
    }

    public String getTvHeading() {
        return tvHeading;
    }

    public String getTvPara(){
        return mTvPara;
    }

    public String getmTvAuthorName() {
        return mTvAuthorName;
   }
}
