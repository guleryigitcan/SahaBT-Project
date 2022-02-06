package com.example.bookstore.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.bookstore.document.BookDocument;

public interface BookstoreDocumentMongoRepository extends MongoRepository<BookDocument, String> {

}
