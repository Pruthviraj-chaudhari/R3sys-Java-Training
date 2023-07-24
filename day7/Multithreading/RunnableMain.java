package com.day7.Multithreading;

public class RunnableMain {

	public static void main(String[] args) {
		
		Thread1 t1 = new Thread1(); // Or Runnable t1 = new Thread1();
//		t1.start();  Error here...
//		Start() method is only present in Thread Class.
//		Hence we cannot run using a Custom Thread which is created using Runnable Interface.
		t1.display();
		
		// We can run thread by Thread Class Object & passing runnable object as argument to copy constructor.
		Thread t2 = new Thread(t1);
		t2.start();
		
	}

}
