package com.java.practicecode;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

public class EmailRegex {
	public static void main(String[] args) {
		
		
		
	
		
		// Get the list of all Strings
		EmailRegex email = new EmailRegex();
		List<String> emailList = email.getArrayList();
		
		// Iterate over all Strings, one at a time
		for(int i = 0; i< emailList.size();i++ ) {
			System.out.println(emailList.get(i));
			boolean result = email.isValid(emailList.get(i));
			
			if (result == true)
				System.out.println(emailList.get(i)+ " is valid e mail");
			else
				System.out.println(emailList.get(i)+ " is invalid e mail");
				
		}
		// Execute 'isValid' method by passing each string
		 
		
		
		// Print the result whether the String is valid email or not
	}
	
	public  boolean isValid(String email) {
	    final Pattern EMAIL_REGEX = Pattern.compile("[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?", Pattern.CASE_INSENSITIVE);
	    return EMAIL_REGEX.matcher(email).matches();
	}
	

	private List<String> getArrayList() {
		 List<String> emailList = new ArrayList<String>();
		 emailList.add("madhura");
		 emailList.add("madhura@");
		 emailList.add("madhura@gmail");
		 emailList.add("madhura@gmail.com");
		 emailList.add("madhura@gmail.com");
		 emailList.add("madhura@gmail.com");
		 
		return emailList;
	}
	
	
}
