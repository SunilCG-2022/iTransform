package com.cg.springcore2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		 ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
	      Question question=(Question)context.getBean("questions");

	      System.out.println(question.getQuestion());
	      System.out.println(question.getAnswer());
	      
	}

}
