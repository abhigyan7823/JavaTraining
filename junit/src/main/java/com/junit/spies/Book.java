package com.junit.spies;

public class Book {
	private String bookId;
	private String title;
	private int price;
	
	@Override
	public String toString() {
		return "Book [bookId=" + bookId + ", title=" + title + ", price=" + price + "]";
	}
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Book(String bookId, String title, int price) {
		super();
		this.bookId = bookId;
		this.title = title;
		this.price = price;
	}
	public String getBookId() {
		return bookId;
	}
	public void setBookId(String bookId) {
		this.bookId = bookId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
}
