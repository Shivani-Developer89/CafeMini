package com.CafeMini.Shop.dto.request;

import lombok.Data;

@Data
public class OrderItemRequestDTO {
    private int quantity;
    private double itemPrice;
}
