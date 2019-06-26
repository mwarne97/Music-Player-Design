package com.example.musicplayerapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class AlbumActivity extends AppCompatActivity {

    ArrayAdapter albumListAdapter;
    ArrayList<AlbumClass> albumList;
    ListView albumListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_album_list);

        albumListView = (ListView) findViewById(R.id.album_list);

        albumList = new ArrayList<AlbumClass>();

        //Sample Data
        albumList.add(new AlbumClass(R.drawable.album_cover_1,"At Long Last A$AP", "A$AP Rocky",
                getString(R.string.number_of_songs_txt, 18), getString(R.string.duration_txt,67)));

        albumList.add(new AlbumClass(R.drawable.album_cover_2,"ISSA", "21 Savage",
                getString(R.string.number_of_songs_txt,14), getString(R.string.duration_txt,56)));

        albumList.add(new AlbumClass(R.drawable.album_cover_3,"Views", "Drake",
                getString(R.string.number_of_songs_txt,20), getString(R.string.duration_txt,81)));

        albumList.add(new AlbumClass(R.drawable.album_cover_4,"When We All Fall Asleep, Where Do We Go?", "Billie Eilish",
                getString(R.string.number_of_songs_txt,20), getString(R.string.duration_txt, 55)));

        albumList.add(new AlbumClass(R.drawable.album_cover_5, "Greatest Hits", "Queen",
                getString(R.string.number_of_songs_txt, 18), getString(R.string.duration_txt, 58)));

        albumList.add(new AlbumClass(R.drawable.album_cover_6, "Dua Lipa", "Dua Lipa",
                getString(R.string.number_of_songs_txt, 8), getString(R.string.duration_txt, 40)));

        albumListAdapter = new AlbumAdapter(this, albumList);

        albumListView.setAdapter(albumListAdapter);

    }//End onCreate

}//End AlbumActivity
