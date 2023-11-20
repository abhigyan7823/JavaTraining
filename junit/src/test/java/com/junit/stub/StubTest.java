package com.junit.stub;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

public class StubTest {
	
	@Test
	public void demoStub(){
		BookRepository bookRepository = new BookRepoStub();
		BookService bookService = new BookService(bookRepository);
		
		List<Book> newBooksWithAppliedDiscount = bookService.getNewBooksWithAppliedDiscount(10, 7);
		
		assertEquals(2, newBooksWithAppliedDiscount.size());
		assertEquals(450, newBooksWithAppliedDiscount.get(0).getPrice());
		assertEquals(360, newBooksWithAppliedDiscount.get(1).getPrice());
	}
	
	@Test
	public void demoStubWithMockito() {
		BookRepository bookRepository = mock(BookRepository.class);
		BookService bookService = new BookService(bookRepository);
		
		Book book1 = new Book(1234, "Mockito In Action", 500);
		Book book2 = new Book(1235, "JUnit 5 In Action", 400);
		
		List<Book> newBooks = new ArrayList<>();
		newBooks.add(book1);
		newBooks.add(book2);
		
		when(bookRepository.findNewBooks(7)).thenReturn(newBooks);
		
		List<Book> newBooksWithAppliedDiscount = bookService.getNewBooksWithAppliedDiscount(10, 7);
		
		assertEquals(2, newBooksWithAppliedDiscount.size());
		assertEquals(450, newBooksWithAppliedDiscount.get(0).getPrice());
		assertEquals(360, newBooksWithAppliedDiscount.get(1).getPrice());

	}
	
}
