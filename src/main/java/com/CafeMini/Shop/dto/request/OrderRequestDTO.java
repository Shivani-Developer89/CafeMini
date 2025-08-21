package com.CafeMini.Shop.dto.request;

import com.CafeMini.Shop.dto.response.OrderItemResponseDTO;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;

@Data
public class OrderRequestDTO {
        private Long id;
        private String customerName;
        private List<OrderItemRequestDTO> orderItems;
        private LocalDateTime orderDate;
        private double totalPrice;



}
