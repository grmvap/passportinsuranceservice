package com.example.passportinsuranceservice.service;

import com.example.passportinsuranceservice.model.CarInsurance;

public interface CarInsuranceService {
    CarInsurance createCarInsurance(CarInsurance carInsurance);
    CarInsurance getCarInsuranceById(Long id);
    CarInsurance updateCarInsurance(CarInsurance carInsurance);
    void deleteCarInsurance(CarInsurance carInsurance);
}
