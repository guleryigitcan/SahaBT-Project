package com.example.book.domain;

import java.util.Objects;

import com.example.domain.Category;
import com.example.publisher.domain.Publisher;

public class Book {

	private final Isbn isbn;
	private Title title;
	private Author author;
	private Publisher publisher;
	private Edition edition;
	private PublicationYear publicationYear;
	private Price price;
	private Contents contents;
	private CoverPhoto coverPhoto;
	private Popularity popularity;
	private Reviews reviews;
	private Category category;

	public Book(Isbn isbn) {
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

	public Contents getContents() {
		return contents;
	}

	public void setContents(Contents contents) {
		this.contents = contents;
	}

	public CoverPhoto getCoverPhoto() {
		return coverPhoto;
	}

	public void setCoverPhoto(CoverPhoto coverPhoto) {
		this.coverPhoto = coverPhoto;
	}

	public Popularity getPopularity() {
		return popularity;
	}

	public void setPopularity(Popularity popularity) {
		this.popularity = popularity;
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

	public Isbn getIsbn() {
		return isbn;
	}

	@Override
	public int hashCode() {
		return Objects.hash(isbn);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		return Objects.equals(isbn, other.isbn);
	}

	public static class Builder {

		private Isbn isbn;
		private Title title;
		private Author author;
		private Publisher publisher;
		private Edition edition;
		private PublicationYear publicationYear;
		private Price price;
		private Contents contents;
		private CoverPhoto coverPhoto;
		private Popularity popularity;
		private Reviews reviews;
		private Category category;

		public Builder isbn(String value) {
			this.isbn = Isbn.of(value);
			return this;
		}

		public Builder publicationYear(int value) {
			this.publicationYear = PublicationYear.of(value);
			return this;
		}

		public Builder price(double value) {
			this.price = Price.of(value);
			return this;
		}

		public Builder popularity(double value) {
			this.price = Price.of(value);
			return this;
		}

		public Book build() {
			var book = new Book(this.isbn);
			book.setTitle(title);
			book.setAuthor(author);
			book.setPublisher(publisher);
			book.setEdition(edition);
			book.setPublicationYear(publicationYear);
			book.setPrice(price);
			book.setContents(contents);
			book.setCoverPhoto(coverPhoto);
			book.setPopularity(popularity);
			book.setReviews(reviews);
			book.setCategory(category);
			return book;
		}

	}

	@Override
	public String toString() {
		return "Book [isbn=" + isbn + ", title=" + title + ", author=" + author + ", edition=" + edition
				+ ", publicationYear=" + publicationYear + ", price=" + price + ", contents=" + contents
				+ ", coverPhoto=" + coverPhoto + ", popularity=" + popularity + ", reviews=" + reviews + "]";
	}

}
