package com.example.musicplayerapp;

public class HomeClass {

    private int mCardColor;
    private String mCardLabel;
    private int mCardImage;

    public HomeClass(int cardColor, String cardLabel, int cardImage) {
        mCardColor = cardColor;
        mCardLabel = cardLabel;
        mCardImage = cardImage;
    }

    public int getCardColor() {
        return mCardColor;
    }

    public String getCardLabel() {
        return mCardLabel;
    }

    public int getCardImage() {
        return mCardImage;
    }

}//End
