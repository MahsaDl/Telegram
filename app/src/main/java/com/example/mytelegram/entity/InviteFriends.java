package com.example.mytelegram.entity;

public class InviteFriends {
    private int imgProfile;
    private String tvName;
    private String tvNumber;

    public InviteFriends(int imgProfile, String tvName, String tvNumber) {
        this.imgProfile = imgProfile;
        this.tvName = tvName;
        this.tvNumber = tvNumber;
    }

    public InviteFriends() {
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

    public String getTvNumber() {
        return tvNumber;
    }

    public void setTvNumber(String tvNumber) {
        this.tvNumber = tvNumber;
    }
}
