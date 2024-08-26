package com.task.testMgs.model;

import java.util.List;

public class BookingModel {
    private String bookingDate;
    private String officeName;
    private String startTime;
    private String endTime;
    private List<BookingConsumptionDTO> listConsumption;
    private int participants;
    private String roomName;
    private String id;

    public String getBookingDate() {
        return bookingDate;
    }

    public void setBookingDate(String bookingDate) {
        this.bookingDate = bookingDate;
    }

    public String getOfficeName() {
        return officeName;
    }

    public void setOfficeName(String officeName) {
        this.officeName = officeName;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public List<BookingConsumptionDTO> getListConsumption() {
        return listConsumption;
    }

    public void setListConsumption(List<BookingConsumptionDTO> listConsumption) {
        this.listConsumption = listConsumption;
    }

    public int getParticipants() {
        return participants;
    }

    public void setParticipants(int participants) {
        this.participants = participants;
    }

    public String getRoomName() {
        return roomName;
    }

    public void setRoomName(String roomName) {
        this.roomName = roomName;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}

