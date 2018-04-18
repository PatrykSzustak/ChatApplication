package com.patryk.patryk.service;

import com.patryk.patryk.model.Message;

import java.util.List;

public interface MessageService {

    List<Message> getMessages();

    boolean saveMessage(String userId, String text);
}
