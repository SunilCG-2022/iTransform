package com.cg.springcore9.assignment9;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main
{
	public static void main(String[] args) throws Exception 
	{
		ClassPathXmlApplicationContext context = new 
				            ClassPathXmlApplicationContext("bean.xml");
		Student student=(Student) context.getBean("obj", Student.class);
		
		System.out.println(student.getName());
		 
		context.close();
	}
	
}
