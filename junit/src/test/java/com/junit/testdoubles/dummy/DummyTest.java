package com.junit.testdoubles.dummy;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.Collection;

import org.junit.jupiter.api.Test;

public class DummyTest {
	@Test
	public void demoDummy() {
		BookRepo bookRepo = new FakeBookRepo();
		EmailService emailService = new DummyEmailService();
		BookService bookService = new BookService(bookRepo, emailService);
		
		bookService.addBook(new Book(1001,"Harry Potter",500));
		bookService.addBook(new Book(1002,"Witcher",600));
		
		assertEquals(2, bookService.findNumberOfBooks());
	}
	
	@Test
	public void demoDummyWithMockito() {
		BookRepo bookRepo = mock(BookRepo.class);
		EmailService emailService = mock(EmailService.class);
		BookService bookService = new BookService(bookRepo, emailService);
		
		Book b1 = new Book(1001,"Harry Potter",600);
		Book b2 = new Book(1002,"Witcher",500);
		bookService.addBook(b1);
		bookService.addBook(b2);
		
		Collection<Book> books = new ArrayList<>();
		books.add(b1);
		books.add(b2);
		
		when(bookRepo.findAll()).thenReturn(books);
		assertEquals(2, bookService.findNumberOfBooks());
	}
	
}
