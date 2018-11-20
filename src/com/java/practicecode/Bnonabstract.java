package com.java.practicecode;

public class Bnonabstract extends Anonabstract {
	
	public static void main(String[] args) {
		
		Bnonabstract bclass = new Bnonabstract();
		bclass.method1InAclass();
		bclass.method2InAclass();
		bclass.method3InAclass();
		bclass.method4InAclass();
		bclass.method5InAclass();
		bclass.method1InBclass();
		
		
	}
	public void method1InBclass() {
		System.out.println(" method 1 Calling from class   B");		
	}

}
