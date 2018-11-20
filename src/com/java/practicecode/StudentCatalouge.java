package com.java.practicecode;

import java.util.List;

public class StudentCatalouge {
	java.util.Map<Integer, Student> hashMap = new java.util.HashMap<>();

	int id = 0;

	/**
	 * This method add student info into map and returns the int ID
	 */

	public int addStudent(int age, String name) {
		id++;
		Student std = new Student(name, age);
		// add student in map
		hashMap.put(id, std);
		return id;
	}

//	public int addStudent(Student studentInfo) {
//		id++;
//		// add student in map
//		hashMap.put(id, studentInfo);
//		return id;
//	}

	/**
	 * This method delete student from map and returns the int ID
	 */
	public int deleteStudent(int id) {
		hashMap.remove(id);
		return id;
	}

	/**
	 * This method get student from map and returns the object
	 */
	public Student getStudent(int id) {
		Student std = hashMap.get(id);
		return std;
	}

	/**
	 * This method update student from map and returns the newobject
	 */
	public Student updateStudent(int id, String stdName, int age) {

		Student student1 = new Student(stdName, age);
		hashMap.put(id, student1);
		return student1;
	}

	public List<String> addCourse(int id, String courseName) {

		Validator valid = new Validator();
		// System.out.println(valid.isValidCourse(courseName));
		Student std = getStudent(id);
		List<String> courseList = std.getCourse();
		if (valid.isValidCourse(courseName) == true) {
			courseList.add(courseName);
			System.out.println(courseName + " is added");
		} else
			System.out.println(courseName + " is Invalid course");

		return courseList;
	}

//public List<String> addCourse(int id, String courseName) {
//		
//		
//		Student std = getStudent(id);
//
//		List<String> courseList = std.getCourse();
//		courseList.add(courseName);
//
//		return courseList;
//	}

	public List<String> deleteCourse(int id, String courseName) {

		Student std = getStudent(id);
		List<String> courseList = std.getCourse();
		for (int i = 0; i < courseList.size(); i++) {
			if (courseName == courseList.get(i)) {
				courseList.remove(i);
			} else
				System.out.println(" course not found");
		}

		return courseList;
	}

	public Student addEmail(int id, String email) {

		Validator valid = new Validator();
		valid.isValidEmail(email);
		Student std = getStudent(id);

		if (valid.isValidEmail(email) == true) {
			std.setEmail(email);
		} else
			System.out.println(email + " is invalid e mail");
		return std;
	}

}
