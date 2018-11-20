package com.java.practicecode;

public class Circle implements Shapes {

	
	double circlearea1 = 0;
	String circlecolor = "";
	
	public Circle() {
		super();
		this.circlearea1 = circlearea1;
		this.circlecolor = circlecolor;
	}
	
	
	public Circle(double area1, String color) {
		super();
		this.circlearea1 = area1;
		this.circlecolor = color;
	}


	public double getCirclearea1() {
		return circlearea1;
	}


	public void setCirclearea1(double circlearea1) {
		this.circlearea1 = circlearea1;
	}


	public String getCirclecolor() {
		return circlecolor;
	}


	public void setCirclecolor(String circlecolor) {
		this.circlecolor = circlecolor;
	}


	public void getArea() {
		System.out.println("Calculating area of circle");
		
		
	}

	
	public void getColor() {
		System.out.println("Red Circle");
		
	}

	@Override
	public String toString() {
		
		return (this.circlearea1  + ", "+ this.circlecolor);
	}

}
