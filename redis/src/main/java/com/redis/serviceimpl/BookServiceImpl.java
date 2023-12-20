package com.redis.serviceimpl;

import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import com.redis.entity.Book;
import com.redis.repository.BookRepository;
import com.redis.service.BookService;

@Service
public class BookServiceImpl implements BookService {

	private static final Logger logger = LoggerFactory.getLogger(BookServiceImpl.class);

	@Autowired
	private BookRepository bookRepository;

	@Override
	public Book addBook(Book book) {
		logger.info("adding book with id - {}", book.getId());
		return bookRepository.save(book);
	}

	@Override
	@Cacheable(cacheNames = "books", key = "#id")
	public Book getBook(int id) {
		logger.info("fetching book from db");
		Optional<Book> book = bookRepository.findById(id);
		if (book.isPresent()) {
			return book.get();
		} else {
			return new Book();
		}
	}

	@Override
	@CachePut(cacheNames = "books", key = "#book.id")
	public Book updateBook(Book book) {
		bookRepository.updateAddress(book.getId(), book.getName());
		logger.info("book updated with new name");
		return book;
	}

	@Override
	@CacheEvict(cacheNames = "books", key = "#id")
	public void deleteBook(int id) {
		bookRepository.deleteById(id);
		logger.info("Deleted book with id - {}", id);
	}

}
