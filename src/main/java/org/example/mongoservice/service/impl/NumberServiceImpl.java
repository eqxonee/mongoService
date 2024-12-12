package org.example.mongoservice.service.impl;

import org.example.mongoservice.model.Number;
import org.example.mongoservice.repository.NumberRepository;
import org.example.mongoservice.service.NumberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.Random;

@Service
public class NumberServiceImpl implements NumberService {

    @Autowired
    private NumberRepository numberRepository;

    @Override
    public Number generateNumber() {
        Number number = new Number();
        String randomNumber = String.valueOf(new Random().nextLong(10000, 100000));
        LocalDateTime date = LocalDateTime.now();

        number.setNumber(randomNumber);
        number.setOrderDate(date);

        numberRepository.save(number);

        return number;
    }

}
