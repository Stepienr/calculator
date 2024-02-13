package com.example.finalproject;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface CalculationRepository extends JpaRepository<Calculation, Long> {
    List<Calculation> findByUserEmail(String userEmail);
}
