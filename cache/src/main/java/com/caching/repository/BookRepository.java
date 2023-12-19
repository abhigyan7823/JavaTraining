package com.caching.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.caching.entity.Book;

@Repository
public interface BookRepository extends MongoRepository<Book, Integer> {

	@Query("{'id': ?0}")
	Book updateBookName(@Param("id") int id, @Param("name") String name);
	
}
