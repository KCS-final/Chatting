package com.kcs3.chatting.service;


import com.kcs3.chatting.dto.ChatBotItemListResponseDto;
import com.kcs3.chatting.entity.AuctionProgressItem;
import com.kcs3.chatting.repository.AuctionProgressItemRepository;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ChatBotItemllistService {

    @Autowired
    private AuctionProgressItemRepository auctionProgressItemRepository;

    public List<ChatBotItemListResponseDto> getChatBotItems() {
        List<AuctionProgressItem> auctionProgressItems = auctionProgressItemRepository.findAll();
        return auctionProgressItems.stream()
                .map(item -> new ChatBotItemListResponseDto(item.getItem().getItemId(), item.getItemTitle()))
                .collect(Collectors.toList());
    }
}
