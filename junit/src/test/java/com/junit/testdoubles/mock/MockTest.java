package com.junit.testdoubles.mock;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class MockTest {
	
	@Test
	public void demoMock() {
		BookRepoMock bookRepoMock = new BookRepoMock();
		BookService bookService = new BookService(bookRepoMock);
		
		Book b1 = new Book(1001,"Harry Potter",600);
		Book b2 = new Book(1002,"Witcher",300);
		bookService.addBook(b1);
		bookService.addBook(b2);
		bookRepoMock.verify(b1, 1);
	}
	
	@Test
	public void demoMockWithMockito(){
		BookRepo bookRepoMock = Mockito.mock(BookRepo.class);
		BookService bookService = new BookService(bookRepoMock);
		
		Book book1 = new Book(1234, "Mockito In Action", 500);
		Book book2 = new Book(1235, "JUnit 5 In Action", 400);
		
		bookService.addBook(book1); // return
		bookService.addBook(book2); // save will be called
		
		Mockito.verify(bookRepoMock, Mockito.times(1)).save(book2);
		Mockito.verify(bookRepoMock, Mockito.times(0)).save(book1);
		
	}
	
}
