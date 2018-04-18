package com.patryk.patryk.service;

import com.patryk.patryk.model.Message;
import com.patryk.patryk.repository.MessageRepository;
import lombok.AllArgsConstructor;

import java.util.List;

@AllArgsConstructor
public class MessageServiceImpl implements MessageService {

    private final MessageRepository messageRepository;

    @Override
    public List<Message> getMessages() {
        return messageRepository.getMessages();
    }

    @Override
    public boolean saveMessage(String userId, String text) {
        return messageRepository.saveMessage(userId, text);
    }
}
