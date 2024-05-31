package com.kcs3.chatting.entity;

import com.kcs3.chatting.model.BaseEntity;
import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.DynamicUpdate;


@Entity
@Table(name = "AuctionInfo")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@EqualsAndHashCode(callSuper = true)
@DynamicUpdate
public class AuctionInfo extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="auctionInfoId", nullable = false)
    private Long auctionInfoId;



    @ManyToOne(fetch= FetchType.LAZY)
    @JoinColumn(name = "userId")
    private User user;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="itemId")
    private Item item;

    @Column(nullable = false)
    private int bidPrice;
}
