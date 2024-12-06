package org.example.mongoservice.repository;

import org.example.mongoservice.model.Number;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NumberRepository extends MongoRepository<Number, String> {
}
