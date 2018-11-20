package com.java.practicecode;

public class ArrayAddNewCountries {

	
	public static void main(String[] args) {
		
		
		String[] countryNames = getCountryNames();


		System.out.println("Starting");
		
		for(int i = 0; i<countryNames.length; i++ ) {
			System.out.println(i+1 +")" + countryNames[i]);
			
		}
		
		System.out.println("Done");
		
		System.out.println("Adding one more country");
		
		String[] newCountryNames = {"New country"};
		
		String[] array = new String[countryNames.length + newCountryNames.length];
		System.arraycopy(countryNames, 0, array, 0, countryNames.length);
		System.arraycopy(newCountryNames, 0, array, countryNames.length, newCountryNames.length);
     
		
		for(int i = 0; i<array.length; i++ ) {
			System.out.println(i+1 +")" + array[i]);
			
		}
		
	}
/***
 * 
 * this method returns the array of countries.
 */
		private static String[] getCountryNames() {
			String [] countryNames = {"Mexico","Russia","USA","Russia","Mexico",
					                   "USA","Germany", "Mexico", "Canada","China" };
			
			return countryNames;
		}
}
