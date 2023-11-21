package com.junit.testdoubles.stub;

import java.util.List;

public interface BookRepository {
	public List<Book> findNewBooks(int days);
}
