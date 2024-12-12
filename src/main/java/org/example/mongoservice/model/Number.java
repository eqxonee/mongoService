package org.example.mongoservice.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Document(collection = "numbers")
@Data
public class Number {

    @Id
    private String id;
    private String number;
    private LocalDateTime orderDate;
}
