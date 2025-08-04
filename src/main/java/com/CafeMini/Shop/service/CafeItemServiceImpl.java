package com.CafeMini.Shop.service;

import com.CafeMini.Shop.dto.request.CafeItemRequestDTO;
import com.CafeMini.Shop.dto.response.CafeItemResponseDTO;
import com.CafeMini.Shop.model.CafeItem;
import com.CafeMini.Shop.repository.CafeItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

@Service
public class CafeItemServiceImpl  implements  CafeItemService{
    @Override
    public CafeItemResponseDTO getCafeItem(Long id) {
        return null;
    }

    @Override
    public CafeItemResponseDTO createCafeItem(CafeItemRequestDTO cafeItemRequestDTO) {
        return null;
    }

    @Override
    public CafeItemResponseDTO updateCafeItem(CafeItemRequestDTO cafeItemRequestDTO) {
        return null;
    }

    @Override
    public List<CafeItemResponseDTO> getAllCafeItem(CafeItemRequestDTO cafeItemRequestDTO) {
        return List.of();
    }

    @Override
    public String removeCafeItem(Long id) {
        return "";
    }
}

