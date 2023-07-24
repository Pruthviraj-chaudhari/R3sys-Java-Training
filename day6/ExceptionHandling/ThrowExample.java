package com.day6.ExceptionHandling;

public class ThrowExample {
	
	public void division(String x, String y) throws ArithmeticException, NumberFormatException
	{
		int a=0,b=0,c=0;
		
		try{
			a = Integer.parseInt(x);
			b = Integer.parseInt(y);
		}
		catch(NumberFormatException e){
			System.out.println("Please Enter Valid Integer Input!");
		}
		
		if(b==0){
			ArithmeticException obj = new ArithmeticException("Denominator can't be ZERO.");
			throw obj;
		}else{
			c = a/b;
			System.out.println("Division: " + c);
		}
	}
}
