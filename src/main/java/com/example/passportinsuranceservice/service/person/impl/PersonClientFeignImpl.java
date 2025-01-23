package com.example.passportinsuranceservice.service.person.impl;


import com.example.passportinsuranceservice.client.FeignClientService;
import com.example.passportinsuranceservice.dto.person.PersonResponseDto;
import com.example.passportinsuranceservice.service.person.PersonClient;
import lombok.AllArgsConstructor;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("feign")
@AllArgsConstructor
@Service("PersonClientFeignImpl")
public class PersonClientFeignImpl implements PersonClient {

    private final FeignClientService feignClientService;

    @Override
    public PersonResponseDto getPersonDetails(Long personId) {
        return feignClientService.getPersonId(personId);
    }
}
