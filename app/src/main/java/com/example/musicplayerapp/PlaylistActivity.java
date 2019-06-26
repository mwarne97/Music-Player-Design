package com.example.musicplayerapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class PlaylistActivity extends AppCompatActivity {

    ArrayAdapter playlistAdapter;
    ArrayList<PlaylistClass> playlistList;
    ListView playlistView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_playlist);

        playlistView = (ListView) findViewById(R.id.playlist_view);

        playlistList = new ArrayList<PlaylistClass>();
        playlistList.add(new PlaylistClass(R.drawable.favourites, "Favourites", getString(R.string.number_of_songs_txt, 23),
                getString(R.string.duration_txt, 50)));

        playlistList.add(new PlaylistClass(R.drawable.recently_added,"Recently Added", getString(R.string.number_of_songs_txt, 15),
                getString(R.string.duration_txt, 30)));

        playlistList.add(new PlaylistClass(R.drawable.recently_played,"Recently Played", getString(R.string.number_of_songs_txt, 55),
                getString(R.string.duration_txt, 90)));

        playlistList.add(new PlaylistClass(R.drawable.music,"Playlist 1", getString(R.string.number_of_songs_txt, 20),
                getString(R.string.duration_txt, 51)));

        playlistList.add(new PlaylistClass(R.drawable.music, "Let's Get Funky", getString(R.string.number_of_songs_txt, 20),
                getString(R.string.duration_txt, 52)));

        playlistList.add(new PlaylistClass(R.drawable.music, "Something Wack", getString(R.string.number_of_songs_txt, 12),
                getString(R.string.duration_txt, 45)));

        playlistAdapter = new PlaylistAdapter(this, playlistList);

        playlistView.setAdapter(playlistAdapter);

    }//End onCreate

}//End Main
