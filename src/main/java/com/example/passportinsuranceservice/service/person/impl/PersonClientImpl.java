package com.example.passportinsuranceservice.service.person.impl;

import com.example.passportinsuranceservice.dto.person.PersonResponseDto;
import com.example.passportinsuranceservice.service.person.PersonClient;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
@AllArgsConstructor
public class PersonClientImpl implements PersonClient {
    private final RestTemplate restTemplate;

    public PersonResponseDto getPersonDetails(Long personId) {
        String url = "http://localhost:8080/person" + personId;
        return restTemplate.getForObject(url, PersonResponseDto.class);
    }

}
