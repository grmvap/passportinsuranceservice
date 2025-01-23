package com.example.passportinsuranceservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class PassportinsuranceserviceApplication {

    public static void main(String[] args) {
        SpringApplication.run(PassportinsuranceserviceApplication.class, args);
    }
}
