package com.CafeMini.Shop.model;

import com.CafeMini.Shop.model.enums.Status;
import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;
@Entity
@Data
public class Reservation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String customerName;
    private LocalDateTime reservationTime;
    private int numberOfPeople;

    @Enumerated(EnumType.STRING)
    private Status status;
}
