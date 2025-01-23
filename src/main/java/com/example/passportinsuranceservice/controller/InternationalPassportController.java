package com.example.passportinsuranceservice.controller;

import com.example.passportinsuranceservice.model.InternationalPassport;
import com.example.passportinsuranceservice.service.InternationalPassportService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;


@RestController
@RequestMapping("/international/passport")
@AllArgsConstructor
public class InternationalPassportController {

    private final InternationalPassportService internationalPassportService;
    private final RestTemplate restTemplate;

    @PostMapping("/create/{personId}")
    public InternationalPassport createPassport(@PathVariable Long personId) {
        return internationalPassportService.createInternationalPassport(personId);
    }
}
