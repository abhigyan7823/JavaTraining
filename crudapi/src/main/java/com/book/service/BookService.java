package com.book.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.book.dao.BookRepository;
import com.book.entity.Book;

@Component
public class BookService {
	@Autowired
	private BookRepository bookRepository;
//	private static List<Book> listbook = new ArrayList<>();
//	static {
//		listbook.add(new Book(1, "java*8", "Durgesh"));
//		listbook.add(new Book(24, "DSA", "In28minutes"));
//		listbook.add(new Book(12, "JSP", "love2code"));
//	}

	public List<Book> getAllBook() {
		List<Book> listbook = (List<Book>) this.bookRepository.findAll();
		return listbook;
		// return listbook;
	}

	public Book getBookById(int id) {
		Book book = null;
		try {
			book = this.bookRepository.findById(id);
			// book = listbook.stream().filter(e -> e.getId() == id).findFirst().get();

		} catch (Exception e) {
			e.printStackTrace();
		}
		return book;
	}

	public Book addBook(Book b) {
		Book result = bookRepository.save(b);
		// listbook.add(b);
		return result;

	}

	public void deleteBook(int id) {
		bookRepository.deleteById(id);
//		Book book = listbook.remove(id);
//		System.out.println("deletion successful");
//		return book;
	}

//update
	public Book updateBook(Book book, int id) {
		book.setId(id);
		return bookRepository.save(book);
	}
//    List<Book> updatedBooks = listbook.stream()
//	        .map(b -> {
//	            if (b.getId() == id) {
//	               
//					b.setAuthor(book.getAuthor());
//	            }
//	            return b;
//	        })
//	        .collect(Collectors.toList());
//	    return null;

}
