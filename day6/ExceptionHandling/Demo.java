package com.day6.ExceptionHandling;

public class Demo {
	void printArray() throws ClassNotFoundException
	{
		int[] arr = {4, 5 ,7};
		System.err.println(arr[5]);
	}
}
