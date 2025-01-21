package com.example.passportinsuranceservice.exceptionHandler;

import com.example.passportinsuranceservice.exceptions.BalanceException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class BalanceExceptionHandler{
    @ExceptionHandler(BalanceException.class)
    public ResponseEntity<String> handleBalanceException(BalanceException e){
        return ResponseEntity.status(400).body(e.getMessage());
    }
}
