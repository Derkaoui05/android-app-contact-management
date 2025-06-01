package com.example.tp3;

public class Contact {
    private int userId;
    private String username, userAddress, userPhone;

    public Contact(int userId, String username, String userAddress, String userPhone) {
        this.userId = userId;
        this.username = username;
        this.userAddress = userAddress;
        this.userPhone = userPhone;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUserAddress() {
        return userAddress;
    }

    public void setUserAddress(String userAddress) {
        this.userAddress = userAddress;
    }

    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "Id=" + userId +
                ", username='" + username + '\'' +
                ", address='" + userAddress + '\'' +
                ", phone='" + userPhone + '\'' +
                '}';
    }
}

