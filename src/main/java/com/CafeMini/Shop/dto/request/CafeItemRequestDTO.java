package com.CafeMini.Shop.dto.request;

import lombok.Data;

@Data
public class CafeItemRequestDTO {
    private String name;
    private  String description;
    private String category;
    private  String size;
    private  String SpicyLevel;
    private double price;
    private boolean available;
}
