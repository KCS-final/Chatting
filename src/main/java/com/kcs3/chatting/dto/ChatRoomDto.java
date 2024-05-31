package com.kcs3.chatting.dto;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Builder
public class ChatRoomDto {
    private Long roomId;
    private String chatTitle;
    private String recentContent;
    private String username;
    private LocalDateTime recentDateTime;
}
