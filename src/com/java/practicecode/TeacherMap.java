package com.java.practicecode;

public class TeacherMap {

	public static void main(String[] args) {

		int id = 0;
		TeacherCatalouge teachcat = new TeacherCatalouge();

		System.out.println(" adding teacher");
		id = teachcat.addTeacher("madhura", 30);

		System.out.println(teachcat.getTeacher(id));
		
		teachcat.updateTeacher(id, "Omkar", 35);

		
		System.out.println(teachcat.getTeacher(id));
		teachcat.addCourse(id, "math");
		teachcat.addCourse(id, "cs");

		System.out.println(teachcat.getTeacher(id));

		teachcat.deleteCourse(id, "math");
		System.out.println(teachcat.getTeacher(id));
          
		teachcat.addEmail(id, "om@gmail.com");
		System.out.println(teachcat.getTeacher(id));
		
		id = teachcat.deleteTeacher(id);
		
		System.out.println(" adding teacher");
		id = teachcat.addTeacher("madhura", 30);

		System.out.println(teachcat.getTeacher(id));
		
	}

}
