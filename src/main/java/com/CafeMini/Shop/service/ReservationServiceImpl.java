package com.CafeMini.Shop.service;

import com.CafeMini.Shop.dto.request.ReservationRequestDTO;
import com.CafeMini.Shop.dto.response.ReservationResponseDTO;
import com.CafeMini.Shop.model.Reservation;
import com.CafeMini.Shop.repository.ReservationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
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
        Reservation reservation = reservationRepository.findById(id).orElse(null);

        ReservationResponseDTO reservationResponseDTO = new ReservationResponseDTO();

        reservationResponseDTO.setId(reservation.getId());
        reservationResponseDTO.setCustomerName(reservation.getCustomerName());
        reservationResponseDTO.setReservationTime(reservation.getReservationTime());
        reservationResponseDTO.setNumberOfPeople(reservation.getNumberOfPeople());
        reservationResponseDTO.setStatus(reservation.getStatus());

        return reservationResponseDTO;
    }

    @Override
    public List<ReservationResponseDTO> getAllReservation() {
        List<Reservation> reservationList =reservationRepository.findAll();
        List<ReservationResponseDTO> reservationResponseDTOList = new ArrayList<>();

        for(Reservation reservation : reservationList){
            ReservationResponseDTO reservationResponseDTO = new ReservationResponseDTO();

            reservationResponseDTO.setId(reservation.getId());
            reservationResponseDTO.setCustomerName(reservation.getCustomerName());
            reservationResponseDTO.setReservationTime(reservation.getReservationTime());
            reservationResponseDTO.setNumberOfPeople(reservation.getNumberOfPeople());
            reservationResponseDTO.setStatus(reservation.getStatus());

            reservationResponseDTOList.add(reservationResponseDTO);
        }
        return reservationResponseDTOList;
    }

    @Override
    public ReservationResponseDTO updateReservation(Long id, ReservationRequestDTO reservationRequestDTO) {
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
    public String removeReservation(Long id) {
        String name = reservationRepository.findById(id).orElse(null).getCustomerName();
        reservationRepository.deleteById(id);

        return "Customer name : " + name + " and ID: "+id + "has been remove Successfully!";
    }
}

