package com.redis.service;

import com.redis.entity.Book;

public interface BookService {

	Book addBook(Book book);

	Book getBook(int id);

	Book updateBook(Book book);

	void deleteBook(int id);

}
