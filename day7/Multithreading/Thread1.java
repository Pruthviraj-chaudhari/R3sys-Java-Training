package com.day7.Multithreading;

public class Thread1 extends SampleClass implements Runnable {

	// Implementing Abstract Method run() declared inside Runnable Interface
	public void run() {
		for(int i=0; i<5; i++){
			System.out.println("I'm Runnable Interface Thread");
		}
	}
	
	// We can also call extended class method using Thread1 object.

}
