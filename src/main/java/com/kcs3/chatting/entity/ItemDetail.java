package com.kcs3.chatting.entity;

import com.kcs3.chatting.model.BaseEntity;
import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.DynamicUpdate;

import java.util.List;


@Entity
@Table(name = "ItemDetail")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@EqualsAndHashCode(callSuper = true)
@DynamicUpdate

public class ItemDetail extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="itemDetailId", nullable = false)
    private Long itemDetailId;

    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.REMOVE)
    @JoinColumn(name = "itemId", nullable = false)
    private Item item;

    @Column(nullable = false)
    private String itemDetailContent;

    @OneToMany(mappedBy = "itemDetail", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.LAZY)
    private List<ItemImage> images;

    @Override
    public String toString() {
        return "ItemDetail{" +
                "id=" + getItemDetailId() +  // BaseEntity에서 상속받은 ID
                ", content='" + itemDetailContent + '\'' +
                ", item=" + (item != null ? "Item[id=" + item.getItemId() + "]" : "null") +
                '}';
    }
}
