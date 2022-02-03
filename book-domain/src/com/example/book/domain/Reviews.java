package com.example.book.domain;

import java.util.List;

public final class Reviews {

	private final List<String> reviews;

	public Reviews(List<String> reviews) {
		this.reviews = reviews;
	}

	public List<String> getReviews() {
		return reviews;
	}

	@Override
	public String toString() {
		return "Reviews [reviews=" + reviews + "]";
	}

}
