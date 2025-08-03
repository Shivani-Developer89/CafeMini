package com.CafeMini.Shop.service;

import com.CafeMini.Shop.dto.request.CafeItemRequestDTO;
import com.CafeMini.Shop.dto.response.CafeItemResponseDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CafeItemService {
    CafeItemResponseDTO createCafeItem(CafeItemRequestDTO cafeItemRequestDTO);
    CafeItemResponseDTO getCafeItem(CafeItemRequestDTO cafeItemRequestDTO);
    CafeItemResponseDTO updateCafeItem(CafeItemRequestDTO cafeItemRequestDTO);
    List<CafeItemResponseDTO> getAllCafeItem(CafeItemRequestDTO cafeItemRequestDTO);
    String removeCafeItem(Long id);
}
