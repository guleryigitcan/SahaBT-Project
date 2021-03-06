package com.example.requistion.application.business.exception;

@SuppressWarnings("serial")
public class RequistionNotFoundException extends RuntimeException {

	private final String requistionId;

	public RequistionNotFoundException(String requistionId) {
		this.requistionId = requistionId;
	}

	public String getRequistionId() {
		return requistionId;
	}

}
