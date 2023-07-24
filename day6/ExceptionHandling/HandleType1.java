package com.day6.ExceptionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class HandleType1 {

	public void division(){
		
		Scanner sc = new Scanner(System.in);
		try{
			
			float a,b,c;
			System.out.print("Enter First Number: ");
			a = sc.nextFloat();
			System.out.print("Enter Second Number: ");
			b = sc.nextFloat();
			c = a/b;
			System.out.println("Answer = "+ c);
			
		}
		catch(InputMismatchException obj)
		{
			System.err.println("Please Enter Valid Integer! Try Again.");
		}
		finally{
			System.out.println("I am always first.");
			sc.close();
		}
		
	}
	
	public static void main(String[] args) {
		
		HandleType1 obj = new HandleType1();
		obj.division();

	}

}
