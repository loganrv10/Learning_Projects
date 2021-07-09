package com.example.assignmentceo;

public class Famous {
    private int ivPicture;
    private String tvHeading;
    private String tvAge;
    private String tvProfession;


    public Famous(int ivPicture, String tvHeading, String tvAge, String tvProfession) {
        this.ivPicture = ivPicture;
        this.tvHeading = tvHeading;
        this.tvAge = tvAge;
        this.tvProfession = tvProfession;
    }

    public int getIvPicture() {
        return ivPicture;
    }

    public String getTvHeading() {
        return tvHeading;
    }

    public String getTvAge() {
        return tvAge;
    }

    public String getTvProfession() {
        return tvProfession;
    }


}
