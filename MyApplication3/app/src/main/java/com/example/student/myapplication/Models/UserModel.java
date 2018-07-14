package com.example.student.myapplication.Models;

import java.util.List;

/**
 * Created by Student on 7/14/2018.
 */

public class UserModel {
    private String name;
    private String imgUrl;
    private String description;
    private String phone;
    private String email;
    private List<MessageModel> messages;

    public UserModel(String name, String imgUrl, String description, String phone, String email, List<MessageModel> messages) {
        this.name = name;
        this.imgUrl = imgUrl;
        this.description = description;
        this.phone = phone;
        this.email = email;
        this.messages = messages;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<MessageModel> getMessages() {
        return messages;
    }

    public void setMessages(List<MessageModel> messages) {
        this.messages = messages;
    }
}
