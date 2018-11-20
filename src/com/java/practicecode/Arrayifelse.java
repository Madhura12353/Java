package com.java.practicecode;

import java.util.ArrayList;
import java.util.List;

public class Arrayifelse {
	
public static void main(String[] args) {
		
	Arrayifelse  t = new Arrayifelse ();
		List<String> countries = t.getCountryNames();
		int wordCount;
		
		System.out.println("Printing the words which contains less than 4 characters");
		for(int i = 0; i<countries.size(); i++ ) {
			
			wordCount =	countries.get(i).length() ;
			if (wordCount<= 4) {
			System.out.println(i+1 +")  " + " Character count: "+countries.get(i)+ countries.get(i).length());
			}
		}

}
	
	private static List <String> getCountryNames() {
		List<String> list = new ArrayList<String>();
		
		list.add("Maxico");
		list.add("Russia");
		list.add("USA");
		list.add("Canada");
		list.add("India");
		list.add("Germeny");
		list.add("China");
		list.add("Austrelia");
		list.add("UAE");
		list.add("Africa");
		
		return list;
	}
}


