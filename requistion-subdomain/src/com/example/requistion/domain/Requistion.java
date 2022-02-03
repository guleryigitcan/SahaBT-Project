package com.example.requistion.domain;

import java.util.Objects;

import com.example.book.domain.Isbn;
import com.example.publisher.domain.Publisher;

public class Requistion {

	private final RequistionID requistionID;
	private final Isbn isbn;
	private Publisher publisher;

	private Requistion(RequistionID requistionID, Isbn isbn, Publisher publisher) {
		this.requistionID = requistionID;
		this.isbn = isbn;
		this.publisher = publisher;
	}

	public RequistionID getRequistionID() {
		return requistionID;
	}

	public Isbn getIsbn() {
		return isbn;
	}

	public Publisher getPublisher() {
		return publisher;
	}

	@Override
	public int hashCode() {
		return Objects.hash(isbn, requistionID);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Requistion other = (Requistion) obj;
		return Objects.equals(isbn, other.isbn) && Objects.equals(requistionID, other.requistionID);
	}

	@Override
	public String toString() {
		return "Requistion [requistionID=" + requistionID + ", isbn=" + isbn + ", publisher=" + publisher + "]";
	}

	public static class Builder {
		private RequistionID requistionID;
		private Isbn isbn;
		private Publisher publisher;

		public Builder requistionId(String value) {
			this.requistionID = RequistionID.of(value);
			return this;
		}

		public Builder isbn(String value) {
			this.isbn = Isbn.of(value);
			return this;
		}

		public Builder publisher(String value) {
			this.publisher = Publisher.of(value);
			return this;
		}
	}

}
