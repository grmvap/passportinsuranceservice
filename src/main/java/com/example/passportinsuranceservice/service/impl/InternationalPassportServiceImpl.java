package com.example.passportinsuranceservice.service.impl;

import com.example.passportinsuranceservice.exceptions.BalanceException;
import com.example.passportinsuranceservice.exceptions.EnumBalanceException;
import com.example.passportinsuranceservice.model.InternationalPassport;
import com.example.passportinsuranceservice.repository.InternationalPassportRepository;
import com.example.passportinsuranceservice.service.InternationalPassportService;
import com.example.passportinsuranceservice.service.person.PersonClient;
import lombok.AllArgsConstructor;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import java.util.concurrent.ThreadLocalRandom;

@Service("InternationalPassportServiceImpl")
@AllArgsConstructor
public class InternationalPassportServiceImpl implements InternationalPassportService {
    private final InternationalPassportRepository internationalPassportRepository;
    private final PersonClient personService;
    private final KafkaTemplate<String, Object> kafkaTemplate;

    @Override
    public InternationalPassport createInternationalPassport(Long personId) {

        if (personId != null) {
            if (personService.getPersonDetails(personId).getBalance() < 5000) {
                throw new BalanceException(EnumBalanceException.BALANCE.getBalanceException());
            } else {
                InternationalPassport internationalPassport = new InternationalPassport();
                internationalPassport.setPersonId(personId);
                internationalPassport.setNumber(getRandomPassportNumber());
//                ProducerRecord producerRecord = new ProducerRecord("test_topic", internationalPassport);
//                kafkaTemplate.send(producerRecord);
                kafkaTemplate.send("test_topic", internationalPassport);
                return internationalPassportRepository.save(internationalPassport);
            }
        }
        return null;
    }

    @Override
    public InternationalPassport getInternationalPassportById(Long id) {
        return null;
    }

    @Override
    public InternationalPassport updateInternationalPassport(InternationalPassport internationalPassport) {
        return null;
    }

    @Override
    public void deleteInternationalPassport(InternationalPassport internationalPassport) {

    }

    static int getRandomPassportNumber() {
        return ThreadLocalRandom.current().nextInt(100000, 1000000);
    }
}
