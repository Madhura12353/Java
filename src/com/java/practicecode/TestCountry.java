package com.java.practicecode;

import java.util.List;

public class TestCountry {
	public static void main(String[] args) {

		CountryInfo countryinfo = new CountryInfo();
		List<String> list = countryinfo.getCountryNames();

		Universities universities = new Universities();
		List<String> universitiesList = universities.getUniversities();

//		for (int i = 0; i < list.size(); i++) {
//			System.out.println(list.get(i));
//
//		}
		
		for(String country: list) {
			System.out.println(country);
		}

	}

}
