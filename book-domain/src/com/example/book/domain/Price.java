package com.example.book.domain;

import java.util.Objects;

public final class Price {

	private final double price;

	public Price(double price) {
		this.price = price;
	}

	public double getPrice() {
		return price;
	}

	public static Price of(double price) {
		Objects.requireNonNull("Currency cannot be empty!");
		if (price <= 0.0)
			throw new IllegalArgumentException("Price cannot be zero and negative!");
		return new Price(price);
	}
}
