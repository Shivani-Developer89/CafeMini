package com.CafeMini.Shop.service;

import com.CafeMini.Shop.dto.request.CafeItemRequestDTO;
import com.CafeMini.Shop.dto.request.CustomerRequestDTO;
import com.CafeMini.Shop.dto.response.CafeItemResponseDTO;
import com.CafeMini.Shop.dto.response.CustomerResponseDTO;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface CustomerService {
    CustomerResponseDTO addCustomer(CustomerRequestDTO customerRequestDTO);

    CustomerResponseDTO getCustomer(Long id);

    List<CustomerResponseDTO> getAllCustomers();

    CustomerResponseDTO updateCustomer(Long id, CustomerRequestDTO customerRequestDTO);

    String deleteCustomer(Long id);
}
