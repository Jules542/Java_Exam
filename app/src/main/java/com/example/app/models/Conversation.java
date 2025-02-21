package com.example.app.models;

import java.time.LocalDateTime;

public class Conversation {

    private int id;

    private String username;
    private String message;
    private int response_id;
    private String response;
    private LocalDateTime createdAt;

    // Constructeur pour l'insertion
    public Conversation(String username, String message, int response_id) {
        this.username = username;
        this.message = message;
        this.response_id = response_id;
        this.createdAt = LocalDateTime.now();
    }

    // Constructeur pour la récupération avec le created_at
    public Conversation(int id, String username, String message, String response, LocalDateTime createdAt) {
        this.id = id;
        this.username = username;
        this.message = message;
        this.response = response;
        this.createdAt = createdAt;
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

    public int getResponse_id() {
        return response_id;
    }

    public void setResponse_id(int response_id) {
        this.response_id = response_id;
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
