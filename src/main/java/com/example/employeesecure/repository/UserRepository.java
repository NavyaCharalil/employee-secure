package com.example.employeesecure.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.example.employeesecure.model.User;

public interface UserRepository extends MongoRepository<User, Long> {
    User findByUsername(String username);
}
