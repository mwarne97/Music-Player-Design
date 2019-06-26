package com.example.musicplayerapp;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

public class HomeActivity extends AppCompatActivity {

    //Used to transfer data to nowPlayingActivity
    final String NOW_PLAYING_SONG_NAME = "Song Name";
    final String NOW_PLAYING_ARTIST_NAME = "Artist Name";
    final String NOW_PLAYING_ALBUM_NAME = "Album Name";
    final String NOW_PLAYING_SONG_END_TIME = "Song Time";
    final String NOW_PLAYING_ALBUM_ART = "Album Art";

    ArrayAdapter homeScreenAdapter;
    ArrayList<HomeClass> homeScreenList;
    GridView gridView;

    LinearLayout homeScreenLayout;

    //Sample Data For nowPlayingSection
    //This Can Be Changed If Needed
    String songName = "Electric Body (Ft. Schoolboy Q)";
    String artistName = "A$AP Rocky";
    String albumName = "At Long Last A$AP";
    String songEndTime = "4:00";
    int albumArt = R.drawable.album_cover_1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_screen);

        homeScreenLayout = (LinearLayout) findViewById(R.id.home_screen_view);

        gridView = (GridView) findViewById(R.id.grid_view);

        homeScreenList = new ArrayList<HomeClass>();
        homeScreenList.add(new HomeClass(Color.parseColor(getString(R.string.artists_background_colour)),"Artists", R.drawable.artist_vector_colour));
        homeScreenList.add(new HomeClass(Color.parseColor(getString(R.string.albums_background_colour)),"Albums", R.drawable.albums_vector_color));
        homeScreenList.add(new HomeClass(Color.parseColor(getString(R.string.playlists_background_colour)),"Playlists", R.drawable.playlists_vector_2));
        homeScreenList.add(new HomeClass(Color.parseColor(getString(R.string.settings_background_colour)),"Settings", R.drawable.settings_vector_color));

        homeScreenAdapter = new HomeAdapter(this, homeScreenList);

        gridView.setAdapter(homeScreenAdapter);

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intention;
                switch (i) {
                    case 0:
                        intention = new Intent(HomeActivity.this, ArtistActivity.class);
                        startActivity(intention);
                        break;

                    case 1:
                        intention = new Intent(HomeActivity.this, AlbumActivity.class);
                        startActivity(intention);
                        break;

                    case 2:
                        intention = new Intent(HomeActivity.this, PlaylistActivity.class);
                        startActivity(intention);
                        break;

                    case 3:
                        intention = new Intent(HomeActivity.this, SettingsActivity.class);
                        startActivity(intention);
                        break;

                    default:
                        break;
                }//End Switch
            }//End onClick
        });

        nowPlayingCentreLayout();
    }//End onCreate

    public void nowPlayingCentreLayout(){
        View layout = LayoutInflater.from(this).inflate(R.layout.now_playing_card, homeScreenLayout,
                false);

        ImageView albumArtImageView = layout.findViewById(R.id.now_playing_card_album_art);
        albumArtImageView.setImageResource(albumArt);

        TextView songNameTextView = layout.findViewById(R.id.now_playing_card_song_name);
        songNameTextView.setText(songName);

        TextView artistNameTextView = layout.findViewById(R.id.now_playing_card_artist_name);
        artistNameTextView.setText(artistName);

        TextView albumNameTextView = layout.findViewById(R.id.now_playing_card_album_name);
        albumNameTextView.setText(albumName);

        homeScreenLayout.addView(layout);

        layout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intention = new Intent(HomeActivity.this, NowPlayingActivity.class);
                intention.putExtra(NOW_PLAYING_ALBUM_ART, albumArt);
                intention.putExtra(NOW_PLAYING_SONG_NAME, songName);
                intention.putExtra(NOW_PLAYING_ARTIST_NAME, artistName);
                intention.putExtra(NOW_PLAYING_ALBUM_NAME, albumName);
                intention.putExtra(NOW_PLAYING_SONG_END_TIME, songEndTime);
                startActivity(intention);
            }//End onClick
        });

    }//End nowPlayingCentreLayout

}//End Main
