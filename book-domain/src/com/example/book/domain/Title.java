package com.example.book.domain;

public final class Title {

	private final String title;

	public Title(String title) {
		this.title = title;
	}

	public String getTitle() {
		return title;
	}

	@Override
	public String toString() {
		return "Title [title=" + title + "]";
	}

}
