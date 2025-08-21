package com.CafeMini.Shop.service;

import com.CafeMini.Shop.dto.request.OrderItemRequestDTO;
import com.CafeMini.Shop.dto.response.OrderResponseDTO;
import org.springframework.stereotype.Service;

@Service
public interface OrderService {

    OrderResponseDTO createOrder(OrderItemRequestDTO orderItemRequestDTO);
    OrderResponseDTO getOrder(Long id);
    OrderResponseDTO getAllOrder();
    OrderResponseDTO updateOrder(Long id , OrderResponseDTO orderResponseDTO);
    String removeOrder(Long id);
}
