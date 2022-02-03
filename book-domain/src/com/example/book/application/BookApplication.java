package com.example.book.application;

import java.util.Optional;

import com.example.book.domain.Book;
import com.example.book.domain.Isbn;

public interface BookApplication {

	Book addBook(Book book);

	Book deleteBook(Isbn isbn);

	Book updateBook(Book book);

	Optional<Book> findBookByIsbn(Isbn isbn);

}
