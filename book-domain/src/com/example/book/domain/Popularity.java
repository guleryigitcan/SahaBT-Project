package com.example.book.domain;

public final class Popularity {

	private final double popularity;

	public Popularity(double popularity) {
		this.popularity = popularity;
	}

	public double getPopularity() {
		return popularity;
	}

	public static Popularity of(double popularity) {
		if (popularity <= 0.0)
			throw new IllegalArgumentException("Popularity cannot be zero and negative!");
		return new Popularity(popularity);
	}

	@Override
	public String toString() {
		return "Popularity [popularity=" + popularity + "]";
	}

}
