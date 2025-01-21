package com.example.passportinsuranceservice.controller;

import com.example.passportinsuranceservice.dto.InternationalPassportResponseDTO;
import com.example.passportinsuranceservice.model.InternationalPassport;
import com.example.passportinsuranceservice.service.InternationalPassportService;
import org.antlr.v4.runtime.misc.NotNull;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;


@RestController
@RequestMapping("/international/passport")
public class InternationalPassportController {

    private final InternationalPassportService internationalPassportService;
    private final RestTemplate restTemplate;


    public InternationalPassportController(InternationalPassportService internationalPassportService, RestTemplate restTemplate) {
        this.internationalPassportService = internationalPassportService;
        this.restTemplate = restTemplate;
    }

    @PostMapping("/create/{personId}")
    public InternationalPassport createPassport(@PathVariable Long personId) {
        return internationalPassportService.createInternationalPassport(personId);
    }

}
