package com.example.customer.domain;

import java.util.Objects;

public final class Location {
	private final String location;

	private Location(String location) {
		this.location = location;
	}

	public static Location of(String location) {
		Objects.requireNonNull(location);
		if (location.length() < 2)
			throw new IllegalArgumentException("Fullname should have at least two characters");
		return new Location(location);
	}

	public String getLocation() {
		return location;
	}

	@Override
	public String toString() {
		return "Location [location=" + location + "]";
	}

}
