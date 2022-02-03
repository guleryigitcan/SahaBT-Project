package com.example.requistion.domain;

import java.util.Objects;

import com.example.book.domain.Isbn;
import com.example.publisher.domain.Publisher;

public class Requistion {
	
	private RequistionId requistionId;
	private Isbn isbn;
	private Publisher publisher;
	
	public Requistion(RequistionId requistionId, Isbn isbn, Publisher publisher) {
		this.requistionId = requistionId;
		this.isbn = isbn;
		this.publisher = publisher;
	}

	public RequistionId getRequistionId() {
		return requistionId;
	}


	public Isbn getIsbn() {
		return isbn;
	}

	public Publisher getPublisher() {
		return publisher;
	}

	public void setPublisher(Publisher publisher) {
		this.publisher = publisher;
	}

	@Override
	public int hashCode() {
		return Objects.hash(isbn, requistionId);
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
		return Objects.equals(isbn, other.isbn) && Objects.equals(requistionId, other.requistionId);
	}

	@Override
	public String toString() {
		return "Requistion [requistionId=" + requistionId + ", isbn=" + isbn + "]";
	}
	
	public static class Builder{
		private RequistionId requistionId;
		private Isbn isbn;
		private Publisher publisher;
		
		public Builder requistionId(String value) {
			this.requistionId=RequistionId.of(value);
			return this;
		}
		
		public Builder isbn(String value) {
			this.isbn=Isbn.of(value);
			return this;
		}
		
		public Requistion build() {
			var requistion=new Requistion(requistionId, isbn, publisher);
			return requistion;
		}
	
		
	}
	
	
	
	

}
