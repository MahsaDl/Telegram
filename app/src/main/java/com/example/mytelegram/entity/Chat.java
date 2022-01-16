package com.example.mytelegram.entity;

public class Chat {

    private int imgProfile;
    private String tvName;
    private String tvMessage;
    private String tvTime;
    private int imgUnread;
    private int imgTik;


    public Chat(int imgProfile, String tvName, String tvMessage, String tvTime, int imgUnread) {
        this.imgProfile = imgProfile;
        this.tvName = tvName;
        this.tvMessage = tvMessage;
        this.tvTime = tvTime;
        this.imgUnread = imgUnread;
    }

    public Chat() {
    }

    public Chat(int imgProfile, String tvName, String tvMessage, String tvTime, int imgUnread, int imgTik) {
        this.imgProfile = imgProfile;
        this.tvName = tvName;
        this.tvMessage = tvMessage;
        this.tvTime = tvTime;
        this.imgUnread = imgUnread;
        this.imgTik = imgTik;
    }

    public Chat(int imgProfile, String tvName, String tvMessage, String tvTime) {
        this.imgProfile = imgProfile;
        this.tvName = tvName;
        this.tvMessage = tvMessage;
        this.tvTime = tvTime;
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

    public String getTvMessage() {
        return tvMessage;
    }

    public void setTvMessage(String tvMessage) {
        this.tvMessage = tvMessage;
    }

    public String getTvTime() {
        return tvTime;
    }

    public void setTvTime(String tvTime) {
        this.tvTime = tvTime;
    }


    public int getImgUnread() {
        return imgUnread;
    }

    public void setImgUnread(int imgUnread) {
        this.imgUnread = imgUnread;
    }

    public int getImgTik() {
        return imgTik;
    }

    public void setImgTik(int imgTik) {
        this.imgTik = imgTik;
    }
}
