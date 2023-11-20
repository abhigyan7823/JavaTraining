package com.junit.spy;

public class BookRepoSpy implements BookRepo {
	
	int savecalled = 0;
	Book lastBook = null;			
	@Override
	public void save(Book book) {
		savecalled++;
		lastBook = book;
	}
	
	public int timesCalled(){
		return savecalled;
	}
	
	public boolean calledWith(Book book){
		return lastBook.equals(book);
	}
	
}
