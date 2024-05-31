package com.kcs3.chatting.entity;



import com.kcs3.chatting.model.BaseEntity;
import jakarta.persistence.*;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Entity
@NoArgsConstructor
public class ChattingRoom extends BaseEntity {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="chattingRoomId", nullable = false)
    private Long chattingRoomId;

    @ManyToOne
    @JoinColumn(name = "buyerId")
    private User buyer;

    @ManyToOne
    @JoinColumn(name = "sellerId")
    private User seller;

    @OneToOne
    @JoinColumn(name = "auctionCompleteId")
    private AuctionCompleteItem auctionCompleteItem;

    @Builder
    public ChattingRoom(User buyer, User seller) {
        this.buyer = buyer;
        this.seller = seller;
    }
}
