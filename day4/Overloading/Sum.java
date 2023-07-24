package com.day4.Overloading;

public class Sum {
	int a,b;
	float p,q;
	
	void sum(int x, int y){
		a = x;
		b = y;
		System.out.println("Integer Sum: "+ (a+b));
	}
	
	void sum(float x, float y){
		p = x;
		q = y;
		System.out.println("Float Sum: "+ (p+q));
	}
	
	void sum(int x, float y){
		a = x;
		p = y;
		System.out.println("Int-Float Sum: " + (a+p));
	}
	
	void sum(float x, int y){
		p = x;
		a = y;
		System.out.println("Float-Int Sum: " + (a+p));
	}
}
