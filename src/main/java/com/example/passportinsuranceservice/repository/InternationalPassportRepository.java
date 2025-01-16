package com.example.passportinsuranceservice.repository;

import com.example.passportinsuranceservice.model.InternationalPassport;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InternationalPassportRepository extends JpaRepository<InternationalPassport, Long> {
    
}
