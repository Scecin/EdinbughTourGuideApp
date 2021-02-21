package com.example.edinbughtourguideapp;

import java.util.UUID;

public class Place {
    private int imageResourceId;

    private String imageTitle;

    private String imageInformation;

    private int vectorLike;

    public Place(int image, String title, String information, int vectorHeart) {
        imageResourceId = image;
        imageTitle = title;
        imageInformation = information;
        vectorLike = vectorHeart;
    }
    public int getImageResourceId() { return imageResourceId;}

    public String getImageTitle() { return imageTitle;}

    public String getImageInformation() {return imageInformation;}

    public int getVectorLike() {return vectorLike;}

    public void setVectorLike(int vectorLike) {
        this.vectorLike = vectorLike;
    }

    public void notifyDataSetChanged(int vectorHeart) {
    }
}
