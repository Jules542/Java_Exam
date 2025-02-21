package com.example.app.repositories;

import java.time.LocalDateTime;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.app.models.Conversation;

@Repository
public class ConversationRepository {

    private final JdbcTemplate jdbcTemplate;

    public ConversationRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    // Méthode pour insérer une conversation dans la base de données
    public void insertConv(Conversation conversation) {
        String sql = "INSERT INTO conversation (username, message, response, created_at) VALUES (?, ?, ?, ?)";
        
        // Exécuter la requête SQL en passant les valeurs de la conversation
        jdbcTemplate.update(sql, conversation.getUsername(), conversation.getMessage(), conversation.getResponse(), LocalDateTime.now());
    }
}
