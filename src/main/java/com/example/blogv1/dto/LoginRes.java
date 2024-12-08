package com.example.blogv1.dto;

public class LoginRes {
    private String username;
    private String token;

    public LoginRes(String username, String token) {
        this.username = username;
        this.token = token;
    }

    public String getUsername() {
        return username;
    }

    public String getToken() {
        return token;
    }
}
