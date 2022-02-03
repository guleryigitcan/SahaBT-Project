package com.example.book.application.business;

import java.util.Optional;

import com.example.book.application.BookApplication;
import com.example.book.application.business.events.BookAddedEvent;
import com.example.book.application.business.events.BookDeletedEvent;
import com.example.book.application.business.events.BookUpdatedEvent;
import com.example.book.application.business.exception.BookNotFoundException;
import com.example.book.application.business.exception.ExistingBookException;
import com.example.book.domain.Book;
import com.example.book.domain.Isbn;
import com.example.book.infrastructure.EventPublisher;
import com.example.book.repository.BookRepository;

public class StandardBookApplication implements BookApplication {

	private BookRepository bookRepository;
	private EventPublisher eventPublisher;

	public StandardBookApplication(BookRepository bookRepository, EventPublisher eventPublisher) {
		this.bookRepository = bookRepository;
		this.eventPublisher = eventPublisher;
	}

	@Override
	public Book addBook(Book book) {
		var number = book.getIsbn();
		if (bookRepository.existsByIsbn(number))
			throw new ExistingBookException("Book already exist", number.getValue());
		Book addedBook = bookRepository.add(book);
		var businessEvent = new BookAddedEvent(addedBook);
		eventPublisher.publishEvent(businessEvent);
		return addedBook;
	}

	@Override
	public Book deleteBook(Isbn isbn) {
		Optional<Book> deletedBook = bookRepository.delete(isbn);
		var book = deletedBook.orElseThrow(() -> new BookNotFoundException("Book does not exist", isbn.getValue()));
		eventPublisher.publishEvent(new BookDeletedEvent(book));
		return book;
	}

	@Override
	public Book updateBook(Book book) {
		var number = book.getIsbn();
		if (!bookRepository.existsByIsbn(number))
			throw new BookNotFoundException("Book does not exist", number.getValue());
		Book updatedBook = bookRepository.update(book);
		var businessEvent = new BookUpdatedEvent(updatedBook);
		eventPublisher.publishEvent(businessEvent);
		return updatedBook;
	}

	@Override
	public Optional<Book> findBookByIsbn(Isbn isbn) {
		return bookRepository.findBookByIsbn(isbn);
	}

}
