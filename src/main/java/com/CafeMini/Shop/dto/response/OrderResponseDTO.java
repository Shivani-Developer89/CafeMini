package com.CafeMini.Shop.dto.response;

import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;
@Data
public class OrderResponseDTO {

        private Long id;
        private String customerName;
        private List<OrderItemResponseDTO> orderItems;
        private LocalDateTime orderDate;
        private double totalPrice;
    }


