package com.mongodb.repo;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import com.mongodb.collections.Person;

@Repository
public interface PersonRepo extends MongoRepository<Person, String> {
	
	List<Person> findByNameStartsWith(String name);
	
	@Query(value = "{ 'age' : { $gt : ?0, $lt : ?1}}", fields = "{addresses:  0}")
	List<Person> findPersonByAgeBetween(Integer min, Integer max);
	
}
