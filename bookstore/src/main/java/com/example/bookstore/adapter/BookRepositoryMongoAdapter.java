package com.example.bookstore.adapter;

import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Repository;

import com.example.book.domain.Book;
import com.example.book.domain.Isbn;
import com.example.book.repository.BookRepository;
import com.example.bookstore.repository.BookstoreDocumentMongoRepository;

@Repository
public class BookRepositoryMongoAdapter implements BookRepository {

	private BookstoreDocumentMongoRepository mongoRepo;
	private ModelMapper mapper;

	public BookRepositoryMongoAdapter(BookstoreDocumentMongoRepository mongoRepo, ModelMapper mapper) {
		this.mongoRepo = mongoRepo;
		this.mapper = mapper;
	}

	@Override
	public boolean existsByIsbn(Isbn isbn) {
		return false;
	}

	@Override
	public Book update(Book book) {
		return null;
	}

	@Override
	public Book add(Book book) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<Book> delete(Isbn isbn) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<Book> findBookByIsbn(Isbn isbn) {
		// TODO Auto-generated method stub
		return null;
	}

}
