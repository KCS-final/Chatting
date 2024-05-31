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
public class ChattingContent extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="chattingContentId", nullable = false)
    private Long chattingContentId;

    @ManyToOne
    @JoinColumn(foreignKey = @ForeignKey(ConstraintMode.NO_CONSTRAINT))
    private ChattingRoom chattingRoom;

    private Long chatUserId;

    private String chatContent;

    @Builder
    public ChattingContent(ChattingRoom chattingRoom,Long chatUserId, String chatContent){
        this.chattingRoom = chattingRoom;
        this.chatUserId = chatUserId;
        this.chatContent = chatContent;
    }


}
