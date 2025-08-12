package com.CafeMini.Shop.dto.request;

import com.CafeMini.Shop.model.enums.Status;
import lombok.Data;

import java.time.LocalDateTime;
@Data
public class ReservationRequestDTO {


    private String customerName;
    private LocalDateTime reservationTime;
    private int numberOfPeople;

    private Status status;
}

