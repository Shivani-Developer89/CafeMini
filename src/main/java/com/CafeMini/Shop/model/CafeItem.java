package com.CafeMini.Shop.model;

import com.CafeMini.Shop.model.enums.Available;
import com.CafeMini.Shop.model.enums.Category;
import com.CafeMini.Shop.model.enums.Size;
import com.CafeMini.Shop.model.enums.SpicyLevel;
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
    private Category category;


    @Enumerated(EnumType.STRING)
    private Size size;


    @Enumerated(EnumType.STRING)
    private SpicyLevel spicyLevel;
    private double price;
    @Enumerated(EnumType.STRING)
    private Available available;
}
