package com.example.musicplayerapp;

public class AlbumClass {

    private int mAlbumArt;
    private String mAlbumName;
    private String mArtistName;
    private String mNumOfSongs;
    private String mDuration;

    public AlbumClass(int albumArt, String albumName, String artistName, String numOfSongs, String duration) {
        mAlbumArt = albumArt;
        mAlbumName = albumName;
        mArtistName = artistName;
        mNumOfSongs = numOfSongs;
        mDuration = duration;
    }

    public int getAlbumArt(){
        return mAlbumArt;
    }

    public String getAlbumName() {
        return mAlbumName;
    }

    public String getArtistName() {
        return mArtistName;
    }

    public String getNumOfSongs() {
        return mNumOfSongs;
    }

    public String getDuration() {
        return mDuration;
    }
}//End
