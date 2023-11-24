package com.junit.spies;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.doReturn;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Spy;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class BookManagerTest {

	@InjectMocks
	private BookManager bookManager;
	
	@Spy
	private BookService bookService;
	
	@Test
	public void testMockitoSpy() {
		Book book = new Book("1234", "Mockito In Action", 500);
		doReturn(book).when(bookService).findBook("1234");
//		when(bookService.findBook("1234")).thenReturn(book);
		int actualDiscount = bookManager.applyDiscount("1234", 10);
		assertEquals(450, actualDiscount);
	}
	
}
