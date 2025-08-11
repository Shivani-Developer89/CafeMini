package com.CafeMini.Shop.service;

import com.CafeMini.Shop.dto.request.ReservationRequestDTO;
import com.CafeMini.Shop.dto.response.ReservationResponseDTO;
import com.CafeMini.Shop.model.Reservation;
import com.CafeMini.Shop.repository.ReservationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

import java.util.List;

public class ReservationServiceImpl implements ReservationService{
    @Autowired
    ReservationRepository reservationRepository;
    @Override
    public ReservationResponseDTO createReservation(ReservationRequestDTO reservationRequestDTO) {
        Reservation reservation = new Reservation();

        reservation.setCustomerName(reservationRequestDTO.getCustomerName());
        reservation.setReservationTime(reservationRequestDTO.getReservationTime());
        reservation.setNumberOfPeople(reservationRequestDTO.getNumberOfPeople());
        reservation.setStatus(reservationRequestDTO.getStatus());

        reservation=reservationRepository.save(reservation);

        ReservationResponseDTO reservationResponseDTO =new ReservationResponseDTO();

        reservationResponseDTO.setId(reservationResponseDTO.getId());
        reservationResponseDTO.setCustomerName(reservation.getCustomerName());
        reservationResponseDTO.setReservationTime(reservation.getReservationTime());
        reservationResponseDTO.setNumberOfPeople(reservation.getNumberOfPeople());
        reservationResponseDTO.setStatus(reservation.getStatus());

       return reservationResponseDTO;



    }

    @Override
    public ReservationResponseDTO getReservation(Long id) {
        return null;
    }

    @Override
    public List<ReservationResponseDTO> getAllReservation() {
        return List.of();
    }

    @Override
    public ReservationResponseDTO updateReservation(Long id, ReservationRequestDTO reservationRequestDTO) {
        return null;
    }

    @Override
    public String removeReservation(Long id) {
        return "";
    }
}
