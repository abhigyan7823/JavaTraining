package com.caching.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection="book")
public class Book {
	@Id
	private int id;
	private String name;
    private String category;
    private String author;
    private String publisher;
}
