package com.day6.ExceptionHandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Throws {

	
	static void division() throws InputMismatchException
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Integer: ");
		int a = sc.nextInt();
	}
	
	static class MultipleExceptionThrowing {
	    public static void main(String[] args) throws IOException, InterruptedException {
	        // Example of a single line that can throw multiple exceptions
	        Thread.sleep(1000);
	        BufferedReader reader = new BufferedReader(new FileReader("example.txt"));
	    }
	}

	
	
	public static void main(String[] args) {
		
		try{
			division();
		}catch(InputMismatchException obj){
			System.err.println("Please Enter Valid Integer");
		}
	}

}
