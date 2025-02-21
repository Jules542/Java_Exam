package com.example.api.repositories;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import java.util.List;
import org.springframework.jdbc.core.RowMapper;
import com.example.api.models.Quote;

@Repository
public class QuoteRepository {
    private final JdbcTemplate jdbcTemplate;

    public QuoteRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    // Mapper pour convertir les résultats SQL en objets User
    private final RowMapper<Quote> quoteRowMapper = (rs, rowNum) -> 
        new Quote(rs.getInt("id"), rs.getString("content"));


    public List<Quote> getAllQuote() {
        String sql = "SELECT id, content FROM quote";
        List<Quote> quotes = jdbcTemplate.query(sql, quoteRowMapper);
        return quotes;
    }
}
