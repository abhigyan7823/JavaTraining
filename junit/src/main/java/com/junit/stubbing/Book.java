package com.junit.stubbing;

public class Book {
	private int bookId;
	private String title;
	private int price;
	
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Book(int bookId, String title, int price) {
		super();
		this.bookId = bookId;
		this.title = title;
		this.price = price;
	}
	@Override
	public String toString() {
		return "Book [bookId=" + bookId + ", title=" + title + ", price=" + price + "]";
	}
	public int getBookId() {
		return bookId;
	}
	public void setBookId(int bookId) {
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
