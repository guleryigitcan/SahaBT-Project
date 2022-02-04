package com.example.customer.domain;

import java.util.Objects;

public final class Age {

	private int age;

	private Age(int age) {
		this.age = age;
	}
	public static Age of(int age) {
		Objects.requireNonNull(age);
		if (age>112)
			throw new IllegalArgumentException("Your age must be less than 112!");
		return new Age(age);
	}
	@Override
	public String toString() {
		return "Age [age=" + age + "]";
	}
}
