package com.java.practicecode;

public class CNormalclass extends BabstractClass{
	public static void main(String[] args) {
		CNormalclass c_class = new CNormalclass();
		c_class.method1();
		c_class.method2();
		
		
		
	}

	@Override
	public void method2() {
		System.out.println("Implementing the method in abstract method");
		
	}

	

}
