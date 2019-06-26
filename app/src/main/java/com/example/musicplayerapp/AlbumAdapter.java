package com.example.musicplayerapp;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class AlbumAdapter extends ArrayAdapter<AlbumClass> {

    public AlbumAdapter(Activity context, List<AlbumClass> albumClassList) {
        super(context, 0, albumClassList);
    }//End

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View listItem = convertView;

        if (listItem == null) {
            listItem = LayoutInflater.from(getContext()).inflate(R.layout.album_card, parent,
                    false);

            AlbumClass albumClass = getItem(position);

            ImageView albumArt = (ImageView) listItem.findViewById(R.id.album_card_album_art);
            albumArt.setImageResource(albumClass.getAlbumArt());

            TextView albumName = (TextView) listItem.findViewById(R.id.album_card_album_name);
            albumName.setText(albumClass.getAlbumName());

            TextView artistName = (TextView) listItem.findViewById(R.id.album_card_artist_name);
            artistName.setText(albumClass.getArtistName());

            TextView numOfSongs = (TextView) listItem.findViewById(R.id.album_card_num_of_songs);
            numOfSongs.setText(albumClass.getNumOfSongs());

            TextView duration = (TextView) listItem.findViewById(R.id.album_card_duration);
            duration.setText(albumClass.getDuration());

        }//End If

        return listItem;

    }//End getView

}//End Adapter
