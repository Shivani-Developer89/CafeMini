package com.CafeMini.Shop.service;

import com.CafeMini.Shop.dto.request.OrderItemRequestDTO;
import com.CafeMini.Shop.dto.response.OrderItemResponseDTO;
import com.CafeMini.Shop.model.OrderItem;
import com.CafeMini.Shop.repository.OrderItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class OrderItemServiceImpl  implements OrderItemService {
    @Autowired
    OrderItemRepository orderItemRepository;

    @Override
    public OrderItemResponseDTO addOrderItem(OrderItemRequestDTO orderItemRequestDTO) {
        OrderItem orderItem = new OrderItem();


        orderItem.setQuantity(orderItemRequestDTO.getQuantity());
        orderItem.setItemPrice(orderItemRequestDTO.getItemPrice());


        orderItem = orderItemRepository.save(orderItem);

        OrderItemResponseDTO orderItemResponseDTO = new OrderItemResponseDTO();

        orderItemResponseDTO.setId(orderItem.getId());
        orderItemResponseDTO.setQuantity(orderItem.getQuantity());
        orderItemResponseDTO.setItemPrice(orderItem.getItemPrice());


        return orderItemResponseDTO;
    }

    @Override
    public OrderItemResponseDTO getOrderItem(Long id) {
        OrderItem orderItem = orderItemRepository.findById(id).orElse(null);
        OrderItemResponseDTO orderItemResponseDTO = new OrderItemResponseDTO();

        orderItemResponseDTO.setId(orderItem.getId());
        orderItemResponseDTO.setQuantity(orderItem.getQuantity());
        orderItemResponseDTO.setItemPrice(orderItem.getItemPrice());

        return orderItemResponseDTO;
    }

    @Override
    public List<OrderItemResponseDTO> getAllOrderItem() {
        List<OrderItem> orderItemList = orderItemRepository.findAll();
        List<OrderItemResponseDTO> orderItemResponseDTOList = new ArrayList<>();

        for (OrderItem orderItem : orderItemList) {
            OrderItemResponseDTO orderItemResponseDTO = new OrderItemResponseDTO();
            orderItemResponseDTO.setId(orderItem.getId());
            orderItemResponseDTO.setQuantity(orderItem.getQuantity());
            orderItemResponseDTO.setItemPrice(orderItem.getItemPrice());


            orderItemResponseDTOList.add(orderItemResponseDTO);

        }
        return orderItemResponseDTOList;
    }

    @Override
    public OrderItemResponseDTO updateOrderItem(Long id, OrderItemRequestDTO orderItemRequestDTO) {
        OrderItem orderItem = new OrderItem();

        orderItem.setId(id);
        orderItem.setQuantity(orderItemRequestDTO.getQuantity());
        orderItem.setItemPrice(orderItemRequestDTO.getItemPrice());


        orderItem = orderItemRepository.save(orderItem);

        OrderItemResponseDTO orderItemResponseDTO = new OrderItemResponseDTO();

        orderItemResponseDTO.setId(orderItem.getId());
        orderItemResponseDTO.setQuantity(orderItem.getQuantity());
        orderItemResponseDTO.setItemPrice(orderItem.getItemPrice());

        return orderItemResponseDTO;

    }

    @Override
    public String removeOrderItem(Long id) {
        OrderItem orderItem = orderItemRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Order item not found with ID: " + id));

        String customerName = orderItem.getOrder().getCustomer().getName();

        orderItemRepository.deleteById(id);

        return "Order item with ID " + id + " for customer " + customerName + " has been deleted successfully.";
    }
}