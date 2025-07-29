package com.CafeMini.Shop.model;

import com.fasterxml.jackson.annotation.JsonTypeId;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
// Cafeitem(Menu items)
@Entity
public class CafeItem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private  String description;
    private String category;
    private  String size;
    private double price;
    private boolean available;
}
