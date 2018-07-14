package com.example.student.myapplication.Models;

/**
 * Created by Student on 7/14/2018.
 */

public class MessageModel {
    private String text;
    private boolean isMine;

    public MessageModel(String text, boolean isMine) {
        this.text = text;
        this.isMine = isMine;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public boolean isMine() {
        return isMine;
    }

    public void setMine(boolean mine) {
        isMine = mine;
    }
}
