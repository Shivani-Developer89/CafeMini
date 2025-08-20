package com.CafeMini.Shop.dto.response;

import com.CafeMini.Shop.model.enums.ItemName;
import lombok.Data;

@Data
public class OrderItemResponseDTO {
    private Long id;
    private ItemName orderItemName;
    private int quantity;
    private double itemPrice;
}
