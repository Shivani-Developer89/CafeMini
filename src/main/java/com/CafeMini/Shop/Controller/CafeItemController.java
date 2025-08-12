package com.CafeMini.Shop.Controller;

import com.CafeMini.Shop.dto.request.CafeItemRequestDTO;
import com.CafeMini.Shop.dto.response.CafeItemResponseDTO;
import com.CafeMini.Shop.service.CafeItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/CafeItem")
public class CafeItemController {
    @Autowired
    CafeItemService cafeItemService;

    @GetMapping("/{id}")
    public ResponseEntity<CafeItemResponseDTO> getCafeItem(@PathVariable Long id ){
     return  new ResponseEntity<>(cafeItemService.getCafeItem(id), HttpStatusCode.valueOf(200));
       }

     @PostMapping()
    public ResponseEntity<CafeItemResponseDTO>  addCafeItem(@RequestBody CafeItemRequestDTO cafeItemRequestDTO){
        return  new ResponseEntity<>(cafeItemService.addCafeItem(cafeItemRequestDTO),HttpStatusCode.valueOf(201));
    }

    @PutMapping("/{id}")
    public ResponseEntity<CafeItemResponseDTO> updateCafeItem(@PathVariable Long id, @RequestBody CafeItemRequestDTO cafeItemRequestDTO){
        return new ResponseEntity<>(cafeItemService.updateCafeItem(id,cafeItemRequestDTO),HttpStatusCode.valueOf(200));

    }
    @GetMapping("/all")
    public ResponseEntity<List>  getAllCafeItem(){
        return  new ResponseEntity<>(cafeItemService.getAllCafeItem(),HttpStatusCode.valueOf(200));

    }

    @DeleteMapping()
    public ResponseEntity<String> removeCafeItem(@RequestParam Long id){
        return  new ResponseEntity<>(cafeItemService.removeCafeItem(id),HttpStatusCode.valueOf(200));
    }

}
