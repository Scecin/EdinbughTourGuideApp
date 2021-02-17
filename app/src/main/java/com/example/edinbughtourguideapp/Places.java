package com.example.edinbughtourguideapp;

public class Places {
    private int imageResourceId;

    private String imageTitle;

    private String imageInformation;

    private int vectorLike;

    public Places(int image, String title, String information, int vectorHeart) {
        imageResourceId = image;
        imageTitle = title;
        imageInformation = information;
        vectorLike = vectorHeart;
    }
    public int getImageResourceId() { return imageResourceId;}

    public String getImageTitle() { return imageTitle;}

    public String getImageInformation() {return imageInformation;}

    public int getVectorLike() {return vectorLike;}

    public void notifyDataSetChanged(int vectorHeart) {
    }
}
