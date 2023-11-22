package com.junit.stubbing;

import java.util.List;

public interface BookRepo {
	List<Book> findNewBooks(int days);

	Book findBookByBookId(Integer id);

	void save(Book book);
	
}