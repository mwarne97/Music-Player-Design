package com.example.musicplayerapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class NowPlayingActivity extends AppCompatActivity {

    ImageView albumArtImageView;
    TextView songTitleTextView;
    TextView artistNameTextView;
    TextView albumNameTextView;
    TextView currentSongTimeTextView;
    TextView endTimeTextView;

    int albumArt;
    String songName;
    String artistName;
    String albumName;
    String songEndTime;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_now_playing);

        albumArtImageView = (ImageView) findViewById(R.id.now_playing_activity_album_art);
        songTitleTextView = (TextView) findViewById(R.id.now_playing_activity_song_title);
        artistNameTextView = (TextView) findViewById(R.id.now_playing_activity_artist_name);
        albumNameTextView = (TextView) findViewById(R.id.now_playing_activity_album_name);
        currentSongTimeTextView = (TextView) findViewById(R.id.now_playing_activity_start_time);
        endTimeTextView = (TextView) findViewById(R.id.now_playing_activity_end_time);

        albumArt = getIntent().getExtras().getInt("Album Art");
        albumArtImageView.setImageResource(albumArt);

        songName = getIntent().getExtras().getString("Song Name");
        songTitleTextView.setText(songName);

        artistName = getIntent().getExtras().getString("Artist Name");
        artistNameTextView.setText(artistName);

        albumName = getIntent().getExtras().getString("Album Name");
        albumNameTextView.setText(albumName);

        songEndTime = getIntent().getExtras().getString("Song Time");
        endTimeTextView.setText(songEndTime);

    }//End onCreate

}//End Main
