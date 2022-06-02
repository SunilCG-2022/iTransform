package com.cg.springcore.assignment5;

import org.springframework.beans.factory.annotation.Required;
import javax.annotation.Resource;

public class Subject {

	private int id;
	private String name;
	
	@Resource(name="thisbook")
	private Book book;

	public Subject() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Subject(int id, String name, Book book) {
		super();
		this.id = id;
		this.name = name;
		this.book = book;
	}

	public int getId() {
		return id;
	}

	@Required
	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	@Required
	public void setName(String name) {
		this.name = name;
	}

	public Book getBook() {
		return book;
	}

	@Required
	public void setBook(Book book) {
		this.book = book;
	}

	@Override
	public String toString() {
		return "Subject [id=" + id + ", name=" + name + ", book=" + book + "]";
	}
}
