package com.example.api.models;

public class Quote {
    private int id;
    private String content;

    public Quote(int id, String content) {
        this.id = id;
        this.content = content;
    }

    public int getId() {
        return id;
    }

    public String getQuote() {
        return content;
    }
}
