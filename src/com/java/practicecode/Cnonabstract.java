package com.java.practicecode;

public class Cnonabstract extends Bnonabstract {
public static void main(String[] args) {
		
		Cnonabstract cclass = new Cnonabstract();
		cclass.method1InAclass();
		cclass.method2InAclass();
		cclass.method3InAclass();
		cclass.method4InAclass();
		cclass.method5InAclass();
		cclass.method1InBclass();
		
	}
public void method1Incclass() {
	System.out.println(" method 1 Calling from class   c");		
}
}
