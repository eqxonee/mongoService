package org.example.mongoservice.service;

import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class GenerateNumber {

    private final Random random = new Random();

    // Генерация случайного числа в диапазоне от min до max (включительно)
    public String generateRandomNumber(String min, String max) {
        long minNumber = Long.parseLong(min);
        long maxNumber = Long.parseLong(max);
        long randomNumber = minNumber + (long)(random.nextDouble() * (maxNumber - minNumber + 1));
        return String.valueOf(randomNumber);
    }

}
