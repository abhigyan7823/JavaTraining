package com.junit.argument_captor;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.verify;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.ArgumentCaptor;
import org.mockito.Captor;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class BookServiceTest {
	
	@InjectMocks
	private BookService bookService;
	
	@Mock
	private BookRepository bookRepository;
	
	@Captor
	private ArgumentCaptor<Book> argumentCaptor;
	
	@Test
	public void testSaveBook() {
		BookRequest bookRequest = new BookRequest("Harry",600,LocalDate.now());
		bookService.addBook(bookRequest);
		verify(bookRepository).save(argumentCaptor.capture());
		Book book = argumentCaptor.getValue();
		assertEquals("Harry", book.getTitle());
	}
	
}
