package com.java.practicecode;

import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;

public class Validator {
	static List<String> courses = Arrays.asList("math", "cs");
	public static void main(String[] args) {
		
		
	}
	
	
	public static Boolean isValidCourse(String courseName) {
		//courseName.toLowerCase();
		boolean isValid = courses.contains(courseName.toLowerCase());
		return isValid;
		
	}
	
	public  boolean isValidEmail(String email) {
	    final Pattern EMAIL_REGEX = Pattern.compile("[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?", Pattern.CASE_INSENSITIVE);
	    return EMAIL_REGEX.matcher(email).matches();
	}
	
	
//	public Boolean isValidStudent(String s) {
//		if (s.isEmpty()) {
//	        return false;
//	    }
//	    if (!Character.isJavaIdentifierStart(s.charAt(0))) {
//	        return false;
//	    }
//	    for (int i = 1; i < s.length(); i++) {
//	        if (!Character.isJavaIdentifierPart(s.charAt(i))) {
//	            return false;
//	        }
//	    }
//	    return true;
//		
//	}
}
