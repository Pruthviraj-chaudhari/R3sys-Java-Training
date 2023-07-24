package com.day6.ExceptionHandling;

public class UncheckedExceptions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

//		try{
//			int a = 5/0;
//			System.out.println(a);
//		}
//		catch(ArithmeticException obj){
//			System.err.println("ArithmeticException Handled.");
//		}
//					
//		try{
//			String name = null;
//			System.out.println(name.length());
//		}
//		catch(NullPointerException obj1){
//			System.err.println("NullPointerException Handled.");
//		}
//			
//			
//		try{
//			int[] arr = {4, 5, 7};
//			System.out.println(arr[5]);
//		}
//		catch(ArrayIndexOutOfBoundsException obj2){
//			System.err.println("ArrayIndexOutOfBoundsException Handled.");
//		}	
//		finally{
//			System.out.println("I will always execute.");
//		}	
		
		try {
			
//            Division by zero
//            int result = 10 / 0;

//            Accessing a null reference
//            String str = null;
//            System.out.println(str.length());

            // Accessing an array out of bounds
            int[] numbers = {1, 2, 3};
            System.out.println(numbers[5]);
  
            
		} 
		catch (ArithmeticException e) {
			System.out.println("ArithmeticException: " + e.getMessage());
		} 
		catch (NullPointerException e) {
			System.out.println("NullPointerException: " + e.getMessage());
		} 
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Array size is 3 and You are accesing 5th Index");
			e.printStackTrace();
		}
			
		
		
		
	}

}
