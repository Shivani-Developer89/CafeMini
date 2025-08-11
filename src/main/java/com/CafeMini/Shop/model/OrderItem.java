package com.CafeMini.Shop.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "OrderItem")
public class OrderItem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String itemName;
    private int quantity;
    private double itemPrice;
}
