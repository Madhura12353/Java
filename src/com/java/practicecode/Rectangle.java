package com.java.practicecode;

public class Rectangle  implements Shapes{

	double rectanglearea1 = 0;
	String rectanglecolor = "";
	
	
	public Rectangle(double rectanglearea1, String rectanglecolor) {
		super();
		this.rectanglearea1 = rectanglearea1;
		this.rectanglecolor = rectanglecolor;
	}


	public void getArea() {
		System.out.println("Calculating area of rectangle");
		
		
	}

	
	public void getColor() {
		System.out.println("Displaying color of rectangle");
		
	}
	
	
	@Override
	public String toString() {
		
		return (this.rectanglearea1  + ", "+ this.rectanglecolor);
	}
}
