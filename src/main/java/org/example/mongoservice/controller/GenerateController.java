package org.example.mongoservice.controller;

import lombok.AllArgsConstructor;
import org.example.mongoservice.service.GenerateDate;
import org.example.mongoservice.service.GenerateNumber;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.OffsetDateTime;

@RestController
@RequestMapping(path = "/number")
@CrossOrigin(origins = "*", maxAge = 3600)
@AllArgsConstructor
public class GenerateController {

    @Autowired
    private GenerateNumber generateNumber;

    @Autowired
    private GenerateDate generateDate;

    @GetMapping(value = "/getNumber")
    public String getGenerateNumber() {
        return generateNumber.generateRandomNumber("150", "10000000");
    }

    @GetMapping(value = "/getDate")
    public OffsetDateTime getGenerateDate() {
        return generateDate.generateDate();
    }
}
