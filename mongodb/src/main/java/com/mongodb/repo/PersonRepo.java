package com.mongodb.repo;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.mongodb.collections.Person;

@Repository
public interface PersonRepo extends MongoRepository<Person, String> {

}
