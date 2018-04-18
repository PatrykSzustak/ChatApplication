package com.patryk.patryk.controller;


import com.patryk.patryk.model.Message;
import com.patryk.patryk.repository.InMemoryRepository;
import com.patryk.patryk.repository.MessageRepository;
import com.patryk.patryk.service.MessageService;
import com.patryk.patryk.service.MessageServiceImpl;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/messages")
public class MessageController {

    private final MessageService messageService;

    public MessageController() {
        this.messageService = new MessageServiceImpl(new InMemoryRepository());
    }


    @GetMapping("/")
    public List<Message> getMessages() {
        return messageService.getMessages();
    }

    @PostMapping("/")
    public boolean addMessages(@RequestBody Message message) {
        String text = message.getText();
        String userID = message.getUserId();
        return messageService.saveMessage(userID, text);
    }


}
