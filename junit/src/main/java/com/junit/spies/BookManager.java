package com.junit.spies;

public class BookManager {
	
	private BookService bookService;
	
	public BookManager(BookService bookService) {
		this.bookService = bookService;
	}
	
	public int applyDiscount(String bookId, int discountRate) {
		Book book = bookService.findBook(bookId);
		int discountPrice = bookService.getAppliedDiscount(book, discountRate);
		return discountPrice;
	}

}
