package com.example.musicplayerapp;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class HomeAdapter extends ArrayAdapter<HomeClass> {

    public HomeAdapter(Activity activity, List<HomeClass> homeIconClass) {
        super(activity, 0, homeIconClass);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {

            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.home_screen_category_card,
                    parent, false);

            HomeClass homeScreenIcon = getItem(position);

            ImageView iconImage = (ImageView) listItemView.findViewById(R.id.home_screen_card_icon);
            iconImage.setImageResource(homeScreenIcon.getCardImage());
            iconImage.setBackgroundColor(homeScreenIcon.getCardColor());

            TextView iconText = (TextView) listItemView.findViewById(R.id.home_screen_card_text);
            iconText.setText(homeScreenIcon.getCardLabel());

        }//End If

        return listItemView;
    }//End getView

    @Override
    public HomeClass getItem(int position) {
        return super.getItem(position);
    }
}//End
