package com.java.practicecode;

import java.util.ArrayList;
import java.util.List;

public class DoWhile {
	public static void main(String[] args) {

		DoWhile t = new DoWhile();
		List<String> list = t.getCountryNames();

		System.out.println("Using do while loop");
		int i = 0;
		do {
			System.out.println(i + 1 + ")" + list.get(i));
			i++;

		} while (i < list.size());

	}

	private static List<String> getCountryNames() {
		List<String> list = new ArrayList<>();

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
