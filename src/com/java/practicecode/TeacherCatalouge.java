package com.java.practicecode;

import java.util.HashMap;
import java.util.List;

public class TeacherCatalouge {
	
	/***
	 * add
	 * remove
	 * update
	 * get
	 */

	int id = 0;
	HashMap< Integer,Teacher> list = new HashMap<>();
	
	public int addTeacher (String name, int age) {
		id++;
		Teacher teach = new Teacher(name, age);
		teach.setId(id);
		list.put(id, teach);
		return id;
		
	}
	
	public Teacher getTeacher (int id) {
		
		Teacher teacher = list.get(id);
		return teacher;
		
	}
	
	public int deleteTeacher ( int id) {
		Teacher teacher = list.get(id);
		list.remove(id, teacher);
		return id;
		
	}
	
	public Teacher updateTeacher(int id, String name, int age) {
		Teacher teach = new Teacher(name, age);
		teach.setId(id);
		list.put(id, teach);
		return teach;
		
	}
	
	public List<String>addCourse(int id, String courseName){
		Teacher teach = list.get(id);
		 List<String> courseList = teach.getCourses();
		if(Validator.isValidCourse(courseName))
		{
			courseList.add(courseName);
		}
		else
			System.out.println("Invalid course");
		 
		return courseList;
		
	}
	
	public List<String> deleteCourse(int id, String courseName){
		Teacher teach = list.get(id);
		 List<String> courseList = teach.getCourses();
		 Validator validate = new Validator();
		 if(validate.isValidCourse(courseName))
			{
			 courseList.remove(courseName);
			}
		 else
				System.out.println("Invalid course");
		return courseList;
		
	}
	
public Teacher addEmail (int id, String email) {
		Teacher teacher = list.get(id);
//		if(Validator.isValidEmail(email)) {
//			teacher.setEmail(email);
//		}
//		else
//			System.out.println("Invalid email");
//		
		return teacher;
		
	}
	
	
}
