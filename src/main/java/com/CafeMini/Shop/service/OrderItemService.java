package com.CafeMini.Shop.service;

import com.CafeMini.Shop.dto.request.OrderItemRequestDTO;
import com.CafeMini.Shop.dto.response.OrderItemResponseDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface OrderItemService {
    OrderItemResponseDTO addOrder(OrderItemRequestDTO orderItemRequestDTO);
    OrderItemResponseDTO getOrder(Long id);
   List <OrderItemResponseDTO>getAllOrder();
   OrderItemResponseDTO updateOrder(Long id ,OrderItemRequestDTO orderItemRequestDTO);
   String removeOrder(Long id);


}
