package com.CafeMini.Shop.model;

import com.CafeMini.Shop.model.enums.*;
import jakarta.persistence.*;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

// Cafeitem(Menu items)
@Entity
@Data
@Table(name = "CafeItem")
public class CafeItem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;



    @Enumerated(EnumType.STRING)  // use enum instead of String
    private ItemName itemName;
    private  String description;

    @Enumerated(EnumType.STRING)
    private Category category;


    @Enumerated(EnumType.STRING)
    private Size size;


    @Enumerated(EnumType.STRING)
    private SpicyLevel spicyLevel;

    private double price;

    @Enumerated(EnumType.STRING)
    private Available available;

    @OneToMany(mappedBy = "cafeItem")
    private List<OrderItem> orderItems = new ArrayList<>();
}
