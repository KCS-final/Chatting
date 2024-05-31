package com.kcs3.chatting.entity;

import com.kcs3.chatting.model.BaseEntity;
import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.DynamicUpdate;

import java.time.LocalDateTime;


@Entity
@Table(name = "AuctionCompleteItem")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@EqualsAndHashCode(callSuper = true)
@DynamicUpdate
public class AuctionCompleteItem extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="auctionCompleteItemId", nullable = false)
    private Long auctionCompleteItemId;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "itemId", nullable = false)
    private Item item;

    @Column(nullable = false)
    private String itemTitle;

    @Column(nullable = false)
    private String thumbnail;

    @Column(nullable = false)
    private int startPrice;
    private int buyNowPrice;

    @Column(nullable = false)
    private LocalDateTime bidFinishTime;

    @Column(nullable = false)
    private String location;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "userId")
    private User user;
    private String maxPersonNickName;
    private Integer maxPrice;

    @Column(nullable = false)
    private boolean isBidComplete;
}
