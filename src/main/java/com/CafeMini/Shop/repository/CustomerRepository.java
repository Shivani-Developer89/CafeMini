package com.CafeMini.Shop.repository;

import com.CafeMini.Shop.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<Customer ,Long> {
}
