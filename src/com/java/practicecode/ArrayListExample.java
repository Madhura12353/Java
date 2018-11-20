package com.java.practicecode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;



public class ArrayListExample {

	
	public static void main(String[] args) {
		
//		ArrayListExample  t = new ArrayListExample ();
//		List<String> countries = t.getCountryNames();
		
		List<String> countries = getCountryNames();
		
		for(int i = 0; i<countries.size(); i++ ) {
			System.out.println(i+1 +")" + countries.get(i));
			
		}
}
	
	private static List <String> getCountryNames() {
//		List<String> list = new ArrayList<String>();
//		
//		list.add("Maxico");
//		list.add("Russia");
//		list.add("USA");
//		list.add("Canada");
//		list.add("India");
//		list.add("Germeny");
//		list.add("China");
//		list.add("Austrelia");
//		list.add("UAE");
//		list.add("Africa");
//		
		
		List<String> countryList = Arrays.asList("Maxico", "Russia", "USA","India","Canada");
		return countryList;
	}
}
