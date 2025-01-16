package com.example.passportinsuranceservice.dto.person;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class PersonResponseDto {
    private Long passportId;
    private Long passportNumber;
    private String name;
    private String surname;
    private String gender;
    private Long id;
    private Long balance;
    private List<CarResponseDto> carResponseDtos;

    public Long getPassportId() {
        return passportId;
    }

    public void setPassportId(Long passportId) {
        this.passportId = passportId;
    }

    public Long getPassportNumber() {
        return passportNumber;
    }

    public void setPassportNumber(Long passportNumber) {
        this.passportNumber = passportNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getBalance() {
        return balance;
    }

    public void setBalance(Long balance) {
        this.balance = balance;
    }

    public List<CarResponseDto> getCarResponseDtos() {
        return carResponseDtos;
    }

    public void setCarResponseDtos(List<CarResponseDto> carResponseDtos) {
        this.carResponseDtos = carResponseDtos;
    }
}
