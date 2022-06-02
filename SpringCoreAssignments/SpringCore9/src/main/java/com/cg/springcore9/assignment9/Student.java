package com.cg.springcore9.assignment9;

public class Student {

	private String id;
	private String name;
	
	Student(){
		System.out.println("Cunstructor of student bean is invoked!");
	}

	public Student(String id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}
	
	//Bean initialization
	 public void init() throws Exception {
	        System.out.println("Initializing method of student bean is invoked!");
	    }
	 
	//Bean destruction code
	    public void destroy() throws Exception {
	        System.out.println("Destroy method of student bean is invoked!");
	    }
}
