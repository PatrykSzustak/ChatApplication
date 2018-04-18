package com.patryk.patryk.repository;

import com.patryk.patryk.model.Message;

import java.util.List;

public interface MessageRepository {

    List<Message> getMessages();

    boolean saveMessage(String userId, String text);
}
