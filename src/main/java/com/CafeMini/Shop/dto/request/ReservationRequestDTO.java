package com.CafeMini.Shop.dto.request;

import lombok.Data;

import java.time.LocalDateTime;
@Data
public class ReservationRequestDTO {


    private String customerName;
    private LocalDateTime reservationTime;
    private int numberOfPeople;

    private String status;
}

