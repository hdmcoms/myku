package com.guanghuang.hdm.pojo;

public class Book {
	private int id;
	private String bname;
	private String author;
	private double price;
	
	public Book() {
	}
	
	public Book(int id, String bname, String author, double price) {
		this.id = id;
		this.bname = bname;
		this.author = author;
		this.price = price;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getBname() {
		return bname;
	}
	public void setBname(String bname) {
		this.bname = bname;
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

	@Override
	public String toString() {
		return "Book [id=" + id + ", bname=" + bname + ", author=" + author + ", price=" + price + "]";
	}
	
	

}
