package com.example.requistion.application.business.exception;

@SuppressWarnings("serial")
public class ExistingRequistionException extends RuntimeException {

	private final String requistionId;

	public ExistingRequistionException(String requistionId) {
		this.requistionId = requistionId;
	}

	public String getRequistionId() {
		return requistionId;
	}

}
