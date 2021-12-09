package com.example.demo.repository;

import com.example.demo.models.Developer;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface DeveloperRepository extends MongoRepository<Developer, Integer> {
    public Developer findById(int id);
}
