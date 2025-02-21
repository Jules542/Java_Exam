package com.example.api.controllers;

import java.util.List;

import com.example.api.models.Quote;
import com.example.api.services.QuoteService;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
public class QuoteController {
    private final QuoteService quoteService;

    public QuoteController(QuoteService quoteService) {
        this.quoteService = quoteService;
    }

    @GetMapping("/quote")
    public List<Quote> getQuote() {
        return quoteService.getQuote();
    }
}
