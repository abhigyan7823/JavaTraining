package com.junit.testdoubles.spy;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.verify;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class SpyTest {
	@Test
	public void demoSpy() {
		BookRepoSpy bookRepo = new BookRepoSpy();
		BookService bookService = new BookService(bookRepo);
		
		Book b1 = new Book(1001,"Harry Potter",600);
		Book b2 = new Book(1002,"Witcher",500);
		bookService.addBook(b1);
		bookService.addBook(b2);
		assertEquals(2, bookRepo.timesCalled());
		assertTrue(bookRepo.calledWith(b2));
		
	}

	@Test
	public void demoStubWithMockito() {
		BookRepo bookRepo = spy(BookRepo.class);
		BookService bookService = new BookService(bookRepo);
		
		Book b1 = new Book(1001,"Harry Potter",600);
		Book b2 = new Book(1002,"Witcher",500);
		bookService.addBook(b1);
		bookService.addBook(b2);
		
		verify(bookRepo, Mockito.times(1)).save(b2);
		verify(bookRepo, Mockito.times(0)).save(b1);
	}
	
}
