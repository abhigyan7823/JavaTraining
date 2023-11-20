package com.junit.testdoublesfake;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;

import org.junit.jupiter.api.Test;

public class FakeTest {
	
	@Test
	public void testFake() {
		BookRepo bookRepo = new FakeBookRepo();
		BookService bookService = new BookService(bookRepo);
		
		bookService.addBook(new Book(1001,"Harry Potter",500));
		bookService.addBook(new Book(1002,"Witcher",600));
		
		assertEquals(2, bookService.findNumberOfBooks());
		
	}
	
	@Test
	public void testFakeWithMockito() {
		BookRepo bookRepository = mock(BookRepo.class);
		BookService bookService = new BookService(bookRepository);
		
		Book book1 = new Book(1234, "Mockito In Action", 250);
		Book book2 = new Book(1235, "JUnit 5 In Action", 200);
		
		Collection<Book> books = new ArrayList<>();
		books.add(book1);
		books.add(book2);
		
		when(bookRepository.findAll()).thenReturn(books);
		
		assertEquals(2, bookService.findNumberOfBooks());
	}
	
}
