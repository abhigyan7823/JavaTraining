package com.caching.Service;

import com.caching.entity.Book;

public interface BookService {

	Book addBook(Book book);

	Book getBook(int id);

	Book updateBook(Book book); 

	void deleteBook(int id);

}
