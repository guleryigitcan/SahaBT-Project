package com.example.domain.application.business.exception;

@SuppressWarnings("serial")
public class CategoryNotFoundException extends RuntimeException {

	private final String categoryID;

	public CategoryNotFoundException(String message, String categoryID) {
		super(message);
		this.categoryID = categoryID;
	}

	public String getCategoryID() {
		return categoryID;
	}

}
