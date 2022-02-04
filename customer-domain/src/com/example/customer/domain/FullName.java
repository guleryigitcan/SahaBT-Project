package com.example.customer.domain;

import java.util.Objects;

public final class FullName { // Value Object

	private final String first;
	private final String last;

	private FullName(String first, String last) {

		this.first = first;
		this.last = last;
	}

	public static FullName of(String first, String last) {

		Objects.requireNonNull(first);
		Objects.requireNonNull(last);

		if (first.length() < 2 || last.length() < 2)
			throw new IllegalArgumentException("Adiniz ve soyadiniz 2 karakterden az olamaz.");

		return new FullName(first, last);
	}

	public String getFirst() {
		return first;
	}

	public String getLast() {
		return last;
	}

	@Override
	public String toString() {
		return "FullName [first=" + first + ", last=" + last + "]";
	}

}
