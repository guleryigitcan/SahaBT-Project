package com.example.publisher.domain;

import java.util.Objects;

public final class Name {

	private final String name;

	public Name(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
	
	public static Name of(String name) {
		Objects.nonNull(name);
		if(name.length()<3)
			throw new IllegalArgumentException("Name should have at least 3 characters");
		return new Name(name);
	}

	@Override
	public String toString() {
		return "Name [name=" + name + "]";
	}
	
	
	
	
	
	
}
