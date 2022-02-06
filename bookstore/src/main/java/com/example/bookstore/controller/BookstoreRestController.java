package com.example.bookstore.controller;

import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.annotation.RequestScope;

import com.example.bookstore.dto.request.AcquireBookRequest;
import com.example.bookstore.dto.request.UpdateBookRequest;
import com.example.bookstore.dto.response.AcquireBookResponse;
import com.example.bookstore.dto.response.DeleteBookResponse;
import com.example.bookstore.dto.response.GetBookResponse;
import com.example.bookstore.dto.response.UpdateBookResponse;
import com.example.bookstore.service.BookstoreService;

import io.swagger.annotations.Api;

@RestController
@RequestScope
@RequestMapping("books")
@CrossOrigin
@Validated
@Api(tags = "Books")
public class BookstoreRestController {

	private BookstoreService bookstoreService;

	public BookstoreRestController(BookstoreService bookstoreService) {
		this.bookstoreService = bookstoreService;
	}

	@GetMapping
	public GetBookResponse getBookByIsbn(@PathVariable String isbn) {
		return bookstoreService.findBookByIsbn(isbn);
	}
	
	@PostMapping
	public AcquireBookResponse acquireBook(
			@RequestBody @Validated AcquireBookRequest request) {
		return bookstoreService.addBook(request);
	}
	
	@DeleteMapping
	public DeleteBookResponse deleteBook(@PathVariable String isbn) {
		return bookstoreService.deleteBookByIsbn(isbn);
	}
	
	@PostMapping
	public UpdateBookResponse updateBook(@RequestBody @Validated UpdateBookRequest request) {
		return bookstoreService.updateBook(request);
	}

}
