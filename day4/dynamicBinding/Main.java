package com.day4.dynamicBinding;

public class Main {

	public static void main(String[] args) {
		
		Base obj = new Base();
		obj.sum(10, 20);
		
		obj = new Derived1();  // Reference changes from base to derived1
		obj.sum(30, 40);
		
		obj = new Derived2();  // Reference changed from derived1 to derived2
		obj.sum(50, 60);
		
	}

}
