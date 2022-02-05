package com.example.bookstore.dto.request;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;

import org.springframework.data.annotation.Id;

import com.example.book.domain.Author;
import com.example.book.domain.Edition;
import com.example.book.domain.Isbn;
import com.example.book.domain.Price;
import com.example.book.domain.PublicationYear;
import com.example.book.domain.Title;
import com.example.publisher.domain.Publisher;

public class UpdateBookRequest {

	@Id
	private Isbn isbn;
	@NotBlank
	private Title title;
	@NotBlank
	private Author author;
	@NotBlank
	private Publisher publisher;
	@NotBlank
	private Edition edition;
	@Max(2022)
	private PublicationYear publicationYear;
	@Min(1)
	private Price price;
	
	public UpdateBookRequest() {
	}

	public Isbn getIsbn() {
		return isbn;
	}

	public void setIsbn(Isbn isbn) {
		this.isbn = isbn;
	}

	public Title getTitle() {
		return title;
	}

	public void setTitle(Title title) {
		this.title = title;
	}

	public Author getAuthor() {
		return author;
	}

	public void setAuthor(Author author) {
		this.author = author;
	}

	public Publisher getPublisher() {
		return publisher;
	}

	public void setPublisher(Publisher publisher) {
		this.publisher = publisher;
	}

	public Edition getEdition() {
		return edition;
	}

	public void setEdition(Edition edition) {
		this.edition = edition;
	}

	public PublicationYear getPublicationYear() {
		return publicationYear;
	}

	public void setPublicationYear(PublicationYear publicationYear) {
		this.publicationYear = publicationYear;
	}

	public Price getPrice() {
		return price;
	}

	public void setPrice(Price price) {
		this.price = price;
	}
	
	
	
	
}
