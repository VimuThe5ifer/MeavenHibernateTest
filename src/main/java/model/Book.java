package model;

import jakarta.persistence.*;

@Entity
@Table(name="book")
public class Book {

	@Id
	@Column(name="id", columnDefinition="integer auto_increment")
	private int id;
	
	@Column(name="title")
	private String title;
	
	@Column(name="author")
	private String author;
	
	@Column(name="price")
	private double price;
	
	public Book() {}
	
	public Book(String title, String author, double price) {
		this.author=author;
		this.title=title;
		this.price=price;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	public String toString() {
		return "Book id: " + id +"  Title: " + title + "  Author: " + author +"  Price: "+ price;
	}
}
