package com.CafeMini.Shop.service;

import com.CafeMini.Shop.dto.request.CafeItemRequestDTO;
import com.CafeMini.Shop.dto.response.CafeItemResponseDTO;
import com.CafeMini.Shop.model.CafeItem;
import com.CafeMini.Shop.model.enums.Available;
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
        cafeItemResponseDTO.setItemName(cafeItem.getItemName());
        cafeItemResponseDTO.setDescription(cafeItem.getDescription());
        cafeItemResponseDTO.setCategory(cafeItem.getCategory());
        cafeItemResponseDTO.setSize(cafeItem.getSize());
        cafeItemResponseDTO.setSpicyLevel(cafeItem.getSpicyLevel());
        cafeItemResponseDTO.setPrice(cafeItem.getPrice());
        cafeItemResponseDTO.setAvailable(cafeItem.getAvailable());

        return cafeItemResponseDTO;
    }


    @Override
    public CafeItemResponseDTO addCafeItem(CafeItemRequestDTO cafeItemRequestDTO) {
          CafeItem cafeItem = new CafeItem();


          cafeItem.setItemName(cafeItemRequestDTO.getItemName());
          cafeItem.setDescription(cafeItemRequestDTO.getDescription());
          cafeItem.setCategory(cafeItemRequestDTO.getCategory());
          cafeItem.setSize(cafeItemRequestDTO.getSize());
          cafeItem.setSpicyLevel(cafeItemRequestDTO.getSpicyLevel());
          cafeItem.setPrice(cafeItemRequestDTO.getPrice());
          cafeItem.setAvailable(Available.AVAILABLE);


        cafeItem = cafeItemRepository.save(cafeItem);

          CafeItemResponseDTO cafeItemResponseDTO = new CafeItemResponseDTO();

          cafeItemResponseDTO.setId(cafeItem.getId());
          cafeItemResponseDTO.setItemName(cafeItem.getItemName());
          cafeItemResponseDTO.setDescription(cafeItem.getDescription());
          cafeItemResponseDTO.setCategory(cafeItem.getCategory());
          cafeItemResponseDTO.setSize(cafeItem.getSize());
          cafeItemResponseDTO.setSpicyLevel(cafeItem.getSpicyLevel());
          cafeItemResponseDTO.setPrice(cafeItem.getPrice());
          cafeItemResponseDTO.setAvailable(Available.AVAILABLE);
          return  cafeItemResponseDTO;

    }

    @Override
    public CafeItemResponseDTO updateCafeItem(Long id ,CafeItemRequestDTO cafeItemRequestDTO) {
        CafeItem cafeItem = new CafeItem();


        cafeItem.setId(id);
        cafeItem.setItemName(cafeItemRequestDTO.getItemName());
        cafeItem.setDescription(cafeItemRequestDTO.getDescription());
        cafeItem.setCategory(cafeItemRequestDTO.getCategory());
        cafeItem.setSize(cafeItemRequestDTO.getSize());
        cafeItem.setSpicyLevel(cafeItemRequestDTO.getSpicyLevel());
        cafeItem.setPrice(cafeItemRequestDTO.getPrice());
        cafeItem.setAvailable(Available.AVAILABLE);


        cafeItem = cafeItemRepository.save(cafeItem);

        CafeItemResponseDTO cafeItemResponseDTO = new CafeItemResponseDTO();

        cafeItemResponseDTO.setId(cafeItem.getId());
        cafeItemResponseDTO.setItemName(cafeItem.getItemName());
        cafeItemResponseDTO.setDescription(cafeItem.getDescription());
        cafeItemResponseDTO.setCategory(cafeItem.getCategory());
        cafeItemResponseDTO.setSize(cafeItem.getSize());
        cafeItemResponseDTO.setSpicyLevel(cafeItem.getSpicyLevel());
        cafeItemResponseDTO.setPrice(cafeItem.getPrice());
        cafeItemResponseDTO.setAvailable(Available.AVAILABLE);
        return  cafeItemResponseDTO;
    }



    @Override
    public List<CafeItemResponseDTO> getAllCafeItem() {
        List<CafeItem> cafeItemList = cafeItemRepository.findAll();
        List<CafeItemResponseDTO> cafeItemResponseDTOList = new ArrayList<>();
         for(CafeItem cafeItem :cafeItemList){
             CafeItemResponseDTO cafeItemResponseDTO= new CafeItemResponseDTO();

             cafeItemResponseDTO.setId(cafeItem.getId());
             cafeItemResponseDTO.setItemName(cafeItem.getItemName());
             cafeItemResponseDTO.setDescription(cafeItem.getDescription());
             cafeItemResponseDTO.setCategory(cafeItem.getCategory());
             cafeItemResponseDTO.setSize(cafeItem.getSize());
             cafeItemResponseDTO.setSpicyLevel(cafeItem.getSpicyLevel());
             cafeItemResponseDTO.setPrice(cafeItem.getPrice());
             cafeItemResponseDTO.setAvailable(cafeItem.getAvailable());

             cafeItemResponseDTOList.add(cafeItemResponseDTO);
         }

        return cafeItemResponseDTOList;
    }

    @Override
    public String removeCafeItem(Long id) {
            CafeItem cafeItem = cafeItemRepository.findById(id).orElse(null);

            if (cafeItem == null) {
                return "CafeItem with ID: " + id + " not found!";
            }

            String name = cafeItem.getItemName().name(); // enum -> String

            cafeItemRepository.deleteById(id);

            return "CafeItem name: " + name + " and ID: " + id + " has been removed successfully!";
        }

}

