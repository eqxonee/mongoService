package org.example.mongoservice.service;

import org.springframework.stereotype.Service;

import java.time.OffsetDateTime;

@Service
public class GenerateDate {

    public OffsetDateTime generateDate() {
        return OffsetDateTime.now();
    }
}
