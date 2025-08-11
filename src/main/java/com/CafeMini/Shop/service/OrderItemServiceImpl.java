package com.CafeMini.Shop.service;

import com.CafeMini.Shop.dto.request.OrderItemRequestDTO;
import com.CafeMini.Shop.dto.response.OrderItemResponseDTO;
import com.CafeMini.Shop.model.OrderItem;
import com.CafeMini.Shop.repository.OrderItemRepository;
import org.hibernate.query.Order;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
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

        orderItemResponseDTO.setId(orderItem.getId());
        orderItemResponseDTO.setQuantity(orderItem.getQuantity());
        orderItemResponseDTO.setItemPrice(orderItem.getItemPrice());


        return orderItemResponseDTO;
    }

    @Override
    public OrderItemResponseDTO getOrder(Long id) {
        OrderItem orderItem =orderItemRepository.findById(id).orElse(null);
        OrderItemResponseDTO orderItemResponseDTO = new OrderItemResponseDTO();

        orderItemResponseDTO.setId(orderItem.getId());
        orderItemResponseDTO.setQuantity(orderItem.getQuantity());
        orderItemResponseDTO.setItemPrice(orderItem.getItemPrice());
        return orderItemResponseDTO;
    }

    @Override
    public List<OrderItemResponseDTO> getAllOrder() {
        List<OrderItem> orderItemList = orderItemRepository.findAll();
        List<OrderItemResponseDTO> orderItemResponseDTOList = new ArrayList<>();

        for(OrderItem orderItem :orderItemList){
            OrderItemResponseDTO orderItemResponseDTO =new OrderItemResponseDTO();
            orderItemResponseDTO.setId(orderItem.getId());
            orderItemResponseDTO.setQuantity(orderItem.getQuantity());
            orderItemResponseDTO.setItemPrice(orderItem.getItemPrice());

            orderItemResponseDTOList.add(orderItemResponseDTO);

        }
        return orderItemResponseDTOList;
    }

    @Override
    public OrderItemResponseDTO updateOrder(Long id, OrderItemRequestDTO orderItemRequestDTO) {
        OrderItem orderItem = new OrderItem();

        orderItem.setId(id);
        orderItem.setQuantity(orderItemRequestDTO.getQuantity());
        orderItem.setItemPrice(orderItemRequestDTO.getItemPrice());

        orderItem =orderItemRepository.save(orderItem);

        OrderItemResponseDTO orderItemResponseDTO = new OrderItemResponseDTO();

        orderItemResponseDTO.setId(orderItem.getId());
        orderItemResponseDTO.setQuantity(orderItem.getQuantity());
        orderItemResponseDTO.setItemPrice(orderItem.getItemPrice());

        return orderItemResponseDTO;

    }

    @Override
    public String removeOrder(Long id) {
        String name = orderItemRepository.findById(id).orElse(null).getItemName();
        return "Order item with ID "+ id + " has been deleted successfully;";
    }
}
