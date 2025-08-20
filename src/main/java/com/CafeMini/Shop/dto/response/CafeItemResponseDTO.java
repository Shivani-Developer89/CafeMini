package com.CafeMini.Shop.dto.response;

import com.CafeMini.Shop.model.enums.*;
import lombok.Data;

@Data
public class CafeItemResponseDTO {
    private Long id;
    private ItemName itemName;
    private  String description;
    private Category category;
    private Size size;
    private SpicyLevel spicyLevel;
    private double price;
    private Available available;
}
