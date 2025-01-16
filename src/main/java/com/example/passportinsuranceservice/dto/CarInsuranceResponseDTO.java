package com.example.passportinsuranceservice.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CarInsuranceResponseDTO {
    private Long id;
    private Integer carNumber;
    private Integer carPrice;
    private Long carId;
}
