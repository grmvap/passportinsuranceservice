package com.example.passportinsuranceservice.service.impl;

import com.example.passportinsuranceservice.model.CarInsurance;
import com.example.passportinsuranceservice.repository.CarInsuranceRepository;
import com.example.passportinsuranceservice.service.CarInsuranceService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service("CarInsuranceServiceImpl")
//@AllArgsConstructor

public class CarInsuranceServiceImpl implements CarInsuranceService {

    private final CarInsuranceRepository carInsuranceRepository;

    public CarInsuranceServiceImpl(CarInsuranceRepository carInsuranceRepository) {
        this.carInsuranceRepository = carInsuranceRepository;
    }

    @Override
    public CarInsurance createCarInsurance(CarInsurance carInsurance) {
        return null;
    }

    @Override
    public CarInsurance getCarInsuranceById(Long id) {
        return null;
    }

    @Override
    public CarInsurance updateCarInsurance(CarInsurance carInsurance) {
        return null;
    }

    @Override
    public void deleteCarInsurance(CarInsurance carInsurance) {

    }
}
