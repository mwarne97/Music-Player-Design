package com.example.musicplayerapp;

public class PlaylistClass {

    private int mPlaylistImage;
    private String mPlaylistName;
    private String mNumOfSongs;
    private String mDuration;

    public PlaylistClass(int playlistImage, String playlistName, String numOfSongs, String duration) {
        mPlaylistImage = playlistImage;
        mPlaylistName = playlistName;
        mNumOfSongs = numOfSongs;
        mDuration = duration;
    }

    public int getPlaylistImage(){
        return mPlaylistImage;
    }

    public String getPlaylistName() {
        return mPlaylistName;
    }

    public String getNumOfSongs() {
        return mNumOfSongs;
    }

    public String getDuration() {
        return mDuration;
    }
}//End
