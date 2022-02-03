package com.example.book.domain;

import java.util.List;

public final class Contents {

	private final List<String> contents;

	public Contents(List<String> contents) {
		this.contents = contents;
	}

	public List<String> getContents() {
		return contents;
	}

	@Override
	public String toString() {
		return "Contents [contents=" + contents + "]";
	}

}
