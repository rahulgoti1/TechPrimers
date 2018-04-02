package com.secure.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.secure.model.User;

public interface UserRepository extends MongoRepository<User, Integer> {

}
