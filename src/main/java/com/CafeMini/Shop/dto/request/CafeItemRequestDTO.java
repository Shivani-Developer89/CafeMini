package com.CafeMini.Shop.dto.request;

import com.CafeMini.Shop.model.enums.*;
import lombok.Data;

@Data
public class CafeItemRequestDTO {
    private ItemName itemName;
    private  String description;
    private Category category;
    private Size size;
    private SpicyLevel spicyLevel;
    private double price;
    private Available available;
}
