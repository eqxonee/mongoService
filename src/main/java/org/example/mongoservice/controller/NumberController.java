package org.example.mongoservice.controller;

import lombok.AllArgsConstructor;
import org.example.mongoservice.model.Number;
import org.example.mongoservice.service.NumberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/numbers")
@CrossOrigin(origins = "*", maxAge = 3600)
@AllArgsConstructor
public class NumberController {

    @Autowired
    private NumberService numberService;

    @GetMapping
    public Number generateNumber() {
        return numberService.generateNumber();
    }
}
