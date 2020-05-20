package com.hiernate.examples;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="book")
public class Book {
	@Id
	@Column(name="book_id")
    @GeneratedValue    
	private int bookId;
	
	@Column(name="title")
	private String title;
	
	@Column(name="author")
	private String author;
	
	@Column(name="price")
	private Float price;
	
	public Book() {};
	
	public Book(int bookId, String title, String author, Float price) {
		super();
		this.bookId = bookId;
		this.title = title;
		this.author = author;
		this.price = price;
	}
	
	public int getBookId() {
		return bookId;
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public Float getPrice() {
		return price;
	}
	public void setPrice(Float price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Book [bookId=" + bookId + ", title=" + title + ", author=" + author + ", price=" + price + "]";
	}

}
