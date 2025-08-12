package com.CafeMini.Shop.dto.request;

import com.CafeMini.Shop.model.enums.ItemName;
import lombok.Data;

@Data
public class OrderItemRequestDTO {
    private ItemName itemName;
    private int quantity;
    private double itemPrice;
}
