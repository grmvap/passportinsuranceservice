package com.example.passportinsuranceservice.service.person;

import com.example.passportinsuranceservice.dto.person.PersonResponseDto;

public interface PersonClient {
    PersonResponseDto getPersonDetails(Long personId);
}
