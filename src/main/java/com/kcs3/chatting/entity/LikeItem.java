
package com.kcs3.chatting.entity;

import com.kcs3.chatting.model.BaseEntity;
import jakarta.persistence.*;
import lombok.*;

@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@AllArgsConstructor
@Data  // Lombok을 통해 기본 메소드 자동 생성
@Entity
@Getter
@Table(name ="LikeItem")
public class LikeItem extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "likeId",nullable = false)
    private Long likeId;

    @ManyToOne( fetch = FetchType.LAZY) // 부모인자가 삭제되면 자동 삭제
    @JoinColumn(name ="userId")
    private User user;

    @ManyToOne( fetch = FetchType.LAZY) // 부모인자가 삭제되면 자동 삭제
    @JoinColumn (name="itemId")
    private Item item;

}