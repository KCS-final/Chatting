package com.kcs3.chatting.repository;



import com.kcs3.chatting.entity.ChattingRoom;
import com.kcs3.chatting.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ChattingRoomRepository extends JpaRepository<ChattingRoom,Long> {
    List<ChattingRoom> findByBuyerOrSeller(User buyer, User seller);
}
