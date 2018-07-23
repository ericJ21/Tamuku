package com.example.nyxulric.enterprofiletamuku;

import android.provider.ContactsContract;

import java.util.Date;

public class Message {

    private String text; // message body
    private String user;
    private long messageView;

    public Message(){

    }

    public Message(String text, String user) {
        this.text = text;
        this.user = user;
        messageView = new Date().getTime();
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public long getMessageView() {
        return messageView;
    }

    public void setMessageView(long messageView) {
        this.messageView = messageView;
    }
}
