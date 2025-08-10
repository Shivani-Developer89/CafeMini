package com.CafeMini.Shop.dto.response;

import lombok.Data;

import java.time.LocalDateTime;
@Data
public class ReservationResponseDTO {
    private Long id;

    private String customerName;
    private LocalDateTime reservationTime;
    private int numberOfPeople;

    private String status;

}
