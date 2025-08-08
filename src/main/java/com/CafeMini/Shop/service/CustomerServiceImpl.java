package com.CafeMini.Shop.service;

import com.CafeMini.Shop.dto.request.CafeItemRequestDTO;
import com.CafeMini.Shop.dto.request.CustomerRequestDTO;
import com.CafeMini.Shop.dto.response.CafeItemResponseDTO;
import com.CafeMini.Shop.dto.response.CustomerResponseDTO;
import com.CafeMini.Shop.model.Customer;
import com.CafeMini.Shop.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CustomerServiceImpl  implements CustomerService{
   @Autowired
    CustomerRepository customerRepository;

    @Override
    public CustomerResponseDTO addCustomer(CustomerRequestDTO customerRequestDTO) {
        Customer customer = new Customer();

        customer.setName(customerRequestDTO.getName());
        customer.setEmail(customerRequestDTO.getEmail());
        customer.setPhone(customerRequestDTO.getPhone());

        customer  = customerRepository.save(customer);

        CustomerResponseDTO customerResponseDTO = new CustomerResponseDTO();

        customerResponseDTO.setName(customer.getName());
        customerResponseDTO.setEmail(customer.getEmail());
        customerResponseDTO.setPhone(customer.getPhone());

        return customerResponseDTO;

    }

    @Override
    public CustomerResponseDTO getCustomer(Long id) {
        Customer customer = customerRepository.findById(id).orElse(null);

        CustomerResponseDTO customerResponseDTO = new CustomerResponseDTO();

        customerResponseDTO.setId(customer.getId());
        customerResponseDTO.setName(customer.getName());
        customerResponseDTO.setEmail(customer.getEmail());
        customerResponseDTO.setPhone(customer.getPhone());

        return  customerResponseDTO;

    }

    @Override
    public List<CustomerResponseDTO> getAllCustomers() {

        List<Customer> customerList =customerRepository.findAll();
        List<CustomerResponseDTO> customerResponseDTOList = new ArrayList<>();

        for(Customer customer : customerList){
            CustomerResponseDTO customerResponseDTO = new CustomerResponseDTO();

            customerResponseDTO.setId(customer.getId());
            customerResponseDTO.setName(customer.getName());
            customerResponseDTO.setEmail(customer.getEmail());
            customerResponseDTO.setPhone(customer.getPhone());

            customerResponseDTOList.add(customerResponseDTO);

        }
       return customerResponseDTOList;
    }

    @Override
    public CustomerResponseDTO updateCustomer(Long id, CustomerRequestDTO customerRequestDTO) {
        Customer customer = new Customer();

        customer.setName(customerRequestDTO.getName());
        customer.setEmail(customerRequestDTO.getEmail());
        customer.setPhone(customerRequestDTO.getPhone());

        customer  = customerRepository.save(customer);

        CustomerResponseDTO customerResponseDTO = new CustomerResponseDTO();

        customerResponseDTO.setName(customer.getName());
        customerResponseDTO.setEmail(customer.getEmail());
        customerResponseDTO.setPhone(customer.getPhone());

        return customerResponseDTO;


    }


    @Override
    public String deleteCustomer(Long id) {
    String name = customerRepository.findById(id).orElse(null).getName();
    customerRepository.deleteById(id);
    return  " Customer name : " + name + " and ID: " +id + "has been removed successfully!";


    }
}
