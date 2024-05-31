package com.kcs3.chatting.repository;


import com.kcs3.chatting.entity.ChattingContent;
import com.kcs3.chatting.entity.ChattingRoom;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ChattingContentRepository extends JpaRepository<ChattingContent,Long> {
    List<ChattingContent> findByChattingRoom(ChattingRoom chattingRoom);

    ChattingContent findTopByChattingRoomOrderByCreatedAtDesc(ChattingRoom chattingRoom);
}
