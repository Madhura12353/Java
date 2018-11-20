package com.java.practicecode;

public class HashSet {

	public static void main(String[] args) {
		//Set<String> set1 = new HashSet();
		java.util.Set<String> set1 = new java.util.HashSet<>();
		
		//Set<String> set1 = (Set<String>) new HashSet();
		
		set1.add("London");
		set1.add("England");
		
		System.out.println("Size of set1 is "+ set1.size());
		System.out.println("set1 is "+ set1);
		set1.remove("London");
		System.out.println("set1 is "+ set1);
		set1.removeAll(set1);
		
		System.out.println("set1 is "+ set1);
		
		

	}

}
