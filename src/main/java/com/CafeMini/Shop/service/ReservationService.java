package com.CafeMini.Shop.service;

import com.CafeMini.Shop.dto.request.ReservationRequestDTO;
import com.CafeMini.Shop.dto.response.OrderItemResponseDTO;
import com.CafeMini.Shop.dto.response.ReservationResponseDTO;

import java.util.List;

public interface ReservationService {
    ReservationResponseDTO createReservation(ReservationRequestDTO reservationRequestDTO);
    ReservationResponseDTO getReservation(Long id);
    List<ReservationResponseDTO> getAllReservation();
    ReservationResponseDTO updateReservation(Long id ,ReservationRequestDTO reservationRequestDTO);
    String removeReservation(Long id);

}
