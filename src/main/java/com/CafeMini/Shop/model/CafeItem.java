package com.CafeMini.Shop.model;

import jakarta.persistence.*;
import lombok.Data;

// Cafeitem(Menu items)
@Entity
@Data
@Table(name = "CafeItem")
public class CafeItem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    private String name;
    private  String description;

    @Enumerated(EnumType.STRING)
    private String category;


    @Enumerated(EnumType.STRING)
    private  String size;


    @Enumerated(EnumType.STRING)
    private  String SpicyLevel;
    private double price;
    private boolean available;
}
