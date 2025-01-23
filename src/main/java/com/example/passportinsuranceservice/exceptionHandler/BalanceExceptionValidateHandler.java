package com.example.passportinsuranceservice.exceptionHandler;

import com.example.passportinsuranceservice.exceptions.BalanceValidateException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class BalanceExceptionValidateHandler {

    @ExceptionHandler(BalanceValidateException.class)
    public ResponseEntity<String> handleBalanceException(BalanceValidateException exception) {
        return ResponseEntity.status(400).body(exception.getMessage());
    }
}
