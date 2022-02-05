package com.example.bookstore.service;

import org.springframework.stereotype.Service;

import com.example.bookstore.dto.request.AddBookRequest;
import com.example.bookstore.dto.request.UpdateBookRequest;
import com.example.bookstore.dto.response.AddBookResponse;
import com.example.bookstore.dto.response.DeleteBookResponse;
import com.example.bookstore.dto.response.GetBookResponse;
import com.example.bookstore.dto.response.UpdateBookResponse;

@Service
public interface BookstoreService {

	GetBookResponse findBookByIsbn(String isbn);
    AddBookResponse addBook(AddBookRequest request);
    DeleteBookResponse deleteBookByIsbn(String isbn);
    UpdateBookResponse updateBook(UpdateBookRequest request);
}
