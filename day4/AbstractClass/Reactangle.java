package com.day4.AbstractClass;

public class Reactangle extends Shape{
	
	float length, breadth;
	
	Reactangle(float l, float b){
		this.length = l;
		this.breadth = b;
	}
	
	void shape(){
		System.out.println("Reactangular Shape");
	}
	
	void calculateArea(){
		this.area = length * breadth;
		System.out.println("Area of Reactangle is " + this.area);
	}
}
