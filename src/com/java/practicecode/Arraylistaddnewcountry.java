package com.java.practicecode;

import java.util.ArrayList;
import java.util.List;

public class Arraylistaddnewcountry {

	public static void main(String[] args) {

		Arraylistaddnewcountry t = new Arraylistaddnewcountry();
		List<String> countries = t.getCountryNames();

		for (int i = 0; i < countries.size(); i++) {
			System.out.println(i + 1 + ")" + countries.get(i));

		}

		System.out.println("Done");

		System.out.println("Adding one more country");
		countries.add("NewCountry");
		System.out.println("new country: " + countries.get(countries.size() - 1));
	}

	private static List<String> getCountryNames() {
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
