package com.example.musicplayerapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class ArtistActivity extends AppCompatActivity {

    ArrayList<ArtistClass> artistInfoList;
    ArtistAdapter artistListAdapter;
    ListView artistsListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_artist_list);

        artistsListView = (ListView) findViewById(R.id.artist_list_view);

        artistInfoList = new ArrayList<ArtistClass>();

        //Sample Data
        artistInfoList.add(new ArtistClass("Lil' Wayne", getString(R.string.number_of_albums_txt, 5),
                getString(R.string.number_of_songs_txt,45)));
        artistInfoList.add(new ArtistClass("Drake", getString(R.string.number_of_albums_txt, 5), getString(R.string.number_of_songs_txt,45)));
        artistInfoList.add(new ArtistClass("Future", getString(R.string.number_of_albums_txt, 7), getString(R.string.number_of_songs_txt,90)));
        artistInfoList.add(new ArtistClass("Rick Ross", getString(R.string.number_of_albums_txt, 5), getString(R.string.number_of_songs_txt,40)));
        artistInfoList.add(new ArtistClass("Billie Eilish", getString(R.string.number_of_albums_txt, 2),
                getString(R.string.number_of_songs_txt, 20)));

        artistInfoList.add(new ArtistClass("Dua Lipa", getString(R.string.number_of_albums_txt, 2),
                getString(R.string.number_of_songs_txt, 12)));

        artistInfoList.add(new ArtistClass("Queen", getString(R.string.number_of_albums_txt, 5),
                getString(R.string.number_of_songs_txt, 55)));

        artistListAdapter = new ArtistAdapter(this, artistInfoList);

        artistsListView.setAdapter(artistListAdapter);

    }//End onCreate

}//End ArtistActivity
