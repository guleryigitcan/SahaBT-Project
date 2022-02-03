package com.example.customer.domain;

import java.util.Objects;

public final class Username {
	private final String username;

	private Username(String username) {
		this.username = username;
	}

	public static Username of(String username) {
		Objects.requireNonNull(username);
		if (username.length() < 2)
			throw new IllegalArgumentException("Username should have at least two characters");
		return new Username(username);
	}

	public String getUserName() {
		return username;
	}

	@Override
	public String toString() {
		return "Username [username=" + username + "]";
	}
}
