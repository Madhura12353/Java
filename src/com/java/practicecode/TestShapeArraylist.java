package com.java.practicecode;

import java.awt.Shape;
import java.util.ArrayList;
import java.util.List;

public class TestShapeArraylist {

	public static void main(String[] args) {
		
		
		TestShapeArraylist shape = new TestShapeArraylist();
		List<Shapes> shapeInformation =  shape.getShapeInfo();
		
		for(int i =0; i< shapeInformation.size(); i++) {
			System.out.println(shapeInformation.get(i));
		}

	}

	private List<Shapes> getShapeInfo() {
		List<Shapes> shapeList = new ArrayList<Shapes>();


		Circle circle1 = new Circle();
		circle1.setCirclecolor("Red circle");
		circle1.setCirclearea1(25);
		
		Rectangle rectangle1 = new Rectangle(30, "Red rectangle");
		
		Square square1 = new Square(40, "Red Square");
		
		shapeList.add(circle1);
		shapeList.add(rectangle1);
		shapeList.add(square1);
		
		return shapeList;
		
	}
	
	

}
