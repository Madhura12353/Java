package com.java.practicecode;

import java.util.ArrayList;
import java.util.List;

public class Teacher {
	
	private String name;
	private String email;
	private int age;
	private int id;
	private List<String> courses;
	
	
	
	public Teacher(String name, int age) {
		super();
		this.name = name;
		this.age = age;
		this.courses = new ArrayList<>();
		this.email= getEmail();
		this.id = getId();
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getId() {
		return id;
	}
	
	
	public void setId(int id) {
		this.id = id;
	}
	public List<String> getCourses() {
		return courses;
	}
	public void setCourses(List<String> courses) {
		this.courses = courses;
	}
	
	
	
	
	
	@Override
	public String toString() {
		return "Teacher [name=" + name + ", email=" + email + ", age=" + age + ", id=" + id + ", courses=" + courses
				+ "]";
	}

}
