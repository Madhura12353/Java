package com.java.practicecode;

import java.util.ArrayList;
import java.util.List;

public class ArrayExample {
	
	public static void main(String[] args) {
	
	
	String[] countryNames = getCountryNames();


	System.out.println("Starting");
	
	for(int i = 0; i<countryNames.length; i++ ) {
		System.out.println(i+1 +")" + countryNames[i]);
		
	}
	
	System.out.println("Done");

}

	private static String[] getCountryNames() {
		String [] countryNames = {"Mexico","Russia","USA","Russia","Mexico",
				                   "USA","Germany", "Mexico", "Canada","China" };
		return countryNames;
	}

}