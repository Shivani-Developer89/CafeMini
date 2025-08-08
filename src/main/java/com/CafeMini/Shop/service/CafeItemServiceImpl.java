package com.CafeMini.Shop.service;

import com.CafeMini.Shop.dto.request.CafeItemRequestDTO;
import com.CafeMini.Shop.dto.response.CafeItemResponseDTO;
import com.CafeMini.Shop.model.CafeItem;
import com.CafeMini.Shop.repository.CafeItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CafeItemServiceImpl  implements  CafeItemService{
    @Autowired
    CafeItemRepository cafeItemRepository;
    @Override
    public CafeItemResponseDTO getCafeItem(Long id) {
        CafeItem cafeItem = cafeItemRepository.findById(id).orElse(null);

        CafeItemResponseDTO cafeItemResponseDTO = new CafeItemResponseDTO();

        cafeItemResponseDTO.setId(cafeItem.getId());
        cafeItemResponseDTO.setName(cafeItem.getName());
        cafeItemResponseDTO.setDescription(cafeItem.getDescription());
        cafeItemResponseDTO.setCategory(cafeItem.getCategory());
        cafeItemResponseDTO.setSize(cafeItem.getSize());
        cafeItemResponseDTO.setSpicyLevel(cafeItem.getSpicyLevel());
        cafeItemResponseDTO.setPrice(cafeItem.getPrice());
        cafeItemResponseDTO.setAvailable(cafeItem.isAvailable());

        return cafeItemResponseDTO;
    }


    @Override
    public CafeItemResponseDTO addCafeItem(CafeItemRequestDTO cafeItemRequestDTO) {
          CafeItem cafeItem = new CafeItem();


          cafeItem.setName(cafeItemRequestDTO.getName());
          cafeItem.setDescription(cafeItemRequestDTO.getDescription());
          cafeItem.setCategory(cafeItemRequestDTO.getCategory());
          cafeItem.setSize(cafeItemRequestDTO.getSize());
          cafeItem.setSpicyLevel(cafeItemRequestDTO.getSpicyLevel());
          cafeItem.setPrice(cafeItem.getPrice());
          cafeItem.setAvailable(cafeItem.isAvailable());

          cafeItem = cafeItemRepository.save(cafeItem);

          CafeItemResponseDTO cafeItemResponseDTO = new CafeItemResponseDTO();

          cafeItemResponseDTO.setId(cafeItem.getId());
          cafeItemResponseDTO.setName(cafeItem.getName());
          cafeItemResponseDTO.setDescription(cafeItem.getDescription());
          cafeItemResponseDTO.setCategory(cafeItem.getCategory());
          cafeItemResponseDTO.setSize(cafeItem.getSize());
          cafeItemResponseDTO.setSpicyLevel(cafeItem.getSpicyLevel());
          cafeItemResponseDTO.setPrice(cafeItem.getPrice());
          cafeItemResponseDTO.setAvailable(cafeItem.isAvailable());
          return  cafeItemResponseDTO;

    }

    @Override
    public CafeItemResponseDTO updateCafeItem(Long id ,CafeItemRequestDTO cafeItemRequestDTO) {
        CafeItem cafeItem = new CafeItem();


        cafeItem.setName(cafeItemRequestDTO.getName());
        cafeItem.setDescription(cafeItemRequestDTO.getDescription());
        cafeItem.setCategory(cafeItemRequestDTO.getCategory());
        cafeItem.setSize(cafeItemRequestDTO.getSize());
        cafeItem.setSpicyLevel(cafeItemRequestDTO.getSpicyLevel());
        cafeItem.setPrice(cafeItem.getPrice());
        cafeItem.setAvailable(cafeItem.isAvailable());

        cafeItem = cafeItemRepository.save(cafeItem);

        CafeItemResponseDTO cafeItemResponseDTO = new CafeItemResponseDTO();

        cafeItemResponseDTO.setId(cafeItem.getId());
        cafeItemResponseDTO.setName(cafeItem.getName());
        cafeItemResponseDTO.setDescription(cafeItem.getDescription());
        cafeItemResponseDTO.setCategory(cafeItem.getCategory());
        cafeItemResponseDTO.setSize(cafeItem.getSize());
        cafeItemResponseDTO.setSpicyLevel(cafeItem.getSpicyLevel());
        cafeItemResponseDTO.setPrice(cafeItem.getPrice());
        cafeItemResponseDTO.setAvailable(cafeItem.isAvailable());
        return  cafeItemResponseDTO;
    }



    @Override
    public List<CafeItemResponseDTO> getAllCafeItem() {
        List<CafeItem> cafeItemList = cafeItemRepository.findAll();
        List<CafeItemResponseDTO> cafeItemResponseDTOList = new ArrayList<>();
         for(CafeItem cafeItem :cafeItemList){
             CafeItemResponseDTO cafeItemResponseDTO= new CafeItemResponseDTO();

             cafeItemResponseDTO.setId(cafeItem.getId());
             cafeItemResponseDTO.setName(cafeItem.getName());
             cafeItemResponseDTO.setDescription(cafeItem.getDescription());
             cafeItemResponseDTO.setCategory(cafeItem.getCategory());
             cafeItemResponseDTO.setSize(cafeItem.getSize());
             cafeItemResponseDTO.setSpicyLevel(cafeItem.getSpicyLevel());
             cafeItemResponseDTO.setPrice(cafeItem.getPrice());
             cafeItemResponseDTO.setAvailable(cafeItem.isAvailable());

             cafeItemResponseDTOList.add(cafeItemResponseDTO);
         }

        return cafeItemResponseDTOList;
    }

    @Override
    public String removeCafeItem(Long id) {
        String name = cafeItemRepository.findById(id).orElse(null).getName();
        cafeItemRepository.deleteById(id);
        return  " CafeItem name : " + name + " and ID: " +id + "has been removed successfully!";


    }
}

