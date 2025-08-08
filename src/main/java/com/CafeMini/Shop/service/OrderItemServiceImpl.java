package com.CafeMini.Shop.service;

import com.CafeMini.Shop.dto.request.OrderItemRequestDTO;
import com.CafeMini.Shop.dto.response.OrderItemResponseDTO;
import com.CafeMini.Shop.model.OrderItem;
import com.CafeMini.Shop.repository.OrderItemRepository;
import org.hibernate.query.Order;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class OrderItemServiceImpl  implements OrderItemService{
    @Autowired
    OrderItemRepository orderItemRepository;
    @Override
    public OrderItemResponseDTO addOrder(OrderItemRequestDTO orderItemRequestDTO) {
        OrderItem orderItem = new OrderItem();

        orderItem.setQuantity(orderItemRequestDTO.getQuantity());
        orderItem.setItemPrice(orderItemRequestDTO.getItemPrice());

        orderItem =orderItemRepository.save(orderItem);

        OrderItemResponseDTO orderItemResponseDTO = new OrderItemResponseDTO();

        orderItemResponseDTO.setQuantity(orderItem.getQuantity());
        orderItemResponseDTO.setItemPrice(orderItem.getItemPrice());

        return orderItemResponseDTO;
    }

    @Override
    public OrderItemResponseDTO getOrder(Long id) {
        return null;
    }

    @Override
    public List<OrderItemResponseDTO> getAllOrder() {
        return List.of();
    }

    @Override
    public OrderItemResponseDTO updateOrder(Long id, OrderItemRequestDTO orderItemRequestDTO) {
        return null;
    }

    @Override
    public String removeOrder(Long id) {
        return "";
    }
}
