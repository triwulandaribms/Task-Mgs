package com.task.testMgs.service;

import com.task.testMgs.model.BookingModel;
import com.task.testMgs.model.BookingConsumptionDTO;
import com.task.testMgs.model.JenisKonsumsiDTO;
import com.task.testMgs.repository.BookingRepository;
import com.task.testMgs.repository.JenisKonsumsiRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalTime;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class BookingsService {

    @Autowired
    private JenisKonsumsiRepository jenisKonsumsiRepository;

    @Autowired
    private BookingRepository bookingRepository;

    private static final DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ISO_DATE_TIME.withZone(ZoneOffset.UTC);
    private static final LocalTime snackSiangTime = LocalTime.of(11, 0);
    private static final LocalTime makanSiangTime = LocalTime.of(14, 0);
    private static final LocalTime snackSoreTime = LocalTime.of(16, 0);

    public List<JenisKonsumsiDTO> getAllJenisKonsumsi() {
        return jenisKonsumsiRepository.findAll().stream()
                .sorted((data1, data2) -> data1.getCreatedAt().compareTo(data2.getCreatedAt()))
                .map(jenisKonsumsi -> {
                    JenisKonsumsiDTO data = new JenisKonsumsiDTO();
                    data.setCreatedAt(jenisKonsumsi.getCreatedAt().format(dateTimeFormatter));
                    data.setId(jenisKonsumsi.getId().toString());
                    data.setName(jenisKonsumsi.getName());
                    data.setMaxPrice(jenisKonsumsi.getMaxPrice());
                    return data;
                })
                .collect(Collectors.toList());
    }

    public List<BookingModel> getBookingList() {
        return bookingRepository.findAll().stream()
                .map(booking -> {
                    BookingModel bookingModel = new BookingModel();
                    bookingModel.setBookingDate(booking.getBookingDate().format(dateTimeFormatter));
                    bookingModel.setOfficeName(booking.getOfficeName());
                    bookingModel.setStartTime(booking.getStartTime().format(dateTimeFormatter));
                    bookingModel.setEndTime(booking.getEndTime().format(dateTimeFormatter));
                    bookingModel.setParticipants(booking.getParticipants());
                    bookingModel.setRoomName(booking.getRoomName());
                    bookingModel.setId(booking.getId().toString());

                    List<BookingConsumptionDTO> consumptionDTOs = new ArrayList<>();

                    LocalTime startTime = booking.getStartTime().toLocalTime();
                    LocalTime endTime = booking.getEndTime().toLocalTime();

                    if (startTime.isBefore(snackSiangTime)) {
                        consumptionDTOs.add(createConsumptionDTO("Snack Siang"));
                    }

                    if (startTime.isBefore(makanSiangTime) && endTime.isAfter(makanSiangTime)) {
                        consumptionDTOs.add(createConsumptionDTO("Makan Siang"));
                    }

                    if (startTime.isBefore(snackSoreTime) && endTime.isAfter(snackSiangTime)) {
                        consumptionDTOs.add(createConsumptionDTO("Snack Sore"));
                    }

                    bookingModel.setListConsumption(consumptionDTOs);

                    return bookingModel;
                })
                .collect(Collectors.toList());
    }

    private BookingConsumptionDTO createConsumptionDTO(String name) {
        BookingConsumptionDTO dto = new BookingConsumptionDTO();
        dto.setName(name);
        return dto;
    }
}
