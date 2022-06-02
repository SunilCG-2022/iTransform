package com.cg.springcore.assignment5;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new
				ClassPathXmlApplicationContext("beans.xml");
		Book book = (Book) context.getBean("thisbook");
		book.getBookName();
		book.getBookPrice();
		
	}
}
