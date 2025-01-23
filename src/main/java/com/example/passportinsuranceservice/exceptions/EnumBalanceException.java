package com.example.passportinsuranceservice.exceptions;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum EnumBalanceException {
    BALANCE("Недостаточно денег ");
    private String balanceException;
}
