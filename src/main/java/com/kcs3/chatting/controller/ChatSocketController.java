package com.kcs3.chatting.controller;


import com.kcs3.chatting.dto.ChatMessageDto;
import com.kcs3.chatting.service.ChattingService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.messaging.handler.annotation.DestinationVariable;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

@Controller
@Slf4j
@RequiredArgsConstructor
public class ChatSocketController {
    private final ChattingService chattingService;
    @MessageMapping("/{roomId}")
    @SendTo("/room/{roomId}")
    public ChatMessageDto sendMessage(@DestinationVariable("roomId") Long roomId, @Payload ChatMessageDto chatMessageDto) {
        chattingService.saveChatting(roomId,chatMessageDto);
        return chatMessageDto;
    }
}
