package com.day4.AbstractClass;

public class Square extends Shape{
	
	float side;
	
	Square(float s){
		side = s;
	}
	
	void shape(){
		System.out.println("Square Shape");
	}
	
	void calculateArea(){
		this.area = side*side;
		System.out.println("Area of Square is " + this.area);
	}
}
