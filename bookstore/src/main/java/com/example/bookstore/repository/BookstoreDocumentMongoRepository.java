package com.example.bookstore.repository;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Service;

import com.example.book.repository.BookRepository;
import com.example.bookstore.document.BookDocument;

@Service
public interface BookstoreDocumentMongoRepository extends MongoRepository<BookDocument, String> {

	

}
