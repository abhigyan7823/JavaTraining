package com.book.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.book.entity.Book;
import com.book.service.BookService;

@RestController
public class BookController {
	@Autowired
	private BookService bookService;

//finding ALL BOOK
	@GetMapping("/books")
	public ResponseEntity<List<Book>> getBooks() {
		List<Book> newList = this.bookService.getAllBook();
		if (newList.size() <= 0) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		}
		return ResponseEntity.of(Optional.of(newList));
	}

//finding book by id
	@GetMapping("/books/{id}")
	public ResponseEntity<Book> getById(@PathVariable("id") int id) {
		Book book = bookService.getBookById(id); // Correct the method call
		if (book == null) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		} else {
			return ResponseEntity.ok(book);
		}
	}
//		Book book = bookService.getBookById(id);
//		if (book == null) {
//			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
//		}
//
//		return ResponseEntity.of(Optional.of(book));
//	}

	// adding new book
	@PostMapping("/books")
	public ResponseEntity<Book> addBook(@RequestBody Book book) {
		Book b = null;
		try {
			b = this.bookService.addBook(book);
			return ResponseEntity.of(Optional.of(b));
		} catch (Exception e) {
			e.printStackTrace();
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}
	}

	// DELETING BOOK BY ID
	@DeleteMapping("/books/{id}")
	public ResponseEntity<Void> deleteBook(@PathVariable("id") int id) {
		try {
			this.bookService.deleteBook(id);
			return ResponseEntity.ok().build();
		} catch (Exception e) {
			e.printStackTrace();
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}
	}

	@PutMapping("/books/{id}")
	public ResponseEntity<Book> update(@RequestBody Book b, @PathVariable("id") int id) {
		Book updatedBook = this.bookService.updateBook(b, id);
		if (updatedBook == null) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		}
		return ResponseEntity.ok(updatedBook);
	}

//	// UPDATING BOOK BY ID
//	@PutMapping("/books/{id}")
//	public Book update(@RequestBody Book b, @PathVariable("id") int id) {
//		this.bookService.updateBook(b, id);
//		return b;
//	}
}
