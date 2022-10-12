/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.g31.jpa.controller;

import com.g31.jpa.entity.Reservation;
import com.g31.jpa.service.ReservationService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Camilo Torres C
 */

@RestController
@RequestMapping("/Reservation")
public class ReservationController {

    @Autowired
    private ReservationService reservationService;


    @GetMapping("/all")
    public List<Reservation> getReservation() {
        return reservationService.getReservation();
    }

    @PostMapping("/save")
    public ResponseEntity insertReservation(@RequestBody Reservation reservation) {
        reservationService.insertReservation(reservation);
        return ResponseEntity.status(201).build();
    }
}
