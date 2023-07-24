package com.day7.CollectionFramework;

import java.util.*;

public class MyList {

	public static void main(String[] args) {
		
		ArrayList arr1 = new ArrayList();
		
		System.out.println(arr1.size());
		arr1.add(10);
		arr1.add(3.142);
		arr1.add("Pruthviraj");
		arr1.add(false);
		arr1.add(true);
		
		Iterator it = arr1.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
		
		ArrayList<Integer> arr2 = new ArrayList<Integer>();
		arr2.add(11);
		arr2.add(22);
		arr2.add(33);
		
		it = arr2.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
		
		
	}

}
