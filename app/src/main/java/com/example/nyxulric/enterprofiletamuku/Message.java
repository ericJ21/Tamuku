package com.example.nyxulric.enterprofiletamuku;

public class Message {

    private String text; // message body
    //private MemberData data; // data of the user that sent this message
    private boolean belongsToCurrentUser; // is this message sent by us?

    public Message() {
        this.text = text;
      //  this.data = data;
        this.belongsToCurrentUser = belongsToCurrentUser;
    }

    public String getText() {
        return text;
    }

    public boolean isBelongsToCurrentUser() {
        return belongsToCurrentUser;
    }
}
