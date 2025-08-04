package com.CafeMini.Shop.service;

import com.CafeMini.Shop.dto.request.CafeItemRequestDTO;
import com.CafeMini.Shop.dto.response.CafeItemResponseDTO;
import com.CafeMini.Shop.model.CafeItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@S
public interface CafeItemService  {
    CafeItemResponseDTO getCafeItem(Long id);
    CafeItemResponseDTO createCafeItem(CafeItemRequestDTO cafeItemRequestDTO);
    CafeItemResponseDTO updateCafeItem(CafeItemRequestDTO cafeItemRequestDTO);
    List<CafeItemResponseDTO> getAllCafeItem(CafeItemRequestDTO cafeItemRequestDTO);
    String removeCafeItem(Long id);
}
