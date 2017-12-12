package com.basaki.example.docker.model;

import lombok.Data;

/**
 * {@code BookRequest} represents a request to create or update a book entity.
 * <p/>
 *
 * @author Indra Basak
 * @since 3/13/17
 */
@Data
public class BookRequest {

    private String title;
    private Genre genre;
    private String publisher;
    private int star;
    private Author author;
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Genre getGenre() {
		return genre;
	}
	public void setGenre(Genre genre) {
		this.genre = genre;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	public int getStar() {
		return star;
	}
	public void setStar(int star) {
		this.star = star;
	}
	public Author getAuthor() {
		return author;
	}
	public void setAuthor(Author author) {
		this.author = author;
	}
    
    
}
