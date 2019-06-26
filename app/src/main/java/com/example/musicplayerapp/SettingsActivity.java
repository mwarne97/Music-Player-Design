package com.example.musicplayerapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class SettingsActivity extends AppCompatActivity {

    ArrayAdapter settingsAdapter;
    ArrayList<SettingsClass> settingList;
    ListView settingsView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting);

        settingsView = (ListView) findViewById(R.id.settings_list);

        settingList = new ArrayList<SettingsClass>();

        settingList.add(new SettingsClass(R.drawable.settings_vector, "Theme",
                "Change overall look and feel of the music player"));

        settingList.add(new SettingsClass(R.drawable.settings_vector, "Equilizer",
                "Adjust the volume levels to you liking"));

        settingList.add(new SettingsClass(R.drawable.settings_vector, "Backup Music Library",
                "Backup you current music library"));

        settingList.add(new SettingsClass(R.drawable.settings_vector, "Format Music Library",
                "Delete entire music library"));

        settingList.add(new SettingsClass(R.drawable.settings_vector, "Privacy Policy",
                null));

        settingsAdapter = new SettingsAdapter(this, settingList);

        settingsView.setAdapter(settingsAdapter);
    }//End onCreate

}//End Main
