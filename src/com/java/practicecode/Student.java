package com.java.practicecode;

import java.util.ArrayList;
import java.util.List;

public class Student {
	private String name;
	private int id;
	private List<String> course;
	private String email;

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public List<String> getCourse() {
		return course;
	}

	public void setCourse(List<String> course) {
		this.course = course;
	}

	public Student(String name, int id) {
		// super();
		this.name = name;
		this.id = id;
		this.course = new ArrayList<String>();
		this.email = getEmail();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {

		return (this.name + ", " + this.id + " " + this.getCourse() + " " + this.email);
	}

}
