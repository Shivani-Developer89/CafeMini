package com.CafeMini.Shop.Controller;

import com.CafeMini.Shop.dto.request.CustomerRequestDTO;
import com.CafeMini.Shop.dto.response.CustomerResponseDTO;
import com.CafeMini.Shop.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Customer")
public class CustomerController {

    @Autowired
    CustomerService customerService;

    @PostMapping()
    public ResponseEntity<CustomerResponseDTO> addCustomer(@RequestBody CustomerRequestDTO customerRequestDTO){
        return new ResponseEntity<>(customerService.addCustomer(customerRequestDTO),HttpStatusCode.valueOf(201));

    }
    @GetMapping("/{id}")
    public ResponseEntity<CustomerResponseDTO> getCustomer(@PathVariable Long id){
        return  new ResponseEntity<>(customerService.getCustomer(id),HttpStatusCode.valueOf(200));

    }

    @GetMapping("/all")
    public ResponseEntity<List> getAllCustomer(){
        return new ResponseEntity<>(customerService.getAllCustomers(),HttpStatusCode.valueOf(200));
    }
    @PutMapping("{id}")
    public  ResponseEntity<CustomerResponseDTO> updateCustomer(@PathVariable Long id, @RequestBody CustomerRequestDTO customerRequestDTO){
        return  new ResponseEntity<>(customerService.updateCustomer(id, customerRequestDTO),HttpStatusCode.valueOf(200));
    }

    @DeleteMapping()
    public ResponseEntity<String> deleteCustomer(@RequestParam Long id){
        return  new ResponseEntity<>(customerService.deleteCustomer(id),HttpStatusCode.valueOf(200));

    }

}
