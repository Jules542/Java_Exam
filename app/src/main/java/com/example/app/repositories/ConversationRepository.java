package com.example.app.repositories;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.example.app.models.Conversation;

@Repository
public class ConversationRepository {

    private final JdbcTemplate jdbcTemplate;

    public ConversationRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public void insertConv(Conversation conversation) {
        String sql = "INSERT INTO conversation (username, message, response_id, created_at) VALUES (?, ?, ?, ?)";
        jdbcTemplate.update(sql, conversation.getUsername(), conversation.getMessage(), conversation.getResponse_id(), LocalDateTime.now());
    };

    private final RowMapper<Conversation> conversationRowMapper = (rs, rowNum) -> 
        new Conversation(
            rs.getInt("id"),
            rs.getString("username"),
            rs.getString("message"),
            rs.getString("quote.content"),
            rs.getTimestamp("created_at").toLocalDateTime() // Conversion SQL Timestamp -> LocalDateTime
        );

    public List<Conversation> getAllConversations() {
        String sql = "SELECT conversation.id, username, message, quote.content, created_at FROM conversation INNER JOIN quote ON quote.id = conversation.response_id ORDER BY created_at DESC";
        return jdbcTemplate.query(sql, conversationRowMapper);
    }
}
