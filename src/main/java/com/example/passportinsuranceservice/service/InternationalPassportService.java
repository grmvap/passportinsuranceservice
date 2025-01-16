package com.example.passportinsuranceservice.service;

import com.example.passportinsuranceservice.dto.person.PersonResponseDto;
import com.example.passportinsuranceservice.model.InternationalPassport;

public interface InternationalPassportService {
    InternationalPassport createInternationalPassport(Long personId);
    InternationalPassport getInternationalPassportById(Long id);
    InternationalPassport updateInternationalPassport(InternationalPassport internationalPassport);
    void deleteInternationalPassport(InternationalPassport internationalPassport);

}
