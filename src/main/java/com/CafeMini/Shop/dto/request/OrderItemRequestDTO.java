package com.CafeMini.Shop.dto.request;

import lombok.Data;

@Data
public class OrderItemRequestDTO {
    private String itemName;
    private int quantity;
    private double itemPrice;
}
