package com.junit.stubbing;

import java.util.List;

public class BookService {
	
private BookRepo bookRepo;
	
	public BookService(BookRepo bookRepo) {
		this.bookRepo = bookRepo;
	}
	
	public List<Book> getNewBooksWithAppliedDiscount(int discountRate, int days){
		List<Book> newBooks = bookRepo.findNewBooks(days);
		
		for(Book book : newBooks){
			int price = book.getPrice();
			int newPrice = price - (discountRate * price / 100);
			book.setPrice(newPrice);
		}
		
		return newBooks;
	}
	
	public int calculateTotalCost(List<Integer> bookIds) {
		int total = 0;
		for(Integer bookId : bookIds){
			Book book = bookRepo.findBookByBookId(bookId);
			total = total + book.getPrice();
		}
		return total;
	}
	
	public void addBook(Book book) {
		bookRepo.save(book);
	}
	
	public void addBook(BookRequest bookRequest) {
		if(bookRequest.getPrice() <= 500){
			return;
		}
		Book book = new Book();
		book.setTitle(bookRequest.getTitle());
		book.setPrice(bookRequest.getPrice());
		bookRepo.save(book);
	}
	
}
