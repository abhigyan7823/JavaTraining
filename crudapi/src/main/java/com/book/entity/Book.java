package com.book.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "books")
public class Book {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String name;
	// private String Author;

	@OneToOne(cascade = CascadeType.ALL)
	@JsonManagedReference
	// @JoinColumn(name="fk_author_id")
	// @JsonIgnore // Add this annotation to break the circular reference
	private Author author;

	// GETTER AND SETTER
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

//	public String getAuthor() {
//		return Author;
//	}
//
//	public void setAuthor(String author) {
//		Author = author;
//	}

	public Author getAuthor() {
		return author;
	}

	public void setAuthor(Author author) {
		this.author = author;
	}

	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Book(int id, String name, Author author) {
		super();
		this.id = id;
		this.name = name;
		this.author = author;
	}

	@Override
	public String toString() {
		return "Book [id=" + id + ", name=" + name + ", author=" + author + "]";
	}

//	public Book(int id, String name, String author) {
//		super();
//		this.id = id;
//		this.name = name;
//		Author = author;
//	}
//
//	@Override
//	public String toString() {
//		return "Book [id=" + id + ", name=" + name + ", Author=" + Author + "]";
//	}
//
}
