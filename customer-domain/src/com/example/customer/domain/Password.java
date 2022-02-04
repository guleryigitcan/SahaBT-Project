package com.example.customer.domain;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class Password {
	private final String password;

	private Password(String password) {
		this.password = password;
	}

	public static Password valueOf(String password) {
		if (!isValidPassword(password))
			throw new IllegalArgumentException("This is not a valid iban.");
		return new Password(password);
	}

	public static boolean isValidPassword(String password) {

		// Regex to check valid password.
		String regex = "^(?=.*[0-9])" + "(?=.*[a-z])(?=.*[A-Z])" + "(?=.*[@#$%^&+=])" + "(?=\\S+$).{8,20}$";

		// Compile the ReGex
		Pattern p = Pattern.compile(regex);

		// If the password is empty
		// return false
		if (password == null) {
			return false;
		}

		// Pattern class contains matcher() method
		// to find matching between given password
		// and regular expression.
		Matcher m = p.matcher(password);

		// Return if the password
		// matched the ReGex
		return m.matches();
	}

	public String getPassword() {
		return password;
	}

	@Override
	public String toString() {
		return "Password [password=" + password + "]";
	}

}
