package com.day7.Multithreading;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Th1 t1 = new Th1(); 
		t1.start();  // Automatically calls Run() with additional features
		
		Th2 t2 = new Th2();
		t2.start();
		
		System.out.println("I am from Main Class");
	}

}
