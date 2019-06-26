package com.example.musicplayerapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class SettingsAdapter extends ArrayAdapter<SettingsClass> {

    public SettingsAdapter(Context context, List<SettingsClass> objects) {
        super(context, 0, objects);
    }//End

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItem = convertView;

        if (listItem == null) {

            listItem = LayoutInflater.from(getContext()).inflate(R.layout.setting_card, parent,
                    false);

            SettingsClass settingsClass = getItem(position);

            ImageView settingImage = listItem.findViewById(R.id.setting_card_icon);
            settingImage.setImageResource(settingsClass.getSettingImage());

            TextView settingName = listItem.findViewById(R.id.settings_card_name);
            settingName.setText(settingsClass.getSettingName());

            TextView settingDescription = listItem.findViewById(R.id.setting_card_description);
            settingDescription.setText(settingsClass.getSettingDescription());

        }//End If
        return listItem;
    }//End getView
}//End
