package com.day7.Multithreading;

public class Th1 extends Thread{
	public void run(){
		for(int i=0; i<10; i++){
			
			try {
				Thread.sleep(1800);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			System.out.println(i);
		}
	}
}
