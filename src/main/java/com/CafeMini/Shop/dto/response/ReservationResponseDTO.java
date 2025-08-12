package com.CafeMini.Shop.dto.response;

import com.CafeMini.Shop.model.enums.Status;
import lombok.Data;

import java.time.LocalDateTime;
@Data
public class ReservationResponseDTO {
    private Long id;

    private String customerName;
    private LocalDateTime reservationTime;
    private int numberOfPeople;

    private Status status;

}
