package com.day4.dynamicBinding;

public class Derived2 extends Base{
	void sum(int x, int y){
		int a, b, c;
		a = x;
		b = y;
		c = a + b;
		System.out.println("Derived Class 2 Sum Method: "+ c);
	}
}
