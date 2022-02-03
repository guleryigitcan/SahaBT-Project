package com.example.book.repository;

import java.util.Optional;

import com.example.book.domain.Book;
import com.example.book.domain.Isbn;

public interface BookRepository {

	boolean existsByIsbn(Isbn isbn);

	Book add(Book book);

	Optional<Book> delete(Isbn isbn);

	Book update(Book book);

	Optional<Book> findBookByIsbn(Isbn isbn);
}
