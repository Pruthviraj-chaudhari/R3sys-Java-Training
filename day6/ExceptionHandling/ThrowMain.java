package com.day6.ExceptionHandling;

import java.util.Scanner;

public class ThrowMain {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter First Number: ");
		String a = sc.next();
		System.out.print("Enter Second Number: ");
		String b = sc.next();
		
		ThrowExample obj = new ThrowExample();
		obj.division(a, b);

	}

}
