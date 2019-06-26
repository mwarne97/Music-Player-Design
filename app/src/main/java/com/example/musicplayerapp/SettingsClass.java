package com.example.musicplayerapp;

public class SettingsClass {

    private int mSettingImage;
    private String mSettingName;
    private String mSettingDescription;

    public SettingsClass(int settingImage, String settingName, String settingDescription) {
        mSettingImage = settingImage;
        mSettingName = settingName;
        mSettingDescription = settingDescription;
    }

    public int getSettingImage() {
        return mSettingImage;
    }

    public String getSettingName() {
        return mSettingName;
    }

    public String getSettingDescription() {
        return mSettingDescription;
    }
}//End
