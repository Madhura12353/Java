package com.java.practicecode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Reverse {
	public static void main(String[] args) {

		Reverse t = new Reverse();
		List<String> list = t.getCountryNames();

		// Looping over list of countries
		for (int i = (list.size() - 1); i >= 0; i--) {

			System.out.println((i + 1) + ") " + list.get(i));

		}
	}

	/**
	 * This method returns the arraylist of countries
	 * For e.g. array list of "Maxico", "Russia", "USA", "Canada"
	 * @return
	 */
	private static List<String> getCountryNames() {

		// Creating new arraylist with contries
	//	List<String> countryList = new ArrayList<String>();

		List<String> countryList = Arrays.asList("Maxico", "Russia", "USA");
		
		

		return countryList;
	}

}
