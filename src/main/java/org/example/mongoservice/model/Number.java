package org.example.mongoservice.model;

import lombok.Data;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.OffsetDateTime;

@Document(collection = "numbers")
@Data
public class Number {

    @Id
    private ObjectId id;
    private String number;
    private OffsetDateTime orderDate;
}
