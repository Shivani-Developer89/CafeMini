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
        return new ResponseEntity<>(orderItemService.addOrderItem(orderItemRequestDTO), HttpStatusCode.valueOf(201));

    }
    @GetMapping("/{id}")
    public ResponseEntity<OrderItemResponseDTO> getOrder(@PathVariable Long id){
        return  new ResponseEntity<>(orderItemService.getOrderItem(id),HttpStatusCode.valueOf(200));
    }
    @GetMapping()
    public ResponseEntity<List> getAllOrder(){
        return new ResponseEntity<>(orderItemService.getAllOrderItem(),HttpStatusCode.valueOf(200));

    }
    @PutMapping("/{id}")
    public ResponseEntity<OrderItemResponseDTO> updateOrder(@PathVariable Long id ,@RequestBody OrderItemRequestDTO orderItemRequestDTO){
        return  new ResponseEntity<>(orderItemService.updateOrderItem(id,orderItemRequestDTO),HttpStatusCode.valueOf(200));

    }
    @DeleteMapping()
   public ResponseEntity<String> removeOrder(@RequestParam Long id){
        return new ResponseEntity<>(orderItemService.removeOrderItem(id),HttpStatusCode.valueOf(200));
    }
}
