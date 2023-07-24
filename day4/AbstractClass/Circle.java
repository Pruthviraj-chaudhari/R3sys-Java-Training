package com.day4.AbstractClass;

public class Circle extends Shape{
	
	float radius;
	
	Circle(float radius){
		this.radius = radius;
	}
	
	void shape(){
		System.out.println("Circular Shape");
	}
	
	void calculateArea(){
		this.area = 3.14f * this.radius * this.radius;
		System.out.println("Area of Circle is " + this.area);
	}
}
