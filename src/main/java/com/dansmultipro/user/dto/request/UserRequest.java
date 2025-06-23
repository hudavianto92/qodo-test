package com.dansmultipro.user.dto.request;

public class UserRequest {

    private String username;

    private String password;
    
    // Default constructor for deserialization
    public UserRequest() {
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public UserRequest(String username, String password) {
        this.username = username;
        this.password = password;
    }
}
