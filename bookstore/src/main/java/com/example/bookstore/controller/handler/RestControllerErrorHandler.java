package com.example.bookstore.controller.handler;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.http.HttpStatus;

import com.example.book.application.business.exceptions.BookNotFoundException;
import com.example.book.application.business.exceptions.ExistingBookException;
import com.example.bookstore.dto.error.ErrorResponse;

@RestControllerAdvice
public class RestControllerErrorHandler {

	@ExceptionHandler(BookNotFoundException.class)
	@ResponseStatus(HttpStatus.NOT_FOUND)
	public ErrorResponse handleBookNotFoundException(BookNotFoundException e) {
		return new ErrorResponse("Customer Rest API", e.getMessage());
	}

	@ExceptionHandler(ExistingBookException.class)
	@ResponseStatus(HttpStatus.BAD_REQUEST)
	public ErrorResponse handleBookAlreadyExistException(ExistingBookException e) {
		return new ErrorResponse("Customer Rest API", e.getMessage());
	}
}
