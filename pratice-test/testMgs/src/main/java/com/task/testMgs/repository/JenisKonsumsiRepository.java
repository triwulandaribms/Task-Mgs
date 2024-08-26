package com.task.testMgs.repository;

import com.task.testMgs.entity.JenisKonsumsi;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JenisKonsumsiRepository extends JpaRepository<JenisKonsumsi, Long> {
}
