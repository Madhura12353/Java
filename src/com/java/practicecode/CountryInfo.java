package com.java.practicecode;

import java.util.Arrays;
import java.util.List;

public class CountryInfo {
	
	
	
	/**
	 * Default constructor
	 */
	public CountryInfo() {
		
	}
	
	
	/**
	 * This method will return the array list of countries e.g maxico, russia
	 * @return
	 */
	public List <String> getCountryNames() {
		List<String> countryList = Arrays.asList("Maxico", "Russia", "USA","India","Canada");
		return countryList;
	}

}
