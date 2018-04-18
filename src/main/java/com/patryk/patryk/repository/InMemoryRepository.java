package com.patryk.patryk.repository;

import com.patryk.patryk.model.Message;

import java.util.ArrayList;
import java.util.List;


public class InMemoryRepository implements MessageRepository {

    private final List<Message> messages = new ArrayList<>();

    @Override
    public List<Message> getMessages() {
        return new ArrayList<>(messages);
    }

    @Override
    public boolean saveMessage(String userId, String text) {
        Message message = new Message(userId,text);
        return messages.add(message);
    }

}
