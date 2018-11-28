package com.example.soyeonlee.myapplication2;

import android.widget.Button;
import android.widget.ToggleButton;

public class list_item {

    private int profile_img;
    private String user_name;
    private String date;
    private String content;
    private String like_num;
    private String comment_num;
    private ToggleButton like_button;
    private Button comment_button;

    public int getProfile_img() {
        return profile_img;
    }

    public void setProfile_img(int profile_img) {
        this.profile_img = profile_img;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getLike_num() {
        return like_num;
    }

    public void setLike_num(String like_num) {
        this.like_num = like_num;
    }

    public String getComment_num() {
        return comment_num;
    }

    public void setComment_num(String comment_num) {
        this.comment_num = comment_num;
    }

    public ToggleButton getLike_button() {
        return like_button;
    }

    public void setLike_button(ToggleButton like_button) {
        this.like_button = like_button;
    }

    public Button getComment_button() {
        return comment_button;
    }

    public void setComment_button(Button comment_button) {
        this.comment_button = comment_button;
    }

    public list_item(int profile_img, String user_name, String date, String content,
                     String like_num, String comment_num) {
        this.profile_img = profile_img;
        this.user_name = user_name;
        this.date = date;
        this.content = content;
        this.like_num = like_num;
        this.comment_num = comment_num;
      // this.like_button = like_button;
       // this.comment_button = comment_button;
    }
}
