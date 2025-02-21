package com.example.app.controllers;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;

import com.example.app.models.Conversation;
import com.example.app.models.Quote;
import com.example.app.services.ConversationService;

@Controller
public class MainController {

    private final RestTemplate restTemplate = new RestTemplate();
    private final String API_URL = "http://localhost:8080/quote"; // URL de l'API pour récupérer la citation

    private final ConversationService conversationService;

    public MainController(ConversationService conversationService) {
        this.conversationService = conversationService;
    }

    @PostMapping("/conversation")
    public String conversation(@RequestParam("username") String username,
                               @RequestParam("message") String message,
                               Model model) {

        Quote quote = restTemplate.getForObject(API_URL, Quote.class);

        Conversation conversation = new Conversation(username, message, quote.getId());
        conversationService.saveConversation(conversation);

        model.addAttribute("quote", quote);
        model.addAttribute("username", username);
        model.addAttribute("userMessage", message);

        return "index";
    }

    @GetMapping("/historique")
    public String historique(Model model) {
        List<Conversation> conversations = conversationService.getAllConversations();
        model.addAttribute("conversations", conversations);
        return "historique";
    }
}
