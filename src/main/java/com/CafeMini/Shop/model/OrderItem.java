package com.CafeMini.Shop.model;

import com.CafeMini.Shop.model.enums.ItemName;
import jakarta.persistence.*;
import lombok.Data;



@Entity
@Data
@Table(name = "OrderItem")
public class OrderItem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Enumerated(EnumType.STRING)
    private ItemName itemName;
    private int quantity;
    private double itemPrice;


}
