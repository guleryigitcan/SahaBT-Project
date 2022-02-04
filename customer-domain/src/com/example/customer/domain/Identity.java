package com.example.customer.domain;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class Identity {
	private final String identity;

	private Identity(String identity) {
		this.identity = identity;
	}

	public static Identity valueOf(String identity) {
		if (!isValidIdentifier(identity))
			throw new IllegalArgumentException("This is not a valid identity.");
		return new Identity(identity);
	}

	/*
	 * The valid rules for defining Java identifiers are:
	 * 
	 * It must start with either lower case alphabet[a-z] or upper case
	 * alphabet[A-Z] or underscore(_) or a dollar sign($). It should be a single
	 * word, the white spaces are not allowed. It should not start with digits.
	 */
	public static boolean isValidIdentifier(String identifier) {

		// Regex to check valid identifier.
		String regex = "^([a-zA-Z_$][a-zA-Z\\d_$]*)$";

		// Compile the ReGex
		Pattern p = Pattern.compile(regex);

		// If the identifier is empty
		// return false
		if (identifier == null) {
			return false;
		}

		// Pattern class contains matcher() method
		// to find matching between given identifier
		// and regular expression.
		Matcher m = p.matcher(identifier);

		// Return if the identifier
		// matched the ReGex
		return m.matches();
	}

	public String getIdentity() {
		return identity;
	}

	@Override
	public String toString() {
		return "Identity [identity=" + identity + "]";
	}

}
