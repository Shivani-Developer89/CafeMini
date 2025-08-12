package com.CafeMini.Shop.dto.request;

import com.CafeMini.Shop.model.enums.Available;
import com.CafeMini.Shop.model.enums.Category;
import com.CafeMini.Shop.model.enums.Size;
import com.CafeMini.Shop.model.enums.SpicyLevel;
import lombok.Data;

@Data
public class CafeItemRequestDTO {
    private String name;
    private  String description;
    private Category category;
    private Size size;
    private SpicyLevel spicyLevel;
    private double price;
    private Available available;
}
