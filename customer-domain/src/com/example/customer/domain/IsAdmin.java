package com.example.customer.domain;

public final class IsAdmin {

	private final boolean value;

	public IsAdmin(boolean value) {
		this.value = value;
	}

	public static IsAdmin of(boolean value) {
		return new IsAdmin(value);
	}

	public boolean isValue() {
		return value;
	}

	@Override
	public String toString() {
		return "IsAdmin [value=" + value + "]";
	}

}
