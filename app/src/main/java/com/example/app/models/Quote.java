package com.example.app.models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Quote {
    private int id;

    @JsonProperty("quote")
    private String content;

    // Constructeurs vides requis par Spring
    public Quote() {}

    public Quote(int id, String content) {
        this.id = id;
        this.content = content;
    }

    // Getters et Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
