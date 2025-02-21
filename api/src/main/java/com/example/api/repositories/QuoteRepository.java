package com.example.api.repositories;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.Random;

import org.springframework.jdbc.core.RowMapper;
import com.example.api.models.Quote;

@Repository
public class QuoteRepository {
    private final JdbcTemplate jdbcTemplate;
    private final Random random = new Random();

    public QuoteRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    // Mapper pour convertir les résultats SQL en objets User
    private final RowMapper<Quote> quoteRowMapper = (rs, rowNum) -> 
        new Quote(rs.getInt("id"), rs.getString("content"));

    private int getQuoteCount() {
        String sql = "SELECT COUNT(*) FROM quote";
        return jdbcTemplate.queryForObject(sql, Integer.class);
    }

    public Quote getRandomQuote() {
        int quoteCount = getQuoteCount();

        int randomId = random.nextInt(quoteCount) + 1;

        String sql = "SELECT id, content FROM quote WHERE id = ?";
        return jdbcTemplate.query(sql, quoteRowMapper, randomId).stream().findFirst().orElse(new Quote(0, "Aucune citation trouvée."));
    }  
}
