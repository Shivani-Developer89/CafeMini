package com.CafeMini.Shop.service;

import com.CafeMini.Shop.dto.request.CafeItemRequestDTO;
import com.CafeMini.Shop.dto.response.CafeItemResponseDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CafeItemService  {
    CafeItemResponseDTO getCafeItem(Long id);
    CafeItemResponseDTO addCafeItem(CafeItemRequestDTO cafeItemRequestDTO);
    CafeItemResponseDTO updateCafeItem(Long id ,CafeItemRequestDTO cafeItemRequestDTO);
    List<CafeItemResponseDTO> getAllCafeItem();
    String removeCafeItem(Long id);
}
