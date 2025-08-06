package com.CafeMini.Shop.service;

import com.CafeMini.Shop.dto.request.CustomerRequestDTO;
import com.CafeMini.Shop.dto.response.CustomerResponseDTO;
import com.CafeMini.Shop.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServiceImpl  implements CustomerService{
   @Autowired
    CustomerRepository customerRepository;

    @Override
    public CustomerResponseDTO createCustomer(CustomerRequestDTO customerRequestDTO) {
        return null;
    }

    @Override
    public CustomerResponseDTO getCustomer(Long id) {
        return null;
    }

    @Override
    public List<CustomerResponseDTO> getAllCustomers() {
        return List.of();
    }

    @Override
    public CustomerResponseDTO updateCustomer(Long id, CustomerRequestDTO customerRequestDTO) {
        return null;
    }

    @Override
    public void deleteCustomer(Long id) {

    }
}
