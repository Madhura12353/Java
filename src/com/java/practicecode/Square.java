package com.java.practicecode;

public class Square implements Shapes {

	double squarearea1 = 0;
	String squarecolor = "";
	
	@Override
	public void getArea() {
		// TODO Auto-generated method stub
		
	}

	public Square(double squarearea1, String squarecolor) {
		super();
		this.squarearea1 = squarearea1;
		this.squarecolor = squarecolor;
	}

	@Override
	public void getColor() {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public String toString() {
		
		return (this.squarearea1  + ", "+ this.squarecolor);
	}

}
