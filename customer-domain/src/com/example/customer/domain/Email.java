package com.example.customer.domain;

import java.util.regex.Pattern;

public final class Email {
	private final String email;

	private Email(String email) {

		this.email = email;

	}

	public static Email valueOf(String email) {
		if (!isValid(email))
			throw new IllegalArgumentException("This is not a valid iban.");
		return new Email(email);
	}

	public static boolean isValid(String email) {
		String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\." + "[a-zA-Z0-9_+&*-]+)*@" + "(?:[a-zA-Z0-9-]+\\.)+[a-z"
				+ "A-Z]{2,7}$";

		Pattern pat = Pattern.compile(emailRegex);
		if (email == null)
			return false;
		return pat.matcher(email).matches();
	}

	public String getEmail() {
		return email;
	}

	@Override
	public String toString() {
		return "Email [email=" + email + "]";
	}

}
