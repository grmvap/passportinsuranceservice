package com.example.passportinsuranceservice.controller;

import com.example.passportinsuranceservice.dto.CarInsuranceResponseDTO;
import com.example.passportinsuranceservice.model.CarInsurance;
import com.example.passportinsuranceservice.service.CarInsuranceService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/car.insurance")
@AllArgsConstructor
public class CarInsuranceController {

    private final CarInsuranceService carInsuranceService;
    private final RestTemplate restTemplate;

    @PostMapping("/create.insurance")
    public CarInsuranceResponseDTO createInsurance(@RequestBody CarInsurance carInsurance) {
        //ResponseEntity<Person> person = restTemplate.getForEntity("http://localhost:8080/person" + )
        return null;
    }
}
