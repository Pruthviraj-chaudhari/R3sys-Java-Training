package com.day4.dynamicBinding;

public class Derived1 extends Base{
	void sum(int x, int y){
		int a, b, c;
		a = x;
		b = y;
		c = a + b;
		System.out.println("Derived Class 1 Sum Method: "+ c);
	}
}
