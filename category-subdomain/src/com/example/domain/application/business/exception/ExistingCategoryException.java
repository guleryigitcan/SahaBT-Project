package com.example.domain.application.business.exception;

@SuppressWarnings("serial")
public class ExistingCategoryException extends RuntimeException {

	private final String categoryID;

	public ExistingCategoryException(String message, String categoryID) {
		super(message);
		this.categoryID = categoryID;
	}

	public String getCategoryID() {
		return categoryID;
	}

}
