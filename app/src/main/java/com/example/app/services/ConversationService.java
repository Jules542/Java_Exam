package com.example.app.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.app.models.Conversation;
import com.example.app.repositories.ConversationRepository;

@Service
public class ConversationService {

    private final ConversationRepository conversationRepository;

    public ConversationService(ConversationRepository conversationRepository) {
        this.conversationRepository = conversationRepository;
    }

    // Méthode pour enregistrer une conversation dans la base de données
    public void saveConversation(Conversation conversation) {
        conversationRepository.insertConv(conversation);
    }

    public List<Conversation> getAllConversations() {
        return conversationRepository.getAllConversations();
    }
}
