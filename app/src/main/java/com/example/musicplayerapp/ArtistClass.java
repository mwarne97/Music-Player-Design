package com.example.musicplayerapp;

public class ArtistClass {

    private String mArtistName;
    private String mAlbumCount;
    private String mSongCount;

    public ArtistClass(String artistName, String albumCount, String songCount) {
        mArtistName = artistName;
        mAlbumCount = albumCount;
        mSongCount = songCount;
    }

    public String getArtistName() {
        return mArtistName;
    }

    public String getAlbumCount() {
        return mAlbumCount;
    }

    public String getSongCount() {
        return mSongCount;
    }

}//End Class
