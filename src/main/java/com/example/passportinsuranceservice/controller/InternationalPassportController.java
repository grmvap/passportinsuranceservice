package com.example.passportinsuranceservice.controller;

import com.example.passportinsuranceservice.dto.InternationalPassportResponseDTO;
import com.example.passportinsuranceservice.model.InternationalPassport;
import com.example.passportinsuranceservice.service.InternationalPassportService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


@RestController
@RequestMapping("/international.passport.controller")
public class InternationalPassportController {

    private final InternationalPassportService internationalPassportService;
    private final RestTemplate restTemplate;


    public InternationalPassportController(InternationalPassportService internationalPassportService, RestTemplate restTemplate) {
        this.internationalPassportService = internationalPassportService;
        this.restTemplate = restTemplate;
    }

    @PostMapping("create.passport")
    public InternationalPassportResponseDTO createPassport(@RequestBody InternationalPassport internationalPassport) {
    return null;
    }

}
