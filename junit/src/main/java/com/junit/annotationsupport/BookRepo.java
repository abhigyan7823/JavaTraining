package com.junit.annotationsupport;

import java.util.List;

public interface BookRepo {
	List<Book> findNewBooks(int days);
}