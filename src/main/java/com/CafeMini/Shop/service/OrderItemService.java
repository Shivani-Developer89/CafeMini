package com.CafeMini.Shop.service;

import com.CafeMini.Shop.dto.request.OrderItemRequestDTO;
import com.CafeMini.Shop.dto.response.OrderItemResponseDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface OrderItemService {
    OrderItemResponseDTO addOrderItem(OrderItemRequestDTO orderItemRequestDTO);
    OrderItemResponseDTO getOrderItem(Long id);
   List <OrderItemResponseDTO>getAllOrderItem();
   OrderItemResponseDTO updateOrderItem(Long id ,OrderItemRequestDTO orderItemRequestDTO);
   String removeOrderItem(Long id);


}
