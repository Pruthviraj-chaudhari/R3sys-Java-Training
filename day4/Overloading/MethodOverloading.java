package com.day4.Overloading;

public class MethodOverloading {

	public static void main(String[] args) {
		
		Sum obj = new Sum();
		obj.sum(10, 20);
		obj.sum(5.5f, 2.2f);
		obj.sum(10, 2.5f);
		obj.sum(2.5f, 10);
		
	}

}
