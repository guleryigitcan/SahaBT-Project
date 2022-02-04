package com.example.bookstore.document;

import java.util.Objects;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.example.book.domain.Author;
import com.example.book.domain.Book;
import com.example.book.domain.Content;
import com.example.book.domain.CoverPhoto;
import com.example.book.domain.Edition;
import com.example.book.domain.Isbn;
import com.example.book.domain.Popularity;
import com.example.book.domain.Price;
import com.example.book.domain.PublicationYear;
import com.example.book.domain.Reviews;
import com.example.book.domain.Title;

@Document(collection = "books")
public class BookDocument {
	@Id
	private Isbn isbn;
	private Book book;
	private Author author;
	private Content content;
	private CoverPhoto coverPhoto;
	private Edition edition;
	private Popularity popularity;
	private Price price;
	private PublicationYear publicationYear;
	private Reviews reviews;
	private Title title;

	public BookDocument() {
	}

	public Isbn getIsbn() {
		return isbn;
	}

	public void setIsbn(Isbn isbn) {
		this.isbn = isbn;
	}

	public Book getBook() {
		return book;
	}

	public void setBook(Book book) {
		this.book = book;
	}

	public Author getAuthor() {
		return author;
	}

	public void setAuthor(Author author) {
		this.author = author;
	}

	public Content getContent() {
		return content;
	}

	public void setContent(Content content) {
		this.content = content;
	}

	public CoverPhoto getCoverPhoto() {
		return coverPhoto;
	}

	public void setCoverPhoto(CoverPhoto coverPhoto) {
		this.coverPhoto = coverPhoto;
	}

	public Edition getEdition() {
		return edition;
	}

	public void setEdition(Edition edition) {
		this.edition = edition;
	}

	public Popularity getPopularity() {
		return popularity;
	}

	public void setPopularity(Popularity popularity) {
		this.popularity = popularity;
	}

	public Price getPrice() {
		return price;
	}

	public void setPrice(Price price) {
		this.price = price;
	}

	public PublicationYear getPublicationYear() {
		return publicationYear;
	}

	public void setPublicationYear(PublicationYear publicationYear) {
		this.publicationYear = publicationYear;
	}

	public Reviews getReviews() {
		return reviews;
	}

	public void setReviews(Reviews reviews) {
		this.reviews = reviews;
	}

	public Title getTitle() {
		return title;
	}

	public void setTitle(Title title) {
		this.title = title;
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
		BookDocument other = (BookDocument) obj;
		return Objects.equals(isbn, other.isbn);
	}

	@Override
	public String toString() {
		return "BookDocument [isbn=" + isbn + ", book=" + book + ", author=" + author + ", content=" + content
				+ ", coverPhoto=" + coverPhoto + ", edition=" + edition + ", popularity=" + popularity + ", price="
				+ price + ", publicationYear=" + publicationYear + ", reviews=" + reviews + ", title=" + title + "]";
	}

}