package com.example.bookstore.dto.response;

import com.example.book.domain.Author;
import com.example.book.domain.Content;
import com.example.book.domain.CoverPhoto;
import com.example.book.domain.Edition;
import com.example.book.domain.Isbn;
import com.example.book.domain.Popularity;
import com.example.book.domain.Price;
import com.example.book.domain.PublicationYear;
import com.example.book.domain.Reviews;
import com.example.book.domain.Title;
import com.example.category.domain.Category;
import com.example.publisher.domain.Publisher;

public class AddBookResponse {

	private Isbn isbn;
	private Title title;
	private Author author;
	private Publisher publisher;
	private Edition edition;
	private PublicationYear publicationYear;
	private Price price;
	private Content content;
	private Popularity popularity;
	private CoverPhoto coverPhoto;
	private Reviews reviews;
	private Category category;

	public AddBookResponse() {
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

	public Content getContent() {
		return content;
	}

	public void setContent(Content content) {
		this.content = content;
	}

	public Popularity getPopularity() {
		return popularity;
	}

	public void setPopularity(Popularity popularity) {
		this.popularity = popularity;
	}

	public CoverPhoto getCoverPhoto() {
		return coverPhoto;
	}

	public void setCoverPhoto(CoverPhoto coverPhoto) {
		this.coverPhoto = coverPhoto;
	}

	public Reviews getReviews() {
		return reviews;
	}

	public void setReviews(Reviews reviews) {
		this.reviews = reviews;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	@Override
	public String toString() {
		return "AddBookResponse [isbn=" + isbn + ", title=" + title + ", author=" + author + ", publisher=" + publisher
				+ ", edition=" + edition + ", publicationYear=" + publicationYear + ", price=" + price + ", content="
				+ content + ", popularity=" + popularity + ", coverPhoto=" + coverPhoto + ", reviews=" + reviews
				+ ", category=" + category + "]";
	}
}
