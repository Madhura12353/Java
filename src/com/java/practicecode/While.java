package com.java.practicecode;

import java.util.ArrayList;
import java.util.List;

public class While {

	public static void main(String[] args) {
		
		While  t = new While ();
			List<String> list = t.getCountryNames();
			System.out.println("Using while loop ");
			
			int i = 0 ;
			
			while(i<list.size()) {
				
						System.out.println(i+1 +")" + list.get(i));
						i++;
			}
			
		/*
			for(int i = (list.size()-1); i >= 0; i-- ) {
				
				System.out.println((i+1)+ ") " + list.get(i));
				
			}
			*/
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


