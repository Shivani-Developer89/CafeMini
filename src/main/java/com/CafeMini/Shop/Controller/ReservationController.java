package com.CafeMini.Shop.Controller;

import com.CafeMini.Shop.dto.request.ReservationRequestDTO;
import com.CafeMini.Shop.dto.response.ReservationResponseDTO;
import com.CafeMini.Shop.service.ReservationService;
import org.apache.catalina.LifecycleState;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Reservation")
public class ReservationController  {

    @Autowired
    ReservationService reservationService;

    @PostMapping()
    public ResponseEntity<ReservationResponseDTO> createReservation(@RequestBody ReservationRequestDTO reservationRequestDTO){
        return new ResponseEntity<>(reservationService.createReservation(reservationRequestDTO), HttpStatusCode.valueOf(201));

    }

    @GetMapping("/{id}")
    public ResponseEntity<ReservationResponseDTO> getReservation(@PathVariable Long id){
        return new ResponseEntity<>(reservationService.getReservation(id),HttpStatusCode.valueOf(200));

    }

    @GetMapping()
    public  ResponseEntity<List> getAllReservation(){
        return new ResponseEntity<>(reservationService.getAllReservation(),HttpStatusCode.valueOf(200));
    }
    @PutMapping("/{id}")
    public ResponseEntity<ReservationResponseDTO> updateReservation(@PathVariable Long id, @RequestBody ReservationRequestDTO reservationRequestDTO ){
        return  new ResponseEntity<>(reservationService.updateReservation(id,reservationRequestDTO),HttpStatusCode.valueOf(200));
    }
    @DeleteMapping()
    public ResponseEntity<String> removeReservation(@RequestParam Long id){
        return  new ResponseEntity<>(reservationService.removeReservation(id),HttpStatusCode.valueOf(200));
    }
}
