package com.day7.Multithreading;

public class Th2 extends Thread {
	public void run(){
		for(int i=100; i<111; i++){
			
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			System.out.println(i);
		}
	}
}
