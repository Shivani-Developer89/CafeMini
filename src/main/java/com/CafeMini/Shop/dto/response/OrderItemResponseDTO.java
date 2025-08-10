package com.CafeMini.Shop.dto.response;

import lombok.Data;

@Data
public class OrderItemResponseDTO {
    private Long id;
    private String itemName;
    private int quantity;
    private double itemPrice;
}
