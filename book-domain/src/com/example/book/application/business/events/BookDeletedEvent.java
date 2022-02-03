package com.example.book.application.business.events;

import com.example.book.domain.Book;

public class BookDeletedEvent extends BookEvent {

	private final Book book;

	public BookDeletedEvent(Book book) {
		this.book = book;
	}

	public Book getBook() {
		return book;
	}
}
