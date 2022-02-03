package com.example.book.application.business.events;

import com.example.book.domain.Book;

public class BookUpdatedEvent extends BookEvent {

	private final Book book;

	public BookUpdatedEvent(Book book) {
		this.book = book;
	}

	public Book getBook() {
		return book;
	}

}
