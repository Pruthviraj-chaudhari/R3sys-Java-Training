package com.day4.AbstractClass;

public class Main {

	public static void main(String[] args) {
		
		// Using Dynamic binding creating object of base class
		Shape obj = new Circle(10.0f);
		obj.shape();
		obj.calculateArea();
		
		obj = new Reactangle(4.0f, 5.0f);  // Changing reference 
		obj.shape();
		obj.calculateArea();
		
		obj = new Square(10.0f);  // Changing reference
		obj.shape();
		obj.calculateArea();	
	}
}
