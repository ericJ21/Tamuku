package com.example.nyxulric.enterprofiletamuku;

public class UserRegistrationInformation {
    public String username;
    public String email;
    public String imageAddress;
    public String password;

    public UserRegistrationInformation(){

    }

    public UserRegistrationInformation(String username, String email, String imageAddress, String password) {
        this.username = username;
        this.email = email;
        this.imageAddress = imageAddress;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getImageAddress() {
        return imageAddress;
    }

    public void setImageAddress(String imageAddress) {
        this.imageAddress = imageAddress;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
