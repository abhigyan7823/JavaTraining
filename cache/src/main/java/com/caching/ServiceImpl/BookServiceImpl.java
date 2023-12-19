package com.caching.ServiceImpl;

import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import com.caching.Service.BookService;
import com.caching.entity.Book;
import com.caching.repository.BookRepository;

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
	@Cacheable(cacheNames = "books",key="#id")
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
	@CachePut(cacheNames = "books",key="#book.id")
	public Book updateBook(Book book) {
		Optional<Book> existingBook = bookRepository.findById(book.getId());
        if (existingBook.isPresent()) {
            Book updatedBook = existingBook.get();
            updatedBook.setName(book.getName());
            updatedBook.setCategory(book.getCategory());
            updatedBook.setAuthor(book.getAuthor());
            updatedBook.setPublisher(book.getPublisher());
            bookRepository.save(updatedBook);
            logger.info("Book updated with new details");

            return updatedBook;
        } 
        else {
            logger.warn("Book not found with id - {}", book.getId());
            return null;
        }
//		Book book1 = bookRepository.updateBookName(book.getId(),book.getName());
//		logger.info("Book updated with new name");
//		return book1;
	}

	@Override
	@CacheEvict(cacheNames = "books",key="#id")
	public void deleteBook(int id) {
		bookRepository.deleteById(id);
		logger.info("Deleted book with id - {}", id);
	}

}
