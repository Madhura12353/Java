package com.java.practicecode;

import java.util.ArrayList;
import java.util.List;

public class MapsStudent {

	public static void main(String[] args) {

		int id = 0;
		// create the object
		StudentCatalouge studentcatl = new StudentCatalouge();

		//List<String> list1 = new ArrayList<String>();
		// Create the object of Student

		//add student
		id = studentcatl.addStudent( 40,"Madhura Kulkarni");
		Student s = studentcatl.getStudent(id);
		
		
		//add course
		studentcatl.addCourse(1, "cs");
		studentcatl.addCourse(1, "Math");
		studentcatl.addCourse(1, "Micro");
		System.out.println("Student Info: " + s
		 + " Id: " + 1);

		//delete course
		studentcatl.deleteCourse(1, "cs");
		System.out.println("cs is deleted from course list    " + s
		);
		
		// add email
		studentcatl.addEmail(1, "m@gmail.com");
		System.out.println("Student Info: " + s
		 + " Id: " + id);
		
		// Add another student
		Student student2 = new Student("omkar Kulkarni", 30);

		id = studentcatl.addStudent(30,"omkar Kulkarni");
		
		// add email
				studentcatl.addEmail(2, "omkar");
				System.out.println("Student Info: " + student2 + " Id: " + id);

		System.out.println("Student Info: " + student2 + " Id: " + id);

		// Get student
		System.out.println("Calling get student");
		Student std = studentcatl.getStudent(1);
		System.out.println(std);

		// Delete student
		id = studentcatl.deleteStudent(1);
		System.out.println("Student Info: " + s
		 + " Id: " + id);
		System.out.println("Id : " + id + " This student removed from the system");
		Student std1 = studentcatl.getStudent(1);
		System.out.println(std1);

		// Update student
		Student updatestd = studentcatl.updateStudent(2, "Omkar kulkarni", 34);
		System.out.println(updatestd);

	}

}
