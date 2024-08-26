package com.task.testMgs.repository;

import com.task.testMgs.entity.BookingKonsumsi;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookingConsumptionRepository extends JpaRepository<BookingKonsumsi, Long> {
}
