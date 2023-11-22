package com.junit.stubbing;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class BookServiceTest {
	
	@InjectMocks
	private BookService bookService;
	
	@Mock
	private BookRepo bookRepo;
	
	@Test
	public void testCalculateTotalCostofBooks() {
		List<Integer> bookIds = new ArrayList<>();
		bookIds.add(1234);
		bookIds.add(1235);
		Book book1 = new Book(1234, "Mockito In Action", 500);
		Book book2 = new Book(1235, "JUnit 5 In Action", 400);
		
		
		when(bookRepo.findBookByBookId(1234))
		.thenReturn(book1)
		.thenReturn(book1);
		
//		when(bookRepo.findBookByBookId(1234)).thenReturn(book1);
//		when(bookRepo.findBookByBookId(1235)).thenReturn(book2);
		
//		doReturn(book1).when(bookRepo).findBookByBookId(1234);
//		doReturn(book2).when(bookRepo).findBookByBookId(1235);
		
		int actualCost = bookService.calculateTotalCost(bookIds);
		
		assertEquals(900, actualCost);
	}
	
	@Test
	public void testSaveBook() {
		Book book1 = new Book(0, "Mockito In Action", 500);
		doNothing().when(bookRepo).save(book1);
		bookService.addBook(book1);
	}
	
	@Test
	public void testSaveBookWithBookRequest() {
		BookRequest bookRequest = new BookRequest("Mockito In Action", 700);
	    Book book1 = new Book(0, "Mockito In Action", 700);
	    doNothing().when(bookRepo).save(book1); 
	    bookService.addBook(bookRequest);
	}
	
	@Test
	public void testSaveBookWithBookRequestWithGreaterPrice() {
		BookRequest bookRequest = new BookRequest("Mockito In Action", 600);
		Book book = new Book(1234,"Mockito In Action", 600);
//		doNothing().when(bookRepository).save(book);
		bookService.addBook(bookRequest);
	}
	
}