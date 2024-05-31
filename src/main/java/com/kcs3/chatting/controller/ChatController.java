package com.kcs3.chatting.controller;


import com.kcs3.chatting.dto.ChatMessageDto;
import com.kcs3.chatting.dto.ChatRoomDto;
import com.kcs3.chatting.dto.ResponseDto;
import com.kcs3.chatting.service.ChattingService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


import java.util.List;

@RestController
@RequestMapping("/api/v1/auth/chat")
@RequiredArgsConstructor
@Log4j2
public class ChatController {

    private final ChattingService chattingService;

    @GetMapping("/rooms")
    public ResponseDto<List<ChatRoomDto>> getAllChatRooms() {
        List<ChatRoomDto> chatRooms = chattingService.getAllChatRooms();
        return ResponseDto.ok(chatRooms);
    }

    @GetMapping("/room/content")
    public ResponseDto<List<ChatMessageDto>> getChatRoomContents(@RequestParam Long roomId) {
        List<ChatMessageDto> chatContents = chattingService.getChatRoomContents(roomId);
        return ResponseDto.ok(chatContents);
    }

}
