package com.example.musicplayerapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class PlaylistAdapter extends ArrayAdapter<PlaylistClass> {

    public PlaylistAdapter(Context context, List<PlaylistClass> objects) {
        super(context, 0, objects);
    }//End

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItem = convertView;

        if (listItem == null) {

            listItem = LayoutInflater.from(getContext()).inflate(R.layout.playlist_card,
                    parent, false);

            PlaylistClass playlistClass = getItem(position);

            ImageView playlistImage = listItem.findViewById(R.id.playlist_card_image);
            playlistImage.setImageResource(playlistClass.getPlaylistImage());

            TextView playlistName = (TextView) listItem.findViewById(R.id.playlist_card_name);
            playlistName.setText(playlistClass.getPlaylistName());

            TextView playlistNumOfSongs = (TextView) listItem.findViewById(R.id.playlist_card_num_of_songs);
            playlistNumOfSongs.setText(playlistClass.getNumOfSongs());

            TextView playlistDuration = (TextView) listItem.findViewById(R.id.playlist_card_duration);
            playlistDuration.setText(playlistClass.getDuration());

        }//End If
        return listItem;
    }//End getView
}//End
