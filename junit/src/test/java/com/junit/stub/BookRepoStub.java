package com.junit.stub;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import com.junit.stub.Book;

public class BookRepoStub implements BookRepository {
	
	public List<Book> findNewBooks(int days) {
		List<Book> newBooks = new ArrayList<>();
		
		Book book1 = new Book(1001,"Harry Potter",500);
		Book book2 = new Book(1002,"Witcher",600);
		
		newBooks.add(book1);
		newBooks.add(book2);
		
		return newBooks;
	}
}
