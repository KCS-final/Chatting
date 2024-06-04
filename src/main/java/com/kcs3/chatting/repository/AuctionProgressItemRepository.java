package com.kcs3.chatting.repository;

import com.kcs3.chatting.entity.AuctionProgressItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuctionProgressItemRepository extends JpaRepository<AuctionProgressItem, Long> {
}

