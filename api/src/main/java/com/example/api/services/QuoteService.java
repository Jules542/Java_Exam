package com.example.api.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.api.models.Quote;
import com.example.api.repositories.QuoteRepository;

@Service
public class QuoteService {
    private final QuoteRepository quoteRepository;

    @Autowired
    public QuoteService(QuoteRepository quoteRepository) {
        this.quoteRepository = quoteRepository;
    }

    public Quote getRandomQuote() {
        return quoteRepository.getRandomQuote();
    }
}
