package com.junit.argument_matcher;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyBoolean;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.ArgumentMatchers.anyList;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.ArgumentMatchers.contains;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.ArgumentMatchers.startsWith;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.time.LocalDate;
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
	private BookRepository bookRepository;
	
	@Test
	public void testUpdatePrice() {
		Book book1 = new Book("1234","Harry Potter",500,LocalDate.now());
		Book book2 = new Book("1235","Songs of Ice and Fire",900,LocalDate.now());
		when(bookRepository.findBookById(anyString())).thenReturn(book1);
		bookService.updatePrice("1234", 700);
		verify(bookRepository).save(book1);
	}
	
	@Test
	public void testInvalidUseOfArgumentMatchers() {
		Book book = new Book("1234", "Mockito In Action", 600, LocalDate.now());
		when(bookRepository.findBookByTitleAndPublishedDate(eq("Mockito In Action"), any())).thenReturn(book);
		Book actualBook = bookService.getBookByTitleAndPublishedDate("Mockito In Action", LocalDate.now());
		assertEquals("Mockito In Action", actualBook.getTitle());
	}
	
	@Test
	public void testSpecificTypeOfArgumentMatchers() {
		Book book = new Book("1234", "Mockito In Action", 600, LocalDate.now());
		when(bookRepository.findBookByTitleAndPriceAndIsDigital(anyString(),anyInt(),anyBoolean())).thenReturn(book);
		Book actualBook = bookService.getBookByTitleAndPriceAndIsDigital("Mockito In Action", 600, true);
		assertEquals("Mockito In Action", actualBook.getTitle());
	}
	
	@Test
	public void testCollectionTypeArgumentMatchers() {
		List<Book> books = new ArrayList<>();
		Book book1 = new Book("1234", "Mockito In Action", 600, LocalDate.now());
		books.add(book1);
		bookService.addBooks(books);
		verify(bookRepository).saveAll(anyList());	
	}
	
	@Test
	public void testStringTypeArgumentMatchers() {
		Book book = new Book("1234", "Mockito In Action", 600, LocalDate.now());
//		when(bookRepository.findBookByTitleAndPriceAndIsDigital(startsWith("Mockito"),anyInt(),anyBoolean())).thenReturn(book);
		when(bookRepository.findBookByTitleAndPriceAndIsDigital(contains("Mockito"),anyInt(),anyBoolean())).thenReturn(book);
		Book actualBook = bookService.getBookByTitleAndPriceAndIsDigital("Mockito In Action", 600, true);
		assertEquals("Mockito In Action", actualBook.getTitle());
	}
	
}
