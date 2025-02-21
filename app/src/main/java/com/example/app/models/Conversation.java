package com.example.app.models;

import java.time.LocalDateTime;

public class Conversation {

    private int id;

    private String username;
    private String message;
    private String response;
    private LocalDateTime createdAt = LocalDateTime.now();

    // Constructeurs, getters et setters
    public Conversation(String username, String message, String response) {
        this.username = username;
        this.message = message;
        this.response = response;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getResponse() {
        return response;
    }

    public void setResponse(String response) {
        this.response = response;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }
}
