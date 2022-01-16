package com.example.mytelegram.entity;

public class NewGroup {
    private int imgProfile;
    private String tvName;
    private String tvTime;

    public NewGroup(int imgProfile, String tvName, String tvTime) {
        this.imgProfile = imgProfile;
        this.tvName = tvName;
        this.tvTime = tvTime;
    }

    public NewGroup() {
    }

    public int getImgProfile() {
        return imgProfile;
    }

    public void setImgProfile(int imgProfile) {
        this.imgProfile = imgProfile;
    }

    public String getTvName() {
        return tvName;
    }

    public void setTvName(String tvName) {
        this.tvName = tvName;
    }

    public String getTvTime() {
        return tvTime;
    }

    public void setTvTime(String tvTime) {
        this.tvTime = tvTime;
    }
}
