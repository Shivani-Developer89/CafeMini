package com.CafeMini.Shop.model;

import com.CafeMini.Shop.model.enums.ItemName;
import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "OrderItem")
public class OrderItem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private int quantity;
    private double itemPrice;

    // link to CafeItem
    @ManyToOne
    @JoinColumn(name = "cafe_item_id")
    private CafeItem cafeItem;

    // link to Order
    @ManyToOne
    @JoinColumn(name = "order_id")
    private Order order;
}




