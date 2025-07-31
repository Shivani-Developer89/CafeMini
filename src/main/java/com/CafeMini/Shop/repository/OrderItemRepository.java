package com.CafeMini.Shop.repository;

import com.CafeMini.Shop.model.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderItemRepository  extends JpaRepository <OrderItem , Long> {
}
