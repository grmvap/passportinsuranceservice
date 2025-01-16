package com.example.passportinsuranceservice.repository;

import com.example.passportinsuranceservice.model.CarInsurance;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarInsuranceRepository extends JpaRepository<CarInsurance, Long> {
}
