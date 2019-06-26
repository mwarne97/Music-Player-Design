package com.example.musicplayerapp;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

public class ArtistAdapter extends ArrayAdapter<ArtistClass> {

    public ArtistAdapter(Activity activity, List<ArtistClass> artistInfoArrayList) {
        super(activity, 0, artistInfoArrayList);
    }//End Constructor


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.artist_card, parent,
                    false);
        }//End If

        ArtistClass artistInfo = getItem(position);

        TextView artistName = (TextView) listItemView.findViewById(R.id.artist_card_artist_name);
        artistName.setText(artistInfo.getArtistName());

        TextView numberOfAlbums = (TextView) listItemView.findViewById(R.id.artist_card_album_count);
        numberOfAlbums.setText(artistInfo.getAlbumCount());

        TextView numberOfSongs = (TextView) listItemView.findViewById(R.id.artist_card_song_count);
        numberOfSongs.setText(artistInfo.getSongCount());

        return listItemView;
    }//End getView

}//End ArtistAdapter
