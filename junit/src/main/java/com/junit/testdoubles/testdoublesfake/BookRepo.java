package com.junit.testdoubles.testdoublesfake;

import java.util.Collection;

public interface BookRepo {
	void save(Book book);
	Collection<Book> findAll();
}