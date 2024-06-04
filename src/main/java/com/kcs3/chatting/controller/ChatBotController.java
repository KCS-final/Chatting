package com.kcs3.chatting.controller;

import com.kcs3.chatting.dto.ChatBotItemListResponseDto;
import com.kcs3.chatting.service.ChatBotItemllistService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/no-auth/chatBot")
public class ChatBotController {

    @Autowired
    private ChatBotItemllistService chatBotItemllistService;

    @GetMapping
    public List<ChatBotItemListResponseDto> getChatBotItems() {
        return chatBotItemllistService.getChatBotItems();
    }
}
