package com.example.app.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.client.RestTemplate;

import com.example.app.models.Quote;

@Controller
public class MainController {

    private final RestTemplate restTemplate = new RestTemplate();
    private final String API_URL = "http://localhost:8080/quote";

    @GetMapping("/")
    public String index(Model model) {
        Quote quote = restTemplate.getForObject(API_URL, Quote.class);
        
        model.addAttribute("quote", quote);
        
        return "index";
    }
}
