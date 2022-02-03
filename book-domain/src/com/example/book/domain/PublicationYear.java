package com.example.book.domain;

public final class PublicationYear {

	private final int publicationYear;

	public PublicationYear(int publicationYear) {
		this.publicationYear = publicationYear;
	}

	public static PublicationYear of(int publicationYear) {
		if (publicationYear >= 2022 && publicationYear < 1950)
			throw new IllegalArgumentException("Invalid date");
		return new PublicationYear(publicationYear);
	}

	@Override
	public String toString() {
		return "PublicationYear [publicationYear=" + publicationYear + "]";
	}

}
