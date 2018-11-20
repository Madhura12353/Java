package com.java.practicecode;

import java.util.ArrayList;
import java.util.List;

public class TestStudent {

	public static void main(String[] args) {
		TestStudent studentInfo = new TestStudent();

		List<Student> sInfo = studentInfo.getStudentInfo();
		
		for(int i =0; i< sInfo.size(); i++) {
			System.out.println(sInfo.get(i));
		}

	}

	public List<Student> getStudentInfo() {
		List<Student> studentList = new ArrayList<Student>();

		Student studentObj1 = new Student("Madhura", 10);
		Student studentObj2 = new Student("Omkar", 11);
		Student studentObj3 = new Student("Omkark", 12);
		Student studentObj4 = new Student("Omkarku", 13);
		Student studentObj5 = new Student("Gargi", 14);
		studentList.add(studentObj1);
		studentList.add(studentObj2);
		studentList.add(studentObj3);
		studentList.add(studentObj4);
		studentList.add(studentObj5);

		
		return studentList;
	}
}
