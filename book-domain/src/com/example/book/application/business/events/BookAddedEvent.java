package com.example.book.application.business.events;

import com.example.book.domain.Book;

public class BookAddedEvent extends BookEvent {

	private final Book book;

	public BookAddedEvent(Book book) {
		this.book = book;
	}

	public Book getBook() {
		return book;
	}

}
