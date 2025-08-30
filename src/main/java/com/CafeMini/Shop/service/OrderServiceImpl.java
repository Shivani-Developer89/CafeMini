package com.CafeMini.Shop.service;

import com.CafeMini.Shop.dto.request.OrderRequestDTO;
import com.CafeMini.Shop.dto.response.OrderResponseDTO;
import com.CafeMini.Shop.model.CafeItem;
import com.CafeMini.Shop.model.Customer;
import com.CafeMini.Shop.model.Order;
import com.CafeMini.Shop.model.OrderItem;
import com.CafeMini.Shop.repository.CafeItemRepository;
import com.CafeMini.Shop.repository.CustomerRepository;
import com.CafeMini.Shop.repository.OrderRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderServiceImpl implements OrderService{


    private  final OrderRepository orderRepository;
    private final CustomerRepository customerRepository;
    private final CafeItemRepository cafeItemRepository;

    public OrderServiceImpl(OrderRepository  orderRepository,
                            CustomerRepository customerRepository,
                            CafeItemRepository cafeItemRepository) {
        this.orderRepository = orderRepository;
        this.customerRepository = customerRepository;
        this.cafeItemRepository = cafeItemRepository;
    }
    @Override
    public OrderResponseDTO createOrder(OrderRequestDTO orderRequestDTO) {
        Customer customer = customerRepository.findByName(orderRequestDTO.getCustomerName())
                .orElse(null);
        if (customer == null) return null;

        Order order = new Order();
        order.setCustomer(customer);
        order.setOrderDate(orderRequestDTO.getOrderDate());

        // Convert DTO -> Entity list
        List<OrderItem> orderItems = orderRequestDTO.getOrderItems()
                .stream()
                .map(dto -> {
                    CafeItem cafeItem = cafeItemRepository.findById(dto.OrderItemName())
                            .orElse(null);

                    OrderItem orderItem = new OrderItem();
                    orderItem.setOrder(order);
                    orderItem.setCafeItemId(cafeItem);
                    orderItem.setQuantity(dto.getQuantity());
                    return orderItem;
                })
                .toList();

        order.setOrderItems(orderItems);

        // Save order
        orderRepository.save(order);

        // Build response DTO
        OrderResponseDTO response = new OrderResponseDTO();
        response.setOrderId(order.getId());
        response.setCustomerName(customer.getName());
        response.setOrderDate(order.getOrderDate());
        return response;
    }


    @Override
    public OrderResponseDTO getOrder(Long id) {
        return null;
    }

    @Override
    public OrderResponseDTO getAllOrder() {
        return null;
    }

    @Override
    public OrderResponseDTO updateOrder(Long id, OrderResponseDTO orderResponseDTO) {
        return null;
    }

    @Override
    public String removeOrder(Long id) {
        return "";
    }
}

