package com.example.passportinsuranceservice.service.impl;

import com.example.passportinsuranceservice.exceptions.BalanceException;
import com.example.passportinsuranceservice.exceptions.EnumBalanceException;
import com.example.passportinsuranceservice.model.InternationalPassport;
import com.example.passportinsuranceservice.repository.InternationalPassportRepository;
import com.example.passportinsuranceservice.service.InternationalPassportService;
import com.example.passportinsuranceservice.service.person.impl.PersonClientImpl;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.concurrent.ThreadLocalRandom;

@Service("InternationalPassportServiceImpl")
//@AllArgsConstructor
public class InternationalPassportServiceImpl implements InternationalPassportService {
    private final InternationalPassportRepository internationalPassportRepository;

    public InternationalPassportServiceImpl(InternationalPassportRepository internationalPassportRepository, PersonClientImpl personServiceImpl) {
        this.internationalPassportRepository = internationalPassportRepository;
        this.personServiceImpl = personServiceImpl;
    }

    private final PersonClientImpl personServiceImpl;


    @Override
    public InternationalPassport createInternationalPassport(Long personId) {

        if (personId != null) {
            if (personServiceImpl.getPersonDetails(personId).getBalance() < 5000) {
                throw new BalanceException(EnumBalanceException.BALANCE.getBalanceException());
            }else{
                InternationalPassport internationalPassport = new InternationalPassport();
                internationalPassport.setPersonId(personId);
                internationalPassport.setNumber(getRandomPasportNumder());
                return internationalPassportRepository.save(internationalPassport);
            }
        }
        return null;
        //todo написать исключение, если баланс ниже 5000
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
    static int getRandomPasportNumder() {

        return ThreadLocalRandom.current().nextInt(100000, 1000000);
    }

}
