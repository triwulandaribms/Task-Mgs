package com.task.testMgs.controller;

import com.task.testMgs.model.BookingModel;
import com.task.testMgs.model.JenisKonsumsiDTO;
import com.task.testMgs.service.BookingsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/data")
public class BookingsController {

    @Autowired
    private BookingsService bookingsService;

    @GetMapping("/masterJenisKonsumsi")
    public ResponseEntity<List<JenisKonsumsiDTO>> getAllJenisKonsumsi() {
        List<JenisKonsumsiDTO> jenisKonsumsiList = bookingsService.getAllJenisKonsumsi();
        return ResponseEntity.ok(jenisKonsumsiList);
    }

    @GetMapping("/booking")
    public ResponseEntity<List<BookingModel>> getBookingList() {
        List<BookingModel> bookingList = bookingsService.getBookingList();
        return ResponseEntity.ok(bookingList);
    }


}
