package com.task.testMgs.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "booking_consumption")
public class BookingKonsumsi {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long idKonsumsi;
    private Long idBooking;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getIdKonsumsi() {
        return idKonsumsi;
    }

    public void setIdKonsumsi(Long idKonsumsi) {
        this.idKonsumsi = idKonsumsi;
    }

    public Long getIdBooking() {
        return idBooking;
    }

    public void setIdBooking(Long idBooking) {
        this.idBooking = idBooking;
    }

    public String getName() {
        return "snack siang";
    }
}
