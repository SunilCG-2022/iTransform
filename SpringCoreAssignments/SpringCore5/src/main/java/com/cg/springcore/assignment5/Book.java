package com.cg.springcore.assignment5;

import org.springframework.beans.factory.annotation.Required;

public class Book {

	private String bookName;
	private int bookPrice;
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Book(String bookName, int bookPrice) {
		super();
		this.bookName = bookName;
		this.bookPrice = bookPrice;
	}
	public String getBookName() {
		return bookName;
	}
	
	@Required
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public int getBookPrice() {
		return bookPrice;
	}
	
	@Required
	public void setBookPrice(int bookPrice) {
		this.bookPrice = bookPrice;
	}
	@Override
	public String toString() {
		return "Book [bookName=" + bookName + ", bookPrice=" + bookPrice + "]";
	}
	
	
}
