package com.java.practicecode;

public class Map {
	public static void main(String[] args) {
		
		System.out.println("Creating hash map");
		//creating hash map
		java.util.Map<String, Integer> hashMap = new java.util.HashMap<>();	
		 hashMap.put("C", 10);
		 hashMap.put("B", 11);
		 hashMap.put("Z", 12);
		 hashMap.put("D", 13);
		 
	 
		 
		 // create tree map
		 System.out.println("Creating Tree map");
		 java.util.Map<String, Integer> treeMap = new java.util.TreeMap<>(hashMap);	
		 
		 treeMap.put("C", 10);
		 treeMap.put("Z", 11);
		 treeMap.put("A", 12);
		 treeMap.put("D", 13);
		 System.out.println(treeMap);

		// create Linked map
				 System.out.println("Creating Linked map");
				 java.util.Map<String, Integer> linkedMap = new java.util.LinkedHashMap<>(hashMap);	
				 
				 linkedMap.put("C", 10);
				 linkedMap.put("Z", 11);
				 linkedMap.put("A", 12);
				 linkedMap.put("D", 13);
				 System.out.println(linkedMap);
}
}
