package com.afifa.uas.model;

import com.google.gson.annotations.SerializedName;

public class PostPutDelUser {
    @SerializedName("status")
    String status;
    @SerializedName("result")
    User user;
    @SerializedName("message")
    String massage;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getMassage() {
        return massage;
    }

    public void setMassage(String massage) {
        this.massage = massage;
    }
}
