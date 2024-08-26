package com.task.testMgs.util;

import com.task.testMgs.entity.JenisKonsumsi;
import com.task.testMgs.model.JenisKonsumsiDTO;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class JenisKonsumsiMapper {

    private static final DateTimeFormatter FORMATTER = DateTimeFormatter.ISO_DATE_TIME;

    public static JenisKonsumsiDTO toDto(JenisKonsumsi jenisKonsumsi) {
        JenisKonsumsiDTO dto = new JenisKonsumsiDTO();
        dto.setCreatedAt(jenisKonsumsi.getCreatedAt().format(FORMATTER) + "Z");
        dto.setName(jenisKonsumsi.getName());
        dto.setMaxPrice(jenisKonsumsi.getMaxPrice());
        dto.setId(jenisKonsumsi.getId().toString()); 

        
        return dto;
    }

    public static JenisKonsumsi toEntity(JenisKonsumsiDTO dto) {
        JenisKonsumsi jenisKonsumsi = new JenisKonsumsi();
        jenisKonsumsi.setCreatedAt(LocalDateTime.parse(dto.getCreatedAt().replace("Z", ""), FORMATTER));
        jenisKonsumsi.setName(dto.getName());
        jenisKonsumsi.setMaxPrice(dto.getMaxPrice());
        jenisKonsumsi.setId(Long.valueOf(dto.getId()));

        
        return jenisKonsumsi;
    }
}
