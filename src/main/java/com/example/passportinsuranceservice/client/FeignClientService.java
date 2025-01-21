package com.example.passportinsuranceservice.client;

import com.example.passportinsuranceservice.dto.person.PersonResponseDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "feign-service" , url = "http://localhost:8080")
public interface FeignClientService {

    @GetMapping("/api/person/{personId}")
    PersonResponseDto getPersonId(@PathVariable Long personId);
}
