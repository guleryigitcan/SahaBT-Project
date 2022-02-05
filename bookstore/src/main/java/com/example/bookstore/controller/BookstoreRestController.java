package com.example.bookstore.controller;

import java.util.Optional;

import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.annotation.RequestScope;

import com.example.book.application.BookApplication;
import com.example.book.domain.Book;
import com.example.book.domain.Isbn;
import com.example.bookstore.dto.request.AcquireBookRequest;
import com.example.bookstore.dto.response.AcquireBookResponse;
import com.example.bookstore.dto.response.DeleteBookResponse;

@RestController
@RequestScope
@RequestMapping("books")
public class BookstoreRestController {

	private BookApplication bookApplication;

	public BookstoreRestController(BookApplication bookApplication) {
		this.bookApplication = bookApplication;
	}
	
	@GetMapping("{isbn}")
	public Optional<Book> getBookByIsbn(@PathVariable Isbn isbn) {
		return bookApplication.findBookByIsbn(isbn);
	}
	
	@PostMapping
	public AcquireBookResponse acquireBook(@RequestBody @Validated AcquireBookRequest request) {
		return bookApplication.addBook(request);
	}
	
	@DeleteMapping("{isbn}")
	public DeleteBookResponse releaseBookByIsbn(@PathVariable Isbn isbn) {
		return bookApplication.deleteBook(isbn);
	}
	
	
	
	
	
}
