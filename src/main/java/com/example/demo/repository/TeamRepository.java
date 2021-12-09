package com.example.demo.repository;

import com.example.demo.models.Team;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface TeamRepository extends MongoRepository<Team, Integer> {
    public Team findById(int id);
}
