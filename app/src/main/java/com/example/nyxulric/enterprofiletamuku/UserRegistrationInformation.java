package com.example.nyxulric.enterprofiletamuku;

public class UserRegistrationInformation {
    public String email;
    public String password;
    public String imageAddress;
    public String username;

    public UserRegistrationInformation() {

    }

    public UserRegistrationInformation(String email, String password, String imageAddress, String username) {
        this.email = email;
        this.password = password;
        this.imageAddress = imageAddress;
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getImageAddress() {
        return imageAddress;
    }

    public void setImageAddress(String imageAddress) {
        this.imageAddress = imageAddress;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}

