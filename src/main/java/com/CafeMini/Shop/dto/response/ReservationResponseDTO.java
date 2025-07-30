package com.CafeMini.Shop.dto.response;

import java.time.LocalDateTime;

public class ReservationResponseDTO {
    private Long id;

    private String customerName;
    private LocalDateTime reservationTime;
    private int numberOfPeople;

    private String status;

}
