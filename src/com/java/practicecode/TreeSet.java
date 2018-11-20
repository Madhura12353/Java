package com.java.practicecode;

public class TreeSet {
	
	public static void main(String[] args) {

		//Set<String> lset = (Set<String>) new LinkedHashSet();
		java.util.Set<String> lset = new java.util.TreeSet<>();
		lset.add("B");
		lset.add("B");
		lset.add("A");
		lset.add("E");
		lset.add("D");
		System.out.println(lset);
		
		
		
	}

}
