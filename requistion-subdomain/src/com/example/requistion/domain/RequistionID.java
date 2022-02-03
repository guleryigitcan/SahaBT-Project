package com.example.requistion.domain;

import java.util.Objects;



public final class RequistionId {
	
	private final String value;

	public RequistionId(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}
	
	public static RequistionId of(String value) {
		if (!isValid(value))
			throw new IllegalArgumentException("This is not a valid Requistion Id");
		return new RequistionId(value);
	}

	private static boolean isValid(String value) {
		return value.matches("^[a-z0-9A-Z]{10,20}$");
	}

	@Override
	public int hashCode() {
		return Objects.hash(value);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		RequistionId other = (RequistionId) obj;
		return Objects.equals(value, other.value);
	}

	@Override
	public String toString() {
		return "RequistionId [value=" + value + "]";
	}
	
	
}
