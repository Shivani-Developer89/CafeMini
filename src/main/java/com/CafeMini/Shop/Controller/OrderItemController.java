package com.CafeMini.Shop.Controller;

import com.CafeMini.Shop.dto.request.OrderItemRequestDTO;
import com.CafeMini.Shop.dto.response.OrderItemResponseDTO;

import com.CafeMini.Shop.service.OrderItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/OrderItem")
public class OrderItemController {
    @Autowired
    OrderItemService orderItemService;

    @PostMapping()
    public ResponseEntity<OrderItemResponseDTO> addOrder(@RequestBody OrderItemRequestDTO orderItemRequestDTO) {
        return new ResponseEntity<>(orderItemService.addOrder(orderItemRequestDTO), HttpStatusCode.valueOf(201));

    }
    @GetMapping("/{id}")
    public ResponseEntity<OrderItemResponseDTO> getOrder(@PathVariable Long id){
        return  new ResponseEntity<>(orderItemService.getOrder(id),HttpStatusCode.valueOf(200));
    }
    @GetMapping()
    public ResponseEntity<List> getAllOrder(){
        return new ResponseEntity<>(orderItemService.getAllOrder(),HttpStatusCode.valueOf(200));

    }
    @PutMapping("/{id}")
    public ResponseEntity<OrderItemResponseDTO> updateOrder(@PathVariable Long id ,@RequestBody OrderItemRequestDTO orderItemRequestDTO){
        return  new ResponseEntity<>(orderItemService.updateOrder(id,orderItemRequestDTO),HttpStatusCode.valueOf(200));

    }
    @DeleteMapping()
   public ResponseEntity<String> removeOrder(@RequestParam Long id){
        return new ResponseEntity<>(orderItemService.removeOrder(id),HttpStatusCode.valueOf(200));
    }
}
