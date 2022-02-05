package com.example.bookstore.service.business;

import org.modelmapper.ModelMapper;

import com.example.book.application.BookApplication;
import com.example.book.application.business.exceptions.BookNotFoundException;
import com.example.book.domain.Book;
import com.example.book.domain.Isbn;
import com.example.bookstore.dto.request.AcquireBookRequest;
import com.example.bookstore.dto.request.UpdateBookRequest;
import com.example.bookstore.dto.response.AcquireBookResponse;
import com.example.bookstore.dto.response.DeleteBookResponse;
import com.example.bookstore.dto.response.GetBookResponse;
import com.example.bookstore.dto.response.UpdateBookResponse;
import com.example.bookstore.service.BookstoreService;

public class StandardBookstoreService implements BookstoreService {

	private BookApplication bookApplication;
	private ModelMapper modelMapper;

	public StandardBookstoreService(BookApplication bookApplication, ModelMapper modelMapper) {
		this.bookApplication = bookApplication;
		this.modelMapper = modelMapper;
	}

	@Override
	public GetBookResponse findBookByIsbn(String isbn) {
		var book = bookApplication.findBookByIsbn(Isbn.of(isbn));
		if (book.isEmpty())
			throw new BookNotFoundException("Can't find book", isbn);
		return modelMapper.map(book.get(), GetBookResponse.class);

	}

	@Override
	public AcquireBookResponse addBook(AcquireBookRequest request) {
		var book = modelMapper.map(request, Book.class);
		var deletedBook = bookApplication.addBook(book);
		return modelMapper.map(deletedBook, AcquireBookResponse.class);
	}

	@Override
	public DeleteBookResponse deleteBookByIsbn(String isbn) {
		var book= bookApplication.deleteBook(Isbn.of(isbn));
		return modelMapper.map(book, DeleteBookResponse.class);
	}

	@Override
	public UpdateBookResponse updateBook(UpdateBookRequest request) {
		return null;
	}

}
