package com.example.publisher.application;

import java.awt.print.Book;

import com.example.publisher.domain.Publisher;

public interface PublisherApplication {
	
	Publisher addBook(Book book);
	Publisher removeBook(Book book);

}
