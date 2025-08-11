package com.chat.app.controller;

import com.chat.app.model.ChatMessage;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

//@Controller
//public class ChatController {
//    @MessageMapping("/sendMessage")//this send message to connected clients to "topic"
//    @SendTo("/topic/sendMessage")
////send to specific chat room
//    public ChatMessage sendMessage(ChatMessage message){
//         return message;
//     }
//    @GetMapping("chat")
//    public String chat(){
//        return "chat";
//    }
//}

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ChatController {

    @MessageMapping("/sendMessage")
    @SendTo("/topic/messages")
    public ChatMessage sendMessage(ChatMessage message) {
        return message; // Echo message to all
    }

    @GetMapping("/chat")
    public String chat() {
        return "chat"; // Loads chat.html
    }
}
